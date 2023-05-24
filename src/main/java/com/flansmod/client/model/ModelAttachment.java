package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public abstract class ModelAttachment extends ModelFlan
{
	public ModelRendererTurbo[] attachmentModel = new ModelRendererTurbo[0];
	
	/** laser origin */
	public Vector3f laserFrom = new Vector3f(0F);
	
	/** amount for muzzle flash model to translate */
	public Vector3f muzzleFlashPoint = new Vector3f(0F);
	
	/** whether muzzle flash will free rotate when render it */
	public boolean flashFreeRotate = true;
	
	/** the basic translate and rotate for the hand holding this grip */
	public Vector3f armTranslate = new Vector3f(0F), armRotate = new Vector3f(0F);
	
	@Override
	public void render(float f) { render(attachmentModel, f); }
	
	protected static byte getFireModeNum() { return RenderGun.fireModeNum; }
	
	protected static byte getZoomStep() { return RenderGun.zoomStep; }
	
	protected static byte getReticleNum() { return RenderGun.reticleNum; }
	
	protected static boolean getLaserOn() { return RenderGun.laserOn; }
	
	protected static boolean getLightOn() { return RenderGun.lightOn; }
	
	public void flipAll() { flip(attachmentModel); }
	
	public void flipAllBy(boolean x, boolean y, boolean z) { flipBy(attachmentModel, x, y, z); }
}
