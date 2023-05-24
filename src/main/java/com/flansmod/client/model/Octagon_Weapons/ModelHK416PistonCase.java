//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416PistonCase
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416PistonCase extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416PistonCase() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[3];
		attachmentModel[0] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 580
		attachmentModel[1] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 581
		attachmentModel[2] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 582

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 580
		attachmentModel[0].setRotationPoint(0F, -1.5F, -0.5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		attachmentModel[1].setRotationPoint(0F, -0.5F, -1.5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		attachmentModel[2].setRotationPoint(15F, 0.5F, -0.5F);

		flipAll();
	}
}