//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BerettaM9RearEPR
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBerettaM9RearEPR extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBerettaM9RearEPR() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[6];
		attachmentModel[0] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 352
		attachmentModel[1] = new ModelRendererTurbo(this, 203, 246, textureX, textureY); // Box 353
		attachmentModel[2] = new ModelRendererTurbo(this, 165, 176, textureX, textureY); // Box 354
		attachmentModel[3] = new ModelRendererTurbo(this, 221, 232, textureX, textureY); // Box 355
		attachmentModel[4] = new ModelRendererTurbo(this, 117, 223, textureX, textureY); // Box 356
		attachmentModel[5] = new ModelRendererTurbo(this, 101, 200, textureX, textureY); // Box 357

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.375F, 0F, 1F, -0.125F, 0F, 1F, -0.125F, 0F, 1F, 0.375F, 0F, 1F, 0.625F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.625F, 0F, 0F); // Box 352
		attachmentModel[0].setRotationPoint(-0.75F, -1F, -2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		attachmentModel[1].setRotationPoint(-1.75F, -2F, -3F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		attachmentModel[2].setRotationPoint(-1.75F, -3F, -3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		attachmentModel[3].setRotationPoint(2.25F, -3F, -3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		attachmentModel[4].setRotationPoint(10.25F, -3F, -3F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		attachmentModel[5].setRotationPoint(6.25F, -3F, -3F);

		flipAll();
	}
}