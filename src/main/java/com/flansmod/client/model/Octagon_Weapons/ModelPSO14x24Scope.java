//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PSO-1 4x24 Scope
// Model Creator: 
// Created on: 22.12.2019 - 13:22:03
// Last changed on: 22.12.2019 - 13:22:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAtSight;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelPSO14x24Scope extends ModelAtSight //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelPSO14x24Scope() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[78];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
		attachmentModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 5
		attachmentModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 6
		attachmentModel[7] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		attachmentModel[8] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 8
		attachmentModel[9] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 9
		attachmentModel[10] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 10
		attachmentModel[11] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 11
		attachmentModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		attachmentModel[13] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 13
		attachmentModel[14] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 14
		attachmentModel[15] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 15
		attachmentModel[16] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 16
		attachmentModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17
		attachmentModel[18] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 18
		attachmentModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 19
		attachmentModel[20] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 20
		attachmentModel[21] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 21
		attachmentModel[22] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 23
		attachmentModel[23] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 24
		attachmentModel[24] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 25
		attachmentModel[25] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 26
		attachmentModel[26] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 27
		attachmentModel[27] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 29
		attachmentModel[28] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		attachmentModel[29] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 31
		attachmentModel[30] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		attachmentModel[31] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 33
		attachmentModel[32] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 36
		attachmentModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 39
		attachmentModel[34] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 41
		attachmentModel[35] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 46
		attachmentModel[36] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 47
		attachmentModel[37] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 49
		attachmentModel[38] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 50
		attachmentModel[39] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 51
		attachmentModel[40] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 52
		attachmentModel[41] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 53
		attachmentModel[42] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 54
		attachmentModel[43] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 66
		attachmentModel[44] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 69
		attachmentModel[45] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 86
		attachmentModel[46] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 87
		attachmentModel[47] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 88
		attachmentModel[48] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 89
		attachmentModel[49] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 90
		attachmentModel[50] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 92
		attachmentModel[51] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 93
		attachmentModel[52] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 94
		attachmentModel[53] = new ModelRendererTurbo(this, 135, 56, textureX, textureY); // Box 95
		attachmentModel[54] = new ModelRendererTurbo(this, 208, 57, textureX, textureY); // Box 96
		attachmentModel[55] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 97
		attachmentModel[56] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 98
		attachmentModel[57] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 99
		attachmentModel[58] = new ModelRendererTurbo(this, 231, 56, textureX, textureY); // Box 100
		attachmentModel[59] = new ModelRendererTurbo(this, 55, 65, textureX, textureY); // Box 101
		attachmentModel[60] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 102
		attachmentModel[61] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 103
		attachmentModel[62] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 105
		attachmentModel[63] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 106
		attachmentModel[64] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 107
		attachmentModel[65] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 108
		attachmentModel[66] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 109
		attachmentModel[67] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 110
		attachmentModel[68] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 117
		attachmentModel[69] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 118
		attachmentModel[70] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 119
		attachmentModel[71] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 108
		attachmentModel[72] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 109
		attachmentModel[73] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 110
		attachmentModel[74] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 111
		attachmentModel[75] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 112
		attachmentModel[76] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 113
		attachmentModel[77] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 114

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 27, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-6F, -1F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		attachmentModel[1].setRotationPoint(-6F, 0F, -4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		attachmentModel[2].setRotationPoint(-6F, 0F, 3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 3
		attachmentModel[3].setRotationPoint(0.5F, -1F, -7F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		attachmentModel[4].setRotationPoint(0.5F, 1F, -7F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		attachmentModel[5].setRotationPoint(-0.5F, 0F, -6.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 6
		attachmentModel[6].setRotationPoint(12.5F, -1F, -7F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		attachmentModel[7].setRotationPoint(11.5F, 0F, -6.5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 8
		attachmentModel[8].setRotationPoint(12.5F, 1F, -7F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		attachmentModel[9].setRotationPoint(14F, -3F, -4F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		attachmentModel[10].setRotationPoint(14F, -5F, 1F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		attachmentModel[11].setRotationPoint(14F, -7F, 2F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		attachmentModel[12].setRotationPoint(15F, -8F, 3F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		attachmentModel[13].setRotationPoint(19F, -8F, 3F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		attachmentModel[14].setRotationPoint(14F, -6F, -1F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		attachmentModel[15].setRotationPoint(0F, -6F, -1F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 16
		attachmentModel[16].setRotationPoint(6.5F, -5F, -2F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 17
		attachmentModel[17].setRotationPoint(6.5F, -6F, 2F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		attachmentModel[18].setRotationPoint(5.5F, -3F, -1F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		attachmentModel[19].setRotationPoint(-1F, -5F, -1F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		attachmentModel[20].setRotationPoint(-6F, -5F, -1F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		attachmentModel[21].setRotationPoint(-6F, -3F, 0F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		attachmentModel[22].setRotationPoint(-6F, -7F, 3F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		attachmentModel[23].setRotationPoint(-1F, -7F, 3F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		attachmentModel[24].setRotationPoint(-6F, -6F, 4F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		attachmentModel[25].setRotationPoint(-1F, -6F, 4F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 13, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		attachmentModel[26].setRotationPoint(-12.99F, -6F, 6F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 29
		attachmentModel[27].setRotationPoint(-12.99F, -5F, 8F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 32, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		attachmentModel[28].setRotationPoint(10F, -11.5F, 3.5F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 32, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		attachmentModel[29].setRotationPoint(10F, -11.5F, -4.5F);

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		attachmentModel[30].setRotationPoint(10F, -14.5F, -1.5F);

		attachmentModel[31].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		attachmentModel[31].setRotationPoint(10F, -6.5F, -1.5F);

		attachmentModel[32].addShapeBox(0F, 0F, 0F, 32, 3, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		attachmentModel[32].setRotationPoint(10F, -14.5F, -4.5F);

		attachmentModel[33].addShapeBox(0F, 0F, 0F, 18, 3, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 39
		attachmentModel[33].setRotationPoint(-8F, -15F, -3F);

		attachmentModel[34].addShapeBox(0F, 0F, 0F, 18, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		attachmentModel[34].setRotationPoint(-8F, -12F, -5F);

		attachmentModel[35].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
		attachmentModel[35].setRotationPoint(-16F, -12.5F, -1.5F);

		attachmentModel[36].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		attachmentModel[36].setRotationPoint(-16F, -11.5F, -2.5F);

		attachmentModel[37].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		attachmentModel[37].setRotationPoint(-16F, -8.5F, -1.5F);

		attachmentModel[38].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		attachmentModel[38].setRotationPoint(-43F, -14.5F, -1.5F);

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		attachmentModel[39].setRotationPoint(-43F, -11.5F, -4.5F);

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		attachmentModel[40].setRotationPoint(-43F, -11.5F, 3.5F);

		attachmentModel[41].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		attachmentModel[41].setRotationPoint(-43F, -6.5F, -1.5F);

		attachmentModel[42].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		attachmentModel[42].setRotationPoint(-43F, -14.5F, -4.5F);

		attachmentModel[43].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 66
		attachmentModel[43].setRotationPoint(-25F, -13.5F, -1.5F);

		attachmentModel[44].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 69
		attachmentModel[44].setRotationPoint(-25F, -11.5F, -2.5F);

		attachmentModel[45].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		attachmentModel[45].setRotationPoint(1F, -16F, -2F);

		attachmentModel[46].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 87
		attachmentModel[46].setRotationPoint(2F, -16F, -3F);

		attachmentModel[47].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		attachmentModel[47].setRotationPoint(2F, -16F, 2F);

		attachmentModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		attachmentModel[48].setRotationPoint(4F, -19F, -3F);

		attachmentModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 90
		attachmentModel[49].setRotationPoint(2F, -19F, -2F);

		attachmentModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 92
		attachmentModel[50].setRotationPoint(14F, -16F, -1F);

		attachmentModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		attachmentModel[51].setRotationPoint(12F, -16F, -2F);

		attachmentModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 94
		attachmentModel[52].setRotationPoint(11F, -15F, 2F);

		attachmentModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 95
		attachmentModel[53].setRotationPoint(11F, -13F, 3F);

		attachmentModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		attachmentModel[54].setRotationPoint(10F, -14F, 2F);

		attachmentModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		attachmentModel[55].setRotationPoint(11F, -14F, 6F);

		attachmentModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 98
		attachmentModel[56].setRotationPoint(11F, -16F, -1F);

		attachmentModel[57].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		attachmentModel[57].setRotationPoint(1F, -12F, -6F);

		attachmentModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 100
		attachmentModel[58].setRotationPoint(2F, -13F, -6F);

		attachmentModel[59].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		attachmentModel[59].setRotationPoint(2F, -8F, -6F);

		attachmentModel[60].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		attachmentModel[60].setRotationPoint(4F, -13F, -9F);

		attachmentModel[61].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 103
		attachmentModel[61].setRotationPoint(2F, -12F, -9F);

		attachmentModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 105
		attachmentModel[62].setRotationPoint(40F, -13.5F, -1.5F);

		attachmentModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		attachmentModel[63].setRotationPoint(40F, -8.5F, -1.5F);

		attachmentModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		attachmentModel[64].setRotationPoint(40F, -11.5F, -3.5F);

		attachmentModel[65].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		attachmentModel[65].setRotationPoint(-43F, -14.5F, 3.5F);

		attachmentModel[66].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 109
		attachmentModel[66].setRotationPoint(-43F, -8.5F, 3.5F);

		attachmentModel[67].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 110
		attachmentModel[67].setRotationPoint(-43F, -8.5F, -4.5F);

		attachmentModel[68].addShapeBox(0F, 0F, 0F, 32, 3, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		attachmentModel[68].setRotationPoint(10F, -14.5F, 3.5F);

		attachmentModel[69].addShapeBox(0F, 0F, 0F, 32, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 118
		attachmentModel[69].setRotationPoint(10F, -8.5F, 3.5F);

		attachmentModel[70].addShapeBox(0F, 0F, 0F, 32, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 119
		attachmentModel[70].setRotationPoint(10F, -8.5F, -4.5F);

		attachmentModel[71].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 108
		attachmentModel[71].setRotationPoint(-25F, -8.5F, -1.5F);

		attachmentModel[72].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 109
		attachmentModel[72].setRotationPoint(6F, -12F, -9F);

		attachmentModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 110
		attachmentModel[73].setRotationPoint(6F, -19F, -2F);

		attachmentModel[74].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 111
		attachmentModel[74].setRotationPoint(-12.99F, -5F, 4F);

		attachmentModel[75].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		attachmentModel[75].setRotationPoint(-6F, -6F, 2F);

		attachmentModel[76].addShapeBox(0F, 0F, 0F, 18, 3, 6, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		attachmentModel[76].setRotationPoint(-8F, -8F, -3F);

		attachmentModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		attachmentModel[77].setRotationPoint(10F, -15F, -2F);

		pupilRefCenter.set(-42F / 16F, 10F / 16F, 0F);
		scopeGlassModelScale.set(1F, 0.02F, 0.02F);
		scopeObjectiveLensCenter.set(42F / 160F, 10F / 160F, 0F);
		scopeMaskScale = 0.25F / 1600F;
		minPupilDistance = 0.01024F;
		reticleAt[0].set(4096F, 10F / 160F, 0F);
		reticleScale = 2.5F / 160F;

		reticleBorder = new Vector3f[6];
		reticleBorder[0] = new Vector3f(46F / 160F, 11.5F / 160F, -4.5F / 160F);
		reticleBorder[1] = new Vector3f(46F / 160F, 14.5F / 160F, -1.5F / 160F);
		reticleBorder[2] = new Vector3f(46F / 160F, 14.5F / 160F, 1.5F / 160F);
		reticleBorder[3] = new Vector3f(46F / 160F, 11.5F / 160F, 4.5F / 160F);
		reticleBorder[4] = new Vector3f(46F / 160F, 5.5F / 160F, 4.5F / 160F);
		reticleBorder[5] = new Vector3f(46F / 160F, 5.5F / 160F, -4.5F / 160F);

		flipAll();
	}
}