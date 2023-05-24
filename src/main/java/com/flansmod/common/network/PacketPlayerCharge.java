package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketPlayerCharge extends PacketBase 
{
	private int playerID;
	//means charge when this value is oppsitive, means release slide when this value is negetive
	private float value;
	private float[] slideAcceleration;
	private boolean preLockSlide;
	
	public PacketPlayerCharge() { }
	
	public PacketPlayerCharge(int pID, float v, float[] sa, boolean pls)
	{
		playerID = pID;
		value = v;
		slideAcceleration = sa;
		preLockSlide = pls;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeInt(playerID);
		data.writeFloat(value);
		if(value >= -1F && value <= 0F)
		{
			data.writeFloat(slideAcceleration[0]);
			data.writeFloat(slideAcceleration[1]);
		}
		data.writeBoolean(preLockSlide);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		playerID = data.readInt();
		value = data.readFloat();
		if(value >= -1F && value <= 0F)
			slideAcceleration = new float[] { data.readFloat(), data.readFloat() };
		preLockSlide = data.readBoolean();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		//distribute player charge packet to all players around
		FlansMod.getPacketHandler().sendToAllAround(new PacketPlayerCharge(playerID, value, slideAcceleration, preLockSlide), 
				playerEntity.posX, playerEntity.posY, playerEntity.posZ, FlansMod.chargeAnimationRange, playerEntity.dimension);
	}
	
	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		Entity entity = clientPlayer.worldObj.getEntityByID(playerID);
		//make sure it is a player first
		if(entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)entity;
			GunAnimations animations = FlansModClient.getGunAnimations(player);
			//help to set preLockSlideTime for charge animation
			if(value == 1F) animations.preLockSlideTime = preLockSlide ? FlansMod.preLockSlideTime : -FlansMod.preLockSlideTime;
			else if(value > 0F) animations.doCharge((int)value);
			else if(value < -1F) animations.checkChamber(-(int)value);
			else if(entity != clientPlayer) //if it is player himself, not release slide for him for his client will handle this
			{
				animations.preLockSlideTime = -FlansMod.preLockSlideTime;
				animations.doSlideRelease(-value, slideAcceleration);
			}
		}
	}
}
