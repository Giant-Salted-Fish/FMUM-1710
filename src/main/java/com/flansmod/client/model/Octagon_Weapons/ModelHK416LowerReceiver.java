//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416LowerReceiver
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.TwoVector3f;
import com.flansmod.common.vector.Vector3f;

public class ModelHK416LowerReceiver extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416LowerReceiver() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[114];
		gunModel[0] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 56
		gunModel[1] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 58
		gunModel[2] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 65
		gunModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 66
		gunModel[4] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 69
		gunModel[5] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 72
		gunModel[6] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 73
		gunModel[7] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 74
		gunModel[8] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 75
		gunModel[9] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 77
		gunModel[10] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 78
		gunModel[11] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 79
		gunModel[12] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 80
		gunModel[13] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 82
		gunModel[14] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 83
		gunModel[15] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 84
		gunModel[16] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 85
		gunModel[17] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 90
		gunModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 91
		gunModel[19] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 94
		gunModel[20] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 105
		gunModel[21] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 112
		gunModel[22] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 113
		gunModel[23] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 114
		gunModel[24] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 117
		gunModel[25] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 118
		gunModel[26] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 119
		gunModel[27] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 125
		gunModel[28] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 130
		gunModel[29] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 131
		gunModel[30] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 238
		gunModel[31] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 239
		gunModel[32] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 240
		gunModel[33] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 241
		gunModel[34] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 239
		gunModel[35] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 240
		gunModel[36] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 343
		gunModel[37] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 344
		gunModel[38] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 346
		gunModel[39] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 349
		gunModel[40] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 366
		gunModel[41] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 368
		gunModel[42] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 369
		gunModel[43] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 370
		gunModel[44] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 371
		gunModel[45] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 373
		gunModel[46] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 374
		gunModel[47] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 376
		gunModel[48] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 377
		gunModel[49] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 409
		gunModel[50] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 398
		gunModel[51] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 402
		gunModel[52] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 467
		gunModel[53] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 468
		gunModel[54] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 469
		gunModel[55] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 470
		gunModel[56] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 471
		gunModel[57] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 472
		gunModel[58] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 486
		gunModel[59] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 491
		gunModel[60] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 488
		gunModel[61] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 488
		gunModel[62] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 488
		gunModel[63] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 492
		gunModel[64] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 489
		gunModel[65] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 490
		gunModel[66] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 536
		gunModel[67] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 470
		gunModel[68] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 471
		gunModel[69] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 476
		gunModel[70] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 533
		gunModel[71] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 537
		gunModel[72] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 538
		gunModel[73] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 583
		gunModel[74] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 584
		gunModel[75] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 585
		gunModel[76] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 639
		gunModel[77] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 643
		gunModel[78] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 644
		gunModel[79] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 645
		gunModel[80] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 646
		gunModel[81] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 647
		gunModel[82] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 648
		gunModel[83] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 643
		gunModel[84] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 644
		gunModel[85] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 645
		gunModel[86] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 646
		gunModel[87] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 647
		gunModel[88] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 606
		gunModel[89] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 545
		gunModel[90] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 563
		gunModel[91] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 561
		gunModel[92] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 562
		gunModel[93] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 565
		gunModel[94] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 566
		gunModel[95] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Box 567
		gunModel[96] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 568
		gunModel[97] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 569
		gunModel[98] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 587
		gunModel[99] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 588
		gunModel[100] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 589
		gunModel[101] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 591
		gunModel[102] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 592
		gunModel[103] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 593
		gunModel[104] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 594
		gunModel[105] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 595
		gunModel[106] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 596
		gunModel[107] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 597
		gunModel[108] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 598
		gunModel[109] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 599
		gunModel[110] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 600
		gunModel[111] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 601
		gunModel[112] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 603
		gunModel[113] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 604

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0.5F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, 3F, 0.5F, -1F, 3F); // Box 56
		gunModel[0].setRotationPoint(-52F, -48F, 1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, -0.375F, 0.5F, -0.5F, -0.375F); // Box 58
		gunModel[1].setRotationPoint(-52F, -41F, 3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 65
		gunModel[2].setRotationPoint(-18F, -38F, 4F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 66
		gunModel[3].setRotationPoint(-20F, -38F, 4F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[4].setRotationPoint(-19.5F, -33F, 3F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[5].setRotationPoint(-21F, -35F, 3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[6].setRotationPoint(-19F, -31F, 3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[7].setRotationPoint(-9F, -35F, 3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 75
		gunModel[8].setRotationPoint(-21F, -33F, 3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 77
		gunModel[9].setRotationPoint(5F, -38F, -4F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[10].setRotationPoint(2F, -35F, -4F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 1F, 0F); // Box 79
		gunModel[11].setRotationPoint(-17F, -29F, 3F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gunModel[12].setRotationPoint(-44F, -38F, 2.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		gunModel[13].setRotationPoint(-21F, -35F, -4F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 1F, 0F); // Box 83
		gunModel[14].setRotationPoint(-17F, -28F, -4F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 26, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[15].setRotationPoint(-21F, -38F, -4F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F); // Box 85
		gunModel[16].setRotationPoint(2F, -34F, -4F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 25, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[17].setRotationPoint(-42F, -33F, -2.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 29, 5, 1, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 91
		gunModel[18].setRotationPoint(-46F, -35F, -3.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -1F, -1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 94
		gunModel[19].setRotationPoint(-45F, -30F, -2.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.025F, 0F, -0.5F, -0.025F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[20].setRotationPoint(-17F, -35F, -3F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[21].setRotationPoint(-30F, -19F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[22].setRotationPoint(-33F, -21F, -2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[23].setRotationPoint(-19F, -21F, -2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		gunModel[24].setRotationPoint(-28.5F, -28F, -1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 118
		gunModel[25].setRotationPoint(-28.5F, -26F, -1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -3F, 0F); // Box 119
		gunModel[26].setRotationPoint(-28.5F, -23F, -1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		gunModel[27].setRotationPoint(-44F, -38F, -3.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		gunModel[28].setRotationPoint(-21F, -29F, -5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 131
		gunModel[29].setRotationPoint(-20F, -34F, -5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		gunModel[30].setRotationPoint(-18F, -28F, -2F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		gunModel[31].setRotationPoint(-34F, -28F, -2F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 240
		gunModel[32].setRotationPoint(-34F, -34.5F, 3F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 241
		gunModel[33].setRotationPoint(-41.5F, -34.5F, 3F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 239
		gunModel[34].setRotationPoint(-34F, -34.5F, -4F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 240
		gunModel[35].setRotationPoint(-41.5F, -34.5F, -4F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 343
		gunModel[36].setRotationPoint(-18F, -34F, -5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		gunModel[37].setRotationPoint(-19F, -34F, -5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 346
		gunModel[38].setRotationPoint(-15F, -36F, -5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 349
		gunModel[39].setRotationPoint(-20F, -37F, -5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 366
		gunModel[40].setRotationPoint(3F, -38F, -5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		gunModel[41].setRotationPoint(3F, -37F, -5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 369
		gunModel[42].setRotationPoint(-10F, -33F, 3F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 370
		gunModel[43].setRotationPoint(-20F, -33F, 3F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Box 371
		gunModel[44].setRotationPoint(-10F, -38F, 4F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 373
		gunModel[45].setRotationPoint(-17F, -20F, -5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 374
		gunModel[46].setRotationPoint(-17F, -20F, 4F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 376
		gunModel[47].setRotationPoint(-18F, -19F, -4F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 1F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 1F); // Box 377
		gunModel[48].setRotationPoint(3F, -20F, -4F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 1F); // Box 409
		gunModel[49].setRotationPoint(3F, -21F, 0F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, 0F); // Box 398
		gunModel[50].setRotationPoint(-9F, -38F, 3.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 26, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		gunModel[51].setRotationPoint(-21F, -38F, 3F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 467
		gunModel[52].setRotationPoint(-42.5F, -32.5F, 2.51F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 468
		gunModel[53].setRotationPoint(-33.5F, -32.5F, 2.51F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 469
		gunModel[54].setRotationPoint(-38F, -36.5F, 2.51F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 470
		gunModel[55].setRotationPoint(-38F, -36.5F, -3.51F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 471
		gunModel[56].setRotationPoint(-42.5F, -32.5F, -3.51F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 472
		gunModel[57].setRotationPoint(-34F, -32.5F, -3.51F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 486
		gunModel[58].setRotationPoint(-15F, -26F, -5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F); // Box 491
		gunModel[59].setRotationPoint(-12F, -34F, 4.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 488
		gunModel[60].setRotationPoint(-18F, -20F, 2F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 488
		gunModel[61].setRotationPoint(-18F, -20F, -4F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 488
		gunModel[62].setRotationPoint(3.5F, -37.5F, -4.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -1F, 1F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0F, -1F, 0F, -1F, -0.05F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -0.05F, 0F); // Box 492
		gunModel[63].setRotationPoint(3F, -21F, -4F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.025F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0.5F, 0F, -0.025F, 0.5F); // Box 489
		gunModel[64].setRotationPoint(-16.5F, -35F, -3F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.025F, 0.5F, 0F, -0.075F, 0.5F, 0F, -0.075F, 0F, 0F, -0.025F, 0F); // Box 490
		gunModel[65].setRotationPoint(-16.5F, -35F, 2F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 536
		gunModel[66].setRotationPoint(-12F, -31F, 4.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 470
		gunModel[67].setRotationPoint(-52F, -45F, 4F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 471
		gunModel[68].setRotationPoint(-52F, -42F, 4F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 476
		gunModel[69].setRotationPoint(-52F, -48F, -2F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 533
		gunModel[70].setRotationPoint(-14F, -38F, 4F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 537
		gunModel[71].setRotationPoint(-52F, -45F, -5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 538
		gunModel[72].setRotationPoint(-52F, -42F, -5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 583
		gunModel[73].setRotationPoint(-52.5F, -39F, -2.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 584
		gunModel[74].setRotationPoint(-45F, -37.5F, -4F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 585
		gunModel[75].setRotationPoint(5F, -38F, 3F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		gunModel[76].setRotationPoint(-52.5F, -34F, -1.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.6667F, -0.5F, -3.5F, 1F, -0.5F, -3.5F, 1F, 0F, 0F, 0.6667F, 0F, 0F, 0F, -1.5F, 3F, 0F, -1.5F, 3F, 0F, 0F, 0F, 0F); // Box 643
		gunModel[77].setRotationPoint(-48.5F, -33F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 7, 7, 3, 0F, 0.5F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.5F, 0.5F, 0F); // Box 644
		gunModel[78].setRotationPoint(-43F, -33F, -1.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		gunModel[79].setRotationPoint(-36F, -28F, -1.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		gunModel[80].setRotationPoint(-42F, -30F, -3.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		gunModel[81].setRotationPoint(-42F, -30F, 2.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 29, 5, 1, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 648
		gunModel[82].setRotationPoint(-46F, -35F, 2.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 643
		gunModel[83].setRotationPoint(-21F, -32F, 3F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		gunModel[84].setRotationPoint(-21F, -32.5F, 3F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 645
		gunModel[85].setRotationPoint(-14F, -31F, 4F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 646
		gunModel[86].setRotationPoint(-10F, -31F, 4F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		gunModel[87].setRotationPoint(-17F, -35F, -4F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 3F, 2F, -1.5F, 3F, -2F, 0F, 0F, -2F); // Box 606
		gunModel[88].setRotationPoint(-48.5F, -35F, 2.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 545
		gunModel[89].setRotationPoint(3F, -36F, -5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, -3F, 0.5F, -1F, -3F); // Box 563
		gunModel[90].setRotationPoint(-52F, -48F, -2F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 561
		gunModel[91].setRotationPoint(-33F, -28F, -2F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 562
		gunModel[92].setRotationPoint(-21F, -28F, -2F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 565
		gunModel[93].setRotationPoint(-52F, -38F, 2.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.125F, 0.5F, 0F, 0.125F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F); // Box 566
		gunModel[94].setRotationPoint(-52F, -39.5F, 2.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0.5F, -0.5F, -0.125F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 567
		gunModel[95].setRotationPoint(-52F, -39F, 2.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		gunModel[96].setRotationPoint(-45F, -38F, 2.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F, 3F, -2F, -1.5F, 3F, 2F, 0F, 0F, 2F); // Box 569
		gunModel[97].setRotationPoint(-48.5F, -35F, -3.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		gunModel[98].setRotationPoint(-52.5F, -39F, 1.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 588
		gunModel[99].setRotationPoint(-52.5F, -39F, 1F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589
		gunModel[100].setRotationPoint(-52.5F, -39F, -1F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1667F, 0F, 0F, 0.1667F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 591
		gunModel[101].setRotationPoint(-52.5F, -34.5F, 2F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.1667F, 0F, -0.5F, 0.1667F); // Box 592
		gunModel[102].setRotationPoint(-52.5F, -35F, 2F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.1667F, 0F, 0F, 0.1667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 593
		gunModel[103].setRotationPoint(-52.5F, -34.5F, -3F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1667F, 0F, -0.5F, 0.1667F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 594
		gunModel[104].setRotationPoint(-52.5F, -35F, -3F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 595
		gunModel[105].setRotationPoint(-52.5F, -39F, -2F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 596
		gunModel[106].setRotationPoint(-50.5F, -39F, -2F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, -0.5F, -0.375F, 1F, -0.5F, -0.375F, 1F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 597
		gunModel[107].setRotationPoint(-52F, -41F, -5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0.5F, 0F, 0.125F, -2F, 0F, 0.125F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 598
		gunModel[108].setRotationPoint(-52F, -39.5F, -4.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 599
		gunModel[109].setRotationPoint(-52F, -39F, -4.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		gunModel[110].setRotationPoint(-45F, -38F, -3.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 601
		gunModel[111].setRotationPoint(-52F, -38F, -4.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 603
		gunModel[112].setRotationPoint(-35F, -29F, -2F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0.5F); // Box 604
		gunModel[113].setRotationPoint(-21F, -37F, -5F);


		switchModel = new ModelRendererTurbo[42];
		switchModel[0] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 493
		switchModel[1] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 494
		switchModel[2] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 495
		switchModel[3] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 496
		switchModel[4] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 497
		switchModel[5] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 498
		switchModel[6] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 499
		switchModel[7] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 581
		switchModel[8] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 582
		switchModel[9] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 583
		switchModel[10] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 584
		switchModel[11] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 585
		switchModel[12] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 586
		switchModel[13] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 587
		switchModel[14] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 593
		switchModel[15] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 594
		switchModel[16] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 595
		switchModel[17] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 596
		switchModel[18] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 597
		switchModel[19] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 598
		switchModel[20] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 599
		switchModel[21] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 600
		switchModel[22] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 601
		switchModel[23] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 602
		switchModel[24] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 603
		switchModel[25] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 604
		switchModel[26] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 605
		switchModel[27] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 606
		switchModel[28] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 607
		switchModel[29] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 608
		switchModel[30] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 609
		switchModel[31] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 610
		switchModel[32] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 611
		switchModel[33] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 612
		switchModel[34] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 613
		switchModel[35] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 614
		switchModel[36] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 615
		switchModel[37] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 616
		switchModel[38] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 617
		switchModel[39] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 618
		switchModel[40] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 619
		switchModel[41] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 620

		switchModel[0].addShapeBox(-2F, -1F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		switchModel[0].setRotationPoint(-36.5F, -32.5F, 3.5F);
		switchModel[0].rotateAngleZ = -1.57079633F;

		switchModel[1].addShapeBox(-0.5F, -2F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 494
		switchModel[1].setRotationPoint(-36.5F, -32.5F, 3.5F);
		switchModel[1].rotateAngleZ = -1.57079633F;

		switchModel[2].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		switchModel[2].setRotationPoint(-36.5F, -32.5F, 3.5F);
		switchModel[2].rotateAngleZ = -1.57079633F;

		switchModel[3].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 496
		switchModel[3].setRotationPoint(-36.5F, -32.5F, 3.5F);
		switchModel[3].rotateAngleZ = -1.57079633F;

		switchModel[4].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 497
		switchModel[4].setRotationPoint(-36.5F, -32.5F, 4F);
		switchModel[4].rotateAngleZ = -1.57079633F;

		switchModel[5].addShapeBox(-0.75F, 1F, 0F, 1, 4, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 498
		switchModel[5].setRotationPoint(-36.5F, -32.5F, 4F);
		switchModel[5].rotateAngleZ = -1.57079633F;

		switchModel[6].addShapeBox(-0.25F, 5F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 499
		switchModel[6].setRotationPoint(-36.5F, -32.5F, 4F);
		switchModel[6].rotateAngleZ = -1.57079633F;

		switchModel[7].addShapeBox(-2F, -1F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		switchModel[7].setRotationPoint(-36.5F, -32.5F, -4.5F);
		switchModel[7].rotateAngleZ = -1.57079633F;

		switchModel[8].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		switchModel[8].setRotationPoint(-36.5F, -32.5F, -4.5F);
		switchModel[8].rotateAngleZ = -1.57079633F;

		switchModel[9].addShapeBox(-0.5F, -2F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		switchModel[9].setRotationPoint(-36.5F, -32.5F, -4.5F);
		switchModel[9].rotateAngleZ = -1.57079633F;

		switchModel[10].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 584
		switchModel[10].setRotationPoint(-36.5F, -32.5F, -4.5F);
		switchModel[10].rotateAngleZ = -1.57079633F;

		switchModel[11].addShapeBox(-0.75F, 1F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 585
		switchModel[11].setRotationPoint(-36.5F, -32.5F, -5F);
		switchModel[11].rotateAngleZ = -1.57079633F;

		switchModel[12].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 586
		switchModel[12].setRotationPoint(-36.5F, -32.5F, -5F);
		switchModel[12].rotateAngleZ = -1.57079633F;

		switchModel[13].addShapeBox(-0.25F, 5F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 587
		switchModel[13].setRotationPoint(-36.5F, -32.5F, -5F);
		switchModel[13].rotateAngleZ = -1.57079633F;

		switchModel[14].addShapeBox(-2F, -1F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		switchModel[14].setRotationPoint(-36.5F, -32.5F, 3.5F);

		switchModel[15].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 594
		switchModel[15].setRotationPoint(-36.5F, -32.5F, 3.5F);

		switchModel[16].addShapeBox(-0.75F, 1F, 0F, 1, 4, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 595
		switchModel[16].setRotationPoint(-36.5F, -32.5F, 4F);

		switchModel[17].addShapeBox(-0.25F, 5F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 596
		switchModel[17].setRotationPoint(-36.5F, -32.5F, 4F);

		switchModel[18].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 597
		switchModel[18].setRotationPoint(-36.5F, -32.5F, 4F);

		switchModel[19].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		switchModel[19].setRotationPoint(-36.5F, -32.5F, 3.5F);

		switchModel[20].addShapeBox(-0.5F, -2F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 599
		switchModel[20].setRotationPoint(-36.5F, -32.5F, 3.5F);

		switchModel[21].addShapeBox(-0.25F, 5F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 600
		switchModel[21].setRotationPoint(-36.5F, -32.5F, -5F);

		switchModel[22].addShapeBox(-0.75F, 1F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 601
		switchModel[22].setRotationPoint(-36.5F, -32.5F, -5F);

		switchModel[23].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 602
		switchModel[23].setRotationPoint(-36.5F, -32.5F, -5F);

		switchModel[24].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 603
		switchModel[24].setRotationPoint(-36.5F, -32.5F, -4.5F);

		switchModel[25].addShapeBox(-2F, -1F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		switchModel[25].setRotationPoint(-36.5F, -32.5F, -4.5F);

		switchModel[26].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		switchModel[26].setRotationPoint(-36.5F, -32.5F, -4.5F);

		switchModel[27].addShapeBox(-0.5F, -2F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		switchModel[27].setRotationPoint(-36.5F, -32.5F, -4.5F);

		switchModel[28].addShapeBox(-2F, -1F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		switchModel[28].setRotationPoint(-36.5F, -32.5F, 3.5F);
		switchModel[28].rotateAngleZ = 1.57079633F;

		switchModel[29].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 608
		switchModel[29].setRotationPoint(-36.5F, -32.5F, 3.5F);
		switchModel[29].rotateAngleZ = 1.57079633F;

		switchModel[30].addShapeBox(-0.75F, 1F, 0F, 1, 4, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 609
		switchModel[30].setRotationPoint(-36.5F, -32.5F, 4F);
		switchModel[30].rotateAngleZ = 1.57079633F;

		switchModel[31].addShapeBox(-0.25F, 5F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 610
		switchModel[31].setRotationPoint(-36.5F, -32.5F, 4F);
		switchModel[31].rotateAngleZ = 1.57079633F;

		switchModel[32].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 611
		switchModel[32].setRotationPoint(-36.5F, -32.5F, 4F);
		switchModel[32].rotateAngleZ = 1.57079633F;

		switchModel[33].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		switchModel[33].setRotationPoint(-36.5F, -32.5F, 3.5F);
		switchModel[33].rotateAngleZ = 1.57079633F;

		switchModel[34].addShapeBox(-0.5F, -2F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 613
		switchModel[34].setRotationPoint(-36.5F, -32.5F, 3.5F);
		switchModel[34].rotateAngleZ = 1.57079633F;

		switchModel[35].addShapeBox(-0.25F, 5F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 614
		switchModel[35].setRotationPoint(-36.5F, -32.5F, -5F);
		switchModel[35].rotateAngleZ = 1.57079633F;

		switchModel[36].addShapeBox(-0.75F, 1F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 615
		switchModel[36].setRotationPoint(-36.5F, -32.5F, -5F);
		switchModel[36].rotateAngleZ = 1.57079633F;

		switchModel[37].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 616
		switchModel[37].setRotationPoint(-36.5F, -32.5F, -5F);
		switchModel[37].rotateAngleZ = 1.57079633F;

		switchModel[38].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 617
		switchModel[38].setRotationPoint(-36.5F, -32.5F, -4.5F);
		switchModel[38].rotateAngleZ = 1.57079633F;

		switchModel[39].addShapeBox(-2F, -1F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		switchModel[39].setRotationPoint(-36.5F, -32.5F, -4.5F);
		switchModel[39].rotateAngleZ = 1.57079633F;

		switchModel[40].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		switchModel[40].setRotationPoint(-36.5F, -32.5F, -4.5F);
		switchModel[40].rotateAngleZ = 1.57079633F;

		switchModel[41].addShapeBox(-0.5F, -2F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		switchModel[41].setRotationPoint(-36.5F, -32.5F, -4.5F);
		switchModel[41].rotateAngleZ = 1.57079633F;


		boltCatchButtonModel = new ModelRendererTurbo[10];
		boltCatchButtonModel[0] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 581
		boltCatchButtonModel[1] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 582
		boltCatchButtonModel[2] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 583
		boltCatchButtonModel[3] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 584
		boltCatchButtonModel[4] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Box 585
		boltCatchButtonModel[5] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Box 588
		boltCatchButtonModel[6] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 589
		boltCatchButtonModel[7] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 590
		boltCatchButtonModel[8] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 591
		boltCatchButtonModel[9] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 592

		boltCatchButtonModel[0].addShapeBox(0F, -1.5F, -1F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		boltCatchButtonModel[0].setRotationPoint(-19F, -37F, 4.5F);

		boltCatchButtonModel[1].addShapeBox(0F, -2.5F, 0F, 2, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 582
		boltCatchButtonModel[1].setRotationPoint(-19F, -37F, 4.5F);

		boltCatchButtonModel[2].addShapeBox(0F, -4.5F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		boltCatchButtonModel[2].setRotationPoint(-20F, -37F, 4.5F);

		boltCatchButtonModel[3].addShapeBox(0F, -5.5F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 584
		boltCatchButtonModel[3].setRotationPoint(-19F, -37F, 4.5F);

		boltCatchButtonModel[4].addShapeBox(0F, 2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 585
		boltCatchButtonModel[4].setRotationPoint(-19F, -37F, 4.5F);

		boltCatchButtonModel[5].addShapeBox(0F, 2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 588
		boltCatchButtonModel[5].setRotationPoint(-19F, -37F, 4.5F);
		boltCatchButtonModel[5].rotateAngleX = -0.17453293F;

		boltCatchButtonModel[6].addShapeBox(0F, -1.5F, -1F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		boltCatchButtonModel[6].setRotationPoint(-19F, -37F, 4.5F);
		boltCatchButtonModel[6].rotateAngleX = -0.17453293F;

		boltCatchButtonModel[7].addShapeBox(0F, -2.5F, 0F, 2, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 590
		boltCatchButtonModel[7].setRotationPoint(-19F, -37F, 4.5F);
		boltCatchButtonModel[7].rotateAngleX = -0.17453293F;

		boltCatchButtonModel[8].addShapeBox(0F, -4.5F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		boltCatchButtonModel[8].setRotationPoint(-20F, -37F, 4.5F);
		boltCatchButtonModel[8].rotateAngleX = -0.17453293F;

		boltCatchButtonModel[9].addShapeBox(0F, -5.5F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 592
		boltCatchButtonModel[9].setRotationPoint(-19F, -37F, 4.5F);
		boltCatchButtonModel[9].rotateAngleX = -0.17453293F;

		numSwitchModel = switchModel.length / 3;

		barrelOrigin.set(-52F / 160F, 43F / 160F, 0F);
		chamberSmokeOri.set(-9F / 160F, 44F / 160F, 25F / 160F);
		caseOrigin.set(-18F / 160F, 44F / 160F, 0F);

		magAttachPoint.set(-16.5F / 160F, 39F / 160F, 0F);

		holdingTranslate.set(10F / 160F, 0F, 20F / 160F);
		holdingRotate.set(-5F, 0F, 0F);
		thirdPersonOffset.set(44F / 160F, -7F / 160F, 0F);

		takeOutTranslate.set(-220F / 160F, -180F / 160F, 40F / 160F);
		takeOutRotate.set(0F, 0F, -160F);
		sprintTranslate.set(-10F / 160F, -40F / 160F, -40F / 160F);
		sprintRotate.set(-8F, 40F, -15F);
		restTranslate =  sprintTranslate;
		restRotate = sprintRotate;

		reloadTranslate.set(20F / 160F, 0F, 0F);
		reloadRotate.set(15F, 0F, 0F);
		magTranslate.set(0F, -10F / 16F, 0F);

		checkAmmoTranslate = reloadTranslate;
		checkAmmoRotate.set(15F, 0F, 0F);
		checkAmmoMagTranslate.set(0F, -25F / 160F, 0F);
		checkAmmoMagTranslate2.set(0F, 10F / 160F, -60F / 160F);
		checkAmmoMagRotate2.set(-30F, 0, 0);
		checkChamberTranslate.set(20F / 160F, 65F / 160F, -10F / 160F);
		checkChamberRotate.set(-70F, -21F, 37F);
		checkChamberTiltTimeRatio = 0.4F;
		checkChamberChargeTimeRatio = 0.67F;
		checkChamberTiltBCTimeRatio = 0.45F;

		gunSlideDistance = 25F / 16F;
		slideLockDistance = 22F / 16F;
		chargeHandleDistance =  25F / 16F;

		leftHandAmmo = true;
		leftHandCheckChamber = true;
		rightHandCharge = true;
		leftHandRelease = true;
		leftHandReloadingRelease = true;
		leftArmPos.set(57F / 160F, 33F / 160F, -12F / 160F);
		leftArmRot.set(-16F, -27F, 13F);
		rightArmPos.set(-39F / 160F, 8F / 160F, 5F / 160F);
		rightArmRot.set(0F, 14F, 8F);
		leftArmAmmoPos.set(-3F / 160F, -5F / 160F, -4F / 160F);
		leftArmAmmoRot.set(6F, -36F, 15F);
		leftHandCheckChamberPos.set(-49.5F / 160F, 43.5F / 160F, -28F / 160F);
		leftHandCheckChamberRot.set(17F, -15F, 0F);
		leftArmReleasePos.set(-13F / 160F, 16F / 160F, -15F / 160F);
		leftArmReleaseRot.set(-26F, -37F, 9F);
		leftArmReloadingReleasePos.set(-13F / 160F, 16F / 160F, -15F / 160F);
		leftArmReloadingReleaseRot.set(-26F, -37F, 9F);
		rightArmChargePos.set(-39F / 160F, 38F / 160F, 24F / 160F);
		rightArmChargeRot.set(-13F, 22F, 31F);

		leftArmPose.put("vgrip".hashCode(), new TwoVector3f(0F, 0F, 0F, -5F, 30F, -9F));
		leftArmPose.put("hgrip".hashCode(), new TwoVector3f(0F, 0F, 0F, -9F, 24F, -11F));
		leftArmPose.put("handguard".hashCode(), new TwoVector3f(0F, 0F, 0F, -20F, -24F, 10F));

		bulletAttachPoint1 = new Vector3f[1];
		bulletAttachPoint1[0] = new Vector3f(6F / 160F, 43F / 160F, 0F);

		flipAll();
	}
}