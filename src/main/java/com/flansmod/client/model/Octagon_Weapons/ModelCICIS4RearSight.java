//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC IS-4 Sight
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAtSight;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICIS4RearSight extends ModelAtSight //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	private ModelRendererTurbo[] lightModel;

	public ModelCICIS4RearSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[34];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 301
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 302
		attachmentModel[2] = new ModelRendererTurbo(this, 27, 4, textureX, textureY); // Box 304
		attachmentModel[3] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 305
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 306
		attachmentModel[5] = new ModelRendererTurbo(this, 15, 18, textureX, textureY); // Box 308
		attachmentModel[6] = new ModelRendererTurbo(this, 57, 18, textureX, textureY); // Box 309
		attachmentModel[7] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 310
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 311
		attachmentModel[9] = new ModelRendererTurbo(this, 36, 1, textureX, textureY); // Box 321
		attachmentModel[10] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 356
		attachmentModel[11] = new ModelRendererTurbo(this, 22, 15, textureX, textureY); // Box 483
		attachmentModel[12] = new ModelRendererTurbo(this, 38, 16, textureX, textureY); // Box 484
		attachmentModel[13] = new ModelRendererTurbo(this, 11, 13, textureX, textureY); // Box 483
		attachmentModel[14] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 484
		attachmentModel[15] = new ModelRendererTurbo(this, 30, 1, textureX, textureY); // Box 485
		attachmentModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 519
		attachmentModel[17] = new ModelRendererTurbo(this, 24, 26, textureX, textureY); // Box 520
		attachmentModel[18] = new ModelRendererTurbo(this, 25, 46, textureX, textureY); // Box 521
		attachmentModel[19] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 522
		attachmentModel[20] = new ModelRendererTurbo(this, 14, 25, textureX, textureY); // Box 523
		attachmentModel[21] = new ModelRendererTurbo(this, 26, 22, textureX, textureY); // Box 524
		attachmentModel[22] = new ModelRendererTurbo(this, 16, 13, textureX, textureY); // Box 525
		attachmentModel[23] = new ModelRendererTurbo(this, 49, 38, textureX, textureY); // Box 526
		attachmentModel[24] = new ModelRendererTurbo(this, 35, 13, textureX, textureY); // Box 527
		attachmentModel[25] = new ModelRendererTurbo(this, 53, 9, textureX, textureY); // Box 528
		attachmentModel[26] = new ModelRendererTurbo(this, 57, 14, textureX, textureY); // Box 529
		attachmentModel[27] = new ModelRendererTurbo(this, 6, 35, textureX, textureY); // Box 532
		attachmentModel[28] = new ModelRendererTurbo(this, 16, 29, textureX, textureY); // Box 533
		attachmentModel[29] = new ModelRendererTurbo(this, 40, 16, textureX, textureY); // Box 534
		attachmentModel[30] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 535
		attachmentModel[31] = new ModelRendererTurbo(this, 35, 28, textureX, textureY); // Box 536
		attachmentModel[32] = new ModelRendererTurbo(this, 45, 28, textureX, textureY); // Box 537
		attachmentModel[33] = new ModelRendererTurbo(this, 58, 9, textureX, textureY); // Box 52

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		attachmentModel[0].setRotationPoint(-1F, 1F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		attachmentModel[1].setRotationPoint(-1F, 1F, 3F);

		attachmentModel[2].addShapeBox(1F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 304
		attachmentModel[2].setRotationPoint(-4F, -4F, 3F);

		attachmentModel[3].addShapeBox(-1.5F, -1.5F, -2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		attachmentModel[3].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[4].addShapeBox(-2.5F, -3.5F, -3.5F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		attachmentModel[4].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[5].addShapeBox(-1F, -6.5F, -2F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		attachmentModel[5].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[6].addShapeBox(-1F, -9.5F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 309
		attachmentModel[6].setRotationPoint(-1.5F, -2.5F, -1.5F);

		attachmentModel[7].addShapeBox(-1F, -8F, 1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		attachmentModel[7].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[8].addShapeBox(-1F, -8F, -2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		attachmentModel[8].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		attachmentModel[9].setRotationPoint(-0.5F, 0F, -6.5F);

		attachmentModel[10].addShapeBox(-1.5F, 0.5F, -2.5F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 356
		attachmentModel[10].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 483
		attachmentModel[11].setRotationPoint(0.5F, -1F, -7F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 484
		attachmentModel[12].setRotationPoint(0.5F, 1F, -7F);

		attachmentModel[13].addShapeBox(-1F, -9F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		attachmentModel[13].setRotationPoint(-1.5F, -2.5F, 1F);

		attachmentModel[14].addShapeBox(-1F, -7.5F, -2F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 484
		attachmentModel[14].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[15].addShapeBox(-1F, -7.5F, 1F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		attachmentModel[15].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[16].addShapeBox(-1.5F, -2.5F, -2.5F, 3, 1, 5, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		attachmentModel[16].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[17].addShapeBox(-2.5F, -8.5F, -3.5F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		attachmentModel[17].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[18].addShapeBox(-1.5F, -5F, 0F, 1, 1, 6, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F); // Box 521
		attachmentModel[18].setRotationPoint(-1F, -2.5F, -3F);

		attachmentModel[19].addShapeBox(-2.5F, -8.5F, 2.5F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		attachmentModel[19].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[20].addShapeBox(-1.5F, -9.5F, 2.5F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 523
		attachmentModel[20].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[21].addShapeBox(-1.5F, -9.5F, -3.5F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 524
		attachmentModel[21].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[22].addShapeBox(-1.5F, -5.5F, 0F, 2, 2, 2, 0F, 0.4F, -1F, 0F, -1F, 0.4F, 0F, -1F, 0.4F, 0F, 0.4F, -1F, 0F, -1F, 0.4F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, -1F, 0.4F, 0F); // Box 525
		attachmentModel[22].setRotationPoint(-1.5F, -2.5F, 3.5F);

		attachmentModel[23].addShapeBox(-0.5F, -5F, -2F, 2, 1, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		attachmentModel[23].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[24].addShapeBox(2F, -5F, -2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 527
		attachmentModel[24].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[25].addShapeBox(2F, -5F, 1F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		attachmentModel[25].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[26].addShapeBox(3F, -5F, -1F, 1, 1, 2, 0F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F); // Box 529
		attachmentModel[26].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[27].addShapeBox(1F, 0F, 0F, 6, 1, 6, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		attachmentModel[27].setRotationPoint(-3F, -1F, -3F);

		attachmentModel[28].addShapeBox(1F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 533
		attachmentModel[28].setRotationPoint(3F, -1F, -2F);

		attachmentModel[29].addShapeBox(-1F, -1F, -4.5F, 2, 2, 9, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 534
		attachmentModel[29].setRotationPoint(-1.5F, -2.5F, 0F);

		attachmentModel[30].addShapeBox(1F, 0F, 0F, 5, 2, 1, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		attachmentModel[30].setRotationPoint(-2F, -1F, 3F);

		attachmentModel[31].addShapeBox(1F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 536
		attachmentModel[31].setRotationPoint(-4F, -4F, -4F);

		attachmentModel[32].addShapeBox(1F, 0F, 0F, 5, 2, 1, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		attachmentModel[32].setRotationPoint(-2F, -1F, -4F);

		attachmentModel[33].addShapeBox(-1F, -9F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		attachmentModel[33].setRotationPoint(-1.5F, -2.5F, -2F);
		
		lightModel = new ModelRendererTurbo[4];
		lightModel[0] = new ModelRendererTurbo(this, 17, 7, textureX, textureY); // Box 486
		lightModel[1] = new ModelRendererTurbo(this, 22, 4, textureX, textureY); // Box 486
		lightModel[2] = new ModelRendererTurbo(this, 22, 7, textureX, textureY); // Box 530
		lightModel[3] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Box 54

		lightModel[0].addShapeBox(-1.01F, -7.9F, 1.1F, 1, 1, 1, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 486
		lightModel[0].setRotationPoint(-1.5F, -2.5F, 0F);

		lightModel[1].addShapeBox(-1.01F, -7.9F, -1.9F, 1, 1, 1, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 486
		lightModel[1].setRotationPoint(-1.5F, -2.5F, 0F);

		lightModel[2].addShapeBox(1.9F, -5.01F, 0F, 1, 1, 1, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.6F); // Box 530
		lightModel[2].setRotationPoint(-1.5F, -2.5F, 0.600000000000001F);

		lightModel[3].addShapeBox(1.9F, -5.01F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.6F, -0.4F, 0F, -0.2F, 0F, 0F, -0.4F, -0.6F, 0F, 0F, -0.2F, 0F, -0.6F, -0.4F, 0F, -0.2F, 0F, 0F, -0.4F, -0.6F, 0F, 0F); // Box 54
		lightModel[3].setRotationPoint(-1.5F, -2.5F, -1.6F);

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