//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Trijicon ACOG 4x32 TA31F Scope Glass
// Model Creator: 
// Created on: 09.11.2019 - 16:36:12
// Last changed on: 09.11.2019 - 16:36:12

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTrijiconACOG4x32TA31FScopeGlass extends ModelDefault //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTrijiconACOG4x32TA31FScopeGlass() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[3];
		defaultModel[0] = new ModelRendererTurbo(this, 106, -244, textureX, textureY); // Box 137
		defaultModel[1] = new ModelRendererTurbo(this, 56, -294, textureX, textureY); // Box 138
		defaultModel[2] = new ModelRendererTurbo(this, 106, 106, textureX, textureY); // Box 140

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 50, 300, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		defaultModel[0].setRotationPoint(0F, -200F, -150F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 300, 400, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		defaultModel[1].setRotationPoint(0F, -150F, -200F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 50, 300, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		defaultModel[2].setRotationPoint(0F, 150F, -150F);

		flipAllBy(false, false, true);
	}
}