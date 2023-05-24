package com.flansmod.common.guns;

import java.util.HashMap;
import java.util.LinkedList;

import com.flansmod.client.model.ModelDefault;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;

public abstract class ShootableType extends InfoType
{
	private static final int INVALID_AMMO_TYPE = 1 << 31;
	public int ammoType = INVALID_AMMO_TYPE;
	//Aesthetics
	/** The model to render for this grenade in the world */
	@SideOnly(Side.CLIENT)
	public ModelBase model;
	/** the model to render in barrel or mag */
	@SideOnly(Side.CLIENT)
	public ModelDefault bulletModel;
	@SideOnly(Side.CLIENT)
	public String modelName, bulletModelName;
	public String bulletTexture = null;
	/** adding @SideOnly(Side.CLIENT) to this will cause problem for server side, can be used to create client side only mod */
	public float bulletScale = 1F;
	/** if it is a case, then it can't be shot */
	public boolean isCase = false;
	public Vector3f rotCenter = new Vector3f();
	/** Whether trail particles are given off */
	public boolean trailParticles = false;
	/** Trail particles given off by this while being thrown */
	public String trailParticleType = "smoke";

	//Item Stuff
	/** The maximum number of grenades that can be stacked together */
	public int maxStackSize = 1;
	/** Items dropped on various events */
	public String dropItemOnReload = null, dropItemOnShoot = null, dropItemOnHit = null;
	/** The number of rounds fired by a gun per item */
	public int roundsPerItem = 1;

	//Physics and Stuff
	/** The speed at which the grenade should fall */
	public float fallSpeed = 1F;
	/** The speed at which to throw the grenade. 0 will just drop it on the floor */
	public float throwSpeed = 1F;
	/** Hit box size */
	public float hitBoxSize = 0.5F;

	//Damage to hit entities
	/** Amount of damage to impart upon various entities */
	public float damageVsPlayer = -1F, damageVsLiving = 1F, damageVsVehicles = 1F, damageVsPlanes = -1F;
	public boolean readDamageVsPlayer = false;
	public boolean readDamageVsPlanes = false;
	/** Whether this grenade will break glass when thrown against it */
	public boolean breaksGlass = true;
	public float ignoreArmorProbability = 0,ignoreArmorDamageFactor = 0;

	//Detonation Conditions
	/** If 0, then the grenade will last until some other detonation condition is met, else the grenade will detonate after this time (in ticks) */
	public int fuse = 0;
	/** After this time the grenade will despawn quietly. 0 means no despawn time */
	public int despawnTime = 0;
	/** If true, then this will explode upon hitting something */
	public boolean explodeOnImpact = false;

	//Detonation Stuff
	/** The radius in which to spread fire */
	public float fireRadius = 0F;
	/** The radius of explosion upon detonation */
	public float explosionRadius = 0F;
	/** Whether the explosion can destroy blocks */
	public boolean explosionBreaksBlocks = true;
	/** Explosion damage vs various classes of entities */
	public float explosionDamageVsLiving  = 1F;
	public float explosionDamageVsPlayer  = 1F;
	public float explosionDamageVsPlane   = 1F;
	public float explosionDamageVsVehicle = 1F;
	/** The name of the item to drop upon detonating */
	public String dropItemOnDetonate = null;
	/** Sound to play upon detonation */
	public String detonateSound = "";
	
	public boolean hasSubmunitions = false;
	
	public String submunition = "";
	
	public int numSubmunitions = 0;
	
	public int subMunitionTimer = 0;
	
	public float submunitionSpread = 1;
	
	public boolean destroyOnDeploySubmunition = false;

	public int smokeParticleCount = 0;
	public int debrisParticleCount = 0;

	/** The static list of all shootable types */
	public static HashMap<String, ShootableType> shootables = new HashMap<String, ShootableType>();

	public ShootableType(TypeFile file) { super(file); }

	@Override
	protected void preRead(TypeFile file) { }
	
	@Override
	public void postRead(TypeFile file)
	{
		if(shootables.containsKey(shortName)) FlansMod.log("Error: " + shortName + " reduplicated");
		shootables.put(shortName, this);
		rotCenter.scale(bulletScale / 16F);
		if(ammoType == INVALID_AMMO_TYPE) ammoType = shortName.hashCode();
		//if damage vs player is not specified, let it to be damage vs living
		if(damageVsPlayer == -1F) damageVsPlayer = damageVsLiving;
		if(damageVsPlanes == -1F) damageVsPlanes = damageVsVehicles;
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			//Model and Texture
			if(FMLCommonHandler.instance().getSide().isClient())
			{
				if(split[0].equals("Model"))
				{
					model = FlansMod.proxy.loadModel(modelName = split[1], shortName, ModelBase.class);
					if(split.length > 2) texture = split[2];
				}
				else if(split[0].equals("BulletModel")) switch(split.length)
				{
					case 7: rotCenter.set(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6]));
					case 4: bulletScale = Float.parseFloat(split[3]);
					case 3: bulletTexture = split[2];
					default: bulletModel = FlansMod.proxy.loadModel(bulletModelName = split[1], shortName, ModelDefault.class);
				}
			}
			if(split[0].equals("AmmoType")) ammoType = split[1].hashCode();
			else if(split[0].equals("IsCase")) isCase = Boolean.parseBoolean(split[1].toLowerCase());

			//Item Stuff
			else if(split[0].equals("StackSize"))
				maxStackSize = Integer.parseInt(split[1]);
			else if(split[0].equals("ItsCase"))
				dropItemOnShoot = split[1];
			else if(split[0].equals("DropItemOnReload"))
				dropItemOnReload = split[1];
			else if(split[0].equals("DropItemOnHit"))
				dropItemOnHit = split[1];
			else if(split[0].equals("RoundsPerItem"))
				roundsPerItem = Integer.parseInt(split[1]);

			//Physics
			else if(split[0].equals("FallSpeed"))
				fallSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("ThrowSpeed") || split[0].equals("ShootSpeed"))
				throwSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("HitBoxSize"))
				hitBoxSize = Float.parseFloat(split[1]);

			//Hit stuff
			else if(split[0].equals("DamageVsLiving"))
				damageVsLiving = Float.parseFloat(split[1]);
			else if(split[0].equals("DamageVsPlayer"))
				damageVsPlayer = Float.parseFloat(split[1]);
			else if(split[0].equals("DamageVsVehicles"))
				damageVsVehicles = Float.parseFloat(split[1]);
			else if(split[0].equals("DamageVsPlanes"))
				damageVsPlanes = Float.parseFloat(split[1]);

			else if(split[0].equals("IgnoreArmorProbability"))
				ignoreArmorProbability = Float.parseFloat(split[1]);
			else if(split[0].equals("IgnoreArmorDamageFactor"))
				ignoreArmorDamageFactor = Float.parseFloat(split[1]);

			else if(split[0].equals("BreaksGlass"))
				breaksGlass = Boolean.parseBoolean(split[1].toLowerCase());

			//Detonation conditions etc
			else if(split[0].equals("Fuse"))
				fuse = Integer.parseInt(split[1]);
			else if(split[0].equals("DespawnTime"))
				despawnTime = Integer.parseInt(split[1]);
			else if(split[0].equals("ExplodeOnImpact") || split[0].equals("DetonateOnImpact"))
				explodeOnImpact = Boolean.parseBoolean(split[1].toLowerCase());

			//Detonation
			else if(split[0].equals("FireRadius") || split[0].equals("Fire"))
				fireRadius = Float.parseFloat(split[1]);
			else if(split[0].equals("ExplosionRadius") || split[0].equals("Explosion"))
				explosionRadius = Float.parseFloat(split[1]);
			else if(split[0].equals("ExplosionBreaksBlocks"))
				explosionBreaksBlocks = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("ExplosionDamageVsLiving"))
				explosionDamageVsLiving = Float.parseFloat(split[1]);
			else if(split[0].equals("ExplosionDamageVsPlayer"))
				explosionDamageVsPlayer = Float.parseFloat(split[1]);
			else if(split[0].equals("ExplosionDamageVsPlane"))
				explosionDamageVsPlane = Float.parseFloat(split[1]);
			else if(split[0].equals("ExplosionDamageVsVehicle"))
				explosionDamageVsVehicle = Float.parseFloat(split[1]);

			else if(split[0].equals("DropItemOnDetonate"))
				dropItemOnDetonate = split[1];
			else if(split[0].equals("DetonateSound"))
				detonateSound = split[1];
			
			//Submunitions
			else if(split[0].equals("HasSubmunitions"))
				hasSubmunitions = Boolean.parseBoolean(split[1].toLowerCase());	
			else if(split[0].equals("Submunition"))
				submunition = split[1];
			else if(split[0].equals("NumSubmunitions"))
				numSubmunitions = Integer.parseInt(split[1]);	
			else if(split[0].equals("SubmunitionDelay"))
				subMunitionTimer = Integer.parseInt(split[1]);
			else if(split[0].equals("SubmunitionSpread"))
				submunitionSpread = Float.parseFloat(split[1]);
			
			else if(split[0].equals("FlareParticleCount"))
				smokeParticleCount = Integer.parseInt(split[1]);
			else if(split[0].equals("DebrisParticleCount"))
				debrisParticleCount = Integer.parseInt(split[1]);

			//Particles
			else if(split[0].equals("TrailParticles") || split[0].equals("SmokeTrail"))
				trailParticles = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("TrailParticleType"))
				trailParticleType = split[1];
		}
		catch(Exception e)
		{
			String line = split[0];
			for(int i = 1; i < split.length; ++i) line += " " + split[i];
			FlansMod.log("error > failed to parse key word <" + line + "> for shootable <" + shortName + ">");
			if(FlansMod.printStackTrace) e.printStackTrace();
		}
	}

	public static ShootableType getTypeByName(String string) { return shootables.get(string); }
	
	public static ShootableType getTypeById(int id) { return id < 0 ? null : ((ItemShootable)Item.getItemById(id)).type; }
	
	public static LinkedList<ShootableType> getByAmmoType(int ammoType)
	{
		LinkedList<ShootableType> toReturn = new LinkedList<ShootableType>();
		for(ShootableType st : shootables.values()) if(st.ammoType == ammoType) toReturn.add(st);
		return toReturn;
	}
	
	@Override
	public float GetRecommendedScale() { return 0f; }

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() { return model; }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void reloadModel()
	{
		if(model != null) model = FlansMod.proxy.loadModel(modelName, shortName, ModelBase.class);
		if(bulletModel != null) bulletModel = FlansMod.proxy.loadModel(bulletModelName, shortName, ModelDefault.class);
	}
}
