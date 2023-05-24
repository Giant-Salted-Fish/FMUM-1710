//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Noblex Docter Optics Sight II Plus
// Model Creator: 
// Created on: 25.10.2019 - 22:26:11
// Last changed on: 25.10.2019 - 22:26:11

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelNoblexDocterOpticsSightIIPlusPRB extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelNoblexDocterOpticsSightIIPlusPRB() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[6];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 20
		attachmentModel[1] = new ModelRendererTurbo(this, 32, 12, textureX, textureY); // Box 21
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 22
		attachmentModel[3] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 23
		attachmentModel[4] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 24
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Box 25

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		attachmentModel[0].setRotationPoint(-6F, 0F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		attachmentModel[1].setRotationPoint(-6F, 0F, 3F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		attachmentModel[2].setRotationPoint(-0.5F, 0F, -6.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 23
		attachmentModel[3].setRotationPoint(-0.5F, -1F, -7F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 24
		attachmentModel[4].setRotationPoint(-0.5F, 1F, -7F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		attachmentModel[5].setRotationPoint(-6F, -1F, -4F);

		flipAll();
	}
}