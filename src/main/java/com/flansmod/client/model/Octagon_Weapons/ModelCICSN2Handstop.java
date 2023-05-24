//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC SN-2 Handstop
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelCICSN2Handstop extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelCICSN2Handstop() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[26];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 487
		attachmentModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 489
		attachmentModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 490
		attachmentModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 491
		attachmentModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 493
		attachmentModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 494
		attachmentModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 495
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 496
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 497
		attachmentModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 498
		attachmentModel[10] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 499
		attachmentModel[11] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 500
		attachmentModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 501
		attachmentModel[13] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 502
		attachmentModel[14] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 503
		attachmentModel[15] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 504
		attachmentModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 505
		attachmentModel[17] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 506
		attachmentModel[18] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 507
		attachmentModel[19] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 508
		attachmentModel[20] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 509
		attachmentModel[21] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 511
		attachmentModel[22] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 24
		attachmentModel[23] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 24
		attachmentModel[24] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 25
		attachmentModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		attachmentModel[0].setRotationPoint(-9F, 0F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		attachmentModel[1].setRotationPoint(-9F, 1F, -2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		attachmentModel[2].setRotationPoint(-9F, 7F, -2F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 491
		attachmentModel[3].setRotationPoint(-8F, 7F, -1F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1F, 0F, 1.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 493
		attachmentModel[4].setRotationPoint(-8F, 4F, -1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -2F, 0F, 2F, 3F, 0F, 1F, 3F, 0F, 1F, -2F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F); // Box 494
		attachmentModel[5].setRotationPoint(-7F, 1F, -1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		attachmentModel[6].setRotationPoint(-9F, 9F, -1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 496
		attachmentModel[7].setRotationPoint(-8F, 9F, -1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		attachmentModel[8].setRotationPoint(20F, 1F, -2F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		attachmentModel[9].setRotationPoint(20F, 3F, -1F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 499
		attachmentModel[10].setRotationPoint(19F, 3F, 0F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 500
		attachmentModel[11].setRotationPoint(19F, 1F, -2F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		attachmentModel[12].setRotationPoint(11F, -2F, 3F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 502
		attachmentModel[13].setRotationPoint(16F, -1F, 3F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		attachmentModel[14].setRotationPoint(-4F, -2F, 3F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 504
		attachmentModel[15].setRotationPoint(-8F, -1F, 3F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		attachmentModel[16].setRotationPoint(-1F, -2F, -4F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		attachmentModel[17].setRotationPoint(11F, -2F, -4F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 507
		attachmentModel[18].setRotationPoint(16F, -1F, -4F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		attachmentModel[19].setRotationPoint(-4F, -2F, -4F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 509
		attachmentModel[20].setRotationPoint(-8F, -1F, -4F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 511
		attachmentModel[21].setRotationPoint(8F, -2F, 3.5F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 24
		attachmentModel[22].setRotationPoint(0F, -2F, 3.5F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 24
		attachmentModel[23].setRotationPoint(19F, 3F, -1F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, -1F, -1F, 0F); // Box 25
		attachmentModel[24].setRotationPoint(-8F, 9F, 0F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		attachmentModel[25].setRotationPoint(-1F, -2F, 3F);
		
		armTranslate = new Vector3f(-5F / 160F, 10F / 160F, 6.5F / 160F); //6F
	}
}