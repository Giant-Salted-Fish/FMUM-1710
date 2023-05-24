//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Aimpoint Micro T-1 - Dot
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAimpointMicroT1Dot extends ModelDefault //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelAimpointMicroT1Dot() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[1];
		defaultModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 320

		defaultModel[0].addShapeBox(0F, -0.2F, -0.2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 320
		defaultModel[0].setRotationPoint(0F, 0F, 0F);
		defaultModel[0].rotateAngleX = 0.78539816F;

		flipAll();
	}
}