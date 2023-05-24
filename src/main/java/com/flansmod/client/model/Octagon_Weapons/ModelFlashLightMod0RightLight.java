//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Flash Light Mod 0 - Right Light
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFlashLightMod0RightLight extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelFlashLightMod0RightLight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[1];
		attachmentModel[0] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 46

		attachmentModel[0].addShapeBox(0F, 0.5F, -11.5F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		attachmentModel[0].setRotationPoint(9.51F, -3F, 2F);



		flipAll();
	}
}