package com.flansmod.client.model;

import com.flansmod.client.FlansModClient;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.IItemRenderer;

public abstract class RenderFlan implements IItemRenderer
{
	protected static Minecraft mc;
	public static TextureManager renderEngine;
	public static float smoothing, f = 1F / 16F;
	
    protected static float getFOVModifier()
    {
		return ActiveRenderInfo.getBlockAtEntityViewpoint(
				mc.theWorld, (EntityLivingBase)mc.renderViewEntity, smoothing).getMaterial() == Material.water ? 
						mc.gameSettings.fovSetting * 60F / 70F : mc.gameSettings.fovSetting;
    }
	
	public RenderFlan()
	{
		//initialize values
		mc = FlansModClient.minecraft;
	}
	
	public static void postInit() { renderEngine = mc.renderEngine; }
}
