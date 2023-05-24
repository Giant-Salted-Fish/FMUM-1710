//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Default Arm
// Model Creator: 
// Created on: 30.04.2020 - 17:53:07
// Last changed on: 30.04.2020 - 17:53:07

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelDefaultArm extends ModelDefault //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelDefaultArm() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[1];
		defaultModel[0] = new ModelRendererTurbo(this, 40, 16, textureX, textureY); // Box 0

		defaultModel[0].addShapeBox(0F, 0F, 0F, 4, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		defaultModel[0].setRotationPoint(-11F, -2F, -2F);
		defaultModel[0].rotateAngleX = -1.57079633F;
		defaultModel[0].rotateAngleY = 1.57079633F;

		flipAll();
	}
}