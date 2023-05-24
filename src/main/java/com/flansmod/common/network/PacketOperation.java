package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.OperationQueue.Operation;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.GunType.FireMode;
import com.flansmod.common.guns.GunType.GunOperation;
import com.flansmod.common.guns.GunType.GunTag;
import com.flansmod.common.guns.GunType.Sound;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ModifiableType.ItsType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/** this packet's original name is "PacketGunMode" */
public class PacketOperation extends PacketBase 
{
	public byte operation, reloadingStep;
	
	public PacketOperation() { }
	
	public PacketOperation(byte o) { operation = o; }
	
	public PacketOperation(byte o, byte r)
	{
		operation = o;
		reloadingStep = r;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeByte(operation);
		data.writeByte(reloadingStep);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		operation = data.readByte();
		reloadingStep = data.readByte();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		ItemStack itemStack;
		if(operation == Operation.CHECK_TAG)
		{
			if(reloadingStep < 0 || reloadingStep >= playerEntity.inventory.getSizeInventory())
			{
				//TODO:
				FlansMod.log("invalid slot num on handle " + Operation.CHECK_TAG + " from player <" + playerEntity.getDisplayName());
				return;
			}
			if((itemStack = playerEntity.inventory.getStackInSlot(reloadingStep)) != null && itemStack.getItem() instanceof ItemGun) GunType.checkForTags(itemStack);
			else ; //TODO:
			return;
		}
		if(operation == Operation.SWITCH_MASK) //if requested to turn on/off NV or put on/off mask, do it and return
		{
			if((itemStack = playerEntity.inventory.armorInventory[3]) != null && itemStack.getItem() instanceof com.flansmod.common.teams.ItemTeamArmour)
			{
				com.flansmod.common.teams.ArmourType armorType = ((com.flansmod.common.teams.ItemTeamArmour)itemStack.getItem()).type;
				if(armorType.nightVision >= 0F || armorType.hasMask)
				{
					boolean nextState = !armorType.getMask(itemStack);
					armorType.setMask(itemStack, nextState);
					//play sound
					PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, armorType.maskSwitchSoundRange, playerEntity.dimension, armorType.maskSwitchSound[nextState ? 0 : 1], true, false);
					return;
				}
				FlansMod.log("Player " + playerEntity.getDisplayName() + " Has Request to Switch NV or Mask with His Helmet Having No Such Function");
				return;
			}
			FlansMod.log("Player " + playerEntity.getDisplayName() + " Has Request to Switch NV or Mask With " + (itemStack == null ? "No Helmet Equipped" : "Helmet Equipped Not Being ItemTeamArmour"));
			return;
		}
		/*PlayerData pData = PlayerHandler.getPlayerData(playerEntity); //so far no requirement on off hand operation
		if(operation < 0 && pData.offHandGunSlot >= 0)
		{
			itemStack = playerEntity.inventory.getStackInSlot(pData.offHandGunSlot);
			operation = (byte)-operation;
		}*/
		if((itemStack = playerEntity.inventory.getCurrentItem()) == null || !(itemStack.getItem() instanceof ItemGun))
		{
			//TODO:
			return;
		}
		GunType type = ((ItemGun)itemStack.getItem()).type;
		if(type.itsType == ItsType.MAG)
		{
			switch(operation) //for mag operations
			{
				case Operation.PUSH_BULLET:
					if(type.pushBulletIntoMag(itemStack, playerEntity.inventory, playerEntity.capabilities.isCreativeMode))
					{
						if(type.reloadSounds.length > 0) PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, 
								type.reloadSoundRanges[0], playerEntity.dimension, type.reloadSounds[0], type.distortSound);
						GunType.setTOFOff(GunType.getStates(itemStack), GunTag.MAG_USED_OFF);
					}
					break;
				case Operation.PULL_BULLET:
					if(type.pullBulletOutOfMag(itemStack, playerEntity, playerEntity.inventory) && type.reloadSounds.length > 1)
						PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, type.reloadSoundRanges[1], 
								playerEntity.dimension, type.reloadSounds[1], type.distortSound);
					break;
				case Operation.SET_MAG_USED: GunType.setTOFOn(GunType.getStates(itemStack), GunTag.MAG_USED_ON); break;
				case Operation.SET_MAG_UNUSED: GunType.setTOFOff(GunType.getStates(itemStack), GunTag.MAG_USED_OFF); break;
				default: ; //TODO: 
			}
			return;
		}
		switch(operation) //for gun operations
		{
			case Operation.UNLOAD_MAG: type.pullMagOut(itemStack, playerEntity, playerEntity.inventory); break;
			case Operation.LOAD_MAG:
			case Operation.ADVANCED_LOAD_MAG:
				type.loadNewMag(itemStack, playerEntity.inventory, operation == Operation.ADVANCED_LOAD_MAG);
				break;
			case Operation.CHARGE_GUN: type.doCharge(itemStack, playerEntity); break;
			case Operation.RELEASE_BOLT: type.releaseSlide(itemStack); break;
			case Operation.SWITCH_FIREMODE:
				int[] states = GunType.getStates(itemStack);
				byte nextMode = (byte)((GunType.getFireModeNum(states) + 1) % type.fireMode.length);
				GunType.setFireMode(states, nextMode);
				if(type.modeSwitchSound != null) PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, type.modeSwitchSoundRange, 
						playerEntity.dimension, type.modeSwitchSound, type.distortSound);
				FlansMod.getPacketHandler().sendTo(new PacketOperation(type.fireMode[nextMode]), playerEntity);
				break;
			case Operation.SWITCH_UNDERBARREL: break; //TODO:
			case Operation.RELOAD_SOUND:
				if(reloadingStep < type.reloadSounds.length) PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, 
							type.reloadSoundRanges[reloadingStep % type.reloadSoundRanges.length], playerEntity.dimension, type.reloadSounds[reloadingStep], type.distortSound);
				break;
			case Operation.EMPTY_CLICK_SOUND:
			case Operation.SAFE_EMPTY_CLICK_SOUND:
				PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, type.emptyClickSoundRange, 
						playerEntity.dimension, operation == Operation.EMPTY_CLICK_SOUND ? type.emptyClickSound : type.safeEmptyClickSound, type.distortSound);
				break;
			case Operation.CHARGE_GUN_SOUND:
				NBTTagCompound magTag = GunType.getMagTag(itemStack);
				GunType magType = GunType.getMagType(itemStack);
				if(GunType.getTOF(GunType.getStates(itemStack), GunTag.BOLT_CATCH_ON))
				{
					reloadingStep = magType != null && type.releaseSlideTime != -1 && magType.releaseSlideTime != -1 && GunType.emptyMag(GunType.getMagNBTTag(magTag)) 
							? Sound.CHARGE_KEEP_LOCK : Sound.CHARGE_RELEASE;
				}
				else
				{
					if(magType != null && type.releaseSlideTime != -1 && magType.releaseSlideTime != -1 && GunType.emptyMag(GunType.getMagNBTTag(magTag)))
						reloadingStep = GunType.emptyMag(itemStack.stackTagCompound) ? Sound.EMPTY_CHARGE_LOCK : Sound.CHARGE_LOCK;
					else reloadingStep = GunType.emptyMag(itemStack.stackTagCompound) ? Sound.EMPTY_CHARGE : Sound.CHARGE;
				}
				if(type.chargeSound[reloadingStep] != null) PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, 
						type.chargeSoundR[reloadingStep], playerEntity.dimension, type.chargeSound[reloadingStep], type.distortSound);
				break;
			case Operation.RELEASE_BOLT_SOUND:
				if(GunType.getTOF(GunType.getStates(itemStack), GunTag.BOLT_CATCH_ON))
				{
					if(type.releaseBoltSound[Sound.RELEASE_BOLT] != null) PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, 
							type.releaseBoltSoundR[Sound.RELEASE_BOLT], playerEntity.dimension, type.releaseBoltSound[Sound.RELEASE_BOLT], type.distortSound);
				}
				else if(type.releaseBoltSound[Sound.PRESS_RELEASE_BUTTON] != null)
					PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, type.releaseBoltSoundR[Sound.PRESS_RELEASE_BUTTON], 
						playerEntity.dimension, type.releaseBoltSound[Sound.PRESS_RELEASE_BUTTON], type.distortSound);
				break;
			case Operation.CHECK_AMMO_SOUND:
				if(reloadingStep >= 0 && reloadingStep < type.checkAmmoSound.length && type.checkAmmoSound[reloadingStep] != null)
					PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, 
							type.checkAmmoSoundR, playerEntity.dimension, type.checkAmmoSound[reloadingStep], type.distortSound);
				else ; //TODO:
				break;
			case Operation.CHECK_CHAMBER_SOUND:
				if(reloadingStep >= 0 && reloadingStep < type.checkChamberSound.length && type.checkChamberSound[reloadingStep] != null)
					PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, 
							type.checkChamberSoundR, playerEntity.dimension, type.checkChamberSound[reloadingStep], type.distortSound);
				else ; //TODO:
				break;
			default: ; //TODO: 
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		if(operation != GunOperation.CHARGE_DELAY)
		{
			ItemStack gunStack = clientPlayer.getCurrentEquippedItem();
			if(gunStack != null && gunStack.getItem() instanceof ItemGun)
				FlansModClient.tellPlayer(FireMode.getFireModeString(operation, ((ItemGun)gunStack.getItem()).type.itsType), 1);
		}
		else FlansModClient.operationToDo = operation;
	}
}
