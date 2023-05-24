//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CICWTS36Piston
// Model Creator: 
// Created on: 22.12.2019 - 19:48:03
// Last changed on: 22.12.2019 - 19:48:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICWTS36Piston extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCICWTS36Piston() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[7];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 388
		attachmentModel[1] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 424
		attachmentModel[2] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 425
		attachmentModel[3] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 426
		attachmentModel[4] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 427
		attachmentModel[5] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 428
		attachmentModel[6] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 429

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 103, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 388
		attachmentModel[0].setRotationPoint(-99F, -1F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 424
		attachmentModel[1].setRotationPoint(-7F, -1.5F, -0.5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		attachmentModel[2].setRotationPoint(-7F, -0.5F, -1.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		attachmentModel[3].setRotationPoint(-7F, 0.5F, -0.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F); // Box 427
		attachmentModel[4].setRotationPoint(-3F, -1.5F, -0.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F); // Box 428
		attachmentModel[5].setRotationPoint(-3F, 0.5F, -0.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 1F); // Box 429
		attachmentModel[6].setRotationPoint(-3F, -0.5F, -0.5F);

		flipAll();
	}
}