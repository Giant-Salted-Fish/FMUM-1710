package com.flansmod.common.guns;

import java.util.Collections;
import java.util.List;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

/** Implemented from old source. */
public class ItemBullet extends ItemShootable implements IFlanItem
{
	public BulletType type;
	
	public ItemBullet(BulletType infoType)
	{
		super(infoType);
		type = infoType;
		setMaxStackSize(type.maxStackSize);
		setHasSubtypes(true);
		type.item = this;
		switch(type.weaponType)
		{
			case SHELL : case BOMB : case MINE : case MISSILE : setCreativeTab(FlansMod.tabFlanDriveables); break;
			default : setCreativeTab(FlansMod.tabFlanGuns);
		}
	}

	public boolean isRepairable() { return canRepair; }

    @SideOnly(Side.CLIENT)
    @Override
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) { return type.colour; }
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) { itemIcon = icon.registerIcon("FlansMod:" + type.iconPath); }
    
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		if(!type.packName.isEmpty())
			lines.add(type.packName);
		if(type.description != null)
            Collections.addAll(lines, type.description.split("_"));
		if(type.maxPenetrationLevel > 0F || type.minPenetrationLevel > 0F)
			lines.add("\u00a79Penetration Level" + "\u00a77: " + type.maxPenetrationLevel + " - " + type.minPenetrationLevel);
		if(type.armorBreakPower > 0F)
			lines.add("\u00a79Armor Break Power" + "\u00a77: " + type.armorBreakPower);
	}

	//Can be overriden to allow new types of bullets to be created, for planes
	public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw, 
			float pitch, double motionX, double motionY, double motionZ, 
			EntityLivingBase shooter,float gunDamage, int itemDamage, InfoType shotFrom) 
	{ return new EntityBullet(worldObj, origin, yaw, pitch, motionX, motionY, motionZ, shooter, gunDamage, this.type, shotFrom); }

	//Can be overriden to allow new types of bullets to be created, vector constructor
	public EntityShootable getEntity(World worldObj, Vector3f origin, Vector3f direction,
			EntityLivingBase shooter, float spread, float damage, float speed, int itemDamage, InfoType shotFrom)
	{ return new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom); }

	//Can be overriden to allow new types of bullets to be created, AA/MG constructor
	public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw, 
			float pitch, EntityLivingBase shooter, float spread, float damage, 
			int itemDamage, InfoType shotFrom) 
	{ return new EntityBullet(worldObj, origin, yaw, pitch, shooter, spread, damage, this.type, shotFrom); }

	//Can be overriden to allow new types of bullets to be created, Handheld constructor //used in ItemGun
	public EntityShootable getEntity(World worldObj, EntityLivingBase player, 
			float bulletSpread, float damage, float bulletSpeed, int itemDamage, InfoType shotFrom)
	{ return new EntityBullet(worldObj, player, bulletSpread, damage, this.type, bulletSpeed, shotFrom); }
	
	public EntityShootable getEntity(World worldObj, EntityLivingBase player, float bulletSpread, float damage, float bulletSpeed, 
									 InfoType shotFrom, float x, float y, float z, float roty, float rotz)
	{ return new EntityBullet(worldObj, player, bulletSpread, damage, this.type, bulletSpeed, shotFrom, x, y, z, roty, rotz); }
	
	@Override
	public InfoType getInfoType() { return type; }
}