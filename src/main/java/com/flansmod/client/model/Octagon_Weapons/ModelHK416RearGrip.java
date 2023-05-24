//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416RearGrip
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416RearGrip extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416RearGrip() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[20];
		attachmentModel[0] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 95
		attachmentModel[1] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 96
		attachmentModel[2] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 97
		attachmentModel[3] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 98
		attachmentModel[4] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 99
		attachmentModel[5] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 100
		attachmentModel[6] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 101
		attachmentModel[7] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 102
		attachmentModel[8] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 103
		attachmentModel[9] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 104
		attachmentModel[10] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 405
		attachmentModel[11] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 406
		attachmentModel[12] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 407
		attachmentModel[13] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 554
		attachmentModel[14] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 555
		attachmentModel[15] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 489
		attachmentModel[16] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 651
		attachmentModel[17] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 652
		attachmentModel[18] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 653
		attachmentModel[19] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 602

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 95
		attachmentModel[0].setRotationPoint(-8F, 0F, -3.5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 6, 6, 7, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 96
		attachmentModel[1].setRotationPoint(-10F, 4F, -3.5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 8, 9, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // Box 97
		attachmentModel[2].setRotationPoint(-12F, 10F, -3.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 98
		attachmentModel[3].setRotationPoint(-19F, 28F, -3.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 2F); // Box 99
		attachmentModel[4].setRotationPoint(-4F, 10F, -1.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 4F, -2F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, 4F, -2F, 0F); // Box 100
		attachmentModel[5].setRotationPoint(-15F, 10F, -1.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F, 0F, 1F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 1F, 0F, 4F, 0F, 0F, -3F, 0F, 2F, -3F, 0F, 2F, 4F, 0F, 0F); // Box 101
		attachmentModel[6].setRotationPoint(-19F, 18F, -1.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0.5F, 0F, 4F, 0F, 0F, -3F, 0F, 2F, -3F, 0F, 2F, 4F, 0F, 0F); // Box 102
		attachmentModel[7].setRotationPoint(-11F, 4F, -1.5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, -1F, -1F); // Box 103
		attachmentModel[8].setRotationPoint(-23F, 28F, -2.5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 104
		attachmentModel[9].setRotationPoint(-9F, 28F, -1.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 9, 9, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 405
		attachmentModel[10].setRotationPoint(-16F, 19F, -3.5F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 2F); // Box 406
		attachmentModel[11].setRotationPoint(-7F, 19F, -1.5F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 407
		attachmentModel[12].setRotationPoint(-9F, 29F, -1.5F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 554
		attachmentModel[13].setRotationPoint(-2F, 10F, -1.5F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F); // Box 555
		attachmentModel[14].setRotationPoint(-11F, 0F, -1.5F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 489
		attachmentModel[15].setRotationPoint(-4F, 16F, -1.5F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		attachmentModel[16].setRotationPoint(-4F, 4F, -3.5F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		attachmentModel[17].setRotationPoint(-4F, 9F, -2.5F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 653
		attachmentModel[18].setRotationPoint(-4F, 9F, -1.5F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		attachmentModel[19].setRotationPoint(-1F, 1F, -3.5F);
	}
}