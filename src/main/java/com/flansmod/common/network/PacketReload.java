package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

//When the client receives one, it "reloads". Basically to stop client side recoil effects when the gun should be in a reload animation
//When the server receives one, it is interpreted as a forced reload
public class PacketReload extends PacketBase 
{
	public Integer amount = 0;
	public Integer reloadTime = 0;
	
	public PacketReload() {}
	
	public PacketReload(boolean ar) { }
	
	public PacketReload(boolean ar, int count, int reload) 
	{
		amount = count;
		reloadTime = reload;
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeInt(amount);
		data.writeInt(reloadTime);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		amount = data.readInt();
		reloadTime = data.readInt();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
    	PlayerData data = PlayerHandler.getPlayerData(playerEntity);
    	ItemStack gunStack = playerEntity.getCurrentEquippedItem();
		
    	if(data != null && gunStack != null && gunStack.getItem() instanceof ItemGun)
    	{
    		GunType type = ((ItemGun)gunStack.getItem()).type;
			//Check if the gun is empty
			boolean empty = true;
			for(int i = 0; i < type.ammoCapacity; i++)
			{
				ShootableType bulletType = GunType.getAmmoAt(gunStack, i);
				if(bulletType != null)
				{
					empty = false;
					break;
				}
			}
			
			int maxAmmo = type.ammoCapacity;
			boolean singlesReload = maxAmmo > 1;
			int reloadCount;
			
			if(singlesReload)
			{
				reloadCount = 0;
				for(int i = 0; i < type.ammoCapacity; i++)
				{
					ShootableType oldBulletType = GunType.getAmmoAt(gunStack, i);
					if(oldBulletType != null)
						reloadCount += 1;
					else if(oldBulletType == null) reloadCount += 1;
				}
			}
			else
				reloadCount = 1;

    		if(((ItemGun)type.item).reload(gunStack, playerEntity.worldObj, playerEntity, true))
    		{
				float reloadTime = type.getTotalReloadTime();
    			data.shootTimeRight = reloadTime;
    			    			
    			//Set the reload delay
    			data.reloadingRight = true;
				//Send reload packet to induce reload effects client side
				FlansMod.getPacketHandler().sendTo(new PacketReload(false, reloadCount, (int)reloadTime), playerEntity);

				//Play reload sound, empty variant if not null
				String soundToPlay = type.reloadSound;
				if(soundToPlay != null)
					PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, type.reloadSoundRanges[0], playerEntity.dimension, soundToPlay, true);
    		}
    	}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
    	ItemStack stack = clientPlayer.getCurrentEquippedItem();
    	PlayerData data = PlayerHandler.getPlayerData(clientPlayer, Side.CLIENT);
    	if(stack != null && stack.getItem() instanceof ItemGun)
    	{
    		GunType type = ((ItemGun)stack.getItem()).type;
    		FlansModClient.shootTimeRight += type.getTotalReloadTime();
    		
    		//Apply animations
    		GunAnimations animations = FlansModClient.getGunAnimations(clientPlayer);
    		
			//Iterate over all inventory slots and find the magazine / bullet item with the most bullets
			int bestSlot = -1;
			int bulletsInBestSlot = 0;
			for(int j = 0; j < clientPlayer.inventory.getSizeInventory(); j++)
			{
				ItemStack item = clientPlayer.inventory.getStackInSlot(j);
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
			//If there was a valid non-empty magazine / bullet item somewhere in the inventory, take one to put in the gun
			if(bestSlot != -1)
			{
				ItemStack newBulletStack = clientPlayer.inventory.getStackInSlot(bestSlot);
				ShootableType newBulletType = ((ItemShootable)newBulletStack.getItem()).type;
				//Remove the magazine from the inventory
				if(!clientPlayer.capabilities.isCreativeMode)
					newBulletStack.stackSize--;
				if(newBulletStack.stackSize <= 0)
					newBulletStack = null;
				clientPlayer.inventory.setInventorySlotContents(bestSlot, newBulletStack);
			}
    	}
	}
}
