package com.flansmod.common.guns;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ModifiableType.ItsType;
import com.flansmod.common.guns.ModifiableType.ModifiableTag;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.types.InfoType;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;

public class ItemAttachment extends Item implements IPaintableItem
{
	public AttachmentType type;
	
	public IIcon[] icons;
	public HashMap<Integer, IIcon> exIcons;
	
	public ItemAttachment(AttachmentType t) 
	{
		type = t;
		type.item = this;
		maxStackSize = 1;
		setCreativeTab(FlansMod.tabFlanGuns);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2) { return type.colour; }
	    
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon)
	{
	    itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
		icons = new IIcon[type.paintjobs.length];
    	for(int i = type.paintjobs.length; --i >= 0; ) icons[i] = icon.registerIcon("FlansMod:" + type.paintjobs[i].iconName);
    	exIcons = new HashMap<Integer, IIcon>();
    	for(Entry<Integer, String> ex : type.exPaintjobs.entrySet()) exIcons.put(ex.getKey(), icon.registerIcon("FlansMod:" + ex.getValue()));
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconIndex(ItemStack stack)
	{
		short dam = (short)stack.getItemDamage();
		return dam < 0 ? exIcons.get(((ItemPart)getItemById(dam & ModifiableTag.EX_PAINT_MASK)).type.exPaintjobType) : icons[dam];
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		KeyBinding shift = Minecraft.getMinecraft().gameSettings.keyBindSneak;

		if(!type.packName.isEmpty()) lines.add("\u00a7o" + type.packName);
		if(type.description != null) Collections.addAll(lines, type.description.split("_"));
		//Reveal all the attachment stats when holding down the sneak key
		if(GameSettings.isKeyDown(shift))
		{
			lines.add("");
			
			//if this attachment is a barrel
			if(type.itsType == ItsType.BARREL && type.muzzleFlashVanishConst == 0F)
				lines.add("\u00a7e[Muzzle Flash Hider]");
			
			if(type.isFlashlight) lines.add("\u00a7e[Flash Light]");
			if(type.isLaserPointer) lines.add("\u00a7e[Laser Pointer]");
			
			//if is a sight
			else if(type.itsType == ItsType.SIGHT)
			{
				//TODO
			}
			
			if(type.modeOverride != null)
				lines.add("\u00a79Fire Mode Overwrite" + "\u00a77: \u00a7f" + type.modeOverride.toString().toLowerCase());
			if(type.soundRangeMultiplier != 1F)
				lines.add("\u00a79Shoot Sound Range" + "\u00a77: " + roundFloat(type.soundRangeMultiplier * 100F - 100F, 2) + "%");
			if(type.damageMultiplier != 1F)
				lines.add("\u00a79Damage" + "\u00a77: " + roundFloat(type.damageMultiplier * 100F - 100F, 2) + "%");
			if(type.recoilMult != 1F)
				lines.add("\u00a79Recoil Pitch" + "\u00a77: " + roundFloat(type.recoilMult * 100F - 100F, 2) + "%");
			if(type.recoilYawMult != 1F)
				lines.add("\u00a79Recoil Yaw" + "\u00a77: " + roundFloat(type.recoilYawMult * 100F - 100F, 2) + "%");
			if(type.spreadMultiplier != 1F)
				lines.add("\u00a79Spread" + "\u00a77: " + roundFloat(type.spreadMultiplier * 100F - 100F, 2) + "%");
			if(type.bulletSpeedMultiplier != 1F)
				lines.add("\u00a79Bullet Speed" + "\u00a77: " + roundFloat(type.bulletSpeedMultiplier * 100F - 100F, 2) + "%");
			if(type.moveSpeedMultiplier != 1F)
				lines.add("\u00a79Move Speed" + "\u00a77: " + roundFloat(type.moveSpeedMultiplier * 100F - 100F, 2) + "%");
			if(type.aimingMoveSpeedMultiplier != 1F)
				lines.add("\u00a79Aiming Move Speed" + "\u00a77: " + roundFloat(type.aimingMoveSpeedMultiplier * 100F - 100F, 2) + "%");
			if(type.aimTimeMult != 1F)
				lines.add("\u00a79Aim Time" + "\u00a77: " + roundFloat(type.aimTimeMult * 100F - 100F, 2) + "%");
			if(type.runPosTimeMult != 1F)
				lines.add("\u00a79Run Pos Time" + "\u00a77: " + roundFloat(type.runPosTimeMult * 100F - 100F, 2) + "%");
		}
		else lines.add("Hold \u00a7b\u00a7o" + GameSettings.getKeyDisplayString(shift.getKeyCode()) + "\u00a7r\u00a77 for details");
	}
	
	private static float roundFloat(float value, int points) { return FlansMod.roundFloat(value, points); }
	
	@Override
	public InfoType getInfoType() { return type; }
	
	@Override 
	public PaintableType getPaintableType() { return type; }
	
	// ----------------- Paintjobs -----------------
	
    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
    	AttachmentType atType = ((ItemAttachment)item).type;
    	if(atType.getHideInCreativeTab()) return;
    	for(int i = FlansMod.addAllPaintjobsToCreative ? atType.paintjobs.length : 1; 
    			--i >= 0; addPaintjobToList(item, atType.paintjobs[i], list));
    }
    
    private void addPaintjobToList(Item item, Paintjob paintjob, List list)
    {
    	ItemStack paintableStack = new ItemStack(item, 1, paintjob.ID);
    	NBTTagCompound tags = new NBTTagCompound();
    	paintableStack.setTagCompound(tags);
        list.add(paintableStack);
    }
    
    // ---------------------------------------------
}
