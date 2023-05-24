//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bullet 9
// Model Creator:
// Created on:19.10.2019 - 15:42:14
// Last changed on: 19.10.2019 - 15:42:14

package com.flansmod.client.model.Octagon_Special_Bullets;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelBullet_9 extends ModelBase
{
	int textureX = 32;
	int textureY = 64;

	public ModelBullet_9()
	{
		bullet_9Model = new ModelRendererTurbo[1];
		bullet_9Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0

		bullet_9Model[0].addShapeBox(-0.15F, 0F, -0.15F, 1, 9, 1, 0F, -0.15F, 0F, 0F, -0.7F, 0F, -0.15F, -0.85F, 0F, -0.7F, 0F, 0F, -0.85F, -0.15F, 0F, 0F, -0.7F, 0F, -0.15F, -0.85F, 0F, -0.7F, 0F, 0F, -0.85F); // Box 0
		bullet_9Model[0].setRotationPoint(0F, -9F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 1; i++)
		{
			bullet_9Model[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bullet_9Model[];
}