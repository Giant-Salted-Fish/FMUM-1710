//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AN/PEQ-15A Light
// Model Creator: 
// Created on: 09.06.2020 - 21:46:54
// Last changed on: 09.06.2020 - 21:46:54

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelANPEQ15ALight extends ModelDefault //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelANPEQ15ALight() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[1];
		defaultModel[0] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 66

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		defaultModel[0].setRotationPoint(19.51F, -4F, 4F);

		flipAll();
	}
}