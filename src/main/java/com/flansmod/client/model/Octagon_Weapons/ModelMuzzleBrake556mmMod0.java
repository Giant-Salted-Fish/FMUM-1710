//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Muzzle Brake@5.56mm Mod 0
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMuzzleBrake556mmMod0 extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelMuzzleBrake556mmMod0() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[24];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 473
		attachmentModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 476
		attachmentModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 477
		attachmentModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 489
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 491
		attachmentModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 495
		attachmentModel[6] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 496
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 497
		attachmentModel[8] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 498
		attachmentModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 502
		attachmentModel[10] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 503
		attachmentModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 505
		attachmentModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 506
		attachmentModel[13] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 507
		attachmentModel[14] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 508
		attachmentModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 509
		attachmentModel[16] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 510
		attachmentModel[17] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 24
		attachmentModel[18] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 25
		attachmentModel[19] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 26
		attachmentModel[20] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 21
		attachmentModel[21] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 22
		attachmentModel[22] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 23
		attachmentModel[23] = new ModelRendererTurbo(this, 45, 11, textureX, textureY); // Box 24

		attachmentModel[0].addShapeBox(0F, -2F, 2F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		attachmentModel[0].setRotationPoint(0F, -1F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 5F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		attachmentModel[1].setRotationPoint(0F, -1F, -3F);

		attachmentModel[2].addShapeBox(0F, 3F, 4F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 477
		attachmentModel[2].setRotationPoint(0F, -2F, -2F);

		attachmentModel[3].addShapeBox(0F, 1F, 3F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		attachmentModel[3].setRotationPoint(9F, -2F, -2F);

		attachmentModel[4].addShapeBox(0F, 1F, 3F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 491
		attachmentModel[4].setRotationPoint(3F, 0F, -4F);

		attachmentModel[5].addShapeBox(0F, -2F, 4F, 4, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 495
		attachmentModel[5].setRotationPoint(0F, -1F, -3F);

		attachmentModel[6].addShapeBox(0F, 3F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 496
		attachmentModel[6].setRotationPoint(0F, -2F, -3F);

		attachmentModel[7].addShapeBox(0F, 3F, 2F, 10, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		attachmentModel[7].setRotationPoint(0F, -1F, -3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		attachmentModel[8].setRotationPoint(0F, -1F, -3F);

		attachmentModel[9].addShapeBox(0F, 0F, 5F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		attachmentModel[9].setRotationPoint(5F, -1F, -4F);

		attachmentModel[10].addShapeBox(0F, 0F, 5F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		attachmentModel[10].setRotationPoint(7F, -1F, -4F);

		attachmentModel[11].addShapeBox(0F, -2F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 505
		attachmentModel[11].setRotationPoint(9F, -1F, -1F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		attachmentModel[12].setRotationPoint(9F, -1F, -3F);

		attachmentModel[13].addShapeBox(0F, -2F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 507
		attachmentModel[13].setRotationPoint(7F, -1F, -1F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		attachmentModel[14].setRotationPoint(7F, -1F, -3F);

		attachmentModel[15].addShapeBox(0F, -2F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 509
		attachmentModel[15].setRotationPoint(5F, -1F, -1F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		attachmentModel[16].setRotationPoint(5F, -1F, -3F);

		attachmentModel[17].addShapeBox(0F, 1F, 3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 24
		attachmentModel[17].setRotationPoint(3F, -3F, -4F);

		attachmentModel[18].addShapeBox(0F, 0F, 5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		attachmentModel[18].setRotationPoint(3F, -1F, -4F);

		attachmentModel[19].addShapeBox(0F, 0F, 5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		attachmentModel[19].setRotationPoint(3F, -1F, -7F);

		attachmentModel[20].addShapeBox(0F, -2F, 0F, 1, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		attachmentModel[20].setRotationPoint(5F, 3F, -2F);

		attachmentModel[21].addShapeBox(0F, -2F, 0F, 1, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		attachmentModel[21].setRotationPoint(7F, 3F, -2F);

		attachmentModel[22].addShapeBox(0F, -2F, 0F, 1, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		attachmentModel[22].setRotationPoint(9F, 3F, -2F);

		attachmentModel[23].addShapeBox(0F, -2F, 4F, 4, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 24
		attachmentModel[23].setRotationPoint(0F, -1F, -6F);

		muzzleFlashPoint = new Vector3f(4F / 16F, 0F, 0F);

		flipAll();
	}
}