//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CICWTS36BarrelExtension
// Model Creator: 
// Created on: 22.12.2019 - 19:48:03
// Last changed on: 22.12.2019 - 19:48:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICWTS36BarrelExtension extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCICWTS36BarrelExtension() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[20];
		attachmentModel[0] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 455
		attachmentModel[1] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 456
		attachmentModel[2] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 457
		attachmentModel[3] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 458
		attachmentModel[4] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 444
		attachmentModel[5] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 445
		attachmentModel[6] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 446
		attachmentModel[7] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 447
		attachmentModel[8] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 448
		attachmentModel[9] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 449
		attachmentModel[10] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 450
		attachmentModel[11] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 451
		attachmentModel[12] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 452
		attachmentModel[13] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 453
		attachmentModel[14] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 454
		attachmentModel[15] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 455
		attachmentModel[16] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 456
		attachmentModel[17] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 457
		attachmentModel[18] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 458
		attachmentModel[19] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 459

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 455
		attachmentModel[0].setRotationPoint(0F, -2F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		attachmentModel[1].setRotationPoint(0F, -2F, 3F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 457
		attachmentModel[2].setRotationPoint(0F, -4F, -2F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, 0F, -1F, 1.5F, 0F, -1F, 1F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 458
		attachmentModel[3].setRotationPoint(0F, 1F, -1F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 444
		attachmentModel[4].setRotationPoint(0F, -4F, -2F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 445
		attachmentModel[5].setRotationPoint(0F, -4F, 1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		attachmentModel[6].setRotationPoint(0F, 1F, 1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 447
		attachmentModel[7].setRotationPoint(0F, 1F, -2F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		attachmentModel[8].setRotationPoint(0F, 3F, -2F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1.5F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, -1F, 0F, -2F, -1F, 0F); // Box 449
		attachmentModel[9].setRotationPoint(0F, 0F, -3F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -2F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, 1.5F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 450
		attachmentModel[10].setRotationPoint(0F, 0F, 1F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 451
		attachmentModel[11].setRotationPoint(0F, -3F, -1F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 452
		attachmentModel[12].setRotationPoint(9F, -4F, -2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2.5F, 0F, -1F, 2.5F); // Box 453
		attachmentModel[13].setRotationPoint(9F, -4F, 1F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 454
		attachmentModel[14].setRotationPoint(9F, -2F, 3F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 455
		attachmentModel[15].setRotationPoint(9F, -2F, -4F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 456
		attachmentModel[16].setRotationPoint(9F, 3F, -2F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 457
		attachmentModel[17].setRotationPoint(9F, -4F, -2F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 458
		attachmentModel[18].setRotationPoint(9F, 1F, -2F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 459
		attachmentModel[19].setRotationPoint(9F, 1F, 1F);

		flipAll();
	}
}