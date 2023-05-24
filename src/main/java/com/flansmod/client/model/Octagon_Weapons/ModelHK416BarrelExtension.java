//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416BarrelExtension
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416BarrelExtension extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416BarrelExtension() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[20];
		attachmentModel[0] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 542
		attachmentModel[1] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 543
		attachmentModel[2] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 544
		attachmentModel[3] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 545
		attachmentModel[4] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 545
		attachmentModel[5] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 546
		attachmentModel[6] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 547
		attachmentModel[7] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 548
		attachmentModel[8] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 549
		attachmentModel[9] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 550
		attachmentModel[10] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 551
		attachmentModel[11] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 552
		attachmentModel[12] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 553
		attachmentModel[13] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 554
		attachmentModel[14] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 555
		attachmentModel[15] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 556
		attachmentModel[16] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 557
		attachmentModel[17] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 558
		attachmentModel[18] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 559
		attachmentModel[19] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 560

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		attachmentModel[0].setRotationPoint(0F, -2F, 3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 543
		attachmentModel[1].setRotationPoint(0F, -2F, -4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 544
		attachmentModel[2].setRotationPoint(0F, -4F, -2F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		attachmentModel[3].setRotationPoint(0F, 3F, -2F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 545
		attachmentModel[4].setRotationPoint(0F, -4F, 1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 546
		attachmentModel[5].setRotationPoint(0F, -4F, -2F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 547
		attachmentModel[6].setRotationPoint(0F, 1F, -2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		attachmentModel[7].setRotationPoint(0F, 1F, 1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, 0F, -1F, 1.5F, 0F, -1F, 1F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 549
		attachmentModel[8].setRotationPoint(0F, 1F, -1F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1.5F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, -1F, 0F, -2F, -1F, 0F); // Box 550
		attachmentModel[9].setRotationPoint(0F, 0F, -3F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -2F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, 1.5F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 551
		attachmentModel[10].setRotationPoint(0F, 0F, 1F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 552
		attachmentModel[11].setRotationPoint(0F, -3F, -1F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 553
		attachmentModel[12].setRotationPoint(9F, -4F, -2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 554
		attachmentModel[13].setRotationPoint(9F, -4F, -2F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 555
		attachmentModel[14].setRotationPoint(9F, 3F, -2F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2.5F, 0F, -1F, 2.5F); // Box 556
		attachmentModel[15].setRotationPoint(9F, -4F, 1F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 557
		attachmentModel[16].setRotationPoint(9F, -2F, -4F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 558
		attachmentModel[17].setRotationPoint(9F, -2F, 3F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 559
		attachmentModel[18].setRotationPoint(9F, 1F, -2F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 560
		attachmentModel[19].setRotationPoint(9F, 1F, 1F);
	}
}