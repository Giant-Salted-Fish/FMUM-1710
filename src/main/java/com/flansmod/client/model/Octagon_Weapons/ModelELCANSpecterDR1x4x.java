//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ELCAN SpecterDR 1x/4x
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAtSight;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelELCANSpecterDR1x4x extends ModelAtSight //Same as Filename
{
	int textureX = 256;
	int textureY = 128;
	
	private ModelRendererTurbo[] zoomStepModel;

	public ModelELCANSpecterDR1x4x() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[121];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 488
		attachmentModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 489
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 491
		attachmentModel[3] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 492
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 495
		attachmentModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 504
		attachmentModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 512
		attachmentModel[7] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 513
		attachmentModel[8] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 514
		attachmentModel[9] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 515
		attachmentModel[10] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 517
		attachmentModel[11] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 518
		attachmentModel[12] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 524
		attachmentModel[13] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 525
		attachmentModel[14] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 526
		attachmentModel[15] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 527
		attachmentModel[16] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 528
		attachmentModel[17] = new ModelRendererTurbo(this, 68, 23, textureX, textureY); // Box 529
		attachmentModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 530
		attachmentModel[19] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 531
		attachmentModel[20] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 534
		attachmentModel[21] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 535
		attachmentModel[22] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 536
		attachmentModel[23] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 540
		attachmentModel[24] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 541
		attachmentModel[25] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 542
		attachmentModel[26] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 543
		attachmentModel[27] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 544
		attachmentModel[28] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 545
		attachmentModel[29] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 546
		attachmentModel[30] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 547
		attachmentModel[31] = new ModelRendererTurbo(this, 89, 44, textureX, textureY); // Box 548
		attachmentModel[32] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 549
		attachmentModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 550
		attachmentModel[34] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 551
		attachmentModel[35] = new ModelRendererTurbo(this, 89, 47, textureX, textureY); // Box 552
		attachmentModel[36] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 553
		attachmentModel[37] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 554
		attachmentModel[38] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 556
		attachmentModel[39] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 559
		attachmentModel[40] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 564
		attachmentModel[41] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 568
		attachmentModel[42] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 570
		attachmentModel[43] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 575
		attachmentModel[44] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 577
		attachmentModel[45] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 579
		attachmentModel[46] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 581
		attachmentModel[47] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 584
		attachmentModel[48] = new ModelRendererTurbo(this, 68, 26, textureX, textureY); // Box 587
		attachmentModel[49] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 595
		attachmentModel[50] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 597
		attachmentModel[51] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 598
		attachmentModel[52] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 599
		attachmentModel[53] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 600
		attachmentModel[54] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 601
		attachmentModel[55] = new ModelRendererTurbo(this, 94, 95, textureX, textureY); // Box 602
		attachmentModel[56] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 603
		attachmentModel[57] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 604
		attachmentModel[58] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 612
		attachmentModel[59] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 613
		attachmentModel[60] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 615
		attachmentModel[61] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 616
		attachmentModel[62] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 617
		attachmentModel[63] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 619
		attachmentModel[64] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 620
		attachmentModel[65] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 621
		attachmentModel[66] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 622
		attachmentModel[67] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 623
		attachmentModel[68] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 624
		attachmentModel[69] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 625
		attachmentModel[70] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 630
		attachmentModel[71] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 631
		attachmentModel[72] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 632
		attachmentModel[73] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 633
		attachmentModel[74] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 634
		attachmentModel[75] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 635
		attachmentModel[76] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 636
		attachmentModel[77] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 637
		attachmentModel[78] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 638
		attachmentModel[79] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 639
		attachmentModel[80] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 640
		attachmentModel[81] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 641
		attachmentModel[82] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 642
		attachmentModel[83] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 643
		attachmentModel[84] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 646
		attachmentModel[85] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 647
		attachmentModel[86] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 648
		attachmentModel[87] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 649
		attachmentModel[88] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 650
		attachmentModel[89] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 651
		attachmentModel[90] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 652
		attachmentModel[91] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 653
		attachmentModel[92] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 654
		attachmentModel[93] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 168
		attachmentModel[94] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 171
		attachmentModel[95] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 175
		attachmentModel[96] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 195
		attachmentModel[97] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 175
		attachmentModel[98] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 176
		attachmentModel[99] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 177
		attachmentModel[100] = new ModelRendererTurbo(this, 177, 103, textureX, textureY); // Box 178
		attachmentModel[101] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 179
		attachmentModel[102] = new ModelRendererTurbo(this, 225, 94, textureX, textureY); // Box 180
		attachmentModel[103] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 181
		attachmentModel[104] = new ModelRendererTurbo(this, 177, 29, textureX, textureY); // Box 157
		attachmentModel[105] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 158
		attachmentModel[106] = new ModelRendererTurbo(this, 219, 111, textureX, textureY); // Box 159
		attachmentModel[107] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 160
		attachmentModel[108] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 161
		attachmentModel[109] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 162
		attachmentModel[110] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 163
		attachmentModel[111] = new ModelRendererTurbo(this, 216, 123, textureX, textureY); // Box 164
		attachmentModel[112] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 166
		attachmentModel[113] = new ModelRendererTurbo(this, 97, 30, textureX, textureY); // Box 167
		attachmentModel[114] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 168
		attachmentModel[115] = new ModelRendererTurbo(this, 78, 69, textureX, textureY); // Box 169
		attachmentModel[116] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 170
		attachmentModel[117] = new ModelRendererTurbo(this, 88, 50, textureX, textureY); // Box 171
		attachmentModel[118] = new ModelRendererTurbo(this, 109, 50, textureX, textureY); // Box 172
		attachmentModel[119] = new ModelRendererTurbo(this, 2, 26, textureX, textureY); // Box 173
		attachmentModel[120] = new ModelRendererTurbo(this, 77, 32, textureX, textureY); // Box 174

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 43, 1, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		attachmentModel[0].setRotationPoint(-32F, -16F, -2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 43, 4, 1, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, -1F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		attachmentModel[1].setRotationPoint(-32F, -16F, -6F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 43, 4, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		attachmentModel[2].setRotationPoint(-32F, -12F, -6F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 43, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 492
		attachmentModel[3].setRotationPoint(-32F, -12F, 5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 43, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 495
		attachmentModel[4].setRotationPoint(-32F, -5F, -2F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 504
		attachmentModel[5].setRotationPoint(-4F, -17F, -3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		attachmentModel[6].setRotationPoint(-34F, -12F, 6F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 513
		attachmentModel[7].setRotationPoint(-8F, -9F, 6F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 514
		attachmentModel[8].setRotationPoint(-8F, -8F, 5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, 3F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 515
		attachmentModel[9].setRotationPoint(7F, -5F, 5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		attachmentModel[10].setRotationPoint(-34F, -13F, 6F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 3F, 0F, 0.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -2F, 0F, 0.75F); // Box 518
		attachmentModel[11].setRotationPoint(7F, -5F, -7F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 1F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		attachmentModel[12].setRotationPoint(4F, -6F, 5F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 28, 1, 10, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		attachmentModel[13].setRotationPoint(-19F, -1F, -5F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		attachmentModel[14].setRotationPoint(8.25F, -4F, 6.5F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 527
		attachmentModel[15].setRotationPoint(8.25F, -4.5F, 6.5F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 528
		attachmentModel[16].setRotationPoint(8.25F, -1.5F, 6.5F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 529
		attachmentModel[17].setRotationPoint(8.25F, -2F, 6.5F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		attachmentModel[18].setRotationPoint(8.25F, -3F, 6.5F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		attachmentModel[19].setRotationPoint(11.25F, -3F, 6.5F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 534
		attachmentModel[20].setRotationPoint(-19F, -0.5F, 3F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		attachmentModel[21].setRotationPoint(-15F, 1F, 3F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		attachmentModel[22].setRotationPoint(-1F, 1F, 3F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		attachmentModel[23].setRotationPoint(-19.5F, -4F, -2F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 541
		attachmentModel[24].setRotationPoint(-16.5F, -4F, -5F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		attachmentModel[25].setRotationPoint(-16.5F, -4F, 2F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		attachmentModel[26].setRotationPoint(-20F, -2F, -2.5F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 544
		attachmentModel[27].setRotationPoint(-17F, -2F, -5.5F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		attachmentModel[28].setRotationPoint(-17F, -2F, 2.5F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		attachmentModel[29].setRotationPoint(-7F, -13F, 7F);

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 547
		attachmentModel[30].setRotationPoint(3F, -7F, -7F);

		attachmentModel[31].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		attachmentModel[31].setRotationPoint(-34F, -13F, -7F);

		attachmentModel[32].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 549
		attachmentModel[32].setRotationPoint(-34F, -9F, -7F);

		attachmentModel[33].addShapeBox(0F, 0F, 0F, 42, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		attachmentModel[33].setRotationPoint(-34F, -12F, -7F);

		attachmentModel[34].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.75F, 1F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 551
		attachmentModel[34].setRotationPoint(4F, -6F, -7F);

		attachmentModel[35].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 552
		attachmentModel[35].setRotationPoint(-34F, -8F, -7F);

		attachmentModel[36].addShapeBox(0F, 0F, 0F, 44, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 553
		attachmentModel[36].setRotationPoint(-34F, -4F, -1.5F);

		attachmentModel[37].addShapeBox(0F, 0F, 0F, 43, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 3.5F, 0F, -0.5F, 3.5F); // Box 554
		attachmentModel[37].setRotationPoint(-34F, -7F, -7F);

		attachmentModel[38].addShapeBox(-1F, -1F, 0F, 2, 2, 10, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 556
		attachmentModel[38].setRotationPoint(10.25F, -2.5F, -5F);

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 559
		attachmentModel[39].setRotationPoint(8.25F, -4.5F, -7.5F);

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 564
		attachmentModel[40].setRotationPoint(8.25F, -1.5F, -7.5F);

		attachmentModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 1F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 1F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		attachmentModel[41].setRotationPoint(-11F, -3.5F, -5.5F);

		attachmentModel[42].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 570
		attachmentModel[42].setRotationPoint(-7F, -15F, 7F);

		attachmentModel[43].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		attachmentModel[43].setRotationPoint(-8F, -7F, 7F);

		attachmentModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F); // Box 577
		attachmentModel[44].setRotationPoint(1F, -5F, 7F);

		attachmentModel[45].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		attachmentModel[45].setRotationPoint(-7F, -5F, -8F);

		attachmentModel[46].addShapeBox(0F, 0F, 0F, 12, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		attachmentModel[46].setRotationPoint(-9F, -7F, -7F);

		attachmentModel[47].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 584
		attachmentModel[47].setRotationPoint(-7F, -4F, -7F);

		attachmentModel[48].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		attachmentModel[48].setRotationPoint(-6F, -3.5F, 4F);

		attachmentModel[49].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 1F); // Box 595
		attachmentModel[49].setRotationPoint(-34F, -17F, -3F);

		attachmentModel[50].addShapeBox(0F, 0F, 0F, 44, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 597
		attachmentModel[50].setRotationPoint(-34F, -16F, 3F);

		attachmentModel[51].addShapeBox(0F, 0F, 0F, 43, 3, 2, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 598
		attachmentModel[51].setRotationPoint(-34F, -16F, -7F);

		attachmentModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 599
		attachmentModel[52].setRotationPoint(-29F, -18F, -3F);

		attachmentModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 600
		attachmentModel[53].setRotationPoint(-29F, -15F, 3F);

		attachmentModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F); // Box 601
		attachmentModel[54].setRotationPoint(-29F, -15F, -6F);

		attachmentModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 602
		attachmentModel[55].setRotationPoint(3F, -18F, -3F);

		attachmentModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F); // Box 603
		attachmentModel[56].setRotationPoint(3F, -15F, -6F);

		attachmentModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 604
		attachmentModel[57].setRotationPoint(3F, -15F, 3F);

		attachmentModel[58].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		attachmentModel[58].setRotationPoint(-21F, -12F, 5.5F);

		attachmentModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0F); // Box 613
		attachmentModel[59].setRotationPoint(-18F, -14.5F, 6F);

		attachmentModel[60].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		attachmentModel[60].setRotationPoint(-34F, -10F, 6F);

		attachmentModel[61].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		attachmentModel[61].setRotationPoint(-8F, -12F, 6F);

		attachmentModel[62].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		attachmentModel[62].setRotationPoint(-8F, -13F, 5F);

		attachmentModel[63].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		attachmentModel[63].setRotationPoint(-34F, -8F, 6F);

		attachmentModel[64].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, 0F, 1F, 3F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		attachmentModel[64].setRotationPoint(-34F, -14F, 5F);

		attachmentModel[65].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 621
		attachmentModel[65].setRotationPoint(-8F, -14F, 5F);

		attachmentModel[66].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 4F, 0F, 2F, 2F, 0F, -2F, 0F, 0F, -2F); // Box 622
		attachmentModel[66].setRotationPoint(-34F, -7F, 5F);

		attachmentModel[67].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 623
		attachmentModel[67].setRotationPoint(3F, -7F, 5F);

		attachmentModel[68].addShapeBox(0F, 0F, 0F, 43, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 624
		attachmentModel[68].setRotationPoint(-34F, -5F, 3F);

		attachmentModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 625
		attachmentModel[69].setRotationPoint(-18F, -8F, 6F);

		attachmentModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		attachmentModel[70].setRotationPoint(2F, 0F, -8F);

		attachmentModel[71].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 631
		attachmentModel[71].setRotationPoint(-1F, 0F, -5F);

		attachmentModel[72].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 632
		attachmentModel[72].setRotationPoint(-15F, 0F, -5F);

		attachmentModel[73].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.22F, 0F, 0F, 0F, 0F, 0F); // Box 633
		attachmentModel[73].setRotationPoint(-19F, -0.5F, -5F);

		attachmentModel[74].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F); // Box 634
		attachmentModel[74].setRotationPoint(2F, 0F, -9F);

		attachmentModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F); // Box 635
		attachmentModel[75].setRotationPoint(-12F, 0F, -9F);

		attachmentModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		attachmentModel[76].setRotationPoint(-12F, 0F, -8F);

		attachmentModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		attachmentModel[77].setRotationPoint(3F, -0.5F, -7F);

		attachmentModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 638
		attachmentModel[78].setRotationPoint(3F, -0.5F, -8F);

		attachmentModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 639
		attachmentModel[79].setRotationPoint(3F, -0.5F, -6F);

		attachmentModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 640
		attachmentModel[80].setRotationPoint(-11F, -0.5F, -6F);

		attachmentModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		attachmentModel[81].setRotationPoint(-11F, -0.5F, -7F);

		attachmentModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 642
		attachmentModel[82].setRotationPoint(-11F, -0.5F, -8F);

		attachmentModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 643
		attachmentModel[83].setRotationPoint(-13F, -1.25F, -7F);

		attachmentModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 646
		attachmentModel[84].setRotationPoint(1F, -1.25F, -7F);

		attachmentModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		attachmentModel[85].setRotationPoint(-5F, -0.25F, -7F);

		attachmentModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 648
		attachmentModel[86].setRotationPoint(-5F, -0.75F, -7F);

		attachmentModel[87].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
		attachmentModel[87].setRotationPoint(-19F, -0.25F, -7F);

		attachmentModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 650
		attachmentModel[88].setRotationPoint(-19F, -0.75F, -7F);

		attachmentModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		attachmentModel[89].setRotationPoint(-11F, 1F, -8F);

		attachmentModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 652
		attachmentModel[90].setRotationPoint(-9F, 1F, -8F);

		attachmentModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 653
		attachmentModel[91].setRotationPoint(5F, 1F, -8F);

		attachmentModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		attachmentModel[92].setRotationPoint(3F, 1F, -8F);

		attachmentModel[93].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		attachmentModel[93].setRotationPoint(8.25F, -3.5F, -7.5F);

		attachmentModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		attachmentModel[94].setRotationPoint(9.25F, -3F, 6.01F);

		attachmentModel[95].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 2F, 0F, 0.75F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 175
		attachmentModel[95].setRotationPoint(3F, -7F, 5F);

		attachmentModel[96].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		attachmentModel[96].setRotationPoint(-23F, -14F, 5F);

		attachmentModel[97].addShapeBox(0F, 0F, 0F, 43, 4, 1, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 175
		attachmentModel[97].setRotationPoint(-32F, -16F, 5F);

		attachmentModel[98].addShapeBox(0F, 0F, 0F, 43, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -4F, 1F, 0F, -4F); // Box 176
		attachmentModel[98].setRotationPoint(-32F, -8F, 5F);

		attachmentModel[99].addShapeBox(0F, 0F, 0F, 43, 4, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, -1F, 3F); // Box 177
		attachmentModel[99].setRotationPoint(-32F, -8F, -6F);

		attachmentModel[100].addShapeBox(0F, 0F, 0F, 11, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F); // Box 178
		attachmentModel[100].setRotationPoint(-20F, -5.5F, -5.5F);

		attachmentModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 179
		attachmentModel[101].setRotationPoint(9F, -15F, -2F);

		attachmentModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		attachmentModel[102].setRotationPoint(9F, -12F, -5F);

		attachmentModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		attachmentModel[103].setRotationPoint(9F, -8F, -2F);

		attachmentModel[104].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 157
		attachmentModel[104].setRotationPoint(-7F, -8F, 7F);

		attachmentModel[105].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		attachmentModel[105].setRotationPoint(-23F, -8F, 5F);

		attachmentModel[106].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F, -6F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0.5F, -6F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 159
		attachmentModel[106].setRotationPoint(2F, -4F, -3.75F);

		attachmentModel[107].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 160
		attachmentModel[107].setRotationPoint(-7F, -13F, -8F);

		attachmentModel[108].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 161
		attachmentModel[108].setRotationPoint(-7F, -8F, -8F);

		attachmentModel[109].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 162
		attachmentModel[109].setRotationPoint(-8F, -7F, -8F);

		attachmentModel[110].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 163
		attachmentModel[110].setRotationPoint(-7F, -15F, -8F);

		attachmentModel[111].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 164
		attachmentModel[111].setRotationPoint(-7F, -4F, 3F);

		attachmentModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F); // Box 166
		attachmentModel[112].setRotationPoint(-9F, -5F, 7F);

		attachmentModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F); // Box 167
		attachmentModel[113].setRotationPoint(-9F, -5F, -7F);

		attachmentModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F); // Box 168
		attachmentModel[114].setRotationPoint(1F, -5F, -7F);

		attachmentModel[115].addShapeBox(0F, 0F, 0F, 43, 1, 2, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		attachmentModel[115].setRotationPoint(-34F, -15F, 4F);

		attachmentModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F); // Box 170
		attachmentModel[116].setRotationPoint(-9F, -4F, 0F);

		attachmentModel[117].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
		attachmentModel[117].setRotationPoint(-21F, -12F, 8F);

		attachmentModel[118].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		attachmentModel[118].setRotationPoint(-21F, -10F, 8F);

		attachmentModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		attachmentModel[119].setRotationPoint(-21F, -10.5F, 8F);

		attachmentModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 174
		attachmentModel[120].setRotationPoint(-14F, -10.5F, 8F);
		
		zoomStepModel = new ModelRendererTurbo[22];
		zoomStepModel[0] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 142
		zoomStepModel[1] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 143
		zoomStepModel[2] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 144
		zoomStepModel[3] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 145
		zoomStepModel[4] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 146
		zoomStepModel[5] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 147
		zoomStepModel[6] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 148
		zoomStepModel[7] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 153
		zoomStepModel[8] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 154
		zoomStepModel[9] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 155
		zoomStepModel[10] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 156
		zoomStepModel[11] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 154
		zoomStepModel[12] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 155
		zoomStepModel[13] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 156
		zoomStepModel[14] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 157
		zoomStepModel[15] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 158
		zoomStepModel[16] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 159
		zoomStepModel[17] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 160
		zoomStepModel[18] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 161
		zoomStepModel[19] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 162
		zoomStepModel[20] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 163
		zoomStepModel[21] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 164

		zoomStepModel[0].addShapeBox(-1F, -1F, -2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		zoomStepModel[0].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[0].rotateAngleY = -0.78539816F;

		zoomStepModel[1].addShapeBox(-2F, -1F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 143
		zoomStepModel[1].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[1].rotateAngleY = -0.78539816F;

		zoomStepModel[2].addShapeBox(1F, -1F, -3F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144
		zoomStepModel[2].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[2].rotateAngleY = -0.78539816F;

		zoomStepModel[3].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		zoomStepModel[3].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[3].rotateAngleY = -0.78539816F;

		zoomStepModel[4].addShapeBox(-2F, -1F, -2.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		zoomStepModel[4].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[4].rotateAngleY = -0.78539816F;

		zoomStepModel[5].addShapeBox(-2F, -1F, -3F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		zoomStepModel[5].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[5].rotateAngleY = -0.78539816F;

		zoomStepModel[6].addShapeBox(-2F, -1F, 1.5F, 3, 1, 9, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 148
		zoomStepModel[6].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[6].rotateAngleY = -0.78539816F;

		zoomStepModel[7].addShapeBox(-2.5F, -0.5F, -2.5F, 5, 1, 1, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F); // Box 153
		zoomStepModel[7].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[7].rotateAngleY = -0.78539816F;

		zoomStepModel[8].addShapeBox(1F, -1F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 154
		zoomStepModel[8].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[8].rotateAngleY = -0.78539816F;

		zoomStepModel[9].addShapeBox(1F, -1F, -2.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		zoomStepModel[9].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[9].rotateAngleY = -0.78539816F;

		zoomStepModel[10].addShapeBox(7F, -1F, 7.5F, 2, 2, 1, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 156
		zoomStepModel[10].setRotationPoint(-3F, -2.5F, 0F);

		zoomStepModel[11].addShapeBox(-1F, -1F, -2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		zoomStepModel[11].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[11].rotateAngleY = 0.78539816F;

		zoomStepModel[12].addShapeBox(-2F, -1F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 155
		zoomStepModel[12].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[12].rotateAngleY = 0.78539816F;

		zoomStepModel[13].addShapeBox(1F, -1F, -3F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 156
		zoomStepModel[13].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[13].rotateAngleY = 0.78539816F;

		zoomStepModel[14].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		zoomStepModel[14].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[14].rotateAngleY = 0.78539816F;

		zoomStepModel[15].addShapeBox(-2F, -1F, -2.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		zoomStepModel[15].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[15].rotateAngleY = 0.78539816F;

		zoomStepModel[16].addShapeBox(-2F, -1F, -3F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 159
		zoomStepModel[16].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[16].rotateAngleY = 0.78539816F;

		zoomStepModel[17].addShapeBox(-2F, -1F, 1.5F, 3, 1, 9, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 160
		zoomStepModel[17].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[17].rotateAngleY = 0.78539816F;

		zoomStepModel[18].addShapeBox(-2.5F, -0.5F, -2.5F, 5, 1, 1, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F); // Box 161
		zoomStepModel[18].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[18].rotateAngleY = 0.78539816F;

		zoomStepModel[19].addShapeBox(1F, -1F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 162
		zoomStepModel[19].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[19].rotateAngleY = 0.78539816F;

		zoomStepModel[20].addShapeBox(1F, -1F, -2.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		zoomStepModel[20].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[20].rotateAngleY = 0.78539816F;

		zoomStepModel[21].addShapeBox(7F, -1F, 7.5F, 2, 2, 1, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 164
		zoomStepModel[21].setRotationPoint(-3F, -2.5F, 0F);
		zoomStepModel[21].rotateAngleY = 1.57079633F;

		pupilRefCenter.set(-31F / 16F, 10F / 16F, 0F / 16F);
		scopeGlassModelScale.set(1F, 0.02F, 0.02F);
		scopeObjectiveLensCenter.set(11F / 160F, 10F / 160F, 0F);
		scopeMaskMultRotY = scopeMaskMultRotZ = 0.45F;
		scopeMaskMultTransY = scopeMaskMultTransZ = 0.36F;
		scopeMaskScale = 0.35F / 1600F;
		minPupilDistance = 0.023F;
		scopeMaskAlphaDivisor = new float[]{ 0.00003F, 0.00009F };
		reticleAt[0].set(4096F, 10F / 160F, 0F);
		reticleScale = 1.6F / 160F;
		relativeReticleSize = true;

		reticleBorder = new Vector3f[6];
		reticleBorder[0] = new Vector3f(15F / 160F, 12F / 160F, -6F / 160F);
		reticleBorder[1] = new Vector3f(15F / 160F, 16F / 160F, -2F / 160F);
		reticleBorder[2] = new Vector3f(15F / 160F, 16F / 160F, 2F / 160F);
		reticleBorder[3] = new Vector3f(15F / 160F, 12F / 160F, 6F / 160F);
		reticleBorder[4] = new Vector3f(15F / 160F, 4F / 160F, 6F / 160F);
		reticleBorder[5] = new Vector3f(15F / 160F, 4F / 160F, -6F / 160F);

		flipAll();
		flip(zoomStepModel);
	}
	
	@Override
	public void render(float f)
	{
		render(attachmentModel, f);
		if(getZoomStep() != 0) partialRender(zoomStepModel, 11, 22, f);
		else partialRender(zoomStepModel, 0, 11, f);
	}
}