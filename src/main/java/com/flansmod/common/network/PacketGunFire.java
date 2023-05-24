package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ModifiableType.ItsType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class PacketGunFire extends PacketBase 
{
	public boolean isAiming;
	public boolean secFire;
	public float shootTime;
	public boolean onLastBullet;
	public int flashNum;
	public float flashVanishConst, flashRotate;
	private float x, y, z, roty, rotz;
	
	public PacketGunFire() {}
	
	//to server side to actually shoot bullet out
	public PacketGunFire(int stf, boolean ia, boolean sf, float x1, float y1, float z1, float yaw, float pitch)
	{
		//here uses the flashNum to record the slot id of the gun that our player is firing
		flashNum = stf;
		isAiming = ia;
		secFire = sf;
		x = x1;
		y = y1;
		z = z1;
		roty = yaw;
		rotz = pitch;
	}
	
	//to client side to apply animations
	public PacketGunFire(boolean pls, boolean sf, float fvc, int fn, float fr)
	{
		isAiming = pls;
		secFire = sf;
		flashVanishConst = fvc;
		flashNum = fn;
		flashRotate = fr;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(isAiming);
		data.writeBoolean(secFire);
		data.writeInt(flashNum);
		data.writeFloat(flashVanishConst);
		data.writeFloat(flashRotate);
		data.writeFloat(x);
		data.writeFloat(y);
		data.writeFloat(z);
		data.writeFloat(roty);
		data.writeFloat(rotz);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		isAiming = data.readBoolean();
		secFire = data.readBoolean();
		flashNum = data.readInt();
		flashVanishConst = data.readFloat();
		flashRotate = data.readFloat();
		x = data.readFloat();
		y = data.readFloat();
		z = data.readFloat();
		roty = data.readFloat();
		rotz = data.readFloat();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		ItemStack currentItem = playerEntity.inventory.getStackInSlot(flashNum);
		PlayerData data = PlayerHandler.getPlayerData(playerEntity);
		//check if we are holding a gun //we don't shoot a mag
		if(currentItem != null && currentItem.getItem() instanceof ItemGun)
		{
			GunType gunType = ((ItemGun)currentItem.getItem()).type;
			if(gunType.itsType == ItsType.MAG)
			{
				FlansMod.record(playerEntity.getPlayerIP(), playerEntity.getDisplayName(), "try shoot a mag");
				return;
			}
			if(secFire) ((ItemGun)currentItem.getItem()).trySecShoot(currentItem, playerEntity.worldObj, playerEntity, isAiming, x, y, z, roty, rotz);
			else gunType.tryShoot(currentItem, playerEntity.worldObj, playerEntity, isAiming, x, y, z, roty, rotz);
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
    		FlansModClient.getGunAnimations(clientPlayer).doShoot(type, stack, isAiming, flashVanishConst, flashNum, flashRotate); //animations
			FlansModClient.playerRecoilPitch += FlansModClient.staticRecoilPitch; //recoil on player's view
			FlansModClient.playerRecoilYaw += FlansModClient.staticRecoilYaw;
		}
	}
}
