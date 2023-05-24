//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416165Barrel
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelHK416165Barrel extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelHK416165Barrel() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[61];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 7
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 36
		attachmentModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 37
		attachmentModel[6] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 38
		attachmentModel[7] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 39
		attachmentModel[8] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 53
		attachmentModel[9] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 144
		attachmentModel[10] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 146
		attachmentModel[11] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 147
		attachmentModel[12] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 148
		attachmentModel[13] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 150
		attachmentModel[14] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 151
		attachmentModel[15] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 152
		attachmentModel[16] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 153
		attachmentModel[17] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 380
		attachmentModel[18] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 433
		attachmentModel[19] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 434
		attachmentModel[20] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 435
		attachmentModel[21] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 436
		attachmentModel[22] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 437
		attachmentModel[23] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 539
		attachmentModel[24] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 543
		attachmentModel[25] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 544
		attachmentModel[26] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 545
		attachmentModel[27] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 546
		attachmentModel[28] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 559
		attachmentModel[29] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 564
		attachmentModel[30] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 565
		attachmentModel[31] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 566
		attachmentModel[32] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 567
		attachmentModel[33] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 568
		attachmentModel[34] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 569
		attachmentModel[35] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 570
		attachmentModel[36] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 571
		attachmentModel[37] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 572
		attachmentModel[38] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 573
		attachmentModel[39] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 632
		attachmentModel[40] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 633
		attachmentModel[41] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 634
		attachmentModel[42] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 654
		attachmentModel[43] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 655
		attachmentModel[44] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 659
		attachmentModel[45] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 660
		attachmentModel[46] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 572
		attachmentModel[47] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 573
		attachmentModel[48] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 574
		attachmentModel[49] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 575
		attachmentModel[50] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 576
		attachmentModel[51] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 577
		attachmentModel[52] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 578
		attachmentModel[53] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 579
		attachmentModel[54] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 580
		attachmentModel[55] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 581
		attachmentModel[56] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 582
		attachmentModel[57] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 583
		attachmentModel[58] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 584
		attachmentModel[59] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 607
		attachmentModel[60] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 608

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 121, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 0
		attachmentModel[0].setRotationPoint(0F, -3F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 121, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		attachmentModel[1].setRotationPoint(0F, -1F, 1F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 121, 2, 2, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		attachmentModel[2].setRotationPoint(0F, 1F, -1F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 121, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		attachmentModel[3].setRotationPoint(0F, -1F, -3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		attachmentModel[4].setRotationPoint(55F, -4.5F, -1.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		attachmentModel[5].setRotationPoint(70F, -6F, -1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		attachmentModel[6].setRotationPoint(69F, -4F, -1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		attachmentModel[7].setRotationPoint(69F, -7F, -1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1667F, 0F, 0F, 0.1667F, 0F, 0F, 0F, 0F, 0F); // Box 53
		attachmentModel[8].setRotationPoint(61F, 3F, -2F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 144
		attachmentModel[9].setRotationPoint(61F, 4F, -2F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 146
		attachmentModel[10].setRotationPoint(59.5F, 5F, -2F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 147
		attachmentModel[11].setRotationPoint(68F, -0.5F, 6F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 148
		attachmentModel[12].setRotationPoint(69.5F, -0.5F, 3F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 150
		attachmentModel[13].setRotationPoint(121F, -2F, -1F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		attachmentModel[14].setRotationPoint(121F, 1F, -1F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		attachmentModel[15].setRotationPoint(121F, -1F, 1F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		attachmentModel[16].setRotationPoint(121F, -1F, -2F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 380
		attachmentModel[17].setRotationPoint(67F, 3F, -2F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 433
		attachmentModel[18].setRotationPoint(70F, 4F, -2F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 434
		attachmentModel[19].setRotationPoint(68F, -7F, -1F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 435
		attachmentModel[20].setRotationPoint(69F, -7F, -1F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 436
		attachmentModel[21].setRotationPoint(68F, -4F, -1F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 437
		attachmentModel[22].setRotationPoint(69F, -4F, -1F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 539
		attachmentModel[23].setRotationPoint(60.5F, 4F, -2F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F); // Box 543
		attachmentModel[24].setRotationPoint(67F, -0.5F, 3F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F); // Box 544
		attachmentModel[25].setRotationPoint(69F, -0.5F, 3F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		attachmentModel[26].setRotationPoint(68F, -0.5F, 3F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1F, -0.5F, 0F, 0F); // Box 546
		attachmentModel[27].setRotationPoint(69F, -0.5F, 6F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		attachmentModel[28].setRotationPoint(55F, 3F, -2F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		attachmentModel[29].setRotationPoint(50F, -6.5F, -1.5F);

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		attachmentModel[30].setRotationPoint(50F, -7.5F, -0.5F);

		attachmentModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 566
		attachmentModel[31].setRotationPoint(50F, -5.5F, -0.5F);

		attachmentModel[32].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		attachmentModel[32].setRotationPoint(55F, -7F, -2F);

		attachmentModel[33].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 568
		attachmentModel[33].setRotationPoint(55F, -8F, -1F);

		attachmentModel[34].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 569
		attachmentModel[34].setRotationPoint(55F, -5F, -1.5F);

		attachmentModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 570
		attachmentModel[35].setRotationPoint(67.5F, -7F, -1F);

		attachmentModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 571
		attachmentModel[36].setRotationPoint(66F, -7F, -1F);

		attachmentModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 572
		attachmentModel[37].setRotationPoint(70F, -7F, -1F);

		attachmentModel[38].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 573
		attachmentModel[38].setRotationPoint(55F, 1F, -3F);

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 632
		attachmentModel[39].setRotationPoint(55F, 2F, -3F);

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		attachmentModel[40].setRotationPoint(55F, 2.5F, -2F);

		attachmentModel[41].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		attachmentModel[41].setRotationPoint(61F, 2.5F, -2F);

		attachmentModel[42].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 2F); // Box 654
		attachmentModel[42].setRotationPoint(6.5F, -4F, -2F);

		attachmentModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 655
		attachmentModel[43].setRotationPoint(6.5F, 2F, -2F);

		attachmentModel[44].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 659
		attachmentModel[44].setRotationPoint(10.5F, -3F, -1F);

		attachmentModel[45].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0.5F, 0F, 1F, 7F, -1F, 0F, 0F, 0F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, 1F, 7F, -1F, 0F, 0F, 0F, -7F, 0.5F, 0F, -7F); // Box 660
		attachmentModel[45].setRotationPoint(6.5F, -2F, 3F);

		attachmentModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 572
		attachmentModel[46].setRotationPoint(71F, -6F, -1F);

		attachmentModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F); // Box 573
		attachmentModel[47].setRotationPoint(67F, -0.5F, 6F);

		attachmentModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 574
		attachmentModel[48].setRotationPoint(66.5F, -0.5F, 3F);

		attachmentModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		attachmentModel[49].setRotationPoint(66.5F, -0.5F, -6F);

		attachmentModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 576
		attachmentModel[50].setRotationPoint(67F, -0.5F, -4F);

		attachmentModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		attachmentModel[51].setRotationPoint(68F, -0.5F, -4F);

		attachmentModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 578
		attachmentModel[52].setRotationPoint(69F, -0.5F, -4F);

		attachmentModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		attachmentModel[53].setRotationPoint(69.5F, -0.5F, -6F);

		attachmentModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F); // Box 580
		attachmentModel[54].setRotationPoint(69F, -0.5F, -7F);

		attachmentModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		attachmentModel[55].setRotationPoint(68F, -0.5F, -7F);

		attachmentModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F); // Box 582
		attachmentModel[56].setRotationPoint(67F, -0.5F, -7F);

		attachmentModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -0.5F, 0F); // Box 583
		attachmentModel[57].setRotationPoint(58F, 4F, -2F);

		attachmentModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 584
		attachmentModel[58].setRotationPoint(58.5F, 4F, -2F);

		attachmentModel[59].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 607
		attachmentModel[59].setRotationPoint(10.5F, 1F, -1F);

		attachmentModel[60].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0.5F, 0F, -7F, 0F, 0F, -7F, 7F, -1F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -7F, 0F, 0F, -7F, 7F, -1F, 0F, 0.5F, 0F, 1F); // Box 608
		attachmentModel[60].setRotationPoint(6.5F, -2F, -11F);

		muzzleFlashPoint = new Vector3f(124F / 16F, 0F, 0F);

		flipAll();
	}
}