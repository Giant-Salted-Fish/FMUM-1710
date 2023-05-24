//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CICWTS36Stock
// Model Creator: 
// Created on: 22.12.2019 - 19:48:03
// Last changed on: 22.12.2019 - 19:48:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICWTS36Stock extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCICWTS36Stock() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[12];
		attachmentModel[0] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 253
		attachmentModel[1] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 254
		attachmentModel[2] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 263
		attachmentModel[3] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 265
		attachmentModel[4] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 266
		attachmentModel[5] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 267
		attachmentModel[6] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 270
		attachmentModel[7] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 363
		attachmentModel[8] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 410
		attachmentModel[9] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 411
		attachmentModel[10] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 412
		attachmentModel[11] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 455

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 5, 21, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		attachmentModel[0].setRotationPoint(-5F, -3F, -7F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 8, 5, 12, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 254
		attachmentModel[1].setRotationPoint(-5F, 18F, -6F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 263
		attachmentModel[2].setRotationPoint(-5F, 23F, -1F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		attachmentModel[3].setRotationPoint(0F, 7F, -7F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 266
		attachmentModel[4].setRotationPoint(0F, 15F, -7F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		attachmentModel[5].setRotationPoint(0F, 7F, 6F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		attachmentModel[6].setRotationPoint(0F, 15F, 4F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 4, 5, 12, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, -2F, 1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 1F, -1F, 1F); // Box 363
		attachmentModel[7].setRotationPoint(-4F, -7F, -6F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		attachmentModel[8].setRotationPoint(0F, -2F, -5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 411
		attachmentModel[9].setRotationPoint(0F, -5F, -4F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 412
		attachmentModel[10].setRotationPoint(0F, 2F, -4F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 1F); // Box 455
		attachmentModel[11].setRotationPoint(-4F, -8F, -3F);

		flipAll();
	}
}