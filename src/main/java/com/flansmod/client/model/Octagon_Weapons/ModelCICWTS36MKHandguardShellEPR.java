//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC WTS-36 MK2 Handguard
// Model Creator: 
// Created on: 22.12.2019 - 19:48:03
// Last changed on: 22.12.2019 - 19:48:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICWTS36MKHandguardShellEPR extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelCICWTS36MKHandguardShellEPR() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[14];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 421
		attachmentModel[1] = new ModelRendererTurbo(this, 103, 21, textureX, textureY); // Box 422
		attachmentModel[2] = new ModelRendererTurbo(this, 2, 28, textureX, textureY); // Box 423
		attachmentModel[3] = new ModelRendererTurbo(this, 60, 63, textureX, textureY); // Box 424
		attachmentModel[4] = new ModelRendererTurbo(this, 128, 63, textureX, textureY); // Box 425
		attachmentModel[5] = new ModelRendererTurbo(this, 106, 63, textureX, textureY); // Box 426
		attachmentModel[6] = new ModelRendererTurbo(this, 95, 61, textureX, textureY); // Box 427
		attachmentModel[7] = new ModelRendererTurbo(this, 139, 61, textureX, textureY); // Box 428
		attachmentModel[8] = new ModelRendererTurbo(this, 84, 63, textureX, textureY); // Box 429
		attachmentModel[9] = new ModelRendererTurbo(this, 117, 61, textureX, textureY); // Box 430
		attachmentModel[10] = new ModelRendererTurbo(this, 73, 61, textureX, textureY); // Box 431
		attachmentModel[11] = new ModelRendererTurbo(this, 150, 63, textureX, textureY); // Box 432
		attachmentModel[12] = new ModelRendererTurbo(this, 18, 63, textureX, textureY); // Box 433
		attachmentModel[13] = new ModelRendererTurbo(this, 91, 18, textureX, textureY); // Box 434

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 44, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		attachmentModel[0].setRotationPoint(-21F, 1.5F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 44, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		attachmentModel[1].setRotationPoint(-21F, 0.5F, -2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 30, 2, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		attachmentModel[2].setRotationPoint(-7F, -1.5F, -2F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		attachmentModel[3].setRotationPoint(-21F, 2.5F, -3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		attachmentModel[4].setRotationPoint(-16F, 2.5F, -3F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		attachmentModel[5].setRotationPoint(-8F, 2.5F, -3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		attachmentModel[6].setRotationPoint(-12F, 2.5F, -3F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		attachmentModel[7].setRotationPoint(0F, 2.5F, -3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		attachmentModel[8].setRotationPoint(-4F, 2.5F, -3F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		attachmentModel[9].setRotationPoint(8F, 2.5F, -3F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		attachmentModel[10].setRotationPoint(4F, 2.5F, -3F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		attachmentModel[11].setRotationPoint(16F, 2.5F, -3F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		attachmentModel[12].setRotationPoint(12F, 2.5F, -3F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		attachmentModel[13].setRotationPoint(20F, 2.5F, -3F);
	}
}