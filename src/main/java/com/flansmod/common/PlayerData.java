package com.flansmod.common;

import java.util.ArrayList;

import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class PlayerData 
{
	/** Their username */
	public String username;

	//Movement related fields
	/** Roll variables */
	public float prevRotationRoll, rotationRoll;
	/** Snapshots for bullet hit detection. Array size is set to number of snapshots required. When a new one is taken, 
	 * each snapshot is moved along one place and new one is added at the start, so that when the array fills up, the oldest one is lost */
	public PlayerSnapshot[] snapshots;
	
	//Gun related fields
	/** The MG this player is using */
	public EntityMG mountingGun;
	/** Tickers to stop shooting too fast */
	public float shootTimeRight;
	/** Stops player shooting immediately after swapping weapons */
	public int shootClickDelay;
	/** True if this player is shooting */
	public boolean isShootingRight;
	/** The speed of the minigun the player is using */
	public float minigunSpeed = 0F;
	/** Reloading booleans */
	public boolean reloadingRight;
	/** When remote explosives are thrown they are added to this list. When the player uses a remote, the first one from this list detonates */
	public ArrayList<EntityGrenade> remoteExplosives = new ArrayList<EntityGrenade>();
	/** Sound delay parameters */
	public int loopedSoundDelay;
	/** Sound delay parameters */
	public boolean shouldPlayCooldownSound, shouldPlayWarmupSound;
	/** Melee weapon custom hit simulation */
	public int meleeProgress, meleeLength;
	/** When the player shoots a burst fire weapon, one shot is fired immediately and this counter keeps track of how many more should be fired */
	public int burstRoundsRemainingRight = 0;
	
	public boolean isAmmoEmpty;

	public Vector3f[] lastMeleePositions;
	
	//Teams related fields
	/** Gametype variables */
	public int score, kills, deaths;
	/** Zombies variables */
	public int zombieScore;
	/** Gametype variable for Nerf */
	public boolean out;
	/** The player's vote for the next round from 1 ~ 5. 0 is not yet voted */
	public int vote;
	/** The team this player is currently on */
	public Team team;
	/** The team this player will switch to upon respawning */
	public Team newTeam;
	/** The class the player is currently using */
	public PlayerClass playerClass;
	/** The class the player will switch to upon respawning */
	public PlayerClass newPlayerClass;
	/** Keeps the player out of having to rechose their team each round */
	public boolean builder;
	/** Save the player's skin here, to replace after having done a swap for a certain class override */
	@SideOnly(Side.CLIENT)
	public ResourceLocation skin;
	
	public PlayerData(String name) 
	{
		username = name;	
		snapshots = new PlayerSnapshot[FlansMod.numPlayerSnapshots];
	}
	
	public void tick(EntityPlayer player)
	{
		if(shootTimeRight > 0)
			shootTimeRight--;
		if(shootTimeRight == 0)
			reloadingRight = false;
		
		if(shootClickDelay > 0)
			shootClickDelay--;
		
		//Handle minigun speed
		if(isShootingRight && !reloadingRight)
			minigunSpeed += 2F; 
		minigunSpeed *= 0.9F;
		if(loopedSoundDelay > 0)
		{
			loopedSoundDelay--;
			if(loopedSoundDelay == 0 && !isShootingRight)
				shouldPlayCooldownSound = true;
		}
				
		//Move all snapshots along one place
        System.arraycopy(snapshots, 0, snapshots, 1, snapshots.length - 1);
		//Take new snapshot
		snapshots[0] = new PlayerSnapshot(player);
	}

	public PlayerClass getPlayerClass()
	{
		if(playerClass != newPlayerClass)
			playerClass = newPlayerClass;
		return playerClass;
	}

	public void resetScore() 
	{
		score = zombieScore = kills = deaths = 0;
		team = newTeam = null;
		playerClass = newPlayerClass = null;
	}
	
	public void playerKilled()
	{
		mountingGun = null;
		isShootingRight = false;
		snapshots = new PlayerSnapshot[FlansMod.numPlayerSnapshots];
	}
	
	public void doMelee(EntityPlayer player, int meleeTime, GunType type)	
	{
		meleeLength = meleeTime;
		lastMeleePositions = new Vector3f[type.meleePath.size()];
		
		for(int k = 0; k < type.meleeDamagePoints.size(); k++)
		{
			Vector3f meleeDamagePoint = type.meleeDamagePoints.get(k);
			//Do a raytrace from the prev pos to the current pos and attack anything in the way
			Vector3f nextPos = type.meleePath.get(0);
			Vector3f nextAngles = type.meleePathAngles.get(0);
			RotatedAxes nextAxes = new RotatedAxes(-nextAngles.y, -nextAngles.z, nextAngles.x);
			
			Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextAxes.findLocalVectorGlobally(meleeDamagePoint));
			Vector3f.add(nextPos, nextPosInPlayerCoords, nextPosInPlayerCoords);
			
			if(!FlansMod.proxy.isThePlayer(player))
				nextPosInPlayerCoords.y += 1.6F;
			
			lastMeleePositions[k] = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
		}
	}
}
