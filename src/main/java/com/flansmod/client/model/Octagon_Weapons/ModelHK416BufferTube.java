//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416BufferTube
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416BufferTube extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416BufferTube() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[4];
		attachmentModel[0] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 141
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 142
		attachmentModel[2] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 143
		attachmentModel[3] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 485

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 58, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 141
		attachmentModel[0].setRotationPoint(-53.5F, -4F, -2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 58, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		attachmentModel[1].setRotationPoint(-53.5F, -2F, -4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 58, 2, 4, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		attachmentModel[2].setRotationPoint(-53.5F, 2F, -2F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 40, 3, 4, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		attachmentModel[3].setRotationPoint(-53.5F, 4F, -2F);

		flipAll();
	}
}