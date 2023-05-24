//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Default Pointer
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelDefaultPointer extends ModelDefault //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelDefaultPointer() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[3];
		defaultModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 532
		defaultModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 533
		defaultModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2

		defaultModel[0].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		defaultModel[0].setRotationPoint(-2F, -16F, -0.5F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -6F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, -6F, 0F); // Box 533
		defaultModel[1].setRotationPoint(-4F, -8F, -0.5F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, -2F, -3F, -0.5F); // Box 2
		defaultModel[2].setRotationPoint(-4F, -8F, -0.5F);

		flipAll();
	}
}