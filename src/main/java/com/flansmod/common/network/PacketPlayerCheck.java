package com.flansmod.common.network;

import java.util.ArrayList;
import java.util.List;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.tools.ToolType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class PacketPlayerCheck extends PacketBase 
{
	private static final String thisUUID = "U" + "UI" + "D: " + "Offi" + "ci" + "al v" + "202" + "1-7-" + "17";
	private int handle;
	
	public PacketPlayerCheck() {}
	
	public PacketPlayerCheck(int aHandle) { handle = aHandle; }
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) { data.writeInt(handle); }
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) { handle = data.readInt(); }
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{	//we are requested to drop extract things that a player is carrying
		if(handle == 1)
		{
			float weightCapacity = FlansMod.weightCapacity, volumeCapacity = FlansMod.volumeCapacity, totalWeightUsed = 0F, totalVolumeUsed = 0F;
			//traverse the inventory for twice, first time we try to get total capacity we have
			for(int i = 0; i < playerEntity.inventory.getSizeInventory(); i++)
			{
				ItemStack item = playerEntity.inventory.getStackInSlot(i);
				List<Integer> bagTypesPlayEquipped = new ArrayList<Integer>();
				if(item != null && item.getItem() instanceof ItemTool)
				{
					ToolType toolType = ((ItemTool)item.getItem()).type;
					//item tool can be a bag. if it is one, add up volumeCapacity and weightCapacity
					if(toolType.bagType != -1)
					{
						boolean notTheSameType = true;
						for(int j = 0; j < bagTypesPlayEquipped.size(); j++)
						{
							if(toolType.bagType == bagTypesPlayEquipped.get(j))
							{
								notTheSameType = false;
								break;
							}
						}
						if(notTheSameType)
						{
							weightCapacity += toolType.bagWeightCapacity;
							volumeCapacity += toolType.bagVolumeCapacity;
							bagTypesPlayEquipped.add(toolType.bagType);
						}
					}
				}
			}
			//second time we calculate the total weight and volume used, one it is over the capacity, drop the things
			for(int i = 0; i < playerEntity.inventory.getSizeInventory(); ++i)
			{
				ItemStack item = playerEntity.inventory.getStackInSlot(i);
				if(item != null)
				{
					if(item.getItem() instanceof ItemGun)
					{
						GunType gunType = ((ItemGun)item.getItem()).type;
						float totalWiehgt = gunType.itsWeight, totalVolume = gunType.itsVolume;
						//if there is some bullet in gun or mag, we count them in weight
						ItemStack magStack;
						ShootableType bulletType;
						for(int j = 0; j < gunType.ammoCapacity; ++j)
						{
							if((bulletType = GunType.getAmmoAt(item, j)) == null) break;
							totalWiehgt += bulletType.itsWeight;
						}
						//if there is a mag, count mag and the bullets in mag
						magStack = GunType.getMagStack(item, null);
						if(magStack != null)
						{
							GunType magType = ((ItemGun)magStack.getItem()).type;
							totalWiehgt += magType.itsWeight;
							totalVolume += magType.magVolume;
							//count bullets in mag
							for(int j = 0; j < magType.ammoCapacity; j++)
							{
								if((bulletType = GunType.getAmmoAt(magStack, j)) != null)
									totalWiehgt += bulletType.itsWeight;
							}
						}
						//if there is any attachment, also count it in weight, count it in volume of attached
						/** TODO
						for(AttachmentType attachment : gunType.getCurrentAttachments(item))
						{
							totalWiehgt += attachment.itsWeight;
							totalVolume += attachment.volumeWhenAttached;
						}*/
						//after counting all of these, we check if we finally is capable to carry this gun/mag. if not, drop it!
						if(totalWeightUsed + totalWiehgt > weightCapacity || totalVolumeUsed + totalVolume > volumeCapacity)
						{
							playerEntity.inventory.setInventorySlotContents(i, null);
							(playerEntity.entityDropItem(item, 0.5F)).delayBeforeCanPickup = gunType.pickUpDelay;
						}
						else //we can carry it, add on the weight and volume used
						{
							totalWeightUsed += totalWiehgt;
							totalVolumeUsed += totalVolume;
						}
					}
					else if(item.getItem() instanceof ItemAttachment)
					{
						totalWeightUsed += ((ItemAttachment)item.getItem()).type.itsWeight;
						totalVolumeUsed += ((ItemAttachment)item.getItem()).type.itsVolume;
						if(totalWeightUsed > weightCapacity || totalVolumeUsed > volumeCapacity)
						{
							playerEntity.inventory.setInventorySlotContents(i, null);
							(playerEntity.entityDropItem(item, 0.5F)).delayBeforeCanPickup = ((ItemAttachment)item.getItem()).type.pickUpDelay;
							totalWeightUsed -= ((ItemAttachment)item.getItem()).type.itsWeight;
							totalVolumeUsed -= ((ItemAttachment)item.getItem()).type.itsVolume;
						}
					}
					else if(item.getItem() instanceof ItemShootable)
					{
						float weightToAdd = ((ItemShootable)item.getItem()).type.itsWeight, volumeToAdd = ((ItemShootable)item.getItem()).type.itsVolume;
						for(int j = 0; j < item.stackSize; j++)
						{
							totalWeightUsed += weightToAdd;
							totalVolumeUsed += volumeToAdd;
							//if here we reached the amount that we can carry, drop the rest
							if(totalWeightUsed > weightCapacity || totalVolumeUsed > volumeCapacity)
							{
								ItemStack stackToDrop = item.copy();
								stackToDrop.stackSize = item.stackSize - j;
								(playerEntity.entityDropItem(stackToDrop, 0.5F)).delayBeforeCanPickup = ((ItemShootable)item.getItem()).type.pickUpDelay;
								if(j == 0) item = null;
								else item.stackSize = j;
								playerEntity.inventory.setInventorySlotContents(i, item);
								totalWeightUsed -= weightToAdd;
								totalVolumeUsed -= volumeToAdd;
								break;
							}
						}
					}
					else if(item.getItem() instanceof ItemPart)
					{
						float weightToAdd = ((ItemPart)item.getItem()).type.itsWeight, volumeToAdd = ((ItemPart)item.getItem()).type.itsVolume;
						for(int j = 0; j < item.stackSize; j++)
						{
							totalWeightUsed += weightToAdd;
							totalVolumeUsed += volumeToAdd;
							if(totalWeightUsed > weightCapacity || totalVolumeUsed > volumeCapacity)
							{
								ItemStack stackToDrop = item.copy();
								stackToDrop.stackSize = item.stackSize - j;
								(playerEntity.entityDropItem(stackToDrop, 0.5F)).delayBeforeCanPickup = ((ItemPart)item.getItem()).type.pickUpDelay;
								if(j == 0) item = null;
								else item.stackSize = j;
								playerEntity.inventory.setInventorySlotContents(i, item);
								totalWeightUsed -= weightToAdd;
								totalVolumeUsed -= volumeToAdd;
								break;
							}
						}
					}
					else if(item.getItem() instanceof ItemTool)
					{
						totalWeightUsed += ((ItemTool)item.getItem()).type.itsWeight;
						totalVolumeUsed += ((ItemTool)item.getItem()).type.itsVolume;
						if(totalWeightUsed > weightCapacity || totalVolumeUsed > volumeCapacity)
						{
							playerEntity.inventory.setInventorySlotContents(i, null);
							(playerEntity.entityDropItem(item, 0.5F)).delayBeforeCanPickup = ((ItemTool)item.getItem()).type.pickUpDelay;
							totalWeightUsed -= ((ItemTool)item.getItem()).type.itsWeight;
							totalVolumeUsed -= ((ItemTool)item.getItem()).type.itsVolume;
						}
					}
				}
			}
		}
		//handle cheat test //third person //write the name of the player who trying to do this in server side log
		else if(handle == 16) FlansMod.log(playerEntity.getDisplayName() + " Has Tried to Use Third Person View");
		//hide GUI
		else if(handle == 17) FlansMod.log(playerEntity.getDisplayName() + " Has Tried to Hide GUI");
		//f3+B
		else if(handle == 18) FlansMod.log(playerEntity.getDisplayName() + " Has Tried to Show HitBox");
		//gamma setting
		else if(handle == 19) FlansMod.log(playerEntity.getDisplayName() + " Has Tried to Change Gamma Setting");
		else if(handle == 256) playerEntity.addChatMessage(new net.minecraft.util.ChatComponentText(thisUUID));
		else FlansMod.log(playerEntity.getDisplayName() + " Has Sent PacketPlayerCheck with Unexpected Handle: " + handle);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) { }
}
