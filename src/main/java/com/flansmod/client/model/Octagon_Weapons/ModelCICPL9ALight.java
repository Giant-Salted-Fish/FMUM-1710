//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC PL-9A Light
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICPL9ALight extends ModelDefault //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCICPL9ALight() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[1];
		defaultModel[0] = new ModelRendererTurbo(this, 2, 82, textureX, textureY); // Box 55

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		defaultModel[0].setRotationPoint(17.01F, 7.5F, -2.5F);
	}
}