//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AN/PEQ15-A Laser FP
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelANPEQ15ALaserFP extends ModelDefault //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelANPEQ15ALaserFP() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[4];
		defaultModel[0] = new ModelRendererTurbo(this, 116, 57, textureX, textureY); // Box 572
		defaultModel[1] = new ModelRendererTurbo(this, 114, 57, textureX, textureY); // Box 578
		defaultModel[2] = new ModelRendererTurbo(this, 114, 55, textureX, textureY); // Box 8
		defaultModel[3] = new ModelRendererTurbo(this, 116, 55, textureX, textureY); // Box 9

		defaultModel[0].addShapeBox(0F, -1F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 8192F, 0F, 0F, 8192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8192F, 0F, 0F, 8192F, 0F, 0F, 0F, 0F, 0F); // Box 572
		defaultModel[0].setRotationPoint(0F, 0F, 0F);

		defaultModel[1].addShapeBox(0F, 0F, -1F, 1, 0, 2, 0F, 0F, 0F, 0F, 8192F, 0F, 0F, 8192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8192F, 0F, 0F, 8192F, 0F, 0F, 0F, 0F, 0F); // Box 578
		defaultModel[1].setRotationPoint(0F, 0F, 0F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 8192F, 0F, 0F, 8192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8192F, 0F, 0F, 8192F, 0F, 0F, 0F, 0F, 0F); // Box 8
		defaultModel[2].setRotationPoint(0F, 0F, -1F);

		defaultModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 8192F, 0F, 0F, 8192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8192F, 0F, 0F, 8192F, 0F, 0F, 0F, 0F, 0F); // Box 9
		defaultModel[3].setRotationPoint(0F, -1F, 0F);
	}
}