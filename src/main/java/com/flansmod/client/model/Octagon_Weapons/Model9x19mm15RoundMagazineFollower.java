//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Beretta M9A1
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model9x19mm15RoundMagazineFollower extends ModelDefault //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Model9x19mm15RoundMagazineFollower() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[3];
		defaultModel[0] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 297
		defaultModel[1] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 298
		defaultModel[2] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 301

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F); // Box 297
		defaultModel[0].setRotationPoint(8F, 0F, -2F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0.9F, 0F, -0.5F, 0.9F); // Box 298
		defaultModel[1].setRotationPoint(0F, -2.5F, 0F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 301
		defaultModel[2].setRotationPoint(0F, -1F, -2F);

		flipAll();
	}
}