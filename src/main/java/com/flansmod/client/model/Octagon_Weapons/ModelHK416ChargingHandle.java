//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416ChargingHandle
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416ChargingHandle extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416ChargingHandle() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[19];
		attachmentModel[0] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 138
		attachmentModel[1] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 139
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 375
		attachmentModel[3] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 382
		attachmentModel[4] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 383
		attachmentModel[5] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 388
		attachmentModel[6] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 390
		attachmentModel[7] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 393
		attachmentModel[8] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 394
		attachmentModel[9] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 395
		attachmentModel[10] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 400
		attachmentModel[11] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 485
		attachmentModel[12] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 486
		attachmentModel[13] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 487
		attachmentModel[14] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 628
		attachmentModel[15] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 629
		attachmentModel[16] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 630
		attachmentModel[17] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 561
		attachmentModel[18] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 562

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		attachmentModel[0].setRotationPoint(0F, 0F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		attachmentModel[1].setRotationPoint(-2F, -0.5F, -6F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 37, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		attachmentModel[2].setRotationPoint(5F, 0F, -1.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		attachmentModel[3].setRotationPoint(1F, 0.5F, 3.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		attachmentModel[4].setRotationPoint(-2F, 0.5F, -6F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		attachmentModel[5].setRotationPoint(1F, 0.5F, 5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		attachmentModel[6].setRotationPoint(1F, -0.5F, 2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 393
		attachmentModel[7].setRotationPoint(-2F, 1.5F, -6F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 394
		attachmentModel[8].setRotationPoint(1F, 0.5F, 7F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 395
		attachmentModel[9].setRotationPoint(6F, 0.5F, 3.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 400
		attachmentModel[10].setRotationPoint(-1F, -0.5F, -7F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 485
		attachmentModel[11].setRotationPoint(0F, -0.5F, -6F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		attachmentModel[12].setRotationPoint(0F, -0.5F, 2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		attachmentModel[13].setRotationPoint(1F, -0.5F, -6F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		attachmentModel[14].setRotationPoint(5F, 1F, -1.5F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		attachmentModel[15].setRotationPoint(5F, 1F, 0.5F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		attachmentModel[16].setRotationPoint(40F, 2F, -1.5F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 561
		attachmentModel[17].setRotationPoint(-1F, -0.5F, 6F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 562
		attachmentModel[18].setRotationPoint(-1F, 1.5F, 6F);

		flipAll();
	}
}