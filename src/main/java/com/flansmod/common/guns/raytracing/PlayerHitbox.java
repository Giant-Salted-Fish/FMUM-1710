package com.flansmod.common.guns.raytracing;

import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class PlayerHitbox 
{
	/** */
	public EntityPlayer player;
	/** The angles of this box */
	public RotatedAxes axes;
	/** The origin of rotation for this box */
	public Vector3f rP;
	/** The lower left corner of this box */
	public Vector3f o;
	/** The dimensions of this box */
	public Vector3f d;
	/** The type of hitbox */
	public EnumHitboxType type;
	
	public PlayerHitbox(EntityPlayer player, RotatedAxes axes, Vector3f rotationPoint, Vector3f origin, Vector3f dimensions, EnumHitboxType type)
	{
		this.player = player;
		this.axes = axes;
		this.o = origin;
		this.d = dimensions;
		this.type = type;
		this.rP = rotationPoint;
	}
	
	@SideOnly(Side.CLIENT)
	public void renderHitbox(World world, Vector3f pos)
	{
		//Vector3f boxOrigin = new Vector3f(pos.x + rP.x, pos.y + rP.y, pos.z + rP.z);
		//world.spawnEntityInWorld(new EntityDebugAABB(world, boxOrigin, d, 2, 1F, 1F, 0F, axes.getYaw(), axes.getPitch(), axes.getRoll(), o));
		/*
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				for(int k = 0; k < 3; k++)
				{
					Vector3f point = new Vector3f(o.x + d.x * i / 2, o.y + d.y * j / 2, o.z + d.z * k / 2);
					point = axes.findLocalVectorGlobally(point);
					world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(pos.x + rP.x + point.x, pos.y + rP.y + point.y, pos.z + rP.z + point.z), 1, 0F, 1F, 0F));
				}
		*/
	}

	public PlayerBulletHit raytrace(Vector3f origin, Vector3f motion) 
	{
		//Move to local coords for this hitbox, but don't modify the original "origin" vector
		origin = Vector3f.sub(origin, rP, null);
		origin = axes.findGlobalVectorLocally(origin);
		motion = axes.findGlobalVectorLocally(motion);
		
		//We now have an AABB starting at o and with dimensions d and our ray in the same coordinate system
		//We are looking for a point at which the ray enters the box, so we need only consider faces that the ray can see. Partition the space into 3 areas in each axis
		
		//X - axis and faces x = o.x and x = o.x + d.x
		if(motion.x != 0F)
		{
			if(origin.x < o.x) //Check face x = o.x
			{
				float intersectTime = (o.x - origin.x) / motion.x;
				float intersectY = origin.y + motion.y * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectY >= o.y && intersectY <= o.y + d.y && intersectZ >= o.z && intersectZ <= o.z + d.z)
					return new PlayerBulletHit(this, intersectTime);
			}
			else if(origin.x > o.x + d.x) //Check face x = o.x + d.x
			{
				float intersectTime = (o.x + d.x - origin.x) / motion.x;
				float intersectY = origin.y + motion.y * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectY >= o.y && intersectY <= o.y + d.y && intersectZ >= o.z && intersectZ <= o.z + d.z)
					return new PlayerBulletHit(this, intersectTime);
			}
		}
		//Z - axis and faces z = o.z and z = o.z + d.z
		if(motion.z != 0F)
		{
			if(origin.z < o.z) //Check face z = o.z
			{
				float intersectTime = (o.z - origin.z) / motion.z;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectY = origin.y + motion.y * intersectTime;
				if(intersectX >= o.x && intersectX <= o.x + d.x && intersectY >= o.y && intersectY <= o.y + d.y)
					return new PlayerBulletHit(this, intersectTime);
			}
			else if(origin.z > o.z + d.z) //Check face z = o.z + d.z
			{
				float intersectTime = (o.z + d.z - origin.z) / motion.z;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectY = origin.y + motion.y * intersectTime;
				if(intersectX >= o.x && intersectX <= o.x + d.x && intersectY >= o.y && intersectY <= o.y + d.y)
					return new PlayerBulletHit(this, intersectTime);
			}
		}
		//Y - axis and faces y = o.y and y = o.y + d.y
		if(motion.y != 0F)
		{
			if(origin.y < o.y) //Check face y = o.y
			{
				float intersectTime = (o.y - origin.y) / motion.y;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectX >= o.x && intersectX <= o.x + d.x && intersectZ >= o.z && intersectZ <= o.z + d.z)
					return new PlayerBulletHit(this, intersectTime);
			}
			else if(origin.y > o.y + d.y) //Check face x = o.x + d.x
			{
				float intersectTime = (o.y + d.y - origin.y) / motion.y;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectX >= o.x && intersectX <= o.x + d.x && intersectZ >= o.z && intersectZ <= o.z + d.z)
					return new PlayerBulletHit(this, intersectTime);
			}
		}
		return null;
	}

	public float hitByBullet(EntityBullet bullet, float penetratingPower) 
	{
		// If this bullet can set target in fire, set it
		if(bullet.type.setEntitiesOnFire) player.setFire(20);
		float hitDamage = bullet.damage * bullet.type.damageVsPlayer;
		// Check if armor mode is eft mode
		if(FlansMod.breakableArmor == 3)
		{
			int proofIndex = 1;
			switch(type)
			{
				case HEAD:
					hitDamage *= FlansMod.headDamageMult;
					proofIndex = 0;
					break;
				case LEFT_ARM:
					hitDamage *= FlansMod.armDamageMult;
					proofIndex = 2;
					break;
				case RIGHT_ARM:
					hitDamage *= FlansMod.armDamageMult;
					proofIndex = 3;
					break;
				case RIGHT_ITEM:
					ItemStack currentStack = player.getCurrentEquippedItem();
					return currentStack != null && currentStack.getItem() instanceof ItemGun ? 
							penetratingPower - ((ItemGun)currentStack.getItem()).type.shieldDamageAbsorption : penetratingPower;
				case LEFT_ITEM: return penetratingPower;
				default:;
			}
			// Not hiting left or right hand item, do damage to the player //if this bullet has potion effect
			for(PotionEffect effect : bullet.type.hitEffects) player.addPotionEffect(new PotionEffect(effect));
			// Create a damage source object
			DamageSource damagesource = bullet.owner == null ? DamageSource.generic : bullet.getBulletDamage(type == EnumHitboxType.HEAD);
			// When the damage is 0 (such as with Nerf guns) the entityHurt Forge hook is not called, so this hacky thing is here
			if(!player.worldObj.isRemote && hitDamage == 0 && TeamsManager.getInstance().currentRound != null)
				TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)player, damagesource);
			ItemStack armorStack;
			ArmourType armorType;
			float proofLevel;
			int thisItemDamage, maxItemDamage;
			// Check player's armor to see if we can penetrate it
			for(int i = 1; i < 5; ++i)
			{
				armorStack = player.getEquipmentInSlot(i);
				if(armorStack != null && armorStack.getItem() instanceof ItemTeamArmour)
				{
					armorType = ((ItemTeamArmour)armorStack.getItem()).type;
					thisItemDamage = armorStack.getItemDamage();
					maxItemDamage = armorStack.getMaxDamage();
					proofLevel = armorType.getProofLevel(proofIndex, armorStack) * (maxItemDamage - thisItemDamage) / maxItemDamage;
					if(proofLevel <= 0F)
						continue;
					// If we can't penetrate
					if(proofLevel >= bullet.type.maxPenetrationLevel || (proofLevel > bullet.type.minPenetrationLevel && 
					   FlansMod.rand.nextFloat() < (proofLevel - bullet.type.minPenetrationLevel) / (bullet.type.maxPenetrationLevel - bullet.type.minPenetrationLevel)))
					{
						// Play the sound
						if(armorType.numHitSounds[proofIndex] > 0)
							PacketPlaySound.sendSoundPacket(bullet.posX + bullet.motionX * EntityBullet.thisIntersectTime, bullet.posY + bullet.motionY * EntityBullet.thisIntersectTime, bullet.posZ + bullet.motionZ * EntityBullet.thisIntersectTime, 
															armorType.hitSoundRanges[proofIndex], bullet.dimension, armorType.hitSounds[proofIndex] + "_" + FlansMod.rand.nextInt(armorType.numHitSounds[proofIndex]), true);
						// Attack the player!
						if(player.attackEntityFrom(damagesource, 1F/* MARK: hitDamage * armorType.bluntDamageMult * bullet.type.bluntDamageMult */))
						{
							//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
							++player.arrowHitTimer;
							player.hurtResistantTime = player.maxHurtResistantTime / 2;
							//Yuck. //PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.hitSound, true));
						}
						// Damage this armor
						thisItemDamage += FlansMod.getInt(bullet.type.armorBreakPower * armorType.bluntDurabilityMult);
						armorStack.setItemDamage(thisItemDamage < maxItemDamage ? thisItemDamage : maxItemDamage);
						return -1F;
					}
					// This armor will effect damage of the bullet
					hitDamage *= armorType.penetratedDamageMult;
					// Play the sound
					if(armorType.numHitSounds[proofIndex + 4] > 0)
						PacketPlaySound.sendSoundPacket(bullet.posX + bullet.motionX * EntityBullet.thisIntersectTime, bullet.posY + bullet.motionY * EntityBullet.thisIntersectTime, bullet.posZ + bullet.motionZ * EntityBullet.thisIntersectTime, 
														armorType.hitSoundRanges[proofIndex + 4], bullet.dimension, armorType.hitSounds[proofIndex + 4] + "_" + FlansMod.rand.nextInt(armorType.numHitSounds[proofIndex + 4]), true);
					// Penetrated, damage the armor
					thisItemDamage += FlansMod.getInt(bullet.type.armorBreakPower * armorType.penetratedDurabilityMult);
					armorStack.setItemDamage(thisItemDamage < maxItemDamage ? thisItemDamage : maxItemDamage);
				}
			}
			// Come to here means this bullet has penetrated all the armors, apply player damage here
			if(player.attackEntityFrom(damagesource, hitDamage))
			{
				// If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
				++player.arrowHitTimer;
				player.hurtResistantTime = player.maxHurtResistantTime / 2;
				// Yuck. //PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.hitSound, true));
			}
			return penetratingPower - 1;
		}
		switch(type)
		{
			case HEAD: hitDamage *= FlansMod.headDamageMult; break;
			case LEFT_ARM: case RIGHT_ARM: hitDamage *= FlansMod.armDamageMult; break;
			case RIGHT_ITEM:
				ItemStack currentStack = player.getCurrentEquippedItem();
				if(currentStack != null && currentStack.getItem() instanceof ItemGun)
				{
					GunType gunType = ((ItemGun)currentStack.getItem()).type;
					//TODO : Shield damage
					return penetratingPower - gunType.shieldDamageAbsorption;
				}
				return penetratingPower;
			case LEFT_ITEM: return penetratingPower;
			default: ;
		}
		// Not hiting left hand or right hand item, do damage to player //if this bullet has potion effect
		for(PotionEffect effect : bullet.type.hitEffects) player.addPotionEffect(new PotionEffect(effect));
		// Create a damage source object
		DamageSource damagesource = bullet.owner == null ? DamageSource.generic : bullet.getBulletDamage(type == EnumHitboxType.HEAD);
		// When the damage is 0 (such as with Nerf guns) the entityHurt Forge hook is not called, so this hacky thing is here
		if(!player.worldObj.isRemote && hitDamage == 0 && TeamsManager.getInstance().currentRound != null)
			TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)player, damagesource);
		// Attack the entity!
		if(player.attackEntityFrom(damagesource, hitDamage))
		{
			// If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
			++player.arrowHitTimer;
			player.hurtResistantTime = player.maxHurtResistantTime / 2;
			// Yuck. //PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.hitSound, true));
		}
		return penetratingPower - 1;
	}
}
