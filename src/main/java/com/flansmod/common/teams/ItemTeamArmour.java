package com.flansmod.common.teams;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.google.common.collect.Multimap;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

public class ItemTeamArmour extends ItemArmor implements ISpecialArmor, IFlanItem
{
	public ArmourType type;
	protected static final UUID[] uuid = new UUID[] { UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID() };

	public ItemTeamArmour(ArmourType t)
	{
		super(ItemArmor.ArmorMaterial.CLOTH, 0, t.type);
		type = t;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanTeams);
		if(t.durability > 0)
			setMaxDamage(t.durability);
		else if(FlansMod.breakableArmor == 1)
			setMaxDamage(FlansMod.defaultArmorDurability);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}

	public ItemTeamArmour(ItemArmor.ArmorMaterial armorMaterial, int renderIndex, int armourType) { super(armorMaterial, renderIndex, armourType); }

	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
	{ return new ArmorProperties(1, type.defence, Integer.MAX_VALUE); }

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) { return (int)(type.defence * 20); }

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot)
	{
		//0 = Non-breakable, 1 = All breakable, 2 = Refer to armor config, 3 = real mode
		if(FlansMod.breakableArmor > 1 && type.durability > 0 || FlansMod.breakableArmor == 1)
			stack.damageItem(damage, entity);
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String s)
	{ return "flansmod:armor/" + type.armourTextureName + "_" + (type.type == 2 ? "2" : "1") + ".png"; }

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		if(type.description != null)
            Collections.addAll(lines, type.description.split("_"));
		if(type.proofLevel[0] > 0F)
			lines.add("\u00a79Head Proof Level" + "\u00a77: " + type.proofLevel[0] * (stack.getMaxDamage() - stack.getItemDamage()) / stack.getMaxDamage());
		if(type.proofLevel[1] > 0F)
			lines.add("\u00a79Body Proof Level" + "\u00a77: " + type.proofLevel[1] * (stack.getMaxDamage() - stack.getItemDamage()) / stack.getMaxDamage());
		if(type.proofLevel[2] > 0F)
			lines.add("\u00a79Left Arm Proof Level" + "\u00a77: " + type.proofLevel[2] * (stack.getMaxDamage() - stack.getItemDamage()) / stack.getMaxDamage());
		if(type.proofLevel[3] > 0F)
			lines.add("\u00a79Right Arm Proof Level" + "\u00a77: " + type.proofLevel[3] * (stack.getMaxDamage() - stack.getItemDamage()) / stack.getMaxDamage());
		if(Math.abs(type.jumpModifier - 1F) > 0.01F)
			lines.add("\u00a73+" + (int)((type.jumpModifier - 1F) * 100F) + "% Jump Height");
		if(type.smokeProtection)
			lines.add("\u00a72Smoke Protection");
		if(type.nightVision >= 0F)
			lines.add("\u00a72Night Vision");
		if(type.invisible)
			lines.add("\u00a72Invisiblity");
		if(type.negateFallDamage)
			lines.add("\u00a72Negates Fire Damage");
		if(type.fireResistance)
			lines.add("\u00a72Fire Resistance");
		if(type.waterBreathing)
			lines.add("\u00a72Water Breathing");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2) { return type.colour; }

	@Override
	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses() { return false; }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon) { itemIcon = icon.registerIcon("FlansMod:" + type.iconPath); }

	@Override
	public Multimap getAttributeModifiers(ItemStack stack)
	{
		Multimap map = super.getAttributeModifiers(stack);
		map.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), new AttributeModifier(uuid[type.type], "KnockbackResist", type.knockbackModifier, 0));
		map.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), new AttributeModifier(uuid[type.type], "MovementSpeed", type.moveSpeedModifier - 1F, 2));
		return map;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) { return type.model; }

	@Override
	public InfoType getInfoType() { return type; }

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		//if(type.nightVision && FlansMod.ticker % 25 == 0)
		//	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250));
		if(type.invisible && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 250));
		if(type.jumpModifier > 1.01F && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 250, (int)((type.jumpModifier - 1F) * 2F), true));
		if(type.negateFallDamage)
			player.fallDistance = 0F;
		if(type.fireResistance && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 250));
		if(type.waterBreathing && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 250));
		if(type.onWaterWalking)
		{
			if(player.isInWater())
				player.capabilities.allowFlying = true;
			else
				player.capabilities.isFlying = false;
		}
    }
}
