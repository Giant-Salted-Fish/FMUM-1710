//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC WTS-36 Hollow Stock
// Model Creator: 
// Created on: 22.12.2019 - 19:48:03
// Last changed on: 22.12.2019 - 19:48:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICWTS36HollowStock extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelCICWTS36HollowStock() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[21];
		attachmentModel[0] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 253
		attachmentModel[1] = new ModelRendererTurbo(this, 93, 6, textureX, textureY); // Box 254
		attachmentModel[2] = new ModelRendererTurbo(this, 63, 21, textureX, textureY); // Box 263
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 265
		attachmentModel[4] = new ModelRendererTurbo(this, 18, 1, textureX, textureY); // Box 266
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 267
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 270
		attachmentModel[7] = new ModelRendererTurbo(this, 19, 2, textureX, textureY); // Box 363
		attachmentModel[8] = new ModelRendererTurbo(this, 63, 5, textureX, textureY); // Box 410
		attachmentModel[9] = new ModelRendererTurbo(this, 83, 6, textureX, textureY); // Box 411
		attachmentModel[10] = new ModelRendererTurbo(this, 111, 35, textureX, textureY); // Box 412
		attachmentModel[11] = new ModelRendererTurbo(this, 49, 7, textureX, textureY); // Box 455
		attachmentModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		attachmentModel[13] = new ModelRendererTurbo(this, 32, 1, textureX, textureY); // Box 13
		attachmentModel[14] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 14
		attachmentModel[15] = new ModelRendererTurbo(this, 85, 45, textureX, textureY); // Box 51
		attachmentModel[16] = new ModelRendererTurbo(this, 70, 27, textureX, textureY); // Box 36
		attachmentModel[17] = new ModelRendererTurbo(this, 91, 29, textureX, textureY); // Box 37
		attachmentModel[18] = new ModelRendererTurbo(this, 64, 43, textureX, textureY); // Box 39
		attachmentModel[19] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 40
		attachmentModel[20] = new ModelRendererTurbo(this, 22, 39, textureX, textureY); // Box 41

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 253
		attachmentModel[0].setRotationPoint(-4F, -2F, -7F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 8, 5, 8, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		attachmentModel[1].setRotationPoint(-5F, 18F, -4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		attachmentModel[2].setRotationPoint(-5F, 23F, -1F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		attachmentModel[3].setRotationPoint(0F, 8F, -7F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 266
		attachmentModel[4].setRotationPoint(0F, 15F, -7F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		attachmentModel[5].setRotationPoint(0F, 8F, 6F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		attachmentModel[6].setRotationPoint(0F, 15F, 6F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, 3F); // Box 363
		attachmentModel[7].setRotationPoint(-4F, -7F, -4F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		attachmentModel[8].setRotationPoint(0F, -2F, -5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 411
		attachmentModel[9].setRotationPoint(0F, -5F, -2F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		attachmentModel[10].setRotationPoint(0F, 2F, -2F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 1F); // Box 455
		attachmentModel[11].setRotationPoint(-4F, -8F, -3F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 1, 21, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		attachmentModel[12].setRotationPoint(-5F, -3F, -7F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 1, 21, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		attachmentModel[13].setRotationPoint(-1F, -3F, -7F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		attachmentModel[14].setRotationPoint(-4F, 17F, -7F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		attachmentModel[15].setRotationPoint(-4F, -3F, -7F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -3F, 0F); // Box 36
		attachmentModel[16].setRotationPoint(-4F, 4F, -7F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 37
		attachmentModel[17].setRotationPoint(-4F, 4F, -7F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 39
		attachmentModel[18].setRotationPoint(-4F, 10F, -7F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 40
		attachmentModel[19].setRotationPoint(-4F, 16F, -7F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -3F, 0F); // Box 41
		attachmentModel[20].setRotationPoint(-4F, 10F, -7F);

		flipAll();
	}
}