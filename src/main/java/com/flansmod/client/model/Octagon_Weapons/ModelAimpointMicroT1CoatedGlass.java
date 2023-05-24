//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Aimpoint Micro T-1
// Model Creator: 
// Created on: 27.10.2019 - 17:33:29
// Last changed on: 27.10.2019 - 17:33:29

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAimpointMicroT1CoatedGlass extends ModelDefault //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelAimpointMicroT1CoatedGlass() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[1];
		defaultModel[0] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 56

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 56
		defaultModel[0].setRotationPoint(8.5F, -7.5F, -3F);

		flipAll();
	}
}