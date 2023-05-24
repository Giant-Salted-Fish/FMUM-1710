//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TestArrow
// Model Creator: 
// Created on: 02.01.2020 - 20:29:24
// Last changed on: 02.01.2020 - 20:29:24

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTestArrow extends ModelDefault //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelTestArrow() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[1];
		defaultModel[0] = new ModelRendererTurbo(this, 3, 5, textureX, textureY); // Box 64

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		defaultModel[0].setRotationPoint(-0.5F, -0.5F, -0.5F);

		flipAll();
	}
}