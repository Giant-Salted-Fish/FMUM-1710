//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Noblex Docter Optics Sight II Plus
// Model Creator: 
// Created on: 25.10.2019 - 22:26:11
// Last changed on: 25.10.2019 - 22:26:11

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelNoblexDocterOpticsSightIIPlusCoatedGlass extends ModelDefault //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelNoblexDocterOpticsSightIIPlusCoatedGlass() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[1];
		defaultModel[0] = new ModelRendererTurbo(this, 48, 45, textureX, textureY); // Box 24

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 24
		defaultModel[0].setRotationPoint(6F, -7F, -3F);

		flipAll();
	}
}