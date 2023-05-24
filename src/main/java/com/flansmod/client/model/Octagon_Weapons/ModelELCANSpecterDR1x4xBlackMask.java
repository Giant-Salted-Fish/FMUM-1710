//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ELCAN SpecterDR 1x/4x - Black Mask
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelELCANSpecterDR1x4xBlackMask extends ModelDefault //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelELCANSpecterDR1x4xBlackMask() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[2];
		defaultModel[0] = new ModelRendererTurbo(this, 6, -494, textureX, textureY); // Box 135
		defaultModel[1] = new ModelRendererTurbo(this, 507, 507, textureX, textureY); // Box 1

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 500, 500, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		defaultModel[0].setRotationPoint(0F, -250F, -250F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 4096F, 4096F, 0F, 4096F, 4595F, 0F, 0F, 499F, 0F, 499F, 0F, 0F, 4595F, 4096F, 0F, 4595F, 4595F, 0F, 499F, 499F); // Box 1
		defaultModel[1].setRotationPoint(0F, -250F, -250F);
	}
}