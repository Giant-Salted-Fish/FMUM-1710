//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC IS-2 Sight
// Model Creator: 
// Created on: 02.01.2020 - 20:29:24
// Last changed on: 02.01.2020 - 20:29:24

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAtSight;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICIS2RearSight extends ModelAtSight //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	private ModelRendererTurbo[] lightModel;
	
	public ModelCICIS2RearSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[64];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 517
		attachmentModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 518
		attachmentModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 519
		attachmentModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 520
		attachmentModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 521
		attachmentModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 522
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 523
		attachmentModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 525
		attachmentModel[8] = new ModelRendererTurbo(this, 17, 10, textureX, textureY); // Box 526
		attachmentModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 527
		attachmentModel[10] = new ModelRendererTurbo(this, 25, 10, textureX, textureY); // Box 528
		attachmentModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 529
		attachmentModel[12] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 530
		attachmentModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 531
		attachmentModel[14] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 532
		attachmentModel[15] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 533
		attachmentModel[16] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 534
		attachmentModel[17] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 535
		attachmentModel[18] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 536
		attachmentModel[19] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 537
		attachmentModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 538
		attachmentModel[21] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 541
		attachmentModel[22] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 542
		attachmentModel[23] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 543
		attachmentModel[24] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 564
		attachmentModel[25] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 565
		attachmentModel[26] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 566
		attachmentModel[27] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 602
		attachmentModel[28] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 603
		attachmentModel[29] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 604
		attachmentModel[30] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 605
		attachmentModel[31] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 607
		attachmentModel[32] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 608
		attachmentModel[33] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 609
		attachmentModel[34] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 610
		attachmentModel[35] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 611
		attachmentModel[36] = new ModelRendererTurbo(this, 29, 20, textureX, textureY); // Box 618
		attachmentModel[37] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 619
		attachmentModel[38] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 620
		attachmentModel[39] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 621
		attachmentModel[40] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 622
		attachmentModel[41] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 627
		attachmentModel[42] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 628
		attachmentModel[43] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 625
		attachmentModel[44] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 48
		attachmentModel[45] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 49
		attachmentModel[46] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 50
		attachmentModel[47] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 51
		attachmentModel[48] = new ModelRendererTurbo(this, 70, 33, textureX, textureY); // Box 52
		attachmentModel[49] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 53
		attachmentModel[50] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 54
		attachmentModel[51] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 55
		attachmentModel[52] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 56
		attachmentModel[53] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 57
		attachmentModel[54] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 58
		attachmentModel[55] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 59
		attachmentModel[56] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 60
		attachmentModel[57] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 61
		attachmentModel[58] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 62
		attachmentModel[59] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 63
		attachmentModel[60] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 64
		attachmentModel[61] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 82
		attachmentModel[62] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 83
		attachmentModel[63] = new ModelRendererTurbo(this, 6, 21, textureX, textureY); // Box 84

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		attachmentModel[0].setRotationPoint(-7.5F, -1F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		attachmentModel[1].setRotationPoint(-7.5F, -3F, 3F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		attachmentModel[2].setRotationPoint(-0.5F, 0F, 3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 520
		attachmentModel[3].setRotationPoint(2.5F, -2F, 2F);

		attachmentModel[4].addShapeBox(-2F, -1F, 0F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		attachmentModel[4].setRotationPoint(-5.5F, -3F, 4F);

		attachmentModel[5].addShapeBox(-1F, -2F, 4F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 522
		attachmentModel[5].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[6].addShapeBox(-1F, 1F, 4F, 3, 1, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 523
		attachmentModel[6].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[7].addShapeBox(-2.5F, -0.5F, 4F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 525
		attachmentModel[7].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[8].addShapeBox(-0.5F, -3F, 4F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 526
		attachmentModel[8].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		attachmentModel[9].setRotationPoint(-0.5F, 1F, 3F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		attachmentModel[10].setRotationPoint(-0.5F, 0F, -4F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		attachmentModel[11].setRotationPoint(-0.5F, 1F, -4F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		attachmentModel[12].setRotationPoint(-7.5F, -3F, -4F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 531
		attachmentModel[13].setRotationPoint(2.5F, -2F, -3F);

		attachmentModel[14].addShapeBox(-2F, -5F, -1F, 4, 6, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		attachmentModel[14].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[15].addShapeBox(-1F, -5.5F, -2F, 2, 6, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 533
		attachmentModel[15].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[16].addShapeBox(-1F, -5.5F, 1F, 2, 6, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 534
		attachmentModel[16].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[17].addShapeBox(-0.5F, -9F, -1.5F, 1, 1, 1, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		attachmentModel[17].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[18].addShapeBox(-1F, -8F, -2F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 536
		attachmentModel[18].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[19].addShapeBox(-0.5F, -7.5F, -2F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		attachmentModel[19].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[20].addShapeBox(-0.5F, -9F, 0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 538
		attachmentModel[20].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[21].addShapeBox(-1F, 1F, -1F, 2, 1, 2, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		attachmentModel[21].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[22].addShapeBox(-1F, 1F, 1F, 1, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 542
		attachmentModel[22].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[23].addShapeBox(0F, 1F, 1F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 543
		attachmentModel[23].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 564
		attachmentModel[24].setRotationPoint(-0.5F, 0F, 4F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 565
		attachmentModel[25].setRotationPoint(0.5F, -1F, 4F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 566
		attachmentModel[26].setRotationPoint(0.5F, 1F, 4F);

		attachmentModel[27].addShapeBox(0F, 1F, -2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		attachmentModel[27].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[28].addShapeBox(-1F, 1F, -2F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, -1F, 0F); // Box 603
		attachmentModel[28].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[29].addShapeBox(-1F, -1F, -4F, 2, 2, 8, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 604
		attachmentModel[29].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[30].addShapeBox(-0.5F, -7.5F, 1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 605
		attachmentModel[30].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[31].addShapeBox(-0.5F, -9F, -0.5F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		attachmentModel[31].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[32].addShapeBox(-1F, -8F, 1F, 2, 2, 1, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 608
		attachmentModel[32].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[33].addShapeBox(-1F, -9.5F, 1F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F); // Box 609
		attachmentModel[33].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[34].addShapeBox(-1F, -9.5F, -2F, 2, 1, 1, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 610
		attachmentModel[34].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[35].addShapeBox(-1F, -9.5F, -1F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 611
		attachmentModel[35].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[36].addShapeBox(-1.5F, -4F, -2.5F, 3, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 618
		attachmentModel[36].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[37].addShapeBox(-2.5F, -4F, -1.5F, 5, 3, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		attachmentModel[37].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[38].addShapeBox(-1.5F, -4F, 1.5F, 3, 3, 1, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		attachmentModel[38].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 621
		attachmentModel[39].setRotationPoint(-1.5F, -3F, 2F);

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 622
		attachmentModel[40].setRotationPoint(-1.5F, -3F, -3F);

		attachmentModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 627
		attachmentModel[41].setRotationPoint(-6.5F, -4F, 3F);

		attachmentModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 628
		attachmentModel[42].setRotationPoint(-6.5F, -4F, -4F);

		attachmentModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		attachmentModel[43].setRotationPoint(2.5F, -1F, -2.5F);

		attachmentModel[44].addShapeBox(-0.5F, -3F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 48
		attachmentModel[44].setRotationPoint(-5.5F, -3F, 4F);
		attachmentModel[44].rotateAngleZ = 0.78539816F;

		attachmentModel[45].addShapeBox(-0.5F, -3F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 49
		attachmentModel[45].setRotationPoint(-5.5F, -3F, 4F);
		attachmentModel[45].rotateAngleZ = -0.78539816F;

		attachmentModel[46].addShapeBox(-0.5F, -3F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 50
		attachmentModel[46].setRotationPoint(-5.5F, -3F, 4F);
		attachmentModel[46].rotateAngleZ = -2.35619449F;

		attachmentModel[47].addShapeBox(-0.5F, -3F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 51
		attachmentModel[47].setRotationPoint(-5.5F, -3F, 4F);
		attachmentModel[47].rotateAngleZ = 2.35619449F;

		attachmentModel[48].addShapeBox(1.5F, -0.5F, 4F, 1, 1, 4, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 52
		attachmentModel[48].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[49].addShapeBox(-0.5F, 2F, 4F, 1, 1, 4, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		attachmentModel[49].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[50].addShapeBox(-2.5F, -0.5F, -8F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 54
		attachmentModel[50].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[51].addShapeBox(-0.5F, -3F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 55
		attachmentModel[51].setRotationPoint(-5.5F, -3F, -8F);
		attachmentModel[51].rotateAngleZ = -0.78539816F;

		attachmentModel[52].addShapeBox(-0.5F, -3F, -8F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 56
		attachmentModel[52].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[53].addShapeBox(-1F, -2F, -8F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 57
		attachmentModel[53].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[54].addShapeBox(-0.5F, -3F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 58
		attachmentModel[54].setRotationPoint(-5.5F, -3F, -8F);
		attachmentModel[54].rotateAngleZ = 0.78539816F;

		attachmentModel[55].addShapeBox(-0.5F, -3F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 59
		attachmentModel[55].setRotationPoint(-5.5F, -3F, -8F);
		attachmentModel[55].rotateAngleZ = 2.35619449F;

		attachmentModel[56].addShapeBox(-0.5F, 2F, -8F, 1, 1, 4, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		attachmentModel[56].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[57].addShapeBox(-0.5F, -3F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 61
		attachmentModel[57].setRotationPoint(-5.5F, -3F, -8F);
		attachmentModel[57].rotateAngleZ = -2.35619449F;

		attachmentModel[58].addShapeBox(-1F, 1F, -8F, 3, 1, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 62
		attachmentModel[58].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[59].addShapeBox(-2F, -1F, -8F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		attachmentModel[59].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[60].addShapeBox(1.5F, -0.5F, -8F, 1, 1, 4, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 64
		attachmentModel[60].setRotationPoint(-5.5F, -3F, 0F);

		attachmentModel[61].addShapeBox(-0.5F, -9F, 0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 82
		attachmentModel[61].setRotationPoint(-5.5F, 0F, 0F);

		attachmentModel[62].addShapeBox(-0.5F, -9F, -1.5F, 1, 1, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		attachmentModel[62].setRotationPoint(-5.5F, 0F, 0F);

		attachmentModel[63].addShapeBox(-0.5F, -9F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		attachmentModel[63].setRotationPoint(-5.5F, 0F, 0F);

		lightModel = new ModelRendererTurbo[1];
		lightModel[0] = new ModelRendererTurbo(this, 30, 29, textureX, textureY); // Box 84

		lightModel[0].addShapeBox(-0.51F, -9F, -0.5F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 1.5F, -0.5F, 0F); // Box 84
		lightModel[0].setRotationPoint(-5.5F, 0F, 0F);
		
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