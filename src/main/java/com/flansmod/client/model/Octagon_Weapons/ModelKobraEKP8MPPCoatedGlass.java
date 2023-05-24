//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kobra EKP-8M-PP Coated Glass
// Model Creator: 
// Created on: 27.10.2019 - 13:16:05
// Last changed on: 27.10.2019 - 13:16:05

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelKobraEKP8MPPCoatedGlass extends ModelDefault //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelKobraEKP8MPPCoatedGlass() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[2];
		defaultModel[0] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 158
		defaultModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 159

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		defaultModel[0].setRotationPoint(27F, -12F, -4F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 159
		defaultModel[1].setRotationPoint(27F, -14F, -2F);

		flipAll();
	}
}