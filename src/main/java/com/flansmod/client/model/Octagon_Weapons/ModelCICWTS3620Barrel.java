//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CICWTS3620Barrel
// Model Creator: 
// Created on: 22.12.2019 - 19:48:03
// Last changed on: 22.12.2019 - 19:48:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelCICWTS3620Barrel extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelCICWTS3620Barrel() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[30];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 53
		attachmentModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 54
		attachmentModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 55
		attachmentModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 56
		attachmentModel[8] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 127
		attachmentModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 144
		attachmentModel[10] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 145
		attachmentModel[11] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 489
		attachmentModel[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 490
		attachmentModel[13] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 491
		attachmentModel[14] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 492
		attachmentModel[15] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 493
		attachmentModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 494
		attachmentModel[17] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 363
		attachmentModel[18] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 364
		attachmentModel[19] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 365
		attachmentModel[20] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 367
		attachmentModel[21] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 368
		attachmentModel[22] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 369
		attachmentModel[23] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 370
		attachmentModel[24] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 371
		attachmentModel[25] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 372
		attachmentModel[26] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 373
		attachmentModel[27] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 374
		attachmentModel[28] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 375
		attachmentModel[29] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 478

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 147, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 0
		attachmentModel[0].setRotationPoint(0F, -3F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 147, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		attachmentModel[1].setRotationPoint(0F, -1F, -3F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 147, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		attachmentModel[2].setRotationPoint(0F, -1F, 1F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 147, 2, 2, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		attachmentModel[3].setRotationPoint(0F, 1F, -1F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 53
		attachmentModel[4].setRotationPoint(147F, -2F, -1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		attachmentModel[5].setRotationPoint(147F, 1F, -1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		attachmentModel[6].setRotationPoint(147F, -1F, -2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		attachmentModel[7].setRotationPoint(147F, -1F, 1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		attachmentModel[8].setRotationPoint(100F, -6F, -2F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		attachmentModel[9].setRotationPoint(100F, -3.5F, -1.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		attachmentModel[10].setRotationPoint(95F, -5.5F, -1.5F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 2F); // Box 489
		attachmentModel[11].setRotationPoint(6.5F, -4F, -2F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 490
		attachmentModel[12].setRotationPoint(10.5F, -3F, -1F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 3F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F); // Box 491
		attachmentModel[13].setRotationPoint(10.5F, 2F, -1F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 492
		attachmentModel[14].setRotationPoint(6.5F, 2F, -2F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0.5F, 0F, 1F, 7F, -1F, 0F, 0F, 0F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, 1F, 7F, -1F, 0F, 0F, 0F, -7F, 0.5F, 0F, -7F); // Box 493
		attachmentModel[15].setRotationPoint(6.5F, -2F, 3F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 7F, -1F, -5F, 0.5F, 0F, -4F, 0.5F, 0F, 0F, 0F, 0F, 0F, 7F, -1F, -5F, 0.5F, 0F, -4F); // Box 494
		attachmentModel[16].setRotationPoint(6.5F, -2F, -4F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 363
		attachmentModel[17].setRotationPoint(100F, -4F, -1.5F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 364
		attachmentModel[18].setRotationPoint(100F, -7F, -1F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		attachmentModel[19].setRotationPoint(95F, -6.5F, -0.5F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		attachmentModel[20].setRotationPoint(112F, -6F, -1F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 368
		attachmentModel[21].setRotationPoint(114F, -6F, -1F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		attachmentModel[22].setRotationPoint(115F, -5F, -1F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		attachmentModel[23].setRotationPoint(113.5F, -4F, -1F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 371
		attachmentModel[24].setRotationPoint(113F, -6F, -1F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 372
		attachmentModel[25].setRotationPoint(111F, -6F, -1F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 373
		attachmentModel[26].setRotationPoint(114.5F, -6F, -1F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 374
		attachmentModel[27].setRotationPoint(114F, -4F, -1F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 375
		attachmentModel[28].setRotationPoint(115F, -4F, -1F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 478
		attachmentModel[29].setRotationPoint(95F, -4.5F, -0.5F);

		muzzleFlashPoint = new Vector3f(150F / 16F, 0F, 0F);

		flipAll();
	}
}