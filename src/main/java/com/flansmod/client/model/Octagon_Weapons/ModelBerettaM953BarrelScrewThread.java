//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BerettaM953BarrelScrewThread
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBerettaM953BarrelScrewThread extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBerettaM953BarrelScrewThread() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[19];
		attachmentModel[0] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 217
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 231
		attachmentModel[2] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 232
		attachmentModel[3] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 337
		attachmentModel[4] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 338
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 339
		attachmentModel[6] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 340
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 341
		attachmentModel[8] = new ModelRendererTurbo(this, 89, 249, textureX, textureY); // Box 342
		attachmentModel[9] = new ModelRendererTurbo(this, 1, 77, textureX, textureY); // Box 343
		attachmentModel[10] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 344
		attachmentModel[11] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 345
		attachmentModel[12] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 346
		attachmentModel[13] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 347
		attachmentModel[14] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Box 348
		attachmentModel[15] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 349
		attachmentModel[16] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 350
		attachmentModel[17] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Box 351
		attachmentModel[18] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Box 352

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 217
		attachmentModel[0].setRotationPoint(0F, -3.5F, -2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 231
		attachmentModel[1].setRotationPoint(0F, -3.5F, 1F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 232
		attachmentModel[2].setRotationPoint(0F, -2.5F, -1F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 39, 2, 1, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		attachmentModel[3].setRotationPoint(0F, -8F, -2.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 39, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		attachmentModel[4].setRotationPoint(0F, -6F, -2.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 39, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 339
		attachmentModel[5].setRotationPoint(0F, -4F, -2.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 39, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		attachmentModel[6].setRotationPoint(0F, -3.5F, -1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 39, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 341
		attachmentModel[7].setRotationPoint(0F, -4F, 1.5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 39, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		attachmentModel[8].setRotationPoint(0F, -6F, 1.5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 39, 2, 1, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		attachmentModel[9].setRotationPoint(0F, -8F, 1.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 39, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		attachmentModel[10].setRotationPoint(0F, -7.5F, -1F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		attachmentModel[11].setRotationPoint(39F, -7.5F, -1F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 346
		attachmentModel[12].setRotationPoint(39F, -3.5F, -1F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 347
		attachmentModel[13].setRotationPoint(39F, -6F, -2F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		attachmentModel[14].setRotationPoint(39F, -6F, 1F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 349
		attachmentModel[15].setRotationPoint(39F, -7F, 1F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 350
		attachmentModel[16].setRotationPoint(39F, -7F, -2F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		attachmentModel[17].setRotationPoint(39F, -4F, -2F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 352
		attachmentModel[18].setRotationPoint(39F, -4F, 1F);

		muzzleFlashPoint.set(42F / 16F, 5F / 16F, 0F);

		flipAll();
	}
}