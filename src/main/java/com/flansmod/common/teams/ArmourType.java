package com.flansmod.common.teams;

import java.util.ArrayList;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ArmourType extends InfoType
{
	public static ArrayList<ArmourType> armours = new ArrayList<ArmourType>();

	/** 0 = Helmet, 1 = Chestplate, 2 = Legs, 3 = Shoes */
	public int type;
	/** where this armor can provide bullet hit proof, index 0 is head, 1 is body, 2 is leftArm, 3 is rightArm */
	public float[] proofLevel = new float[]{0F, 0F, 0F, 0F, 0F};
	/** sounds to play when an bullet hit this armor, 0-3 is blunt sound, 4-7 is penetrated sound */
	public String[] hitSounds = new String[8];
	public int[] numHitSounds = new int[]{0,0,0,0,0,0,0,0};
	public float[] hitSoundRanges = new float[]{8F,8F,8F,8F,8F,8F,8F,8F};
	/** sound to play when something that is not a bullet hited this armor 
	public String nonBulletHitSound = "DefaultHitSound";
	public int numNonBulletHitSound = 0;*/
	/** damage to player when the bullet can't penetrate this armor */
	public float bluntDamageMult = 1F, penetratedDamageMult = 1F;
	/** multiplier of damage to armor durability when the bullet can't penetrate this armor */
	public float bluntDurabilityMult = 1F, penetratedDurabilityMult = 1F;
	/** The amount of damage to absorb. From 0 to 1. Stacks additively between armour pieces */
	public double defence;
	/** The name for the armour texture. Texture path/name is assets/flansmod/armor/<armourTextureName>_1.png or _2 for legs */
	public String armourTextureName;
	/** Modifiers for various player stats */
	public float moveSpeedModifier = 1F, knockbackModifier = 0.2F, jumpModifier = 1F;
	/** if true, has mask */
	public boolean hasMask = false;
	public String[] maskSwitchSound = new String[2];
	public float maskSwitchSoundRange = 8F;
	/** If true, then the player gets a night vision buff every couple of seconds */
	public float nightVision = -1F;
	/** If true, then the player gets a invisiblity buff every couple of seconds */
	public boolean invisible = false;
	/** The overlay to display when using this helmet. Textures are pulled from the scopes directory */
	public String[] overlay = new String[2];
	/** If true, then smoke effects from grenades will have no effect on players wearing this */
	public boolean smokeProtection = false;
	/** If true, the player will not receive fall damage */
	public boolean negateFallDamage = false;
	/** If true, the player will not receive fire damage */
	public boolean fireResistance = false;
	/** If true, the player can breath under water */
	public boolean waterBreathing = false;
	/** If true, the player can walk on water */
	public boolean onWaterWalking = false;
	/** The durability for the piece of armor */
	public int durability = 0;

	@SideOnly(Side.CLIENT)
	public ModelCustomArmour model;
	@SideOnly(Side.CLIENT)
	public String modelName;

	public ArmourType(TypeFile file)
	{
		super(file);
		armours.add(this);
	}
	
	@Override
	protected void preRead(TypeFile file) { }

	@Override
	protected void postRead(TypeFile file) { }
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Model") && FMLCommonHandler.instance().getSide().isClient())
			{
				model = FlansMod.proxy.loadModel(modelName = split[1], shortName, ModelCustomArmour.class);
				model.type = this;
			}
			else if(split[0].equals("Type"))
			{
				if(split[1].equals("Hat") || split[1].equals("Helmet")) type = 0;
				else if(split[1].equals("Chest") || split[1].equals("Body")) type = 1;
				else if(split[1].equals("Legs") || split[1].equals("Pants")) type = 2;
				//if(split[1].equals("Shoes") || split[1].equals("Boots"))
				else type = 3;
			}
			else if(split[0].equals("HeadProofLevel"))
			{
				proofLevel[0] = Float.parseFloat(split[1]);
				if(split.length > 2)
				{
					hitSounds[0] = split[2];
					if(split.length > 3)
					{
						numHitSounds[0] = Integer.parseInt(split[3]);
						if(split.length > 4)
						{
							hitSoundRanges[0] = Float.parseFloat(split[4]);
							if(split.length > 5)
							{
								hitSounds[4] = split[5];
								if(split.length > 6)
								{
									numHitSounds[4] = Integer.parseInt(split[6]);
									if(split.length > 7)
										hitSoundRanges[4] = Float.parseFloat(split[7]);
								}
								else numHitSounds[4] = 1;
								//load sounds
								for(int i = numHitSounds[4]; --i >= 0; )
									FlansMod.proxy.loadSound(contentPack, "sound", split[5] + "_" + i);
							}
						}
					}
					else
						numHitSounds[0] = 1;
					for(int i = numHitSounds[0]; --i >= 0; )
						FlansMod.proxy.loadSound(contentPack, "sound", split[2] + "_" + i);
				}
			}
			else if(split[0].equals("BodyProofLevel"))
			{
				proofLevel[1] = Float.parseFloat(split[1]);
				if(split.length > 2)
				{
					hitSounds[1] = split[2];
					if(split.length > 3)
					{
						numHitSounds[1] = Integer.parseInt(split[3]);
						if(split.length > 4)
						{
							hitSoundRanges[1] = Float.parseFloat(split[4]);
							if(split.length > 5)
							{
								hitSounds[5] = split[5];
								if(split.length > 6)
								{
									numHitSounds[5] = Integer.parseInt(split[6]);
									if(split.length > 7)
										hitSoundRanges[5] = Float.parseFloat(split[7]);
								}
								else
									numHitSounds[5] = 1;
								for(int i = numHitSounds[5]; --i >= 0; )
									FlansMod.proxy.loadSound(contentPack, "sound", split[5] + "_" + i);
							}
						}
					}
					else
						numHitSounds[1] = 1;
					for(int i = numHitSounds[1]; --i >= 0; )
						FlansMod.proxy.loadSound(contentPack, "sound", split[2] + "_" + i);
				}
			}
			else if(split[0].equals("LeftArmProofLevel"))
			{
				proofLevel[2] = Float.parseFloat(split[1]);
				if(split.length > 2)
				{
					hitSounds[2] = split[2];
					if(split.length > 3)
					{
						numHitSounds[2] = Integer.parseInt(split[3]);
						if(split.length > 4)
						{
							hitSoundRanges[2] = Float.parseFloat(split[4]);
							if(split.length > 5)
							{
								hitSounds[6] = split[5];
								if(split.length > 6)
								{
									numHitSounds[6] = Integer.parseInt(split[6]);
									if(split.length > 7)
										hitSoundRanges[6] = Float.parseFloat(split[7]);
								}
								else
									numHitSounds[6] = 1;
								for(int i = numHitSounds[6]; --i >= 0; )
									FlansMod.proxy.loadSound(contentPack, "sound", split[5] + "_" + i);
							}
						}
					}
					else
						numHitSounds[2] = 1;
					for(int i = numHitSounds[2]; --i >= 0; )
						FlansMod.proxy.loadSound(contentPack, "sound", split[2] + "_" + i);
				}
			}
			else if(split[0].equals("RightArmProofLevel"))
			{
				proofLevel[3] = Float.parseFloat(split[1]);
				if(split.length > 2)
				{
					hitSounds[3] = split[2];
					if(split.length > 3)
					{
						numHitSounds[3] = Integer.parseInt(split[3]);
						if(split.length > 4)
						{
							hitSoundRanges[3] = Float.parseFloat(split[4]);
							if(split.length > 5)
							{
								hitSounds[7] = split[5];
								if(split.length > 6)
								{
									numHitSounds[7] = Integer.parseInt(split[6]);
									if(split.length > 7)
										hitSoundRanges[7] = Float.parseFloat(split[7]);
								}
								else
									numHitSounds[7] = 1;
								for(int i = numHitSounds[7]; --i >= 0; )
									FlansMod.proxy.loadSound(contentPack, "sound", split[5] + "_" + i);
							}
						}
					}
					else
						numHitSounds[3] = 1;
					for(int i = numHitSounds[3]; --i >= 0; )
						FlansMod.proxy.loadSound(contentPack, "sound", split[2] + "_" + i);
				}
			}
			else if(split[0].equals("BluntDamageMult"))
			{
				bluntDamageMult = Float.parseFloat(split[1]);
				if(split.length > 2)
					bluntDurabilityMult = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("PenetratedDamageMult"))
			{
				penetratedDamageMult = Float.parseFloat(split[1]);
				if(split.length > 2)
					penetratedDurabilityMult = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("Durability"))
				durability = Integer.parseInt(split[1]);

			else if(split[0].equals("DamageReduction") || split[0].equals("Defence"))
				defence = Double.parseDouble(split[1]);
			else if(split[0].equals("MoveSpeedModifier"))
				moveSpeedModifier = Float.parseFloat(split[1]);
			else if(split[0].equals("JumpModifier"))
				jumpModifier = Float.parseFloat(split[1]);
			else if(split[0].equals("KnockbackReduction") || split[0].equals("KnockbackModifier"))
				knockbackModifier = Float.parseFloat(split[1]);

			else if(split[0].equals("HasMask"))
			{
				hasMask = Boolean.parseBoolean(split[1]);
				if(split.length > 2)
					proofLevel[4] = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("SwitchSound"))
			{
				maskSwitchSound[0] = split[1];
				FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
				if(split.length > 2)
				{
					maskSwitchSoundRange = Float.parseFloat(split[2]);
					if(split.length > 3)
					{
						maskSwitchSound[1] = split[3];
						FlansMod.proxy.loadSound(contentPack, "sound", split[3]);
					}
				}
			}
			else if(split[0].equals("NightVision"))
			{
				nightVision = Float.parseFloat(split[1]);
				if(split.length > 2)
					proofLevel[4] = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("Invisible"))
				invisible = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("NegateFallDamage"))
				negateFallDamage = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("FireResistance"))
				fireResistance = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("WaterBreathing"))
				waterBreathing = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("SmokeProtection"))
				smokeProtection = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("OnWaterWalking"))
				onWaterWalking = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("ArmourTexture") || split[0].equals("ArmorTexture"))
				armourTextureName = split[1];
			else if(split[0].equals("Overlay"))
			{
				if(!split[1].equals("None"))
					overlay[0] = split[1];
				if(split.length > 2)
					overlay[1] = split[2];
			}
		}
		catch (Exception e)
		{
			String line = split[0];
			for(int i = 1; i < split.length; ++i) line += " " + split[i];
			FlansMod.log("error > failed to parse key word <" + line + "> for armor <" + shortName + ">");
			if(FlansMod.printStackTrace) e.printStackTrace();
		}
	}

	public static ArmourType getArmourType(String string)
	{
		for(int i = armours.size(); --i >= 0; )
		{
			if(armours.get(i).shortName.equals(string))
				return armours.get(i);
		}
		return null;
	}

	/** To be overriden by subtypes for model reloading */
	@Override
	@SideOnly(Side.CLIENT)
	public void reloadModel()
	{ if(model != null) (model = FlansMod.proxy.loadModel(modelName, shortName, ModelCustomArmour.class)).type = this; }
	
	public float getProofLevel(int proofIndex, ItemStack armorStack)
	{
		if(proofIndex == 0)
			return proofLevel[getMask(armorStack) ? 4 : 0];
		return proofLevel[proofIndex];
	}
	
	public static boolean getMask(ItemStack armorStack)
	{
		if(armorStack.stackTagCompound != null && armorStack.stackTagCompound.hasKey("mask"))
			return armorStack.stackTagCompound.getBoolean("mask");
		return false;
	}
	
	public static void setMask(ItemStack armorStack, boolean isTrue)
	{
		if(armorStack.stackTagCompound == null)
			armorStack.stackTagCompound = new NBTTagCompound();
		armorStack.stackTagCompound.setBoolean("mask", isTrue);
	}

	@Override
	public float GetRecommendedScale() { return 50f; }

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() { return model; }
}
