package com.flansmod.common.guns;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.model.ModelMG;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.AttachmentType.AttachmentTag;
import com.flansmod.common.network.PacketGunFire;
import com.flansmod.common.network.PacketOperation;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketPlayerShoot;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagByteArray;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagIntArray;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;

/** for test 
import com.flansmod.client.FlansModClient;
/** for test */
public class GunType extends ModifiableType
{
	/** for test 
	public ModelDefault testModel;
	/** for test */
	/** volume when this mag is loaded into a gun */
	public float magVolume = 0F;
	public float gunLengthOffset = 0F;
	//Gun Behaviour Variables
	/** Base value for Upwards cursor/view recoil */
	public float recoilPitch = 1F;
	/** Base value for Left/Right cursor/view recoil. */
	public float recoilYaw = 0F;
	/** Modifier for setting the maximum pitch divergence when randomizing recoil (Recoil 2 + rndRecoil 0.5 == 1.5-2.5 Recoil range) */
	public float rndRecoilPitchRange = 1F;
	/** Modifier for setting the maximum yaw divergence when randomizing recoil (Recoil 2 + rndRecoil 0.5 == 1.5-2.5 Recoil range) */
	public float rndRecoilYawRange = 1F;
	/** Modifier for increasing the final pitch recoil while sprinting (Recoil 2 + rndRecoil 0.5 + decreaseRecoil 0.5 == 2.0-3.0 Recoil range) */
	public float increaseRecoilPitch = 0.5F;
	/** Modifier for increasing the final yaw recoil while sprinting (Recoil 2 + rndRecoil 0.5 + decreaseRecoil 0.5 == 2.0-3.0 Recoil range) */
	public float increaseRecoilYaw = 0.5F;
	/** values to determine the recoil on the gun model and camera according the amount of recoil in that shoot */
	public float recoilRotZConst = 0.45F, recoilRotYConst = 1F, recoilRotXConst = 1.8F, recoilTransXByPitchConst = 0.015F, recoilTransXByYawConst = 0.01F, 
				 recoilOnCamera = 0.3F, recoilTransZConst = -0.01F, recoilTransYConst = 0F;//0.001F;
	public float antiRecoilRotZConst = 0.7F, antiRecoilRotYConst = 0.7F, antiRecoilRotXConst = 0.7F, 
				 antiRecoilTransXConst = 0.7F, antiRecoilTransZConst = 0.7F, antiRecoilTransYConst = 0.7F;
	//Ammo & Reload Variables
	/** we emulate a magazine by a gun, so basicly we load another "gun" into this gun to simulate the magazine */
	public int[] magazine = new int[]{ 1 << 31 };
	/** The list of bullet types that can be used in this gun */
	//public List<ShootableType> ammo = new ArrayList<ShootableType>();
	public int[] ammo = new int[0];
	/** Whether the player can press the reload key (default R) to reload this gun */
	public boolean canForceReload = true;
	/** Whether the player can receive ammo for this gun from an ammo mag */
	public boolean allowRearm = true;
	/** Number of ammo items that the gun may hold. Most guns will hold one magazine.
	 * Some may hold more, such as Nerf pistols, revolvers or shotguns */
	public int ammoCapacity = 1;
	/** these parts are for new reload system */
	public byte[] reloadSteps = new byte[]{GunOperation.TILT_GUN, GunOperation.UNLOAD_MAG, GunOperation.LOAD_MAG, GunOperation.UNTILT_GUN};
	public int[] reloadTimes = new int[]{ 5, 15, 15, 5 };
	public String[] reloadSounds = new String[0];
	public int[] reloadSoundRanges = new int[]{ 8, 8, 8, 8 };
	/** these value will determine when to start play push mag in sound and push/pull bullet sound */
	public float pushMagSoundTime = 0.3F, pushBulletSoundTime = 0.7F, pullBulletSoundTime = 0.7F;
	/** check ammo setings, checkAmmoTime = 0 means can't ckeck ammo for this weapon */
	public float checkAmmoTime = 0F, checkAmmoSoundR = 8F;
	public String[] checkAmmoSound = new String[]{ null, null };
	public float[] checkAmmoSoundTime = new float[]{0F, 1F};
	public LinkedList<SimpleEntry<Integer, String>> checkAmmoStates = new LinkedList<SimpleEntry<Integer,String>>();
	/** check chamber */
	public short[] checkChamberTime = new short[]{0, 0};
	public short checkChamberSoundR = 8;
	public String[] checkChamberSound = new String[]{ null, null, null, null };
	public float[] checkChamberSoundTime = new float[]{0F, 1F, 0F, 1F};
	/** slide release time that needed when not reloading a gun */
	public short releaseSlideTime = -1, chargeTime = 15, chargeDelay = 7;
	public static class Sound
	{
		public static final byte PRESS_RELEASE_BUTTON = 0, RELEASE_BOLT = 1, 
				EMPTY_CHARGE = 0, CHARGE = 1, EMPTY_CHARGE_LOCK = 2, 
				CHARGE_LOCK = 3, CHARGE_RELEASE = 4, CHARGE_KEEP_LOCK = 5;
	}
	public String[] releaseBoltSound = new String[]{ null, null }, chargeSound = new String[]{ null, null, null, null, null, null };
	public short[] releaseBoltSoundR = new short[]{ 8, 8 }, chargeSoundR = new short[]{ 8, 8, 8, 8, 8, 8 };
	/** determines whether this mag is a parrallel mag 
	public boolean isParallelMag = false;*/
	/** time in ticks to take out the gun when selected, in this time you won't be able to operate the gun */
	public int takeOutTime = 16;
	/** speed for slide of a gun to recover */
	public float[] slideAcceleration = new float[] { 0.1F, 0.1F };
	
	//Projectile Mechanic Variables
	/** The amount that bullets spread out when fired from this gun */
	public float bulletSpread = 1F;
	/** shooting spread of the gun when aiming */
	public float bulletAimingSpread = 0F;
	/** shooting spread when the gun equipped with a laser pointer and the laser pointer is on(WLP = with laser pointer) */
	public float bulletSpreadWLP = 1F;
	/** this spread will effect when numBullets a shoot is bigger than one */
	public float shotGunSpread = 1F;
	public float shotGunAimingSpread = 1F;
	public float shotGunSpreadWLP = 1F;
	/** Damage inflicted by this gun. Multiplied by the bullet damage. */
	public float damage = 1F;
	/** The damage inflicted upon punching someone with this gun */
	public float meleeDamage = 1;
	/** The speed of bullets upon leaving this gun */
	public float bulletSpeed = 1F;
	/** The number of bullet entities created by each shot */
	public int numBullets = 1;
	/** The delay between shots in ticks (1/20ths of seconds) OUTDATED, USE RPM */
	public float shootDelay = 1F;
	/** The firing mode of the gun. One of semi-auto, full-auto, minigun or burst */
	public byte[] fireMode = new byte[]{ FireMode.FULL_AUTO };
	/** The number of bullets to fire per burst in burst mode */
	public int numBurstRounds = 3;
	/** The required speed for minigun mode guns to start firing */
	public float minigunStartSpeed = 15F;
	/** Whether this gun can be used underwater */
	public boolean canShootUnderwater = true;
	/** The amount of knockback to impact upon the player per shot */
	public float knockback = 0F;
	/** The secondary function of this gun. By default, the left mouse button triggers this */
	public EnumSecondaryFunction secondaryFunction = EnumSecondaryFunction.ADS_ZOOM;
	public EnumSecondaryFunction secondaryFunctionWhenShoot = null;
	/** For one shot items like a panzerfaust */
	public boolean consumeGunUponUse = false;
	/** Show the crosshair when holding this weapon */
	public boolean showCrosshair = false;
	/** Item to drop on shooting */
	public String dropItemOnShoot = null;
	/** Set these to make guns only usable by a certain type of entity */
	public boolean usableByPlayers = true, usableByMechas = true;
	/** Whether Gun makes players to be EnumAction.bow */
	public EnumAction itemUseAction = EnumAction.bow;
	
	//Launcher variables
	public int canLockOnAngle = 5;
	public int lockOnSoundTime = 0;
	public String lockOnSound = "";
	public int maxRangeLockOn = 80;
	public boolean canSetPosition = false;
	/** Determines what the launcher can lock on to */
	public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;


	//Shields
	/*A shield is actually a gun without any shoot functionality (similar to knives or binoculars)
	and a load of shield code on top. This means that guns can have in built shields (think Nerf Stampede) */
	/** Whether or not this gun has a shield piece */
	public boolean shield = false;
	/** Shield collision box definition. In model co-ordinates */
	public Vector3f shieldOrigin, shieldDimensions;
	/** Percentage of damage blocked between 0.00-1.00 (0.50F = 50%) */
	public float shieldDamageAbsorption = 0F;

	//Sounds
	/** The sound played upon shooting. subShootSound will be played when the barrel attachment of a gun requires it */
	public String[] shootSound = new String[]{ "" };
	/** The sound to play upon shooting on last round if the gun can lock slide on empty */
	public String lockSlideSound;
	public int lockSlideSoundRange = 5;
	/** The length of the sound for looping sounds */
	public int shootSoundLength;
	/** Whether to distort the sound or not. Generally only set to false for looping sounds */
	public String reloadSound;
	/** The sound to play open firing when empty(once) */
	public String emptyClickSound, safeEmptyClickSound;
	public int emptyClickSoundRange = 5;
	/** mode switch sound plays when changing the fire mode of a gun */
	public String modeSwitchSound;
	public int modeSwitchSoundRange = 5;
	//to separate it from the original codes
	
	//Sound Modifiers
	/** Whether to distort the sound or not. Generally only set to false for looping sounds */
	public boolean distortSound = true;
	/** The block range for melee sounds  */
	public int meleeSoundRange = 5;
	/** The block range for gunshots sounds  */
	public int gunSoundRange = 50;

	//Custom Melee Stuff
	/** The sound to play upon weapon swing */
	public String meleeSound;
	/** The time delay between custom melee attacks */
	public int meleeTime = 1;
	/** The path the melee weapon takes */
	public ArrayList<Vector3f> meleePath = new ArrayList<Vector3f>(), meleePathAngles = new ArrayList<Vector3f>();
	/** The points on the melee weapon that damage is actually done from. */
	public ArrayList<Vector3f> meleeDamagePoints = new ArrayList<Vector3f>();


	//Deployable Settings
	/** If true, then the bullet does not shoot when right clicked, but must instead be placed on the ground */
	public boolean deployable = false;
	/** The deployable model */
	@SideOnly(Side.CLIENT)
	public ModelMG deployableModel;
	/** The deployable model's texture*/
	public String deployableTexture;
	/** Various deployable settings controlling the player view limits and standing position */
	public float standBackDist = 1.5F, topViewLimit = -60F, bottomViewLimit = 30F, sideViewLimit = 45F, pivotHeight = 0.375F;

	//Default Scope Settings. Overriden by scope attachments
	//In many cases, this will simply be iron sights
	/** this controls the speed to aim and disaim */
	public float aimTimeConst = 0.66F, sightSwitchConst = 0.66F;

	//Model variables
	/** For guns with 3D models */
	@SideOnly(Side.CLIENT)
	public ModelGun model;
	@SideOnly(Side.CLIENT)
	public String modelName;
	/** arrow model */
	@SideOnly(Side.CLIENT)
	public ModelDefault arrowModel;
	/** For adding a bullet casing model to render 
	@SideOnly(Side.CLIENT)
	public ModelCasing casingModel;
	/** Set a bullet casing texture 
	public String casingTexture;
	/** For adding a muzzle flash model to render */
	@SideOnly(Side.CLIENT)
	public ModelDefault flashModel;
	public float muzzleFlashScale = 1F;
	/** how quick the muzzle flash will vanish */
	public float muzzleFlashVanishConst = 0.2F;
	/** Set a muzzle flash texture */
	public String flashTexture;
	public int numFlashTexture = 1;
	/** muzzle smoke and chamber smoke */
	@SideOnly(Side.CLIENT)
	public ModelDefault muzzleSmokeModel, chamberSmokeModel;
	public float muzzleSmokeScale = 1F, muzzleSmokeScaleEx = 0F, muzzleSmokeAt = 0F, chamberSmokeScale = 1F, chamberSmokeScaleEx = 0F;
	/** how quick the muzzle flash will vanish */
	public float muzzleSmokeVanishConst = 0.2F, chamberSmokeVanishConst = 0.2F;
	public boolean muzzleSmokeFreeRotate = true, chamberSmokeFreeRotate = false;
	/** Set a muzzle flash texture */
	public String muzzleSmokeTexture, chamberSmokeTexture;
	public int numMuzzleSmokeTexture = 1, numChamberSmokeTexture = 1;
	/** Set a hit marker texture */
	public String hitTexture;
	/** Model for arm */
	@SideOnly(Side.CLIENT)
	public ModelDefault leftArmModel, rightArmModel;
	@SideOnly(Side.CLIENT)
	public String leftArmTexture, rightArmTexture;

	//Attachment settings
	/** If this is true, then all attachments are allowed. Otherwise the list is checked */
	public boolean allowAllAttachments = false;
	/** The list of allowed attachments for this gun */
	public ArrayList<AttachmentType> allowedAttachments = new ArrayList<AttachmentType>();
	/** default attachments on gun */
	public DefaultAts defaultAts = null;

	/** The static hashmap of all guns by shortName */
	public static HashMap<String, GunType> guns = new HashMap<String, GunType>();
	/** The static list of all guns */
	public static ArrayList<GunType> gunList = new ArrayList<GunType>();

	//Modifiers
	/** Speeds up or slows down player movement when this item is held */
	public float moveSpeed = 1F, aimingMoveSpeed = 0.85F;
	/** if stockFoldedSpeedModifier not equals -1.0, then this gun can fold stock, gun model will translate the distance of "foldStockDistance" after this */
	public float stockFoldedSpeedModifier = -1F, foldStockDistance = 0F;
	/** if stockSteps is not zero, then this gun can adjust stock. if the stock of the gun has 4 positions available, then stockSteps should be 4. 
	* stockDistance is the total adjustable distance */
	public int stockSteps = 0;
	public float stockDistance = 0F;
	/** time to enter run pos and time to quit */
	public int runPoseTime = 6;
	/** time to enter rest position and time to undo it */
	public int restTime = 12, unrestTime = 6;
	/** Gives knockback resistance to the player */
	public float knockbackModifier = 0F;
	
	public GunType(TypeFile file) { super(file); }
	
	@Override
	public void preRead(TypeFile file) { super.preRead(file); }
	
	@Override
	public void postRead(TypeFile file)
	{
		super.postRead(file);
		if(shootDelay < 1F) shootDelay = 1F;
		gunLengthOffset *= modelScale;
		muzzleSmokeAt *= modelScale;
		
		float tempScale = muzzleSmokeScale - muzzleSmokeScaleEx;
		muzzleSmokeScale = muzzleSmokeScaleEx;
		muzzleSmokeScaleEx = tempScale;
		tempScale = chamberSmokeScale - chamberSmokeScaleEx;
		chamberSmokeScale = chamberSmokeScaleEx;
		chamberSmokeScaleEx = tempScale;
		gunList.add(this);
		guns.put(shortName, this);
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("MagVolume")) magVolume = Float.parseFloat(split[1]);
			else if(split[0].equals("GunLengthOffset")) gunLengthOffset = Float.parseFloat(split[1]) / 16F;
			else if(split[0].equals("SlideAcceleration"))
			{
				slideAcceleration[0] = Float.parseFloat(split[1]);
				slideAcceleration[1] = split.length == 2 ? slideAcceleration[0] : Float.parseFloat(split[2]);
			}
			/** for test 
			else if(split[0].equals("TestModel") && FMLCommonHandler.instance().getSide().isClient())
				testModel = FlansMod.proxy.loadModel(split[1], shortName, ModelDefault.class);
			/** for test */
			else if(split[0].equals("Damage") || split[0].equals("MagMoveSpeed"))
				damage = Float.parseFloat(split[1]);
			else if(split[0].equals("MeleeDamage"))
			{
				meleeDamage = Float.parseFloat(split[1]);
				if(meleeDamage > 0F) secondaryFunction = EnumSecondaryFunction.MELEE;
			}
			else if(split[0].equals("CanForceReload"))
				canForceReload = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("AllowRearm"))
				allowRearm = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("RecoilPitch"))
			{
				recoilPitch = Float.parseFloat(split[1]);
				if(split.length > 2) rndRecoilPitchRange = Float.parseFloat(split[2]) * 2F;
			}
			else if(split[0].equals("RecoilYaw"))
			{
				rndRecoilYawRange = Float.parseFloat(split[1]);
				if(split.length > 2) recoilYaw = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("MagRecoil"))
			{
				recoilPitch = Float.parseFloat(split[1]);
				if(split.length > 2) rndRecoilYawRange = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("ModelRecoil"))
			{
				switch(split.length)
				{
					case 9: recoilTransZConst = Float.parseFloat(split[8]);
					case 8: recoilTransYConst = Float.parseFloat(split[7]);
					case 7: recoilOnCamera = Float.parseFloat(split[6]);
					case 6: recoilTransXByYawConst = Float.parseFloat(split[5]);
					case 5: recoilTransXByPitchConst = Float.parseFloat(split[4]);
					case 4: recoilRotXConst = Float.parseFloat(split[3]);
					case 3: recoilRotYConst = Float.parseFloat(split[2]);
					default: recoilRotZConst = Float.parseFloat(split[1]);
				}
			}
			else if(split[0].equals("AntiModelRecoil"))
			{
				switch(split.length)
				{
					case 7: antiRecoilTransZConst = Float.parseFloat(split[6]);
					case 6: antiRecoilTransYConst = Float.parseFloat(split[5]);
					case 5: antiRecoilTransXConst = Float.parseFloat(split[4]);
					case 4: antiRecoilRotXConst = Float.parseFloat(split[3]);
					case 3: antiRecoilRotYConst = Float.parseFloat(split[2]);
					default: antiRecoilRotZConst = Float.parseFloat(split[1]);
				}
			}
			else if(split[0].equals("Knockback"))
				knockback = Float.parseFloat(split[1]);
			else if(split[0].equals("LoadMagTime"))
			{
				shotGunSpread = Float.parseFloat(split[1]);
				if(split.length > 2) shotGunAimingSpread = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("Spread") || split[0].equals("MagRunPosTime"))
			{
				bulletSpread = Float.parseFloat(split[1]);
				if(split.length > 2) shotGunSpread = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("AimingSpread"))
			{
				bulletAimingSpread = Float.parseFloat(split[1]);
				if(split.length > 2) shotGunAimingSpread = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("SpreadWLP"))
			{
				bulletSpreadWLP = Float.parseFloat(split[1]);
				if(split.length > 2) shotGunSpreadWLP = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("NumBullets"))
				numBullets = Integer.parseInt(split[1]);
			else if(split[0].equals("CanLockAngle"))
				canLockOnAngle = Integer.parseInt(split[1]);
			else if(split[0].equals("LockOnSoundTime"))
				lockOnSoundTime = Integer.parseInt(split[1]);
			else if(split[0].equals("LockOnToDriveables"))
				lockOnToPlanes = lockOnToVehicles = lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToVehicles"))
				lockOnToVehicles = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToPlanes"))
				lockOnToPlanes = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToMechas"))
				lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToPlayers"))
				lockOnToPlayers = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToLivings"))
				lockOnToLivings = Boolean.parseBoolean(split[1].toLowerCase());	
			
			else if(split[0].equals("ConsumeGunOnUse"))
				consumeGunUponUse = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ShowCrosshair"))
				showCrosshair = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("DropItemOnShoot"))
				dropItemOnShoot = split[1];
			else if(split[0].equals("NumBurstRounds"))
				numBurstRounds = Integer.parseInt(split[1]);
			else if(split[0].equals("MinigunStartSpeed"))
				minigunStartSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("ItemUseAction"))
				itemUseAction = EnumAction.valueOf(split[1].toLowerCase());
			else if(split[0].equals("MaxRangeLockOn"))
				maxRangeLockOn = Integer.parseInt(split[1]);

			//Sounds
			else if(split[0].equals("ShootDelay"))
				shootDelay = Float.parseFloat(split[1]);
			else if(split[0].equals("RoundsPerMin"))
				shootDelay = 1200F / Float.parseFloat(split[1]);
			else if(split[0].equals("SoundLength"))
				shootSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("DistortSound"))
				distortSound = split[1].equals("True");
			else if(split[0].equals("MeleeSoundRange"))
				meleeSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("ShootSoundRange"))
				gunSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("ShootSound"))
			{
				shootSound = new String[split.length - 1];
				for(int i = shootSound.length; --i >= 0; ) FlansMod.proxy.loadSound(contentPack, "guns", shootSound[i] = split[i + 1]);
			}
			else if(split[0].equals("LockSlideSound"))
			{
				FlansMod.proxy.loadSound(contentPack, "guns", lockSlideSound = split[1]);
				if(split.length > 2) lockSlideSoundRange = Integer.parseInt(split[2]);
			}
			else if(split[0].equals("ReloadSound"))
			{
				reloadSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("EmptyClickSound"))
			{
				FlansMod.proxy.loadSound(contentPack, "guns", emptyClickSound = split[1]);
				if(split.length > 2) emptyClickSoundRange = Integer.parseInt(split[2]);
				if(split.length > 3) FlansMod.proxy.loadSound(contentPack, "guns", safeEmptyClickSound = split[3]);
			}
			else if(split[0].equals("MeleeSound"))
			{
				meleeSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("LockOnSound"))
			{
				lockOnSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}

			//Modes and zoom settings
			else if(split[0].equals("Mode"))
			{
				fireMode = new byte[split.length - 1];
				for(int i = fireMode.length; --i >= 0; ) fireMode[i] = FireMode.parseFireMode(split[1 + i]);
			}
			else if(split[0].equals("ModeSwitchSound"))
			{
				FlansMod.proxy.loadSound(contentPack, "guns", modeSwitchSound = split[1]);
				if(split.length > 2) modeSwitchSoundRange = Integer.parseInt(split[2]);
			}
			else if(split[0].equals("AimTime"))
				aimTimeConst = Float.parseFloat(split[1]);
			else if(split[0].equals("SightSwitch")) sightSwitchConst = Float.parseFloat(split[1]); 
			else if(split[0].equals("Deployable"))
				deployable = split[1].equals("True");
			else if(deployable && split[0].equals("DeployedModel") && FMLCommonHandler.instance().getSide().isClient())
				deployableModel = FlansMod.proxy.loadModel(split[1], shortName, ModelMG.class);
			else if(split[0].equals("Model"))
			{
				switch(split.length)
				{
					case 4: modelScale = Float.parseFloat(split[3]);
					case 3: texture = split[2];
					default: if(FMLCommonHandler.instance().getSide().isClient())
						model = FlansMod.proxy.loadModel(modelName = split[1], shortName, ModelGun.class);
				}
			}
			else if(split[0].equals("ArrowModel") && FMLCommonHandler.instance().getSide().isClient())
				arrowModel = FlansMod.proxy.loadModel(split[1], shortName, ModelDefault.class);
			else if(split[0].equals("FlashModel"))
			{
				switch(split.length)
				{
					case 6: numFlashTexture = Integer.parseInt(split[5]);
					case 5: muzzleFlashScale = Float.parseFloat(split[4]);
					case 4: if(!split[3].equals("None")) flashTexture = split[3];
					case 3: if(FMLCommonHandler.instance().getSide().isClient())
						flashModel = FlansMod.proxy.loadModel(split[2], shortName, ModelDefault.class);
					default: muzzleFlashVanishConst = Float.parseFloat(split[1]);
				}
			}
			else if(split[0].equals("MagFollowerModel"))
			{
				switch(split.length)
				{
					case 4: if(split.length > 3) muzzleFlashScale = Float.parseFloat(split[3]);
					case 3: if(!split[2].equals("None")) flashTexture = split[2];
					default: if(FMLCommonHandler.instance().getSide().isClient())
							flashModel = FlansMod.proxy.loadModel(split[1], shortName, ModelDefault.class);
				}
			}
			else if(split[0].equals("MuzzleSmokeModel"))
			{
				switch(split.length)
				{
					case 9: muzzleSmokeFreeRotate = Boolean.parseBoolean(split[8]);
					case 8: numMuzzleSmokeTexture = Integer.parseInt(split[7]);
					case 7: muzzleSmokeScaleEx = Float.parseFloat(split[6]);
					case 6: muzzleSmokeScale = Float.parseFloat(split[5]);
					case 5: if(!split[4].equals("None")) muzzleSmokeTexture = split[4];
					case 4: if(FMLCommonHandler.instance().getSide().isClient())
						muzzleSmokeModel = FlansMod.proxy.loadModel(split[3], shortName, ModelDefault.class);
					case 3: muzzleSmokeAt = Float.parseFloat(split[2]) / 16F;
					default: muzzleSmokeVanishConst = Float.parseFloat(split[1]);
				}
			}
			else if(split[0].equals("ChamberSmokeModel"))
			{
				switch(split.length)
				{
					case 8: chamberSmokeFreeRotate = Boolean.parseBoolean(split[7]);
					case 7: numChamberSmokeTexture = Integer.parseInt(split[6]);
					case 6: chamberSmokeScaleEx = Float.parseFloat(split[5]);
					case 5: chamberSmokeScale = Float.parseFloat(split[4]);
					case 4: if(!split[3].equals("None")) chamberSmokeTexture = split[3];
					case 3: if(FMLCommonHandler.instance().getSide().isClient())
						chamberSmokeModel = FlansMod.proxy.loadModel(split[2], shortName, ModelDefault.class);
					default: chamberSmokeVanishConst = Float.parseFloat(split[1]);
				}
			}
			else if(split[0].equals("ArmModel") && FMLCommonHandler.instance().getSide().isClient())
			{
				switch(split.length)
				{
					case 5: if(!split[4].equals("None")) rightArmTexture = split[4];
					case 4: if(!split[3].equals("None")) leftArmTexture = split[3];
					case 3: if(!split[2].equals("None")) rightArmModel = FlansMod.proxy.loadModel(split[2], shortName, ModelDefault.class);
					default: if(!split[1].equals("None")) leftArmModel = FlansMod.proxy.loadModel(split[1], shortName, ModelDefault.class);
				}
			}
			else if(split[0].equals("HitTexture"))
				hitTexture = split[1];
			else if(split[0].equals("DeployedTexture"))
				deployableTexture = split[1];
			else if(split[0].equals("StandBackDistance"))
				standBackDist = Float.parseFloat(split[1]);
			else if(split[0].equals("TopViewLimit"))
				topViewLimit = -Float.parseFloat(split[1]);
			else if(split[0].equals("BottomViewLimit"))
				bottomViewLimit = Float.parseFloat(split[1]);
			else if(split[0].equals("SideViewLimit"))
				sideViewLimit = Float.parseFloat(split[1]);
			else if(split[0].equals("PivotHeight"))
				pivotHeight = Float.parseFloat(split[1]);
			else if(split[0].equals("Ammo"))
			{
				ammo = new int[split.length - 1];
				for(int i = split.length; --i > 0; ) ammo[i - 1] = split[i].hashCode();
			}
			else if(split[0].equals("Mag") || split[0].equals("MagType"))
			{
				magazine = new int[split.length - 1];
				for(int i = split.length; --i > 0; ) magazine[i - 1] = split[i].hashCode();
			}
			else if(split[0].equals("AmmoCapacity")) ammoCapacity = Integer.parseInt(split[1]);
			else if(split[0].equals("ItsType")) itsType = parseItsType(split[1]);
			else if(split[0].equals("ReloadSteps"))
			{
				reloadSteps = new byte[split.length - 1];
				for(int i = 0; ++i < split.length; )
				{
					if(split[i].equals("tilt")) reloadSteps[i - 1] = GunOperation.TILT_GUN;
					else if(split[i].equals("unloadmag")) reloadSteps[i - 1] = GunOperation.UNLOAD_MAG;
					else if(split[i].equals("loadmag")) reloadSteps[i - 1] = GunOperation.LOAD_MAG;
					else if(split[i].equals("charge")) reloadSteps[i - 1] = GunOperation.CHARGE;
					else if(split[i].equals("release")) reloadSteps[i - 1] = GunOperation.RELEASE_BOLT;
					else if(split[i].equals("untilt")) reloadSteps[i - 1] = GunOperation.UNTILT_GUN;
					else reloadSteps[i - 1] = GunOperation.NONE;
				}
			}
			else if(split[0].equals("ReloadTimes"))
			{
				reloadTimes = new int[split.length - 1];
				for(int i=0; i < reloadTimes.length; ++i) reloadTimes[i] = Integer.parseInt(split[i + 1]);
			}
			else if(split[0].equals("ReloadSounds"))
			{
				reloadSounds = new String[split.length - 1];
				for(int i = reloadSounds.length; --i >= 0; ) FlansMod.proxy.loadSound(contentPack, "guns", reloadSounds[i] = split[i + 1]);
			}
			else if(split[0].equals("ReloadSoundRanges"))
			{
				reloadSoundRanges = new int[split.length - 1];
				
				for(int i=0; i < reloadSoundRanges.length; i++)
					reloadSoundRanges[i] = Integer.parseInt(split[i + 1]);
			}
			else if(split[0].equals("MagSoundTime"))
				pushMagSoundTime = Float.parseFloat(split[1]);
			else if(split[0].equals("BulletSoundTime"))
			{
				pushBulletSoundTime = Float.parseFloat(split[1]);
				if(split.length >2)
					pullBulletSoundTime = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("CheckAmmo"))
			{
				switch(split.length)
				{
					case 7: checkAmmoSoundR = Float.parseFloat(split[6]);
					case 6: checkAmmoSoundTime[1] = Float.parseFloat(split[5]);
					case 5: FlansMod.proxy.loadSound(contentPack, "guns", checkAmmoSound[1] = split[4]);
					case 4: checkAmmoSoundTime[0] = Float.parseFloat(split[3]);
					case 3: FlansMod.proxy.loadSound(contentPack, "guns", checkAmmoSound[0] = split[2]);
					default: checkAmmoTime = Float.parseFloat(split[1]);
				}
			}
			else if(split[0].equals("CheckChamber"))
			{
				switch(split.length)
				{
					case 7: checkChamberSoundR = Short.parseShort(split[6]);
					case 6: checkChamberSoundTime[1] = Float.parseFloat(split[5]);
					case 5: FlansMod.proxy.loadSound(contentPack, "guns", checkChamberSound[1] = split[4]);
					case 4: checkChamberSoundTime[0] = Float.parseFloat(split[3]);
					case 3: FlansMod.proxy.loadSound(contentPack, "guns", checkChamberSound[0] = split[2]);
					default: checkChamberTime[0] = Short.parseShort(split[1]);
				}
			}
			else if(split[0].equals("CheckChamberBC"))
			{
				switch(split.length)
				{
					case 6: checkChamberSoundTime[3] = Float.parseFloat(split[5]);
					case 5: FlansMod.proxy.loadSound(contentPack, "guns", checkChamberSound[3] = split[4]);
					case 4: checkAmmoSoundTime[2] = Float.parseFloat(split[3]);
					case 3: FlansMod.proxy.loadSound(contentPack, "guns", checkAmmoSound[2] = split[2]);
					default: checkChamberTime[1] = Short.parseShort(split[1]);
				}
			}
			else if(split[0].equals("CheckAmmoState"))
			{
				if(split.length < 4) return;
				String state = split[3];
				for(int i = 3; ++i < split.length; ) state += " " + split[i];
				short a = Short.parseShort(split[1]), b = Short.parseShort(split[2]);
				checkAmmoStates.add(new SimpleEntry<Integer, String>(a < b ? (a << 16) + b : (b << 16) + a, state));
			}
			else if(split[0].equals("ReleaseSlide"))
			{
				switch(split.length)
				{
					case 6: releaseBoltSoundR[1] = Short.parseShort(split[5]);
					case 5: FlansMod.proxy.loadSound(contentPack, "guns", releaseBoltSound[1] = split[4]);
					case 4: releaseBoltSoundR[0] = Short.parseShort(split[3]);
					case 3: FlansMod.proxy.loadSound(contentPack, "guns", releaseBoltSound[0] = split[2]);
					default: releaseSlideTime = Short.parseShort(split[1]);
				}
			}
			else if(split[0].equals("ChargeTime"))
			{
				switch(split.length)
				{
					case 14: chargeSoundR[5] = Short.parseShort(split[13]);
					case 13: FlansMod.proxy.loadSound(contentPack, "guns", chargeSound[5] = split[12]);
					case 12: chargeSoundR[4] = Short.parseShort(split[11]);
					case 11: FlansMod.proxy.loadSound(contentPack, "guns", chargeSound[4] = split[10]);
					case 10: chargeSoundR[3] = Short.parseShort(split[9]);
					case 9: FlansMod.proxy.loadSound(contentPack, "guns", chargeSound[3] = split[8]);
					case 8: chargeSoundR[2] = Short.parseShort(split[7]);
					case 7: FlansMod.proxy.loadSound(contentPack, "guns", chargeSound[2] = split[6]);
					case 6: chargeSoundR[1] = Short.parseShort(split[5]);
					case 5: FlansMod.proxy.loadSound(contentPack, "guns", chargeSound[1] = split[4]);
					case 4: chargeSoundR[0] = Short.parseShort(split[3]);
					case 3: FlansMod.proxy.loadSound(contentPack, "guns", chargeSound[0] = split[2]);
					default: chargeTime = Short.parseShort(split[1]);
				}
			}
			else if(split[0].equals("ChargeDelay")) chargeDelay = Short.parseShort(split[1]);
			
			else if(split[0].equals("BulletSpeed") || split[0].equals("MagAimTime"))
				bulletSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("CanShootUnderwater"))
				canShootUnderwater = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("CanSetPosition"))
				canSetPosition = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("SecondaryFunction"))
				secondaryFunction = EnumSecondaryFunction.get(split[1]);
			else if(split[0].equals("UsableByPlayers"))
				usableByPlayers = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("UsableByMechas"))
				usableByMechas = Boolean.parseBoolean(split[1]);
			
			//Custom Melee Stuff
			else if(split[0].equals("UseCustomMelee") && Boolean.parseBoolean(split[1]))
				secondaryFunction = EnumSecondaryFunction.CUSTOM_MELEE;
			else if(split[0].equals("UseCustomMeleeWhenShoot") && Boolean.parseBoolean(split[1]))
				secondaryFunctionWhenShoot = EnumSecondaryFunction.CUSTOM_MELEE;
			else if(split[0].equals("MeleeTime"))
				meleeTime = Integer.parseInt(split[1]);
			else if(split[0].equals("AddNode"))
			{
				meleePath.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
				meleePathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
			}
			else if(split[0].equals("MeleeDamagePoint") || split[0].equals("MeleeDamageOffset"))
				meleeDamagePoints.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));

			//Player modifiers
			else if(split[0].equals("MoveSpeedModifier"))
			{
				moveSpeed = Float.parseFloat(split[1]);
				if(split.length > 2)
					aimingMoveSpeed = moveSpeed * Float.parseFloat(split[2]);
			}
			else if(split[0].equals("StockFoldedSpeedModifier"))
				stockFoldedSpeedModifier = Float.parseFloat(split[1]);
			else if(split[0].equals("FoldStockDistance"))
				foldStockDistance = Float.parseFloat(split[1]);
			else if(split[0].equals("StockSteps"))
			{
				stockSteps = Integer.parseInt(split[1]) - 1;
				if(split.length > 2)
					stockDistance = Float.parseFloat(split[2]);
			}
			else if(split[0].equals("RunPoseTime")) runPoseTime = Integer.parseInt(split[1]);
			else if(split[0].equals("TakeOutTime"))
				takeOutTime = Integer.parseInt(split[1]);
			else if(split[0].equals("RestTime"))
			{
				restTime = Integer.parseInt(split[1]);
				if(split.length > 2)
					unrestTime = Integer.parseInt(split[2]);
			}
			//to separate it from the original codes
			else if(split[0].equals("KnockbackReduction") || split[0].equals("KnockbackModifier"))
				knockbackModifier = Float.parseFloat(split[1]);
			
			//Attachment settings
			else if(split[0].equals("AllowAllAttachments"))
				allowAllAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("AllowAttachments"))
			{
				for(int i = 1; i < split.length; i++)
					allowedAttachments.add(AttachmentType.getAttachment(split[i]));
			}
			else if(split[0].equals("DefaultAttachments")) (defaultAts = new DefaultAts(this)).parseDefaultAts(split, 0);
			else if(split[0].toLowerCase().equals("shield")) //Shield settings
			{
				shield = true;
				shieldDamageAbsorption = Float.parseFloat(split[1]);
				shieldOrigin = new Vector3f(Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F);
				shieldDimensions = new Vector3f(Float.parseFloat(split[5]) / 16F, Float.parseFloat(split[6]) / 16F, Float.parseFloat(split[7]) / 16F);
			}
		}
		catch(Exception e)
		{
			String line = split[0];
			for(int i = 1; i < split.length; ++i) line += " " + split[i];
			FlansMod.log("error > failed to parse line <" + line + "> for gun <" + shortName + ">");
			if(FlansMod.printStackTrace) e.printStackTrace();
		}
		/**  if(FMLCommonHandler.instance().getSide().isServer()) throw new NullPointerException(); /** */
	}
	
	private static byte parseItsType(String s)
	{
		s = s.toLowerCase();
		if(s.equals("mag")) return ItsType.MAG;
		if(s.equals("boltgun")) return ItsType.BOLT_GUN;
		return ItsType.AUTO_GUN;
	}
	
	/** Static String to GunType method */
	public static GunType getGun(String s) { return guns.get(s); }
	
	/* gun tags MARK */
	public static class GunTag
	{
		public static final String AMMO = "am", MAGAZINE = "ma", MAG_ID_DAM = "ar", MAG_NBTTAG = "ta", SIGHT_AT = "si";
		private static byte a = 0;
		public static final byte TOF = a++, MUZZLE_GRIP = a++, TAKE_OUT_TIME = a++, RUN_POSE_TIME = a++, REST_TIME = a++, QUIT_REST_TIME = a++, 
				SHOOT_DELAY = a++, RECOIL_PITCH = a++, RND_RECOIL_PITCH = a++, RECOIL_YAW = a++, RND_RECOIL_YAW = a++, RECOIL_ROT_Z = a++, RECOIL_ROT_Y = a++, 
				RECOIL_TRANS_X_BY_PITCH = a++, RECOIL_TRANS_X_BY_YAW = a++, RECOIL_ON_CAMERA = a++, SPREAD = a++, AIM_SPREAD = a++, SHOTGUN_SPREAD = a++, 
				SHOTGUN_AIM_SPREAD = a++, DAMAGE = a++, BULLET_SPEED = a++, MOVE_SPEED = a++, AIM_MOVE_SPEED = a++, AIM_TIME = a++, SIGHT_SWITCH = a++, 
				GUN_SOUND_RANGE = a++, FLASH_CONST = a++, FLASH_SCALE = a++, LIGHT_RANGE = a++, GUN_LENGTH = a++, SMOKE_AT = a++;
		public static final int AIM_ON = 1, AIM_OFF = -2, BOLT_CATCH_ON = 2, BOLT_CATCH_OFF = -3, RUN_POSE_ON = 4, RUN_POSE_OFF = -5, LASER_ON = 8, LASER_OFF = -9, 
				CAN_SHOOT_ON = 16, CAN_SHOOT_OFF = -17, CAN_AUTO_ON = 32, CAN_AUTO_OFF = -33, CAN_CHARGE_ON = 64, CAN_CHARGE_OFF = -65, 
				MAG_USED_ON = 128, MAG_USED_OFF = -129, STOCK_FOLD_ON = 256, STOCK_FOLD_OFF = -257;
		public static final int SIGHT_ON_USE_MASK = -1 >>> 8, FIRE_MODE_MASK = (-1 >>> 16) + (-1 << 24);
		public static final byte NO_SIGHT = -1;
	}
	
	/** Method to check for null tags and assign default empty tags if that is the case */
	public static void checkForTags(ItemStack gunStack)
	{
		if(hasStates(gunStack)) return;
		if(gunStack.stackTagCompound == null) gunStack.stackTagCompound = new NBTTagCompound();
		GunType gunType = ((ItemGun)gunStack.getItem()).type;
		gunStack.stackTagCompound.setIntArray(GunTag.AMMO, gunType.newAmmoArray()); // ammo tag
		gunStack.stackTagCompound.setTag(GunTag.MAGAZINE, newMagTag(gunType.itsType == ItsType.MAG)); // mag tag
		
		NBTTagList prList = new NBTTagList();
		gunStack.stackTagCompound.setTag(ModifiableTag.PR_LIST, prList);
		for(int i = gunType.slots.length; --i >= 0; ) prList.appendTag(new NBTTagList()); // add pr tag
		if(gunType.defaultAts != null) gunType.defaultAts.addDefaultAttachmentToTag(gunStack.stackTagCompound); // set default attachments
		
		gunStack.stackTagCompound.setIntArray(ModifiableTag.STATES, new int[GunTag.a]); // set states tag
		gunType.setGunStates(gunStack); // set gun state according to the attachments installed
		gunType.setGunOperatable(gunStack); // set gun can shoot, can auto and can charge
		gunStack.stackTagCompound.setTag(GunTag.SIGHT_AT, new NBTTagList());
		gunType.setSightsAtForGun(gunStack); // handle sight
	}
	
	public void setGunStates(ItemStack gunStack)
	{
		int i = slots.length, states[] = getStates(gunStack), intStates[] = new int[]{ 0, -1 };
		float[] floatStates = new float[]
				{ 0F, 0F, takeOutTime, runPoseTime, restTime, unrestTime, 
				shootDelay, recoilPitch, rndRecoilPitchRange, recoilYaw, rndRecoilYawRange, recoilRotZConst, recoilRotYConst, 
				recoilTransXByPitchConst, recoilTransXByYawConst, recoilOnCamera, bulletSpread, bulletAimingSpread, shotGunSpread, 
				shotGunAimingSpread, damage, bulletSpeed, moveSpeed, aimingMoveSpeed, aimTimeConst, sightSwitchConst, 
				gunSoundRange, muzzleFlashVanishConst, muzzleFlashScale, -1F, 0F, 0F };
		NBTTagList prList = getAtTagList(gunStack);
		addContribution(gunStack.stackTagCompound, slots.length, floatStates, intStates); // accumulate states of the gun
		for(i = states.length; --i > 1; ) states[i] = Float.floatToIntBits(floatStates[i]); // copy states to int array
		for(i = intStates.length; --i >= 0; ) states[i] = intStates[i];
		LinkedList<byte[]> muzzleAt = AttachmentType.getAttachmentAtByType(gunStack.stackTagCompound, new byte[0], ItsType.MUZZLE, ItsType.NONE);
		float smokeAt = 0F; //TODO: float array no longer used, use it here
		if(muzzleAt.size() > 0 || AttachmentType.getAttachmentAtByType(gunStack.stackTagCompound, new byte[0], ItsType.BARREL, ItsType.NONE, muzzleAt).size() > 0)
			smokeAt = getXCoorOfAtAt(gunStack.stackTagCompound, this, muzzleAt.get(0)) + getAttachmentAt(gunStack, muzzleAt.get(0)).muzzleSmokeAt;
		else smokeAt = muzzleSmokeAt;
		states[GunTag.SMOKE_AT] = Float.floatToIntBits(smokeAt + gunLengthOffset);
		float gunLen;
		states[GunTag.GUN_LENGTH] = Float.floatToIntBits(gunLen = getGunLength(gunStack.stackTagCompound, 0F) + gunLengthOffset);
	}
	
	public static void addContribution(NBTTagCompound atTag, int i, float[] floatStates, int[] intStates)
	{
		AttachmentType thisAt;
		NBTTagList prList = getPRList(atTag), prTag;
		int atStates[], j;
		while(--i >= 0)
		{
			for(j = (prTag = getTagListFromTagList(prList, i)).tagCount(); --j >= 0; )
			{
				thisAt = AttachmentType.getAtType(atTag = prTag.getCompoundTagAt(j));
				floatStates[GunTag.TAKE_OUT_TIME] *= thisAt.takeOutTimeMult; //takeOutTime
				floatStates[GunTag.RUN_POSE_TIME] *= thisAt.runPosTimeMult; //runPoseTime
				floatStates[GunTag.RECOIL_PITCH] *= thisAt.recoilMult; //recoilPitch
				floatStates[GunTag.RND_RECOIL_PITCH] *= thisAt.recoilMult; //random recoilPitch
				floatStates[GunTag.RECOIL_YAW] *= thisAt.recoilYawMult; //recoilYaw
				floatStates[GunTag.RND_RECOIL_YAW] *= thisAt.recoilYawMult; //random recoilYaw
				floatStates[GunTag.RECOIL_ROT_Z] *= thisAt.recoilRotZMult; //recoilAngle
				floatStates[GunTag.RECOIL_ROT_Y] *= thisAt.recoilRotYMult; //recoilYawAngle
				floatStates[GunTag.RECOIL_TRANS_X_BY_PITCH] *= thisAt.recoilTransXByPitchMult; //recoilDistanceConst
				floatStates[GunTag.RECOIL_TRANS_X_BY_YAW] *= thisAt.recoilTransXByYawMult; //recoilYawDisConst
				floatStates[GunTag.RECOIL_ON_CAMERA] *= thisAt.cameraRecoilMult; //cameraRecoil
				floatStates[GunTag.SPREAD] *= thisAt.spreadMultiplier; //hipShootingSpread
				floatStates[GunTag.AIM_SPREAD] *= thisAt.spreadMultiplier; //aimingShootingSpread
				floatStates[GunTag.SHOTGUN_SPREAD] *= thisAt.spreadMultiplier; //shot gun hipShootingSpread
				floatStates[GunTag.SHOTGUN_AIM_SPREAD] *= thisAt.spreadMultiplier; //shot gun aimingShootingSpread
				floatStates[GunTag.DAMAGE] *= thisAt.damageMultiplier; //damage
				floatStates[GunTag.BULLET_SPEED] *= thisAt.bulletSpeedMultiplier; //bulletSpeed
				floatStates[GunTag.MOVE_SPEED] *= thisAt.moveSpeedMultiplier; //moveSpeed
				floatStates[GunTag.AIM_MOVE_SPEED] *= thisAt.aimingMoveSpeedMultiplier; //move speed when aiming
				floatStates[GunTag.AIM_TIME] *= thisAt.aimTimeMult; //aimTimeConst
				floatStates[GunTag.SIGHT_SWITCH] *= thisAt.sightSwitchMult;
				floatStates[GunTag.GUN_SOUND_RANGE] *= thisAt.soundRangeMultiplier; //shootSoundRange
				floatStates[GunTag.FLASH_CONST] *= thisAt.muzzleFlashVanishConst; //muzzleFlashVanishConst
				if(thisAt.itsType == ItsType.BARREL || thisAt.itsType == ItsType.MUZZLE) intStates[GunTag.MUZZLE_GRIP] = 
					(intStates[GunTag.MUZZLE_GRIP] << 16 >>> 16) + (Item.getIdFromItem(thisAt.item) << 16);
				else if(thisAt.itsType == ItsType.GRIP) intStates[GunTag.MUZZLE_GRIP] 
						= (intStates[GunTag.MUZZLE_GRIP] >>> 16 << 16) + Item.getIdFromItem(thisAt.item);
				if(AttachmentType.getTOF(atStates = AttachmentType.getStates(atTag), AttachmentTag.LASER_ON)) intStates[GunTag.TOF] |= GunTag.LASER_ON; // laser
				if(AttachmentType.getTOF(atStates, AttachmentTag.LIGHT_ON) && floatStates[GunTag.LIGHT_RANGE] < thisAt.flashlightRange)
					floatStates[GunTag.LIGHT_RANGE] = thisAt.flashlightRange; // light
				addContribution(atTag, thisAt.slots.length, floatStates, intStates);
			}
		}
	}
	
	public void setGunOperatable(ItemStack gunStack)
	{
		boolean[] cans = new boolean[3];
		cans[0] = cans[1] = cans[2] = true; // default to be all true
		checkCanOperate(gunStack.stackTagCompound, cans); // if any of them not fit requirement, it will be set to false
		int[] states = getStates(gunStack); // get tof and set for each can
		//FlansModClient.addTestMessage("three boolean: " + cans[0] + " " + cans[1] + " " + cans[2]); //for test
		setTOF(states, cans[0] ? GunTag.CAN_SHOOT_ON : GunTag.CAN_SHOOT_OFF);
		setTOF(states, cans[1] ? GunTag.CAN_AUTO_ON : GunTag.CAN_AUTO_OFF);
		setTOF(states, cans[2] ? GunTag.CAN_CHARGE_ON : GunTag.CAN_CHARGE_OFF);
	}
	
	/* methods to handle gun states MARK */
	public static boolean hasStates(ItemStack stack) { return stack.stackTagCompound != null && stack.stackTagCompound.hasKey(ModifiableTag.STATES); }
	
	public static int[] getStates(ItemStack gunStack) { return ((NBTTagIntArray)gunStack.stackTagCompound.getTag(ModifiableTag.STATES)).func_150302_c(); }
	
	public static AttachmentType getMuzzleType(int[] states)
	{ return states[GunTag.MUZZLE_GRIP] < 0 ? null : ((ItemAttachment)Item.getItemById(states[GunTag.MUZZLE_GRIP] >>> 16)).type; }
	
	public static AttachmentType getGripType(int[] states)
	{
		int i = states[GunTag.MUZZLE_GRIP] << 16;
		return i < 0 ? null : ((ItemAttachment)Item.getItemById(i >>> 16)).type;
	}
	
	public static boolean hasGrip(int[] states) { return getGripType(states) != null; }
	
	public static float getAimTimeConst(int[] states, int[] magStates)
	{ return magStates == null ? getState(states, GunTag.AIM_TIME) : getState(states, GunTag.AIM_TIME) * getState(magStates, GunTag.BULLET_SPEED); }

	public static float getMoveSpeed(int[] states, int[] magStates)
	{
		if(magStates == null) return getTOF(states, GunTag.AIM_ON) ? getState(states, GunTag.AIM_MOVE_SPEED) : getState(states, GunTag.MOVE_SPEED);
		return (getTOF(states, GunTag.AIM_ON) ? getState(states, GunTag.AIM_MOVE_SPEED) : getState(states, GunTag.MOVE_SPEED))
				* getState(magStates, GunTag.DAMAGE);
	}
	
	public float getMoveSpeed(ItemStack gunStack)
	{
		if(itsType == ItsType.MAG) return getMoveSpeed(getStates(gunStack), null);
		NBTTagCompound magTag = getMagTag(gunStack);
		return getMoveSpeed(getStates(gunStack), getMagType(getMagIdDam(magTag)) == null ? null : getMagStates(magTag));
	}
	
	/* methods to handle tof tag MARK */
	public static boolean getTOF(int[] states, int target) { return (states[GunTag.TOF] & target) != 0; }
	
	public static void setTOF(int[] states, int tofTag)
	{ if(tofTag > 0) setTOFOn(states, tofTag); else setTOFOff(states, tofTag); }
	
	public static void setTOFOn(int[] states, int onInt) { states[GunTag.TOF] |= onInt; }
	
	public static void setTOFOff(int[] states, int offInt) { states[GunTag.TOF] &= offInt; }
	
	/* methods to handle fire mode MARK */
	public static class FireMode
	{
		public static final byte SAFE = 0, SEMI_AUTO = 1, FULL_AUTO = 2, BURST = 3, MINIGUN = 4;
		// head 8 bits of TOF is used to storage fire mode index
		public static byte parseFireMode(String s)
		{
			if((s = s.toLowerCase()).equals("safe")) return SAFE;
			if(s.equals("fullauto")) return FULL_AUTO;
			return s.equals("burst") ? BURST : SEMI_AUTO;
		}
		
		@SideOnly(Side.CLIENT)
		public static String getFireModeString(byte mode, byte itsType)
		{
			String s;
			if(mode == SAFE) s = "firemode.safe";
			else if(itsType == ItsType.BOLT_GUN) s = "firemode.firemode";
			else if(mode == FULL_AUTO) s = "firemode.fullauto";
			else if(mode == SEMI_AUTO) s = "firemode.semiauto";
			else if(mode == BURST) s = "firemode.burst";
			else return "unkown";
			return I18n.format(s);
		}
	}
	
	public byte getFireMode(int[] states) { return fireMode[states[GunTag.TOF] << 8 >>> 24]; }
	
	public static byte getFireModeNum(int[] states) { return (byte)(states[GunTag.TOF] << 8 >>> 24); }
	
	public static void setFireMode(int[] states, byte fireModeNum)
	{ states[GunTag.TOF] = (states[GunTag.TOF] & GunTag.FIRE_MODE_MASK) + (fireModeNum << 16); }
	
	/* methods to operate ammo MARK */
	public boolean isValidAmmo(ItemStack ammo)
	{ return ammo != null && ammo.getItem() instanceof ItemShootable && isValidAmmo(((ItemShootable)ammo.getItem()).type); }
	
	public boolean isValidAmmo(ShootableType ammoType)
	{
		for(int i = ammo.length; --i >= 0; ) if(ammoType.ammoType == ammo[i]) return true;
		return false;
	}
	
	public int[] newAmmoArray()
	{
		int[] ammoArray = new int[ammoCapacity / 2 + (ammoCapacity & 1)];
		for(int i = ammoArray.length; --i >= 0; ) ammoArray[i] = -1;
		return ammoArray;
	}
	
	public static int[] getAmmoArray(NBTTagCompound tag) { return ((NBTTagIntArray)tag.getTag(GunTag.AMMO)).func_150302_c(); }
	
	public static int[] getAmmoArray(ItemStack gunStack)
	{ return ((NBTTagIntArray)gunStack.stackTagCompound.getTag(GunTag.AMMO)).func_150302_c(); }
	
	public static void setAmmoAt(ItemStack gunStack, int i, ShootableType ammo) { setAmmoAt(getAmmoArray(gunStack), i, ammo); }

	public static final int NO_AMMO = -1 << 16 >>> 16;
	public static void setAmmoAt(int[] ammoArray, int i, ShootableType ammo)
	{
		if((i & 1) == 0) ammoArray[i >>>= 1] = (ammoArray[i] << 16 >>> 16) | ((ammo == null ? NO_AMMO : Item.getIdFromItem(ammo.item)) << 16); // even index
		else ammoArray[i >>>= 1] = (ammoArray[i] >>> 16 << 16) | (ammo == null ? NO_AMMO : Item.getIdFromItem(ammo.item)); // odd index
	}
	
	public static void setBulletItemStack(ItemStack gunStack, ItemStack bulletStack, int i)
	{ setAmmoAt(gunStack, i, bulletStack == null ? null : ((ItemShootable)bulletStack.getItem()).type); }
	
	public static ShootableType getAmmoAt(ItemStack gunStack, int i) { return getAmmoAt(getAmmoArray(gunStack), i); }
	
	public static ShootableType getAmmoAt(int[] ammoArray, int i)
	{
		return (i = (i & 1) == 0 ? ammoArray[i >>> 1] >>> 16 : ammoArray[i >>> 1] << 16 >>> 16) == NO_AMMO ? null 
			: ((ItemShootable)Item.getItemById(i)).type;
	}
	
	public int getFirstAmmoAt(ItemStack gunStack) { return getFirstAmmoAt(gunStack.stackTagCompound); }
	
	public int getFirstAmmoAt(NBTTagCompound tag)
	{
		int ammoArray[] = getAmmoArray(tag), i = ammoCapacity;
		while(--i >= 0 && getAmmoAt(ammoArray, i) == null);
		return i;
	}
	
	public int getFirstEmptySlotAt(ItemStack gunStack)
	{
		int[] ammoArray = getAmmoArray(gunStack);
		for(int i = 0, size = ammoCapacity; i < size; ++i) if(getAmmoAt(ammoArray, i) == null) return i;
		return -1;
	}
	
	/* methods for magazine MARK */
	public boolean isValidMagazine(ItemStack magazineStack)
	{ return magazineStack != null && magazineStack.getItem() instanceof ItemGun && isValidMagazine(((ItemGun)magazineStack.getItem()).type); }
	
	public boolean isValidMagazine(GunType magType)
	{
		if(magType.itsType != ItsType.MAG) return false;
		for(int i = magazine.length; --i >= 0; ) if(magType.magazine[0] == magazine[i]) return true;
		return false;
	}
	
	public static NBTTagCompound newMagTag(boolean isMag)
	{
		NBTTagCompound magTag = new NBTTagCompound();
		magTag.setIntArray(GunTag.MAG_ID_DAM, isMag ? new int[0] : new int[]{-1});
		return magTag;
	}
	
	public static NBTTagCompound getMagTag(ItemStack gunStack) { return (NBTTagCompound)gunStack.stackTagCompound.getTag(GunTag.MAGAZINE); }
	
	public static int[] getMagIdDam(NBTTagCompound magTag) { return ((NBTTagIntArray)magTag.getTag(GunTag.MAG_ID_DAM)).func_150302_c(); }
	
	public static int[] getMagStates(NBTTagCompound magTag) { return getStates(getMagNBTTag(magTag)); }
	
	public static float getMagState(ItemStack gunStack, byte i) { return getState(getStates(getMagNBTTag(getMagTag(gunStack))), i); }
	
	public static void setMagStack(ItemStack gunStack, ItemStack magStack) { setMagStack(getMagTag(gunStack), magStack); }
	
	public static void setMagStack(NBTTagCompound magTag, ItemStack magStack)
	{
		int[] magIdDam = getMagIdDam(magTag);
		if(magStack == null) { magIdDam[0] = -1; magTag.removeTag(GunTag.MAG_NBTTAG); return; } // if null mag, set -1 and remove tag
		magIdDam[0] = (Item.getIdFromItem(magStack.getItem()) << 16) + magStack.getItemDamage(); // not null, set id and damage in array
		magTag.setTag(GunTag.MAG_NBTTAG, magStack.stackTagCompound); // storage mag nbt state
	}
	
	public static ItemGun getMagItem(int[] magIdDam) { return magIdDam[0] != -1 ? (ItemGun)Item.getItemById(magIdDam[0] >>> 16) : null; }
	
	public static GunType getMagType(int[] magIdDam)
	{
		ItemGun item = getMagItem(magIdDam);
		return item != null ? item.type : null;
	}
	
	public static GunType getMagType(ItemStack gunStack) { return getMagType(getMagIdDam(getMagTag(gunStack))); }
	
	public static boolean hasMag(ItemStack gunStack) { return getMagItem(getMagIdDam(getMagTag(gunStack))) != null; }
	
	public static int getMagDamage(int[] magIdDam) { return magIdDam[0] << 16 >>> 16; }
	
	public static NBTTagCompound getMagNBTTag(NBTTagCompound magTag) { return (NBTTagCompound)magTag.getTag(GunTag.MAG_NBTTAG); }
	
	public static ItemStack getMagStack(ItemStack gunStack, ItemStack magStack)
	{
		NBTTagCompound magTag = getMagTag(gunStack);
		int[] magIdDam = getMagIdDam(magTag);
		if(magIdDam[0] == -1) return null;
		if(magStack != null)
		{
			magStack.func_150996_a(Item.getItemById(magIdDam[0] >>> 16));
			magStack.setItemDamage(magIdDam[0] << 16 >>> 16);
		}
		else magStack = new ItemStack(Item.getItemById(magIdDam[0] >>> 16), 1, magIdDam[0] << 16 >>> 16);
		magStack.stackTagCompound = getMagNBTTag(magTag);
		return magStack;
	}
	
	public static int[] getAmmoArrayFromMag(NBTTagCompound magTag) { return getAmmoArray(getMagNBTTag(magTag)); }
	
	public static int[] getAmmoArrayFromMag(ItemStack gunStack) { return getAmmoArrayFromMag(getMagTag(gunStack)); }
	
	public static boolean emptyMag(NBTTagCompound tag) { return getAmmoAt(getAmmoArray(tag), 0) == null; }
	
	public static boolean hasItemInMag(NBTTagCompound tag) { return !emptyMag(tag); }
	
	public boolean magExistsInInv(IInventory inv)
	{
		for(int i = inv.getSizeInventory(); --i >= 0; ) if(isValidMagazine(inv.getStackInSlot(i))) return true;
		return false; //no mag found, return false
	}
	
	/** this method is called by FlansModClient to show how much bullets are still in mag */
	public String getAmmoState(NBTTagCompound tag) { return getAmmoState(getFirstAmmoAt(tag) + 1); }
	
	public String getAmmoState(int numBullets)
	{
		int i;
		for(Entry<Integer, String> s : checkAmmoStates)
			if((i = s.getKey()) >>> 16 <= numBullets && numBullets <= i << 16 >>> 16) return s.getValue();
		return "coresponding ammo state not found";
	}
	
	/* methods for gun attachment MARK */
	public static NBTTagList getAtTagList(ItemStack stack)
	{ return ((NBTTagList)stack.stackTagCompound.getTag(ModifiableTag.PR_LIST)); }
	
	public static AttachmentType getAttachmentAt(ItemStack gunStack, byte[] at)
	{ return getAtTypeAt(gunStack.stackTagCompound, at, at.length); }
	
	/* methods to handle sight on gun MARK */
	public static int getAimCenterOnUse(int[] states) { return states[GunTag.TOF] >>> 24; }
	
	public static void setAimCenterOnUes(int[] states, byte toSet)
	{ states[GunTag.TOF] = (states[GunTag.TOF] & GunTag.SIGHT_ON_USE_MASK) + (toSet << 24); }
	
	public static NBTTagList getSightList(ItemStack gunStack) { return (NBTTagList)gunStack.stackTagCompound.getTag(GunTag.SIGHT_AT); }
	
	public static byte[] getOnUseSightAt(int[] states, NBTTagList sightList)
	{ return sightList.tagCount() == 0 ? null : getByteArrayFromTagList(getTagListFromTagList(sightList, getAimCenterOnUse(states)), 0); }
	
	public static LinkedList<byte[]> getOnUseSightsAt(int[] states, NBTTagList sightList)
	{
		LinkedList<byte[]> toReturn = new LinkedList<byte[]>();
		if(sightList.tagCount() < 1) return toReturn;
		for(int i = (sightList = getTagListFromTagList(sightList, getAimCenterOnUse(states))).tagCount(); --i >= 0; )
			toReturn.add(getByteArrayFromTagList(sightList, i));
		return toReturn;
	}
	
	public void setSightsAtForGun(ItemStack gunStack)
	{
		NBTTagList sightList = getSightList(gunStack), sightTag;
		while(sightList.tagCount() > 0) sightList.removeTag(0); // remove old tags
		LinkedList<SimpleEntry<byte[], Vector3f>> allSights = new LinkedList<SimpleEntry<byte[], Vector3f>>(), 
				onSights = new LinkedList<SimpleEntry<byte[], Vector3f>>();
		recordSights(gunStack.stackTagCompound, new byte[0], new Vector3f(0F), 0F, allSights); // find all sights installed
		if(allSights.size() == 0)  { setAimCenterOnUes(getStates(gunStack), GunTag.NO_SIGHT); return; } // if no sight, set ON_USE and return
		else setAimCenterOnUes(getStates(gunStack), (byte)0);
		Vector3f targetVec, vec;
		while(allSights.size() > 0) // loop the list, find all sights that has same aim center, move them to a new list and record them in nbt
		{
			onSights.add(allSights.getFirst());
			allSights.removeFirst();
			targetVec = onSights.get(0).getValue();
			for(int i = allSights.size(); --i >= 0; )
			{
				if((vec = allSights.get(i).getValue()).y != targetVec.y || vec.z != targetVec.z) continue;
				onSights.add(allSights.get(i));
				allSights.remove(i);
			}
			onSights.sort(new Comparator<Entry<byte[], Vector3f>>() // sort it by x dis
			{
				public int compare(Entry<byte[], Vector3f> o1, Entry<byte[], Vector3f> o2)
				{ return o1.getValue().x < o2.getValue().x ? 1 : -1; }
			});
			sightList.appendTag(sightTag = new NBTTagList());
			while(onSights.size() > 0) // now the sights in the new list has the right order, set them in gun's nbt tag
			{
				sightTag.appendTag(new NBTTagByteArray(onSights.getFirst().getKey()));
				onSights.removeFirst();
			}
		}
	}
	
	public static AttachmentPos getAimCenterOfSightAt(AttachmentPos atPos, byte[] sightAt)
	{	// we are now on the last layer attachment, which is the sight itself
		AttachmentType atType = (AttachmentType)getPosOfAttachableAt(atPos, sightAt, sightAt.length & -2).atType;
		atPos.y += atType.aimCenterY * atPos.updateTriValues().cos - atType.aimCenterZ * atPos.sin;
		atPos.z += atType.aimCenterY * atPos.sin + atType.aimCenterZ * atPos.cos;
		return atPos;
	}
	
	/* methods to handle operation MARK */
	/** 
	 * method to check if there exist a valid bullet to be should. it should not be a case 
	 * @param gunStack stack of gun to check 
	 * @return wheather there is a bullet in barrel to shoot 
	 */
	public boolean preCheckOnFire(ItemStack gunStack, int[] gunStates) //only called before shoot, so create case if has bullet
	{
		ShootableType bulletType = getAmmoAt(gunStack, 0);
		if(bulletType == null || bulletType.isCase) return false;
		if(bulletType.dropItemOnShoot != null && getTOF(gunStates, GunTag.CAN_AUTO_ON))
			FlansModClient.gunCaseList[FlansModClient.currentCaseIndex].preSet(ShootableType.shootables.get(bulletType.dropItemOnShoot), model, true);
		return true;
	}
	
	/** this is a method called when needing to push a bullet into mag, checking if there is still a null slot to push bullet in */
	public boolean checkMagToLoad(ItemStack magStack, IInventory inventory)
	{
		if(getFirstEmptySlotAt(magStack) == -1) return false; //full mag
		for(int i = inventory.getSizeInventory(); --i >= 0; ) if(isValidAmmo(inventory.getStackInSlot(i))) return true;
		return false; //no valid bullet exist in inv to load
	}
	
	public boolean pullBulletOutOfMag(ItemStack magStack, EntityPlayerMP entityPlayer, IInventory inventory)
	{
		ShootableType bullet = null;
		for(int ammo[] = getAmmoArray(magStack), i = ammoCapacity; --i >= 0; )
		{
			if((bullet = getAmmoAt(ammo, i)) != null)
			{
				setAmmoAt(ammo, i, null);
				ItemStack toGive = new ItemStack(bullet.item, 1, 0);
				if(!InventoryHelper.addItemStackToInventory(inventory, toGive, entityPlayer.capabilities.isCreativeMode))
					entityPlayer.entityDropItem(toGive, 0.5F);
				return true;
			}
		}
		return false;
	}
	
	public boolean pushBulletIntoMag(ItemStack magStack, IInventory inventory, boolean creative)
	{
		int slotToPushBullet = getFirstEmptySlotAt(magStack);
		if(slotToPushBullet < 0) return false;
		ItemStack stack; //Iterate over all inventory slots and find a bullet that we can load
		for(int i = -1, size = inventory.getSizeInventory(); ++i < size; )
		{
			if(isValidAmmo(stack = inventory.getStackInSlot(i)))
			{
				setBulletItemStack(magStack, stack, slotToPushBullet); //find one, so push it into mag
				if(!creative && --stack.stackSize < 1) stack = null; //Remove the magazine from the inventory
				inventory.setInventorySlotContents(i, stack);
				return true;
			}
		}
		return false;
	}
	
	private static boolean tryPullBulletOut(ItemStack gunStack, EntityPlayerMP entityPlayer)
	{
		int[] ammo = getAmmoArray(gunStack);
		ShootableType bullet = getAmmoAt(ammo, 0);
		if(bullet == null) return false;
		entityPlayer.entityDropItem(new ItemStack(bullet.item, 1, 0), 0.5F).delayBeforeCanPickup = 60; // has bullet, pull it out
		setAmmoAt(ammo, 0, null);
		return true;
	}
	
	/** this is a method to load a bullet from magazine to barrel, return wether we succeded to load a bullet from mag */
	public static boolean tryLoadAmmoFromMag(ItemStack gunStack)
	{
		NBTTagCompound magTag = getMagTag(gunStack);
		GunType magType = getMagType(getMagIdDam(magTag));
		if(magType == null) return false; //no magazine was found, return false
		ShootableType bullet;
		for(int ammo[] = getAmmoArray(getMagNBTTag(magTag)), i = magType.ammoCapacity; --i >= 0; )
		{
			if((bullet = getAmmoAt(ammo, i)) == null) continue;
			setAmmoAt(gunStack, 0, bullet); //set the bullet into our barrel and remove it from the magazine
			setAmmoAt(ammo, i, null);
			int[] magStates = getMagStates(magTag);
			if(!getTOF(magStates, GunTag.MAG_USED_ON)) setTOFOn(magStates, GunTag.MAG_USED_ON); //mark the clip to be a "used" one
			return true;
		}
		return false;
	}

	/** method to pull a magazine out from a gun */
	public static boolean pullMagOut(ItemStack gunStack, Entity entity, IInventory inv)
	{
		ItemStack magazineStack = getMagStack(gunStack, null);
		if(magazineStack == null) return false; //check if there is a magazine in gun
		for(int i = 0, size = inv.getSizeInventory(); ; ) //check if there is a null slot to give the stack in inventory
		{
			if(inv.getStackInSlot(i) == null) { inv.setInventorySlotContents(i, magazineStack); break; }
			if(++i == size) { entity.entityDropItem(magazineStack, 0.5F); break; } // fail to find a null slot, drop it
		}
		setMagStack(gunStack, null); //remove the mag from the gun
		return true;
	}

	public boolean loadNewMag(ItemStack gunStack, IInventory inv, boolean advancedReload)
	{
		int bestSlot = -1;
		ItemStack magStack = null;
		//Iterate over all inventory slots and find the best magazine that we should load
		for(int i = -1, size = inv.getSizeInventory(); ++i < size; ) if(isValidMagazine(magStack = inv.getStackInSlot(i))) //make sure it is a valid magazine
		{	//if no mag has been found before this one, then mark it //in advanced mode, we only load the magazine that we find first
			if(bestSlot == -1)
			{
				bestSlot = i;
				if(advancedReload) break;
			}
			if(!getTOF(getStates(magStack), GunTag.MAG_USED_ON)) //if we can a mag that has not been used, then load it
			{
				bestSlot = i;
				break;
			}
		}
		if(bestSlot < 0) return false; // mag to load is not found
		setMagStack(gunStack, inv.getStackInSlot(bestSlot)); // set mag for the gun
		inv.setInventorySlotContents(bestSlot, null); // remove the magazine from the inventory
		return true;
	}
	
	/** method to do charge for a gun, return whether we need to lock the slide */
	public boolean doCharge(ItemStack gunStack, EntityPlayerMP entityPlayer)
	{
		tryPullBulletOut(gunStack, entityPlayer);
		//now try to load next bullet into barrel, failing that, check if we need to lock slide
		if(itsType == ItsType.AUTO_GUN || itsType == ItsType.BOLT_GUN) //a gun that uses magazine
		{
			if(tryLoadAmmoFromMag(gunStack))
			{
				setTOFOff(getStates(gunStack), GunTag.BOLT_CATCH_OFF);
				return false;
			}
			if(releaseSlideTime == -1) return false;
			GunType magType = getMagType(getMagIdDam(getMagTag(gunStack)));
			if(magType == null || magType.releaseSlideTime == -1) return false;
			setTOFOn(getStates(gunStack), GunTag.BOLT_CATCH_ON);
			return true;
		}
		return false; //for a normal gun, no slide lock on
	}

	/** this is a method for full or semi auto gun to do the automatic procedure after a shoot. Very like doCharge(), difference is when doCharge, 
		we not sure if the slide is lock before we charge, but here we know slide can never be locked before this */
	public boolean doAfterShoot(ItemStack gunStack, int[] states, EntityPlayerMP entityPlayer)
	{
		if(!GunType.getTOF(states, GunTag.CAN_AUTO_ON)) return false; //if not a gun that can auto, return false
		tryPullBulletOut(gunStack, entityPlayer);
		if(tryLoadAmmoFromMag(gunStack) || releaseSlideTime == -1) return false; //if fail to load ammo and there is a mag with no bullet in it, lock slide
		GunType magType = getMagType(getMagIdDam(getMagTag(gunStack)));
		if(magType == null || magType.releaseSlideTime == -1) return false;
		setTOFOn(states, GunTag.BOLT_CATCH_ON);
		return true;
	}
	
	public void releaseSlide(ItemStack gunStack)
	{	//check if the type of the gun
		if(itsType != ItsType.AUTO_GUN) return;
		int[] states = getStates(gunStack);
		if(getTOF(states, GunTag.BOLT_CATCH_ON))
		{
			tryLoadAmmoFromMag(gunStack);
			GunType.setTOFOff(states, GunTag.BOLT_CATCH_OFF);
		}
	}
	
	/** this method contents the whole operation process to shoot a gun */
	public void tryShoot(ItemStack gunStack, World world, EntityPlayerMP entityPlayer, boolean isAiming, 
						 float x, float y, float z, float roty, float rotz)
	{
		if(deployable) return;
		ShootableType bulletType = getAmmoAt(gunStack, 0);
		if(bulletType == null)
		{
			//TODO: 
			return;
		}
		int numBullets = 1, states[] = getStates(gunStack);
		float spread = 0F;
		if(bulletType instanceof BulletType)
		{
			if(isAiming)
			{
				if((numBullets = ((BulletType)bulletType).numBullets) == 1) spread = getState(states, GunTag.AIM_SPREAD);
				else spread = getState(states, GunTag.SHOTGUN_AIM_SPREAD);
				spread *= ((BulletType)bulletType).aimingBulletSpreadMultiplier;
			}
			else
			{
				if((numBullets = ((BulletType)bulletType).numBullets) == 1)
				{
					if(getTOF(states, GunTag.LASER_ON)) spread = bulletSpreadWLP;
					else spread = getState(states, GunTag.SPREAD);
				}
				else if(getTOF(states, GunTag.LASER_ON)) spread = shotGunSpreadWLP;
				else spread = getState(states, GunTag.SHOTGUN_SPREAD);
				spread *= ((BulletType)bulletType).bulletSpreadMultiplier;
			}
		}
		else //if shootableType is not bulletType, usually grenadeType
		{
			if(isAiming)
			{
				if((numBullets = this.numBullets) == 1) spread = getState(states, GunTag.AIM_SPREAD);
				else spread = getState(states, GunTag.SHOTGUN_AIM_SPREAD);
			}
			else
			{
				if((numBullets = this.numBullets) == 1)
				{
					if(getTOF(states, GunTag.LASER_ON)) spread = bulletSpreadWLP;
					else spread = getState(states, GunTag.SPREAD);
				}
				else if(getTOF(states, GunTag.LASER_ON)) spread = shotGunSpreadWLP;
				else spread = getState(states, GunTag.SHOTGUN_SPREAD);
			}
		}
		// Spawn the bullet entities
		while(--numBullets >= 0) world.spawnEntityInWorld(((ItemShootable)bulletType.item)
			.getEntity(world, entityPlayer, spread, getState(states, GunTag.DAMAGE), getState(states, GunTag.BULLET_SPEED), this, x, y, z, roty, rotz));
		
		// We succeded to shoot the bullets, not do the rest of the works //set stack in barrel to be a case if requested
		setAmmoAt(gunStack, 0, !FlansMod.enableCasing || bulletType.dropItemOnShoot == null || entityPlayer.capabilities.isCreativeMode ? 
				null : ShootableType.getTypeByName(bulletType.dropItemOnShoot));
		// Drop item on shooting if gun requires it
		if(dropItemOnShoot != null) ItemGun.dropItem(world, entityPlayer, dropItemOnShoot);
		
		boolean preLockSlide = false;
		
		// If our gun uses mag, then try to load next bullet into barrel
		if(itsType == ItsType.AUTO_GUN) preLockSlide = doAfterShoot(gunStack, states, entityPlayer);
		
		// If it is a gun that uses mag but can not shoot full or semi auto, we do charge
		else if(itsType == ItsType.BOLT_GUN) FlansMod.getPacketHandler().sendTo(new PacketOperation(GunOperation.CHARGE_DELAY), entityPlayer);
		
		// Apply animations
		float flashVanishConst = getState(states, GunTag.FLASH_CONST);
		AttachmentType muzzleType = getMuzzleType(states);
		if(muzzleType == null)
		{
			numBullets = FlansMod.rand.nextInt(numFlashTexture);
			PacketPlaySound.sendSoundPacket(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, getState(states, GunTag.GUN_SOUND_RANGE), 
					entityPlayer.dimension, shootSound[0], distortSound, false);
		}
		else
		{
			numBullets = FlansMod.rand.nextInt(muzzleType.numFlashTexture < 1 ? numFlashTexture : muzzleType.numFlashTexture);
			PacketPlaySound.sendSoundPacket(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, getState(states, GunTag.GUN_SOUND_RANGE), entityPlayer.dimension, 
					shootSound[muzzleType.enableShootSoundNum < shootSound.length ? muzzleType.enableShootSoundNum : 0], distortSound, false);
		}
		
		FlansMod.getPacketHandler().sendTo(new PacketGunFire(preLockSlide, false, flashVanishConst, numBullets, FlansMod.rand.nextFloat() * 360F), entityPlayer);
		// Tell all players around to render the shoot animation in their client
		FlansMod.getPacketHandler().sendToAllAround(new PacketPlayerShoot(entityPlayer.getEntityId(), preLockSlide, false, slideAcceleration, flashVanishConst, numBullets, spread), 
				entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, FlansMod.shootAnimationRange, entityPlayer.dimension);
	}
	
	public int getTotalReloadTime()
	{
		int totalTime = 0;
		for(int i = reloadTimes.length; --i >= 0; ) totalTime += reloadTimes[i];
		return totalTime;
	}
	
	/**
	 * Get the melee damage of a specific gun,
	 * taking into account attachments
	 */
	public float getMeleeDamage(ItemStack stack) { return meleeDamage; }
	
	public float getAntiModelRecoilConstant(ItemStack stack)
	{
		/** TODO
		float stackAntiRecoil = antiRecoilRotZConst;
		
		for(AttachmentType attachment : getCurrentAttachments(stack))
			stackAntiRecoil *= attachment.antiModelRecoilMultiplier;*/
		
		return antiRecoilRotZConst;
	}
	
	public float getAntiModelRecoilYawConstant(ItemStack stack)
	{
		/** TODO
		float stackAntiRecoil = antiRecoilRotYConst;
		
		for(AttachmentType attachment : getCurrentAttachments(stack))
			stackAntiRecoil *= attachment.antiModelRecoilYawMultiplier;*/
		
		return antiRecoilRotYConst;
	}
	
	public float getAntiModelRecoilDistanceConstant(ItemStack stack)
	{
		/** TODO
		float stackAntiRecoil = antiRecoilTransXConst;
		
		for(AttachmentType attachment : getCurrentAttachments(stack))
			stackAntiRecoil *= attachment.antiModelRecoilDistanceMultiplier;*/
		
		return antiRecoilTransXConst;
	}
	
	/** Get whether the gun is in secondary or primary fire mode */
	public static boolean getSecondaryFire(ItemStack stack) { return false; } //TODO
	
	public void setCollapsibleStock(ItemStack stack, int collapsibleStockStep, float collapsibleStockDistance)
	{
		if(stack.stackTagCompound == null) stack.setTagCompound(new NBTTagCompound());
		stack.stackTagCompound.setInteger("stockStep", collapsibleStockStep);
		stack.stackTagCompound.setFloat("stockDistance", collapsibleStockDistance);
	}
	
	public int getCurrentStockStep(ItemStack stack)
	{ return !stack.hasTagCompound() || !stack.stackTagCompound.hasKey("stockStep") ? 0 : stack.stackTagCompound.getInteger("stockStep"); }
	
	public static float getStockDistance(ItemStack stack) { return 0F; }
	
	public Paintjob getPaintjob(String s)
	{
		for(Paintjob paintjob : paintjobs) if(paintjob.iconName.equals(s)) return paintjob;
		return paintjobs[0];
	}
	
	/** To be overriden by subtypes for model reloading */
	@Override
	@SideOnly(Side.CLIENT)
	public void reloadModel() //TODO: other models
	{ if(model != null) model = FlansMod.proxy.loadModel(modelName, shortName, ModelGun.class); }
	
	@Override
	public float GetRecommendedScale() { return 60f; }
	
	@Override
	@SideOnly(Side.CLIENT)
	public net.minecraft.client.model.ModelBase GetModel() { return model; }
	
	public static class GunOperation
	{
		public static byte a = 0;
		/*public static final byte NONE = a++, PRE_RELOAD = a++, TILT_GUN = a++, UNTILT_GUN = a++, UNLOAD_MAG = a++, LOAD_MAG = a++, 
				LOAD_AMMO = a++, UNLOAD_AMMO = a++, CHARGE = a++, CHARGE_DELAY = a++, RELEASE_BOLT = a++, 
				PRE_CHAMBER_CHECK = a++, CHECK_CHAMBER = a++, CHECK_CHAMBER_BC = a++, CHECK_AMMO = a++, 
				REST = a++, UNREST = a++, MODIFY = a++;*/
		public static final byte NONE = 0, PRE_RELOAD = 1, TILT_GUN = 2, UNTILT_GUN = 3, UNLOAD_MAG = 4, LOAD_MAG = 5, 
				LOAD_AMMO = 6, UNLOAD_AMMO = 7, CHARGE = 8, CHARGE_DELAY = 9, RELEASE_BOLT = 10, 
				PRE_CHAMBER_CHECK = 11, CHECK_CHAMBER = 12, CHECK_CHAMBER_BC = 13, CHECK_AMMO = 14, 
				REST = 15, UNREST = 16, MODIFY = 17;
		/* ? */
	}
	
	/** for test 
	public static String attachmentAtToString(byte[] at)
	{
		if(at == null) return "null";
		if(at.length == 0) return "";
		String stringToReturn = Byte.toString(at[0]);
		for(int i = 0; ++i < at.length; ) stringToReturn += " " + at[i];
		return stringToReturn;
	}
	/** for test */
}