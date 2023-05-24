package com.flansmod.client.model;

import java.util.LinkedList;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.FlansMod;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;

public abstract class ModelFlan extends ModelBase
{
	/** This offsets the render position for item frames */
	public Vector3f itemFrameOffset = new Vector3f(),
					thirdPersonOffset = new Vector3f();
	
	public void render(float f) { }
	
	public void renderWithoutGlow(float f) { render(f); }
	
	/** 
	 * method to help simplify rendering
	 * @param models model turboes to render
	 * @param f scale
	 */
	protected static void render(ModelRendererTurbo[] models, float f)
	{ for(int i = models.length; --i >= 0; models[i].render(f)); }
	
	protected static void partialRender(ModelRendererTurbo[] model, int head, int tail, float f)
	{ for(; --tail >= head; model[tail].render(f)); }
	
	//lighting stuff
	private static float lightmapLastX;
    private static float lightmapLastY;
	private static boolean optifineBreak = false;
	
	public static void glowOn() { glowOn(15); }
	
    public static void glowOn(int glow)
    {
    	if(optifineBreak) return;
		GL11.glPushAttrib(GL11.GL_LIGHTING_BIT);
		try
		{
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 
					Math.min((glow / 15F) * 240F + (lightmapLastX = OpenGlHelper.lastBrightnessX), 240), 
					Math.min((glow / 15F) * 240F + (lightmapLastY = OpenGlHelper.lastBrightnessY), 240));
		}
		catch(NoSuchFieldError e)
		{
			optifineBreak = true;
			GL11.glPopAttrib();
		}
	}
	
	public static void glowOnStatic()
    {
		if(optifineBreak) return;
		GL11.glPushAttrib(GL11.GL_LIGHTING_BIT);
		try
		{
			lightmapLastX = OpenGlHelper.lastBrightnessX;
			lightmapLastY = OpenGlHelper.lastBrightnessY;
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
		}
		catch(NoSuchFieldError e)
		{
			optifineBreak = true;
			GL11.glPopAttrib();
		}
    }
	
    public static void glowOff()
    {
		if(optifineBreak) return;
		GL11.glEnable(GL11.GL_LIGHTING);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightmapLastX, lightmapLastY);
		GL11.glPopAttrib();
    }
	
	protected static void flip(ModelRendererTurbo[] model)
	{
		for(int i = model.length; --i >= 0; )
		{
			model[i].doMirror(false, true, true);
			model[i].setRotationPoint(model[i].rotationPointX, -model[i].rotationPointY, -model[i].rotationPointZ);
		}
	}
	
	protected static void flipBy(ModelRendererTurbo[] model, boolean x, boolean y, boolean z)
	{
		for(int i = model.length; --i >= 0; )
		{
			model[i].doMirror(x, y, z);
			model[i].setRotationPoint(x ? -model[i].rotationPointX : model[i].rotationPointX, 
									  y ? -model[i].rotationPointY : model[i].rotationPointY, 
									  z ? -model[i].rotationPointZ : model[i].rotationPointZ);
		}
	}

	protected static void translate(ModelRendererTurbo[] model, float x, float y, float z)
	{ for(int i = model.length; --i >= 0; 
			model[i].rotationPointX += x, model[i].rotationPointY += y, model[i].rotationPointZ += z); }
	
	public static void bindTex(String s) { RenderFlan.renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(s)); }
	
	protected static void push() { GL11.glPushMatrix(); }
	
	protected static void pop() { GL11.glPopMatrix(); }
	
	protected static void trans(float x, float y, float z) { GL11.glTranslatef(x, y, z); }
	
	protected static void rot(float angle, float x, float y, float z) { GL11.glRotatef(angle, x, y, z); }
	
	protected static void rotX(float angle) { GL11.glRotatef(angle, 1F, 0F, 0F); }
	
	protected static void rotY(float angle) { GL11.glRotatef(angle, 0F, 1F, 0F); }
	
	protected static void rotZ(float angle) { GL11.glRotatef(angle, 0F, 0F, 1F); }
	
	protected static void scale(float x, float y, float z) { GL11.glScalef(x, y, z); }
	
	protected static int getTick() { return FlansMod.ticker; }
	
	protected static float getPartialTickTime() { return RenderFlan.smoothing; }
	
	protected static class Animation
	{
		private LinkedList<AnimationNode> nodes = new LinkedList<AnimationNode>();
		
		private static class AnimationNode
		{
			private Vector3f trans = new Vector3f(0F), rot = new Vector3f(0F);
			private float headProgress = 0F, thisProgress = 0F;
			
			private AnimationNode() { }
			
			private float getProgressTail() { return headProgress + thisProgress; }
			
			private void scaleProgress(float scaler)
			{
				headProgress /= scaler;
				thisProgress /= scaler;
			}
		}
		
		public Animation() { nodes.add(new AnimationNode()); }
		
		public Animation add(float tx, float ty, float tz, float rx, float ry, float rz, float dur)
		{
			AnimationNode node = new AnimationNode();
			node.trans.set(tx, ty, tz);
			node.rot.set(rx, ry, rz);
			node.headProgress = nodes.getLast().getProgressTail();
			node.thisProgress = dur;
			nodes.add(node);
			return this;
		}
		
		public Animation addTail(float tx, float ty, float tz, float rx, float ry, float rz, float totalDur)
		{
			if(totalDur != 1F) for(AnimationNode node : nodes) node.scaleProgress(totalDur);
			return add(tx, ty, tz, rx, ry, rz, 1F - nodes.getLast().getProgressTail());
		}
		
		//TODO: optimization
		public void applyAnimationFor(float progress, ModelRendererTurbo[] tar, float f)
		{
			AnimationNode last = null;
			for(AnimationNode cur : nodes)
			{
				if(last != null && last.getProgressTail() <= progress && cur.getProgressTail() >= progress)
				{
					float reverseProgress = 1F - (progress = (progress - cur.headProgress) / cur.thisProgress);
					GL11.glPushMatrix();
					GL11.glTranslatef(last.trans.x * reverseProgress + cur.trans.x * progress, 
							last.trans.y * reverseProgress + cur.trans.y * progress, 
							last.trans.z * reverseProgress + cur.trans.z * progress);
					GL11.glRotatef(last.rot.x * reverseProgress + cur.rot.x * progress, 1F, 0F, 0F);
					GL11.glRotatef(last.rot.y * reverseProgress + cur.rot.y * progress, 0F, 1F, 0F);
					GL11.glRotatef(last.rot.z * reverseProgress + cur.rot.z * progress, 0F, 0F, 1F);
					render(tar, f);
					GL11.glPopMatrix();
					return;
				}
				last = cur;
			}
			GL11.glPushMatrix();
			GL11.glTranslatef(last.trans.x, last.trans.y, last.trans.z);
			GL11.glRotatef(last.rot.x, 1F, 0F, 0F);
			GL11.glRotatef(last.rot.y, 0F, 1F, 0F);
			GL11.glRotatef(last.rot.z, 0F, 0F, 1F);
			render(tar, f);
			GL11.glPopMatrix();
		}
	}
}
