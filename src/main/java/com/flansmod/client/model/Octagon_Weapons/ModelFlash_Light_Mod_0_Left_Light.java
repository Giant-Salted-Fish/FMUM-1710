//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Flash Light Mod 0 Left Light
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFlash_Light_Mod_0_Left_Light extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFlash_Light_Mod_0_Left_Light() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[1];
		attachmentModel[0] = new ModelRendererTurbo(this, 75, 8, textureX, textureY); // Box 47

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		attachmentModel[0].setRotationPoint(9.51F, -2.5F, 4.5F);



		flipAll();
	}
}