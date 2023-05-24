package com.flansmod.client.model;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
//added something here
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.GunType.GunTag;

import net.minecraft.item.ItemStack;
//to separate it from the original codes

public class GunAnimations 
{
	public static final GunAnimations defaults = new GunAnimations();
	
	/** Recoil */
	public float gunRecoilRotZ = 0F, lastGunRecoilRotZ = 0F, gunRecoilRotY = 0F, lastGunRecoilRotY = 0F, gunRecoilRotX = 0F, lastGunRecoilRotX = 0F;
	public float gunRecoilTransX = 0F, lastGunRecoilTransX = 0F, gunRecoilTransZ = 0F, lastGunRecoilTransZ = 0F, gunRecoilTransY = 0F, lastGunRecoilTransY = 0F;
	public float antiRecoilRotZConst = 0F, antiRecoilRotYConst = 0F, antiRecoilRotXConst = 0F, antiRecoilTransXConst = 0F, antiRecoilTransZConst = 0F, antiRecoilTransYConst = 0F;
	public float gunRecoilRotShakeX = 0F, gunRecoilRotShakeY = 0F, gunRecoilRotShakeZ = 0F, gunRecoilTransShakeX = 0F, gunRecoilTransShakeY = 0F, gunRecoilTransShakeZ = 0F, 
				 antiRecoilShakeConst = 0F;
	public float chargeProgress = 0F, lastChargeProgress = 0F;
	public int chargeStage = 0, checkChamberStage = 0;
	//to separate from
	/** Slide */
	public float gunSlide = 0F, lastGunSlide = 0F, slideVelocity = 0F;
	private float[] slideAcceleration = { 0F, 0F };
	public int preLockSlideTime = 0;
	/** Charge handle variables */
	public int timeUntilCharge = 0, timeToChargeFor = 0;
	public float charged = -1F, lastCharged = -1F;
	public boolean charging = false;
	
	public boolean reloading = false;
	public float reloadAnimationTime = 0;
	public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;
	public int reloadAmmoCount = 1;

	public float minigunBarrelRotation = 0F;
	public float minigunBarrelRotationSpeed = 0F;
	/** muzzle flash duration, flash texture enabled and flash model rotate angle along x-axis */
	public float flashAlpha = 0F, lastFlashAlpha = 0F, muzzleFlashVanishConst = 0F;
	public int flashNum = 0;
	public float flashRotate = 0;
    
	/** Melee animations */
	public int meleeAnimationProgress = 0, meleeAnimationLength = 0;
	
	public GunAnimations() { }
	
	public void update()
	{
		lastCharged = charged;
		//Timer until pulling back the charge handle/bolt
		if(timeUntilCharge > 0)
		{
			timeUntilCharge--;
			if(timeUntilCharge == 0)
			{
				//Pump it!
				charging = true;	
				lastCharged = charged = -1F;
			}
			
		}
		
		lastFlashAlpha = flashAlpha;
		flashAlpha *= muzzleFlashVanishConst;
		
		//update model recoil
		gunRecoilRotZ = (lastGunRecoilRotZ = gunRecoilRotZ) * antiRecoilRotZConst;
		gunRecoilRotY = (lastGunRecoilRotY = gunRecoilRotY) * antiRecoilRotYConst;
		gunRecoilRotX = (lastGunRecoilRotX = gunRecoilRotX) * antiRecoilRotXConst;
		
		gunRecoilTransX = (lastGunRecoilTransX = gunRecoilTransX) * antiRecoilTransXConst;
		gunRecoilTransZ = (lastGunRecoilTransZ = gunRecoilTransZ) * antiRecoilTransZConst;
		gunRecoilTransY = (lastGunRecoilTransY = gunRecoilTransY) * antiRecoilTransYConst;
		
		gunRecoilRotShakeX *= antiRecoilShakeConst;
		gunRecoilRotShakeY *= antiRecoilShakeConst;
		gunRecoilRotShakeZ *= antiRecoilShakeConst;
		gunRecoilTransShakeX *= antiRecoilShakeConst;
		gunRecoilTransShakeY *= antiRecoilShakeConst;
		gunRecoilTransShakeZ *= antiRecoilShakeConst;
		
		//gun charge for third person
		lastChargeProgress = chargeProgress;
		if(chargeStage != 0)
		{
			chargeProgress += chargeStage * 2F / timeToChargeFor;
			
			if(chargeStage == 1)
			{
				if(chargeProgress >= 1F)
				{
					chargeProgress = 1F;
					chargeStage = -1;
				}
			}
			else if(chargeProgress <= 0F) //chargeStage == -1
			{
				chargeProgress = 0F;
				chargeStage = 0;
			}
		}
		else if(checkChamberStage != 0)
		{
			chargeProgress += checkChamberStage * 2F / timeToChargeFor;
			
			if(checkChamberStage == 1)
			{
				if(chargeProgress >= 1F)
				{
					chargeProgress = 1F;
					checkChamberStage = -1;
				}
			}
			else if(chargeProgress <= 0F) //chargeStage == -1
			{
				chargeProgress = 0F;
				checkChamberStage = 0;
			}
		}
		
		//Gun slide
		if(gunSlide > 0F || lastGunSlide > 0F)
		{
			slideVelocity += slideAcceleration[0] + slideAcceleration[1] * gunSlide;
			if((gunSlide = (lastGunSlide = gunSlide) - slideVelocity) < 0F) gunSlide = 0F;
		}
		
		if(preLockSlideTime > 0) --preLockSlideTime;
		else if(preLockSlideTime < 0) ++preLockSlideTime;
		
		/** disabled temply
		minigunBarrelRotation += minigunBarrelRotationSpeed;
		minigunBarrelRotationSpeed *= 0.9F;*/
		
		if(meleeAnimationLength > 0)
		{
			meleeAnimationProgress++;
			//If we are done, reset
			if(meleeAnimationProgress == meleeAnimationLength)
				meleeAnimationProgress = meleeAnimationLength = 0;
		}
	}
	
	public float doSlideRelease(float gs, float[] sa)
	{
		slideVelocity = 0F;
		slideAcceleration = sa;
		return lastGunSlide = gunSlide = gs;
	}
	
	public void doCharge(int ct)
	{
		timeToChargeFor = ct;
		chargeStage = 1;
	}
	
	public void checkChamber(int cct)
	{
		timeToChargeFor = cct;
		checkChamberStage = 1;
	}
	
	/** this method is use by PacketPlayerShoot to render the animation of other player's shoot */
	public void doShoot(boolean pls, float[] sa, float fvc, int fn, float fr)
	{
		if(pls) preLockSlideTime = FlansMod.preLockSlideTime;
		
		gunSlide = 1F;
		slideAcceleration = sa;
		if((muzzleFlashVanishConst = fvc) > 0F)
		{
			flashAlpha = 1F;
			flashNum = fn;
			flashRotate = fr;
		}
	}
	
	public void doShoot(GunType type, ItemStack stack, boolean pls, float fvc, int fn, float fr)
	{
		//if we are asked to do pre lock slide
		if(pls) preLockSlideTime = FlansMod.preLockSlideTime;
		
		//create gun case and gun smoke
		if(FlansModClient.gunCaseList[FlansModClient.currentCaseIndex].caseType != null)
			RenderGun.createCaseForGun = true;
		RenderGun.createSmokeForGun = true;
		
		//Accumulative recoil function
		int[] states = GunType.getStates(stack);
		gunRecoilRotZ += FlansModClient.staticRecoilPitch * GunType.getState(states, GunTag.RECOIL_ROT_Z);
		gunRecoilRotY += FlansModClient.staticRecoilYaw * GunType.getState(states, GunTag.RECOIL_ROT_Y);
		gunRecoilRotX += FlansModClient.staticRecoilYaw * type.recoilRotXConst;
		gunRecoilTransX += FlansModClient.staticRecoilPitch * GunType.getState(states, GunTag.RECOIL_TRANS_X_BY_PITCH)
						   + (float)Math.abs(FlansModClient.staticRecoilYaw) * GunType.getState(states, GunTag.RECOIL_TRANS_X_BY_YAW);
		gunRecoilTransZ += FlansModClient.staticRecoilYaw * type.recoilTransZConst;
		gunRecoilTransY += FlansModClient.staticRecoilPitch * type.recoilTransYConst;
		antiRecoilRotZConst = type.getAntiModelRecoilConstant(stack);
		antiRecoilRotYConst = type.getAntiModelRecoilYawConstant(stack);
		antiRecoilRotXConst = type.antiRecoilRotXConst;
		antiRecoilTransXConst = type.getAntiModelRecoilDistanceConstant(stack);
		antiRecoilTransZConst = type.antiRecoilTransZConst;
		antiRecoilTransYConst = type.antiRecoilTransYConst;
		
		setGunShake(type.model);
		//to separate it from the original codes
		
		minigunBarrelRotationSpeed += 2F;
		gunSlide = 1F;
		slideVelocity = 0F;
		slideAcceleration = type.slideAcceleration;
		
		if((muzzleFlashVanishConst = fvc) > 0F)
		{
			flashAlpha = 1F;
			flashNum = fn;
			flashRotate = fr;
		}
	}
	
	private void setGunShake(ModelGun model)
	{
		if(FlansModClient.crouching)
		{
			gunRecoilRotShakeX = model.recoilShakeRotX * FlansMod.decreaseRecoilShake;
			gunRecoilRotShakeY = model.recoilShakeRotY * FlansMod.decreaseRecoilShake;
			gunRecoilRotShakeZ = model.recoilShakeRotZ * FlansMod.decreaseRecoilShake;
			gunRecoilTransShakeX = model.recoilShakeTransX * FlansMod.decreaseRecoilShake;
			gunRecoilTransShakeY = model.recoilShakeTransY * FlansMod.decreaseRecoilShake;
			gunRecoilTransShakeZ = model.recoilShakeTransZ * FlansMod.decreaseRecoilShake;
			antiRecoilShakeConst = model.antiRecoilShakeConst * FlansMod.decreaseRecoilShake;
			return;
		}
		gunRecoilRotShakeX = model.recoilShakeRotX;
		gunRecoilRotShakeY = model.recoilShakeRotY;
		gunRecoilRotShakeZ = model.recoilShakeRotZ;
		gunRecoilTransShakeX = model.recoilShakeTransX;
		gunRecoilTransShakeY = model.recoilShakeTransY;
		gunRecoilTransShakeZ = model.recoilShakeTransZ;
		antiRecoilShakeConst = model.antiRecoilShakeConst;
	}
	
	public void doMelee(int meleeTime) { meleeAnimationLength = meleeTime; }
}
