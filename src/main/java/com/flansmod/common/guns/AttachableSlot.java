package com.flansmod.common.guns;

import com.flansmod.common.vector.Vector3f;

public class AttachableSlot
{
	public Vector3f attachPos = new Vector3f();
	public float attachVec = 0F, attachRot = 0F;
	public short maxStep = 0;
	public byte maxCanAttach = 64;
	public String[] attachmentWhitelist = null, attachmentBlacklist = null;
	public int[] typeWhitelist = null, typeBlacklist = null;
	
	public AttachableSlot() { }
	
	public void setStepVec(float sl, short ms) { attachVec = sl; maxStep = ms; }
	
	public void applyModelScale(float f)
	{
		attachPos.scale(f);
		attachVec *= f;
	}
	
	public boolean isAttachmentAllowed(AttachmentType toAddType)
	{
		if(attachmentWhitelist != null) for(String s : attachmentWhitelist) if(toAddType.shortName.equals(s)) return true;
		if(attachmentBlacklist != null) for(String s : attachmentBlacklist) if(toAddType.shortName.equals(s)) return false;
		if(typeWhitelist != null) //blacklist not exist or it is not in blacklist, continue to check typeWhitelist
		{
			for(int i : typeWhitelist) if(toAddType.attachmentType == i) return true;
			return false; //not in typeWhitelist, return false
		} //typeWhitelist not exist, check typeBlacklist
		if(typeBlacklist != null) for(int i : typeBlacklist) if(toAddType.attachmentType == i) return false;
		return true; //no checkList or all check passed, return true
	}
	
	public float getDisplayTransX() { return attachVec * maxStep / 2F; }
}