package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketModConfig extends PacketBase 
{
	public PacketModConfig() { }
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(FlansMod.hitCrossHairEnable);
		data.writeBoolean(FlansMod.crosshairEnable);
		data.writeBoolean(FlansMod.allowHideGUI);
		data.writeBoolean(FlansMod.allowThirdPersonView);
		data.writeBoolean(FlansMod.allowShowHitBox);
		data.writeFloat(FlansMod.forceGammaSetting);
		data.writeFloat(FlansMod.isAimPhase);
		data.writeFloat(FlansMod.weightCapacity);
		data.writeFloat(FlansMod.volumeCapacity);
		data.writeFloat(FlansMod.decreaseRecoilPitch);
		data.writeFloat(FlansMod.decreaseRecoilYaw);
		data.writeFloat(FlansMod.decreaseRecoilShake);
		data.writeInt(FlansMod.maxLayers);
		data.writeInt(FlansMod.maxAttachments);
		data.writeFloat(FlansMod.maxDelayToRecoverStamina);
		data.writeFloat(FlansMod.minDelayToRecoverStamina);
		data.writeFloat(FlansMod.recoverStaminaDelay);
		data.writeFloat(FlansMod.breathRecoverStaminaDelay);
		data.writeFloat(FlansMod.minAirWhenMove);
		data.writeFloat(FlansMod.canBreathAir);
		data.writeFloat(FlansMod.staminaRecoverAmount);
		data.writeFloat(FlansMod.walkStaminaRecoverAmount);
		data.writeFloat(FlansMod.airRecoverAmount);
		data.writeFloat(FlansMod.walkAirRecoverAmount);
		data.writeFloat(FlansMod.breathAirDrop);
		data.writeFloat(FlansMod.breathStaminaDrop);
		data.writeFloat(FlansMod.sprintStaminaDrop);
		data.writeFloat(FlansMod.jumpStaminaDrop);
		data.writeFloat(FlansMod.walkJumpStaminaDrop);
		data.writeFloat(FlansMod.sprintJumpStaminaDrop);
		data.writeFloat(FlansMod.jumpRecoverStaminaDelay);
		data.writeFloat(FlansMod.walkJumpRecoverStaminaDelay);
		data.writeFloat(FlansMod.sprintJumpRecoverStaminaDelay);
		data.writeFloat(FlansMod.sprintAirDrop);
		data.writeFloat(FlansMod.jumpAirDrop);
		data.writeFloat(FlansMod.walkJumpAirDrop);
		data.writeFloat(FlansMod.sprintJumpAirDrop);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		FlansMod.hitCrossHairEnable = data.readBoolean();
		FlansMod.crosshairEnable = data.readBoolean();
		FlansMod.allowHideGUI = data.readBoolean();
		FlansMod.allowThirdPersonView = data.readBoolean();
		FlansMod.allowShowHitBox = data.readBoolean();
		FlansMod.forceGammaSetting = data.readFloat();
		FlansMod.isAimPhase = data.readFloat();
		FlansMod.weightCapacity = data.readFloat();
		FlansMod.volumeCapacity = data.readFloat();
		FlansMod.decreaseRecoilPitch = data.readFloat();
		FlansMod.decreaseRecoilYaw = data.readFloat();
		FlansMod.decreaseRecoilShake = data.readFloat();
		FlansMod.maxLayers = data.readInt();
		FlansMod.maxAttachments = data.readInt();
		FlansMod.maxDelayToRecoverStamina = data.readFloat();
		FlansMod.minDelayToRecoverStamina = data.readFloat();
		FlansMod.recoverStaminaDelay = data.readFloat();
		FlansMod.breathRecoverStaminaDelay = data.readFloat();
		FlansMod.minAirWhenMove = data.readFloat();
		FlansMod.canBreathAir = data.readFloat();
		FlansMod.staminaRecoverAmount = data.readFloat();
		FlansMod.walkStaminaRecoverAmount = data.readFloat();
		FlansMod.airRecoverAmount = data.readFloat();
		FlansMod.walkAirRecoverAmount = data.readFloat();
		FlansMod.breathAirDrop = data.readFloat();
		FlansMod.breathStaminaDrop = data.readFloat();
		FlansMod.sprintStaminaDrop = data.readFloat();
		FlansMod.jumpStaminaDrop = data.readFloat();
		FlansMod.walkJumpStaminaDrop = data.readFloat();
		FlansMod.sprintJumpStaminaDrop = data.readFloat();
		FlansMod.jumpRecoverStaminaDelay = data.readFloat();
		FlansMod.walkJumpRecoverStaminaDelay = data.readFloat();
		FlansMod.sprintJumpRecoverStaminaDelay = data.readFloat();
		FlansMod.sprintAirDrop = data.readFloat();
		FlansMod.jumpAirDrop = data.readFloat();
		FlansMod.walkJumpAirDrop = data.readFloat();
		FlansMod.sprintJumpAirDrop = data.readFloat();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) { }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{	// help to initialize values in RenderGun
		RenderGun.currentAt = new byte[(FlansMod.maxLayers << 1) + 1];
		FlansModClient.modifying = new byte[RenderGun.currentAt.length + 1];
		RenderGun.leftHandAt = new byte[FlansModClient.modifying.length];
		RenderGun.rightHandAt = new byte[RenderGun.leftHandAt.length];
		FlansMod.log("Config synced successfully");
	}
}
