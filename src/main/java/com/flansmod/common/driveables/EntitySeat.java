package com.flansmod.common.driveables;

import java.util.List;

import com.flansmod.api.IControllable;
import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.GunType.FireMode;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketDriveableKeyHeld;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketSeatCheck;
import com.flansmod.common.network.PacketSeatUpdates;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemLead;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntitySeat extends Entity implements IControllable, IEntityAdditionalSpawnData
{
	/** Set this to true when the client has found the parent driveable and connected them */
	@SideOnly(Side.CLIENT)
	public boolean foundDriveable;
	private int driveableID;
	private int seatID;
	public EntityDriveable driveable;

	@SideOnly(Side.CLIENT)
	public float playerRoll, prevPlayerRoll;

	public Seat seatInfo;
	public boolean driver;

	/** A set of axes used to calculate where the seat is looking, x axis is the direction of looking, y is up */
	public RotatedAxes looking;
	/** For smooth renderering */
	public RotatedAxes prevLooking;
	/** A set of axes used to calculate where the player is looking, x axis is the direction of looking, y is up */
    public RotatedAxes playerLooking;
	/** For smooth renderering */
    public RotatedAxes prevPlayerLooking;
	/** Delay ticker for shooting guns */
	public float gunDelay;
	/** Minigun speed */
	public float minigunSpeed;
	/** Minigun angle for render */
	public float minigunAngle;

	/** Sound delay ticker for looping sounds */
	public int soundDelay;
    public int yawSoundDelay = 0;
    public int pitchSoundDelay = 0;

    /** Traverse sound states */
    public boolean playYawSound = false;
    public boolean playPitchSound = false;


	private double playerPosX, playerPosY, playerPosZ;
	private float playerYaw, playerPitch;
	/** For smoothness */
	private double prevPlayerPosX, prevPlayerPosY, prevPlayerPosZ;
	private float prevPlayerYaw, prevPlayerPitch;
	private boolean shooting;

	public Entity lastRiddenByEntity;
	
	public float targetYaw = 0;
	
	public float targetPitch = 0;
	
	public boolean artillery = false;

	public int timeLimitDriveableNull = 0;

	/** Default constructor for spawning client side
	 * Should not be called server side EVER */
	public EntitySeat(World world)
	{
		super(world);
		setSize(1F, 1F);
		prevLooking = new RotatedAxes();
		looking = new RotatedAxes();
        playerLooking = new RotatedAxes();
        prevPlayerLooking = new RotatedAxes();
		lastRiddenByEntity = null;
	}

	/** Server side seat constructor */
	public EntitySeat(World world, EntityDriveable d, int id)
	{
		this(world);
		driveable = d;
		driveableID = d.getEntityId();
		seatInfo = driveable.getDriveableType().seats[id];
		driver = id == 0;
		setPosition(d.posX, d.posY, d.posZ);
		playerPosX = prevPlayerPosX = posX;
		playerPosY = prevPlayerPosY = posY;
		playerPosZ = prevPlayerPosZ = posZ;
		looking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
		playerLooking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);

		//updatePosition();
	}

	@Override
	public void setPositionAndRotation2(double x, double y, double z, float yaw, float pitch, int i)
	{
		//setPosition(x, y, z);
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		//prevPosX = posX;
		//prevPosY = posY;
		//prevPosZ = posZ;

		if(driver && riddenByEntity==null)
		{
			prevLooking = looking.clone();
			prevPlayerLooking = playerLooking.clone();
		}
		
		//if(!driver && riddenByEntity == null)onMouseMoved(1,1);

		//If on the client and the driveable parent has yet to be found, search for it
		if(worldObj.isRemote && !foundDriveable)
		{
			driveable = (EntityDriveable)worldObj.getEntityByID(driveableID);
			if(driveable == null)
				return;
			foundDriveable = true;
			driveable.seats[seatID] = this;
			seatInfo = driveable.getDriveableType().seats[seatID];
			looking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
			playerLooking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
			prevLooking = looking.clone();
			playerPosX = prevPlayerPosX = posX = driveable.posX;
			playerPosY = prevPlayerPosY = posY = driveable.posY;
			playerPosZ = prevPlayerPosZ = posZ = driveable.posZ;
			setPosition(posX, posY, posZ);
		}

		if(driveable == null)
			return;
		
		if(driveable.isDead())
		{
			for(EntitySeat seat : this.driveable.seats)
			{
				seat.setDead();
			}
		}

		EntityDriveable entD;
		entD = (EntityDriveable)worldObj.getEntityByID(driveableID);
		if(entD == null){
			this.timeLimitDriveableNull++;
		}else{
			this.timeLimitDriveableNull = 0;
		}

		if(timeLimitDriveableNull > 60*20){
			this.setDead();
		}

		//Update gun delay ticker
		if(gunDelay > 0)
			gunDelay--;
		//Update sound delay ticker
		if(soundDelay > 0)
			soundDelay--;
		
		if(yawSoundDelay > 0)
			yawSoundDelay--;
		if(pitchSoundDelay > 0)
			pitchSoundDelay--;
		
		//updatePosition();
		
		if (playYawSound == true && yawSoundDelay == 0 && seatInfo.traverseSounds == true && !driveable.disabled)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, seatInfo.yawSound, false);
			yawSoundDelay = seatInfo.yawSoundLength;
		}
		
		if (playPitchSound == true && pitchSoundDelay == 0 && seatInfo.traverseSounds == true && !driveable.disabled)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, seatInfo.pitchSound, false);
			pitchSoundDelay = seatInfo.pitchSoundLength;
		}

        //Reset traverse sounds if player exits the vehicle
        if(riddenByEntity instanceof EntityPlayer == false || !FlansMod.proxy.isThePlayer((EntityPlayer)riddenByEntity))
        {
            playYawSound = false;
            playPitchSound = false;
            yawSoundDelay = 0;
            pitchSoundDelay = 0;
        }

		//If on the client
		if(worldObj.isRemote)
		{
			if( driver &&
				riddenByEntity instanceof EntityPlayer &&
				FlansMod.proxy.isThePlayer((EntityPlayer) riddenByEntity) &&
				FlansModClient.controlModeMouse && driveable.hasMouseControlMode())
			{
				looking = new RotatedAxes();
				playerLooking = new RotatedAxes();
			}
			//DEBUG : Spawn particles along axes

			Vector3f xAxis = driveable.axes.findLocalAxesGlobally(looking).getXAxis();
			Vector3f yAxis = driveable.axes.findLocalAxesGlobally(looking).getYAxis();
			Vector3f zAxis = driveable.axes.findLocalAxesGlobally(looking).getZAxis();
			Vector3f yOffset = driveable.axes.findLocalVectorGlobally(new Vector3f(0F, riddenByEntity == null ? 0F : (float)riddenByEntity.getYOffset(), 0F));
			for(int i = 0; i < 10; i++)
			{
				//worldObj.spawnParticle("enchantmenttable", 	posX + xAxis.x * i * 0.3D + yOffset.x, posY + xAxis.y * i * 0.3D + yOffset.y, posZ + xAxis.z * i * 0.3D + yOffset.z, 0, 0, 0);
				//worldObj.spawnParticle("smoke", 			posX + yAxis.x * i * 0.3D + yOffset.x, posY + yAxis.y * i * 0.3D + yOffset.y, posZ + yAxis.z * i * 0.3D + yOffset.z, 0, 0, 0);
				//worldObj.spawnParticle("reddust", 			posX + zAxis.x * i * 0.3D + yOffset.x, posY + zAxis.y * i * 0.3D + yOffset.y, posZ + zAxis.z * i * 0.3D + yOffset.z, 0, 0, 0);
			}

			if(lastRiddenByEntity instanceof EntityPlayer && riddenByEntity == null && FlansMod.proxy.isThePlayer((EntityPlayer)lastRiddenByEntity))
				FlansMod.getPacketHandler().sendToServer(new PacketSeatCheck(this));
		}


		if(riddenByEntity instanceof EntityPlayer && shooting)
			pressKey(9, (EntityPlayer)riddenByEntity);

		minigunSpeed *= 0.95F;
		minigunAngle += minigunSpeed;
		//prevLooking = looking.clone();

		lastRiddenByEntity = riddenByEntity;
	}

	/** Set the position to be that of the driveable plus the local position, rotated */
	public void updatePosition()
	{
		//If we haven't found our driveable, give up
		if(worldObj.isRemote && !foundDriveable)
			return;

		prevPlayerPosX = playerPosX;
		prevPlayerPosY = playerPosY;
		prevPlayerPosZ = playerPosZ;

		prevPlayerYaw = playerYaw;
		prevPlayerPitch = playerPitch;

		//Get the position of this seat on the driveable axes
		Vector3f localPosition = new Vector3f(seatInfo.x / 16F, seatInfo.y / 16F, seatInfo.z / 16F);

		//Rotate the offset vector by the turret yaw
		if(driveable != null && driveable.seats != null && driveable.seats[0] != null && driveable.seats[0].looking != null)
		{
			RotatedAxes yawOnlyLooking = new RotatedAxes(driveable.seats[0].looking.getYaw(), (driveable.seats[0].seatInfo.part == EnumDriveablePart.barrel)?driveable.seats[0].looking.getPitch():0F, 0F);
			Vector3f rotatedOffset = yawOnlyLooking.findLocalVectorGlobally(seatInfo.rotatedOffset);
			Vector3f.add(localPosition, new Vector3f(rotatedOffset.x, (driveable.seats[0].seatInfo.part == EnumDriveablePart.barrel)?rotatedOffset.y:0F, rotatedOffset.z), localPosition);
		}

		//If this seat is connected to the turret, then its position vector on the driveable axes needs an extra rotation in it
		//if(driveable.rotateWithTurret(seatInfo) && driveable.seats[0] != null)
			//localPosition = driveable.seats[0].looking.findLocalVectorGlobally(localPosition);
		//Get the position of this seat globally, but positionally relative to the driveable
		Vector3f relativePosition = driveable.axes.findLocalVectorGlobally(localPosition);
		//Set the absol
		setPosition(driveable.posX + relativePosition.x, driveable.posY + relativePosition.y, driveable.posZ + relativePosition.z);

		if(riddenByEntity != null)
		{
	    	DriveableType type = driveable.getDriveableType();
			Vec3 yOffset = driveable.rotate(0, riddenByEntity.getYOffset(), 0).toVec3();

			playerPosX = posX + yOffset.xCoord;
			playerPosY = posY + yOffset.yCoord;
			playerPosZ = posZ + yOffset.zCoord;

			riddenByEntity.lastTickPosX = riddenByEntity.prevPosX = prevPlayerPosX;
			riddenByEntity.lastTickPosY = riddenByEntity.prevPosY = prevPlayerPosY;
			riddenByEntity.lastTickPosZ = riddenByEntity.prevPosZ = prevPlayerPosZ;
            riddenByEntity.setPosition(playerPosX, playerPosY, playerPosZ);

            //Calculate the local look axes globally
            RotatedAxes globalLookAxes = driveable.axes.findLocalAxesGlobally(playerLooking);
			//Set the player's rotation based on this
			playerYaw = -90F + globalLookAxes.getYaw();
			playerPitch = globalLookAxes.getPitch();

			double dYaw = playerYaw - prevPlayerYaw;
			if(dYaw > 180)
				prevPlayerYaw += 360F;
			if(dYaw < -180)
				prevPlayerYaw -= 360F;

			if(riddenByEntity instanceof EntityPlayer)
			{
				riddenByEntity.prevRotationYaw = prevPlayerYaw;
				riddenByEntity.prevRotationPitch = prevPlayerPitch;

				riddenByEntity.rotationYaw = playerYaw;
				riddenByEntity.rotationPitch = playerPitch;
			}

			//If the entity is a player, roll its view accordingly
			if(worldObj.isRemote)
			{
				prevPlayerRoll = playerRoll;
				playerRoll = -globalLookAxes.getRoll();
			}
		}
	}

	@Override
    public void updateRiderPosition()
    {
		if(riddenByEntity instanceof EntityPlayer)
		{
			riddenByEntity.rotationYaw = playerYaw;
			riddenByEntity.rotationPitch = playerPitch;
			riddenByEntity.prevRotationYaw = prevPlayerYaw;
			riddenByEntity.prevRotationPitch = prevPlayerPitch;
		}
		riddenByEntity.lastTickPosX = riddenByEntity.prevPosX = prevPlayerPosX;
		riddenByEntity.lastTickPosY = riddenByEntity.prevPosY = prevPlayerPosY;
		riddenByEntity.lastTickPosZ = riddenByEntity.prevPosZ = prevPlayerPosZ;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public EntityLivingBase getCamera()
	{
		return driveable.getCamera();
	}

	@Override
    public boolean canBeCollidedWith()
    {
        return !isDead;
    }

	@Override
    protected void entityInit()
    {
    }

	@Override
    public float getShadowSize()
    {
        return 4.0F;
    }

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags)
	{
		//Do not read. Spawn with driveable
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags)
	{
		//Do not write. Spawn with driveable
	}

	@Override
    public boolean writeToNBTOptional(NBTTagCompound tags)
    {
        return false;
    }

	@Override
    public boolean writeMountToNBT(NBTTagCompound tags)
    {
        return false;
    }

	@Override
	public void onMouseMoved(int deltaX, int deltaY)
	{
		if(!foundDriveable)
			return;
		
		prevLooking = looking.clone();
		prevPlayerLooking = playerLooking.clone();

		//Driver seat should pass input to driveable
		if(driver)
		{
			driveable.onMouseMoved(deltaX, deltaY);
		}
		
		//Other seats should look around, but also the driver seat if mouse control mode is disabled
		if(!driver || !FlansModClient.controlModeMouse || !driveable.hasMouseControlMode())
		{
			float lookSpeed = 4F;

			//Angle stuff for the player

			//Calculate the new pitch and consider pitch limiters
			float newPlayerPitch = playerLooking.getPitch() - deltaY / lookSpeed * FlansMod.proxy.getMouseSensitivity();
			if(newPlayerPitch > -seatInfo.minPitch)
				newPlayerPitch = -seatInfo.minPitch;
			if(newPlayerPitch < -seatInfo.maxPitch)
				newPlayerPitch = -seatInfo.maxPitch;

			//Calculate new yaw and consider yaw limiters
			float newPlayerYaw = playerLooking.getYaw() + deltaX / lookSpeed * FlansMod.proxy.getMouseSensitivity();
			//Since the yaw limiters go from -360 to 360, we need to find a pair of yaw values and check them both
			float otherNewPlayerYaw = newPlayerYaw - 360F;
			if(newPlayerYaw < 0)
				otherNewPlayerYaw = newPlayerYaw + 360F;
			if((newPlayerYaw >= seatInfo.minYaw && newPlayerYaw <= seatInfo.maxYaw) || (otherNewPlayerYaw >= seatInfo.minYaw && otherNewPlayerYaw <= seatInfo.maxYaw))
			{
				//All is well
			}
			else
			{
				float newPlayerYawDistFromRange = Math.min(Math.abs(newPlayerYaw - seatInfo.minYaw), Math.abs(newPlayerYaw - seatInfo.maxYaw));
				float otherPlayerNewYawDistFromRange = Math.min(Math.abs(otherNewPlayerYaw - seatInfo.minYaw), Math.abs(otherNewPlayerYaw - seatInfo.maxYaw));
				//If the newYaw is closer to the range than the otherNewYaw, move newYaw into the range
				if(newPlayerYawDistFromRange <= otherPlayerNewYawDistFromRange)
				{
					if(newPlayerYaw > seatInfo.maxYaw)
						newPlayerYaw = seatInfo.maxYaw;
					if(newPlayerYaw < seatInfo.minYaw)
						newPlayerYaw = seatInfo.minYaw;
				}
				//Else, the otherNewYaw is closer, so move it in
				else
				{
					if(otherNewPlayerYaw > seatInfo.maxYaw)
						otherNewPlayerYaw = seatInfo.maxYaw;
					if(otherNewPlayerYaw < seatInfo.minYaw)
						otherNewPlayerYaw = seatInfo.minYaw;
					//Then match up the newYaw with the otherNewYaw
					if(newPlayerYaw < 0)
						newPlayerYaw = otherNewPlayerYaw - 360F;
					else newPlayerYaw = otherNewPlayerYaw + 360F;
				}
			}
			//Now set the new angles
			playerLooking.setAngles(newPlayerYaw, newPlayerPitch, 0F);


			//Move the seat accordingly


			//Consider new Yaw and Yaw limiters
			if(driveable.disabled) return;

			float targetX;
			
			if(FlansModClient.controlModeMouse || !driver ||(driveable instanceof EntityPlane))
			targetX = playerLooking.getYaw();
			else targetX = targetYaw;
			
			
			float yawToMove = (targetX - looking.getYaw());
			for(; yawToMove > 180F; yawToMove -= 360F) {}
			for(; yawToMove <= -180F; yawToMove += 360F) {}

			float signDeltaX = 0;
			if(yawToMove > (seatInfo.aimingSpeed.x/2) && seatInfo.legacyAiming == false){
				signDeltaX = 1;
			} else if(yawToMove < -(seatInfo.aimingSpeed.x/2) && seatInfo.legacyAiming == false){
				signDeltaX = -1;
			} else{
				signDeltaX = 0;
			}

			//Calculate new yaw and consider yaw limiters
			float newYaw = 0f;

			if(seatInfo.legacyAiming == true || (signDeltaX == 0 && deltaX == 0)){
				newYaw = targetX;
			} else {
				newYaw = looking.getYaw() + signDeltaX*seatInfo.aimingSpeed.x;
			}
			//Since the yaw limiters go from -360 to 360, we need to find a pair of yaw values and check them both
			float otherNewYaw = newYaw - 360F;
			if(newYaw < 0)
				otherNewYaw = newYaw + 360F;
			if((newYaw >= seatInfo.minYaw && newYaw <= seatInfo.maxYaw) || (otherNewYaw >= seatInfo.minYaw && otherNewYaw <= seatInfo.maxYaw))
			{
				//All is well
			}
			else
			{
				float newYawDistFromRange = Math.min(Math.abs(newYaw - seatInfo.minYaw), Math.abs(newYaw - seatInfo.maxYaw));
				float otherNewYawDistFromRange = Math.min(Math.abs(otherNewYaw - seatInfo.minYaw), Math.abs(otherNewYaw - seatInfo.maxYaw));
				//If the newYaw is closer to the range than the otherNewYaw, move newYaw into the range
				if(newYawDistFromRange <= otherNewYawDistFromRange)
				{
					if(newYaw > seatInfo.maxYaw)
						newYaw = seatInfo.maxYaw;
					if(newYaw < seatInfo.minYaw)
						newYaw = seatInfo.minYaw;
				}
				//Else, the otherNewYaw is closer, so move it in
				else
				{
					if(otherNewYaw > seatInfo.maxYaw)
						otherNewYaw = seatInfo.maxYaw;
					if(otherNewYaw < seatInfo.minYaw)
						otherNewYaw = seatInfo.minYaw;
					//Then match up the newYaw with the otherNewYaw
					if(newYaw < 0)
						newYaw = otherNewYaw - 360F;
					else newYaw = otherNewYaw + 360F;
				}
			}

			//Calculate the new pitch and consider pitch limiters
			float targetY = playerLooking.getPitch();
			
			if(!FlansModClient.controlModeMouse && driver && !(driveable instanceof EntityPlane)) targetY = targetPitch;

			float pitchToMove = (targetY - looking.getPitch());
			for(; pitchToMove > 180F; pitchToMove -= 360F) {}
			for(; pitchToMove <= -180F; pitchToMove += 360F) {}

			float signDeltaY = 0;
			if(pitchToMove > (seatInfo.aimingSpeed.y/2) && seatInfo.legacyAiming == false){
				signDeltaY = 1;
			} else if(pitchToMove < -(seatInfo.aimingSpeed.y/2) && seatInfo.legacyAiming == false){
				signDeltaY = -1;
			} else {
				signDeltaY = 0;
			}

			float newPitch = 0f;


			//Pitches the gun at the last possible moment in order to reach target pitch at the same time as target yaw.
			float minYawToMove = 0f;

			float currentYawToMove = 0f;

			if(seatInfo.latePitch){
			minYawToMove = ((float)Math.sqrt((pitchToMove / seatInfo.aimingSpeed.y)*(pitchToMove / seatInfo.aimingSpeed.y)))*seatInfo.aimingSpeed.x;
			} else {
			minYawToMove = 360f;
			}

			currentYawToMove = (float)Math.sqrt((yawToMove)*(yawToMove));

			if(seatInfo.legacyAiming == true || (signDeltaY == 0 && deltaY == 0)){
				newPitch = targetY;
			} else  if (seatInfo.yawBeforePitch == false && currentYawToMove < minYawToMove || !FlansModClient.controlModeMouse){
				newPitch = looking.getPitch() + signDeltaY*seatInfo.aimingSpeed.y;
			} else if (seatInfo.yawBeforePitch == true && signDeltaX == 0){
				newPitch = looking.getPitch() + signDeltaY*seatInfo.aimingSpeed.y;
			} else if (seatInfo.yawBeforePitch == true && signDeltaX != 0){
				newPitch = looking.getPitch();
			} else {
				newPitch = looking.getPitch();
			}

			if(newPitch > -seatInfo.minPitch)
				newPitch = -seatInfo.minPitch;
			if(newPitch < -seatInfo.maxPitch)
				newPitch = -seatInfo.maxPitch;

			//Now set the new angles
			if((driveable instanceof EntityVehicle && ((EntityVehicle)driveable).target == null) || !(driveable instanceof EntityVehicle))
			looking.setAngles(newYaw, newPitch, 0F);

			FlansMod.getPacketHandler().sendToServer(new PacketSeatUpdates(this));

			if(signDeltaX != 0 && seatInfo.traverseSounds == true){
				playYawSound = true;
			} else {
				playYawSound = false;
			}

			if(signDeltaY != 0 && seatInfo.yawBeforePitch == false && currentYawToMove < minYawToMove){
				playPitchSound = true;
			} else if (signDeltaY != 0 && seatInfo.yawBeforePitch == true && signDeltaX == 0){
				playPitchSound = true;
			} else {
				playPitchSound = false;
			}
			
			if((driveable instanceof EntityVehicle && ((EntityVehicle)driveable).target != null)){
				playPitchSound = false;
				playYawSound = false;
			}
			
	        //Play traverse sounds
		}
	}

	@Override
	public void updateKeyHeldState(int key, boolean held)
	{
		if(worldObj.isRemote && foundDriveable)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketDriveableKeyHeld(key, held));

		}
		if(driver)
		{
			driveable.updateKeyHeldState(key, held);
		}
		else if(key == 9)
		{
			shooting = held;
		}
	}

	@Override
	public boolean pressKey(int key, EntityPlayer player)
	{
		//Driver seat should pass input to driveable
		if(driver && (!worldObj.isRemote || foundDriveable))
		{
			return driveable.pressKey(key, player);
		}
	
		if(worldObj.isRemote)
		{
			if(foundDriveable)
			{
				FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
				if(key == 9)
					minigunSpeed += 0.1F;
			}
			return false;
		}
		
	
		//Exit key pressed
		if(key == 6 && riddenByEntity != null)
		{
			riddenByEntity.mountEntity(null);
		}
	
		if(key == 9) //Shoot
		{
			//Get the gun from the plane type and the ammo from the data
			GunType gun = seatInfo.gunType;
	
			minigunSpeed += 0.1F;
	
			if(gun != null && gun.fireMode[0] != FireMode.MINIGUN || minigunSpeed > 2F)
			{
				if(gunDelay <= 0 && TeamsManager.bulletsEnabled && driveable.getDriveableData().ammo.length > 0)
				{
	
					ItemStack bulletItemStack = driveable.getDriveableData().ammo[seatInfo.gunnerID];
					//Check that neither is null and that the bullet item is actually a bullet
					if(gun != null && gun.isValidAmmo(bulletItemStack))
					{
						//Gun origin
						Vector3f gunOrigin = Vector3f.add(driveable.axes.findLocalVectorGlobally(seatInfo.gunOrigin), new Vector3f(driveable.posX, driveable.posY, driveable.posZ), null);
						//Calculate the look axes globally
						RotatedAxes globalLookAxes = driveable.axes.findLocalAxesGlobally(looking);
						Vector3f shootVec = driveable.axes.findLocalVectorGlobally(looking.getXAxis());
						//Calculate the origin of the bullets
						Vector3f yOffset = driveable.axes.findLocalVectorGlobally(new Vector3f(0F, (float)player.getMountedYOffset(), 0F));
						//Spawn a new bullet item
						worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x, gunOrigin.y, gunOrigin.z), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
						//Play the shoot sound
						if(soundDelay <= 0)
						{
							PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, gun.shootSound[0], false);
							soundDelay = gun.shootSoundLength;
						}
						//Get the bullet item damage and increment it
						int damage = bulletItemStack.getItemDamage();
						if(!((EntityPlayer)riddenByEntity).capabilities.isCreativeMode)
						bulletItemStack.setItemDamage(damage + 1);
						//If the bullet item is completely damaged (empty)
						if(damage >= bulletItemStack.getMaxDamage())
						{
							//Set the damage to 0 and consume one ammo item (unless in creative)
							if(((EntityPlayer)riddenByEntity).capabilities.isCreativeMode)
							{
								bulletItemStack.setItemDamage(0);
							}
							else
							{
								driveable.getDriveableData().ammo[seatInfo.gunnerID] = null;
							}
						}
						//Reset the shoot delay
						gunDelay = gun.shootDelay;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) //interact : change back when Forge updates
    {
		if(isDead)
			return false;
		if(worldObj.isRemote)
			return false;
		//If they are using a repair tool, don't put them in
		ItemStack currentItem = entityplayer.getCurrentEquippedItem();
		if(currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables)
			return true;
		if(currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.key)
			return true;
		if(currentItem != null && currentItem.getItem() instanceof ItemLead)
		{
			if(riddenByEntity != null && riddenByEntity instanceof EntityLiving && !(riddenByEntity instanceof EntityPlayer))
			{
				EntityLiving mob = (EntityLiving)riddenByEntity;
				riddenByEntity.mountEntity(null);
				mob.setLeashedToEntity(entityplayer, true);
				return true;
			}
			double checkRange = 10;
			List nearbyMobs = worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(posX - checkRange, posY - checkRange, posZ - checkRange, posX + checkRange, posY + checkRange, posZ + checkRange));
			for(Object obj : nearbyMobs)
			{
				EntityLiving entity = (EntityLiving)obj;
				if(entity.getLeashed() && entity.getLeashedToEntity() == entityplayer && !driveable.locked)
				{
					entity.mountEntity(this);
					looking.setAngles(-entity.rotationYaw, entity.rotationPitch, 0F);
					entity.clearLeashed(true, !entityplayer.capabilities.isCreativeMode);
				}
			}
			return true;
		}
		//Put them in the seat
		if(riddenByEntity == null && !driveable.locked)
		{
			entityplayer.mountEntity(this);
			return true;
		}
        return false;
    }

	@Override
	public Entity getControllingEntity()
	{
		return riddenByEntity;
	}

	@Override
	public boolean isDead()
	{
		return isDead;
	}

	public boolean exists = true;
	
	@Override
	public void setDead()
	{
		if (worldObj.isRemote) {
			if (driveable.isDead) {
				// Print.spam(1, "Received 'setDead()' call, but ignoring it since it wasn't
				// sent from the server.");
				super.setDead();
			} else {
				super.setDead();
			}
		} else {
			super.setDead();
		}
	}

	/**
	@Override
    public void updateRiderPosition()
    {
		if(riddenByEntity == null || (worldObj.isRemote && !foundDriveable))
        {
            return;
        } else
        {
        	DriveableType type = driveable.getDriveableType();
			Vec3 yOffset = driveable.rotate(0, riddenByEntity.getYOffset(), 0).toVec3();



			return;
        }
    }
	**/


	@Override
    public ItemStack getPickedResult(MovingObjectPosition target)
    {
		if(worldObj.isRemote && !foundDriveable)
			return null;
		return driveable.getPickedResult(target);
    }

	@Override
	public float getPlayerRoll()
	{
		for(; playerRoll - prevPlayerRoll > 180F; playerRoll -= 360F) ;
		for(; playerRoll - prevPlayerRoll < -180F; playerRoll += 360F) ;
		return playerRoll;
	}

	@Override
	public float getCameraDistance()
	{
		return foundDriveable && seatID == 0 ? driveable.getDriveableType().cameraDistance : 5F;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float f) {
		return !(worldObj.isRemote && !foundDriveable) && driveable.attackEntityFrom(source, f);
	}

	@Override
	public void writeSpawnData(ByteBuf data)
	{
		data.writeInt(driveableID);
		data.writeInt(seatInfo.id);
	}

	@Override
	public void readSpawnData(ByteBuf data)
	{
		driveableID = data.readInt();
		driveable = (EntityDriveable)worldObj.getEntityByID(driveableID);
		seatID = data.readInt();
		driver = seatID == 0;
		if(driveable != null)
		{
			seatInfo = driveable.getDriveableType().seats[seatID];
			looking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
			playerPosX = prevPlayerPosX = posX = driveable.posX;
			playerPosY = prevPlayerPosY = posY = driveable.posY;
			playerPosZ = prevPlayerPosZ = posZ = driveable.posZ;
			setPosition(posX, posY, posZ);
		}

	}

	public float getMinigunSpeed()
	{
		return minigunSpeed;
	}
	
}
