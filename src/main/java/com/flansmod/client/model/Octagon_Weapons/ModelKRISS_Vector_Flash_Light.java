//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KRISS Vector Flash Light
// Model Creator: 
// Created on: 29.09.2019 - 18:59:49
// Last changed on: 29.09.2019 - 18:59:49

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelKRISS_Vector_Flash_Light extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKRISS_Vector_Flash_Light() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[17];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		attachmentModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 33
		attachmentModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 34
		attachmentModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 370
		attachmentModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 371
		attachmentModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 372
		attachmentModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 373
		attachmentModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 374
		attachmentModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 375
		attachmentModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 376
		attachmentModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 377
		attachmentModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 378
		attachmentModel[12] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 379
		attachmentModel[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 380
		attachmentModel[14] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 381
		attachmentModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 382
		attachmentModel[16] = new ModelRendererTurbo(this, 248, 8, textureX, textureY); // Box 16

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 14, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		attachmentModel[0].setRotationPoint(-11F, -4F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		attachmentModel[1].setRotationPoint(-11F, -2F, -4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 14, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 34
		attachmentModel[2].setRotationPoint(-11F, 2F, -4F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		attachmentModel[3].setRotationPoint(4F, -1F, -3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		attachmentModel[4].setRotationPoint(4F, -3F, -3F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 372
		attachmentModel[5].setRotationPoint(4F, 1F, -3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		attachmentModel[6].setRotationPoint(3F, -1.5F, -2.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		attachmentModel[7].setRotationPoint(3F, -2.5F, -2.5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		attachmentModel[8].setRotationPoint(3F, 1.5F, -2.5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		attachmentModel[9].setRotationPoint(11F, -1.5F, -2.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 377
		attachmentModel[10].setRotationPoint(9F, -1F, -3F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 378
		attachmentModel[11].setRotationPoint(9F, -3F, -3F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -2F); // Box 379
		attachmentModel[12].setRotationPoint(9F, 1F, -3F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		attachmentModel[13].setRotationPoint(11F, -1.5F, 1.5F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 381
		attachmentModel[14].setRotationPoint(11F, -2.5F, -1.5F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		attachmentModel[15].setRotationPoint(11F, 1.5F, -1.5F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		attachmentModel[16].setRotationPoint(10.5F, -1.5F, -1.5F);



		flipAll();
	}
}