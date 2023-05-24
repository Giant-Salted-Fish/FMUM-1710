package com.flansmod.client.model;

import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.nbt.NBTTagCompound;

public class SightCoor
{
	public static float sightRotX, sightRotY, sightRotZ;
	public NBTTagCompound ownerTag;
	public AttachmentType ownerType;
	public ModelAtSight ownerModel;
	public byte[] ownerAt;
	public int scopeGlassTexIndex = -1;
	public float rotateAngle, dotRotateAngle;
	public Vector3f sightCoor = new Vector3f(), sightCoorWithTrans = new Vector3f(), normalVecWithTrans = new Vector3f();
	public Vector3f[] oriDotCoors = new Vector3f[0], dotCoorWithTrans = new Vector3f[0], dotBorder = new Vector3f[0], dotBorderWithTrans = new Vector3f[0];
	public Vector3f objectiveLensCenterCoor = new Vector3f(), pupilRefCenterCoor = new Vector3f();
	public float alpha = 0F, scopeMaskTransY = 0F, scopeMaskTransZ = 0F, pupilDistance = 0F;
	public int zoomStep = 0;
	
	public static Vector3f tempVector = new Vector3f();
	
	/** default constructor */
	public SightCoor() { }
	
	/** method to set the owner of this and initialize dotBorder */
	public void switchOwner(NBTTagCompound newSightTag, AttachmentType newSightType, byte[] newSightAt)
	{
		ownerTag = newSightTag;
		ownerModel = (ModelAtSight)(ownerType = newSightType).model;
		ownerAt = newSightAt;
		oriDotCoors = inheritVector3fArray(oriDotCoors, ownerModel.reticleAt.length);
		dotCoorWithTrans = inheritVector3fArray(dotCoorWithTrans, ownerModel.reticleAt.length);
		dotBorder = inheritVector3fArray(dotBorder, ownerModel.reticleBorder.length);
		dotBorderWithTrans = inheritVector3fArray(dotBorderWithTrans, ownerModel.reticleBorder.length);
	}
	
	private static Vector3f[] inheritVector3fArray(Vector3f[] target, int neededLength)
	{
		Vector3f[] newArray = new Vector3f[neededLength];
		if(neededLength > target.length)
		{
			for(int i = target.length; --i >= 0; ) newArray[i] = target[i];
			for(int i = target.length; i < neededLength; ++i) newArray[i] = new Vector3f();
		}
		else for(int i = neededLength; --i >= 0; ) newArray[i] = target[i]; 
		return newArray;
	}
	
	public boolean isScopeOwner(byte[] at, int len)
	{
		if(len + 1 != ownerAt.length) return false;
		while(--len >= 0) if(at[len] != ownerAt[len]) return false;
		return true;
	}
	
	public float getFOVZoom() { return ownerType.FOVZoomLevel[zoomStep] * pupilDistance; }
	
	public void applyBoltTrans(byte[] boltAt, int length, float transAmount)
	{ if(onThisAttachment(boltAt, length)) applyXTrans(transAmount); }
	
	public boolean onThisAttachment(byte[] targetAt, int length)
	{
		if(ownerAt.length < length) return false;
		while(--length >= 0) if(ownerAt[length] != targetAt[length]) return false;
		return true;
	}
	
	public void applyXTrans(float transAmount)
	{
		sightCoor.x += transAmount; //TODO
		for(int i = dotBorder.length; --i >= 0; ) dotBorder[i].x += transAmount;
	}
	
	public void applyScopeMaskTransY(float angle) { scopeMaskTransY += (float)Math.tan(Math.toRadians(angle)) * ownerModel.scopeMaskMultRotY; }
	
	public void applyScopeMaskTransZ(float angle) { scopeMaskTransZ += (float)Math.tan(Math.toRadians(angle)) * ownerModel.scopeMaskMultRotZ; }
	
	public void updateAlpha()
	{
		if(zoomStep >= ownerModel.scopeMaskAlphaDivisor.length)
		{
			zoomStep = 0;
			alpha = 1F;
			return;
		}
		if((alpha = 1F - (scopeMaskTransY * scopeMaskTransY + scopeMaskTransZ * scopeMaskTransZ) / ownerModel.scopeMaskAlphaDivisor[zoomStep]) < 0F)
			alpha = 0F;
	}
	
	public float pupilDistanceMaskScale()
	{ return ownerModel.minPupilDistance / (float)Math.pow(pupilDistance, ownerModel.pupilDistancePower); }
	
	public float getScopeMaskScale()
	{ return ownerModel.scopeMaskScale * ownerType.FOVZoomLevel[0] / ownerType.FOVZoomLevel[zoomStep] / pupilDistance; }
	
	public float getDivisionScale()
	{ return ownerModel.relativeReticleSize ? ownerModel.reticleScale * ownerType.FOVZoomLevel[0] / ownerType.FOVZoomLevel[zoomStep] 
												  : ownerModel.reticleScale; }
	
	/** for debug 
	public String getDebugString()
	{
		if(ownerStack == null) return "null owner";
		String toReturn = "ownerStack = " + ((com.flansmod.common.guns.ItemAttachment)ownerStack.getItem()).type.shortName + ", ownerType = " + ownerType.shortName 
				+ ", sightCoor = " + sightCoor.getString() + ", sightCoorWithTrans = " + sightCoorWithTrans.getString() +         ", dotCoorWithTrans = ";
		toReturn += (dotCoorWithTrans.length == 0 ? "null" : dotCoorWithTrans[0].getString());
		for(int i = 1; i < dotCoorWithTrans.length; ++i) toReturn += " | " + dotCoorWithTrans[i].getString();
		toReturn += ", dotBorder = " + (dotBorder.length == 0 ? "null" : dotBorder[0].getString());
		for(int i = 0; i < dotBorder.length; ++i) toReturn += " | " + dotBorder[i].getString();
		return toReturn;
	}
	/** for debug */
}