//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChamberSmoke
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelChamberSmoke extends ModelDefault //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelChamberSmoke() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[3];
		defaultModel[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 547
		defaultModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 549
		defaultModel[2] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 3

		defaultModel[0].addShapeBox(0F, -0.5F, 0F, 80, 1, 80, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F); // Box 547
		defaultModel[0].setRotationPoint(-40F, 0F, -60F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 80, 80, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		defaultModel[1].setRotationPoint(0F, -40F, -60F);

		defaultModel[2].addShapeBox(0F, 0F, -0.5F, 80, 80, 1, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F); // Box 3
		defaultModel[2].setRotationPoint(-40F, -40F, -20F);

		flipAll();
	}
}