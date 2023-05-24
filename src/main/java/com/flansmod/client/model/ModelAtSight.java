package com.flansmod.client.model;

import com.flansmod.common.vector.Vector3f;

public abstract class ModelAtSight extends ModelAttachment
{
	public Vector3f
			pupilRefCenter = new Vector3f(0F),
			scopeGlassModelScale = new Vector3f(1F), 
			scopeObjectiveLensCenter = new Vector3f(0F),
			normalVecOfDotBorder = new Vector3f(1F, 0F, 0F);
	public Vector3f[]
			reticleAt = new Vector3f[]{ new Vector3f(0F) },
			reticleBorder = new Vector3f[0];
	public float reticleScale = 1F;
	public boolean relativeReticleSize = false;
	public float minAlphaToRenderScopeTex = 0.05F,
			scopeMaskXTrans = -0.409375F,
			scopeMaskMultRotY = 0.5F,
			scopeMaskMultRotZ = 0.5F, 
			scopeMaskMultTransY = 0.4F,
			scopeMaskMultTransZ = 0.4F,
			scopeMaskScale = 0.02F;
	public float[] scopeMaskAlphaDivisor = new float[]{ 0.00003F };
	public float
			minPupilDistance = 0.3F,
			pupilDistancePower = 3F;
}
