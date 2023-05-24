package com.flansmod.client.model;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.vector.Vector3f;

public class GunCase
{
	public ModelGun gunModel;
	public ShootableType caseType;
	public Vector3f pos = new Vector3f(0F), lastPos = new Vector3f(0F), rot = new Vector3f(0F), 
					velocity = new Vector3f(0F), rotCenter = new Vector3f(), rotVector = new Vector3f(0F);
	public float rotProgress, lastRotProgress, rotVelocity, vFriction, rvFriction, gAcceleration;
	public Vector3f[] posInScope, lastPosInScope;
	public int time = 30, caseTime = 30;
	private static final float V_FRICTION = 0.99F, RV_FRICTION = 0.99F, G_ACCELERATION = -1.96F / 160F;
	
	/** default constructor */
	public GunCase()
	{
		posInScope = new Vector3f[com.flansmod.common.FlansMod.numScopeTextures];
		lastPosInScope = new Vector3f[posInScope.length];
		for(int i = posInScope.length; --i >= 0; )
		{
			posInScope[i] = new Vector3f();
			lastPosInScope[i] = new Vector3f();
		}
	}
	
	public void preSet(ShootableType st, ModelGun gm, boolean shootCasing)
	{
		if(st == null) return;
		caseType = st;
		caseTime = (gunModel = gm).caseTime;
		vFriction = gm.vFriction;
		rvFriction = gm.rvFriction;
		gAcceleration = gm.gAcceleration;
		if(shootCasing)
		{
			rotVelocity = gm.rotVelocity;
			RenderGun.caseTrans.set(gunModel.caseEjectVelocity.x + gunModel.caseEjectRandV.x * FlansMod.rand.nextFloat(), 
									gunModel.caseEjectVelocity.y + gunModel.caseEjectRandV.y * FlansMod.rand.nextFloat(), 
									gunModel.caseEjectVelocity.z + gunModel.caseEjectRandV.z * FlansMod.rand.nextFloat());
			RenderGun.caseRot.set(gunModel.caseEjectAngularV.x + gunModel.caseEjectRandAV.x * FlansMod.rand.nextFloat(), 
					  			  gunModel.caseEjectAngularV.y + gunModel.caseEjectRandAV.y * FlansMod.rand.nextFloat(), 
					  			  gunModel.caseEjectAngularV.z + gunModel.caseEjectRandAV.z * FlansMod.rand.nextFloat());
		}
		else
		{
			rotVelocity = gm.rotVelocityWC;
			RenderGun.caseTrans.set(gunModel.caseEjectVelocityWC.x + gunModel.caseEjectRandVWC.x * FlansMod.rand.nextFloat(), 
									gunModel.caseEjectVelocityWC.y + gunModel.caseEjectRandVWC.y * FlansMod.rand.nextFloat(), 
									gunModel.caseEjectVelocityWC.z + gunModel.caseEjectRandVWC.z * FlansMod.rand.nextFloat());
			RenderGun.caseRot.set(gunModel.caseEjectAngularVWC.x + gunModel.caseEjectRandAVWC.x * FlansMod.rand.nextFloat(), 
				  			  	  gunModel.caseEjectAngularVWC.y + gunModel.caseEjectRandAVWC.y * FlansMod.rand.nextFloat(), 
				  			  	  gunModel.caseEjectAngularVWC.z + gunModel.caseEjectRandAVWC.z * FlansMod.rand.nextFloat());
		}
	}
	
	/** method to set the owner of this and initialize dotBorder */
	public void set(Vector3f thisPos, float rx, float ry, float rz, Vector3f thisVelocity, Vector3f thisRotC, Vector3f thisRotV)
	{
		pos.set(thisPos);
		lastPos.set(pos);
		rot.set(rx, ry, rz);
		lastRotProgress = rotProgress = 0F;
		velocity.set(thisVelocity);
		rotCenter.set(thisRotC);
		rotVector.set(thisRotV);
	}
	
	public void setPosInScope(int indexToSet, Vector3f pos)
	{
		posInScope[indexToSet].set(pos);
		lastPosInScope[indexToSet].set(pos);
	}
	
	public void update(float xOffset, float yOffset, float zOffset)
	{
		if(time >= caseTime) return;
		++time;
		lastPos.set(pos); //update speed and position
		velocity.y += G_ACCELERATION;
		velocity.scale(V_FRICTION);
		pos.translate(xOffset += velocity.x, yOffset += velocity.y, zOffset += velocity.z);
		rotVelocity *= RV_FRICTION;
		rotProgress = (lastRotProgress = rotProgress) + rotVelocity;
		for(int i = posInScope.length; --i >= 0; )
		{
			lastPosInScope[i].set(posInScope[i]);
			posInScope[i].translate(xOffset, yOffset, zOffset);
		}
	}
	
	public boolean isDead() { return time >= caseTime; }
	
	public String getDebugString()
	{
		return "TODO";
	}
}
