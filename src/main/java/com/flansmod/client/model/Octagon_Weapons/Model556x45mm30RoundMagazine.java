//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 5.56x45mm 30 Rounds Magazine
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model556x45mm30RoundMagazine extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public Model556x45mm30RoundMagazine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[81];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 106
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 107
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 108
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 109
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 110
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 111
		gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 405
		gunModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 489
		gunModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 490
		gunModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 491
		gunModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 492
		gunModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 493
		gunModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 494
		gunModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 495
		gunModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 496
		gunModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 497
		gunModel[16] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 498
		gunModel[17] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 499
		gunModel[18] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 500
		gunModel[19] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 501
		gunModel[20] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 502
		gunModel[21] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 503
		gunModel[22] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 504
		gunModel[23] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 505
		gunModel[24] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 506
		gunModel[25] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 507
		gunModel[26] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 508
		gunModel[27] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 509
		gunModel[28] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 510
		gunModel[29] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 511
		gunModel[30] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 512
		gunModel[31] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 513
		gunModel[32] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 42
		gunModel[33] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 43
		gunModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 44
		gunModel[35] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 45
		gunModel[36] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 46
		gunModel[37] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 47
		gunModel[38] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 48
		gunModel[39] = new ModelRendererTurbo(this, 119, 41, textureX, textureY); // Box 49
		gunModel[40] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 50
		gunModel[41] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 51
		gunModel[42] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 52
		gunModel[43] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 53
		gunModel[44] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 54
		gunModel[45] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 55
		gunModel[46] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 56
		gunModel[47] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 57
		gunModel[48] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 58
		gunModel[49] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 59
		gunModel[50] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 60
		gunModel[51] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 61
		gunModel[52] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 62
		gunModel[53] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 63
		gunModel[54] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 68
		gunModel[55] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 69
		gunModel[56] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 70
		gunModel[57] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 72
		gunModel[58] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 73
		gunModel[59] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 74
		gunModel[60] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 147
		gunModel[61] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 148
		gunModel[62] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 149
		gunModel[63] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 150
		gunModel[64] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 157
		gunModel[65] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 158
		gunModel[66] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 159
		gunModel[67] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 160
		gunModel[68] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 161
		gunModel[69] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 162
		gunModel[70] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 163
		gunModel[71] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 164
		gunModel[72] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 165
		gunModel[73] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 166
		gunModel[74] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 83
		gunModel[75] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 84
		gunModel[76] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 85
		gunModel[77] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 86
		gunModel[78] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 88
		gunModel[79] = new ModelRendererTurbo(this, 62, 65, textureX, textureY); // Box 89
		gunModel[80] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 90

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 21, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 106
		gunModel[0].setRotationPoint(11.5F, 0F, -2.25F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1F, -0.5F); // Box 107
		gunModel[1].setRotationPoint(12.5F, 21F, -2.25F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0.5F, 1F, -0.5F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 108
		gunModel[2].setRotationPoint(13.5F, 31F, -2.25F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, -1F, 1.5F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, -1.5F, 1.5F, -0.5F); // Box 109
		gunModel[3].setRotationPoint(14.5F, 34F, -2.25F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 23, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 110
		gunModel[4].setRotationPoint(0F, 0F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 1F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.5F, -0.5F, -0.5F, -2F, 1.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, -0.5F, -2.5F, 1.5F, -0.5F); // Box 111
		gunModel[5].setRotationPoint(16.5F, 42F, -2.25F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 9, 29, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		gunModel[6].setRotationPoint(2F, 0F, -2.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 21, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0.4F, -0.25F); // Box 489
		gunModel[7].setRotationPoint(15.5F, 0F, -3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 490
		gunModel[8].setRotationPoint(8.5F, 0F, -3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 22, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 1.5F, -0.5F); // Box 491
		gunModel[9].setRotationPoint(4F, 0F, -3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 492
		gunModel[10].setRotationPoint(1.5F, 0F, -3F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, -0.4F, -0.25F, -0.5F, 0.6F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, -0.5F, 0.6F, -0.25F); // Box 493
		gunModel[11].setRotationPoint(15.5F, 21F, -3F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, -0.6F, -0.25F, -0.6F, 0.8F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, -0.6F, 0.8F, -0.25F); // Box 494
		gunModel[12].setRotationPoint(16.5F, 29F, -3F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0.4F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.4F, -0.8F, -0.25F, -1.5F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, -0.25F, -1.5F, 1F, -0.25F); // Box 495
		gunModel[13].setRotationPoint(17.5F, 34F, -3F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 496
		gunModel[14].setRotationPoint(0F, 23F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, -1F, -0.25F, -2.2F, 2.0469F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, -0.25F, -2.2F, 2.0469F, -0.25F); // Box 497
		gunModel[15].setRotationPoint(19.5F, 41F, -3F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 1F, 0F); // Box 498
		gunModel[16].setRotationPoint(8.5F, 21F, -3F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, -1F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 1F, 0F); // Box 499
		gunModel[17].setRotationPoint(9.5F, 30F, -3F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 1F, 0F); // Box 500
		gunModel[18].setRotationPoint(10.5F, 37F, -3F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, -3F, 1.9531F, 0F, 3.2F, -0.0156F, 0F, 3.2F, -0.0156F, 0F, -3F, 1.9531F, 0F); // Box 501
		gunModel[19].setRotationPoint(12.5F, 44F, -3F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.5F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0.5F, 0.5F, -0.5F, -0.5F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 1F, -0.5F); // Box 502
		gunModel[20].setRotationPoint(4F, 24F, -3F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.5F, 0F, -0.5F, -1F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, -1F, 1F, -0.5F); // Box 503
		gunModel[21].setRotationPoint(5F, 31F, -3F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 1.5F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, -1.5F, 1.5F, -0.5F); // Box 504
		gunModel[22].setRotationPoint(6.5F, 38F, -3F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.5F, -0.5F, -0.5F, -2.7F, 1.9688F, 0F, 3F, 0.4219F, 0F, 3F, 0.4219F, -0.5F, -2.7F, 1.9688F, -0.5F); // Box 505
		gunModel[23].setRotationPoint(8.5F, 45F, -3F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 506
		gunModel[24].setRotationPoint(1.5F, 23F, -3F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0.5F, 0F); // Box 507
		gunModel[25].setRotationPoint(2.5F, 32F, -3F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.5F, 0.5F, 0F); // Box 508
		gunModel[26].setRotationPoint(4F, 39F, -3F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0.5F, 0F, -2F, 1F, 0F, 2.4F, 0.3438F, 0F, 2.4F, 0.3438F, 0F, -2F, 1F, 0F); // Box 509
		gunModel[27].setRotationPoint(7F, 49F, -3F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 510
		gunModel[28].setRotationPoint(1F, 31.5F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0.5F, 0F); // Box 511
		gunModel[29].setRotationPoint(2.5F, 38.5F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, 0.5F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F); // Box 512
		gunModel[30].setRotationPoint(5.5F, 48.5F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 9, 21, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -7F, 5F, 0F, 8.7F, -0.0156F, 0F, 8.7F, -0.0156F, -0.5F, -7F, 5F, -0.5F); // Box 513
		gunModel[31].setRotationPoint(2F, 29F, -2.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 9, 21, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[32].setRotationPoint(2F, 8F, 1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 9, 21, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 5F, -0.5F, 8.7F, -0.0156F, -0.5F, 8.7F, -0.0156F, 0F, -7F, 5F, 0F); // Box 43
		gunModel[33].setRotationPoint(2F, 29F, 1.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 3, 21, 1, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0.4F, 0F); // Box 44
		gunModel[34].setRotationPoint(15.5F, 0F, 2F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0.5F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, -0.4F, 0F, -0.5F, 0.6F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0F, -0.5F, 0.6F, 0F); // Box 45
		gunModel[35].setRotationPoint(15.5F, 21F, 2F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0.5F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, -0.6F, 0F, -0.6F, 0.8F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0F, -0.6F, 0.8F, 0F); // Box 46
		gunModel[36].setRotationPoint(16.5F, 29F, 2F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0.4F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.4F, -0.8F, 0F, -1.5F, 1F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, 0F, -1.5F, 1F, 0F); // Box 47
		gunModel[37].setRotationPoint(17.5F, 34F, 2F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.5F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, -1F, 0F, -2.2F, 2.0469F, -0.25F, 2.5F, 0.5F, -0.25F, 2.5F, 0.5F, 0F, -2.2F, 2.0469F, 0F); // Box 48
		gunModel[38].setRotationPoint(19.5F, 41F, 2F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 49
		gunModel[39].setRotationPoint(8.5F, 0F, 2F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 1.5F, 0F); // Box 50
		gunModel[40].setRotationPoint(4F, 8F, 2F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 51
		gunModel[41].setRotationPoint(1.5F, 0F, 2F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 1F, 0F); // Box 52
		gunModel[42].setRotationPoint(8.5F, 21F, 2F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, -1F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 1F, 0F); // Box 53
		gunModel[43].setRotationPoint(9.5F, 30F, 2F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 1F, 0F); // Box 54
		gunModel[44].setRotationPoint(10.5F, 37F, 2F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.5F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0.5F, 0F, 0F, -1.5F, 1.5F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -1.5F, 1.5F, 0F); // Box 55
		gunModel[45].setRotationPoint(6.5F, 38F, 2F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.5F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0.5F, 0F, 0F, -1F, 1F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1F, 1F, 0F); // Box 56
		gunModel[46].setRotationPoint(5F, 31F, 2F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.5F, 0.5F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0.5F, 0.5F, 0F, -0.5F, 1F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 1F, 0F); // Box 57
		gunModel[47].setRotationPoint(4F, 24F, 2F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 58
		gunModel[48].setRotationPoint(1.5F, 23F, 2F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0.5F, 0F); // Box 59
		gunModel[49].setRotationPoint(2.5F, 32F, 2F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.5F, 0.5F, 0F); // Box 60
		gunModel[50].setRotationPoint(4F, 39F, 2F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0.5F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0.5F, -0.5F, 0F, -2.7F, 1.9688F, -0.5F, 3F, 0.4219F, -0.5F, 3F, 0.4219F, 0F, -2.7F, 1.9688F, 0F); // Box 61
		gunModel[51].setRotationPoint(8.5F, 45F, 2F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, -3F, 1.9531F, 0F, 3.2F, -0.0156F, 0F, 3.2F, -0.0156F, 0F, -3F, 1.9531F, 0F); // Box 62
		gunModel[52].setRotationPoint(12.5F, 44F, 2F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0.5F, 0F, -2F, 1F, 0F, 2.4F, 0.3438F, 0F, 2.4F, 0.3438F, 0F, -2F, 1F, 0F); // Box 63
		gunModel[53].setRotationPoint(7F, 49F, 2F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 21, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 68
		gunModel[54].setRotationPoint(17.5F, 0F, -2F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 69
		gunModel[55].setRotationPoint(17.5F, 21F, -2F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 70
		gunModel[56].setRotationPoint(18.5F, 29F, -2F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0.25F, -2F, 0F, 0.25F); // Box 72
		gunModel[57].setRotationPoint(19.5F, 34F, -2F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2.5F, 0.5F, 0.25F, 2.5F, 0.5F, 0.25F, 2.5F, 0.5F, 0.25F, -2.5F, 0.5F, 0.25F); // Box 73
		gunModel[58].setRotationPoint(21.5F, 41F, -2F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, 0.5F, -7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0.5F, -7F, 0.5F, 0.5F, 7F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, 7F, 0.5F); // Box 74
		gunModel[59].setRotationPoint(9.5F, 47F, -2.25F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		gunModel[60].setRotationPoint(1F, -0.5F, -3F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[61].setRotationPoint(1F, -1.5F, -3F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		gunModel[62].setRotationPoint(1F, -0.5F, 2F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 150
		gunModel[63].setRotationPoint(1F, -1.5F, 2F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 23, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gunModel[64].setRotationPoint(1F, 0F, -2F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 158
		gunModel[65].setRotationPoint(1F, 23F, -2F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 159
		gunModel[66].setRotationPoint(2F, 31.5F, -2F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 160
		gunModel[67].setRotationPoint(3.5F, 38.5F, -2F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -3.5F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3.5F, 0F, 0F); // Box 161
		gunModel[68].setRotationPoint(5.5F, 49F, -2F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 6, 21, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		gunModel[69].setRotationPoint(11.5F, 0F, 1.25F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 163
		gunModel[70].setRotationPoint(12.5F, 21F, 1.25F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0.5F, 1F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 1F, 1F, 0F, -0.5F, 0.5F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0.5F, 0F); // Box 164
		gunModel[71].setRotationPoint(13.5F, 31F, 1.25F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, 1.5F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -1F, 1.5F, 0F); // Box 165
		gunModel[72].setRotationPoint(14.5F, 34F, 1.25F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0.5F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 1F, -0.5F, 0F, -2.5F, 1.5F, -0.5F, 2.5F, -0.5F, -0.5F, 2.5F, -0.5F, 0F, -2F, 1.5F, 0F); // Box 166
		gunModel[73].setRotationPoint(16.5F, 42F, 1.25F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 83
		gunModel[74].setRotationPoint(4F, 0F, 2F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 84
		gunModel[75].setRotationPoint(3F, 0F, 1.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[76].setRotationPoint(7F, 6F, 1.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[77].setRotationPoint(2.5F, 6F, 1.5F);

		gunModel[78].addShapeBox(1F, 0F, 0F, 18, 9, 6, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 88
		gunModel[78].setRotationPoint(0.9F, 31.5F, -3F);
		gunModel[78].rotateAngleZ = 0.20943951F;

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F, 0F, 0F, 0.1F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 0.1F); // Box 89
		gunModel[79].setRotationPoint(0.9F, 31.5F, -1.5F);
		gunModel[79].rotateAngleZ = 0.20943951F;

		gunModel[80].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
		gunModel[80].setRotationPoint(3.75F, 8F, 2.5F);

		takeOutTranslate = new Vector3f(-11F / 16F, -9F / 16F, 2F / 16F);
		takeOutRotate = new Vector3f(0F, 0F, -80F);
		holdingTranslate = new Vector3f(0F, 3F / 16F, 2.5F / 16F);
		holdingRotate = new Vector3f(-10F, 0F, 15F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F);
		gunModifyTranslate = new Vector3f(0.5F, 10F /16F, 0F);

		bulletAttachPoint1 = new Vector3f[8];
		bulletAttachPoint1[0] = new Vector3f(1.5F / 160F, 0.25F / 160F, -1F / 160F);
		bulletAttachPoint1[1] = new Vector3f(1.5F / 160F, -0.75F / 160F, 1F / 160F);
		bulletAttachPoint1[2] = new Vector3f(1.5F / 160F, -1.75F / 160F, -1F / 160F);
		bulletAttachPoint1[3] = new Vector3f(1.5F / 160F, -2.75F / 160F, 1F / 160F);
		bulletAttachPoint1[4] = new Vector3f(1.5F / 160F, -3.75F / 160F, -1F / 160F);
		bulletAttachPoint1[5] = new Vector3f(1.5F / 160F, -4.75F / 160F, 1F / 160F);
		bulletAttachPoint1[6] = new Vector3f(1.5F / 160F, -5.75F / 160F, -1F / 160F);
		bulletAttachPoint1[7] = new Vector3f(1.5F / 160F, -6.75F / 160F, 1F / 160F);

		bulletAttachPoint2 = new Vector3f[8];
		bulletAttachPoint2[0] = new Vector3f(1.5F / 160F, 0.25F / 160F, 1F / 160F);
		bulletAttachPoint2[1] = new Vector3f(1.5F / 160F, -0.75F / 160F, -1F / 160F);
		bulletAttachPoint2[2] = new Vector3f(1.5F / 160F, -1.75F / 160F, 1F / 160F);
		bulletAttachPoint2[3] = new Vector3f(1.5F / 160F, -2.75F / 160F, -1F / 160F);
		bulletAttachPoint2[4] = new Vector3f(1.5F / 160F, -3.75F / 160F, 1F / 160F);
		bulletAttachPoint2[5] = new Vector3f(1.5F / 160F, -4.75F / 160F, -1F / 160F);
		bulletAttachPoint2[6] = new Vector3f(1.5F / 160F, -5.75F / 160F, 1F / 160F);
		bulletAttachPoint2[7] = new Vector3f(1.5F / 160F, -6.75F / 160F, -1F / 160F);

		magFollowerAttachPos = new Vector3f[9];
		magFollowerAttachPos[0] = new Vector3f(1.5F / 160F, 0F, 0F);
		magFollowerAttachPos[1] = new Vector3f(1.5F / 160F, -0.75F / 160F, 0F);
		magFollowerAttachPos[2] = new Vector3f(1.5F / 160F, -1.75F / 160F, 0F);
		magFollowerAttachPos[3] = new Vector3f(1.5F / 160F, -2.75F / 160F, 0F);
		magFollowerAttachPos[4] = new Vector3f(1.5F / 160F, -3.75F / 160F, 0F);
		magFollowerAttachPos[5] = new Vector3f(1.5F / 160F, -4.75F / 160F, 0F);
		magFollowerAttachPos[6] = new Vector3f(1.5F / 160F, -5.75F / 160F, 0F);
		magFollowerAttachPos[7] = new Vector3f(1.5F / 160F, -6.75F / 160F, 0F);
		magFollowerAttachPos[8] = new Vector3f(1.5F / 160F, -7.75F / 160F, 0F);

		flipAll();
	}
}