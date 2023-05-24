package com.flansmod.client.model;

import java.lang.reflect.Field;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModClient.ModifyMode;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.AttachmentType.AttachmentTag;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.GunType.GunOperation;
import com.flansmod.common.guns.GunType.GunTag;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ModifiableType;
import com.flansmod.common.guns.ModifiableType.AttachmentPos;
import com.flansmod.common.guns.ModifiableType.ItsType;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.vector.TwoVector3f;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.client.IItemRenderer;

public class RenderGun extends RenderFlan implements IItemRenderer
{
	private static final Vector3f viewPoint = new Vector3f(-81.5F / 160F, 0.4F, 0F);
	private static final float viewPointXForScope = -69.5F / 160F;
	
	public static int[] scopeGlassTexture;
	public static int onScopeLayerRendering = -1;
	//basic render values
	private static Object obj;
	public static ItemRenderType renderType;
	public static ItemStack gunStack, scopeToRenderGunStack;
	public static GunType gunType, gunTypeOfScopeToRender;
	public static ModelGun gunModel;
	//public static ModelAttachment attachmentModel;
	public static GunAnimations animations;
	public static float actualGunRecoilRotZ = 0F, actualGunRecoilRotY = 0F, actualGunRecoilRotX = 0F, actualGunRecoilTransX = 0F, 
						actualGunRecoilTransZ = 0F, actualGunRecoilTransY = 0F, actualTakeOutProgress = 0F, actualSprintProgress = 0F, 
						actualOperateProgress = 0F, actualChargeProgress = 0F, actualSlideProgress = 0F, actualSlideDistance = 0F, actualChargeDistance = 0F, 
						actualPreChargeDistance = 0F, actualBreathHoldProgress = 0F, 
						actualWalkShakeY, actualWalkShakeZ;
	public static boolean createSmokeForGun = false, setSmokePosInScope = false, createCaseForGun = false, setCasePosInScope = false;
	public static boolean slideLock, renderFlash = false;
	public static float adsSwitch = 0F;
	public static byte[] sightAt, currentAt, leftHandAt, rightHandAt;
	public static Vector3f actAimCenter = new Vector3f();
	private static AttachmentPos atPos = new AttachmentPos();
	public static SightCoor[] allSightsCoors;
	private static SightCoor tempSightCoors;
	private static Vector3f actualPreChargeRotate = new Vector3f(), subCoorSystemOri = new Vector3f();
	public static Vector3f barrelOriTransRight = new Vector3f(), barrelOriTransRightNO = new Vector3f(), barrelOriTransLeft = new Vector3f(), 
						   tempBarrelOriTrans = new Vector3f(), tempBarrelOriTransNO = new Vector3f();
	public static Vector3f[] subCoorSystem = new Vector3f[3], tempPointingVectors = new Vector3f[3];
	public static float rotateAngle, sin, cos, barrelRotYawLeft = 0F, barrelRotPitchLeft = 0F, barrelRotYawRight = 0F, barrelRotPitchRight = 0F, 
			barrelRotYawRightNO = 0F, barrelRotPitchRightNO = 0F; //NO = not operating
	public static NBTTagList prList, prTag;
	public static NBTTagCompound atTag;
	public static AttachmentType attachmentType;
	public static ModelDefault flashModel;
	public static String flashTexture;
	private static float flashScale, actualPlayerRotYaw, actualPlayerRotPitch, tempFloat, tempFloat1, tempFloat2;
	private static Vector3f muzzleSmokeAt = new Vector3f(), chamberSmokeAt = new Vector3f(), 
			caseAt = new Vector3f(), caseRotCenter = new Vector3f();
	public static Vector3f caseTrans = new Vector3f(), caseRot = new Vector3f(), 
			tempVector = new Vector3f(), tempVector1 = new Vector3f();
	
	/** for test 
	public static Vector3f[] testVector = new Vector3f[3], testRotsVector = new Vector3f[3], testTransVector = new Vector3f[3];
	/** for test */

	private static int[] gunStates;
	public static byte fireModeNum, zoomStep, reticleNum;
	public static boolean laserOn, lightOn;
	private static void updateAtStates(int[] atStates)
	{
		zoomStep = AttachmentType.getZoomStep(atStates);
		reticleNum = AttachmentType.getDotNum(atStates);
		laserOn = AttachmentType.getTOF(atStates, AttachmentTag.LASER_ON);
		lightOn = AttachmentType.getTOF(atStates, AttachmentTag.LIGHT_ON);
	}

	private static Field thisRenderEndNanoTime;
	static
	{
		/** for test 
		testVector[0] = new Vector3f(); testVector[1] = new Vector3f(); testVector[2] = new Vector3f();
		/** for test */
		subCoorSystem[0] = new Vector3f(); subCoorSystem[1] = new Vector3f(); subCoorSystem[2] = new Vector3f();
		tempPointingVectors[0] = new Vector3f(); tempPointingVectors[1] = new Vector3f(); tempPointingVectors[2] = new Vector3f();
		try { thisRenderEndNanoTime = EntityRenderer.class.getDeclaredField("field_78534_ac"); }
		catch(Exception e) { }
		if(thisRenderEndNanoTime == null)
		{
			try { thisRenderEndNanoTime = EntityRenderer.class.getDeclaredField("renderEndNanoTime"); }
			catch(Exception e) { }
		}
		if(thisRenderEndNanoTime != null) thisRenderEndNanoTime.setAccessible(true);
	}
	
	public RenderGun()
	{
		//initialize values
		allSightsCoors = new SightCoor[FlansMod.maxSights];
		for(int i = allSightsCoors.length; --i >= 0; ) allSightsCoors[i] = new SightCoor();
		scopeGlassTexture = new int[FlansMod.numScopeTextures];
		for(int i = 0; i < FlansMod.numScopeTextures; ++i)
		{
			GL11.glPushMatrix();
			{
				scopeGlassTexture[i] = GL11.glGenTextures(); //glDeleteTextures
				GL11.glBindTexture(3553/*GL_TEXTURE_2D*/, scopeGlassTexture[i]);
				GL11.glTexImage2D(3553/*GL_TEXTURE_2D*/, 0, 6407, FlansMod.scopeGlassResolution, FlansMod.scopeGlassResolution, 0, 6407, 5121, org.lwjgl.BufferUtils.createByteBuffer(12582912));
				GL11.glTexParameteri(3553/*GL_TEXTURE_2D*/, 10240, 9728);
				GL11.glTexParameteri(3553/*GL_TEXTURE_2D*/, 10241, 9728);
				GL11.glBindTexture(3553/*GL_TEXTURE_2D*/, 0);
			}
			GL11.glPopMatrix();
		}
	}
	
	@Override
	public boolean handleRenderType(ItemStack itemStack, ItemRenderType rType)
	{
		switch(rType)
		{
			case ENTITY: if(FlansMod.renderGunEntityIn2D) return false;
			case EQUIPPED:
			case EQUIPPED_FIRST_PERSON: //check if the condition is allowing us to render 3D model
				return itemStack != null && itemStack.getItem() instanceof ItemGun && ((ItemGun)itemStack.getItem()).type.model != null &&
						GunType.hasStates(itemStack); //this part is for server
			default: return false;
		}
	}
	
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) { return false; }
	
	@Override
	public void renderItem(ItemRenderType rType, ItemStack itemStack, Object... data)
	{
		if(itemStack.getItem() instanceof ItemGun)
		{
			if(/*onScopeLayerRendering >= 0 && */(renderType = rType) == ItemRenderType.EQUIPPED_FIRST_PERSON)
			{
				animations = FlansModClient.getGunAnimations((EntityLivingBase)(obj = data[1]));
				gunStack = scopeToRenderGunStack;
				gunType = gunTypeOfScopeToRender;
			}
			else
			{
				gunType = ((ItemGun)(gunStack = itemStack).getItem()).type;
				animations = rType == ItemRenderType.ENTITY ? GunAnimations.defaults // Get animation & Render main hand gun
						: FlansModClient.getGunAnimations((EntityLivingBase)(obj = data[1]));
			}
			doRenderGun();
		}
	}
	
	/** method called by mecha to render gun in it  */
	public static void renderGun(ItemStack stackToRender, GunType toRenderType, float scale, ModelGun gunModel, GunAnimations gunAnimation, 
			ItemRenderType rType, boolean isOffHand)
	{
		gunStack = stackToRender;
		gunType = toRenderType;
		f = scale;
		animations = gunAnimation;
		renderType = rType;
		renderGun();
		f = 1F / 16F;
	}
	
	public static void renderTickStart()
	{
		if(!GunType.hasStates(scopeToRenderGunStack))
		{
			scopeToRenderGunStack = null;
			return;
		}
		NBTTagList sightList = GunType.getSightList(scopeToRenderGunStack), sightTag;
		NBTTagCompound atTag;
		AttachmentType atType;
		int sightNum = onScopeLayerRendering = 0;
		float mouseSensitivityMult = 1F, aimTimeMult = 1F;
		for(int i = sightList.tagCount(), 
				aimCenterOnUse = GunType.getAimCenterOnUse(gunType.getStates(scopeToRenderGunStack)), j; --i >= 0; )
		{
			for(j = (sightTag = GunType.getTagListFromTagList(sightList, i)).tagCount(); --j >= 0; )
			{
				GunType.getPosOfAttachableAt(atPos.resetAtTag(scopeToRenderGunStack.stackTagCompound, gunTypeOfScopeToRender), 
						sightAt = GunType.getByteArrayFromTagList(sightTag, j), sightAt.length & -2); // get 3D-pos
				(tempSightCoors = allSightsCoors[sightNum++]).switchOwner(atTag = atPos.atTag, atType = (AttachmentType)atPos.atType, sightAt);
				tempSightCoors.sightCoor.set(atPos.x, atPos.y, atPos.z);
				tempSightCoors.dotRotateAngle = tempSightCoors.rotateAngle = atPos.updateTriValues().rotX;
				Vector3f vec;
				ModelAtSight sightModel = (ModelAtSight)atType.model;
				for(int k = 0; k < tempSightCoors.oriDotCoors.length; ++k) //record two dot ray points
				{
					vec = sightModel.reticleAt[k];
					tempSightCoors.oriDotCoors[k].set(atPos.x + vec.x, 
													  atPos.y + vec.y * atPos.cos - vec.z * atPos.sin, 
													  atPos.z + vec.y * atPos.sin + vec.z * atPos.cos);
				}
				for(int k = sightModel.reticleBorder.length; --k >= 0; ) //record all coors for temp dot plane
				{
					vec = sightModel.reticleBorder[k];
					tempSightCoors.dotBorder[k].set(atPos.x + vec.x, 
													atPos.y + vec.y * atPos.cos - vec.z * atPos.sin, 
													atPos.z + vec.y * atPos.sin + vec.z * atPos.cos);
				}
				tempVector.set(sightModel.pupilRefCenter);
				tempVector.scale(atType.modelScale);
				tempSightCoors.pupilRefCenterCoor.set(atPos.x + tempVector.x, 
													  atPos.y + tempVector.y * atPos.cos - tempVector.z * atPos.sin, 
													  atPos.z + tempVector.y * atPos.sin + tempVector.z * atPos.cos);
				tempSightCoors.scopeGlassTexIndex = -1; // if is scope, check if needed to render scope glass texture
				if(atType.scopeGlassModel != null)
				{
					vec = sightModel.scopeObjectiveLensCenter; //if is scope, record objective lens center coor
					tempSightCoors.objectiveLensCenterCoor.set(atPos.x + vec.x, 
															   atPos.y + vec.y * atPos.cos - vec.z * atPos.sin, 
															   atPos.z + vec.y * atPos.sin + vec.z * atPos.cos);
					if(i == aimCenterOnUse) // if is sight on use, mult mouseSM
					{
						mouseSensitivityMult *= atType.mouseSensitivityMult[tempSightCoors.zoomStep = AttachmentType.getZoomStep(AttachmentType.getStates(atTag))];
						aimTimeMult *= atType.onUseAimTimeMult;
					}
					if(tempSightCoors.alpha >= sightModel.minAlphaToRenderScopeTex)
					{
						tempSightCoors.scopeGlassTexIndex = onScopeLayerRendering; //record the texture num we about to use in follow rendering
						renderScopeFramebuffer(tempSightCoors.getFOVZoom());
						++onScopeLayerRendering;
					}
					else tempSightCoors.scopeGlassTexIndex = -2;
				}
				else if(i == aimCenterOnUse) // not a scope but on use
				{
					mouseSensitivityMult *= atType.mouseSensitivityMult[0];
					aimTimeMult *= atType.onUseAimTimeMult;
				}
			}
		}
		while(sightNum < allSightsCoors.length) allSightsCoors[sightNum++].ownerTag = null; //set null owner for rest of the SightCoors
		FlansModClient.updateMouseSenToChange(mouseSensitivityMult); //after the loop, update mouseSensitivityToChange in FlansModClient
		FlansModClient.updateAimTimeConst(scopeToRenderGunStack, aimTimeMult);
		onScopeLayerRendering = -1; //after rendering all scope frame buffer, set back onScopeLayerRendering
	}
	
	/** method to render scope glass texture, called when holding a gun */
	private static void renderScopeFramebuffer(float FOVZoom)
	{
		boolean oriAdvanceOpengl = mc.gameSettings.advancedOpengl, oriHideGUI = mc.gameSettings.hideGUI;
		int oriDisplayWidth = mc.displayWidth, oriDisplayHeight = mc.displayHeight,
			oriThirdPerson = mc.gameSettings.thirdPersonView, oriLimitFramerate = mc.gameSettings.limitFramerate;
		net.minecraft.util.MovingObjectPosition movingObjectPosition = mc.objectMouseOver;
		float oriFovSetting = mc.gameSettings.fovSetting;
		long tempNanoTime = 0L;
		if(oriLimitFramerate != 0 && thisRenderEndNanoTime != null) // for partialTime
		{
			try { tempNanoTime = thisRenderEndNanoTime.getLong(mc.entityRenderer); }
			catch(Exception e) { }
		}
		
		mc.gameSettings.advancedOpengl = false;
		mc.gameSettings.hideGUI = false;
		mc.gameSettings.thirdPersonView = 0;
		mc.gameSettings.fovSetting = FlansModClient.originalFOV / FOVZoom;
		mc.displayHeight = FlansMod.scopeGlassResolution;
		mc.displayWidth = FlansMod.scopeGlassResolution;
		GL11.glPushMatrix();
		GL11.glPushAttrib(272393/*GL_ALL_ATTRIB_BITS*/);
		{
			//minecraft.entityRenderer.updateCameraAndRender(smoothing);
			if(mc.isFramerateLimitBelowMax())
				mc.entityRenderer.renderWorld(smoothing, tempNanoTime + (1000000000L / Math.max(30, oriLimitFramerate)));
			else mc.entityRenderer.renderWorld(smoothing, 0L);
			
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glBindTexture(GL11.GL_TEXTURE_2D, scopeGlassTexture[onScopeLayerRendering]);
			GL11.glCopyTexImage2D(GL11.GL_TEXTURE_2D, 0, 6407, 0, 0, FlansMod.scopeGlassResolution, FlansMod.scopeGlassResolution, 0);
		}
		GL11.glPopAttrib();
		GL11.glPopMatrix();
		if(oriLimitFramerate != 0 && thisRenderEndNanoTime != null)
		{
			try { thisRenderEndNanoTime.setLong(mc.entityRenderer, tempNanoTime); }
			catch(Exception e) { }
		}
		mc.objectMouseOver = movingObjectPosition;
		mc.gameSettings.limitFramerate = oriLimitFramerate;
		mc.gameSettings.thirdPersonView = oriThirdPerson;
		mc.gameSettings.hideGUI = oriHideGUI;
		mc.displayWidth = oriDisplayWidth;
		mc.displayHeight = oriDisplayHeight;
		mc.gameSettings.fovSetting = oriFovSetting;
		mc.gameSettings.advancedOpengl = oriAdvanceOpengl;
	}
	
	/** for test 
	private static void resetTestVectors()
	{
		testVector[0].set(10F / 16F, 0F, 0F);
		testVector[1].set(0F, -5F / 16F, 0F);
		testVector[2].set(0F, 0F, -7F / 16F);
	}
	/** for test */
	
	private static void standardizeCoorSystemFor(Vector3f[] target)
	{
		target[0].set(1F, 0F, 0F);
		target[1].set(0F, 1F, 0F);
		target[2].set(0F, 0F, 1F);
	}
	
	private static void setTempVectorsAsNewSubCoorSys()
	{
		transVecFromSubToMainCoorSys(tempPointingVectors[0], tempPointingVectors[0]);
		transVecFromSubToMainCoorSys(tempPointingVectors[1], tempPointingVectors[1]);
		transVecFromSubToMainCoorSys(tempPointingVectors[2], tempPointingVectors[2]);
		subCoorSystem[0].set(tempPointingVectors[0].x, tempPointingVectors[0].y, tempPointingVectors[0].z);
		subCoorSystem[1].set(tempPointingVectors[1].x, tempPointingVectors[1].y, tempPointingVectors[1].z);
		subCoorSystem[2].set(tempPointingVectors[2].x, tempPointingVectors[2].y, tempPointingVectors[2].z);
		standardizeCoorSystemFor(tempPointingVectors);
	}
	
	private static void transVecFromSubToMainCoorSys(Vector3f target, Vector3f dest)
	{
		//coors used in computing is coor in sub coordinate system after rot
		tempFloat = target.x * subCoorSystem[0].x + target.y * subCoorSystem[1].x + target.z * subCoorSystem[2].x;
		tempFloat1 = target.x * subCoorSystem[0].y + target.y * subCoorSystem[1].y + target.z * subCoorSystem[2].y;
		tempFloat2 = target.x * subCoorSystem[0].z + target.y * subCoorSystem[1].z + target.z * subCoorSystem[2].z;
		dest.x = tempFloat; //record result after computation for dest can also be the target
		dest.y = tempFloat1;
		dest.z = tempFloat2;
	}
	
	private static void getCoorFromSubCoor(Vector3f target, Vector3f dest)
	{
		transVecFromSubToMainCoorSys(target, dest);
		dest.set(dest.x + subCoorSystemOri.x, dest.y + subCoorSystemOri.y, dest.z + subCoorSystemOri.z);
	}
	
	private static void applyzyxRotForTempVectors(float rotx, float roty, float rotz)
	{
		if(rotz != 0F) applyRotForTempVectors(rotz, (byte)2);
		if(roty != 0F) applyRotForTempVectors(roty, (byte)1);
		if(rotx != 0F) applyRotForTempVectors(rotx, (byte)0);
	}
	
	private static void applyRotForTempVectors(float rotAmoung, byte along)
	{
		applyRotFor(tempPointingVectors[0], rotAmoung, along);
		applyRotFor(tempPointingVectors[1], rotAmoung, along);
		applyRotFor(tempPointingVectors[2], rotAmoung, along);
	}
	
	private static void applyRotForSubCoorSys(float rotAmoung, byte along)
	{
		applyRotFor(subCoorSystem[0], rotAmoung, along);
		applyRotFor(subCoorSystem[1], rotAmoung, along);
		applyRotFor(subCoorSystem[2], rotAmoung, along);
	}
	
	private static void applyxyzTransFor(Vector3f target, float transx, float transy, float transz)
	{
		if(transx != 0F) applyTransFor(target, transx, (byte)0);
		if(transy != 0F) applyTransFor(target, transy, (byte)1);
		if(transz != 0F) applyTransFor(target, transz, (byte)2);
	}
	
	/** method to rotate a point around (0,0,0) with angle of rotAmoung by axis along(along = 0 by x, along = 1 by y, along = 2 by z) */
	private static void applyRotFor(Vector3f target, float rotAmoung, byte along)
	{
		cos = (float)Math.cos(sin = (float)Math.toRadians(rotAmoung));
		sin = (float)Math.sin(sin);
		if(along == 0) // take rotating by x axis as example, doing this will not effect x amount of target vector
		{
			/*newy*/tempFloat = target.y * cos - target.z * sin;
			/*newz*/tempFloat1 = target.y * sin + target.z * cos;
			target.y = tempFloat;
			target.z = tempFloat1;
			return;
		}
		if(along == 1) // y
		{
			/*newx*/tempFloat = target.z * sin + target.x * cos;
			/*newz*/tempFloat1 = target.z * cos - target.x * sin;
			target.x = tempFloat;
			target.z = tempFloat1;
			return;
		} // z
		/*newx*/tempFloat = target.x * cos - target.y * sin;
		/*newy*/tempFloat1 = target.x * sin + target.y * cos;
		target.x = tempFloat;
		target.y = tempFloat1;
	}
	
	/** method to translate a point with amount of transAmount by some axis (along = 0 by x, along = 1 by y, along = 2 by z) */
	private static void applyTransFor(Vector3f target, float transAmount, byte along)
	{
		target.x += transAmount * subCoorSystem[along].x;
		target.y += transAmount * subCoorSystem[along].y;
		target.z += transAmount * subCoorSystem[along].z;
	}
	
	private static float getGunRotX()
	{ return FlansModClient.lastGunRotX + (FlansModClient.gunRotX - FlansModClient.lastGunRotX) * smoothing + actualWalkShakeZ * getWalkShakeRotMultX(); }
	
	private static float getWalkShakeRotMultX()
	{ return gunModel.walkShakeRotMultX[0] * adsSwitch + gunModel.walkShakeRotMultX[2] * actualSprintProgress + gunModel.walkShakeRotMultX[1] * (2F - adsSwitch - actualSprintProgress) * 0.5F; }
	
	private static float getGunRotYaw()
	{
		return FlansModClient.lastGunRotYaw + (FlansModClient.gunRotYaw - FlansModClient.lastGunRotYaw) * smoothing + 
			   (FlansModClient.lastBreathSinZ + (FlansModClient.breathSinZ - FlansModClient.lastBreathSinZ) * smoothing) * gunModel.breathShakeRotMultY * actualBreathHoldProgress + 
			   actualWalkShakeZ * getWalkShakeRotMultY();
	}
	
	private static float getWalkShakeRotMultY()
	{ return gunModel.walkShakeRotMultY[0] * adsSwitch + gunModel.walkShakeRotMultY[2] * actualSprintProgress + gunModel.walkShakeRotMultY[1] * (2F - adsSwitch - actualSprintProgress) * 0.5F; }
	
	private static float getGunRotPitch()
	{
		return FlansModClient.lastGunRotPitch + (FlansModClient.gunRotPitch - FlansModClient.lastGunRotPitch) * smoothing + 
			   (FlansModClient.lastBreathSinY + (FlansModClient.breathSinY - FlansModClient.lastBreathSinY) * smoothing) * gunModel.breathShakeRotMultZ * actualBreathHoldProgress + 
			   actualWalkShakeY * getWalkShakeRotMultZ();
	}
	
	private static float getWalkShakeRotMultZ()
	{ return gunModel.walkShakeRotMultZ[0] * adsSwitch + gunModel.walkShakeRotMultZ[2] * actualSprintProgress + gunModel.walkShakeRotMultZ[1] * (2F - adsSwitch - actualSprintProgress) * 0.5F; }
	
	private static float getGunTransY()
	{
		actualWalkShakeY = FlansModClient.lastGunWalkShakeY + (FlansModClient.gunWalkShakeY - FlansModClient.lastGunWalkShakeY) * smoothing;
		return FlansModClient.lastGunTransY + (FlansModClient.gunTransY - FlansModClient.lastGunTransY) * smoothing + 
			   (FlansModClient.lastBreathSinY + (FlansModClient.breathSinY - FlansModClient.lastBreathSinY) * smoothing) * gunModel.breathShakeAmplitudeY * actualBreathHoldProgress + 
			   actualWalkShakeY * getWalkShakeAmplitudeY();
	}
	
	private static float getWalkShakeAmplitudeY()
	{ return gunModel.walkShakeAmplitudeY[0] * adsSwitch + gunModel.walkShakeAmplitudeY[2] * actualSprintProgress + gunModel.walkShakeAmplitudeY[1] * (2F - adsSwitch - actualSprintProgress) * 0.5F; }
	
	private static float getGunTransZ()
	{
		actualWalkShakeZ = FlansModClient.lastGunWalkShakeZ + (FlansModClient.gunWalkShakeZ - FlansModClient.lastGunWalkShakeZ) * smoothing;
		return (FlansModClient.lastBreathSinZ + (FlansModClient.breathSinZ - FlansModClient.lastBreathSinZ) * smoothing) * gunModel.breathShakeAmplitudeZ * actualBreathHoldProgress + 
			   actualWalkShakeZ * getWalkShakeAmplitudeZ();
	}
	
	private static float getWalkShakeAmplitudeZ()
	{ return gunModel.walkShakeAmplitudeZ[0] * adsSwitch + gunModel.walkShakeAmplitudeZ[2] * actualSprintProgress + gunModel.walkShakeAmplitudeZ[1] * (2F - adsSwitch - actualSprintProgress) * 0.5F; }
	
	private static void getReverseXNormalVec(Vector3f dest)
	{
		tempFloat = subCoorSystem[0].x * subCoorSystem[2].y * subCoorSystem[1].z - subCoorSystem[0].x * subCoorSystem[1].y * subCoorSystem[2].z 
				  + subCoorSystem[1].x * subCoorSystem[0].y * subCoorSystem[2].z - subCoorSystem[1].x * subCoorSystem[2].y * subCoorSystem[0].z 
				  + subCoorSystem[2].x * subCoorSystem[1].y * subCoorSystem[0].z - subCoorSystem[2].x * subCoorSystem[0].y * subCoorSystem[1].z;
		dest.set((subCoorSystem[2].y * subCoorSystem[1].z - subCoorSystem[1].y * subCoorSystem[2].z) / tempFloat, 
				 (subCoorSystem[0].y * subCoorSystem[2].z - subCoorSystem[2].y * subCoorSystem[0].z) / tempFloat, 
				 (subCoorSystem[1].y * subCoorSystem[0].z - subCoorSystem[0].y * subCoorSystem[1].z) / tempFloat);
	}
	
	private static void getReverseYNormalVec(Vector3f dest)
	{
		tempFloat = subCoorSystem[0].y * subCoorSystem[2].x * subCoorSystem[1].z - subCoorSystem[0].y * subCoorSystem[1].x * subCoorSystem[2].z 
				  + subCoorSystem[1].y * subCoorSystem[0].x * subCoorSystem[2].z - subCoorSystem[1].y * subCoorSystem[2].x * subCoorSystem[0].z 
				  + subCoorSystem[2].y * subCoorSystem[1].x * subCoorSystem[0].z - subCoorSystem[2].y * subCoorSystem[0].x * subCoorSystem[1].z;
		dest.set((subCoorSystem[2].x * subCoorSystem[1].z - subCoorSystem[1].x * subCoorSystem[2].z) / tempFloat, 
				 (subCoorSystem[0].x * subCoorSystem[2].z - subCoorSystem[2].x * subCoorSystem[0].z) / tempFloat, 
				 (subCoorSystem[1].x * subCoorSystem[0].z - subCoorSystem[0].x * subCoorSystem[1].z) / tempFloat);
	}
	
	private static void getReverseZNormalVec(Vector3f dest)
	{
		tempFloat = subCoorSystem[0].z * subCoorSystem[2].y * subCoorSystem[1].x - subCoorSystem[0].z * subCoorSystem[1].y * subCoorSystem[2].x 
				  + subCoorSystem[1].z * subCoorSystem[0].y * subCoorSystem[2].x - subCoorSystem[1].z * subCoorSystem[2].y * subCoorSystem[0].x 
				  + subCoorSystem[2].z * subCoorSystem[1].y * subCoorSystem[0].x - subCoorSystem[2].z * subCoorSystem[0].y * subCoorSystem[1].x;
		dest.set((subCoorSystem[2].y * subCoorSystem[1].x - subCoorSystem[1].y * subCoorSystem[2].x) / tempFloat, 
				 (subCoorSystem[0].y * subCoorSystem[2].x - subCoorSystem[2].y * subCoorSystem[0].x) / tempFloat, 
				 (subCoorSystem[1].y * subCoorSystem[0].x - subCoorSystem[0].y * subCoorSystem[1].x) / tempFloat);
	}
	
	private static float getGunRecoilTransX() { return actualGunRecoilTransX + animations.gunRecoilTransShakeX * (FlansMod.rand.nextFloat() - 0.5F); }
	
	private static float getGunRecoilTransY() { return actualGunRecoilTransY + animations.gunRecoilTransShakeY * (FlansMod.rand.nextFloat() - 0.5F); }
	
	private static float getGunRecoilTransZ() { return actualGunRecoilTransZ + animations.gunRecoilTransShakeZ * (FlansMod.rand.nextFloat() - 0.5F); }
	
	private static float getGunRecoilRotX() { return actualGunRecoilRotX + animations.gunRecoilRotShakeX * (FlansMod.rand.nextFloat() - 0.5F); }
	
	private static float getGunRecoilRotY() { return actualGunRecoilRotY + animations.gunRecoilRotShakeY * (FlansMod.rand.nextFloat() - 0.5F); }
	
	private static float getGunRecoilRotZ() { return actualGunRecoilRotZ + animations.gunRecoilRotShakeZ * (FlansMod.rand.nextFloat() - 0.5F); }
	
	private static void doRenderGun()
	{
		if(gunStack == null) return;
		gunModel = gunType.model;
		gunStates = GunType.getStates(gunStack);
		GL11.glPushMatrix(); //push in Matrix
		{
			switch(renderType) // Setup transforms based on gun position
			{
				case ENTITY:
				{
					//EntityItem entity = (EntityItem)obj;
					//GL11.glRotatef(entity.age + (entity.age == 0 ? 0 : smoothing), 0F, 1F, 0F);
					GL11.glTranslatef(-0.2F + gunModel.itemFrameOffset.x, 0.2F + gunModel.itemFrameOffset.y, 0.1F + gunModel.itemFrameOffset.z);
					renderGun();
					/** for test  renderGunFP(); /** for test */
					break;
				}
				case EQUIPPED:
				{
					GL11.glRotatef(35F, 0F, 0F, 1F);
					GL11.glRotatef(-5F, 0F, 1F, 0F);
					GL11.glTranslatef(0.75F, -0.22F, -0.08F);
					GL11.glScalef(1F, 1F, -1F);
					GL11.glTranslatef(gunModel.thirdPersonOffset.x, gunModel.thirdPersonOffset.y, gunModel.thirdPersonOffset.z);
					renderGun();
					/** for test  renderGunFP(); /** for test */
					break;
				}
				case EQUIPPED_FIRST_PERSON:
				{
					GL11.glMatrixMode(GL11.GL_PROJECTION);
					GL11.glLoadIdentity();
					Project.gluPerspective(getFOVModifier(), (float)mc.displayWidth / (float)mc.displayHeight, 0.05F, mc.gameSettings.renderDistanceChunks * 32F);
					GL11.glMatrixMode(GL11.GL_MODELVIEW);
					//update values //TODO: some of these can be update in else{}
					actualTakeOutProgress = FlansModClient.lastTakeOutProgress + (FlansModClient.takeOutProgress - FlansModClient.lastTakeOutProgress) * smoothing;
					actualGunRecoilRotZ = animations.lastGunRecoilRotZ + (animations.gunRecoilRotZ - animations.lastGunRecoilRotZ) * smoothing;
					actualGunRecoilRotY = animations.lastGunRecoilRotY + (animations.gunRecoilRotY - animations.lastGunRecoilRotY) * smoothing;
					actualGunRecoilRotX = animations.lastGunRecoilRotX + (animations.gunRecoilRotX - animations.lastGunRecoilRotX) * smoothing;
					actualGunRecoilTransX = animations.lastGunRecoilTransX + (animations.gunRecoilTransX - animations.lastGunRecoilTransX) * smoothing;
					actualGunRecoilTransZ = animations.lastGunRecoilTransZ + (animations.gunRecoilTransZ - animations.lastGunRecoilTransZ) * smoothing;
					actualGunRecoilTransY = animations.lastGunRecoilTransY + (animations.gunRecoilTransY - animations.lastGunRecoilTransY) * smoothing;
					actualSprintProgress = FlansModClient.lastSprintProgress + (FlansModClient.sprintProgress - FlansModClient.lastSprintProgress) * smoothing;
					actualOperateProgress = FlansModClient.lastOperatingProgress + (FlansModClient.operatingProgress - FlansModClient.lastOperatingProgress) * smoothing;
					actualBreathHoldProgress = FlansModClient.lastBreathHoldProgress + (FlansModClient.breathHoldProgress - FlansModClient.lastBreathHoldProgress) * smoothing;
					FlansModClient.cameraFOVConstant = GunType.getState(gunStates, GunTag.RECOIL_ON_CAMERA) * actualGunRecoilTransX;
					actualGunRecoilTransX = -actualGunRecoilTransX;
					if(onScopeLayerRendering < 0) // not scope frame buffer
					{
						setCasePosInScope = setSmokePosInScope = false; //one loop is done, set setSmokePosInScope to be false
						adsSwitch = FlansModClient.lastZoomProgress + (FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) * smoothing;
						if(FlansModClient.operatingState == GunOperation.CHECK_AMMO) //if checking ammo, de_aim
						{
							if(actualOperateProgress <= gunModel.checkAmmoTiltTimeRatio) adsSwitch *= 1F - actualOperateProgress / gunModel.checkAmmoTiltTimeRatio;
							else adsSwitch = 0F;
						}
						//check chamber
						else if(FlansModClient.operatingState == GunOperation.CHECK_CHAMBER)
						{
							if(actualOperateProgress <= gunModel.checkChamberTiltTimeRatio) adsSwitch *= 1F - actualOperateProgress / gunModel.checkChamberTiltTimeRatio;
							else adsSwitch = 0F;
						}
						else if(FlansModClient.operatingState == GunOperation.CHECK_CHAMBER_BC)
						{
							if(actualOperateProgress <= gunModel.checkChamberTiltBCTimeRatio) adsSwitch *= 1F - actualOperateProgress / gunModel.checkChamberTiltBCTimeRatio;
							else adsSwitch = 0F;
						}
						GL11.glRotatef(20F, 0F, 0F, 1F);
						GL11.glRotatef(-5F, 0F, 1F, 0F);
						GL11.glTranslatef(0.15F, 0.375F, -1.005F);
						GL11.glRotatef(0.5F, 1F, 0F, 0F);
						GL11.glRotatef(5F, 0F, 0F, 1F);
						GL11.glTranslatef(0F, 0.7F / 160F - 0.03F, -0.35F / 160F);
						
						//addTestTranslate(0.1F);
						//addTestRotate();
						/*if(animations.meleeAnimationProgress > 0 && animations.meleeAnimationProgress < gunType.meleePath.size())
						{
							Vector3f meleePos = gunType.meleePath.get(animations.meleeAnimationProgress);
							Vector3f nextMeleePos = animations.meleeAnimationProgress + 1 < gunType.meleePath.size() ? gunType.meleePath.get(animations.meleeAnimationProgress + 1) : new Vector3f();
							GL11.glTranslatef(meleePos.x + (nextMeleePos.x - meleePos.x) * smoothing, meleePos.y + (nextMeleePos.y - meleePos.y) * smoothing, meleePos.z + (nextMeleePos.z - meleePos.z) * smoothing);
							Vector3f meleeAngles = gunType.meleePathAngles.get(animations.meleeAnimationProgress);
							Vector3f nextMeleeAngles = animations.meleeAnimationProgress + 1 < gunType.meleePathAngles.size() ? gunType.meleePathAngles.get(animations.meleeAnimationProgress + 1) : new Vector3f();
							GL11.glRotatef(meleeAngles.y + (nextMeleeAngles.y - meleeAngles.y) * smoothing, 0F, 1F, 0F);
							GL11.glRotatef(meleeAngles.z + (nextMeleeAngles.z - meleeAngles.z) * smoothing, 0F, 0F, 1F);
							GL11.glRotatef(meleeAngles.x + (nextMeleeAngles.x - meleeAngles.x) * smoothing, 1F, 0F, 0F);
						}*/
						if(FlansModClient.operatingState == GunOperation.MODIFY) // if modifying the gun
						{
							GL11.glTranslatef(gunModel.gunModifyTranslate.x * actualOperateProgress + gunModel.holdingTranslate.x * (tempFloat = 1F - actualOperateProgress), 
											  gunModel.gunModifyTranslate.y * actualOperateProgress + (gunModel.holdingTranslate.y + getGunTransY()) * tempFloat, 
											  gunModel.gunModifyTranslate.z * actualOperateProgress + (gunModel.holdingTranslate.z + getGunTransZ()) * tempFloat);
							float viewRotYaw = (FlansModClient.playerPrevRotationYaw + (mc.thePlayer.rotationYaw - FlansModClient.playerPrevRotationYaw) * smoothing) % 360F;
							if(viewRotYaw > 180F) viewRotYaw -= 360F;
							else if(viewRotYaw < -180F) viewRotYaw += 360F;
							GL11.glRotatef((gunModel.holdingRotate.x + getGunRotX()) * tempFloat, 1F, 0F, 0F);
							GL11.glRotatef((gunModel.holdingRotate.y + getGunRotYaw()) * tempFloat, 0F, 1F, 0F);
							GL11.glRotatef((FlansModClient.playerPrevRotationPitch + (mc.thePlayer.rotationPitch - FlansModClient.playerPrevRotationPitch) * smoothing) * actualOperateProgress
											+ (gunModel.holdingRotate.z + getGunRotPitch()) * tempFloat, 0F, 0F, 1F);
							//here is a special case, we need to rotate y axis before rotate z axis, so the last line must be rotating y axis
							GL11.glRotatef(viewRotYaw * actualOperateProgress, 0F, 1F, 0F);
							if(GunType.getTOF(gunStates, GunTag.STOCK_FOLD_ON))
							{ if(gunType.foldStockDistance != 0F) GL11.glTranslatef(-gunType.foldStockDistance * gunType.modelScale * tempFloat, 0F, 0F); }
							else if((tempFloat1 = -GunType.getStockDistance(gunStack)) != 0F) GL11.glTranslatef(tempFloat1 * gunType.modelScale * tempFloat, 0F, 0F);
							renderGunModifying(); // Render!
						}
						else // not modifying the gun
						{
							updateActualPlayerRot(); // we will need this after
							
							standardizeCoorSystemFor(tempPointingVectors);
							standardizeCoorSystemFor(subCoorSystem);
							subCoorSystemOri.set(0F, 0F, 0F);
							GL11.glPushMatrix(); // start here
							/** for test 
							addTestTranslate(0.1F);
							applyxyzTransFor(subCoorSystemOri, FlansModClient.testFloat[3] / 160F, FlansModClient.testFloat[4] / 160F, FlansModClient.testFloat[5] / 160F);
							addTestRotate();
							applyzyxRotForTempVectors(FlansModClient.testFloat[0], FlansModClient.testFloat[1], FlansModClient.testFloat[2]);
							setTempVectorsAsNewSubCoorSys();
							/** for test */
							
							tempVector.set(getGunRecoilTransX() + gunModel.holdingTranslate.x * (tempFloat = 1F - adsSwitch) + gunModel.aimingTranslate.x * adsSwitch + gunModel.sprintTranslate.x * actualSprintProgress,
										   getGunRecoilTransY() + gunModel.holdingTranslate.y * tempFloat + gunModel.aimingTranslate.y * adsSwitch + gunModel.sprintTranslate.y * actualSprintProgress + getGunTransY(),
										   getGunRecoilTransZ() + gunModel.holdingTranslate.z * tempFloat + gunModel.aimingTranslate.z * adsSwitch + gunModel.sprintTranslate.z * actualSprintProgress + getGunTransZ());
							/** for test 
							tempVector.translate(FlansModClient.testFloat[3] / 160F, FlansModClient.testFloat[4] / 160F, FlansModClient.testFloat[5] / 160F);
							/** for test */
							if(FlansModClient.operatingState == GunOperation.CHECK_AMMO) // check ammo
							{
								if(actualOperateProgress > gunModel.checkAmmoTiltTimeRatio)
									tempVector.translate(gunModel.checkAmmoTranslate.x, gunModel.checkAmmoTranslate.y, gunModel.checkAmmoTranslate.z);
								else tempVector.translate(gunModel.checkAmmoTranslate.x * (tempFloat = actualOperateProgress / gunModel.checkAmmoTiltTimeRatio), 
										gunModel.checkAmmoTranslate.y * tempFloat,  gunModel.checkAmmoTranslate.z * tempFloat);
							}
							
							else if(FlansModClient.operatingState == GunOperation.CHECK_CHAMBER)
							{
								if(actualOperateProgress > gunModel.checkChamberTiltTimeRatio)
									tempVector.translate(gunModel.checkChamberTranslate.x, gunModel.checkChamberTranslate.y, gunModel.checkChamberTranslate.z);
								else tempVector.translate(gunModel.checkChamberTranslate.x * (tempFloat = actualOperateProgress / gunModel.checkChamberTiltTimeRatio), 
										gunModel.checkChamberTranslate.y * tempFloat, gunModel.checkChamberTranslate.z * tempFloat);
							}
							else if(FlansModClient.operatingState == GunOperation.CHECK_CHAMBER_BC)
							{
								if(actualOperateProgress > gunModel.checkChamberTiltBCTimeRatio)
									tempVector.translate(gunModel.checkChamberTranslate.x, gunModel.checkChamberTranslate.y, gunModel.checkChamberTranslate.z);
								else tempVector.translate(gunModel.checkChamberTranslate.x * (tempFloat = actualOperateProgress / gunModel.checkChamberTiltBCTimeRatio), 
										gunModel.checkChamberTranslate.y * tempFloat, gunModel.checkChamberTranslate.z * tempFloat);
							}
							else if(FlansModClient.operatingState == GunOperation.REST || FlansModClient.operatingState == GunOperation.UNREST)
							{
								tempVector.translate(gunModel.restTranslate.x * actualOperateProgress * (tempFloat = 1F - actualSprintProgress), 
										gunModel.restTranslate.y * actualOperateProgress * tempFloat, gunModel.restTranslate.z * actualOperateProgress * tempFloat);
							}
							// if is taking out this gun
							if(actualTakeOutProgress != 0F) tempVector.translate(gunModel.takeOutTranslate.x * actualTakeOutProgress, 
									gunModel.takeOutTranslate.y * actualTakeOutProgress, gunModel.takeOutTranslate.z * actualTakeOutProgress);
							if(FlansModClient.operatingState == GunOperation.TILT_GUN || FlansModClient.operatingState == GunOperation.UNTILT_GUN)
								tempVector.translate(gunModel.reloadTranslate.x * actualOperateProgress, gunModel.reloadTranslate.y * actualOperateProgress, gunModel.reloadTranslate.z * actualOperateProgress);
							else if(FlansModClient.tiltGun && FlansModClient.operatingState > GunOperation.NONE)
								tempVector.translate(gunModel.reloadTranslate.x, gunModel.reloadTranslate.y, gunModel.reloadTranslate.z);
							GL11.glTranslatef(tempVector.x, tempVector.y, tempVector.z);
							applyxyzTransFor(subCoorSystemOri, tempVector.x, tempVector.y, tempVector.z);
							
							tempVector.set(gunModel.holdingRotate.x * (tempFloat = 1F - adsSwitch) + gunModel.aimingRotate.x * adsSwitch + gunModel.sprintRotate.x * actualSprintProgress, 
										   gunModel.holdingRotate.y * tempFloat + gunModel.aimingRotate.y * adsSwitch + gunModel.sprintRotate.y * actualSprintProgress, 
										   gunModel.holdingRotate.z * tempFloat + gunModel.aimingRotate.z * adsSwitch + gunModel.sprintRotate.z * actualSprintProgress);
							/** for test 
							tempVector.translate(FlansModClient.testFloat[0], FlansModClient.testFloat[1], FlansModClient.testFloat[2]);
							/** for test */
							if(FlansModClient.operatingState == GunOperation.CHECK_AMMO)
							{
								if(actualOperateProgress > gunModel.checkAmmoTiltTimeRatio)
									tempVector.translate(gunModel.checkAmmoRotate.x, gunModel.checkAmmoRotate.y, gunModel.checkAmmoRotate.z);
								else tempVector.translate(gunModel.checkAmmoRotate.x * (tempFloat = actualOperateProgress / gunModel.checkAmmoTiltTimeRatio), 
										gunModel.checkAmmoRotate.y * tempFloat, gunModel.checkAmmoRotate.z * tempFloat);
							}
							//check chamber
							else if(FlansModClient.operatingState == GunOperation.CHECK_CHAMBER)
							{
								if(actualOperateProgress > gunModel.checkChamberTiltTimeRatio)
									tempVector.translate(gunModel.checkChamberRotate.x, gunModel.checkChamberRotate.y, gunModel.checkChamberRotate.z);
								else tempVector.translate(gunModel.checkChamberRotate.x * (tempFloat = actualOperateProgress / gunModel.checkChamberTiltTimeRatio), 
										gunModel.checkChamberRotate.y * tempFloat, gunModel.checkChamberRotate.z * tempFloat);
							}
							else if(FlansModClient.operatingState == GunOperation.CHECK_CHAMBER_BC)
							{
								if(actualOperateProgress > gunModel.checkChamberTiltBCTimeRatio)
									tempVector.translate(gunModel.checkChamberRotate.x, gunModel.checkChamberRotate.y, gunModel.checkChamberRotate.z);
								else tempVector.translate(gunModel.checkChamberRotate.x * (tempFloat = actualOperateProgress / gunModel.checkChamberTiltBCTimeRatio), 
										gunModel.checkChamberRotate.y * tempFloat, gunModel.checkChamberRotate.z * tempFloat);
							}
							else if(FlansModClient.operatingState == GunOperation.REST || FlansModClient.operatingState == GunOperation.UNREST)
							{
								tempVector.translate(gunModel.restRotate.x * actualOperateProgress * (tempFloat = 1F - actualSprintProgress), 
										gunModel.restRotate.y * actualOperateProgress * tempFloat, gunModel.restRotate.z * actualOperateProgress * tempFloat);
							}
							
							if(actualTakeOutProgress != 0F) tempVector.translate(gunModel.takeOutRotate.x * actualTakeOutProgress, // taking out the gun
									gunModel.takeOutRotate.y * actualTakeOutProgress, gunModel.takeOutRotate.z * actualTakeOutProgress);
							GL11.glRotatef(tempVector.x, 1F, 0F, 0F);
							applyRotForAllDotsRot(tempVector.x);
							GL11.glRotatef(tempVector.y, 0F, 1F, 0F);
							GL11.glRotatef(tempVector.z, 0F, 0F, 1F);
							applyzyxRotForTempVectors(tempVector.x, tempVector.y, tempVector.z);
							setTempVectorsAsNewSubCoorSys();
							
							if(GunType.getTOF(gunStates, GunTag.STOCK_FOLD_ON)) // apply adjustable stock translate
							{ // TODO: we can record the distance of the stock trans in the first loop rendering and apply it in the next loop(one frame delay)
								if(gunType.foldStockDistance != 0F)
								{
									GL11.glTranslatef(tempFloat = -gunType.foldStockDistance * gunType.modelScale, 0F, 0F);
									applyxyzTransFor(subCoorSystemOri, tempFloat, 0F, 0F);
								}
							}
							else if((tempFloat = -GunType.getStockDistance(gunStack) * gunType.modelScale) != 0F)
							{
								GL11.glTranslatef(tempFloat, 0F, 0F);
								applyxyzTransFor(subCoorSystemOri, tempFloat, 0F, 0F);
							}
							tempVector.set(getGunRecoilRotX(), getGunRecoilRotY(), getGunRecoilRotZ()); // apply gun recoil
							
							if(FlansModClient.operatingState == GunOperation.TILT_GUN || FlansModClient.operatingState == GunOperation.UNTILT_GUN)
								tempVector.translate(gunModel.reloadRotate.x * actualOperateProgress, gunModel.reloadRotate.y * actualOperateProgress, gunModel.reloadRotate.z * actualOperateProgress);
							else if(FlansModClient.tiltGun && FlansModClient.operatingState > GunOperation.NONE)
								tempVector.translate(gunModel.reloadRotate.x, gunModel.reloadRotate.y, gunModel.reloadRotate.z);
							GL11.glRotatef(tempVector.x, 1F, 0F, 0F);
							applyRotForAllDotsRot(tempVector.x);
							GL11.glRotatef(tempVector.y, 0F, 1F, 0F);
							GL11.glRotatef(tempVector.z, 0F, 0F, 1F);
							applyzyxRotForTempVectors(tempVector.x, tempVector.y, tempVector.z);
							setTempVectorsAsNewSubCoorSys();
							
							float xToRot = getGunRotX(), yToRot = getGunRotYaw(), zToRot = getGunRotPitch();
							getReverseXNormalVec(tempVector);
							GL11.glRotatef(xToRot, tempVector.x, tempVector.y, tempVector.z);
							applyRotForAllDotsRot(xToRot);
							getReverseYNormalVec(tempVector);
							GL11.glRotatef(yToRot, tempVector.x, tempVector.y, tempVector.z);
							getReverseZNormalVec(tempVector);
							GL11.glRotatef(zToRot, tempVector.x, tempVector.y, tempVector.z);
							applyRotForSubCoorSys(zToRot, (byte)2);
							applyRotForSubCoorSys(yToRot, (byte)1);
							applyRotForSubCoorSys(xToRot, (byte)0);
							
							Vector3f aimCenter = FlansModClient.aimCenter, lastAimCenter = FlansModClient.lastAimCenter;
							actAimCenter.set(lastAimCenter.x + (aimCenter.x - lastAimCenter.x) * smoothing, 
									lastAimCenter.y + (aimCenter.y - lastAimCenter.y) * smoothing, lastAimCenter.z + (aimCenter.z - lastAimCenter.z) * smoothing);
							GL11.glTranslatef(0F, tempFloat = (0.4F - actAimCenter.y) * adsSwitch + actAimCenter.y, tempFloat1 = -actAimCenter.z * adsSwitch + actAimCenter.z);
							applyxyzTransFor(subCoorSystemOri, 0F, tempFloat, tempFloat1);
							GL11.glRotatef(tempFloat = -actAimCenter.x * adsSwitch, 1F, 0F, 0F);
							applyRotForAllDotsRot(tempFloat);
							applyzyxRotForTempVectors(tempFloat, 0F, 0F);
							GL11.glTranslatef(0F, -actAimCenter.y, -actAimCenter.z);
							setTempVectorsAsNewSubCoorSys();
							applyxyzTransFor(subCoorSystemOri, 0F, -actAimCenter.y, -actAimCenter.z);
							
							renderGunFP();
							GL11.glPopMatrix(); // End here
							
							for(int i = 0; i < allSightsCoors.length && allSightsCoors[i].ownerTag != null; ++i) // prepare to render dot
							{
								// translate sight coor so we can use it later
								getCoorFromSubCoor((tempSightCoors = allSightsCoors[i]).sightCoor, tempSightCoors.sightCoorWithTrans);
								// update dotCoorWithTrans if is not updated yet
								for(int j = 0; j < tempSightCoors.oriDotCoors.length; ++j)
									getCoorFromSubCoor(tempSightCoors.oriDotCoors[j], tempSightCoors.dotCoorWithTrans[j]);
								getCoorFromSubCoor(tempSightCoors.pupilRefCenterCoor, tempSightCoors.pupilRefCenterCoor); //get pupil distance here
								tempSightCoors.pupilRefCenterCoor.x -= viewPoint.x;
								tempSightCoors.pupilRefCenterCoor.y -= viewPoint.y;
								tempSightCoors.pupilDistance = tempSightCoors.pupilRefCenterCoor.length();
								if(tempSightCoors.scopeGlassTexIndex != -1) // if it is a scope, get obj len center and calculate alpha
								{
									//calculate scope mask trans
									getCoorFromSubCoor(tempSightCoors.objectiveLensCenterCoor, tempSightCoors.objectiveLensCenterCoor);
									tempSightCoors.objectiveLensCenterCoor.x = tempSightCoors.objectiveLensCenterCoor.x - viewPoint.x;
									tempSightCoors.objectiveLensCenterCoor.y = tempSightCoors.objectiveLensCenterCoor.y - viewPoint.y;
									tempVector.set(tempSightCoors.objectiveLensCenterCoor.x, 0F, tempSightCoors.objectiveLensCenterCoor.z);
									tempFloat = (float)Vector3f.angle(tempVector, tempSightCoors.objectiveLensCenterCoor);
									if(tempSightCoors.objectiveLensCenterCoor.y > 0F) tempFloat = -tempFloat;
									tempVector1.set(1F, 0F, 0F);
									tempFloat1 = (float)Vector3f.angle(tempVector, tempVector1);
									if(tempVector.z > 0F) tempFloat1 = -tempFloat1; //TODO: calculate tan value directly
									tempSightCoors.scopeMaskTransY = (float)Math.tan(tempFloat) * tempSightCoors.ownerModel.scopeMaskMultTransY;
									tempSightCoors.scopeMaskTransZ = (float)Math.tan(tempFloat1) * tempSightCoors.ownerModel.scopeMaskMultTransZ;
								}
								if(tempSightCoors.ownerType.scopeGlassModel == null && tempSightCoors.dotBorder.length > 2)
								{
									transVecFromSubToMainCoorSys(tempSightCoors.ownerModel.normalVecOfDotBorder, tempSightCoors.normalVecWithTrans);
									for(int j = tempSightCoors.dotBorder.length; --j >= 0; )
										getCoorFromSubCoor(tempSightCoors.dotBorder[j], tempSightCoors.dotBorderWithTrans[j]);
									if(tempSightCoors.dotCoorWithTrans.length == 1) // if only one dot coor, render the whole division if it is in side the border
									{
										if(insideSightBorder(tempSightCoors, tempSightCoors.dotCoorWithTrans[0], tempVector))
										{
											GL11.glPushMatrix();
											{
												GL11.glTranslatef(tempVector.x, tempVector.y, tempVector.z);
												GL11.glRotatef(tempSightCoors.dotRotateAngle, 1F, 0F, 0F);
												renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(tempSightCoors.ownerType.lightStuffTexture 
														+ AttachmentType.getDotNum(tempSightCoors.ownerTag)));
												GL11.glScalef(1F, tempFloat = tempSightCoors.ownerModel.reticleScale * tempSightCoors.pupilDistance, tempFloat);
												renderStaticGlowOnModel(tempSightCoors.ownerType.lightStuffModel);
											}
											GL11.glPopMatrix();
										}
									}
									else //render reticle according to each dot at
									{
										GL11.glPushMatrix();
										GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
										{
											renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(tempSightCoors.ownerType.lightStuffTexture 
													+ AttachmentType.getDotNum(tempSightCoors.ownerTag)));
											net.minecraft.client.renderer.RenderHelper.disableStandardItemLighting();
											ModelGun.glowOnStatic();
											int j = insideSightBorder(tempSightCoors, tempSightCoors.dotCoorWithTrans[0], tempVector) ? 1 : 0;
											GL11.glTranslatef(tempVector.x, tempVector.y, tempVector.z);
											GL11.glRotatef(tempSightCoors.dotRotateAngle, 1F, 0F, 0F);
											GL11.glScalef(1F, tempFloat = tempSightCoors.ownerModel.reticleScale * tempSightCoors.pupilDistance, tempFloat);
											if(j != 0) tempSightCoors.ownerType.lightStuffModel.defaultModel[0].render(f);
											for(j = tempSightCoors.dotCoorWithTrans.length; --j > 0; )
											{
												if(insideSightBorder(tempSightCoors, tempSightCoors.dotCoorWithTrans[j], tempVector))
													tempSightCoors.ownerType.lightStuffModel.defaultModel[j].render(f);
											}
											ModelGun.glowOff();
										}
										GL11.glPopAttrib();
										GL11.glPopMatrix();
									}
								}
							}
							calculateSightRot(); //get sight Rots for after rendering
							if(createSmokeForGun) //if required to create smoke
							{
								muzzleSmokeAt.set(gunModel.barrelOrigin.x + GunType.getState(gunStates, GunTag.SMOKE_AT), gunModel.barrelOrigin.y, gunModel.barrelOrigin.z);
								getCoorFromSubCoor(muzzleSmokeAt, muzzleSmokeAt);
								getCoorFromSubCoor(gunModel.chamberSmokeOri, chamberSmokeAt);
								muzzleSmokeAt.sub(viewPoint);
								chamberSmokeAt.sub(viewPoint);
							}
							if(createCaseForGun) //if required to create case
							{
								getCoorFromSubCoor(gunModel.caseOrigin, caseAt);
								caseAt.sub(viewPoint);
								caseTrans.set(gunModel.caseEjectVelocity.x + gunModel.caseEjectRandV.x * FlansMod.rand.nextFloat(), 
											  gunModel.caseEjectVelocity.y + gunModel.caseEjectRandV.y * FlansMod.rand.nextFloat(), 
											  gunModel.caseEjectVelocity.z + gunModel.caseEjectRandV.z * FlansMod.rand.nextFloat());
								transVecFromSubToMainCoorSys(caseTrans, caseTrans);
								caseRot.set(gunModel.caseEjectAngularV.x + gunModel.caseEjectRandAV.x * FlansMod.rand.nextFloat(), 
								  			gunModel.caseEjectAngularV.y + gunModel.caseEjectRandAV.y * FlansMod.rand.nextFloat(), 
								  			gunModel.caseEjectAngularV.z + gunModel.caseEjectRandAV.z * FlansMod.rand.nextFloat());
								transVecFromSubToMainCoorSys(caseRot, caseRot);
								transVecFromSubToMainCoorSys(FlansModClient.gunCaseList[FlansModClient.currentCaseIndex].caseType.rotCenter, caseRotCenter);
							}
							getCoorFromSubCoor(gunModel.barrelOrigin, tempBarrelOriTrans); //update barrel origin and barrel yaw/pitch
							tempBarrelOriTrans.sub(viewPoint);
							if(FlansModClient.operatingState == GunOperation.NONE && actualSprintProgress == 0F) tempBarrelOriTransNO.set(tempBarrelOriTrans);
							tempVector.set(subCoorSystem[0].x, 0F, subCoorSystem[0].z);
							
							barrelRotPitchRight = (float)Math.toDegrees(Vector3f.angle(subCoorSystem[0], tempVector));
							if(subCoorSystem[0].y > 0F) barrelRotPitchRight = -barrelRotPitchRight;
							tempVector1.set(1F, 0F, 0F);
							barrelRotYawRight = (float)Math.toDegrees(Vector3f.angle(tempVector, tempVector1));
							if(tempVector.z < 0F) barrelRotYawRight = -barrelRotYawRight;
							for(int i = 0; i < allSightsCoors.length && allSightsCoors[i].ownerTag != null; ++i) //update for scope
							{
								if((tempSightCoors = allSightsCoors[i]).scopeGlassTexIndex != -1)
								{
									tempSightCoors.applyScopeMaskTransY(-barrelRotPitchRight);
									tempSightCoors.applyScopeMaskTransZ(barrelRotYawRight);
									tempSightCoors.updateAlpha();
								}
							}
							standardizeCoorSystemFor(tempPointingVectors); //update barrel origin
							standardizeCoorSystemFor(subCoorSystem);
							applyRotForTempVectors(-actualPlayerRotPitch, (byte)2);
							applyRotForTempVectors(-actualPlayerRotYaw - 90F, (byte)1);
							setTempVectorsAsNewSubCoorSys();
							transVecFromSubToMainCoorSys(tempBarrelOriTrans, barrelOriTransRight);
							transVecFromSubToMainCoorSys(tempBarrelOriTransNO, barrelOriTransRightNO); //update barrel ori according to the angle we look
							if(FlansModClient.operatingState == GunOperation.NONE && actualSprintProgress == 0F)
							{
								barrelRotPitchRightNO = barrelRotPitchRight;
								barrelRotYawRightNO = barrelRotYawRight;
							}
							if(createSmokeForGun) //create smoke
							{
								transVecFromSubToMainCoorSys(muzzleSmokeAt, muzzleSmokeAt);
								transVecFromSubToMainCoorSys(chamberSmokeAt, chamberSmokeAt);
								if(gunType.muzzleSmokeVanishConst > 0F)
								{
									FlansModClient.gunSmokeList[FlansModClient.currentSmokeIndex]
									.set(gunType.muzzleSmokeModel, gunType.muzzleSmokeTexture + FlansMod.rand.nextInt(gunType.numMuzzleSmokeTexture), gunType.muzzleSmokeScale, 
										 gunType.muzzleSmokeScaleEx, muzzleSmokeAt, gunType.muzzleSmokeFreeRotate ? FlansMod.rand.nextFloat() * 360F : 0F, 
										 -(actualPlayerRotYaw + 90F + barrelRotYawRight), -(actualPlayerRotPitch + barrelRotPitchRight), gunType.muzzleSmokeVanishConst);
								}
								//CONSIDER: may need to help pre set the pos in scope
								//FlansModClient.gunSmokeList[FlansModClient.currentSmokeIndex].setPosInScope();
								++FlansModClient.currentSmokeIndex;
								if(gunType.chamberSmokeVanishConst > 0F)
								{
									FlansModClient.gunSmokeList[FlansModClient.currentSmokeIndex]
									.set(gunType.chamberSmokeModel, gunType.chamberSmokeTexture + FlansMod.rand.nextInt(gunType.numChamberSmokeTexture), gunType.chamberSmokeScale, 
										 gunType.chamberSmokeScaleEx, chamberSmokeAt, SightCoor.sightRotX, 
										 -(actualPlayerRotYaw + 90F + barrelRotYawRight), -(actualPlayerRotPitch + barrelRotPitchRight), gunType.chamberSmokeVanishConst);
										 //gunType.chamberSmokeFreeRotate ? FlansMod.rand.nextFloat() * 360F : 0F
								}
								if(++FlansModClient.currentSmokeIndex >= FlansModClient.gunSmokeList.length) FlansModClient.currentSmokeIndex = 0;
								setSmokePosInScope = !(createSmokeForGun = false);
							}
							if(createCaseForGun) //create case
							{
								transVecFromSubToMainCoorSys(caseAt, caseAt);
								transVecFromSubToMainCoorSys(caseTrans, caseTrans);
								transVecFromSubToMainCoorSys(caseRotCenter, caseRotCenter);
								transVecFromSubToMainCoorSys(caseRot, caseRot);
								FlansModClient.gunCaseList[FlansModClient.currentCaseIndex]
								.set(caseAt, SightCoor.sightRotX, -(actualPlayerRotYaw + 90F + barrelRotYawRight), -(actualPlayerRotPitch + barrelRotPitchRight), caseTrans, caseRotCenter, caseRot);
								FlansModClient.gunCaseList[FlansModClient.currentCaseIndex].time = 0; //done set pos, update time
								if(++FlansModClient.currentCaseIndex >= FlansModClient.gunCaseList.length) FlansModClient.currentCaseIndex = 0;
								setCasePosInScope = !(createCaseForGun = false);
							}
							
							GL11.glPushMatrix(); // create a world coor system and render the gun smoke
							{
								GL11.glTranslatef(viewPoint.x, viewPoint.y, viewPoint.z);
								GL11.glRotatef(actualPlayerRotPitch, 0F, 0F, 1F);
								GL11.glRotatef(actualPlayerRotYaw + 90F, 0F, 1F, 0F);
								for(GunCase thisCase : FlansModClient.gunCaseList) // render gun case
								{
									if(thisCase.isDead()) continue;
									tempVector.set(thisCase.pos);
									tempVector1.set(thisCase.lastPos);
									GL11.glPushMatrix();
									{
										GL11.glTranslatef(tempVector1.x + (tempVector.x - tempVector1.x) * smoothing + thisCase.rotCenter.x, 
														  tempVector1.y + (tempVector.y - tempVector1.y) * smoothing + thisCase.rotCenter.y, 
														  tempVector1.z + (tempVector.z - tempVector1.z) * smoothing + thisCase.rotCenter.z);
										GL11.glRotatef((tempFloat = thisCase.lastRotProgress) + (thisCase.rotProgress - tempFloat) * smoothing, 
												   thisCase.rotVector.x, thisCase.rotVector.y, thisCase.rotVector.z);
										GL11.glTranslatef(-thisCase.rotCenter.x, -thisCase.rotCenter.y, -thisCase.rotCenter.z);
										GL11.glRotatef(thisCase.rot.y, 0F, 1F, 0F);
										GL11.glRotatef(thisCase.rot.z, 0F, 0F, 1F);
										GL11.glRotatef(thisCase.rot.x, 1F, 0F, 0F);
										renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(thisCase.caseType.bulletTexture));
										GL11.glScalef(tempFloat = thisCase.caseType.bulletScale, tempFloat, tempFloat);
										thisCase.caseType.bulletModel.render(f);
									}
									GL11.glPopMatrix();
								}
								GunSmoke thisSmoke;
								for(int j = 0; j < FlansModClient.gunSmokeList.length; ++j)
								{
									if((thisSmoke = FlansModClient.gunSmokeList[j]).smokeModel == null) continue;
									tempVector.set(thisSmoke.pos);
									tempVector1.set(thisSmoke.lastPos);
									GL11.glPushMatrix();
									{
										GL11.glColor4f(1F, 1F, 1F, thisSmoke.alpha);
										GL11.glTranslatef(tempVector1.x + (tempVector.x - tempVector1.x) * smoothing, 
														  tempVector1.y + (tempVector.y - tempVector1.y) * smoothing, 
														  tempVector1.z + (tempVector.z - tempVector1.z) * smoothing);
										GL11.glRotatef(thisSmoke.rotY, 0F, 1F, 0F);
										GL11.glRotatef(thisSmoke.rotZ, 0F, 0F, 1F);
										//sp here
										GL11.glRotatef(thisSmoke.rotX, 1F, 0F, 0F);
										renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(thisSmoke.smokeTexture));
										GL11.glScalef(tempFloat = thisSmoke.getScale(), tempFloat, tempFloat);
										thisSmoke.smokeModel.render(f);
									}
									GL11.glPopMatrix();
								}
								GL11.glColor4f(1F, 1F, 1F, 1F);
							}
							GL11.glPopMatrix();
							for(int i = 0; i < allSightsCoors.length && allSightsCoors[i].ownerTag != null; ++i) //render coated glass in the last so we can see through it
							{
								tempSightCoors = allSightsCoors[i];
								if(tempSightCoors.ownerType.coatedGlassModel == null) continue;
								AttachmentType toRenderType = tempSightCoors.ownerType;
								GL11.glPushMatrix();
								{
									GL11.glTranslatef(tempSightCoors.sightCoorWithTrans.x, tempSightCoors.sightCoorWithTrans.y, tempSightCoors.sightCoorWithTrans.z);
									GL11.glRotatef(SightCoor.sightRotX, 1F, 0F, 0F);
									GL11.glRotatef(SightCoor.sightRotY, 0F, 1F, 0F);
									GL11.glRotatef(SightCoor.sightRotZ, 0F, 0F, 1F);
									GL11.glRotatef(tempSightCoors.rotateAngle, 1F, 0F, 0F);
									renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(toRenderType.getPaintjob(tempSightCoors.ownerTag)));
									GL11.glScalef(toRenderType.modelScale, toRenderType.modelScale, toRenderType.modelScale);
									toRenderType.coatedGlassModel.render(f);
								}
								GL11.glPopMatrix();
							}
						}
					}
					else //rendering scope frame-buffer texture, use scope translate
					{
						GL11.glRotatef(20F, 0F, 0F, 1F);
						GL11.glRotatef(-5F, 0F, 1F, 0F);
						GL11.glTranslatef(0.15F, 0.375F, -1.005F);
						GL11.glRotatef(0.5F, 1F, 0F, 0F);
						GL11.glRotatef(5F, 0F, 0F, 1F);
						GL11.glTranslatef(0F, 0.7F / 160F - 0.03F, -0.35F / 160F);
						standardizeCoorSystemFor(tempPointingVectors); //standardize coor trace system
						standardizeCoorSystemFor(subCoorSystem);
						subCoorSystemOri.set(0F);
						for(int i = 0; i < allSightsCoors.length && allSightsCoors[i].ownerTag != null; ++i)
							allSightsCoors[i].dotRotateAngle = allSightsCoors[i].rotateAngle;
						
						GL11.glPushMatrix(); //start here
						GunType.getPosOfAttachableAt(atPos.resetAtTag(gunStack.stackTagCompound, gunType), sightAt, sightAt.length & -2);
						ModelAtSight sightModel = (ModelAtSight)AttachmentType.getAtType(atPos.atTag).model;
						atPos.updateTriValues().x += sightModel.scopeObjectiveLensCenter.x;
						atPos.y += sightModel.scopeObjectiveLensCenter.y * atPos.cos - sightModel.scopeObjectiveLensCenter.z * atPos.sin;
						atPos.z += sightModel.scopeObjectiveLensCenter.y * atPos.sin + sightModel.scopeObjectiveLensCenter.z * atPos.cos;
						
						GL11.glTranslatef(tempFloat = -atPos.x + viewPointXForScope, 0.4F, 0F);
						applyxyzTransFor(subCoorSystemOri, tempFloat, 0.4F, 0F);
						GL11.glRotatef(tempFloat = -atPos.rotX * adsSwitch, 1F, 0F, 0F);
						applyRotForAllDotsRot(tempFloat);
						applyzyxRotForTempVectors(tempFloat, 0F, 0F);
						GL11.glTranslatef(0F, -atPos.y, -atPos.z);
						setTempVectorsAsNewSubCoorSys();
						applyxyzTransFor(subCoorSystemOri, 0F, -atPos.y, -atPos.z);
						
						renderGunFP();
						GL11.glPopMatrix(); //end here
						
						for(int i = 0; i < allSightsCoors.length && allSightsCoors[i].ownerTag != null; ++i) //prepare to render dot in scope texture
						{
							getCoorFromSubCoor((tempSightCoors = allSightsCoors[i]).sightCoor, tempSightCoors.sightCoorWithTrans);
							if(tempSightCoors.dotBorder.length > 2)
							{
								transVecFromSubToMainCoorSys(tempSightCoors.ownerModel.normalVecOfDotBorder, tempSightCoors.normalVecWithTrans);
								for(int j = tempSightCoors.dotBorder.length; --j >= 0; )
									getCoorFromSubCoor(tempSightCoors.dotBorder[j], tempSightCoors.dotBorderWithTrans[j]);
								if(tempSightCoors.dotCoorWithTrans.length == 1)
								{
									if(insideSightBorder(tempSightCoors, tempSightCoors.dotCoorWithTrans[0], tempVector))
									{
										renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(tempSightCoors.ownerType.lightStuffTexture 
												+ AttachmentType.getDotNum(tempSightCoors.ownerTag)));	
										GL11.glPushMatrix();
										{
											GL11.glTranslatef(tempVector.x, tempVector.y, tempVector.z);
											GL11.glRotatef(tempSightCoors.dotRotateAngle, 1F, 0F, 0F);
											GL11.glScalef(1F, tempFloat = tempSightCoors.getDivisionScale(), tempFloat);
											renderStaticGlowOnModel(tempSightCoors.ownerType.lightStuffModel);
										}
										GL11.glPopMatrix();
									}
								}
								else
								{
									GL11.glPushMatrix();
									GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
									{
										net.minecraft.client.renderer.RenderHelper.disableStandardItemLighting();
										renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(tempSightCoors.ownerType.lightStuffTexture 
												+ AttachmentType.getDotNum(tempSightCoors.ownerTag)));	
										ModelGun.glowOnStatic();
										if(insideSightBorder(tempSightCoors, tempSightCoors.dotCoorWithTrans[0], tempVector))
										{
											GL11.glTranslatef(tempVector.x, tempVector.y, tempVector.z);
											GL11.glRotatef(tempSightCoors.dotRotateAngle, 1F, 0F, 0F);
											GL11.glScalef(1F, tempFloat = tempSightCoors.getDivisionScale(), tempFloat);
											tempSightCoors.ownerType.lightStuffModel.defaultModel[0].render(f);
										}
										else //center point not inside the border, just trans rot scale but no rendering
										{
											GL11.glTranslatef(tempVector.x, tempVector.y, tempVector.z);
											GL11.glRotatef(tempSightCoors.dotRotateAngle, 1F, 0F, 0F);
											GL11.glScalef(1F, tempFloat = tempSightCoors.getDivisionScale(), tempFloat);
										}
										for(int j = tempSightCoors.dotCoorWithTrans.length; --j > 0; )
										{
											if(insideSightBorder(tempSightCoors, tempSightCoors.dotCoorWithTrans[j], tempVector))
												tempSightCoors.ownerType.lightStuffModel.defaultModel[j].render(f);
										}
										ModelGun.glowOff();
									}
									GL11.glPopAttrib();
									GL11.glPopMatrix();
								}
							}
						}
						calculateSightRot(); //get sight Rots for after rendering
						if(setSmokePosInScope || setCasePosInScope)
						{
							if(setSmokePosInScope)
							{
								muzzleSmokeAt.set(gunModel.barrelOrigin.x + GunType.getState(gunStates, GunTag.SMOKE_AT), gunModel.barrelOrigin.y, gunModel.barrelOrigin.z);
								chamberSmokeAt.set(gunModel.chamberSmokeOri);
								getCoorFromSubCoor(muzzleSmokeAt, muzzleSmokeAt);
								getCoorFromSubCoor(chamberSmokeAt, chamberSmokeAt);
								muzzleSmokeAt.sub(viewPoint);
								chamberSmokeAt.sub(viewPoint);
							}
							if(setCasePosInScope)
							{
								caseAt.set(gunModel.caseOrigin);
								getCoorFromSubCoor(caseAt, caseAt);
								caseAt.sub(viewPoint);
							}
							standardizeCoorSystemFor(tempPointingVectors);
							standardizeCoorSystemFor(subCoorSystem);
							updateActualPlayerRot();
							applyRotForTempVectors(-actualPlayerRotPitch, (byte)2);
							applyRotForTempVectors(-actualPlayerRotYaw - 90F, (byte)1);
							setTempVectorsAsNewSubCoorSys();
							if(setSmokePosInScope)
							{
								transVecFromSubToMainCoorSys(muzzleSmokeAt, muzzleSmokeAt);
								transVecFromSubToMainCoorSys(chamberSmokeAt, chamberSmokeAt);
								if(FlansModClient.currentSmokeIndex == 0)
								{
									FlansModClient.gunSmokeList[FlansModClient.gunSmokeList.length - 2].setPosInScope(onScopeLayerRendering, muzzleSmokeAt);
									FlansModClient.gunSmokeList[FlansModClient.gunSmokeList.length - 1].setPosInScope(onScopeLayerRendering, chamberSmokeAt);
								}
								else
								{
									FlansModClient.gunSmokeList[FlansModClient.currentSmokeIndex - 2].setPosInScope(onScopeLayerRendering, muzzleSmokeAt);
									FlansModClient.gunSmokeList[FlansModClient.currentSmokeIndex - 1].setPosInScope(onScopeLayerRendering, chamberSmokeAt);
								}
							}
							if(setCasePosInScope)
							{
								transVecFromSubToMainCoorSys(caseAt, caseAt);
								FlansModClient.gunCaseList[FlansModClient.currentCaseIndex == 0 ? FlansModClient.gunCaseList.length - 1 
								: FlansModClient.currentCaseIndex].setPosInScope(onScopeLayerRendering, caseAt);
							}
						}
						GL11.glPushMatrix();
						{
							GL11.glTranslatef(viewPoint.x, viewPoint.y, viewPoint.z);
							GL11.glRotatef(actualPlayerRotPitch, 0F, 0F, 1F);
							GL11.glRotatef(actualPlayerRotYaw + 90F, 0F, 1F, 0F);
							for(GunCase thisCase : FlansModClient.gunCaseList) //render case
							{
								if(thisCase.isDead()) continue;
								tempVector.set(thisCase.posInScope[onScopeLayerRendering]);
								tempVector1.set(thisCase.lastPosInScope[onScopeLayerRendering]);
								GL11.glPushMatrix();
								{
									GL11.glTranslatef(tempVector1.x + (tempVector.x - tempVector1.x) * smoothing + thisCase.rotCenter.x, 
													  tempVector1.y + (tempVector.y - tempVector1.y) * smoothing + thisCase.rotCenter.y, 
													  tempVector1.z + (tempVector.z - tempVector1.z) * smoothing + thisCase.rotCenter.z);
									GL11.glRotatef((tempFloat = thisCase.lastRotProgress) + (thisCase.rotProgress - tempFloat) * smoothing, 
													thisCase.rotVector.x, thisCase.rotVector.y, thisCase.rotVector.z);
									GL11.glTranslatef(-thisCase.rotCenter.x, -thisCase.rotCenter.y, -thisCase.rotCenter.z);
									GL11.glRotatef(thisCase.rot.y, 0F, 1F, 0F);
									GL11.glRotatef(thisCase.rot.z, 0F, 0F, 1F);
									GL11.glRotatef(thisCase.rot.x, 1F, 0F, 0F);
									renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(thisCase.caseType.bulletTexture));
									GL11.glScalef(tempFloat = thisCase.caseType.bulletScale, tempFloat, tempFloat);
									thisCase.caseType.bulletModel.render(f);
								}
								GL11.glPopMatrix();
							}
							GunSmoke tempSmoke; //render smoke
							for(int i = 0; i < FlansModClient.gunSmokeList.length; ++i)
							{
								if((tempSmoke = FlansModClient.gunSmokeList[i]).smokeModel == null) continue;
								GL11.glColor4f(1F, 1F, 1F, tempSmoke.alpha);
								tempVector.set(tempSmoke.posInScope[onScopeLayerRendering]);
								tempVector1.set(tempSmoke.lastPosInScope[onScopeLayerRendering]);
								GL11.glPushMatrix();
								{
									GL11.glTranslatef(tempVector1.x + (tempVector.x - tempVector1.x) * smoothing, 
													  tempVector1.y + (tempVector.y - tempVector1.y) * smoothing, 
													  tempVector1.z + (tempVector.z - tempVector1.z) * smoothing);
									GL11.glRotatef(tempSmoke.rotY, 0F, 1F, 0F);
									GL11.glRotatef(tempSmoke.rotZ, 0F, 0F, 1F);
									//sp here
									GL11.glRotatef(tempSmoke.rotX, 1F, 0F, 0F);
									renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(tempSmoke.smokeTexture));
									GL11.glScalef(tempFloat = tempSmoke.getScale(), tempFloat, tempFloat);
									tempSmoke.smokeModel.render(f);
								}
								GL11.glPopMatrix();
							}
							GL11.glColor4f(1F, 1F, 1F, 1F);
						}
						GL11.glPopMatrix();
						for(int i = 0; i < allSightsCoors.length && allSightsCoors[i].ownerTag != null; ++i)
						{
							if((tempSightCoors = allSightsCoors[i]).ownerType.coatedGlassModel == null) continue;
							AttachmentType toRenderType = tempSightCoors.ownerType;
							GL11.glPushMatrix();
							{
								GL11.glTranslatef(tempSightCoors.sightCoorWithTrans.x, tempSightCoors.sightCoorWithTrans.y, tempSightCoors.sightCoorWithTrans.z);
								GL11.glRotatef(SightCoor.sightRotX, 1F, 0F, 0F);
								GL11.glRotatef(SightCoor.sightRotY, 0F, 1F, 0F);
								GL11.glRotatef(SightCoor.sightRotZ, 0F, 0F, 1F);
								renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(toRenderType.getPaintjob(tempSightCoors.ownerTag)));
								GL11.glScalef(toRenderType.modelScale, toRenderType.modelScale, toRenderType.modelScale);
								toRenderType.coatedGlassModel.render(f);
							}
							GL11.glPopMatrix();
						}
						//render black mask if this scope has(black mask can have transparent part, so we render in the last)
						renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(
								(tempSightCoors = getSightCoorByScopeTexRendering()).ownerType.lightStuffTexture + AttachmentType.getDotNum(tempSightCoors.ownerTag)));	
						GL11.glPushMatrix();
						{
							GL11.glTranslatef(tempSightCoors.ownerModel.scopeMaskXTrans, 0.4F + tempSightCoors.scopeMaskTransY, tempSightCoors.scopeMaskTransZ);
							GL11.glRotatef(tempSightCoors.dotRotateAngle, 1F, 0F, 0F);
							GL11.glScalef(1F, (tempFloat = tempSightCoors.pupilDistanceMaskScale()) > 1F ? tempFloat = tempSightCoors.getScopeMaskScale() 
											  : (tempFloat *= tempSightCoors.getScopeMaskScale()), tempFloat);
							tempSightCoors.ownerType.blackMaskModel.render(f);
						}
						GL11.glPopMatrix();
					}
				}
				default: ;
			}
		}
		GL11.glPopMatrix();
	}
	
	private static void updateActualPlayerRot()
	{
		actualPlayerRotPitch = FlansModClient.playerPrevRotationPitch + (mc.thePlayer.rotationPitch - FlansModClient.playerPrevRotationPitch) * smoothing;
		actualPlayerRotYaw = FlansModClient.playerPrevRotationYaw + (mc.thePlayer.rotationYaw - FlansModClient.playerPrevRotationYaw) * smoothing;
	}
	
	private static void calculateSightRot()
	{
		tempVector.set(0F, subCoorSystem[2].y, subCoorSystem[2].z);
		SightCoor.sightRotY = (float)Math.toDegrees(Vector3f.angle(subCoorSystem[2], tempVector));
		if(subCoorSystem[2].x < 0F) SightCoor.sightRotY = -SightCoor.sightRotY;
		tempVector1.set(0F, 0F, 1F);
		SightCoor.sightRotX = (float)Math.toDegrees(Vector3f.angle(tempVector, tempVector1));
		if(tempVector.y > 0F) SightCoor.sightRotX = -SightCoor.sightRotX;
		tempVector.set(subCoorSystem[0]);
		applyRotFor(tempVector, -SightCoor.sightRotX, (byte)0);
		tempVector1.set(tempVector.x, 0F, tempVector.z);
		SightCoor.sightRotZ = (float)Math.toDegrees(Vector3f.angle(tempVector, tempVector1));
		if(tempVector.y < 0F) SightCoor.sightRotZ = -SightCoor.sightRotZ;
	}
	
	private static boolean insideSightBorder(SightCoor tempSightCoors, Vector3f dotCoorWithTrans, Vector3f destVector)
	{
		Vector3f vec1 = tempSightCoors.tempVector, vec2 = tempSightCoors.dotBorderWithTrans[0], vec3 = tempSightCoors.normalVecWithTrans;
		//calculate intersect point
		FlansMod.getLinePlaneIntersection(viewPoint.x, viewPoint.y, viewPoint.z, 
				dotCoorWithTrans.x - viewPoint.x, dotCoorWithTrans.y - viewPoint.y, dotCoorWithTrans.z - viewPoint.z, 
				vec2.x, vec2.y, vec2.z, 
				vec3.x, vec3.y, vec3.z, 
				destVector);
		return FlansMod.insideBorder(destVector, tempSightCoors.dotBorderWithTrans);
		/** check if it is out off border
		int count = 0, j = tempSightCoors.dotBorderWithTrans.length;
		vec1.set(vec2.x - (vec3 = tempSightCoors.dotBorderWithTrans[--j]).x, vec2.y - vec3.y, vec2.z - vec3.z);
		while(j > 0)
		{
			if(FlansMod.getLineLineIntersection(destVector.x, destVector.y, destVector.z, vec1.x, vec1.y, vec1.z, 
					(vec2 = vec3).x, vec2.y, vec2.z,
					vec2.x - (vec3 = tempSightCoors.dotBorderWithTrans[--j]).x, vec2.y - vec3.y, vec2.z - vec3.z, 
					tempVector1)
			   && FlansMod.betweenTest(tempVector1, vec2, vec3) 
			   && FlansMod.onRayTest(tempVector1, destVector.x, destVector.y, destVector.z, vec1.x, vec1.y, vec1.z))
			{ ++count; } //take it into count 
		}
		return (count & 1) == 1; //if inside the border, return true */
	}
	
	private static void applyRotForAllDotsRot(float amount)
	{ for(int i = 0; i < allSightsCoors.length && allSightsCoors[i].ownerTag != null; ) allSightsCoors[i++].dotRotateAngle += amount; }
	
	private static SightCoor getSightCoorByScopeTexRendering()
	{
		for(int i = 0; i < allSightsCoors.length && allSightsCoors[i].ownerTag != null; ++i)
		{ if(allSightsCoors[i].scopeGlassTexIndex == onScopeLayerRendering) return allSightsCoors[i]; }
		return null;
	}
	
	private static SightCoor getSightCoor(byte[] at, int len)
	{
		SightCoor sc;
		for(int i = 0; i < allSightsCoors.length; ++i)
		{
			if((sc = allSightsCoors[i]).ownerTag == null) break;
			if(sc.isScopeOwner(at, len)) return sc;
		}
		return null;
	}
	
	/** render gun in first person view */
	public static void renderGunFP()
	{
		actualSlideProgress = animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing;
		
		// Make sure we actually have the renderEngine //done in doRenderGun, no more here
		//if(renderEngine == null) renderEngine = mc.renderEngine;
		
		ModelDefault leftArm = gunType.leftArmModel; // Get arm model
		ModelDefault rightArm = gunType.rightArmModel;
		
		//when charging the gun, we don't care about whether slide is still moving
		if(FlansModClient.operatingState == GunOperation.CHARGE) slideLock = setChargeProgress(actualOperateProgress);
		//checking chamber
		else if(FlansModClient.operatingState == GunOperation.CHECK_CHAMBER && actualOperateProgress >= gunModel.checkChamberTiltTimeRatio)
		{
			setChargeProgress(actualOperateProgress <= gunModel.checkChamberChargeTimeRatio
							  ? (actualOperateProgress - gunModel.checkChamberTiltTimeRatio) / (gunModel.checkChamberChargeTimeRatio - gunModel.checkChamberTiltTimeRatio) * gunModel.checkChamberChargeRatio
							  : gunModel.checkChamberChargeRatio);
			slideLock = false;
		}
		else //not charging or checking chamber
		{	//set all charge animation values to be zero
			actualChargeDistance = actualPreChargeDistance = actualPreChargeRotate.x = actualPreChargeRotate.y = actualPreChargeRotate.z = 0F;
			actualSlideDistance = -actualSlideProgress * gunModel.gunSlideDistance;
			//if slide is locked, see if we need to keep it in lock position
			if(animations.preLockSlideTime >= 0 && (animations.preLockSlideTime > 0 || GunType.getTOF(gunStates, GunTag.BOLT_CATCH_ON)))
			{
				slideLock = true;
				if(animations.lastGunSlide >= animations.gunSlide && -actualSlideDistance < gunModel.slideLockDistance)
					actualSlideDistance = -gunModel.slideLockDistance;
			}
			else slideLock = false;
		}
		
		GL11.glPushMatrix();
		{
			GL11.glTranslatef(actualSlideDistance * gunType.modelScale, 0F, 0F);
			renderBulletInMag(gunType, gunStack); // render bullet in barrel or the bullet in mag we holding
		}
		GL11.glPopMatrix();
		
		//render the gun part
		GL11.glPushMatrix();
		{
			//bind gun texture
			renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(gunType.getTex((short)gunStack.getItemDamage())));
			
			GL11.glScalef(gunType.modelScale, gunType.modelScale, gunType.modelScale);
			gunModel.renderGun(f); //render gun body
			ModelGun.glowOn();
			gunModel.renderLightStuff(f); //render light stuff on gun body
			ModelGun.glowOff();
			
			fireModeNum = GunType.getFireModeNum(gunStates);
			gunModel.renderSwitch(fireModeNum, f);
			gunModel.renderBoltCatchButton(slideLock, f); //render boltcatch button
			
			//here we first calculate the distance and rotation needed so we can use it if any of the attachments plays the role of slide or pump
			if(GunType.getSecondaryFire(gunStack)) //actualChargeDistance actualPreChargeDistance actualPreChargeRotate actualSlideDistance
			{
				actualChargeDistance = actualPreChargeDistance = actualPreChargeRotate.x = actualPreChargeRotate.y = actualPreChargeRotate.z = actualSlideDistance = 0F;
				
				gunModel.renderSlide(f); //render static slide and pump(charge handle)
				gunModel.renderaltSlide(f);
				gunModel.renderPump(f); //pump
				gunModel.renderPump2(f);
			}
			else
			{	//we've got animation values we need to render pump and slide, then render it
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(actualSlideDistance, 0F, 0F);
					gunModel.renderSlide(f); //render slide
				}
				GL11.glPopMatrix();
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(-actualSlideProgress * gunModel.altgunSlideDistance, 0F, 0F);
					gunModel.renderaltSlide(f); //render altSlide
				}
				GL11.glPopMatrix();
				GL11.glPushMatrix(); //pump part
				{
					GL11.glTranslatef(actualChargeDistance, 0F, 0F);
					gunModel.renderPump(f);
					GL11.glTranslatef(actualPreChargeDistance + gunModel.prechargeRotatePoint.x, gunModel.prechargeRotatePoint.y, gunModel.prechargeRotatePoint.z);
					GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
					GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
					GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
					GL11.glTranslatef(-gunModel.prechargeRotatePoint.x, -gunModel.prechargeRotatePoint.y, -gunModel.prechargeRotatePoint.z);
					gunModel.renderPump2(f);
				}
				GL11.glPopMatrix();
			}
		}
		GL11.glPopMatrix();
		
		if(gunType.itsType == ItsType.MAG) //no rendering muzzle flash for mags
		{
			leftHandAt[0] = rightHandAt[0] = -1;
			leftHandAt[leftHandAt.length - 1] = rightHandAt[leftHandAt.length - 1] = AttachmentType.LOWEST_HAND_PRIORITY;
			renderAttachments_FP(gunType, gunStack.stackTagCompound, 0);
		}
		else
		{
			if(renderMagInGun_FP()) renderLoadingMag_FP(); //render magazine if it is needed
			AttachmentType muzzleType = GunType.getMuzzleType(gunStates);
			if(muzzleType == null || muzzleType.flashModel == null) //no flash from type, use default gun flash model
			{
				flashModel = gunType.flashModel;
				flashTexture = gunType.flashTexture;
			}
			else
			{
				flashModel = muzzleType.flashModel;
				flashTexture = muzzleType.flashTexture == null ? gunType.flashTexture : muzzleType.flashTexture;
			}
			if(flashModel == null) renderFlash = false;
			else
			{
				renderFlash = true;
				flashScale = GunType.getState(gunStates, GunTag.FLASH_SCALE);
			}
			
			leftHandAt[0] = rightHandAt[0] = -1;
			leftHandAt[leftHandAt.length - 1] = rightHandAt[leftHandAt.length - 1] = AttachmentType.LOWEST_HAND_PRIORITY;
			renderAttachments_FP(gunType, gunStack.stackTagCompound, 0);
			if(renderFlash)
			{
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(gunModel.muzzleFlashPoint.x, gunModel.muzzleFlashPoint.y, gunModel.muzzleFlashPoint.z);
					if(gunModel.flashFreeRotate) GL11.glRotatef(animations.flashRotate, 1F, 0F, 0F);
					renderEngine.bindTexture(FlansModResourceHandler.getnumedTexture(flashTexture, animations.flashNum)); //bind texture
					GL11.glScalef(flashScale, flashScale, flashScale); //scale to the right size
					GL11.glColor4f(1F, 1F, 1F, animations.lastFlashAlpha + (animations.flashAlpha - animations.lastFlashAlpha) * smoothing);
					renderStaticGlowOnModel(flashModel); //render
					GL11.glColor4f(1F, 1F, 1F, 1F);
				}
				GL11.glPopMatrix();
			}
		}
		
		//render Arms
		if(leftArm != null)
		{
			GL11.glPushMatrix();
			{
				//if is pulling out mag or pushing mag in
				if(gunModel.leftHandAmmo && (FlansModClient.operatingState == GunOperation.UNLOAD_MAG || FlansModClient.operatingState == GunOperation.LOAD_MAG))
				{
					GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.magTranslate.x * actualOperateProgress, gunModel.magAttachPoint.y + gunModel.magTranslate.y * actualOperateProgress, gunModel.magAttachPoint.z - gunModel.magTranslate.z * actualOperateProgress);
					GL11.glRotatef(gunModel.magAttachRotate.x - gunModel.magRotate.x * actualOperateProgress, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.y - gunModel.magRotate.y * actualOperateProgress, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.magRotate.z * actualOperateProgress, 0F, 0F, 1F);
					GL11.glTranslatef(-gunModel.magAttachPoint.x + gunModel.leftArmAmmoPos.x, -gunModel.magAttachPoint.y + gunModel.leftArmAmmoPos.y, -gunModel.magAttachPoint.z + gunModel.leftArmAmmoPos.z);
					GL11.glRotatef(gunModel.leftArmAmmoRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.leftArmAmmoRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.leftArmAmmoRot.z, 0F, 0F, 1F);
				}
				//else if is checking ammo
				else if(gunModel.leftHandAmmo && FlansModClient.operatingState == GunOperation.CHECK_AMMO && actualOperateProgress > gunModel.checkAmmoTiltTimeRatio)
				{
					//if model.checkAmmoMagTimeRatio == 0, there is no secondary animation
					if(gunModel.checkAmmoMagTimeRatio == 0F)
					{
						tempFloat = (actualOperateProgress - gunModel.checkAmmoTiltTimeRatio) / (gunModel.checkAmmoEndTime - gunModel.checkAmmoTiltTimeRatio);
						GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x * tempFloat, gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y * tempFloat, gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z * tempFloat);
						GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x * tempFloat, 1F, 0F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y * tempFloat, 0F, 1F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z * tempFloat, 0F, 0F, 1F);
						GL11.glTranslatef(-gunModel.magAttachPoint.x, -gunModel.magAttachPoint.y, -gunModel.magAttachPoint.z);
					}
					else if(actualOperateProgress < gunModel.checkAmmoMagTimeRatio)
					{
						tempFloat = (actualOperateProgress - gunModel.checkAmmoTiltTimeRatio) / (gunModel.checkAmmoMagTimeRatio - gunModel.checkAmmoTiltTimeRatio);
						GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x * tempFloat, gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y * tempFloat, gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z * tempFloat);
						GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x * tempFloat, 1F, 0F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y * tempFloat, 0F, 1F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z * tempFloat, 0F, 0F, 1F);
						GL11.glTranslatef(-gunModel.magAttachPoint.x, -gunModel.magAttachPoint.y, -gunModel.magAttachPoint.z);
					}
					else if(actualOperateProgress < gunModel.checkAmmoEndTime)//in second step of mag animation
					{
						tempFloat = (actualOperateProgress - gunModel.checkAmmoMagTimeRatio) / (gunModel.checkAmmoEndTime - gunModel.checkAmmoMagTimeRatio);
						GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x + gunModel.checkAmmoMagTranslate2.x * tempFloat, gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y + gunModel.checkAmmoMagTranslate2.y * tempFloat, gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z + gunModel.checkAmmoMagTranslate2.z * tempFloat);
						GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x + gunModel.checkAmmoMagRotate2.x * tempFloat, 1F, 0F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y + gunModel.checkAmmoMagRotate2.y * tempFloat, 0F, 1F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z + gunModel.checkAmmoMagRotate2.z * tempFloat, 0F, 0F, 1F);
						GL11.glTranslatef(-gunModel.magAttachPoint.x, -gunModel.magAttachPoint.y, -gunModel.magAttachPoint.z);
					}
					else //in end time, keep it in position
					{
						GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x + gunModel.checkAmmoMagTranslate2.x, gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y + gunModel.checkAmmoMagTranslate2.y, gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z + gunModel.checkAmmoMagTranslate2.z);
						GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x + gunModel.checkAmmoMagRotate2.x, 1F, 0F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y + gunModel.checkAmmoMagRotate2.y, 0F, 1F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z + gunModel.checkAmmoMagRotate2.z, 0F, 0F, 1F);
						GL11.glTranslatef(-gunModel.magAttachPoint.x, -gunModel.magAttachPoint.y, -gunModel.magAttachPoint.z);
					} //apply default arm translation and rotation here to avoid repeat codes
					GL11.glTranslatef(gunModel.leftArmAmmoPos.x, gunModel.leftArmAmmoPos.y, gunModel.leftArmAmmoPos.z);
					GL11.glRotatef(gunModel.leftArmAmmoRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.leftArmAmmoRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.leftArmAmmoRot.z, 0F, 0F, 1F);
				}
				else if(gunModel.leftHandCheckChamber && FlansModClient.operatingState == GunOperation.CHECK_CHAMBER && actualOperateProgress > gunModel.checkChamberTiltTimeRatio)
				{
					GL11.glTranslatef((actualChargeDistance + actualPreChargeDistance + gunModel.prechargeRotatePoint.x) * gunType.modelScale, gunModel.prechargeRotatePoint.y * gunType.modelScale, gunModel.prechargeRotatePoint.z * gunType.modelScale);
					GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
					GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
					GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
					GL11.glTranslatef(-gunModel.prechargeRotatePoint.x * gunType.modelScale + gunModel.leftHandCheckChamberPos.x, -gunModel.prechargeRotatePoint.y * gunType.modelScale + gunModel.leftHandCheckChamberPos.y, -gunModel.prechargeRotatePoint.z * gunType.modelScale + gunModel.leftHandCheckChamberPos.z);
					GL11.glRotatef(gunModel.leftHandCheckChamberRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.leftHandCheckChamberRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.leftHandCheckChamberRot.z, 0F, 0F, 1F);
				}
				else if(gunModel.leftHandRelease && FlansModClient.reloadingStep == -1 && FlansModClient.operatingState == GunOperation.RELEASE_BOLT)
				{
					GL11.glTranslatef(gunModel.leftArmReleasePos.x, gunModel.leftArmReleasePos.y, gunModel.leftArmReleasePos.z);
					GL11.glRotatef(gunModel.leftArmReleaseRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.leftArmReleaseRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.leftArmReleaseRot.z, 0F, 0F, 1F);
				}
				else if(gunModel.leftHandReloadingRelease && FlansModClient.reloadingStep != -1 && FlansModClient.operatingState == GunOperation.RELEASE_BOLT)
				{
					GL11.glTranslatef(gunModel.leftArmReloadingReleasePos.x, gunModel.leftArmReloadingReleasePos.y, gunModel.leftArmReloadingReleasePos.z);
					GL11.glRotatef(gunModel.leftArmReloadingReleaseRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.leftArmReloadingReleaseRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.leftArmReloadingReleaseRot.z, 0F, 0F, 1F);
				}
				else if(gunModel.leftHandCharge && FlansModClient.reloadingStep == -1 && FlansModClient.operatingState == GunOperation.CHARGE)
				{
					GL11.glTranslatef((actualChargeDistance + actualPreChargeDistance + gunModel.prechargeRotatePoint.x) * gunType.modelScale, gunModel.prechargeRotatePoint.y * gunType.modelScale, gunModel.prechargeRotatePoint.z * gunType.modelScale);
					GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
					GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
					GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
					GL11.glTranslatef(-gunModel.prechargeRotatePoint.x * gunType.modelScale + gunModel.leftArmChargePos.x, -gunModel.prechargeRotatePoint.y * gunType.modelScale + gunModel.leftArmChargePos.y, -gunModel.prechargeRotatePoint.z * gunType.modelScale + gunModel.leftArmChargePos.z);
					GL11.glRotatef(gunModel.leftArmChargeRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.leftArmChargeRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.leftArmChargeRot.z, 0F, 0F, 1F);
				}
				else if(gunModel.leftHandReloadingCharge && FlansModClient.reloadingStep != -1 && FlansModClient.operatingState == GunOperation.CHARGE)
				{
					GL11.glTranslatef((actualChargeDistance + actualPreChargeDistance + gunModel.prechargeRotatePoint.x) * gunType.modelScale, gunModel.prechargeRotatePoint.y * gunType.modelScale, gunModel.prechargeRotatePoint.z * gunType.modelScale);
					GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
					GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
					GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
					GL11.glTranslatef(-gunModel.prechargeRotatePoint.x * gunType.modelScale + gunModel.leftArmReloadingChargePos.x, -gunModel.prechargeRotatePoint.y * gunType.modelScale + gunModel.leftArmReloadingChargePos.y, -gunModel.prechargeRotatePoint.z * gunType.modelScale + gunModel.leftArmReloadingChargePos.z);
					GL11.glRotatef(gunModel.leftArmReloadingChargeRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.leftArmReloadingChargeRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.leftArmReloadingChargeRot.z, 0F, 0F, 1F);
				}
				else //doing no animation, keep in holding position
				{
					/** for test 
					addTestTranslate(1F);
					addTestRotate();
					/** for test */
					//if no attachment to attach our hand, keep it in default position
					if(leftHandAt[0] == -1)
					{
						GL11.glTranslatef(gunModel.leftArmPos.x, gunModel.leftArmPos.y, gunModel.leftArmPos.z);
						GL11.glRotatef(gunModel.leftArmRot.x, 1F, 0F, 0F);
						GL11.glRotatef(gunModel.leftArmRot.y, 0F, 1F, 0F);
						GL11.glRotatef(gunModel.leftArmRot.z, 0F, 0F, 1F);
					}
					else //hand on an attachment, move our hand to its position
					{
						for(int i = 0; ; ) if(leftHandAt[++i] == -1)
							{
								GunType.getPosOfAttachableAt(atPos.resetAtTag(gunStack.stackTagCompound, gunType), leftHandAt, i);
								break;
							}
						GL11.glTranslatef(atPos.x, atPos.y, atPos.z);
						GL11.glRotatef(atPos.rotX, 1F, 0F, 0F);
						TwoVector3f itsPose = gunModel.leftArmPose.get((attachmentType = AttachmentType.getAtType(atPos.atTag)).leftHandPose);
						if(itsPose == null) //no gun guide pose, use default position required by attachment model
						{
							GL11.glTranslatef(attachmentType.model.armTranslate.x, attachmentType.model.armTranslate.y, 
									attachmentType.model.armTranslate.z);
							GL11.glRotatef(attachmentType.model.armRotate.x, 1F, 0F, 0F);
							GL11.glRotatef(attachmentType.model.armRotate.y, 0F, 1F, 0F);
							GL11.glRotatef(attachmentType.model.armRotate.z, 0F, 0F, 1F);
						}
						else
						{
							GL11.glTranslatef(attachmentType.model.armTranslate.x + itsPose.x1, 
									  attachmentType.model.armTranslate.y + itsPose.y1, 
									  attachmentType.model.armTranslate.z + itsPose.z1);
							GL11.glRotatef(attachmentType.model.armRotate.x + itsPose.x2, 1F, 0F, 0F);
							GL11.glRotatef(attachmentType.model.armRotate.y + itsPose.y2, 0F, 1F, 0F);
							GL11.glRotatef(attachmentType.model.armRotate.z + itsPose.z2, 0F, 0F, 1F);
						}
					}
				}
				//render arm!
				GL11.glScalef(gunModel.leftArmScale.x, gunModel.leftArmScale.y, gunModel.leftArmScale.z);
				if(gunType.leftArmTexture == null) renderEngine.bindTexture(mc.thePlayer.getLocationSkin());
				else renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(gunType.leftArmTexture));
				leftArm.render(f);
			}
			GL11.glPopMatrix();
		}
		if(rightArm != null) //right arm
		{
			GL11.glPushMatrix();
			{
				if(gunModel.rightHandAmmo && (FlansModClient.operatingState == GunOperation.UNLOAD_MAG || FlansModClient.operatingState == GunOperation.LOAD_MAG))
				{
					GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.magTranslate.x * actualOperateProgress, gunModel.magAttachPoint.y + gunModel.magTranslate.y * actualOperateProgress, gunModel.magAttachPoint.z - gunModel.magTranslate.z * actualOperateProgress);
					GL11.glRotatef(gunModel.magAttachRotate.x + -gunModel.magRotate.x * actualOperateProgress, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.y + -gunModel.magRotate.y * actualOperateProgress, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.magRotate.z * actualOperateProgress, 0F, 0F, 1F);
					GL11.glTranslatef(-gunModel.magAttachPoint.x + gunModel.rightArmAmmoPos.x, -gunModel.magAttachPoint.y + gunModel.rightArmAmmoPos.y, -gunModel.magAttachPoint.z + gunModel.rightArmAmmoPos.z);
					GL11.glRotatef(gunModel.rightArmAmmoRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.rightArmAmmoRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.rightArmAmmoRot.z, 0F, 0F, 1F);
				} //else if is checking ammo
				else if(gunModel.rightHandAmmo && FlansModClient.operatingState == GunOperation.CHECK_AMMO && actualOperateProgress > gunModel.checkAmmoTiltTimeRatio)
				{
					//if gunModel.checkAmmoMagTimeRatio == 0, there is no secondary animation
					if(gunModel.checkAmmoMagTimeRatio == 0F)
					{
						tempFloat = (actualOperateProgress - gunModel.checkAmmoTiltTimeRatio) / (gunModel.checkAmmoEndTime - gunModel.checkAmmoTiltTimeRatio);
						GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x * tempFloat, gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y * tempFloat, gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z * tempFloat);
						GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x * tempFloat, 1F, 0F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y * tempFloat, 0F, 1F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z * tempFloat, 0F, 0F, 1F);
						GL11.glTranslatef(-gunModel.magAttachPoint.x, -gunModel.magAttachPoint.y, -gunModel.magAttachPoint.z);
					}
					else if(actualOperateProgress < gunModel.checkAmmoMagTimeRatio)
					{
						tempFloat = (actualOperateProgress - gunModel.checkAmmoTiltTimeRatio) / (gunModel.checkAmmoMagTimeRatio - gunModel.checkAmmoTiltTimeRatio);
						GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x * tempFloat, gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y * tempFloat, gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z * tempFloat);
						GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x * tempFloat, 1F, 0F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y * tempFloat, 0F, 1F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z * tempFloat, 0F, 0F, 1F);
						GL11.glTranslatef(-gunModel.magAttachPoint.x, -gunModel.magAttachPoint.y, -gunModel.magAttachPoint.z);
					}
					else if(actualOperateProgress < gunModel.checkAmmoEndTime)//in second step of mag animation
					{
						tempFloat = (actualOperateProgress - gunModel.checkAmmoMagTimeRatio) / (gunModel.checkAmmoEndTime - gunModel.checkAmmoMagTimeRatio);
						GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x + gunModel.checkAmmoMagTranslate2.x * tempFloat, gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y + gunModel.checkAmmoMagTranslate2.y * tempFloat, gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z + gunModel.checkAmmoMagTranslate2.z * tempFloat);
						GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x + gunModel.checkAmmoMagRotate2.x * tempFloat, 1F, 0F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y + gunModel.checkAmmoMagRotate2.y * tempFloat, 0F, 1F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z + gunModel.checkAmmoMagRotate2.z * tempFloat, 0F, 0F, 1F);
						GL11.glTranslatef(-gunModel.magAttachPoint.x, -gunModel.magAttachPoint.y, -gunModel.magAttachPoint.z);
					}
					else //in end time, keep it in position
					{
						GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x + gunModel.checkAmmoMagTranslate2.x, gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y + gunModel.checkAmmoMagTranslate2.y, gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z + gunModel.checkAmmoMagTranslate2.z);
						GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x + gunModel.checkAmmoMagRotate2.x, 1F, 0F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y + gunModel.checkAmmoMagRotate2.y, 0F, 1F, 0F);
						GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z + gunModel.checkAmmoMagRotate2.z, 0F, 0F, 1F);
						GL11.glTranslatef(-gunModel.magAttachPoint.x, -gunModel.magAttachPoint.y, -gunModel.magAttachPoint.z);
					}
					//apply default arm translation and rotation here to avoid repeat codes
					GL11.glTranslatef(gunModel.rightArmAmmoPos.x, gunModel.rightArmAmmoPos.y, gunModel.rightArmAmmoPos.z);
					GL11.glRotatef(gunModel.rightArmAmmoRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.rightArmAmmoRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.rightArmAmmoRot.z, 0F, 0F, 1F);
				}
				else if(gunModel.rightHandCheckChamber && FlansModClient.operatingState == GunOperation.CHECK_CHAMBER && actualOperateProgress > gunModel.checkChamberTiltTimeRatio)
				{
					GL11.glTranslatef((actualChargeDistance + actualPreChargeDistance + gunModel.prechargeRotatePoint.x) * gunType.modelScale, gunModel.prechargeRotatePoint.y * gunType.modelScale, gunModel.prechargeRotatePoint.z * gunType.modelScale);
					GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
					GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
					GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
					GL11.glTranslatef(-gunModel.prechargeRotatePoint.x * gunType.modelScale + gunModel.rightHandCheckChamberPos.x, -gunModel.prechargeRotatePoint.y * gunType.modelScale + gunModel.rightHandCheckChamberPos.y, -gunModel.prechargeRotatePoint.z * gunType.modelScale + gunModel.rightHandCheckChamberPos.z);
					GL11.glRotatef(gunModel.rightHandCheckChamberRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.rightHandCheckChamberRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.rightHandCheckChamberRot.z, 0F, 0F, 1F);
				}
				else if(gunModel.rightHandRelease && FlansModClient.reloadingStep == -1 && FlansModClient.operatingState == GunOperation.RELEASE_BOLT)
				{
					GL11.glTranslatef(gunModel.rightArmReleasePos.x, gunModel.rightArmReleasePos.y, gunModel.rightArmReleasePos.z);
					GL11.glRotatef(gunModel.rightArmReleaseRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.rightArmReleaseRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.rightArmReleaseRot.z, 0F, 0F, 1F);
				}
				else if(gunModel.rightHandReloadingRelease && FlansModClient.reloadingStep != -1 && FlansModClient.operatingState == GunOperation.RELEASE_BOLT)
				{
					GL11.glTranslatef(gunModel.rightArmReloadingReleasePos.x, gunModel.rightArmReloadingReleasePos.y, gunModel.rightArmReloadingReleasePos.z);
					GL11.glRotatef(gunModel.rightArmReloadingReleaseRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.rightArmReloadingReleaseRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.rightArmReloadingReleaseRot.z, 0F, 0F, 1F);
				}
				else if(gunModel.rightHandCharge && FlansModClient.reloadingStep == -1 && FlansModClient.operatingState == GunOperation.CHARGE)
				{
					GL11.glTranslatef((actualChargeDistance + actualPreChargeDistance + gunModel.prechargeRotatePoint.x) * gunType.modelScale, gunModel.prechargeRotatePoint.y * gunType.modelScale, gunModel.prechargeRotatePoint.z * gunType.modelScale);
					GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
					GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
					GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
					GL11.glTranslatef(-gunModel.prechargeRotatePoint.x * gunType.modelScale + gunModel.rightArmChargePos.x, -gunModel.prechargeRotatePoint.y * gunType.modelScale + gunModel.rightArmChargePos.y, -gunModel.prechargeRotatePoint.z * gunType.modelScale + gunModel.rightArmChargePos.z);
					GL11.glRotatef(gunModel.rightArmChargeRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.rightArmChargeRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.rightArmChargeRot.z, 0F, 0F, 1F);
				}
				else if(gunModel.rightHandReloadingCharge && FlansModClient.reloadingStep != -1 && FlansModClient.operatingState == GunOperation.CHARGE)
				{
					GL11.glTranslatef((actualChargeDistance + actualPreChargeDistance + gunModel.prechargeRotatePoint.x) * gunType.modelScale, gunModel.prechargeRotatePoint.y * gunType.modelScale, gunModel.prechargeRotatePoint.z * gunType.modelScale);
					GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
					GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
					GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
					GL11.glTranslatef(-gunModel.prechargeRotatePoint.x * gunType.modelScale + gunModel.rightArmReloadingChargePos.x, -gunModel.prechargeRotatePoint.y * gunType.modelScale + gunModel.rightArmReloadingChargePos.y, -gunModel.prechargeRotatePoint.z * gunType.modelScale + gunModel.rightArmReloadingChargePos.z);
					GL11.glRotatef(gunModel.rightArmReloadingChargeRot.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.rightArmReloadingChargeRot.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.rightArmReloadingChargeRot.z, 0F, 0F, 1F);
				}
				else
				{	//if no attachment to attach our hand, keep it in default position
					if(rightHandAt[0] == -1)
					{
						GL11.glTranslatef(gunModel.rightArmPos.x, gunModel.rightArmPos.y, gunModel.rightArmPos.z);
						GL11.glRotatef(gunModel.rightArmRot.x, 1F, 0F, 0F);
						GL11.glRotatef(gunModel.rightArmRot.y, 0F, 1F, 0F);
						GL11.glRotatef(gunModel.rightArmRot.z, 0F, 0F, 1F);
					}
					else //hand on an attachment, move our hand to its position
					{
						for(int i = 0; ; )
						{
							if(rightHandAt[++i] == -1)
							{
								GunType.getPosOfAttachableAt(atPos.resetAtTag(gunStack.stackTagCompound, gunType), rightHandAt, i);
								break;
							}
						}
						GL11.glTranslatef(atPos.x, atPos.y, atPos.z);
						GL11.glRotatef(atPos.rotX, 1F, 0F, 0F);
						TwoVector3f itsPose = gunModel.rightArmPose.get((attachmentType = AttachmentType.getAtType(atPos.atTag)).rightHandPose);
						if(itsPose == null) //no gun guide pose, use default position required by attachment model
						{
							GL11.glTranslatef(attachmentType.model.armTranslate.x, attachmentType.model.armTranslate.y, 
									attachmentType.model.armTranslate.z);
							GL11.glRotatef(attachmentType.model.armRotate.x, 1F, 0F, 0F);
							GL11.glRotatef(attachmentType.model.armRotate.y, 0F, 1F, 0F);
							GL11.glRotatef(attachmentType.model.armRotate.z, 0F, 0F, 1F);
						}
						else
						{
							GL11.glTranslatef(attachmentType.model.armTranslate.x + itsPose.x1, 
											  attachmentType.model.armTranslate.y + itsPose.y1, 
											  attachmentType.model.armTranslate.z + itsPose.z1);
							GL11.glRotatef(attachmentType.model.armRotate.x + itsPose.x2, 1F, 0F, 0F);
							GL11.glRotatef(attachmentType.model.armRotate.y + itsPose.y2, 0F, 1F, 0F);
							GL11.glRotatef(attachmentType.model.armRotate.z + itsPose.z2, 0F, 0F, 1F);
						}
					}
				}
				
				//render arm!
				GL11.glScalef(gunModel.rightArmScale.x, gunModel.rightArmScale.y, gunModel.rightArmScale.z);
				if(gunType.rightArmTexture == null) renderEngine.bindTexture(mc.thePlayer.getLocationSkin());
				else renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(gunType.rightArmTexture));
				rightArm.render(f);
			}
			GL11.glPopMatrix();
		}
	}
	
	private static boolean renderMagInGun_FP() // return true if currently no mag in gun
	{
		NBTTagCompound magTag = GunType.getMagTag(gunStack); // Get Magazine
		int[] magIdDam = GunType.getMagIdDam(magTag);
		GunType magType = GunType.getMagType(magIdDam);
		if(magType == null) return true;
		GL11.glPushMatrix();
		{
			if(FlansModClient.operatingState == GunOperation.UNLOAD_MAG) //if is pulling out mag
			{
				GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.magTranslate.x * actualOperateProgress, 
						gunModel.magAttachPoint.y + gunModel.magTranslate.y * actualOperateProgress, gunModel.magAttachPoint.z + gunModel.magTranslate.z * actualOperateProgress);
				GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.magRotate.x * actualOperateProgress, 1F, 0F, 0F);
				GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.magRotate.y * actualOperateProgress, 0F, 1F, 0F);
				GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.magRotate.z * actualOperateProgress, 0F, 0F, 1F);
			} //else if is checking ammo
			else if(FlansModClient.operatingState == GunOperation.CHECK_AMMO && actualOperateProgress > gunModel.checkAmmoTiltTimeRatio)
			{
				if(gunModel.checkAmmoMagTimeRatio == 0F)
				{
					tempFloat = (actualOperateProgress - gunModel.checkAmmoTiltTimeRatio) / (gunModel.checkAmmoEndTime - gunModel.checkAmmoTiltTimeRatio);
					GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x * tempFloat, 
							gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y * tempFloat, gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z * tempFloat);
					GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x * tempFloat, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y * tempFloat, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z * tempFloat, 0F, 0F, 1F);
				}
				else if(actualOperateProgress < gunModel.checkAmmoMagTimeRatio)
				{
					tempFloat = (actualOperateProgress - gunModel.checkAmmoTiltTimeRatio) / (gunModel.checkAmmoMagTimeRatio - gunModel.checkAmmoTiltTimeRatio);
					GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x * tempFloat, 
							gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y * tempFloat, gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z * tempFloat);
					GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x * tempFloat, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y * tempFloat, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z * tempFloat, 0F, 0F, 1F);
				}
				else if(actualOperateProgress < gunModel.checkAmmoEndTime)//in second step of mag animation
				{
					tempFloat = (actualOperateProgress - gunModel.checkAmmoMagTimeRatio) / (gunModel.checkAmmoEndTime - gunModel.checkAmmoMagTimeRatio);
					GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x + gunModel.checkAmmoMagTranslate2.x * tempFloat, 
							gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y + gunModel.checkAmmoMagTranslate2.y * tempFloat, 
							gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z + gunModel.checkAmmoMagTranslate2.z * tempFloat);
					GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x + gunModel.checkAmmoMagRotate2.x * tempFloat, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y + gunModel.checkAmmoMagRotate2.y * tempFloat, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z + gunModel.checkAmmoMagRotate2.z * tempFloat, 0F, 0F, 1F);
				}
				else //in end time, keep it in position
				{
					GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.checkAmmoMagTranslate.x + gunModel.checkAmmoMagTranslate2.x, 
							gunModel.magAttachPoint.y + gunModel.checkAmmoMagTranslate.y + gunModel.checkAmmoMagTranslate2.y, 
							gunModel.magAttachPoint.z + gunModel.checkAmmoMagTranslate.z + gunModel.checkAmmoMagTranslate2.z);
					GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.checkAmmoMagRotate.x + gunModel.checkAmmoMagRotate2.x, 1F, 0F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.checkAmmoMagRotate.y + gunModel.checkAmmoMagRotate2.y, 0F, 1F, 0F);
					GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.checkAmmoMagRotate.z + gunModel.checkAmmoMagRotate2.z, 0F, 0F, 1F);
				}
			}
			else //doing nothing but holding it
			{
				GL11.glTranslatef(gunModel.magAttachPoint.x, gunModel.magAttachPoint.y, gunModel.magAttachPoint.z);
				GL11.glRotatef(gunModel.magAttachRotate.x, 1F, 0F, 0F);
				GL11.glRotatef(gunModel.magAttachRotate.y, 0F, 1F, 0F);
				GL11.glRotatef(gunModel.magAttachRotate.z, 0F, 0F, 1F);
			}
			//render the bullets before we render the mag
			renderBulletInMag(magType, magTag, GunType.getMagIdDam(magTag));
			renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(magType.getTex((short)GunType.getMagDamage(magIdDam))));
			GL11.glScalef(magType.modelScale, magType.modelScale, magType.modelScale);
			magType.model.renderGun(f); //render mag
		}
		GL11.glPopMatrix();
		return false;
	}
	
	private static void renderLoadingMag_FP()
	{
		if(FlansModClient.loadingMagStack == null || FlansModClient.operatingState != GunOperation.LOAD_MAG) return;
		GunType magType = ((ItemGun)FlansModClient.loadingMagStack.getItem()).type;
		GL11.glPushMatrix();
		{
			//for animations
			GL11.glTranslatef(gunModel.magAttachPoint.x + gunModel.magTranslate.x * actualOperateProgress, gunModel.magAttachPoint.y + gunModel.magTranslate.y * actualOperateProgress, gunModel.magAttachPoint.z + gunModel.magTranslate.z * actualOperateProgress);
			
			GL11.glRotatef(gunModel.magAttachRotate.x + gunModel.magRotate.x * actualOperateProgress, 1F, 0F, 0F);
			GL11.glRotatef(gunModel.magAttachRotate.y + gunModel.magRotate.y * actualOperateProgress, 0F, 1F, 0F);
			GL11.glRotatef(gunModel.magAttachRotate.z + gunModel.magRotate.z * actualOperateProgress, 0F, 0F, 1F);
			renderBulletInMag(magType, FlansModClient.loadingMagStack);
			renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(magType.getTex((short)FlansModClient.loadingMagStack.getItemDamage())));
			GL11.glScalef(magType.modelScale, magType.modelScale, magType.modelScale);
			magType.model.renderGun(f);
		}
		GL11.glPopMatrix();
	}
	
	private static void renderAttachments_FP(ModifiableType baseType, NBTTagCompound baseTag, int nextAt)
	{
		NBTTagList prList = GunType.getPRList(baseTag), prTag;
		NBTTagCompound atTag;
		AttachmentType atType;
		Vector3f vec;
		float rotX = rotateAngle;
		for(byte i = (byte)prList.tagCount(), j; (currentAt[nextAt] = --i) >= 0; )
		{
			for(j = (byte)(prTag = GunType.getTagListFromTagList(prList, i)).tagCount(); (currentAt[nextAt + 1] = --j) >= 0; )
			{
				GL11.glPushMatrix();
				{
					GL11.glTranslatef((vec = baseType.slots[i].attachPos).x + AttachmentType.getPos(atTag = prTag.getCompoundTagAt(j)), vec.y, vec.z);
					rotateAngle += tempFloat = baseType.slots[i].attachRot; //TODO
					GL11.glRotatef(tempFloat, 1F, 0F, 0F);
					switch((atType = AttachmentType.getAtType(atTag)).itsType)
					{
						case ItsType.BOLT:
							GL11.glTranslatef(tempFloat = actualSlideDistance * gunType.modelScale, 0F, 0F);
							if(onScopeLayerRendering == -1) applyTransForSightsOnBolt(currentAt, nextAt + 2, tempFloat); //TODO
							break;
						case ItsType.CHARGING_HANDLE:
							GL11.glTranslatef(actualChargeDistance * gunType.modelScale, 0F, 0F);
							break;
						case ItsType.ALT_CHARGE_HANDLE: //TODO: model-scale
							GL11.glTranslatef((actualPreChargeDistance + (vec = gunModel.prechargeRotatePoint).x) * gunType.modelScale, vec.y * gunType.modelScale, vec.z * gunType.modelScale);
							GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
							GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
							GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
							GL11.glTranslatef(-vec.x * gunType.modelScale, -vec.y * gunType.modelScale, -vec.z * gunType.modelScale);
							break;
						case ItsType.PISTON:
							GL11.glTranslatef(-actualSlideProgress * gunModel.altgunSlideDistance * gunType.modelScale, 0F, 0F);
						default:;
					}
					renderAttachments_FP(atType, atTag, nextAt + 2); //render ats on this at
					renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(atType.getPaintjob(atTag)));
					GL11.glScalef(atType.modelScale, atType.modelScale, atType.modelScale);
					updateAtStates(AttachmentType.getStates(atTag));
					atType.model.render(f);
					if(atType.isFlashlight && lightOn && atType.lightModel != null)
						renderStaticGlowOnModel(atType.lightModel); //if it is a flash light, check if we need to render light model
					if(atType.isLaserPointer && laserOn && atType.laserModelFP != null)
					{	//if it is a laser pointer, check if we need to render laser
						GL11.glPushMatrix();
						{
							GL11.glTranslatef((vec = atType.model.laserFrom).x, vec.y, vec.z);
							if(onScopeLayerRendering >= 0)
							{
								GL11.glRotatef((tempSightCoors = getSightCoorByScopeTexRendering()).rotateAngle * adsSwitch - rotateAngle, 1F, 0F, 0F);
								GL11.glRotatef(-barrelRotYawRight, 0F, 1F, 0F);
								GL11.glRotatef(-barrelRotPitchRight, 0F, 0F, 1F);
							}
							renderStaticGlowOnModel(atType.laserModelFP);
						}
						GL11.glPopMatrix();
					}
					switch(atType.itsType)
					{
						case ItsType.MUZZLE:
						case ItsType.BARREL:
							if(!renderFlash) break;
							renderFlash = false;
							GL11.glTranslatef((vec = atType.model.muzzleFlashPoint).x, vec.y, vec.z);
							if(atType.model.flashFreeRotate) GL11.glRotatef(animations.flashRotate, 1F, 0F, 0F);
							renderEngine.bindTexture(FlansModResourceHandler.getnumedTexture(flashTexture, animations.flashNum));
							GL11.glScalef(tempFloat = flashScale / atType.modelScale, tempFloat, tempFloat);
							GL11.glColor4f(1F, 1F, 1F, animations.lastFlashAlpha + (animations.flashAlpha - animations.lastFlashAlpha) * smoothing);
							renderStaticGlowOnModel(flashModel);
							GL11.glColor4f(1F, 1F, 1F, 1F);
							break;
						case ItsType.SIGHT:
							if(atType.scopeGlassModel == null) break; //check if needed to render scope glass
							ModelAtSight sightModel = (ModelAtSight)atType.model;
							if((tempSightCoors = getSightCoor(currentAt, nextAt + 2)).scopeGlassTexIndex < 0) //if not got its glass texture, render glass in black
							{
								GL11.glTranslatef((vec = sightModel.pupilRefCenter).x, vec.y, vec.z);
								renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture("DefaultBlack"));
								GL11.glScalef((vec = sightModel.scopeGlassModelScale).x, vec.y, vec.z);
								atType.scopeGlassModel.render(f);
								break;
							}
							GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS); //is scope on use and right time to render, render glass
							{
								GL11.glTranslatef((vec = sightModel.pupilRefCenter).x, vec.y, vec.z);
								GL11.glColor3f(tempSightCoors.alpha, tempSightCoors.alpha, tempSightCoors.alpha);
								net.minecraft.client.renderer.RenderHelper.disableStandardItemLighting();
								ModelGun.glowOnStatic(); // ready to render scope glass
								GL11.glBindTexture(GL11.GL_TEXTURE_2D, scopeGlassTexture[tempSightCoors.scopeGlassTexIndex]);
								GL11.glScalef((vec = sightModel.scopeGlassModelScale).x, vec.y, vec.z);
								atType.scopeGlassModel.render(f);
								ModelGun.glowOff();
							}
							GL11.glPopAttrib();
						default: ;
					}
					if(atType.leftHandPriority > leftHandAt[leftHandAt.length - 1]) //check if our left hand should hold on this attachment
					{
						setLeftHandAt(currentAt, nextAt + 2);
						leftHandAt[leftHandAt.length - 1] = atType.leftHandPriority;
					}
					if(atType.rightHandPriority > rightHandAt[rightHandAt.length - 1])
					{
						setRightHandAt(currentAt, nextAt + 2);
						rightHandAt[rightHandAt.length - 1] = atType.rightHandPriority;
					}
					rotateAngle = rotX;
				}
				GL11.glPopMatrix();
			}
		}
	}
	
	public static void applyTransForSightsOnBolt(byte[] boltAt, int length, float transAmount)
	{
		for(int i = 0; i < allSightsCoors.length && allSightsCoors[i].ownerTag != null; ++i)
			allSightsCoors[i].applyBoltTrans(boltAt, length, transAmount);
	}
	
	/** method used to set charge progress, return whether side is locked */
	public static boolean setChargeProgress(float itsProgress)
	{
		//still doing pre-charging
		if(itsProgress < gunModel.prechargeTime)
		{
			actualChargeDistance = 0F;
			float multiplier = itsProgress / gunModel.prechargeTime;
			actualSlideDistance = actualPreChargeDistance = -gunModel.prechargeDistance * multiplier;
			actualPreChargeRotate.x = gunModel.prechargeRotate.x * multiplier;
			actualPreChargeRotate.y = gunModel.prechargeRotate.y * multiplier;
			actualPreChargeRotate.z = gunModel.prechargeRotate.z * multiplier;
		}
		else //pre-charge is done
		{
			actualChargeDistance = -gunModel.chargeHandleDistance * (itsProgress - gunModel.prechargeTime) / (1F - gunModel.prechargeTime);
			actualPreChargeDistance = -gunModel.prechargeDistance;
			actualPreChargeRotate.x = gunModel.prechargeRotate.x;
			actualPreChargeRotate.y = gunModel.prechargeRotate.y;
			actualPreChargeRotate.z = gunModel.prechargeRotate.z;
			actualSlideDistance = actualChargeDistance + actualPreChargeDistance;
		}
		
		//if slide is locked and slide distance not reaching the lock on distance, keep it on lock
		if((animations.preLockSlideTime >= 0 && (animations.preLockSlideTime > 0 || GunType.getTOF(gunStates, GunTag.BOLT_CATCH_ON))) 
				&& actualSlideDistance < gunModel.slideLockDistance)
		{
			actualSlideDistance = -gunModel.slideLockDistance;
			return true;
		}
		return false;
	}
	
	/** only called when render third person view gun (gun in other players' hands) */
	public static void renderGun()
	{
		actualChargeProgress = animations.lastChargeProgress + (animations.chargeProgress - animations.lastChargeProgress) * smoothing;
		actualSlideProgress = animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing;
		
		// Make sure we actually have the renderEngine
		//if(renderEngine == null) renderEngine = mc.renderEngine;
		
		//when charging the gun, we don't care about whether slide is still moving
		if(animations.chargeStage != 0F) slideLock = setChargeProgress(actualChargeProgress);
		else if(animations.checkChamberStage != 0F && actualChargeProgress > gunModel.checkChamberTiltTimeRatio) //checking chamber
		{
			setChargeProgress(actualChargeProgress <= gunModel.checkChamberChargeTimeRatio
							  ? (actualChargeProgress - gunModel.checkChamberTiltTimeRatio) / (gunModel.checkChamberChargeTimeRatio - gunModel.checkChamberTiltTimeRatio) * gunModel.checkChamberChargeRatio
							  : gunModel.checkChamberChargeRatio);
			slideLock = false;
		}
		else //not charging
		{	//set all charge animation values to be zero
			actualChargeDistance = actualPreChargeDistance = actualPreChargeRotate.x = actualPreChargeRotate.y = actualPreChargeRotate.z = 0F;
			actualSlideDistance = -actualSlideProgress * gunModel.gunSlideDistance;
			//if slide is locked, see if we need to keep it in lock position
			if(animations.preLockSlideTime >= 0 && (animations.preLockSlideTime > 0 || GunType.getTOF(gunStates, GunTag.BOLT_CATCH_ON)))
			{
				slideLock = true;
				if(animations.lastGunSlide >= animations.gunSlide && -actualSlideDistance < gunModel.slideLockDistance)
					actualSlideDistance = -gunModel.slideLockDistance;
			}
			else slideLock = false;
		}
		
		GL11.glPushMatrix();
		{
			GL11.glTranslatef(actualSlideDistance * gunType.modelScale, 0F, 0F);
			renderBulletInMag(gunType, gunStack);
		}
		GL11.glPopMatrix();
		
		//render the gun part
		GL11.glPushMatrix();
		{
			//bind gun texture
			renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(gunType.getTex((short)gunStack.getItemDamage())));
			
			GL11.glScalef(gunType.modelScale, gunType.modelScale, gunType.modelScale);
			//render gun body
			gunModel.renderGun(f);
			//render light stuff on gun body
			ModelGun.glowOn();
			gunModel.renderLightStuff(f);
			ModelGun.glowOff();
			
			fireModeNum = GunType.getFireModeNum(gunStates);
			gunModel.renderSwitch(fireModeNum, f);
			gunModel.renderBoltCatchButton(slideLock, f);
			
			/*if(GunType.getSecondaryFire(gunStack))
			{
				actualChargeDistance = actualPreChargeDistance = actualPreChargeRotate.x = actualPreChargeRotate.y = actualPreChargeRotate.z = actualSlideDistance = 0F;
				gunModel.renderSlide(f); //render static slide and pump(charge handle)
				gunModel.renderaltSlide(f);
				ModelGun.glowOn();
				gunModel.renderSlideLightStuff(f);
				ModelGun.glowOff();
				gunModel.renderPump(f); //pump
				gunModel.renderPump2(f);
			}
			else*/
			{	//we've got animation values we need to render pump and slide, then render it
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(actualSlideDistance, 0F, 0F);
					//render slide
					gunModel.renderSlide(f);
				}
				GL11.glPopMatrix();
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(-actualSlideProgress * gunModel.altgunSlideDistance, 0F, 0F);
					gunModel.renderaltSlide(f); //render altSlide
				}
				GL11.glPopMatrix();
				GL11.glPushMatrix(); //pump part
				{
					GL11.glTranslatef(actualChargeDistance, 0F, 0F);
					gunModel.renderPump(f);
					GL11.glTranslatef(actualPreChargeDistance + gunModel.prechargeRotatePoint.x, gunModel.prechargeRotatePoint.y, gunModel.prechargeRotatePoint.z);
					GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
					GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
					GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
					GL11.glTranslatef(-gunModel.prechargeRotatePoint.x, -gunModel.prechargeRotatePoint.y, -gunModel.prechargeRotatePoint.z);
					gunModel.renderPump2(f);
				}
				GL11.glPopMatrix();
			}
		}
		GL11.glPopMatrix();
		
		if(gunType.itsType != ItsType.MAG) //render magazine if it is needed
		{
			renderMagInGun();
			//has key means one of attachments of this gun requests to use specified flash model
			AttachmentType muzzleType = GunType.getMuzzleType(gunStates);
			if(muzzleType == null || muzzleType.flashModel == null) //use default gun flash model
			{
				flashModel = gunType.flashModel;
				flashTexture = gunType.flashTexture;
			}
			else
			{
				flashModel = muzzleType.flashModel;
				flashTexture = muzzleType.flashTexture == null ? gunType.flashTexture : muzzleType.flashTexture;
			}
			if(flashModel == null) renderFlash = false;
			else
			{
				renderFlash = true;
				flashScale = GunType.getState(gunStates, GunTag.FLASH_SCALE);
			}
			renderAttachments(gunType, gunStack.stackTagCompound, 0);
			if(renderFlash)
			{
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(gunModel.muzzleFlashPoint.x, gunModel.muzzleFlashPoint.y, gunModel.muzzleFlashPoint.z);
					if(gunModel.flashFreeRotate) GL11.glRotatef(animations.flashRotate, 1F, 0F, 0F);
					renderEngine.bindTexture(FlansModResourceHandler.getnumedTexture(flashTexture, animations.flashNum));
					GL11.glScalef(flashScale, flashScale, flashScale);
					renderStaticGlowOnModel(flashModel);
				}
				GL11.glPopMatrix();
			}
		}
	}
	
	private static void renderMagInGun()
	{
		NBTTagCompound magTag = GunType.getMagTag(gunStack);
		int[] magIdDam = GunType.getMagIdDam(magTag);
		GunType magType;
		if((magType = GunType.getMagType(magIdDam)) == null) return;
		GL11.glPushMatrix();
		{
			GL11.glTranslatef(gunModel.magAttachPoint.x, gunModel.magAttachPoint.y, gunModel.magAttachPoint.z);
			GL11.glRotatef(gunModel.magAttachRotate.x, 1F, 0F, 0F);
			GL11.glRotatef(gunModel.magAttachRotate.y, 0F, 1F, 0F);
			GL11.glRotatef(gunModel.magAttachRotate.z, 0F, 0F, 1F);
			renderBulletInMag(magType, magTag, magIdDam);
			renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(magType.getTex((short)GunType.getMagDamage(magIdDam))));
			GL11.glScalef(magType.modelScale, magType.modelScale, magType.modelScale);
			magType.model.renderGun(f); //render mag
		}
		GL11.glPopMatrix();
	}
	
	/** this is a method to render attachments on attachment, defaultly render in no base scale */
	private static void renderAttachments(ModifiableType baseType, NBTTagCompound baseTag, int nextAt)
	{	//TODO
		NBTTagList prList = GunType.getPRList(baseTag), prTag;
		AttachmentType atType;
		Vector3f vec;
		for(byte i = (byte)prList.tagCount(), j; (currentAt[nextAt] = --i) >= 0; )
		{
			for(j = (byte)(prTag = GunType.getTagListFromTagList(prList, i)).tagCount(); (currentAt[nextAt + 1] = --j) >= 0; )
			{
				GL11.glPushMatrix();
				{
					GL11.glTranslatef((vec = baseType.slots[i].attachPos).x + AttachmentType.getPos(atTag = prTag.getCompoundTagAt(j)), vec.y, vec.z);
					GL11.glRotatef(baseType.slots[i].attachRot, 1F, 0F, 0F);
					switch((atType = AttachmentType.getAtType(atTag)).itsType)
					{
						case ItsType.BOLT:
							GL11.glTranslatef(actualSlideDistance * gunType.modelScale, 0F, 0F);
							break;
						case ItsType.CHARGING_HANDLE:
							GL11.glTranslatef(actualChargeDistance * gunType.modelScale, 0F, 0F);
							break;
						case ItsType.ALT_CHARGE_HANDLE:
							GL11.glTranslatef((actualPreChargeDistance + gunModel.prechargeRotatePoint.x) * gunType.modelScale, gunModel.prechargeRotatePoint.y * gunType.modelScale, gunModel.prechargeRotatePoint.z * gunType.modelScale);
							GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
							GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
							GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
							GL11.glTranslatef(-gunModel.prechargeRotatePoint.x * gunType.modelScale, -gunModel.prechargeRotatePoint.y * gunType.modelScale, -gunModel.prechargeRotatePoint.z * gunType.modelScale);
							break;
						case ItsType.PISTON:
							GL11.glTranslatef(-actualSlideProgress * gunModel.altgunSlideDistance * gunType.modelScale, 0F, 0F);
						default:;
					}
					renderAttachments(atType, atTag, nextAt + 2);
					renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(atType.getPaintjob(atTag)));
					GL11.glScalef(atType.modelScale, atType.modelScale, atType.modelScale);
					updateAtStates(AttachmentType.getStates(atTag));
					atType.model.render(f);
					if(atType.isFlashlight && lightOn && atType.lightModel != null)
						renderStaticGlowOnModel(atType.lightModel);
					if(atType.isLaserPointer && laserOn && atType.laserModel != null)
					{
						GL11.glTranslatef((vec = atType.model.laserFrom).x, vec.y, vec.z);
						renderStaticGlowOnModel(atType.laserModel);
					}
					switch(atType.itsType)
					{
						case ItsType.MUZZLE:
						case ItsType.BARREL:
							if(!renderFlash) break;
							renderFlash = false;
							GL11.glTranslatef((vec = atType.model.muzzleFlashPoint).x, vec.y, vec.z);
							if(atType.model.flashFreeRotate) GL11.glRotatef(animations.flashRotate, 1F, 0F, 0F);
							renderEngine.bindTexture(FlansModResourceHandler.getnumedTexture(flashTexture, animations.flashNum));
							GL11.glScalef(tempFloat = flashScale / atType.modelScale, tempFloat, tempFloat);
							GL11.glColor4f(1F, 1F, 1F, animations.lastFlashAlpha + (animations.flashAlpha - animations.lastFlashAlpha) * smoothing);
							renderStaticGlowOnModel(flashModel);
							GL11.glColor4f(1F, 1F, 1F, 1F);
							break;
						case ItsType.SIGHT:
							if(atType.coatedGlassModel != null) atType.coatedGlassModel.render(f);
							if(atType.scopeGlassModel != null)
							{
								ModelAtSight sightModel = (ModelAtSight)atType.model;
								GL11.glTranslatef((vec = sightModel.pupilRefCenter).x, vec.y, vec.z);
								renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture("DefaultBlack"));
								GL11.glScalef((vec = sightModel.scopeGlassModelScale).x, vec.y, vec.z);
								atType.scopeGlassModel.render(f);
							}
						default:;
					}
				}
				GL11.glPopMatrix();
			}
		}
	}
	
	/** this method is used to render a gun that is being modified, so we don't need most of the animations here */
	public static void renderGunModifying()
	{
		/** for test 
		if(FlansModClient.hbs0 != null) FlansModClient.hbs0.renderHitBoxes(gunType.arrowModel, 0.1F);
		if(FlansModClient.hbs1 != null) FlansModClient.hbs1.renderHitBoxes(gunType.arrowModel, 0.1F);
		/** for test */
		if(gunType.itsType != ItsType.MAG) renderMagInGun();
		renderBulletInMag(gunType, gunStack);
		GL11.glPushMatrix(); //render the gun part
		{	//bind gun texture
			if(FlansModClient.modifyingOn == 0 && FlansModClient.modifyMode == ModifyMode.PAINT)
			{
				if(FlansModClient.atToAddStack != null)
					renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(((ItemPart)FlansModClient.atToAddStack.getItem()).type.shortName));
				else renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(FlansModClient.currentStep >= 0 
						? gunType.getTex(FlansModClient.currentStep) : gunType.getTex((short)gunStack.getItemDamage())));
			}
			else renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(gunType.getTex((short)gunStack.getItemDamage())));
			GL11.glScalef(gunType.modelScale, gunType.modelScale, gunType.modelScale);
			gunModel.renderGun(f); //render gun body
			//render light stuff on gun body
			ModelGun.glowOn();
			gunModel.renderLightStuff(f);
			ModelGun.glowOff();
			gunModel.renderSwitch(fireModeNum = GunType.getFireModeNum(gunStates), f);
			gunModel.renderBoltCatchButton(slideLock = GunType.getTOF(gunStates, GunTag.BOLT_CATCH_ON), f);
			if(GunType.getSecondaryFire(gunStack))
			{
				actualChargeDistance = actualPreChargeDistance = actualPreChargeRotate.x = actualPreChargeRotate.y = actualPreChargeRotate.z = actualSlideDistance = 0F;
				gunModel.renderSlide(f); //render static slide and pump(charge handle)
				gunModel.renderaltSlide(f);
				gunModel.renderPump(f); //pump
				gunModel.renderPump2(f);
			}
			else
			{
				GL11.glPushMatrix();
				{
					if(slideLock) //render slide
					{
						actualSlideDistance = -gunModel.slideLockDistance;
						GL11.glTranslatef(-gunModel.slideLockDistance, 0F, 0F);
					}
					else actualSlideDistance = 0F;
					gunModel.renderSlide(f);
				}
				GL11.glPopMatrix();
				GL11.glPushMatrix(); //altSlide
				{
					GL11.glTranslatef(-actualSlideProgress * gunModel.altgunSlideDistance, 0F, 0F);
					gunModel.renderaltSlide(f);
				}
				GL11.glPopMatrix();
				GL11.glPushMatrix(); //pump or charge handle
				{
					/*if(gunType.getHalfCharged(gunStack)) TODO
					{
						actualChargeDistance = -gunModel.chargeHandleDistance;
						actualPreChargeDistance = -gunModel.prechargeDistance;
						actualPreChargeRotate.x = gunModel.prechargeRotate.x;
						actualPreChargeRotate.y = gunModel.prechargeRotate.y;
						actualPreChargeRotate.z = gunModel.prechargeRotate.z;
						GL11.glTranslatef(actualChargeDistance, 0F, 0F);
						gunModel.renderPump(f);
						GL11.glTranslatef(actualPreChargeDistance + gunModel.prechargeRotatePoint.x, gunModel.prechargeRotatePoint.y, gunModel.prechargeRotatePoint.z);
						GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
						GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
						GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
						GL11.glTranslatef(-gunModel.prechargeRotatePoint.x, -gunModel.prechargeRotatePoint.y, -gunModel.prechargeRotatePoint.z);
						gunModel.renderPump2(f);
					}
					else
					{*/
						actualChargeDistance = actualPreChargeDistance = actualPreChargeRotate.x = actualPreChargeRotate.y = actualPreChargeRotate.z = 0F;
						gunModel.renderPump(f);
						gunModel.renderPump2(f);
					//}
				}
				GL11.glPopMatrix();
			}
		}
		GL11.glPopMatrix();
		renderModifyingAt(gunType, gunStack.stackTagCompound, 0);
	}
	
	private static void renderModifyingAt(ModifiableType baseType, NBTTagCompound baseTag, int nextAt)
	{
		NBTTagList prList = GunType.getPRList(baseTag), prTag;
		NBTTagCompound atTag;
		AttachmentType atType;
		Vector3f vec;
		boolean rightLayer;
		for(byte i = (byte)prList.tagCount(), j; (currentAt[nextAt] = --i) >= 0; )
		{
			if(FlansModClient.modifyingOn == nextAt + 2)
			{
				rightLayer = true;
				for(int k = nextAt; k >= 0; --k) if(FlansModClient.modifying[k] != currentAt[k]) { rightLayer = false; break; }
				if(rightLayer && FlansModClient.modifying[FlansModClient.modifyingOn - 1] == -1) // right layer and no attachment selected, render preview
				{
					GL11.glPushMatrix();
					{
						GL11.glTranslatef((vec = baseType.slots[i].attachPos).x, vec.y, vec.z);
						if(FlansModClient.atToAddStack == null) //render arrow if not attachment to add here
						{
							GL11.glTranslatef(baseType.slots[i].getDisplayTransX(), 0F, 0F);
							GL11.glRotatef(baseType.slots[i].attachRot, 1F, 0F, 0F);
							renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture("DefaultGreen"));
							GL11.glScalef(gunType.modelScale, gunType.modelScale, gunType.modelScale);
							ModelGun.glowOnStatic();
							gunType.arrowModel.render(f); //render arrow!
							ModelGun.glowOff();
						}
						else //render a preview of attachment about to be installed
						{
							AttachmentType previewType = ((ItemAttachment)FlansModClient.atToAddStack.getItem()).type;
							GL11.glTranslatef(FlansModClient.currentPosition, 0F, 0F);
							GL11.glRotatef(baseType.slots[i].attachRot, 1F, 0F, 0F);
							renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(FlansModClient.isValidPosition ? "DefaultGreen" : "DefaultRed"));
							GL11.glScalef(previewType.modelScale, previewType.modelScale, previewType.modelScale);
							ModelGun.glowOnStatic();
							previewType.model.render(f);
							if(previewType.coatedGlassModel != null) previewType.coatedGlassModel.render(f);
							if(previewType.scopeGlassModel != null)
							{
								ModelAtSight sightModel = (ModelAtSight)previewType.model;
								GL11.glTranslatef((vec = sightModel.pupilRefCenter).x, vec.y, vec.z);
								GL11.glScalef((vec = sightModel.scopeGlassModelScale).x, vec.y, vec.z);
								previewType.scopeGlassModel.render(f);
							}
							ModelGun.glowOff();
						}
					}
					GL11.glPopMatrix();
				}
			}
			else rightLayer = false; //not same layer
			for(j = (byte)(prTag = GunType.getTagListFromTagList(prList, i)).tagCount(); (currentAt[nextAt + 1] = --j) >= 0; )
			{
				GL11.glPushMatrix();
				{
					GL11.glTranslatef((vec = baseType.slots[i].attachPos).x, vec.y, vec.z);
					switch((atType = AttachmentType.getAtType(atTag = prTag.getCompoundTagAt(j))).itsType)
					{
						case ItsType.BOLT: GL11.glTranslatef(actualSlideDistance * gunType.modelScale, 0F, 0F); break;
						case ItsType.CHARGING_HANDLE: GL11.glTranslatef(actualChargeDistance * gunType.modelScale, 0F, 0F); break;
						case ItsType.ALT_CHARGE_HANDLE:
							GL11.glTranslatef((actualChargeDistance + actualPreChargeDistance) * gunType.modelScale, 0F, 0F);
							GL11.glRotatef(actualPreChargeRotate.x, 1F, 0F, 0F);
							GL11.glRotatef(actualPreChargeRotate.y, 0F, 1F, 0F);
							GL11.glRotatef(actualPreChargeRotate.z, 0F, 0F, 1F);
						default:; //no piston here
					}
					if(rightLayer && j == FlansModClient.modifying[FlansModClient.modifyingOn - 1]) //if right layer and right attachment, render it in green
					{
						GL11.glTranslatef(FlansModClient.currentPosition, 0F, 0F);
						GL11.glRotatef(baseType.slots[i].attachRot, 1F, 0F, 0F);
						renderModifyingAt(atType, atTag, nextAt + 2); //first render attachments on this attachment
						if(FlansModClient.modifyMode == ModifyMode.PAINT)
						{
							if(FlansModClient.atToAddStack != null)
								renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(((ItemPart)FlansModClient.atToAddStack.getItem()).type.shortName));
							else renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(FlansModClient.currentStep >= 0 
									? atType.getTex(FlansModClient.currentStep) : atType.getPaintjob(atTag)));
						}
						else
						{
							renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(FlansModClient.isValidPosition ? "DefaultGreen" : "DefaultRed"));
							ModelGun.glowOnStatic();
						}
						GL11.glScalef(atType.modelScale, atType.modelScale, atType.modelScale);
						updateAtStates(AttachmentType.getStates(atTag));
						if(FlansModClient.modifyMode != ModifyMode.PAINT)
							atType.model.renderWithoutGlow(f);
						else atType.model.render(f);
						if(atType.isFlashlight && lightOn && atType.lightModel != null)
							atType.lightModel.render(f);
						if(atType.isLaserPointer && laserOn && atType.laserModelFP != null)
						{
							GL11.glTranslatef((vec = atType.model.laserFrom).x, vec.y, vec.z);
							atType.laserModelFP.render(f);
						}
						if(atType.coatedGlassModel != null) atType.coatedGlassModel.render(f);
						if(atType.scopeGlassModel != null)
						{
							if(FlansModClient.modifyMode == ModifyMode.PAINT) renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture("DefaultBlack"));
							ModelAtSight sightModel = (ModelAtSight)atType.model;
							GL11.glTranslatef((vec = sightModel.pupilRefCenter).x, vec.y, vec.z);
							GL11.glScalef((vec = sightModel.scopeGlassModelScale).x, vec.y, vec.z);
							atType.scopeGlassModel.render(f);
						}
						if(FlansModClient.modifyMode != ModifyMode.PAINT) ModelGun.glowOff();
					}
					else //normal attachment to render
					{
						GL11.glTranslatef(AttachmentType.getPos(atTag), 0F, 0F);
						GL11.glRotatef(baseType.slots[i].attachRot, 1F, 0F, 0F);
						renderModifyingAt(atType, atTag, nextAt + 2);
						renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(atType.getPaintjob(atTag)));
						GL11.glScalef(atType.modelScale, atType.modelScale, atType.modelScale);
						updateAtStates(AttachmentType.getStates(atTag));
						atType.model.render(f);
						if(atType.isFlashlight && lightOn && atType.lightModel != null)
							renderStaticGlowOnModel(atType.lightModel);
						if(atType.isLaserPointer && laserOn && atType.laserModelFP != null)
						{
							GL11.glTranslatef((vec = atType.model.laserFrom).x, vec.y, vec.z);
							renderStaticGlowOnModel(atType.laserModelFP);
						}
						if(atType.coatedGlassModel != null) atType.coatedGlassModel.render(f);
						if(atType.scopeGlassModel != null)
						{
							ModelAtSight sightModel = (ModelAtSight)atType.model;
							GL11.glTranslatef((vec = sightModel.pupilRefCenter).x, vec.y, vec.z);
							renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture("DefaultBlack"));
							GL11.glScalef((vec = sightModel.scopeGlassModelScale).x, vec.y, vec.z);
							atType.scopeGlassModel.render(f);
						}
					}
				}
				GL11.glPopMatrix();
			}
		}
	}
	
	/** render bullet in mag and the mag follower */
	private static void renderBulletInMag(GunType magType, NBTTagCompound magTag, int[] magIdDam)
	{ renderBulletInMag(magType, magType.model, GunType.getAmmoArrayFromMag(magTag), magType.getFirstAmmoAt(GunType.getMagNBTTag(magTag)), GunType.getMagDamage(magIdDam)); }
	
	private static void renderBulletInMag(GunType magType, ItemStack magStack)
	{ renderBulletInMag(magType, magType.model, GunType.getAmmoArray(magStack), magType.getFirstAmmoAt(magStack), magStack.getItemDamage()); }
	
	private static void renderBulletInMag(GunType magType, ModelGun magModel, int[] ammoArray, int firstBulletAt, int magDamage)
	{
		if(firstBulletAt >= 0)
		{
	 		ShootableType bulletType; // bullet was found, try to render it
	 		Vector3f[] trans, rot;
	 		int i;
	 		if((firstBulletAt & 1) == 1)
	 		{
	 			if(firstBulletAt - (i = (trans = magModel.bulletAttachPoint2).length) < -1) i = firstBulletAt + 1;
	 			rot = magModel.bulletAttachRotate2;
	 		}
	 		else
	 		{
	 			if(firstBulletAt - (i = (trans = magModel.bulletAttachPoint1).length) < -1) i = firstBulletAt + 1;
	 			rot = magModel.bulletAttachRotate1;
	 		}
			while(--i >= 0)
			{
				if((bulletType = GunType.getAmmoAt(ammoArray, firstBulletAt - i)).bulletModel == null) continue;
				GL11.glPushMatrix();
				{
					//translate the bullet in to right position then rotate it to the right angle
					GL11.glTranslatef(trans[i].x, trans[i].y, trans[i].z);
					//rotate is not necessary so we determine here if we really have to apply rotate
					if(i < rot.length)
					{
						GL11.glRotatef(rot[i].x, 1F, 0F, 0F);
						GL11.glRotatef(rot[i].y, 0F, 1F, 0F);
						GL11.glRotatef(rot[i].z, 0F, 0F, 1F);
					}
					//render it!
					renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(bulletType.bulletTexture));
					GL11.glScalef(bulletType.bulletScale, bulletType.bulletScale, bulletType.bulletScale);
					bulletType.bulletModel.render(f);
				}
				GL11.glPopMatrix();
			}
		}
		//render magazine follower if have
		if(magType.flashModel == null || magModel.magFollowerAttachPos.length < 1) return;
		//here firstBulletAt will be used to repesent num bullets in mag
		if(++firstBulletAt >= magModel.magFollowerAttachPos.length) firstBulletAt = magModel.magFollowerAttachPos.length - 1;
		Vector3f vec;
		GL11.glPushMatrix();
		{
			GL11.glTranslatef((vec = magModel.magFollowerAttachPos[firstBulletAt]).x, vec.y, vec.z);
			if(firstBulletAt < magModel.magFollowerAttachRot.length)
			{
				GL11.glRotatef((vec = magModel.magFollowerAttachRot[firstBulletAt]).x, 1F, 0F, 0F);
				GL11.glRotatef(vec.y, 0F, 1F, 0F);
				GL11.glRotatef(vec.z, 0F, 0F, 1F);
			}
			
			if(magType.flashTexture == null) //render it!
				renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(magType.getTex((short)magDamage)));
			else renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(magType.flashTexture));
			GL11.glScalef(magType.muzzleFlashScale, magType.muzzleFlashScale, magType.muzzleFlashScale);
			magType.flashModel.render(f);
		}
		GL11.glPopMatrix();
	}
	
	private static void setLeftHandAt(byte[] currentAt, int length)
	{
		leftHandAt[length] = -1;
		while(--length >= 0) leftHandAt[length] = currentAt[length];
	}
	
	private static void setRightHandAt(byte[] currentAt, int length)
	{
		rightHandAt[length] = -1;
		while(--length >= 0) rightHandAt[length] = currentAt[length];
	}
	
	private static void renderGlowOnModel(ModelDefault target)
	{
		ModelGun.glowOn();
		target.render(f);
		ModelGun.glowOff();
	}
	
	private static void renderStaticGlowOnModel(ModelDefault target)
	{
		GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
		{
			net.minecraft.client.renderer.RenderHelper.disableStandardItemLighting();
			ModelGun.glowOnStatic();
			target.render(f);
			ModelGun.glowOff();
		}
		GL11.glPopAttrib();
	}
	
	/** for test 
	public static void addTestTranslate(float scale)
	{ GL11.glTranslatef(FlansModClient.testFloat[3] / 16F * scale, FlansModClient.testFloat[4] / 16F * scale, FlansModClient.testFloat[5] / 16F * scale); }
	
	public static void addTestRotate()
	{
		GL11.glRotatef(FlansModClient.testFloat[0], 1F, 0F, 0F);
		GL11.glRotatef(FlansModClient.testFloat[1], 0F, 1F, 0F);
		GL11.glRotatef(FlansModClient.testFloat[2], 0F, 0F, 1F);
	}
	/** for test */
}

/** for test 
if(gunType.arrowModel != null)
{
	standardizeCoorSystemFor(tempPointingVectors);
	standardizeCoorSystemFor(subCoorSystem);
	subCoorSystemOri.set(0,0,0);
	resetTestVectors();
	GL11.glPushMatrix();
	{
		for(int i = 0; ; ++i)
		{
			if(i == 3 || testTransVector[i] == null)
			{
				applyxyzTransFor(subCoorSystemOri, FlansModClient.testFloat[3] / 16F, FlansModClient.testFloat[4] / 16F, FlansModClient.testFloat[5] / 16F);
				GL11.glTranslatef(FlansModClient.testFloat[3] / 16F, FlansModClient.testFloat[4] / 16F, FlansModClient.testFloat[5] / 16F);
				applyzyxRotForTempVectors(FlansModClient.testFloat[0], FlansModClient.testFloat[1], FlansModClient.testFloat[2]);
				setTempVectorsAsNewSubCoorSys();
				addTestRotate();
				break;
			}
			applyxyzTransFor(subCoorSystemOri, testTransVector[i].x / 16F, testTransVector[i].y / 16F, testTransVector[i].z / 16F);
			GL11.glTranslatef(testTransVector[i].x / 16F, testTransVector[i].y / 16F, testTransVector[i].z / 16F);
			applyzyxRotForTempVectors(testRotsVector[i].x, testRotsVector[i].y, testRotsVector[i].z);
			setTempVectorsAsNewSubCoorSys();
			GL11.glRotatef(testRotsVector[i].x, 1F, 0F, 0F);
			GL11.glRotatef(testRotsVector[i].y, 0F, 1F, 0F);
			GL11.glRotatef(testRotsVector[i].z, 0F, 0F, 1F);
		}
		gunModel.renderGun(f);
	}
	GL11.glPopMatrix();
}
transVecFromSubToMainCoorSys(testVector[0], testVector[0]);
transVecFromSubToMainCoorSys(testVector[1], testVector[1]);
transVecFromSubToMainCoorSys(testVector[2], testVector[2]);
testVector[0].set(testVector[0].x + subCoorSystemOri.x, testVector[0].y + subCoorSystemOri.y, testVector[0].z + subCoorSystemOri.z);
testVector[1].set(testVector[1].x + subCoorSystemOri.x, testVector[1].y + subCoorSystemOri.y, testVector[1].z + subCoorSystemOri.z);
testVector[2].set(testVector[2].x + subCoorSystemOri.x, testVector[2].y + subCoorSystemOri.y, testVector[2].z + subCoorSystemOri.z);
GL11.glPushMatrix();
{
	GL11.glTranslatef(subCoorSystemOri.x, subCoorSystemOri.y, subCoorSystemOri.z);
	GL11.glScalef(0.5F, 0.5F, 0.5F);
	gunType.arrowModel.render(f);
}
GL11.glPopMatrix();
GL11.glPushMatrix();
{
	GL11.glTranslatef(testVector[0].x, testVector[0].y, testVector[0].z);
	gunType.arrowModel.render(f);
}
GL11.glPopMatrix();
GL11.glPushMatrix();
{
	GL11.glTranslatef(testVector[1].x, testVector[1].y, testVector[1].z);
	gunType.arrowModel.render(f);
}
GL11.glPopMatrix();
GL11.glPushMatrix();
{
	GL11.glTranslatef(testVector[2].x, testVector[2].y, testVector[2].z);
	gunType.arrowModel.render(f);
}
GL11.glPopMatrix();
/** for test */

/** method to render off hand gun, out dated 
public static void renderOffHandGun(EntityPlayer player, ItemStack offHandStack)
{
	gunType = ((ItemGun)(gunStack = offHandStack).getItem()).type;
	if(gunType.oneHanded)
	{
		animations = FlansModClient.getGunAnimations(player, true);
		renderType = ItemRenderType.EQUIPPED;
		offHand = true;
		doRenderGun();
		offHand = false;
	}
}*/
