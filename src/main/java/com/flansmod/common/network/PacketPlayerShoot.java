package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
//import net.minecraft.item.ItemStack;
//import cpw.mods.fml.common.network.ByteBufUtils;

public class PacketPlayerShoot extends PacketBase 
{
	public int playerID;
	public boolean preLockSlide, secFire;
	public int flashNum;
	public float flashVanishConst, flashRotate;
	public float[] slideAccelerationIn, slideAccelerationOut = new float[2];
	
	public PacketPlayerShoot() {}
	
	public PacketPlayerShoot(int pi, boolean pls, boolean sf, float[] sa, float fvc, int fn, float fr)
	{
		preLockSlide = pls;
		playerID = pi;
		secFire = sf;
		slideAccelerationIn = sa;
		flashVanishConst = fvc;
		flashNum = fn;
		flashRotate = fr;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(preLockSlide);
		data.writeInt(playerID);
		data.writeBoolean(secFire);
		data.writeFloat(slideAccelerationIn[0]);
		data.writeFloat(slideAccelerationIn[1]);
		data.writeFloat(flashVanishConst);
		data.writeInt(flashNum);
		data.writeFloat(flashRotate);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		preLockSlide = data.readBoolean();
		playerID = data.readInt();
		secFire = data.readBoolean();
		slideAccelerationOut[0] = data.readFloat();
		slideAccelerationOut[1] = data.readFloat();
		flashVanishConst = data.readFloat();
		flashNum = data.readInt();
		flashRotate = data.readFloat();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) { FlansMod.log("Received player shoot packet on server. Skipping. Did you mean to send a PacketPlayerShoot?"); }
	
	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		Entity entity = clientPlayer.worldObj.getEntityByID(playerID);
		//make sure it is not the player who did the shoot himself
		if(entity instanceof EntityPlayer && entity != clientPlayer) FlansModClient.getGunAnimations((EntityPlayer)entity)
				.doShoot(preLockSlide, slideAccelerationOut, flashVanishConst, flashNum, flashRotate);
	}
}
