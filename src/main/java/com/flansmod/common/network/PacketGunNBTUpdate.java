package com.flansmod.common.network;

import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.GunType.GunTag;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketGunNBTUpdate extends PacketBase
{
	private byte operation;
	
	public class NBTUpdateOperation
	{
		public static final byte AIM_TRUE = 1, AIM_FALSE = (byte)((1 << 7) + 1), 
				POSE_TRUE = 2, POSE_FALSE = (byte)((1 << 7) + 2);
	}
	
	public PacketGunNBTUpdate() { }
	
	public PacketGunNBTUpdate(byte o) { operation = o; }
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{ data.writeByte(operation); }
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{ operation = data.readByte(); }
	
	@Override
	public void handleServerSide(net.minecraft.entity.player.EntityPlayerMP player)
	{
		net.minecraft.item.ItemStack stack = player.inventory.getCurrentItem();
		if(stack != null && stack.getItem() instanceof com.flansmod.common.guns.ItemGun)
		{
			int[] states = GunType.getStates(stack);
			if((operation & NBTUpdateOperation.AIM_TRUE) == NBTUpdateOperation.AIM_TRUE)
			{
				if(operation > 0) GunType.setTOFOn(states, GunTag.AIM_ON);
				else GunType.setTOFOff(states, GunTag.AIM_OFF);
			}
			else
			{
				if(operation > 0) GunType.setTOFOn(states, GunTag.RUN_POSE_ON);
				else GunType.setTOFOff(states, GunTag.RUN_POSE_OFF);
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void handleClientSide(net.minecraft.entity.player.EntityPlayer clientPlayer) { }
}