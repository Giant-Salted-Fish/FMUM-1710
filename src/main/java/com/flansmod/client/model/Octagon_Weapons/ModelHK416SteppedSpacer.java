//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416SteppedSpacer
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416SteppedSpacer extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416SteppedSpacer() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[8];
		attachmentModel[0] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 134
		attachmentModel[1] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 649
		attachmentModel[2] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 650
		attachmentModel[3] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 561
		attachmentModel[4] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 562
		attachmentModel[5] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 564
		attachmentModel[6] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 565
		attachmentModel[7] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 566

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 134
		attachmentModel[0].setRotationPoint(-2.5F, -5F, -2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 649
		attachmentModel[1].setRotationPoint(-2.5F, 4F, -2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 650
		attachmentModel[2].setRotationPoint(-2.5F, -2F, -5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 561
		attachmentModel[3].setRotationPoint(-2.5F, -2F, 4F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0.5F, -1F, -3F, 0.5F, -1F, 3F, 0F, -1F, 3F); // Box 562
		attachmentModel[4].setRotationPoint(-2.5F, -5F, 1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 3F, 0.5F, -1F, 3F, 0.5F, -1F, -3F, 0F, -1F, -3F); // Box 564
		attachmentModel[5].setRotationPoint(-2.5F, -5F, -2F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -1F, 3F, 0.5F, -1F, 3F, 0.5F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -1F, 0F, -1F, -1F); // Box 565
		attachmentModel[6].setRotationPoint(-2.5F, 1F, -2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -1F, -3F, 0.5F, -1F, -3F, 0.5F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 566
		attachmentModel[7].setRotationPoint(-2.5F, 1F, 1F);

		flipAll();
	}
}