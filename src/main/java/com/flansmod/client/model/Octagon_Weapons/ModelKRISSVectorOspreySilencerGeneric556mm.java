//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KRISS Vector Osprey Silencer - Generic@5.56mm
// Model Creator: 
// Created on: 29.09.2019 - 18:59:49
// Last changed on: 29.09.2019 - 18:59:49

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelKRISSVectorOspreySilencerGeneric556mm extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelKRISSVectorOspreySilencerGeneric556mm() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[14];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 364
		attachmentModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 365
		attachmentModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 366
		attachmentModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 367
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 368
		attachmentModel[5] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 369
		attachmentModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 370
		attachmentModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 371
		attachmentModel[8] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 372
		attachmentModel[9] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 373
		attachmentModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 374
		attachmentModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 375
		attachmentModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 376
		attachmentModel[13] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 377

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 84, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 364
		attachmentModel[0].setRotationPoint(0F, -7.5F, -1.5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 365
		attachmentModel[1].setRotationPoint(0F, -1F, 2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 366
		attachmentModel[2].setRotationPoint(0F, -2F, -4.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 367
		attachmentModel[3].setRotationPoint(0F, 2F, -4.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 84, 1, 7, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		attachmentModel[4].setRotationPoint(0F, 3.5F, -3.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 369
		attachmentModel[5].setRotationPoint(0F, -4.5F, -4.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 370
		attachmentModel[6].setRotationPoint(0F, -2F, 2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 371
		attachmentModel[7].setRotationPoint(0F, 1F, 2F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 372
		attachmentModel[8].setRotationPoint(0F, 1F, -4.5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 373
		attachmentModel[9].setRotationPoint(0F, -1F, -4.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 81, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 374
		attachmentModel[10].setRotationPoint(3F, -4.5F, -4.5F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 81, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 375
		attachmentModel[11].setRotationPoint(3F, -1F, -4.5F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 81, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 376
		attachmentModel[12].setRotationPoint(3F, -1F, 1F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 81, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 377
		attachmentModel[13].setRotationPoint(3F, 1F, -4.5F);



		flipAll();
	}
}