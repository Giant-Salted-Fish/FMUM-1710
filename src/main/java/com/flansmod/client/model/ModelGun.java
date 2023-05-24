package com.flansmod.client.model;

import java.util.HashMap;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.TwoVector3f;
import com.flansmod.common.vector.Vector3f;

public abstract class ModelGun extends ModelFlan
{
	//Shapebox template. For quick copy pasting
	//, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
	
	//These first 7 models are static with no animation
	public ModelRendererTurbo[] gunModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] backpackModel = new ModelRendererTurbo[0]; //For flamethrowers and such like. Rendered on the player's back
	//These models appear when no attachment exists
	public ModelRendererTurbo[] defaultStockBaseModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultStockModel2 = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] lightStuffModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] pumpModel2 = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] switchModel = new ModelRendererTurbo[0], boltCatchButtonModel = new ModelRendererTurbo[0];
	public int numSwitchModel = 0;
	//to separate if from the original codes

	//Animated models follow
    public ModelRendererTurbo[] slideModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] altslideModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pumpModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] chargeModel = new ModelRendererTurbo[0];
	/** The point about which the minigun barrel rotates. Rotation is along the line of the gun through this point */
	public Vector3f minigunBarrelOrigin = new Vector3f();
	
	public float inertiaXConst = 0.1F, inertiaXMult = 0.8F, inertiaYConst = -0.1F, inertiaYMult = 0.8F, inertiaZConst = -0.1F, inertiaZMult = 0.8F, 
				 aimGravityConst = 0.05F, aimGravityMult = 0.8F, gravityConst = 0.15F, gravityMult = 0.8F;
	public float breathShakeAmplitudeY = 0.0012F, breathShakeCycleY = 0.07F, breathShakePhaseY = 0F, breathShakeAmplitudeZ = 0.0012F, breathShakeCycleZ = 0.035F, breathShakePhaseZ = 0F, 
				 breathShakeRotMultY = 0.1F, breathShakeRotMultZ = -0.1F, cameraYawBreathShakeMult = -0.2F, cameraPitchBreathShakeMult = 0.2F, 
				 walkShakeCycle = -(float)Math.PI, walkShakeAmplitudeY[] = new float[]{0.1F, 0.2F, -0.8F}, walkShakeAmplitudeZ[] = new float[]{0.1F, 0.2F, 0.8F}, 
				 cameraWalkShakeMultPitch[] = new float[]{-7F, -7F, -5F}, cameraWalkShakeMultYaw[] = new float[]{7F, 7F, 5F}, 
				 walkShakeRotMultY[] = new float[]{-5F, -10F, -40F}, walkShakeRotMultZ[] = new float[]{5F, 10F, -40F}, walkShakeRotMultX[] = new float[]{-5F, -10F, -40F};
	
	/** recoil shake */
	public float recoilShakeRotX = 2F, recoilShakeRotY = 0.8F, recoilShakeRotZ = 0.8F, recoilShakeTransX = 0.04F, recoilShakeTransY = 0.01F, recoilShakeTransZ = 0.01F, 
				 antiRecoilShakeConst = 0.36F;
	/** when no sight installed, player will look through this point from x-axis */
	public Vector3f barrelOrigin = new Vector3f(), chamberSmokeOri = new Vector3f();
	/** where the mag will attach to this gun */
	public Vector3f magAttachPoint = new Vector3f(), magAttachRotate = new Vector3f();
	
	/** gun extra translate and when entering the gun modify mode */
	public Vector3f gunModifyTranslate = new Vector3f(1F, 0.1F, 0F);
	
	//Gun position states
	/** The roate point that all those rotate states below follows */
	public Vector3f holdingTranslate = new Vector3f(), holdingRotate = new Vector3f(), aimingTranslate = new Vector3f(), aimingRotate = new Vector3f();
	public Vector3f sprintTranslate = new Vector3f(), sprintRotate = new Vector3f();
	public Vector3f takeOutTranslate = new Vector3f(), takeOutRotate = new Vector3f(), restTranslate = new Vector3f(), restRotate = new Vector3f();
	/** For reload animation that applied on gun */
	public Vector3f reloadTranslate = new Vector3f(), reloadRotate = new Vector3f();
	public Vector3f magTranslate = new Vector3f(), magRotate = new Vector3f(), magTranslate2 = new Vector3f(), magRotate2 = new Vector3f();
	public float magTimeRatio = 1F;
	/** for check ammo animation that applied on gun */
	public Vector3f checkAmmoTranslate = new Vector3f(), checkAmmoRotate = new Vector3f(), checkAmmoMagTranslate = new Vector3f(), checkAmmoMagRotate = new Vector3f(), 
					checkAmmoMagTranslate2 = new Vector3f(), checkAmmoMagRotate2 = new Vector3f();
	public float checkAmmoTiltTimeRatio = 1F / 6F, checkAmmoMagTimeRatio = 1F / 3F, checkAmmoEndTime = 2F / 3F;
	/** for check chamber animation that applied on gun */
	public Vector3f checkChamberTranslate = new Vector3f(), checkChamberRotate = new Vector3f();
	public float checkChamberTiltTimeRatio = 1F / 3F, checkChamberTiltBCTimeRatio = 0.5F, checkChamberChargeTimeRatio = 2F / 3F, checkChamberChargeRatio = 0.5F;

	//Muzzle flash models
	public Vector3f muzzleFlashPoint = new Vector3f(0,0,0);
	/** whether muzzle flash will free rotate when render it */
	public boolean flashFreeRotate = true;
	
	//attach points for bullet model in mag
	public Vector3f[] bulletAttachPoint1 = new Vector3f[0];
	public Vector3f[] bulletAttachRotate1 = new Vector3f[0];
	public Vector3f[] bulletAttachPoint2 = new Vector3f[0];
	public Vector3f[] bulletAttachRotate2 = new Vector3f[0];
	public Vector3f[] magFollowerAttachPos = new Vector3f[0];
	public Vector3f[] magFollowerAttachRot = new Vector3f[0];

	//Arms rendering
	public boolean leftHandAmmo = false, rightHandAmmo = false, leftHandCharge = false, rightHandCharge = false, leftHandReloadingCharge = false, 
				   rightHandReloadingCharge = false,  leftHandRelease = false, rightHandRelease = false, leftHandReloadingRelease = false, 
				   rightHandReloadingRelease = false, leftHandCheckChamber = false, rightHandCheckChamber = false;
	public Vector3f leftArmPos = new Vector3f(0,0,0), leftArmRot = new Vector3f(0,0,0), leftArmScale = new Vector3f(1F,1F,1F);
	public Vector3f rightArmPos = new Vector3f(0,0,0), rightArmRot = new Vector3f(0,0,0), rightArmScale = new Vector3f(1F,1F,1F);
	public HashMap<Integer, TwoVector3f> leftArmPose = new HashMap<Integer, TwoVector3f>(), rightArmPose = new HashMap<Integer, TwoVector3f>();
	
	public Vector3f leftArmAmmoPos = new Vector3f(0,0,0);
	public Vector3f leftArmAmmoRot = new Vector3f(0,0,0);
	public Vector3f rightArmAmmoPos = new Vector3f(0,0,0);
	public Vector3f rightArmAmmoRot = new Vector3f(0,0,0);
	
	public Vector3f leftArmChargePos = new Vector3f(0,0,0), leftArmReloadingChargePos = new Vector3f(0,0,0);
	public Vector3f leftArmChargeRot = new Vector3f(0,0,0), leftArmReloadingChargeRot = new Vector3f(0,0,0);
	public Vector3f rightArmChargePos = new Vector3f(0,0,0), rightArmReloadingChargePos = new Vector3f(0,0,0);
	public Vector3f rightArmChargeRot = new Vector3f(0,0,0), rightArmReloadingChargeRot = new Vector3f(0,0,0);
	
	public Vector3f leftArmReleasePos = new Vector3f(0,0,0), leftArmReloadingReleasePos = new Vector3f(0,0,0);
	public Vector3f leftArmReleaseRot = new Vector3f(0,0,0), leftArmReloadingReleaseRot = new Vector3f(0,0,0);
	public Vector3f rightArmReleasePos = new Vector3f(0,0,0), rightArmReloadingReleasePos = new Vector3f(0,0,0);
	public Vector3f rightArmReleaseRot = new Vector3f(0,0,0), rightArmReloadingReleaseRot = new Vector3f(0,0,0);
	public Vector3f leftHandCheckChamberPos = new Vector3f(0,0,0), leftHandCheckChamberRot = new Vector3f(0,0,0);
	public Vector3f rightHandCheckChamberPos = new Vector3f(0,0,0), rightHandCheckChamberRot = new Vector3f(0,0,0);
	
	/** Recoil and slide based parameters */
	public float gunSlideDistance = 0F, slideLockDistance = 0F, altgunSlideDistance = 0F;
	/** Casing and muzzle flash parameters */
    public Vector3f caseOrigin = new Vector3f(0F), 
    				caseEjectVelocity = new Vector3f(-4F / 160F, 4F / 160F, 40F / 160F), caseEjectRandV = new Vector3f(12F / 160F, 9F / 160F, 5F / 160F), 
    				caseEjectAngularV = new Vector3f(-0.3F, -0.7F, -0.3F), caseEjectRandAV = new Vector3f(0.6F, -0.8F, 0.6F), 
    				caseEjectVelocityWC = new Vector3f(-3F / 160F, 2F / 160F, 15F / 160F), caseEjectRandVWC = new Vector3f(6F / 160F, 4F / 160F, 4F / 160F), 
    				caseEjectAngularVWC = new Vector3f(caseEjectAngularV), caseEjectRandAVWC = new Vector3f(caseEjectRandAV);
    public float rotVelocity = 55F, rotVelocityWC = 30F, vFriction = 0.99F, rvFriction = 0.99F, gAcceleration = -1.96F / 160F;
	// Exist time in ticks for each case
	public int caseTime = 30;

    // Charge handle distance/delay/time
    public float chargeHandleDistance = 0F, prechargeDistance = 0F;
	/** pre-charge is the action you need to do before real charging, like rotating the blot handle */
	public Vector3f prechargeRotate = new Vector3f(0,0,0), prechargeRotatePoint = new Vector3f(0,0,0);
	/** time to do pre-charge = chargeTime * prechargeTime, time left will be used to do real charge */
	public float prechargeTime = 0F;
	
	public EnumMeleeAnimation meleeAnimation = EnumMeleeAnimation.DEFAULT;
	public float tiltGunTime = 0.15F, unloadClipTime = 0.35F, loadClipTime = 0.35F, untiltGunTime = 0.15F;

	public void renderGun(float f) { render(gunModel, f); }

	public void renderSlide(float f) { render(slideModel, f); }
	
	public void renderaltSlide(float f) { render(altslideModel, f); }

	public void renderPump(float f) { render(pumpModel, f); }
	
	public void renderCharge(float f) { render(chargeModel, f); }
	
	public void renderDefaultStockBase(float f) { render(defaultStockBaseModel, f); }
	
	public void renderDefaultStock2(float f) { render(defaultStockModel2, f); }
	
	public void renderLightStuff(float f) { render(lightStuffModel, f); }
	
	public void renderPump2(float f) { render(pumpModel2, f); }
	
	public void renderSwitch(int numToRender, float f)
	{
		if(numSwitchModel != 0)
			for(int head = numToRender * numSwitchModel, i = head + numSwitchModel; 
					--i >= head; switchModel[i].render(f));
	}
	
	public void renderBoltCatchButton(boolean boltCatch, float f)
	{
		int head, i = boltCatchButtonModel.length;
		if(boltCatch) head = i >>> 1;
		else
		{
			head = 0;
			i >>>= 1;
		}
		for(; --i >= head; boltCatchButtonModel[i].render(f));
	}
	
	/** Flips the model. Generally only for backwards compatibility */
	public void flipAll()
	{
		flip(gunModel);
		flip(defaultStockBaseModel);
		flip(defaultStockModel2);
		flip(lightStuffModel);
		flip(pumpModel2);
		flip(switchModel);
		flip(boltCatchButtonModel);
		flip(slideModel);
		flip(altslideModel);
		flip(pumpModel);
		flip(chargeModel);
	}
	
	public void flipAllBy(boolean x, boolean y, boolean z)
	{
		flipBy(gunModel, x, y, z);
		flipBy(defaultStockBaseModel, x, y, z);
		flipBy(defaultStockModel2, x, y, z);
		flipBy(lightStuffModel, x, y, z);
		flipBy(pumpModel2, x, y, z);
		flipBy(switchModel, x, y, z);
		flipBy(boltCatchButtonModel, x, y, z);
		flipBy(slideModel, x, y, z);
		flipBy(altslideModel, x, y, z);
		flipBy(pumpModel, x, y, z);
		flipBy(chargeModel, x, y, z);
	}

	/** Translates the model */
	public void translateAll(float x, float y, float z)
	{
		translate(gunModel, x, y, z);
		translate(defaultStockBaseModel, x, y, z);
		translate(defaultStockModel2, x, y, z);
		translate(lightStuffModel, x, y, z);
		translate(pumpModel2, x, y, z);
		translate(switchModel, x, y, z);
		translate(boltCatchButtonModel, x, y, z);
		translate(slideModel, x, y, z);
		translate(altslideModel, x, y, z);
		translate(pumpModel, x, y, z);
		translate(chargeModel, x, y, z);
	}
	
	protected static float getPartialTickTime() { return RenderGun.smoothing; }
}
