package com.flansmod.common.tools;

import java.util.List;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityParachute extends Entity implements IEntityAdditionalSpawnData
{
	public ToolType type;
	
	public EntityParachute(World w) 
	{
		super(w);
		ignoreFrustumCheck = true;
		System.out.println(w.isRemote ? "Client paraspawn" : "Server paraspawn");
	}
	
	public EntityParachute(World w, ToolType t, EntityPlayer player)
	{
		this(w);
		type = t;

		if(canUseParachute(player))
		{
			player.posY -= 1;
			setPosition(player.posX, player.posY-1.5, player.posZ);
		}
		else
		{
			setDead();
		}
	}
	
	public static boolean canUseParachute(Entity player)
	{
		List list = player.worldObj.getCollidingBoundingBoxes(player, player.boundingBox.expand(0, 3, 0));
		return list.size() == 0;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		if(!worldObj.isRemote && (riddenByEntity == null || riddenByEntity.ridingEntity != this))
		{
			setDead();
		}
		
		if(riddenByEntity != null)
			riddenByEntity.fallDistance = 0F;
		
		motionY = -0.3D;
		
		if(riddenByEntity != null && riddenByEntity instanceof EntityLivingBase)
		{
			float speedMultiplier = 0.025F;
			double moveForwards = ((EntityLivingBase)this.riddenByEntity).moveForward;
			double moveStrafing = ((EntityLivingBase)this.riddenByEntity).moveStrafing;
			double sinYaw = -Math.sin((riddenByEntity.rotationYaw * (float)Math.PI / 180.0F));
			double cosYaw = Math.cos((this.riddenByEntity.rotationYaw * (float)Math.PI / 180.0F));
			motionX += (moveForwards * sinYaw + moveStrafing * cosYaw) * speedMultiplier;
			motionZ += (moveForwards * cosYaw - moveStrafing * sinYaw) * speedMultiplier;
			
			prevRotationYaw = rotationYaw;
			rotationYaw = riddenByEntity.rotationYaw;
		}		
		
		motionX *= 0.93F;
		motionZ *= 0.93F;
		
		moveEntity(motionX, motionY, motionZ);
		
		if(onGround || worldObj.getBlock(MathHelper.floor_double(posX), MathHelper.floor_double(posY), MathHelper.floor_double(posZ)).getMaterial() == Material.water)
		{
			setDead();
		}
	}
	
	@Override
	protected void fall(float par1)
    {
		//Ignore fall damage
    }
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float f)
	{
		setDead();
		return true;
	}
	
	@Override
	protected void entityInit() 
	{
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound tags) 
	{
		type = ToolType.getType(tags.getString("Type"));
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags) 
	{
		tags.setString("Type", type.shortName);
	}

	@Override
    public ItemStack getPickedResult(MovingObjectPosition target)
    {
		ItemStack stack = new ItemStack(type.item, 1, 0);
		return stack;
    }

	@Override
	public void writeSpawnData(ByteBuf buffer) 
	{
		ByteBufUtils.writeUTF8String(buffer, type.shortName);
	}

	@Override
	public void readSpawnData(ByteBuf additionalData) 
	{
		type = ToolType.getType(ByteBufUtils.readUTF8String(additionalData));
	}
}
