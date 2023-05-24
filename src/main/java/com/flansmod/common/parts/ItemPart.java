package com.flansmod.common.parts;

import java.util.List;

import com.flansmod.client.KeyInputHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPart extends Item implements IFlanItem
{
	public PartType type;
	
	public ItemPart(PartType t)
	{
		super();
		(type = t).item = this;
		setMaxStackSize(t.stackSize);
		if(t.category == 9)
		{
			setMaxDamage(t.fuel);
			setHasSubtypes(true);
		}
		setTextureName("FlansMod:" + t.iconPath);
		setCreativeTab(FlansMod.tabFlanParts);
		GameRegistry.registerItem(this, t.shortName, FlansMod.MODID);
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{ if(type.category == 9) par3List.add("Fuel Stored: " + (type.fuel - par1ItemStack.getItemDamage()) + " / " + type.fuel); }
	
	@SideOnly(Side.CLIENT)
	public static float progress, lastProgress;
	@Override
	@SideOnly(Side.CLIENT)
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean flag)
	{
		if(entity instanceof EntityPlayer || ((EntityPlayer)entity).inventory.getCurrentItem() == itemStack)
		{
			lastProgress = progress;
			if(KeyInputHandler.aimKeyDown())
			{ if(progress < 1F && (progress += type.progress) > 1F) progress = 1F; }
			else lastProgress = progress = 0F;
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2) { return type.colour; }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon) { itemIcon = icon.registerIcon("FlansMod:" + type.iconPath); }
	
	@Override
	public InfoType getInfoType() { return type; }
}