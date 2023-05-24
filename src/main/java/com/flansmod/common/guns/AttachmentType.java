package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.model.ModelDefault;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.GunType.FireMode;
import com.flansmod.common.types.TypeFile;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagIntArray;
import net.minecraft.nbt.NBTTagList;

public class AttachmentType extends ModifiableType
{
	public static ArrayList<AttachmentType> attachments = new ArrayList<AttachmentType>();
	
	/** The type of attachment. */
	public int attachmentType = 0;
	/** its volume when attached to a gun */
	public float volumeWhenAttached = 0F;
	/** the space around this attachment that it takes */
	public float[] attachOffset = new float[]{ 0F };
	// Attachment Function add-ons
	/** This variable controls whether or not bullet sounds should be muffled */
	public boolean distortSound = false;
	/** to control the shoot sound that the gun use */
	public int enableShootSoundNum = -1 >>> 1;
	/** shoot sound range = original shoot sound range * soundRangeMultiplier */
	public float soundRangeMultiplier = 1F;
	/** If true, then this attachment will act like a flashlight */
	public boolean isFlashlight = false;
	/** Flashlight range. How far away it lights things up */
	public float flashlightRange = 10F;
	/** determines whether it is a laser pointer */
	public boolean isLaserPointer = false;
	/** if not null, this flash mode will replace the original one that is going to be rendered	*/
	@SideOnly(Side.CLIENT)
	public ModelDefault flashModel, muzzleSmokeModel;
	/** real flash scale = gunType.flashScale * barrelType.flashScale */
	public float muzzleFlashScale = 1F, MuzzleSmokeScale = 1F, muzzleSmokeAt = 0F;
	/** flash texture */
	public String flashTexture, muzzleSmokeTexture;
	/** num flash texture */
	public int numFlashTexture = 0, numMuzzleSmokeTexture = 0;
	/** muzzle flash vanish speed const */
	public float muzzleFlashVanishConst = 1F, smokeVanishConst = 1F;
	
	//Gun behaviour modifiers
	/** These stack between attachments and apply themselves to the gun's default spread */
	public float spreadMultiplier = 1F;
	/** Likewise these stack and affect recoil */
	public float recoilMult = 1F, recoilYawMult = 1F;
	public float recoilRotZMult = 1F, recoilRotYMult = 1F, recoilTransXByPitchMult = 1F, recoilTransXByYawMult = 1F, cameraRecoilMult = 1F;
	public float antiRecoilRotZMult = 1F, antiRecoilRotYMult = 1F, antiRecoilTransXMult = 1F;
	/** Another stacking variable for damage */
	public float damageMultiplier = 1F;
	/** Melee damage modifier */
	public float meleeDamageMultiplier = 1F;
	/** Bullet speed modifier */
	public float bulletSpeedMultiplier = 1F;
	/** Movement speed modifier */
	public float moveSpeedMultiplier = 1F, aimingMoveSpeedMultiplier = 1F;
	/** Time modifiers */
	public float aimTimeMult = 1F, onUseAimTimeMult = 1F, takeOutTimeMult = 1F, runPosTimeMult = 1F;
	/** Mutiplier on gun's sight switch speed */
	public float sightSwitchMult = 1F, onUseSightSwitchMult = 1F;
	/** If set to anything other than null, then this attachment will override the weapon's default firing mode */
	public byte[] modeOverride = null;

	//Underbarrel functions
	/** This variable controls whether the underbarrel is enabled */
	public boolean secondaryFire = false;
	/** recoil for gun underbarrel */
	public float recoil = 0F, recoilYaw = 0F, decreaseRecoil = 0.8F, decreaseRecoilYaw = 0.8F;
	/** attachment types needed to make sure the gun equipped with this attachment can be shootable */
	public int[] typesNeeded = new int[0];
	/** whitelist and black list of this attachment */
	public int[] typeWhitelist, typeBlacklist;
	public List<String[]> nameWhitelist = new ArrayList<String[]>();// nameBlacklist;
	/** The list of bullet types that can be used in the secondary mode */
	public List<String> secondaryAmmo = new ArrayList<String>();
	/** The damage of underbarrel gun */
	public float secondaryDamage = 1F;
	/** spread of the gun underbarrel */
	public float secondaryAimingSpread = 1F, secondarySpread = 1F, secondarySpreadWLP = 1F;
	public float secondaryShotGunAimingSpread = 1F, secondaryShotGunSpread = 1F, secondaryShotGunSpreadWLP = 1F;
	public int secShootSoundRange = 50, secEmptyClickSoundRange = 5;
	//to separate it from the original codes
	/** The speed of bullets upon leaving this gun */
	public float secondarySpeed = 5F;
	/** The time (in ticks) it takes to reload this gun */
	public int secondaryReloadTime = 1;
	/** The delay between shots in ticks (1/20ths of seconds) */
	public float secondaryShootDelay = 1F;
	/** The sound played upon shooting */
	public String secondaryShootSound, secEmptyClickSound;
	/** The sound to play upon reloading */
	public String secondaryReloadSound;
	/** reload states */
	public byte[] reloadSteps = new byte[]{1, 3, 4, 8};
	public int[] reloadTimes = new int[]{5, 15, 15, 5};
	public String[] reloadSounds = new String[]{"None"};
	/** The firing mode of the gun. One of semi-auto, full-auto, minigun or burst */
	public byte secondaryFireMode = FireMode.SEMI_AUTO;

	//Scope variables (These variables only come into play for scope attachments)
	/** The FOV zoom level of this scope */
	public float[] FOVZoomLevel = new float[]{ -1F }, mouseSensitivityMult = new float[]{ 1F };
	/** for scope glass model to render */
	@SideOnly(Side.CLIENT)
	public ModelDefault scopeGlassModel, blackMaskModel, coatedGlassModel;
	/** for dots in sight to render */
	public int numTexture = 1;
	
	/** Model. Only applicable when the attachment is added to 3D guns */
	@SideOnly(Side.CLIENT)
	public ModelAttachment model;
	@SideOnly(Side.CLIENT)
	public ModelDefault lightStuffModel, laserModelFP, laserModel, lightModel; //this is for flash light type attachment
	public String modelName = null, lightStuffTexture;
	
	/** shadow type */
	public static class ItsShadowTpye
	{
		private static final byte HIDE_IN_CREATIVE_TAB = (byte)(1 << 7), UPDATE_GUN_STATES = (byte)(1 << 6),
				TYPE_MASK = (byte)~(-1 << 6);
		private static final byte NONE = 0, GENERIC = 1, TOGGLE = 2, CO_SIGHT = 3;
		
		public static byte fromString(String s)
		{
			if((s = s.toLowerCase()).equals("generic")) return GENERIC;
			if(s.equals("toggle")) return TOGGLE;
			if(s.equals("cosight")) return CO_SIGHT;
			return NONE;
		}
		
		public static String toString(AttachmentType t)
		{
			switch(t.itsShadowType & TYPE_MASK)
			{
				case GENERIC: return "generic";
				case TOGGLE: return "toggle";
				case CO_SIGHT: return "cosight";
				default: return "none";
			}
		}
	}
	public String shadowType = null;
	private byte itsShadowType = ItsShadowTpye.NONE;
	
	public boolean isNone() { return (itsShadowType & ItsShadowTpye.TYPE_MASK) == ItsShadowTpye.NONE; }
	
	public boolean isGeneric() { return (itsShadowType & ItsShadowTpye.TYPE_MASK) == ItsShadowTpye.GENERIC; }
	
	public boolean isToggle() { return (itsShadowType & ItsShadowTpye.TYPE_MASK) == ItsShadowTpye.TOGGLE; }
	
	public boolean isCoSight() { return (itsShadowType & ItsShadowTpye.TYPE_MASK) == ItsShadowTpye.CO_SIGHT; }
	
	public boolean getHideInCreativeTab() { return (itsShadowType & ItsShadowTpye.HIDE_IN_CREATIVE_TAB) != 0; }
	
	public void setHideInCreativeTab(boolean tof)
	{
		if(tof) itsShadowType |= ItsShadowTpye.HIDE_IN_CREATIVE_TAB;
		else itsShadowType &= ~ItsShadowTpye.HIDE_IN_CREATIVE_TAB;
	}
	
	public boolean getUpdateGunStates() { return (itsShadowType & ItsShadowTpye.UPDATE_GUN_STATES) != 0; }
	
	public void setUpdateGunStates(boolean tof)
	{
		if(tof) itsShadowType |= ItsShadowTpye.UPDATE_GUN_STATES;
		else itsShadowType &= ~ItsShadowTpye.UPDATE_GUN_STATES;
	}

	/** control whether our left hand should hold this attachment */
	public static final byte LOWEST_HAND_PRIORITY = (byte)(1 << 7);
	public byte leftHandPriority = LOWEST_HAND_PRIORITY, rightHandPriority = LOWEST_HAND_PRIORITY;
	public int leftHandPose = -1, rightHandPose = -1;
	
	public AttachmentType(TypeFile file) { super(file); attachments.add(this); }
	
	@Override
	public void postRead(TypeFile file)
	{
		super.postRead(file);
		muzzleSmokeAt *= modelScale;
		for(int i = attachOffset.length; --i >= 0; ) attachOffset[i] *= modelScale;
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("AttachedVolume")) volumeWhenAttached = Float.parseFloat(split[1]);
			else if(split[0].equals("AttachOffsets"))
				for(int i = (attachOffset = new float[split.length - 1]).length; --i >= 0; ) attachOffset[i] = Float.parseFloat(split[i + 1]) / 16F;
			else if(split[0].equals("ShadowType"))
			{
				itsShadowType = ItsShadowTpye.GENERIC;
				switch(split.length)
				{
					case 5: itsShadowType = ItsShadowTpye.fromString(split[4]);
					case 4: setUpdateGunStates(Boolean.parseBoolean(split[3]));
					case 3: setHideInCreativeTab(Boolean.parseBoolean(split[2]));
					default: shadowType = split[1];
				}
			}
			else if(split[0].equals("Model"))
			{
				if(FMLCommonHandler.instance().getSide().isClient())
					model = FlansMod.proxy.loadModel(modelName = split[1], shortName, ModelAttachment.class);
				if(split.length > 2)
				{
					texture = split[2];
					if(split.length > 3)
					{
						modelScale = Float.parseFloat(split[3]);
						if(split.length > 4 && FMLCommonHandler.instance().getSide().isClient())
							coatedGlassModel = FlansMod.proxy.loadModel(split[4], shortName, ModelDefault.class);
					}
				}
			}
			else if(split[0].equals("DotModel"))
			{
				if(FMLCommonHandler.instance().getSide().isClient() && !split[1].equals("None"))
					lightStuffModel = FlansMod.proxy.loadModel(split[1], shortName, ModelDefault.class);
				if(split.length > 2)
				{
					lightStuffTexture = split[2];
					if(split.length > 3) numTexture = Integer.parseInt(split[3]);
				}
			}
			else if(split[0].equals("DistortSound"))
				distortSound = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("EnableShootSoundNum"))
				enableShootSoundNum = Integer.parseInt(split[1]);
			else if(split[0].equals("SoundRangeMultiplier"))
				soundRangeMultiplier = Float.parseFloat(split[1]);
			else if(split[0].equals("FlashModel"))
			{
				muzzleFlashVanishConst = Float.parseFloat(split[1]);
				if(split.length > 2)
				{
					if(!split[2].equals("None") && FMLCommonHandler.instance().getSide().isClient())
						flashModel = FlansMod.proxy.loadModel(split[2], shortName, ModelDefault.class);
					if(split.length > 3)
					{
						if(!split[3].equals("None")) flashTexture = split[3];
						if(split.length > 4)
						{
							muzzleFlashScale = Float.parseFloat(split[4]);
							if(split.length > 5) numFlashTexture = Integer.parseInt(split[5]);
						}
					}
				}
			}
			//gun smoke
			else if(split[0].equals("MuzzleSmokeModel"))
			{
				switch(split.length)
				{
					case 6: numMuzzleSmokeTexture = Integer.parseInt(split[5]);
					case 5: MuzzleSmokeScale = Float.parseFloat(split[4]);
					case 4: if(!split[3].equals("None")) muzzleSmokeTexture = split[3];
					case 3:
						if(!split[2].equals("None") && FMLCommonHandler.instance().getSide().isClient())
							muzzleSmokeModel = FlansMod.proxy.loadModel(split[2], shortName, ModelDefault.class);
					default: muzzleSmokeAt = Float.parseFloat(split[1]) / 16F;
				}
			}
			else if(split[0].equals("SmokeVanishConst")) smokeVanishConst = Float.parseFloat(split[1]);
			else if(split[0].equals("Flashlight"))
			{
				isFlashlight = Boolean.parseBoolean(split[1].toLowerCase());
				if(split.length > 2)
				{
					flashlightRange = Float.parseFloat(split[2]);
					if(split.length > 3 && isFlashlight && FMLCommonHandler.instance().getSide().isClient())
						lightModel = FlansMod.proxy.loadModel(split[3], shortName, ModelDefault.class);
				}
			}
			//Mode override
			else if(split[0].equals("ModeOverride"))
			{
				modeOverride = new byte[split.length - 1];
				for(int i = modeOverride.length; --i >= 0; ) modeOverride[i] = FireMode.parseFireMode(split[i + 1]);
			}

			//Secondary Stuff
			else if(split[0].equals("SecFire"))
				secondaryFire = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("Recoil"))
				recoil = Float.parseFloat(split[1]);
			else if(split[0].equals("RecoilYaw"))
				recoilYaw = Float.parseFloat(split[1]);
			else if(split[0].equals("DecreaseRecoil"))
				decreaseRecoil = Float.parseFloat(split[1]);
			else if(split[0].equals("DecreaseRecoilYaw"))
				decreaseRecoilYaw = Float.parseFloat(split[1]);
			else if(split[0].equals("ItsType")) itsType = parseItsType(split[1]);
			else if(split[0].equals("AttachmentType"))
				attachmentType = split[1].hashCode();
			else if(split[0].equals("TypesNeeded"))
			{
				typesNeeded = new int[split.length - 1];
				for(int i = 1; i < split.length; i++)
					typesNeeded[i - 1] = Integer.parseInt(split[i]);
			}
			else if(split[0].equals("AttachmentTypesNeeded"))
			{
				typesNeeded = new int[split.length - 1];
				for(int i = 1; i < split.length; i++)
					typesNeeded[i - 1] = split[i].hashCode();
			}
			else if(split[0].equals("Ammo"))
				secondaryAmmo.add(split[1]);
			else if(split[0].equals("Damage"))
				secondaryDamage = Float.parseFloat(split[1]);
			else if(split[0].equals("Spread"))
			{
				secondarySpread = Float.parseFloat(split[1]);
				if(split.length > 2)
					secondaryShotGunSpread = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("AimingSpread"))
			{
				secondaryAimingSpread = Float.parseFloat(split[1]);
				if(split.length > 2)
					secondaryShotGunAimingSpread = Float.parseFloat(split[1]);
			}
			else if(split[0].equals("SpreadWLP"))
			{
				secondarySpreadWLP = Float.parseFloat(split[1]);
				if(split.length > 2)
					secondaryShotGunSpreadWLP = Float.parseFloat(split[1]);
			}
			else if(split[0].equals("BulletSpeed"))
				secondarySpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("ShootDelay"))
				secondaryShootDelay = Float.parseFloat(split[1]);
			else if(split[0].equals("ReloadTime"))
				secondaryReloadTime = Integer.parseInt(split[1]);
			else if(split[0].equals("LoadIntoGun"))
				secondaryFireMode = FireMode.parseFireMode(split[1]);
			else if(split[0].equals("ReloadSteps"))
			{
				reloadSteps = new byte[split.length - 1];
				
				for(int i=0; i < reloadSteps.length; i++)
					reloadSteps[i] = Byte.parseByte(split[i + 1]);
			}
			else if(split[0].equals("ReloadTimes"))
			{
				reloadTimes = new int[split.length - 1];
				
				for(int i=0; i < reloadTimes.length; i++)
					reloadTimes[i] = Integer.parseInt(split[i + 1]);
			}
			else if(split[0].equals("ReloadSounds"))
			{
				reloadSounds = new String[split.length - 1];
				
				for(int i=0; i < reloadSounds.length; i++)
				{
					reloadSounds[i] = split[i + 1];
					FlansMod.proxy.loadSound(contentPack, "guns", split[i + 1]);
				}
			}
			else if(split[0].equals("SecondaryShootSound"))
			{
				secondaryShootSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
				if(split.length > 2)
					secShootSoundRange = Integer.parseInt(split[2]);
			}
			else if(split[0].equals("EmptyClickSound"))
			{
				secEmptyClickSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
				if(split.length > 2)
					secEmptyClickSoundRange = Integer.parseInt(split[2]);
			}
			else if(split[0].equals("ReloadSound"))
			{
				secondaryReloadSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			
			//Multipliers
			else if(split[0].equals("MeleeDamageMultiplier"))
				meleeDamageMultiplier = Float.parseFloat(split[1]);
			else if(split[0].equals("DamageMultiplier"))
				damageMultiplier = Float.parseFloat(split[1]);
			else if(split[0].equals("SpreadMultiplier"))
				spreadMultiplier = Float.parseFloat(split[1]);
			else if(split[0].equals("RecoilMultiplier"))
			{
				recoilMult = Float.parseFloat(split[1]);
				if(split.length > 2) recoilYawMult = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("ModelRecoilMultiplier"))
			{
				switch(split.length)
				{
					case 6: cameraRecoilMult = Float.parseFloat(split[5]);
					case 5: recoilTransXByYawMult = Float.parseFloat(split[4]);
					case 4: recoilTransXByPitchMult = Float.parseFloat(split[3]);
					case 3: recoilRotYMult = Float.parseFloat(split[2]);
					default: recoilRotZMult = Float.parseFloat(split[1]);
				}
			}
			else if(split[0].equals("AntiModelRecoilConst"))
			{
				switch(split.length)
				{
					case 4: antiRecoilTransXMult = Float.parseFloat(split[3]);
					case 3: antiRecoilRotYMult = Float.parseFloat(split[2]);
					default: antiRecoilRotZMult = Float.parseFloat(split[1]);
				}
			}
			else if(split[0].equals("BulletSpeedMultiplier"))
				bulletSpeedMultiplier = Float.parseFloat(split[1]);
			else if(split[0].equals("MoveSpeedMultiplier"))
			{
				moveSpeedMultiplier = Float.parseFloat(split[1]);
				if(split.length > 2)
					aimingMoveSpeedMultiplier = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("AimTimeMult"))
			{
				aimTimeMult = Float.parseFloat(split[1]);
				if(split.length > 2) onUseAimTimeMult = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("SightSwitchMult"))
			{
				sightSwitchMult = Float.parseFloat(split[1]);
				if(split.length > 2) onUseSightSwitchMult = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("TakeOutTimeMult"))
				takeOutTimeMult = Float.parseFloat(split[1]);
			else if(split[0].equals("RunPoseTimeMult"))
				runPosTimeMult = Float.parseFloat(split[1]);
			//Scope Variables
			else if(split[0].equals("ZoomLevel"))
			{
				if(FMLCommonHandler.instance().getSide().isClient())
				{
					if(!split[1].equals("None"))
						scopeGlassModel = FlansMod.proxy.loadModel(split[1], shortName, ModelDefault.class);
					if(split.length > 2 && !split[2].equals("None"))
						blackMaskModel = FlansMod.proxy.loadModel(split[2], shortName, ModelDefault.class);
				}
				if(split.length > 3)
				{
					int arrayLength = (split.length - 3) / 2;
					if(arrayLength > 0)
					{
						FOVZoomLevel = new float[arrayLength];
						mouseSensitivityMult = new float[arrayLength];
						for(int i = 0; i < arrayLength; ++i)
						{
							FOVZoomLevel[i] = Float.parseFloat(split[i * 2 + 3]);
							mouseSensitivityMult[i] = Float.parseFloat(split[i * 2 + 4]);
						}
					}
				}
			}
			else if(split[0].equals("LaserPointer"))
			{
				isLaserPointer = Boolean.parseBoolean(split[1].toLowerCase());
				if(split.length > 2 && isLaserPointer && FMLCommonHandler.instance().getSide().isClient())
				{
					laserModelFP = FlansMod.proxy.loadModel(split[2], shortName, ModelDefault.class);
					if(split.length > 3)
						laserModel = FlansMod.proxy.loadModel(split[3], shortName, ModelDefault.class);
				}
			}
			else if(split[0].equals("LeftHandPose"))
			{
				leftHandPose = split[1].hashCode();
				if(split.length > 2) leftHandPriority = Byte.parseByte(split[2]);
			}
			else if(split[0].equals("RightHandPose"))
			{
				rightHandPose = split[1].hashCode();
				if(split.length > 2) rightHandPriority = Byte.parseByte(split[2]);
			}
		}
		catch(Exception e)
		{
			String line = split[0];
			for(int i = 1; i < split.length; ++i) line += " " + split[i];
			FlansMod.log("error > failed to parse key word <" + line + "> for attachment <" + shortName + ">");
			if(FlansMod.printStackTrace) e.printStackTrace();
		}
	}
	
	public static AttachmentType getAttachment(String s)
	{
		for(int i = attachments.size(); --i >= 0; ) if(s.equals(attachments.get(i).shortName)) return attachments.get(i);
		return null;
	}
	
	public static byte parseItsType(String typeString)
	{
		if(typeString.equals("barrel")) return ItsType.BARREL;
		if(typeString.equals("muzzle")) return ItsType.MUZZLE;
		if(typeString.equals("bolt")) return ItsType.BOLT;
		if(typeString.equals("sight")) return ItsType.SIGHT;
		if(typeString.equals("charginghandle")) return ItsType.CHARGING_HANDLE;
		if(typeString.equals("altchargehandle")) return ItsType.ALT_CHARGE_HANDLE;
		if(typeString.equals("handguard")) return ItsType.HANDGUARD;
		if(typeString.equals("grip")) return ItsType.GRIP;
		if(typeString.equals("buffertube")) return ItsType.BUFFER_TUBE;
		if(typeString.equals("stock")) return ItsType.STOCK;
		if(typeString.equals("piston")) return ItsType.PISTON;
		if(typeString.equals("reargrip")) return ItsType.REAR_GRIP;
		return 0;
	}
	
	/* methods to handle attachment states */
	public static class AttachmentTag
	{
		private static byte a = 0;
		public static final byte ID_DAMAGE = a++, POS = a++, TOF = a++;
		public static final int ID_MASK = -1 << 16, DAMAGE_MASK = -1 >>> 16;
		public static final int LASER_ON = 1, LASER_OFF = ~LASER_ON, LIGHT_ON = 2, LIGHT_OFF = ~LIGHT_ON, 
				AVOID_CHECK_ON = 4, AVOID_CHECK_OFF = ~AVOID_CHECK_ON;
		public static final int DOT_NUM_MASK = -1 >>> 8, ZOOM_STEP_MASK = ~(-1 << 24 >>> 8), ATTACH_OFFSET_MASK = ~(-1 >>> 24 << 8);
	}
	
	public static NBTTagCompound writeAttachableToTag(ItemStack stack, NBTTagCompound toTag)
	{ return ((ItemAttachment)stack.getItem()).type.writeAttachableToTag((short)stack.getItemDamage(), toTag); }
	
	public NBTTagCompound writeAttachableToTag(short damage, NBTTagCompound toTag)
	{
		int states[], i;
		NBTTagList prList;
		if(toTag == null)
		{
			toTag = new NBTTagCompound();
			toTag.setIntArray(ModifiableTag.STATES, states = new int[AttachmentTag.a]);
			toTag.setTag(ModifiableTag.PR_LIST, prList = new NBTTagList());
			for(i = slots.length; --i >= 0; ) prList.appendTag(new NBTTagList());
		}
		else
		{
			states = ((NBTTagIntArray)toTag.getTag(ModifiableTag.STATES)).func_150302_c();
			prList = (NBTTagList)toTag.getTag(ModifiableTag.PR_LIST);
			for(i = prList.tagCount(); --i >= 0; ) // remove the attachments that has been installed on it
			{
				try { getListFromTagList(getTagListFromTagList(prList, i)).clear(); }
				catch(Exception e) { return null; }
			}
			if((i = prList.tagCount()) > slots.length) while(--i >= slots.length) prList.removeTag(i);
			else if(i < slots.length) while(++i <= slots.length) prList.appendTag(new NBTTagList());
		}
		states[AttachmentTag.ID_DAMAGE] = (Item.getIdFromItem(item) << 16) | damage;
		states[AttachmentTag.TOF] = 0;
		return toTag;
	}
	
	public int[] setTagAtType(int[] states)
	{
		states[AttachmentTag.ID_DAMAGE] = (Item.getIdFromItem(item) << 16) | (states[AttachmentTag.ID_DAMAGE] & AttachmentTag.DAMAGE_MASK);
		return states;
	}
	public static AttachmentType getAtType(NBTTagCompound tag) { return getAtType(getStates(tag)); }
	
	public static AttachmentType getAtType(int[] states)
	{ return ((ItemAttachment)Item.getItemById(states[AttachmentTag.ID_DAMAGE] >>> 16)).type; }
	
	public static ItemStack readAttachableFromTag(NBTTagCompound tag, ItemStack toStack)
	{
		int[] states = getStates(tag);
		if(toStack == null)
			return new ItemStack(getAtType(states).item, 1, getAtDam(states));
		toStack.func_150996_a(getAtType(states).item);
		toStack.setItemDamage(getAtDam(states));
		return toStack;
	}
	
	/* methods to get and set sp states */
	public static int getAtDam(NBTTagCompound atTag) { return getAtDam(getStates(atTag)); }
	
	public static int getAtDam(int[] states) { return states[AttachmentTag.ID_DAMAGE] & AttachmentTag.DAMAGE_MASK; }
	
	public static void setAtDam(int[] states, short dam)
	{ states[AttachmentTag.ID_DAMAGE] = (states[AttachmentTag.ID_DAMAGE] & AttachmentTag.ID_MASK) | dam; }
	
	public static float getPos(NBTTagCompound tag) { return getState(getStates(tag), AttachmentTag.POS); }
	
	public static byte getDotNum(int[] states) { return (byte)(states[AttachmentTag.TOF] >>> 24); }
	
	public static byte getDotNum(NBTTagCompound atTag) { return getDotNum(getStates(atTag)); }
	
	public static void setDotNum(int[] states, byte step)
	{ states[AttachmentTag.TOF] = (states[AttachmentTag.TOF] & AttachmentTag.DOT_NUM_MASK) + (step << 24); }
	
	public static byte getZoomStep(int[] states) { return (byte)(states[AttachmentTag.TOF] << 8 >>> 24); }
	
	public static void setZoomStep(int[] states, byte step)
	{ states[AttachmentTag.TOF] = (states[AttachmentTag.TOF] & AttachmentTag.ZOOM_STEP_MASK) + (step << 16); }
	
	public static int getOffset(int[] states) { return states[AttachmentTag.TOF] << 16 >>> 24; }
	
	public static void setOffset(int[] states, byte step)
	{ states[AttachmentTag.TOF] = (states[AttachmentTag.TOF] & AttachmentTag.ATTACH_OFFSET_MASK) + (step << 8); }
	
	public static byte getStockStep(int[] states) { return getZoomStep(states); }
	
	public static void setStockStep(int[] states, byte step) { setZoomStep(states, step); }
	
	/* methods to handle TOF tag */
	public static boolean getTOF(int[] states, int target) { return (states[AttachmentTag.TOF] & target) != 0; }
	
	public static void setTOFOn(int[] states, int onInt) { states[AttachmentTag.TOF] |= onInt; }
	
	public static void setTOFOff(int[] states, int offInt) { states[AttachmentTag.TOF] &= offInt; }
	
	/* methods to assist functions */
	public static LinkedList<byte[]> getAttachmentAtByType(NBTTagCompound atTag, byte[] lastOnAt, byte itsType, byte spType, LinkedList<byte[]> dest)
	{
		byte[] onAt = new byte[lastOnAt.length + 2];
		for(int i = lastOnAt.length; --i >= 0; ) onAt[i] = lastOnAt[i];
		NBTTagList prList = getPRList(atTag), prTag;
		AttachmentType atType;
		for(byte i = (byte)prList.tagCount(), j; (onAt[lastOnAt.length] = --i) >= 0; )
		{
			for(j = (byte)(prTag = getTagListFromTagList(prList, i)).tagCount(); (onAt[onAt.length - 1] = --j) >= 0; )
			{
				if((atType = getAtType(atTag = prTag.getCompoundTagAt(j))).itsType == itsType
				   || (spType == ItsType.LASER && atType.isLaserPointer) || (spType == ItsType.LIGHT && atType.isFlashlight) 
				   || (spType == ItsType.CO_SIGHT_FLIPPED && atType.isCoSight() && atType.itsType != ItsType.SIGHT)
				   || (spType == ItsType.TOGGLABLE && atType.isToggle()))
					dest.add(FlansMod.copyByteArray(onAt)); // if satisfy requirement, record it
				getAttachmentAtByType(atTag, onAt, itsType, spType, dest); // check ats on this at
			}
		}
		return dest;
	}
	
	public static LinkedList<byte[]> getAttachmentAtByType(NBTTagCompound atTag, byte[] lastOnAt, byte itsType, byte spType)
	{ return getAttachmentAtByType(atTag, lastOnAt, itsType, spType, new LinkedList<byte[]>()); }
	
	public String getPaintjob(NBTTagCompound atTag) { return getTex((short)getAtDam(getStates(atTag))); }
	
	/** To be overriden by subtypes for model reloading */
	@Override
	@SideOnly(Side.CLIENT)
	public void reloadModel() //TODO: other ModelDefault to load
	{ if(model != null) model = FlansMod.proxy.loadModel(modelName, shortName, ModelAttachment.class); }
	
	/** this method is used to set the location where this attachment is set on the picatinny rail */
	public void setPosition(ItemStack attachmentStack, float position)
	{
		if(!attachmentStack.hasTagCompound()) attachmentStack.setTagCompound(new NBTTagCompound());
		attachmentStack.stackTagCompound.setFloat("pos", position);
	}
	
	/** Get the bullet item stack stored in the underbarrel gun's NBT data (the loaded magazine / bullets) */
	public ItemStack getBulletItemStack(ItemStack attachmentStack, int id) { return null; }
	
	/** Set the bullet item stack stored in the attachment's NBT data (the loaded magazine / bullets) */
	public void setBulletItemStack(ItemStack attachmentStack, ItemStack bullet, int id) { }
	
	/** method to check underbarrel gun ammo before shoot */
	public boolean checkSecAmmo(ItemStack attachmentStack, AttachmentType attachmentType) { return false; } // TODO
	
	@Override
	public float GetRecommendedScale() { return 100F; }

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel()  { return model; }
}
