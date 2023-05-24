//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC IS-9 Sight
// Model Creator: 
// Created on: 09.07.2019 - 14:05:25
// Last changed on: 09.07.2019 - 14:05:25

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAtSight;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICIS9RearSight extends ModelAtSight //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	private ModelRendererTurbo[] lightModel;

	public ModelCICIS9RearSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[36];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 343
		attachmentModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 346
		attachmentModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 347
		attachmentModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 354
		attachmentModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 355
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 18, textureX, textureY); // Box 356
		attachmentModel[6] = new ModelRendererTurbo(this, 20, 2, textureX, textureY); // Box 357
		attachmentModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 358
		attachmentModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 359
		attachmentModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 360
		attachmentModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 361
		attachmentModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 362
		attachmentModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 363
		attachmentModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 364
		attachmentModel[14] = new ModelRendererTurbo(this, 34, 39, textureX, textureY); // Box 365
		attachmentModel[15] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 366
		attachmentModel[16] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 369
		attachmentModel[17] = new ModelRendererTurbo(this, 28, 21, textureX, textureY); // Box 370
		attachmentModel[18] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 371
		attachmentModel[19] = new ModelRendererTurbo(this, 47, 17, textureX, textureY); // Box 372
		attachmentModel[20] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 383
		attachmentModel[21] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 384
		attachmentModel[22] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 385
		attachmentModel[23] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 386
		attachmentModel[24] = new ModelRendererTurbo(this, 38, 22, textureX, textureY); // Box 387
		attachmentModel[25] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 388
		attachmentModel[26] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 389
		attachmentModel[27] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 390
		attachmentModel[28] = new ModelRendererTurbo(this, 13, 17, textureX, textureY); // Box 391
		attachmentModel[29] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 392
		attachmentModel[30] = new ModelRendererTurbo(this, 25, 39, textureX, textureY); // Box 393
		attachmentModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 394
		attachmentModel[32] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 395
		attachmentModel[33] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 396
		attachmentModel[34] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 397
		attachmentModel[35] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 398

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 343
		attachmentModel[0].setRotationPoint(-1.5F, -1F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		attachmentModel[1].setRotationPoint(-1.5F, 0F, 3F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		attachmentModel[2].setRotationPoint(-1.5F, 0F, -4F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 354
		attachmentModel[3].setRotationPoint(-0.5F, -3F, -4F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		attachmentModel[4].setRotationPoint(-0.5F, -3F, 2F);

		attachmentModel[5].addShapeBox(-1F, -1F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		attachmentModel[5].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[6].addShapeBox(-1F, -8.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		attachmentModel[6].setRotationPoint(1.5F, -2F, 1F);

		attachmentModel[7].addShapeBox(-1F, -8.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		attachmentModel[7].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[8].addShapeBox(-1F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		attachmentModel[8].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[9].addShapeBox(-1F, -10F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		attachmentModel[9].setRotationPoint(1.5F, -2F, -0.5F);

		attachmentModel[10].addShapeBox(-1F, -7F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		attachmentModel[10].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[11].addShapeBox(0F, -7F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		attachmentModel[11].setRotationPoint(1.5F, -2F, -2.5F);

		attachmentModel[12].addShapeBox(-1F, -2F, 0F, 2, 1, 4, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		attachmentModel[12].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		attachmentModel[13].setRotationPoint(-0.5F, 0F, -6.5F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 365
		attachmentModel[14].setRotationPoint(-0.5F, -1F, -7F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 366
		attachmentModel[15].setRotationPoint(-0.5F, 1F, -7F);

		attachmentModel[16].addShapeBox(-1F, -10F, 0F, 1, 1, 1, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		attachmentModel[16].setRotationPoint(1.5F, -2F, -1.5F);

		attachmentModel[17].addShapeBox(-1F, -10F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 370
		attachmentModel[17].setRotationPoint(1.5F, -2F, 0.5F);

		attachmentModel[18].addShapeBox(-1F, -8F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		attachmentModel[18].setRotationPoint(1.5F, -2F, 1F);

		attachmentModel[19].addShapeBox(-1F, -8F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 372
		attachmentModel[19].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[20].addShapeBox(-1F, -4.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		attachmentModel[20].setRotationPoint(1.5F, -2F, 0.5F);

		attachmentModel[21].addShapeBox(-1F, -4.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		attachmentModel[21].setRotationPoint(1.5F, -2F, -1.5F);

		attachmentModel[22].addShapeBox(-1F, -3.5F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 385
		attachmentModel[22].setRotationPoint(1.5F, -2F, -0.5F);

		attachmentModel[23].addShapeBox(-1F, -5F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386
		attachmentModel[23].setRotationPoint(1.5F, -2F, -1.5F);

		attachmentModel[24].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		attachmentModel[24].setRotationPoint(1.5F, -2F, -4F);
		attachmentModel[24].rotateAngleZ = -0.78539816F;

		attachmentModel[25].addShapeBox(0F, -6F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 388
		attachmentModel[25].setRotationPoint(1.5F, -2F, -2.5F);

		attachmentModel[26].addShapeBox(0F, -6F, 0F, 2, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		attachmentModel[26].setRotationPoint(1.5F, -2F, 1.5F);

		attachmentModel[27].addShapeBox(-1F, -4F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		attachmentModel[27].setRotationPoint(1.5F, -2F, 1.5F);

		attachmentModel[28].addShapeBox(-1F, -4F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		attachmentModel[28].setRotationPoint(1.5F, -2F, -2.5F);

		attachmentModel[29].addShapeBox(0F, -7F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		attachmentModel[29].setRotationPoint(1.5F, -2F, 1.5F);

		attachmentModel[30].addShapeBox(0F, -4.5F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		attachmentModel[30].setRotationPoint(1.5F, -2F, -1.5F);

		attachmentModel[31].addShapeBox(0F, -4.5F, 0F, 1, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		attachmentModel[31].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[32].addShapeBox(0F, -4.5F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		attachmentModel[32].setRotationPoint(1.5F, -2F, 1F);

		attachmentModel[33].addShapeBox(0F, -7F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		attachmentModel[33].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[34].addShapeBox(-1F, -1F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		attachmentModel[34].setRotationPoint(1.5F, -2F, 4F);
		attachmentModel[34].rotateAngleZ = -2.35619449F;

		attachmentModel[35].addShapeBox(0F, -6F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 398
		attachmentModel[35].setRotationPoint(1.5F, -2F, -2F);
		
		lightModel = new ModelRendererTurbo[2];
		lightModel[0] = new ModelRendererTurbo(this, 2, 30, textureX, textureY); // Box 373
		lightModel[1] = new ModelRendererTurbo(this, 2, 33, textureX, textureY); // Box 374

		lightModel[0].addShapeBox(-1.01F, -8.4F, 0F, 1, 1, 1, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 373
		lightModel[0].setRotationPoint(1.5F, -2F, 1.1F);

		lightModel[1].addShapeBox(-1.01F, -8.4F, 0F, 1, 1, 1, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 374
		lightModel[1].setRotationPoint(1.5F, -2F, -1.9F);

		flipAll();
		flip(lightModel);
	}
	
	@Override
	public void render(float f)
	{
		render(attachmentModel, f);
		glowOn();
		render(lightModel, f);
		glowOff();
	}
	
	@Override
	public void renderWithoutGlow(float f)
	{
		render(attachmentModel, f);
		render(lightModel, f);
	}
}