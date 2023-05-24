package com.flansmod.client.model;

import com.flansmod.common.vector.Vector3f;

public class GunSmoke
{
	//can choose int array to test when optimize, currently use itemstack
	public ModelDefault smokeModel = null;
	public String smokeTexture;
	public float smokeScale, smokeScaleToChange;
	public float smokeVanishConst = 0F;
	public float rotZ = 0F, rotY = 0F, rotX = 0F;
	public Vector3f pos = new Vector3f(0F), lastPos = new Vector3f(0F);
	public Vector3f[] posInScope, lastPosInScope;
	public float alpha = 1F;
	
	/** default constructor */
	public GunSmoke()
	{
		posInScope = new Vector3f[com.flansmod.common.FlansMod.numScopeTextures];
		lastPosInScope = new Vector3f[posInScope.length];
		for(int i = posInScope.length; --i >= 0; )
		{
			posInScope[i] = new Vector3f();
			lastPosInScope[i] = new Vector3f();
		}
	}
	
	/** method to set the owner of this and initialize dotBorder */
	public void set(ModelDefault thisModel, String texture, float scale, float scaleToChange, Vector3f thisPos, float rx, float ry, float rz, float vanishConst)
	{
		alpha = 1F;
		smokeModel = thisModel;
		smokeTexture = texture;
		smokeScale = scale;
		smokeScaleToChange = scaleToChange;
		pos.set(thisPos);
		lastPos.set(thisPos);
		rotZ = rz;
		rotY = ry;
		rotX = rx;
		smokeVanishConst = vanishConst;
	}
	
	public void setPosInScope(int indexToSet, Vector3f pos)
	{
		posInScope[indexToSet].set(pos);
		lastPosInScope[indexToSet].set(pos);
	}
	
	public void update(float xOffset, float yOffset, float zOffset)
	{
		alpha *= smokeVanishConst;
		lastPos.set(pos);
		pos.translate(xOffset, yOffset, zOffset);
		for(int i = posInScope.length; --i >= 0; )
		{
			lastPosInScope[i].set(posInScope[i]);
			posInScope[i].translate(xOffset, yOffset, zOffset);
		}
	}
	
	public float getScale() { return smokeScale +  smokeScaleToChange * alpha; }
	
	public String getDebugString()
	{ return (smokeModel == null ? "no smokeModel" : "has smokeModel") + ", smokeVanishConst: " + smokeVanishConst + ", pos: " + pos.getString() + ", last pos: " + lastPos.getString(); }
}
