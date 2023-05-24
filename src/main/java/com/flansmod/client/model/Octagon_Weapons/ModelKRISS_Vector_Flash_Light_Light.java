//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KRISS Vector Flash Light Light
// Model Creator: 
// Created on: 29.09.2019 - 18:59:49
// Last changed on: 29.09.2019 - 18:59:49

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelKRISS_Vector_Flash_Light_Light extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKRISS_Vector_Flash_Light_Light() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[1];
		attachmentModel[0] = new ModelRendererTurbo(this, 249, 8, textureX, textureY); // Box 16

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		attachmentModel[0].setRotationPoint(10.51F, -1.5F, -1.5F);



		flipAll();
	}
}