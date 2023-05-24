package com.flansmod.common.network;

import java.util.LinkedList;

import com.flansmod.common.FlansMod;
import com.flansmod.common.OperationQueue.Operation;
import com.flansmod.common.guns.AttachableSlot;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.AttachmentType.AttachmentTag;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.GunType.GunTag;
import com.flansmod.common.guns.InventoryHelper;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ModifiableType;
import com.flansmod.common.guns.ModifiableType.AttachmentPos;
import com.flansmod.common.guns.ModifiableType.ItsType;
import com.flansmod.common.guns.ModifiableType.ModifiableTag;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ChatComponentText;

public class PacketGunAttachment extends PacketBase 
{
	//TODO: init on join in game
	private static byte atAt[], atInSlot, attachOffset;
	private static int atAtLen;
	private static short transStep;
	
	private static boolean barrelRemoved, boltRemoved;
	
	public static void init(int len) { atAt = new byte[len + 1]; }
	
	public PacketGunAttachment() { }
	
	public PacketGunAttachment(byte o)
	{
		atAtLen = 0;
		atInSlot = o;
	}
	
	/** aal will be flipped automatically, no need to input negative value */
	public PacketGunAttachment(byte[] aa, int aal, byte o)
	{
		for(atAtLen = -aal; --aal >= 0; ) atAt[aal] = aa[aal];
		atInSlot = o;
	}
	
	/** for switch paintjob */
	public PacketGunAttachment(byte[] aa, int aal, byte o, short p)
	{
		for(atAtLen = -aal; --aal >= 0; ) atAt[aal] = aa[aal];
		atInSlot = o;
		transStep = p;
	}
	
	public PacketGunAttachment(byte[] aa, int aal, byte ais, byte ao, short ts)
	{
		for(atAtLen = aal; --aal >= 0; ) atAt[aal] = aa[aal];
		atInSlot = ais;
		attachOffset = ao;
		transStep = ts;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeInt(atAtLen);
		data.writeByte(atInSlot);
		if(atAtLen == 0) return;
		for(int i = Math.abs(atAtLen); --i >= 0; ) data.writeByte(atAt[i]);
		if(atAtLen < 0)
		{
			if(atInSlot == Operation.PAINTJOB || atInSlot == Operation.EX_PAINTJOB) data.writeShort(transStep);
			return;
		}
		data.writeByte(attachOffset);
		data.writeShort(transStep);
	}
	
	private static final int INVALID_PACKET = -1 << 31;
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		atAtLen = data.readInt();
		atInSlot = data.readByte();
		if(atAtLen == 0) return;
		int i = Math.abs(atAtLen);
		if(i >= FlansMod.maxLayers * 2)
		{
			atAtLen = INVALID_PACKET;
			return;
		}
		while(--i >= 0) atAt[i] = data.readByte();
		if(atAtLen < 0)
		{
			if(atInSlot == Operation.PAINTJOB || atInSlot == Operation.EX_PAINTJOB) transStep = data.readShort();
			return;
		}
		attachOffset = data.readByte();
		transStep = data.readShort();
	}
	
	/** this method is used to remove all the attachments that are added to another attachment and get it back to player */
	private static void returnLayerStacks(NBTTagCompound atTag, EntityPlayer player)
	{
		NBTTagList prList = ModifiableType.getPRList(atTag), prTag;
		for(int i = prList.tagCount(), j; --i >= 0; prList.removeTag(i))
		{
			for(j = (prTag = GunType.getTagListFromTagList(prList, i)).tagCount(); --j >= 0; )
			{
				returnLayerStacks(prTag.getCompoundTagAt(j), player);
				prTag.removeTag(j);
			}
		}
		AttachmentType thisType = AttachmentType.getAtType(atTag);
		if(thisType.itsType == ItsType.BARREL) barrelRemoved = true;
		else if(thisType.itsType == ItsType.BOLT) boltRemoved = true;
		if(thisType.getHideInCreativeTab())
			for(AttachmentType shadowType = AttachmentType.getAttachment(thisType.shadowType); 
					shadowType != thisType; shadowType = AttachmentType.getAttachment(shadowType.shadowType))
				if(!shadowType.getHideInCreativeTab())
				{
					thisType = shadowType;
					break;
				}
		ItemStack toGive = new ItemStack(thisType.item, 1, AttachmentType.getAtDam(atTag));
		if(!InventoryHelper.addItemStackToPlayerInventory(player.inventory, toGive)) player.entityDropItem(toGive, 0.5F);
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		ItemStack itemStack = playerEntity.inventory.getCurrentItem();
		if(itemStack == null || !(itemStack.getItem() instanceof ItemGun))
		{
			//TODO: log player name
			return;
		}
		if(!GunType.hasStates(itemStack))
		{
			//TODO:
			GunType.checkForTags(itemStack);
			return;
		}
		if(atAtLen == 0) //operating the attachments on gun
		{
			if(atInSlot == Operation.LAST_AIM_CENTER)
			{
				int[] gunStates = GunType.getStates(itemStack);
				if(GunType.getAimCenterOnUse(gunStates) > 0) GunType.setAimCenterOnUes(gunStates, (byte)(GunType.getAimCenterOnUse(gunStates) - 1));
				else
				{
					NBTTagList sightList = GunType.getSightList(itemStack);
					if(sightList.tagCount() < 1)
					{
						// TODO:
					}
					else GunType.setAimCenterOnUes(gunStates, (byte)(sightList.tagCount() - 1));
				}
			}
			else if(atInSlot == Operation.NEXT_AIM_CENTER)
			{
				int gunStates[] = GunType.getStates(itemStack), nextAimCenter = GunType.getAimCenterOnUse(gunStates) + 1;
				GunType.setAimCenterOnUes(gunStates, (byte)(nextAimCenter < GunType.getSightList(itemStack).tagCount() ? nextAimCenter : 0));
			}
			else
			{
				LinkedList<byte[]> atsAt;
				NBTTagCompound atTag;
				AttachmentType atType;
				if(atInSlot == Operation.SWITCH_LASER) //switch laser
				{
					if((atsAt = AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], ItsType.NONE, ItsType.LASER)).size() == 0)
					{
						//TODO:
						FlansMod.log(playerEntity.getDisplayName() + " Has Requested to Switch Laser with No Laser Installed on Gun");
						return;
					}
					transStep = 0;
					for(byte[] laserAt : atsAt)
					{
						atTag = GunType.getAtTagAt(itemStack.stackTagCompound, laserAt, laserAt.length);
						if(transStep == 1) AttachmentType.setTOFOn(AttachmentType.getStates(atTag), AttachmentTag.LASER_ON); //remind us to turn on them all
						else if(transStep == -1) AttachmentType.setTOFOff(AttachmentType.getStates(atTag), AttachmentTag.LASER_OFF); //turn off them all
						else // no mark yet
						{
							int[] atStates = AttachmentType.getStates(atTag);
							if(AttachmentType.getTOF(atStates, AttachmentTag.LASER_ON))
							{
								AttachmentType.setTOFOff(atStates, AttachmentTag.LASER_OFF);
								GunType.setTOFOff(GunType.getStates(itemStack), GunTag.LASER_OFF);
								transStep = -1;
								continue;
							}
							AttachmentType.setTOFOn(atStates, AttachmentTag.LASER_ON);
							GunType.setTOFOn(GunType.getStates(itemStack), GunTag.LASER_ON);
							transStep = 1;
						}
					}
				}
				else if(atInSlot == Operation.SWITCH_LIGHT) //switch light
				{
					if((atsAt = AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], ItsType.NONE, ItsType.LIGHT)).size() == 0)
					{
						//TODO:
						FlansMod.log(playerEntity.getDisplayName() + " Has Requested to Switch Light with No Light Installed on Gun");
						return;
					}
					transStep = 0;
					int[] gunStates = GunType.getStates(itemStack);
					for(byte[] lightAt : atsAt)
					{
						atTag = GunType.getAtTagAt(itemStack.stackTagCompound, lightAt, lightAt.length);
						if(transStep == 1)
						{
							AttachmentType.setTOFOn(AttachmentType.getStates(atTag), AttachmentTag.LIGHT_ON);
							if((atType = AttachmentType.getAtType(atTag)).flashlightRange > GunType.getState(gunStates, GunTag.LIGHT_RANGE))
								GunType.setState(gunStates, GunTag.LIGHT_RANGE, atType.flashlightRange);
						}
						else if(transStep == -1) AttachmentType.setTOFOff(AttachmentType.getStates(atTag), AttachmentTag.LIGHT_OFF);
						else
						{
							int[] atStates = AttachmentType.getStates(atTag);
							if(AttachmentType.getTOF(atStates, AttachmentTag.LIGHT_ON))
							{
								AttachmentType.setTOFOff(atStates, AttachmentTag.LIGHT_OFF);
								GunType.setState(gunStates, GunTag.LIGHT_RANGE, -1F);
								transStep = -1;
								continue;
							}
							AttachmentType.setTOFOn(atStates, AttachmentTag.LIGHT_ON);
							GunType.setState(gunStates, GunTag.LIGHT_RANGE, AttachmentType.getAtType(atTag).flashlightRange);
							transStep = 1;
						}
					}
				}
				else if(atInSlot == Operation.SWITCH_CO_SIGHT)
				{
					int[] gunStates = GunType.getStates(itemStack);
					NBTTagList sightList = GunType.getSightList(itemStack);
					if((atsAt = GunType.getOnUseSightsAt(gunStates, sightList)).size() == 0)
					{
						//TODO:
						return;
					}
					transStep = 0;
					byte[] refSightAt = null, atAt;
					AttachmentPos atPos = new AttachmentPos();
					AttachmentType shadowType;
					int[] atStates = null;
					GunType gunType = ((ItemGun)itemStack.getItem()).type;
					boolean shouldUpdateStates = false;
					for(int i = atsAt.size(); --i >= 0; )
					{
						if(!(atType = AttachmentType.getAtType( // If not a co-sight, update ref and continue
								atTag = GunType.getAtTagAt(itemStack.stackTagCompound, (atAt = atsAt.get(i)), atAt.length & -2))).isCoSight())
						{
							if(refSightAt == null) refSightAt = atAt;
							continue;
						}
						if((shadowType = AttachmentType.getAttachment(atType.shadowType)).bigHitBox != null)
						{
							AttachmentType.setTOFOn(atStates = AttachmentType.getStates(GunType.getPosOfAttachableAt(atPos.resetAtTag(
									itemStack.stackTagCompound, gunType), atAt, atAt.length).atTag), AttachmentTag.AVOID_CHECK_ON);
							if(!gunType.checkAtConflicts(shadowType.bigHitBox.get3DHitBoxes(atPos.updateTriValues()), shadowType.hitBox.get3DHitBoxes(atPos), 
									itemStack.stackTagCompound, 0, 0F, 0F, 0F, 0F)) atTag = null;
							AttachmentType.setTOFOff(atStates, AttachmentTag.AVOID_CHECK_OFF);
						}
						else
						{
							atStates = AttachmentType.getStates(atTag);
							atTag = null;
						}
						if(atTag == null)
						{
							shadowType.setTagAtType(atStates);
							if(atType.getUpdateGunStates()) shouldUpdateStates = true;
							++transStep; //value of translate equals how many coSights we have enabled
						}
						else if(refSightAt == null) refSightAt = atAt;
					}
					if(transStep > 0)
					{
						gunType.setSightsAtForGun(itemStack);
						if(refSightAt != null)
						{
							NBTTagList sightsAt;
							byte i, j, k, thisAt[];
							for(i = (byte)(sightList = GunType.getSightList(itemStack)).tagCount(); --i >= 0; )
								for(j = (byte)(sightsAt = GunType.getTagListFromTagList(sightList, i)).tagCount(); --j >= 0; )
									if((thisAt = GunType.getByteArrayFromTagList(sightsAt, j)).length == refSightAt.length)
										for(k = (byte)(thisAt.length & (-1 << 1)); ; )
										{
											if(--k < 0) //hit! this is the sight we are referring to
											{
												GunType.setAimCenterOnUes(gunStates, i);
												if(shouldUpdateStates) gunType.setGunStates(itemStack);
												return;
											}
											if(thisAt[k] != refSightAt[k]) break;
										}
						}
						if(shouldUpdateStates) gunType.setGunStates(itemStack);
						return;
					} //not hit for enabling a co-sight, find if there is a enabled to be disable
					atsAt.clear();
					if((atsAt = AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], ItsType.NONE, ItsType.CO_SIGHT_FLIPPED, atsAt)).size() > 0)
					{
						AttachmentPos onUsePos = GunType.getAimCenterOfSightAt(new AttachmentPos(itemStack.stackTagCompound, gunType), refSightAt);
						for(byte[] sightAt : atsAt) // Make sure that the aimcenter is that are on using
							if((atType = (AttachmentType)GunType.getPosOfAttachableAt(atPos.resetAtTag(itemStack.stackTagCompound, gunType), 
									sightAt, sightAt.length & -2).atType).aimCenterY * atPos.updateTriValues().cos - atType.aimCenterZ * atPos.sin + atPos.y == onUsePos.y 
									&& atPos.z + atType.aimCenterY * atPos.sin + atType.aimCenterZ * atPos.cos == onUsePos.z)
							{
								atTag = atPos.atTag;
								if((shadowType = AttachmentType.getAttachment(atType.shadowType)).bigHitBox != null)
								{
									AttachmentType.setTOFOn(atStates = AttachmentType.getStates(atTag), AttachmentTag.AVOID_CHECK_ON);
									if(!gunType.checkAtConflicts(shadowType.bigHitBox.get3DHitBoxes(atPos), shadowType.hitBox.get3DHitBoxes(atPos), 
											itemStack.stackTagCompound, 0, 0F, 0F, 0F, 0F)) atTag = null;
									AttachmentType.setTOFOff(atStates, AttachmentTag.AVOID_CHECK_OFF);
								}
								else
								{
									atStates = AttachmentType.getStates(atTag);
									atTag = null;
								}
								if(atTag == null)
								{
									shadowType.setTagAtType(atStates);
									if(atType.getUpdateGunStates()) shouldUpdateStates = true;
									--transStep;
								}
							}
					}
					if(transStep < 0)
					{
						gunType.setSightsAtForGun(itemStack); //has switched a coSight, reset sightsAt for gun
						NBTTagList sightsAt;
						byte i, j, k, thisAt[];
						for(i = (byte)(sightList = GunType.getSightList(itemStack)).tagCount(); --i >= 0; )
							for(j = (byte)(sightsAt = GunType.getTagListFromTagList(sightList, i)).tagCount(); --j >= 0; )
								if((thisAt = GunType.getByteArrayFromTagList(sightsAt, j)).length == refSightAt.length)
									for(k = (byte)(thisAt.length & (-1 << 1)); ; )
									{
										if(--k < 0) //hit! this is the sight we are referring to
										{
											GunType.setAimCenterOnUes(gunStates, i);
											if(shouldUpdateStates) gunType.setGunStates(itemStack);
											return;
										}
										if(thisAt[k] != refSightAt[k]) break;
									}
						//TODO: this is a situation that should never happen
					}
					//TODO:
					FlansMod.log(playerEntity.getDisplayName() + " Has Requested to Switch Co-Sight for an Aim Center on Gun with No Co-Sight");
				}
				else if(atInSlot == Operation.TOGGLE_AT)
				{
					if((atsAt = AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], ItsType.NONE, ItsType.TOGGLABLE)).size() == 0)
					{
						//TODO
						return;
					}
					AttachmentPos atPos = new AttachmentPos();
					AttachmentType shadowType;
					int[] atStates;
					GunType gunType = ((ItemGun)itemStack.getItem()).type;
					byte mark = 0;
					for(byte[] atAt : atsAt)
					{
						if((shadowType = AttachmentType.getAttachment(((AttachmentType)GunType.getPosOfAttachableAt(
								atPos.resetAtTag(itemStack.stackTagCompound, gunType), atAt, atAt.length).atType).shadowType)).bigHitBox != null)
						{
							AttachmentType.setTOFOn(atStates = AttachmentType.getStates(atPos.atTag), AttachmentTag.AVOID_CHECK_ON);
							if(!gunType.checkAtConflicts(shadowType.bigHitBox.get3DHitBoxes(atPos.updateTriValues()), shadowType.hitBox.get3DHitBoxes(atPos), 
									itemStack.stackTagCompound, 0, 0F, 0F, 0F, 0F)) atAt = null;
							AttachmentType.setTOFOff(atStates, AttachmentTag.AVOID_CHECK_OFF);
						}
						else
						{
							atStates = AttachmentType.getStates(atPos.atTag);
							atAt = null;
						}
						if(atAt != null) continue;
						mark |= 4;
						shadowType.setTagAtType(atStates);
						if(shadowType.itsType != atPos.atType.itsType && (shadowType.itsType == ItsType.SIGHT || atPos.atType.itsType == ItsType.SIGHT)) mark |= 2;
						if(((AttachmentType)atPos.atType).getUpdateGunStates()) mark |= 1;
					}
					if((mark & 4) == 0)
					{
						//TODO
						return;
					}
					if((mark & 2) != 0) gunType.setSightsAtForGun(itemStack);
					if((mark & 1) != 0) gunType.setGunStates(itemStack);
				}
				else
				{
					if((atsAt = GunType.getOnUseSightsAt(GunType.getStates(itemStack), GunType.getSightList(itemStack))).size() == 0)
					{
						//TODO:
						FlansMod.log(playerEntity.getDisplayName() + " Has Requested to Switch Sight with No Sight Installed on Gun: " + atInSlot);
						return;
					}
					if(atInSlot == Operation.SWITCH_DOT) //switch dot of sights on use
					{
						for(byte[] sightAt : atsAt)
						{
							if((atType = AttachmentType.getAtType(
									atTag = GunType.getAtTagAt(itemStack.stackTagCompound, sightAt, sightAt.length & -2))).numTexture > 1)
							{
								int atStates[] = AttachmentType.getStates(atTag), nextDot = AttachmentType.getDotNum(atStates) + 1;
								AttachmentType.setDotNum(atStates, (byte)(nextDot < atType.numTexture ? nextDot : 0));
							}
						}
					}
					else if(atInSlot == Operation.LAST_ZOOM || atInSlot == Operation.NEXT_ZOOM || atInSlot == Operation.LAST_ZOOM_L || atInSlot == Operation.NEXT_ZOOM_L)
					{
						for(byte[] sightAt : atsAt)
						{
							atType = AttachmentType.getAtType(atTag = GunType.getAtTagAt(itemStack.stackTagCompound, sightAt, sightAt.length & -2));
							if(atType.FOVZoomLevel.length < 2) continue; //if this scope can change zoom
							int atStates[] = AttachmentType.getStates(atTag), onZoomStep = AttachmentType.getZoomStep(atStates);
							if(atInSlot == Operation.LAST_ZOOM || atInSlot == Operation.LAST_ZOOM_L)
							{
								if(--onZoomStep >= 0) AttachmentType.setZoomStep(atStates, (byte)onZoomStep);
								else if(atInSlot == Operation.LAST_ZOOM_L) AttachmentType.setZoomStep(atStates, (byte)(atType.FOVZoomLevel.length - 1));
								continue;
							}
							if(++onZoomStep < atType.FOVZoomLevel.length) AttachmentType.setZoomStep(atStates, (byte)onZoomStep);
							else if(atInSlot == Operation.NEXT_ZOOM_L) AttachmentType.setZoomStep(atStates, (byte)0);
						}
					}
					else
					{
						//TODO: sent invalid operate code
					}
				}
			}
		}
		else if(atAtLen == INVALID_PACKET)
		{
			//TODO:
		}
		else if(atAtLen < 0) //request for specific attachment on gun, reach there before start operation
		{
			NBTTagCompound atTag = GunType.getAttachmentTagAt_T(GunType.getPRList(itemStack.stackTagCompound), atAt, -atAtLen);
			if(atInSlot == Operation.PAINTJOB || atInSlot == Operation.EX_PAINTJOB)
			{
				ModifiableType paintType;
				if(atAtLen == -1) paintType = ((ItemGun)itemStack.getItem()).type;
				else if(atTag == null)
				{
					//TODO:
					return;
				}
				else paintType = AttachmentType.getAtType(atTag);
				if(atInSlot == Operation.PAINTJOB)
				{
					if(transStep < 0 || transStep >= paintType.paintjobs.length)
					{
						//TODO:
					}
					else if(playerEntity.capabilities.isCreativeMode || paintType.paintjobs[transStep].removeMaterialsNeeded(playerEntity.inventory))
					{
						if(atAtLen == -1) itemStack.setItemDamage(transStep);
						else AttachmentType.setAtDam(AttachmentType.getStates(atTag), transStep);
					}
					else ;//FlansMod.record(i, p, done);
					return;
				} //for external paint job
				if(transStep < 0 || transStep >= playerEntity.inventory.getSizeInventory())
				{
					//TODO:
					return;
				}
				ItemStack stack = playerEntity.inventory.getStackInSlot(transStep);
				if(stack == null || !(stack.getItem() instanceof ItemPart) || !paintType.exPaintjobs.containsKey(((ItemPart)stack.getItem()).type.exPaintjobType))
				{
					//TODO:
					return;
				}
				short newDam = (short)(~ModifiableTag.EX_PAINT_MASK + Item.getIdFromItem(stack.getItem()));
				if(atAtLen == -1) itemStack.setItemDamage(newDam);
				else AttachmentType.setAtDam(AttachmentType.getStates(atTag), newDam);
				return;
			}
			if(atTag == null)
			{
				//TODO:
				return;
			}
			AttachmentType atType = AttachmentType.getAtType(atTag);
			if(atInSlot == Operation.SWITCH_LASER)
			{
				if(atType.isLaserPointer)
				{
					int[] atStates = AttachmentType.getStates(atTag);
					if(AttachmentType.getTOF(atStates, AttachmentTag.LASER_ON))
					{
						AttachmentType.setTOFOff(atStates, AttachmentTag.LASER_OFF);
						for(byte[] laserAt : AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], ItsType.NONE, ItsType.LASER))
							if(AttachmentType.getTOF(AttachmentType.getStates(
									GunType.getAtTagAt(itemStack.stackTagCompound, laserAt, laserAt.length)), AttachmentTag.LASER_ON)) return;
						GunType.setTOFOff(GunType.getStates(itemStack), GunTag.LASER_OFF);
						return;
					}
					AttachmentType.setTOFOn(atStates, AttachmentTag.LASER_ON);
					GunType.setTOFOn(GunType.getStates(itemStack), GunTag.LASER_ON);
					return;
				}
				//TODO:
				FlansMod.log("The Attachment " + playerEntity.getDisplayName() + " Requested to Turn on/off Laser is not a Laser Pointer");
			}
			else if(atInSlot == Operation.SWITCH_LIGHT) //switch light
			{
				if(atType.isFlashlight)
				{
					int[] atStates = AttachmentType.getStates(atTag);
					if(AttachmentType.getTOF(atStates, AttachmentTag.LIGHT_ON))
					{
						AttachmentType.setTOFOff(atStates, AttachmentTag.LIGHT_OFF);
						float newLightRange = -1F;
						NBTTagCompound lightTag;
						for(byte[] lightAt : AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], ItsType.NONE, ItsType.LIGHT))
						{
							if(AttachmentType.getTOF(AttachmentType.getStates(
									lightTag = GunType.getAtTagAt(itemStack.stackTagCompound, lightAt, lightAt.length)), AttachmentTag.LIGHT_ON))
								newLightRange = AttachmentType.getAtType(lightTag).flashlightRange;
						}
						GunType.setState(GunType.getStates(itemStack), GunTag.LIGHT_RANGE, newLightRange);
						return;
					}
					AttachmentType.setTOFOn(atStates, AttachmentTag.LIGHT_ON);
					if(atType.flashlightRange > GunType.getState(GunType.getStates(itemStack), GunTag.LIGHT_RANGE))
						GunType.setState(GunType.getStates(itemStack), GunTag.LIGHT_RANGE, atType.flashlightRange);
					return;
				}
				//TODO:
				FlansMod.log("The Attachment " + playerEntity.getDisplayName() + " Requested to Turn on/off Flashlight is not a Flashlight");
			}
			else if(atInSlot == Operation.SWITCH_DOT)
			{
				if(atType.numTexture < 2)
				{
					//TODO:
					return;
				}
				int atStates[] = AttachmentType.getStates(atTag), nextDot = AttachmentType.getDotNum(atStates) + 1;
				AttachmentType.setDotNum(atStates, (byte)(nextDot < atType.numTexture ? nextDot : (nextDot = 0)));
				playerEntity.addChatMessage(new ChatComponentText("switched to dot " + nextDot));
			}
			else if(atInSlot == Operation.LAST_ZOOM || atInSlot == Operation.LAST_ZOOM_L || atInSlot == Operation.NEXT_ZOOM || atInSlot == Operation.NEXT_ZOOM_L)
			{
				if(atType.FOVZoomLevel.length < 2)
				{
					//TODO:
					FlansMod.log(playerEntity.getDisplayName() + " Requested to Zoom an Attachment That Is Not a Scope or Not Avaliable for Zooming");
					return;
				}
				int atStates[] = AttachmentType.getStates(atTag);
				byte zoomStep = AttachmentType.getZoomStep(atStates);
				if(atInSlot == Operation.LAST_ZOOM || atInSlot == Operation.LAST_ZOOM_L)
				{
					if(--zoomStep >= 0) AttachmentType.setZoomStep(atStates, zoomStep);
					else if(atInSlot == Operation.LAST_ZOOM_L) AttachmentType.setZoomStep(atStates, zoomStep = (byte)(atType.FOVZoomLevel.length - 1));
					else ++zoomStep;
				}
				else
				{
					if(++zoomStep < atType.FOVZoomLevel.length) AttachmentType.setZoomStep(atStates, zoomStep);
					else if(atInSlot == Operation.NEXT_ZOOM_L) AttachmentType.setZoomStep(atStates, zoomStep = 0);
					else --zoomStep;
				}
				playerEntity.addChatMessage(new ChatComponentText("changed to zoom step " + zoomStep));
			}
			else if(atInSlot == Operation.TOGGLE_AT)
			{
				if(atType.isNone())
				{
					//TODO
					return;
				}
				int[] atStates = AttachmentType.getStates(atTag);
				GunType gunType = ((ItemGun)itemStack.getItem()).type;
				AttachmentType shadowType = AttachmentType.getAttachment(atType.shadowType);
				if(shadowType.bigHitBox != null)
				{
					AttachmentType.setTOFOn(atStates, AttachmentTag.AVOID_CHECK_ON);
					AttachmentPos atPos = GunType.getPosOfAttachableAt(new AttachmentPos(itemStack.stackTagCompound, gunType), atAt, atAtLen);
					if(gunType.checkAtConflicts(shadowType.bigHitBox.get3DHitBoxes(atPos.updateTriValues()), shadowType.hitBox.get3DHitBoxes(atPos), 
							itemStack.stackTagCompound, 0, 0F, 0F, 0F, 0F))
					{
						//TODO: note this player on server side
						return;
					}
					AttachmentType.setTOFOff(atStates, AttachmentTag.AVOID_CHECK_OFF);
				}
				shadowType.setTagAtType(atStates);
				if(atType.itsType != shadowType.itsType && (atType.itsType == ItsType.SIGHT || shadowType.itsType == ItsType.SIGHT))
					gunType.setSightsAtForGun(itemStack);
				if(atType.getUpdateGunStates()) gunType.setGunStates(itemStack);
			}
		}
		else //to modify the gun on use
		{
			NBTTagCompound baseTag;
			ModifiableType baseType;
			if(atAtLen > 2)
			{
				if((atAtLen & 1) == 1 || (baseTag = GunType.getAttachmentTagAt_T(GunType.getPRList(itemStack.stackTagCompound), atAt, atAtLen - 2)) == null)
				{
					//TODO:
					return;
				}
				baseType = AttachmentType.getAtType(baseTag);
			}
			else if(atAtLen == 2)
			{
				baseTag = itemStack.stackTagCompound;
				baseType = ((ItemGun)itemStack.getItem()).type;
			}
			else
			{
				//TODO:
				return;
			}
			NBTTagList prTag = ModifiableType.getPRList(baseTag);
			if(atAt[atAtLen - 2] < 0 || atAt[atAtLen - 2] >= prTag.tagCount())
			{
				//TODO:
				return;
			}
			prTag = GunType.getTagListFromTagList(prTag, atAt[atAtLen - 2]);
			if(atInSlot >= 0) //install new at
			{
				AttachableSlot slot = baseType.slots[atAt[atAtLen - 2]]; //prepare conflict test
				if(prTag.tagCount() >= FlansMod.maxAttachments || prTag.tagCount() >= slot.maxCanAttach)
				{
					//TODO:
					return;
				}
				if(transStep > slot.maxStep)
				{
					//TODO:
					return;
				}
				if(atInSlot >= playerEntity.inventory.getSizeInventory())
				{
					//TODO:
					return;
				}
				ItemStack toAddStack = playerEntity.inventory.getStackInSlot(atInSlot);
				if(toAddStack == null || !(toAddStack.getItem() instanceof ItemAttachment))
				{
					//TODO:
					return;
				}
				AttachmentType toAddType = ((ItemAttachment)toAddStack.getItem()).type;
				if(attachOffset >= toAddType.attachOffset.length)
				{
					//TODO:
					return;
				}
				if(!slot.isAttachmentAllowed(toAddType)) //if banned by blacklist
				{
					//TODO:
					return;
				}
				if((toAddType.itsType == ItsType.GRIP || toAddType.itsType == ItsType.REAR_GRIP)
						&& AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], toAddType.itsType, ItsType.NONE).size() > 0)
				{
					//TODO:
					return;
				}
				GunType gunType = ((ItemGun)itemStack.getItem()).type;
				if(FlansMod.atHitBoxTest && toAddType.bigHitBox != null)
				{
					AttachmentPos atPos = GunType.getPosOfAttachableAt(new AttachmentPos(itemStack.stackTagCompound, gunType), atAt, atAtLen - 2);
					Vector3f vec = slot.attachPos;
					atPos.x += vec.x + slot.attachVec * transStep + toAddType.attachOffset[attachOffset];
					atPos.y += vec.y * atPos.updateTriValues().cos - vec.z * atPos.sin;
					atPos.z += vec.y * atPos.sin + vec.z * atPos.cos;
					atPos.rotX += slot.attachRot;
					if(gunType.checkAtConflicts(toAddType.bigHitBox.get3DHitBoxes(atPos.updateTriValues()), toAddType.hitBox.get3DHitBoxes(atPos), 
							itemStack.stackTagCompound, 0, 0F, 0F, 0F, 0F))
					{
						//TODO:
						return;
					}
				} //pass test, install it!
				playerEntity.inventory.setInventorySlotContents(atInSlot, null); //remove it from player's inv
				NBTTagCompound itsTag = toAddType.writeAttachableToTag((short)toAddStack.getItemDamage(), null);
				int[] atStates = AttachmentType.getStates(itsTag);
				AttachmentType.setState(atStates, AttachmentTag.POS, slot.attachVec * transStep + toAddType.attachOffset[attachOffset]);
				AttachmentType.setOffset(atStates, attachOffset);
				prTag.appendTag(itsTag);
				gunType.setGunStates(itemStack); //done install, reset state and check for operatable
				gunType.setGunOperatable(itemStack);
				if(toAddType.itsType == ItsType.SIGHT) gunType.setSightsAtForGun(itemStack); //if is a sight, set sight for it
				return;
			}
			if(atAt[atAtLen - 1] < 0 || atAt[atAtLen - 1] >= prTag.tagCount())
			{
				//TODO:
				FlansMod.log("Attachment " + playerEntity.getDisplayName() + " Requested to Operate is Not Found");
				return;
			}
			if(atInSlot == Operation.REPOS_AT) //reposition the attachment
			{
				AttachableSlot slot = baseType.slots[atAt[atAtLen - 2]]; //prepare conflict test
				if(transStep < 0 || transStep > slot.maxStep)
				{
					//TODO:
					return;
				}
				NBTTagCompound toPosTag = prTag.getCompoundTagAt(atAt[atAtLen - 1]);
				AttachmentType toPosType = AttachmentType.getAtType(toPosTag);
				if(attachOffset < 0 || attachOffset >= toPosType.attachOffset.length)
				{
					//TODO:
					return;
				}
				GunType gunType = ((ItemGun)itemStack.getItem()).type;
				if(FlansMod.atHitBoxTest && toPosType.bigHitBox != null && toPosType.checkConflictsAfterMovingAt(toPosTag, new AttachmentPos(itemStack.stackTagCompound, gunType), 
							slot.attachVec * transStep + toPosType.attachOffset[attachOffset] - AttachmentType.getPos(toPosTag), atAt, atAtLen, itemStack, gunType))
				{
					//TODO:
					return;
				} //check pass, re-pos it!
				int[] atStates = AttachmentType.getStates(toPosTag);
				AttachmentType.setState(atStates, AttachmentTag.POS, slot.attachVec * transStep + toPosType.attachOffset[attachOffset]);
				AttachmentType.setOffset(atStates, attachOffset);
				if(toPosType.itsType == ItsType.SIGHT) gunType.setSightsAtForGun(itemStack);
			}
			else if(atInSlot == Operation.UNSTALL_AT) //if remove the attachment, return it with all the attachments on it
			{
				barrelRemoved = boltRemoved = false;
				//for(int i = prTag.tagCount(); --i >= 0; ) if(AttachmentType.getAttachableType(prTag.getCompoundTagAt(i)).itsType == ItsType.SIGHT) sightRemoved = true;
				//do not use sight removed any more because removing a sight will effect all sights that installed on those ats of same layer
				returnLayerStacks(prTag.getCompoundTagAt(atAt[atAtLen - 1]), playerEntity);
				prTag.removeTag(atAt[atAtLen - 1]); //remove the tag of this attachment
				if(barrelRemoved) //barrel removed, return bullet in barrel if has
				{
					ShootableType bulletInBarrel = GunType.getAmmoAt(itemStack, 0);
					if(bulletInBarrel != null)
					{
						ItemStack toGive = new ItemStack(bulletInBarrel.item);
						if(!InventoryHelper.addItemStackToPlayerInventory(playerEntity.inventory, toGive)) playerEntity.entityDropItem(toGive, 0.5F);
						GunType.setAmmoAt(itemStack, 0, null);
					}
				}
				if(boltRemoved) GunType.setTOFOff(GunType.getStates(itemStack), GunTag.BOLT_CATCH_OFF);
				GunType gunType = ((ItemGun)itemStack.getItem()).type;
				gunType.setGunStates(itemStack); //done unstall, reset state and check for operatable
				gunType.setGunOperatable(itemStack);
				gunType.setSightsAtForGun(itemStack); //remove an at can cause the relative path to an at change, so re-set sights at for gun
			}
			else
			{
				//TODO:
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) { }
}
