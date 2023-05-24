package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.KeyInputHandler;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.OperationQueue.Operation;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.GunType.FireMode;
import com.flansmod.common.guns.GunType.GunOperation;
import com.flansmod.common.guns.GunType.GunTag;
import com.flansmod.common.guns.ModifiableType.ItsType;
import com.flansmod.common.guns.ModifiableType.ModifiableTag;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.guns.raytracing.EntityHit;
import com.flansmod.common.guns.raytracing.EnumHitboxType;
import com.flansmod.common.guns.raytracing.PlayerBulletHit;
import com.flansmod.common.guns.raytracing.PlayerHitbox;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.network.PacketGunFire;
import com.flansmod.common.network.PacketOperation;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import com.google.common.collect.Multimap;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

public class ItemGun extends Item implements IPaintableItem
{
	public GunType type;
	public static int burstRoundsRemainingLeft = 0, burstRoundsRemainingRight = 0;
	public int soundDelay, lockOnSoundDelay;
	public int impactX = 0, impactY = 0, impactZ = 0;
	public IIcon[] icons;
	public HashMap<Integer, IIcon> exIcons;
	
	/** constructor */
	public ItemGun(GunType gun)
	{
		maxStackSize = 1;
		(type = gun).item = this;
		setHasSubtypes(true);
		setCreativeTab(FlansMod.tabFlanGuns);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}	
	
	@Override
	public InfoType getInfoType() { return type; }
	
	@Override
	public PaintableType getPaintableType() { return type; }
	
	/**@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase beenHit, EntityLivingBase hitter)
    {
		stack.damageItem(1, hitter);
        return true;
    }*/
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips)
	{
		if(!type.packName.isEmpty()) lines.add("\u00a7o" + type.packName);
		if(type.description != null) Collections.addAll(lines, type.description.split("_"));
		if(!GunType.hasStates(stack)) return;
		KeyBinding sneakKey = FlansModClient.minecraft.gameSettings.keyBindSneak;
		if(GameSettings.isKeyDown(sneakKey))
		{	//if it is a mag
			if(type.itsType == ItsType.MAG)
			{
				//if(type.isParallelMag) lines.add("\u00a7e[Paralle Magazine]");
				lines.add("\u00a79" + I18n.format("mag.ammocapacity") + "\u00a77: " + type.ammoCapacity);
				if(type.shotGunSpread != 1F) lines.add("\u00a79" + I18n.format("mag.unloadmagtime") + "\u00a77: " + roundFloat((type.shotGunSpread - 1F) * 100F, 2) + "%");
				if(type.shotGunAimingSpread != 1F) lines.add("\u00a79" + I18n.format("mag.loadmagtime") + "\u00a77: " + roundFloat((type.shotGunAimingSpread - 1F) * 100F, 2) + "%");
				if(type.recoilPitch != 1F) lines.add("\u00a79" + I18n.format("mag.recoilpitch") + "\u00a77: " + roundFloat((type.recoilPitch - 1F) * 100F, 2) + "%");
				if(type.rndRecoilYawRange != 1F) lines.add("\u00a79" + I18n.format("mag.recoilyaw") + "\u00a77: " + roundFloat((type.rndRecoilYawRange - 1F) * 100F, 2) + "%");
				if(type.bulletSpeed != 1F) lines.add("\u00a79" + I18n.format("mag.aimtime") + "\u00a77: " + roundFloat((type.bulletSpeed - 1F) * 100F, 2) + "%");
				if(type.bulletSpread != 1F) lines.add("\u00a79" + I18n.format("mag.runposetime") + "\u00a77: " + roundFloat((type.bulletSpread - 1F) * 100F, 2) + "%");
				if(type.damage != 1F) lines.add("\u00a79" + I18n.format("mag.movespeed") + "\u00a77: " + roundFloat((type.damage - 1F) * 100F, 2) + "%");
				return;
			}
			int[] states = GunType.getStates(stack); //if it is a gun
			lines.add("\u00a79" + I18n.format("gun.damage") + "\u00a77: " + roundFloat(GunType.getState(states, GunTag.DAMAGE), 2));
			String fireMode = "";
			for(int i = 0; i < type.fireMode.length; ++i) fireMode = fireMode + GunType.FireMode.getFireModeString(type.fireMode[i], type.itsType) + " ";
			lines.add("\u00a79" + I18n.format("gun.firemode") + "\u00a77: " + fireMode);
			lines.add("\u00a79" + I18n.format("gun.firerate") + "\u00a77: " + 1200 / GunType.getState(states, GunTag.SHOOT_DELAY) + "\u00a77RPM ");
			lines.add("\u00a79" + I18n.format("gun.recoilpitch") + "\u00a77: " + roundFloat(GunType.getState(states, GunTag.RECOIL_PITCH), 2));
			lines.add("\u00a79" + I18n.format("gun.recoilyaw") + "\u00a77: " + roundFloat(GunType.getState(states, GunTag.RND_RECOIL_YAW), 2));
			lines.add("\u00a79" + I18n.format("gun.aimspread") + "\u00a77: " + roundFloat(GunType.getState(states, GunTag.AIM_SPREAD), 2));
			lines.add("\u00a79" + I18n.format("gun.hipspread") + "\u00a77: " + roundFloat(GunType.getState(states, GunTag.SPREAD), 2));
			lines.add("\u00a79" + I18n.format("gun.reloadtime") + "\u00a77: (" + FlansMod.getTimeFromTicks(type.getTotalReloadTime(), 2) + ")s");
			lines.add("\u00a79" + I18n.format("gun.aimmovespeed") + "\u00a77: " + (roundFloat(GunType.getState(states, GunTag.AIM_MOVE_SPEED), 2)));
			lines.add("\u00a79" + I18n.format("gun.aimtime") + "\u00a77: " + roundFloat(GunType.getState(states, GunTag.AIM_TIME), 2));
			lines.add("\u00a79" + I18n.format("gun.runposetime") + "\u00a77: " + roundFloat(GunType.getState(states, GunTag.RUN_POSE_TIME) * 50F, 2) + "ms");
			lines.add("\u00a79" + I18n.format("gun.bulletspeed") + "\u00a77: " + roundFloat(GunType.getState(states, GunTag.BULLET_SPEED), 2));
			lines.add("\u00a79" + I18n.format("gun.shootsoundrange") + "\u00a77: " + roundFloat(GunType.getState(states, GunTag.GUN_SOUND_RANGE), 2));
			lines.add("\u00a79" + I18n.format("gun.gunlength") + "\u00a77: " + roundFloat(GunType.getState(states, GunTag.GUN_LENGTH), 2) + "(" + type.model.barrelOrigin.x + ")");
			return;
		}
		if(type.itsType == ItsType.MAG) //if it is a mag, show mag state here
		{
			lines.add("\u00a79" + I18n.format("mag.ammoleft") + ": " + I18n.format(type.getAmmoState(stack.stackTagCompound)));
			lines.add("\u00a79" + I18n.format("mag.state") + ": " + I18n.format(GunType.getTOF(GunType.getStates(stack), GunTag.MAG_USED_ON) ? "mag.used" : "mag.unused"));
		}
		lines.add("");
		lines.add(I18n.format("gui.holdsneakkeytoshowdetails"));
	}
	
	@SideOnly(Side.CLIENT)
	public void onUpdateClient(ItemStack itemStack, World world, Entity entity, int i, boolean flag)
	{	//This code is not for deployables
		if(type.deployable) return;
		if(soundDelay > 0) --soundDelay;
		if(entity instanceof EntityPlayer && ((EntityPlayer)entity).inventory.getCurrentItem() == itemStack && GunType.hasStates(itemStack));
		else return;
		Minecraft mc = FlansModClient.minecraft; //Get useful objects
		EntityPlayer player = (EntityPlayer)entity;
		GameSettings gameSettings = mc.gameSettings;
		int[] gunStates = GunType.getStates(itemStack);
		
		//If in a GUI, we can't shoot a gun, so the gun codes wouldn't be done after this check. also we need to cancel all the operations
		if(mc.currentScreen != null)
		{
			burstRoundsRemainingLeft = burstRoundsRemainingRight = 0;
			if(FlansModClient.currentScope) //if we are aiming while in a GUI, then dis_aim and set back the thirdPersonView
			{
				FlansModClient.currentScope = false;
				gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
			} //cancel all the operations waiting to be implemented
			if(FlansModClient.operatingState != GunOperation.NONE || FlansModClient.operatingState != GunOperation.REST || FlansModClient.operatingState != GunOperation.UNREST)
			{	//reset reload animation state
				FlansModClient.resetReloadState();
				FlansModClient.operationToDo = FlansModClient.operatingState = GunOperation.NONE;
				FlansModClient.lastOperatingProgress = FlansModClient.operatingProgress = 0F;
				FlansModClient.manuallyRest = false;
			}
		} //if we are looking at something like ammo bags, flags or dropped gun items, the rest codes(aim and shoot) wouldn't be executed
		else if(mc.objectMouseOver != null && (mc.objectMouseOver.entityHit instanceof EntityFlagpole || mc.objectMouseOver.entityHit instanceof EntityFlag
				|| mc.objectMouseOver.entityHit instanceof EntityGunItem || (mc.objectMouseOver.entityHit instanceof EntityGrenade
				&& ((EntityGrenade)mc.objectMouseOver.entityHit).type.isDeployableBag))) { }
		else if(FlansModClient.operatingState != GunOperation.NONE) //if there is a operaiong going on
		{
			burstRoundsRemainingLeft = burstRoundsRemainingRight = 0; //to avoid left burst rounds to shoot after an operation
			if(FlansModClient.operatingState == GunOperation.REST && FlansModClient.manuallyRest && (KeyInputHandler.fireKeyDown || KeyInputHandler.aimKeyDown()))
			{
				FlansModClient.operatingState = GunOperation.UNREST; //resting and fire or aim button is pressed, then unrest
				FlansModClient.manuallyRest = false;
			}
		} //initial check completed, if not taking out the gun or running, then do gun codes
		else if(FlansModClient.lastTakeOutProgress == 0F && FlansModClient.lastSprintProgress == 0F)
		{
			//Main hand gun //check fire ticks before shoot
			if(type.usableByPlayers && FlansModClient.shootTimeRight <= 0F && GunType.getTOF(gunStates, GunTag.CAN_SHOOT_ON))
			{
				if(type.itsType == ItsType.MAG) //holding a mag, not the shooting button means pull one bullet out of the mag
				{
					/*if(type.isParallelMag) //if it is a Parallel Mag, then left click pull left bullet out, right click pull right bullet out
					{
						if(KeyInputHandler.fireKeyDown)
						{
							//TODO: pull left bullet out
						}
						else if(KeyInputHandler.aimKeyDown()) { }
					}
					else */if(KeyInputHandler.fireKeyDown) //not a parrallel mag
					{
						if(type.checkMagToLoad(itemStack, player.inventory)) FlansModClient.operationToDo = GunOperation.LOAD_AMMO;
						else if(!KeyInputHandler.lastFireKeyDown) { } //no null slot to insert bullet, play sound
					}
					else if(KeyInputHandler.aimKeyDown())
					{
						if(GunType.hasItemInMag(itemStack.stackTagCompound)) FlansModClient.operationToDo = GunOperation.UNLOAD_AMMO;
						else if(!KeyInputHandler.lastAimKeyDown()) { } //no bullet in mag to pull out
					}
				}
				else
				{
					if(type.getSecondaryFire(itemStack)) //shooting gun underbarrel
					{
						if(KeyInputHandler.fireKeyDown)
						{
							AttachmentType grip = GunType.getGripType(gunStates);
							//no need to check if grip exists or not, for enabling the secFire mode must need a grip
							if(grip.secondaryFireMode == FireMode.FULL_AUTO)
							{
								//if has ammo, shoot, otherwise, play empty click sound
								if(grip.checkSecAmmo(null, grip))
								{
									FlansModClient.updateSecGunRecoil(itemStack);
									FlansMod.getPacketHandler().sendToServer(new PacketGunFire(player.inventory.currentItem, FlansModClient.zoomProgress > FlansMod.isAimPhase, true, 
																							   (float)player.posX + RenderGun.barrelOriTransRight.x, 
																							   (float)player.posY + RenderGun.barrelOriTransRight.y, 
																							   (float)player.posZ + RenderGun.barrelOriTransRight.z, player.rotationYaw + RenderGun.barrelRotYawRight, 
																							   player.rotationPitch + RenderGun.barrelRotPitchRight));
									FlansModClient.shootTimeRight += grip.secondaryShootDelay;
								}
								else if(!KeyInputHandler.lastFireKeyDown) FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.EMPTY_CLICK_SOUND)); //play sound
							}
							else if(grip.secondaryFireMode == FireMode.SEMI_AUTO)
							{
								if(KeyInputHandler.lastFireKeyDown) { }
								else if(grip.checkSecAmmo(null, grip))
								{
									FlansModClient.updateSecGunRecoil(itemStack);
									FlansMod.getPacketHandler().sendToServer(new PacketGunFire(player.inventory.currentItem, FlansModClient.zoomProgress > FlansMod.isAimPhase, true, 
																							   (float)player.posX + RenderGun.barrelOriTransRight.x, 
																							   (float)player.posY + RenderGun.barrelOriTransRight.y, 
																							   (float)player.posZ + RenderGun.barrelOriTransRight.z, player.rotationYaw + RenderGun.barrelRotYawRight, 
																							   player.rotationPitch + RenderGun.barrelRotPitchRight));
									FlansModClient.shootTimeRight += grip.secondaryShootDelay;
								}
								else FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.EMPTY_CLICK_SOUND));
							}
						}
					}
					else if(GunType.getTOF(gunStates, GunTag.BOLT_CATCH_ON)) //not secFire, but slide locked, if we press trigger, play empty click sound
					{
						if(type.getFireMode(gunStates) == FireMode.SAFE)
						{
							if(KeyInputHandler.fireKeyDown && !KeyInputHandler.lastFireKeyDown && type.safeEmptyClickSound != null)
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.SAFE_EMPTY_CLICK_SOUND));
						}
						else if(KeyInputHandler.fireKeyDown && !KeyInputHandler.lastFireKeyDown)
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.EMPTY_CLICK_SOUND));
					}
					else //not sec fire and not bolt catch
					{
						byte fireMode = type.getFireMode(gunStates);
						if(fireMode == FireMode.BURST) //If we are using a burst mode gun, and there is burst left to be done, try to do it
						{
							if(burstRoundsRemainingRight > 0)
							{
								if(type.preCheckOnFire(itemStack, gunStates))
								{
									FlansModClient.updateGunRecoil(itemStack);
									FlansMod.getPacketHandler().sendToServer(new PacketGunFire(player.inventory.currentItem, FlansModClient.zoomProgress > FlansMod.isAimPhase, false, 
																							   (float)player.posX + RenderGun.barrelOriTransRight.x, 
																							   (float)player.posY + RenderGun.barrelOriTransRight.y, 
																							   (float)player.posZ + RenderGun.barrelOriTransRight.z, player.rotationYaw + RenderGun.barrelRotYawRight, 
																							   player.rotationPitch + RenderGun.barrelRotPitchRight));
									FlansModClient.shootTimeRight += GunType.getState(gunStates, GunTag.SHOOT_DELAY);
									--burstRoundsRemainingRight;
								}
								else burstRoundsRemainingRight = 0;
							}
							else if(KeyInputHandler.fireKeyDown && !KeyInputHandler.lastFireKeyDown)
							{
								if(type.preCheckOnFire(itemStack, gunStates))
								{
									FlansModClient.updateGunRecoil(itemStack);
									FlansMod.getPacketHandler().sendToServer(new PacketGunFire(player.inventory.currentItem, FlansModClient.zoomProgress > FlansMod.isAimPhase, false, 
																							   (float)player.posX + RenderGun.barrelOriTransRight.x, 
																							   (float)player.posY + RenderGun.barrelOriTransRight.y, 
																							   (float)player.posZ + RenderGun.barrelOriTransRight.z, player.rotationYaw + RenderGun.barrelRotYawRight, 
																							   player.rotationPitch + RenderGun.barrelRotPitchRight));
									FlansModClient.shootTimeRight += GunType.getState(gunStates, GunTag.SHOOT_DELAY);
									burstRoundsRemainingRight = type.numBurstRounds - 1;
								}
								else FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.EMPTY_CLICK_SOUND));
							}
						}
						else if(KeyInputHandler.fireKeyDown)
						{
							if(fireMode == FireMode.FULL_AUTO)
							{
								if(type.preCheckOnFire(itemStack, gunStates))
								{
									FlansModClient.updateGunRecoil(itemStack);
									FlansMod.getPacketHandler().sendToServer(new PacketGunFire(player.inventory.currentItem, FlansModClient.zoomProgress > FlansMod.isAimPhase, false, 
																							   (float)player.posX + RenderGun.barrelOriTransRight.x, 
																							   (float)player.posY + RenderGun.barrelOriTransRight.y, 
																							   (float)player.posZ + RenderGun.barrelOriTransRight.z, player.rotationYaw + RenderGun.barrelRotYawRight, 
																							   player.rotationPitch + RenderGun.barrelRotPitchRight));
									FlansModClient.shootTimeRight += GunType.getState(gunStates, GunTag.SHOOT_DELAY);
								}
								else if(!KeyInputHandler.lastFireKeyDown) FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.EMPTY_CLICK_SOUND));
							}
							else if(fireMode == FireMode.SEMI_AUTO)
							{
								if(KeyInputHandler.lastFireKeyDown) { }
								else if(type.preCheckOnFire(itemStack, gunStates))
								{
									FlansModClient.updateGunRecoil(itemStack);
									FlansMod.getPacketHandler().sendToServer(new PacketGunFire(player.inventory.currentItem, FlansModClient.zoomProgress > FlansMod.isAimPhase, false, 
																							   (float)player.posX + RenderGun.barrelOriTransRight.x, 
																							   (float)player.posY + RenderGun.barrelOriTransRight.y, 
																							   (float)player.posZ + RenderGun.barrelOriTransRight.z, player.rotationYaw + RenderGun.barrelRotYawRight, 
																							   player.rotationPitch + RenderGun.barrelRotPitchRight));
									FlansModClient.shootTimeRight += GunType.getState(gunStates, GunTag.SHOOT_DELAY);
								}
								else FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.EMPTY_CLICK_SOUND));
							}
							else if(fireMode == FireMode.MINIGUN)
							{
								//TODO: complete code for minigun shoot
							} //safe mode, play safemodeemptyclick sound if have
							else if(type.safeEmptyClickSound != null && !KeyInputHandler.lastFireKeyDown)
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.SAFE_EMPTY_CLICK_SOUND));
						}
					}
				}
			}
		}
		
		//if we are running, we can't do aim
		if(FlansModClient.sprinting || type.itsType == ItsType.MAG || FlansModClient.operatingState == GunOperation.REST 
				|| FlansModClient.operatingState == GunOperation.MODIFY)
		{
			if(FlansModClient.currentScope) //if we have been aiming before, then un_aim
			{
				FlansModClient.currentScope = false;
				gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
			}
		}
		//TODO: may optimize these two aim type
		if((type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM) && mc.currentScreen == null)
		{
			if(KeyInputHandler.aimHoldKeyDown)
			{
				if(!FlansModClient.currentScope)
				{
					FlansModClient.currentScope = true;
					FlansModClient.originalThirdPerson = gameSettings.thirdPersonView;
					gameSettings.thirdPersonView = 0;
				}
			}
			else if(FlansModClient.currentScope)
			{
				FlansModClient.currentScope = false;
				gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
			}
		}
		if(KeyInputHandler.aimToggleKeyDown && !KeyInputHandler.lastAimToggleKeyDown 
				&& (type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM) 
				&& mc.currentScreen == null)
		{
			if(FlansModClient.currentScope)
			{
				FlansModClient.currentScope = false;
				gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
			}
			else
			{
				FlansModClient.currentScope = true;
				FlansModClient.originalThirdPerson = gameSettings.thirdPersonView;
				gameSettings.thirdPersonView = 0;
			}
		}
	}
	
	//ray trace by the coor of the gun
	@SideOnly(Side.CLIENT)
	public static MovingObjectPosition rayTrace(EntityPlayer player, float distance, boolean useNO)
	{
		double posX, posY, posZ;
		float rotationYaw, rotationPitch;
		if(useNO)
		{
			posX = player.posX + RenderGun.barrelOriTransRightNO.x;
			posY = player.posY + RenderGun.barrelOriTransRightNO.y;
			posZ = player.posZ + RenderGun.barrelOriTransRightNO.z;
			rotationYaw = player.rotationYaw + RenderGun.barrelRotYawRightNO;
			rotationPitch = player.rotationPitch + RenderGun.barrelRotPitchRightNO;
		}
		else
		{
			posX = player.posX + RenderGun.barrelOriTransRight.x;
			posY = player.posY + RenderGun.barrelOriTransRight.y;
			posZ = player.posZ + RenderGun.barrelOriTransRight.z;
			rotationYaw = player.rotationYaw + RenderGun.barrelRotYawRight;
			rotationPitch = player.rotationPitch + RenderGun.barrelRotPitchRight;
		}
        Vec3 startVec = Vec3.createVectorHelper(posX, posY, posZ);
        Vec3 lookVec = getLook(rotationYaw, rotationPitch);
        Vec3 endVec = startVec.addVector(lookVec.xCoord * distance, lookVec.yCoord * distance, lookVec.zCoord * distance);
        return player.worldObj.func_147447_a(startVec, endVec, false, false, true);
	}
	
	@SideOnly(Side.CLIENT)
	private static Vec3 getLook(float rotationYaw, float rotationPitch)
	{
		float f1 = MathHelper.cos(-rotationYaw * 0.017453292F - (float)Math.PI), 
			  f2 = MathHelper.sin(-rotationYaw * 0.017453292F - (float)Math.PI), 
			  f3 = -MathHelper.cos(-rotationPitch * 0.017453292F), 
			  f4 = MathHelper.sin(-rotationPitch * 0.017453292F);
		return Vec3.createVectorHelper((double)(f2 * f3), (double)f4, (double)(f1 * f3));
	}
	
	/** this method contents the whole operation process to shoot a gun */
	public void trySecShoot(ItemStack gunStack, World world, EntityPlayerMP entityPlayer, 
			boolean isAiming, float x, float y, float z, float roty, float rotz) { }
	
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity pEnt, int i, boolean flag)
	{
		if(world.isRemote) onUpdateClient(itemstack, world, pEnt, i, flag);

		if(pEnt instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)pEnt;
			PlayerData data = PlayerHandler.getPlayerData(player);
			if(data == null) return;

			if(!type.canSetPosition) this.impactX = this.impactY = this.impactZ = 0;

			if(lockOnSoundDelay > 0) --lockOnSoundDelay;

			Entity closestEntity = null;
			if(type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers || type.lockOnToVehicles)
			{
				//double closestAngle;

				for(Object obj : player.worldObj.loadedEntityList)
				{
					Entity entity = (Entity)obj;
					Vec3 playerVec = player.getLookVec();
					double dXYZ = Math.sqrt((entity.posX - player.posX) * (entity.posX - player.posX) + (entity.posY - player.posY) * (entity.posY - player.posY) + (entity.posZ - player.posZ) * (entity.posZ - player.posZ));
					Vector3f relPosVec = new Vector3f(entity.posX - player.posX, entity.posY - player.posY, entity.posZ - player.posZ);
					Vector3f playerVec3f = new Vector3f(playerVec.xCoord,playerVec.yCoord,playerVec.zCoord);
					float angle = Math.abs(Vector3f.angle(playerVec3f, relPosVec));
					if(angle < Math.toRadians(type.canLockOnAngle) && dXYZ < type.maxRangeLockOn)
					{
						String etype = entity.getEntityData().getString("EntityType");
						if( (type.lockOnToMechas	&& entity instanceof EntityMecha)	||
							(type.lockOnToVehicles	&& entity instanceof EntityVehicle)	||
							(type.lockOnToVehicles	&& etype.equals("Vehicle"))			|| // for vehicle of other Mod
							(type.lockOnToPlanes	&& entity instanceof EntityPlane)	||
							(type.lockOnToPlanes	&& etype.equals("Plane"))			|| // for plane of other Mod
							(type.lockOnToPlayers	&& entity instanceof EntityPlayer)	||
							(type.lockOnToLivings	&& entity instanceof EntityLivingBase))
						{
							//if(entity instanceof EntityMecha || entity instanceof EntityVehicle || entity instanceof EntityPlane || entity instanceof EntityPlayer || entity instanceof EntityLivingBase)
							if(!data.reloadingRight) closestEntity = entity;
							//closestAngle = angle;
						}
					}
				}

				if(closestEntity != null)
					closestEntity.getEntityData().setBoolean("LockOn", true);

				if(closestEntity != null && lockOnSoundDelay <= 0 && !player.worldObj.isRemote && player.getCurrentEquippedItem() != null)
				{
					if(player.getCurrentEquippedItem().getItem() instanceof ItemGun)
					{
						ItemGun itemGun;
						itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
						PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 10, player.dimension, itemGun.type.lockOnSound, false);
						//PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 100, player.dimension, itemGun.type.shootSound[0], false);
						lockOnSoundDelay = type.lockOnSoundTime;
						if(closestEntity instanceof EntityDriveable && ((EntityDriveable)closestEntity).getDriveableType().hasFlare)
						{
							EntityDriveable entityDriveable = (EntityDriveable)closestEntity;
							PacketPlaySound.sendSoundPacket(closestEntity.posX, closestEntity.posY, closestEntity.posZ,
								entityDriveable.getDriveableType().lockedOnSoundRange,
								closestEntity.dimension, entityDriveable.getDriveableType().lockingOnSound, false);
						}
					}
				}
			}
			/* TODO; Add scope attachment override to enable NV for add-on NV scopes
			//If player is holding gun, apply modifiers below
			if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun)
			{
				ItemGun itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
				//Apply a penalty to jumpMovement equal to the moveSpeed penalty (0.5 moveSpeed = 0.5 jumpDistance)
				if(itemGun.type.moveSpeedModifier != 1F)
					player.jumpMovementFactor = 0F;
				else
					player.jumpMovementFactor = 0.02F;
			}
			*/
			
			//if(data.lastMeleePositions == null || data.lastMeleePositions.length != type.meleeDamagePoints.size())
			//{
			//	data.lastMeleePositions = new Vector3f[type.meleeDamagePoints.size()];
			//	for(int j = 0; j < type.meleeDamagePoints.size(); j++)
			//		data.lastMeleePositions[j] = new Vector3f(player.posX, player.posY, player.posZ);
			//}
			//Melee weapon
			if(data.meleeLength > 0 && type.meleePath.size() > 0 && player.inventory.getCurrentItem() == itemstack)
			{
				for(int k = 0; k < type.meleeDamagePoints.size(); k++)
				{
					Vector3f meleeDamagePoint = type.meleeDamagePoints.get(k);
					//Do a raytrace from the prev pos to the current pos and attack anything in the way
					Vector3f nextPos = type.meleePath.get((data.meleeProgress + 1) % type.meleePath.size());
					Vector3f nextAngles = type.meleePathAngles.get((data.meleeProgress + 1) % type.meleePathAngles.size());
					RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);

					Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
					Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
					Vector3f.add(new Vector3f(0F, 0F, 0F), nextPosInGunCoords, nextPosInGunCoords);
					Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextPosInGunCoords);


					if(!FlansMod.proxy.isThePlayer(player))
						nextPosInPlayerCoords.y += 1.6F;

					Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);

					Vector3f dPos = data.lastMeleePositions[k] == null ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleePositions[k], null);

					if(player.worldObj.isRemote && FlansMod.DEBUG)
						player.worldObj.spawnEntityInWorld(new EntityDebugVector(player.worldObj, data.lastMeleePositions[k], dPos, 200, 1F, 0F, 0F));

					//Do the raytrace
					{
						//Create a list for all bullet hits
						ArrayList<BulletHit> hits = new ArrayList<BulletHit>();

						//Iterate over all entities
						for(int j = 0; j < world.loadedEntityList.size(); j++)
						{
							Object obj = world.loadedEntityList.get(j);
							//Get players
							if(obj instanceof EntityPlayer)
							{
								EntityPlayer otherPlayer = (EntityPlayer)obj;
								PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
								boolean shouldDoNormalHitDetect = false;
								if(otherPlayer == player)
									continue;
								if(otherData != null)
								{
									if(otherPlayer.isDead || otherData.team == Team.spectators)
										continue;
									
									int snapshotToTry = player instanceof EntityPlayerMP ? ((EntityPlayerMP)player).ping / 50 : 0;
									if(snapshotToTry >= otherData.snapshots.length)
										snapshotToTry = otherData.snapshots.length - 1;

									PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
									if(snapshot == null)
										snapshot = otherData.snapshots[0];

									//DEBUG
									//snapshot = new PlayerSnapshot(player);

									//Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
									if(snapshot == null)
										shouldDoNormalHitDetect = true;
									else
									{
										//Raytrace
										ArrayList<BulletHit> playerHits = snapshot.raytrace(data.lastMeleePositions[k] == null ? nextPosInWorldCoords : data.lastMeleePositions[k], dPos);
										hits.addAll(playerHits);
									}
								}

								//If we couldn't get a snapshot, use normal entity hitbox calculations
								if(otherData == null || shouldDoNormalHitDetect)
								{
									MovingObjectPosition mop = data.lastMeleePositions[k] == null ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0F, 0F, 0F)) : player.boundingBox.calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleePositions[k].x, mop.hitVec.yCoord - data.lastMeleePositions[k].y, mop.hitVec.zCoord - data.lastMeleePositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;

										hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
									}
								}
							}
							else
							{
								Entity entity = (Entity)obj;
								if(entity != player && !entity.isDead && (entity instanceof EntityLivingBase || entity instanceof EntityAAGun))
								{
									MovingObjectPosition mop = entity.boundingBox.calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleePositions[k].x, mop.hitVec.yCoord - data.lastMeleePositions[k].y, mop.hitVec.zCoord - data.lastMeleePositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;

										hits.add(new EntityHit(entity, hitLambda));
									}
								}
							}
						}

						//We hit something
						if(!hits.isEmpty())
						{
							//Sort the hits according to the intercept position
							Collections.sort(hits);

							float swingDistance = dPos.length();

							for(BulletHit bulletHit : hits)
							{
								if(bulletHit instanceof PlayerBulletHit)
								{
									PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
									float damageMultiplier = 1F;
									switch(playerHit.hitbox.type)
									{
									case LEFT_ITEM : case RIGHT_ITEM : //Hit a shield. Stop the swing.
									{
										data.meleeProgress = data.meleeLength = 0;
										return;
									}
									//DamageMultiplier for shooting different part of the body
									case HEAD : damageMultiplier = 2F; break;
									case RIGHT_ARM : case LEFT_ARM : damageMultiplier = 0.6F; break;
									default :
									}

									if(playerHit.hitbox.player.attackEntityFrom(getMeleeDamage(player), swingDistance * type.meleeDamage))
									{
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										playerHit.hitbox.player.arrowHitTimer++;
										playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
									}

									if(FlansMod.DEBUG)
										world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1F, 0F, 0F));
								}
								else if(bulletHit instanceof EntityHit)
								{
									EntityHit entityHit = (EntityHit)bulletHit;
									if(entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * type.meleeDamage) && entityHit.entity instanceof EntityLivingBase)
									{
										EntityLivingBase living = (EntityLivingBase)entityHit.entity;
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										living.arrowHitTimer++;
										living.hurtResistantTime = living.maxHurtResistantTime / 2;
									}

									if(FlansMod.DEBUG)
										world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1F, 0F, 0F));
								}
							}
						}
					}
					//End raytrace

					data.lastMeleePositions[k] = nextPosInWorldCoords;
				}

				//Increment the progress meter
				data.meleeProgress++;
				//If we are done, reset the counters
				if(data.meleeProgress == data.meleeLength)
					data.meleeProgress = data.meleeLength = 0;
			}
		}
	}
	
	public DamageSource getMeleeDamage(EntityPlayer attacker)
	{ return new EntityDamageSourceGun(type.shortName, attacker, attacker, type, false); }
	
	/** Reload method. Called automatically when firing with an empty clip */
	public boolean reload(ItemStack gunStack, World world, EntityPlayer player, boolean forceReload)
	{ return reload(gunStack, world, player, player.inventory, player.capabilities.isCreativeMode, forceReload); }
	
	/** Reload method. Called automatically when firing with an empty clip */
	public boolean reload(ItemStack gunStack, World world, Entity entity, IInventory inventory, boolean creative, boolean forceReload)
	{	
		//Deployable guns cannot be reloaded in the inventory //If you cannot reload half way through a clip, reject the player for trying to do so
		if(type.deployable || (forceReload && !type.canForceReload)) return false;
		
		//For playing sounds afterwards
		boolean reloadedSomething = false;
		
		//Check each ammo slot, one at a time
		for(int i = 0; i < type.ammoCapacity; i++)
		{
			//Get the stack in the slot
			ShootableType bulletType = GunType.getAmmoAt(gunStack, i);

			//If there is no magazine, if the magazine is empty or if this is a forced reload
			if(bulletType == null || forceReload)
			{
				//Iterate over all inventory slots and find the magazine / bullet item with the most bullets
				int bestSlot = -1;
				int bulletsInBestSlot = 0;
				for (int j = 0; j < inventory.getSizeInventory(); j++)
				{
					ItemStack item = inventory.getStackInSlot(j);
					
					if(type.isValidAmmo(item))
					{
						int bulletsInThisSlot = item.getMaxDamage() - item.getItemDamage();
						if(bulletsInThisSlot > bulletsInBestSlot)
						{
							bestSlot = j;
							bulletsInBestSlot = bulletsInThisSlot;
						}
					}
				}
				//If there was a valid non-empty magazine / bullet item somewhere in the inventory, load it
				if(bestSlot != -1)
				{
					//TODO
					ItemStack newBulletStack = inventory.getStackInSlot(bestSlot);
					//ShootableType newBulletType = ((ItemShootable)newBulletStack.getItem()).type;
					//Unload the old magazine (Drop an item if it is required and the player is not in creative mode)
					if(!creative && bulletType != null && bulletType.getItem() instanceof ItemShootable && ((ItemShootable)bulletType.getItem()).type.dropItemOnReload != null)
						dropItem(world, entity, ((ItemShootable)bulletType.getItem()).type.dropItemOnReload);
					//The magazine was not finished, pull it out and give it back to the player or, failing that, drop it
					if(bulletType != null)
					{
						if(!InventoryHelper.addItemStackToInventory(inventory, new ItemStack(bulletType.item), creative)) //marked here to add something to player's inventory
							entity.entityDropItem(new ItemStack(bulletType.item), 0.5F);
					}

					//Load the new magazine
					ItemStack stackToLoad = newBulletStack.copy();
					stackToLoad.stackSize = 1;
					GunType.setBulletItemStack(gunStack, stackToLoad, i);
					
					//Remove the magazine from the inventory
					if(!creative) newBulletStack.stackSize--;
					if(newBulletStack.stackSize <= 0) newBulletStack = null;
					inventory.setInventorySlotContents(bestSlot, newBulletStack);
					
					//Tell the sound player that we reloaded something
					reloadedSomething = true;
				}
			}
		}
		return reloadedSomething;
	}
	
	/** Method for dropping items on reload and on shoot */
	public static void dropItem(World world, Entity entity, String itemName) //TODO: remove this method
	{
		if(itemName != null)
		{
			int damage = 0;
			if(itemName.contains("."))
			{
				damage = Integer.parseInt(itemName.split("\\.")[1]);
				itemName = itemName.split("\\.")[0];
			}
			ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
			entity.entityDropItem(dropStack, 0.5F);
		}
	}
	
	/** Deployable guns only */
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		if(type.deployable)
		{
	    	//Raytracing
	        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
	        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
	        float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
	        float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
	        double length = 5D;
	        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);
	        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
	        MovingObjectPosition look = world.rayTraceBlocks(posVec, lookVec, true);

	        //Result check
			if (look != null && look.typeOfHit == MovingObjectType.BLOCK)
			{
				if (look.sideHit == 1)
				{
					int playerDir = MathHelper.floor_double(((entityplayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
					int i = look.blockX;
					int j = look.blockY;
					int k = look.blockZ;
					if(!world.isRemote)
					{
						if(world.getBlock(i, j, k) == Blocks.snow)
							j--;
						
						if(isSolid(world, i, j, k)
							&& (world.getBlock(i, j + 1, k) == Blocks.air || world.getBlock(i, j + 1, k) == Blocks.snow)
							&& (world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j + 1, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.air)
							&& (world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.air
							|| world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.snow))
						{
							for(EntityMG mg : EntityMG.mgs)
							{
								if(mg.blockX == i && mg.blockY == j + 1 && mg.blockZ == k && !mg.isDead)
									return itemstack;
							}
							if(!world.isRemote)
								world.spawnEntityInWorld(new EntityMG(world, i, j + 1, k, playerDir, type));
							if(!entityplayer.capabilities.isCreativeMode)
								itemstack.stackSize = 0;
						}
					}
				}
			}
		}
		//Stop the gun bobbing up and down when holding shoot and looking at a block
		if(world.isRemote)
		{
			for(int i = 0; i < 3; ++i)
				FlansModClient.minecraft.entityRenderer.itemRenderer.updateEquippedItem();
		}
		return itemstack;
	}
	
	private boolean isSolid(World world, int i, int j, int k)
	{
		Block block = world.getBlock(i, j, k);
		return block != null && block.getMaterial().isSolid() && block.isOpaqueCube();
	}
	
	//Stop damage being done to entities when scoping etc.
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	{ return type.secondaryFunction != EnumSecondaryFunction.MELEE; }
	
	@Override
	public boolean isFull3D() { return true; }
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		if(type.meleeSound != null)
			PacketPlaySound.sendSoundPacket(entityLiving.posX, entityLiving.posY, entityLiving.posZ, type.meleeSoundRange, entityLiving.dimension, type.meleeSound, true);
		//Do custom melee code here
		if(type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE)
		{
			//Do animation
			if(entityLiving.worldObj.isRemote) FlansModClient.getGunAnimations(entityLiving).doMelee(type.meleeTime);
			//Do custom melee hit detection
			if(entityLiving instanceof EntityPlayer)
			{
				PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityLiving);
				data.doMelee((EntityPlayer)entityLiving, type.meleeTime, type);
			}
		}
		return type.secondaryFunction != EnumSecondaryFunction.MELEE;
	}
	
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player) { return true; }
	
	@Override
	public boolean func_150897_b(Block p_150897_1_) { return false; }
	
	@SubscribeEvent
	public void onBlockBreak(BlockEvent.BreakEvent event)
	{
		EntityPlayer player = event.getPlayer();
		if(player != null && player.capabilities.isCreativeMode)
		{
			ItemStack stack = player.getHeldItem();
			if(stack != null && stack.getItem() instanceof ItemGun) event.setCanceled(true);
		}
	}
	
	@Override
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2)  { return type.colour; }
	
	// ----------------- Paintjobs -----------------
	@Override
	public void getSubItems(Item item, CreativeTabs tabs, List list)
	{
		PaintableType type = ((IPaintableItem)item).getPaintableType();
		if(FlansMod.addAllPaintjobsToCreative)
		{
			for(Paintjob paintjob : type.paintjobs) addPaintjobToList(item, type, paintjob, list);
			return;
		}
		addPaintjobToList(item, type, type.paintjobs[0], list);
	}
	
	private void addPaintjobToList(Item item, PaintableType type, Paintjob paintjob, List list)
	{
		ItemStack paintableStack = new ItemStack(item, 1, paintjob.ID);
		NBTTagCompound tags = new NBTTagCompound();
		paintableStack.setTagCompound(tags);
	    list.add(paintableStack);
	}
    
    // ---------------------------------------------
	@Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon)
    {
        itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    	icons = new IIcon[type.paintjobs.length];
    	for(int i = type.paintjobs.length; --i >= 0; ) icons[i] = icon.registerIcon("FlansMod:" + type.paintjobs[i].iconName);
    	exIcons = new HashMap<Integer, IIcon>();
    	for(Entry<Integer, String> ex : type.exPaintjobs.entrySet()) exIcons.put(ex.getKey(), icon.registerIcon("FlansMod:" + ex.getValue()));
    }
	
    @Override
	@SideOnly(Side.CLIENT)
    public IIcon getIconIndex(ItemStack stack)
    {
    	short dam = (short)stack.getItemDamage();
    	return dam < 0 ? exIcons.get(((ItemPart)getItemById(dam & ModifiableTag.EX_PAINT_MASK)).type.exPaintjobType) : icons[dam];
    }
    
    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) { return 100; }
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack)
	{ return (GunType.getTOF(GunType.getStates(stack), GunTag.RUN_POSE_ON) ? EnumAction.none : type.itemUseAction); }
	
	@Override
	public Multimap getAttributeModifiers(ItemStack stack)
    {
       	Multimap map = super.getAttributeModifiers(stack);
       	if(!GunType.hasStates(stack)) return map;
       	map.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), 
       			new AttributeModifier(field_111210_e, "KnockbackResist", type.knockbackModifier, 0));
       	map.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), 
       			new AttributeModifier(field_111210_e, "MovementSpeed", ((ItemGun)stack.getItem()).type.getMoveSpeed(stack) - 1F, 2));
        if(type.secondaryFunction == EnumSecondaryFunction.MELEE)map.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), 
        		new AttributeModifier(field_111210_e, "Weapon modifier", type.meleeDamage, 0));
       	return map;
    }
    
    private static float roundFloat(float value, int points) { return FlansMod.roundFloat(value, points); }
}