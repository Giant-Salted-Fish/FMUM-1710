//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Beretta M9 Lower Receiver
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBerettaM9LowerReceiver extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBerettaM9LowerReceiver() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[129];
		gunModel[0] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 32
		gunModel[1] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 38
		gunModel[2] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 39
		gunModel[3] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 40
		gunModel[4] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 41
		gunModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 42
		gunModel[6] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 43
		gunModel[7] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 44
		gunModel[8] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 45
		gunModel[9] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 47
		gunModel[10] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 48
		gunModel[11] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 49
		gunModel[12] = new ModelRendererTurbo(this, 23, 40, textureX, textureY); // Box 50
		gunModel[13] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 51
		gunModel[14] = new ModelRendererTurbo(this, 47, 40, textureX, textureY); // Box 52
		gunModel[15] = new ModelRendererTurbo(this, 71, 40, textureX, textureY); // Box 53
		gunModel[16] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 55
		gunModel[17] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 57
		gunModel[18] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 58
		gunModel[19] = new ModelRendererTurbo(this, 195, 41, textureX, textureY); // Box 59
		gunModel[20] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 61
		gunModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 62
		gunModel[22] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 63
		gunModel[23] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 64
		gunModel[24] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 66
		gunModel[25] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 67
		gunModel[26] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 68
		gunModel[27] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 69
		gunModel[28] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 70
		gunModel[29] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 71
		gunModel[30] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 72
		gunModel[31] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 73
		gunModel[32] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 74
		gunModel[33] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 75
		gunModel[34] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 76
		gunModel[35] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 77
		gunModel[36] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 81
		gunModel[37] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 82
		gunModel[38] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 84
		gunModel[39] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 85
		gunModel[40] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 86
		gunModel[41] = new ModelRendererTurbo(this, 121, 56, textureX, textureY); // Box 87
		gunModel[42] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 88
		gunModel[43] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 89
		gunModel[44] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 90
		gunModel[45] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 91
		gunModel[46] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 92
		gunModel[47] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 94
		gunModel[48] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 95
		gunModel[49] = new ModelRendererTurbo(this, 88, 8, textureX, textureY); // Box 97
		gunModel[50] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 98
		gunModel[51] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 99
		gunModel[52] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 100
		gunModel[53] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 101
		gunModel[54] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 102
		gunModel[55] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 103
		gunModel[56] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 104
		gunModel[57] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 105
		gunModel[58] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 106
		gunModel[59] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 107
		gunModel[60] = new ModelRendererTurbo(this, 135, 57, textureX, textureY); // Box 109
		gunModel[61] = new ModelRendererTurbo(this, 231, 65, textureX, textureY); // Box 110
		gunModel[62] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 111
		gunModel[63] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 112
		gunModel[64] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 113
		gunModel[65] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 114
		gunModel[66] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 115
		gunModel[67] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 117
		gunModel[68] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 120
		gunModel[69] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 121
		gunModel[70] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 122
		gunModel[71] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 124
		gunModel[72] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 126
		gunModel[73] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 141
		gunModel[74] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 142
		gunModel[75] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 144
		gunModel[76] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 145
		gunModel[77] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 146
		gunModel[78] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 147
		gunModel[79] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 148
		gunModel[80] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 149
		gunModel[81] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 167
		gunModel[82] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 168
		gunModel[83] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 170
		gunModel[84] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 171
		gunModel[85] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 173
		gunModel[86] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 174
		gunModel[87] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 175
		gunModel[88] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 176
		gunModel[89] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 177
		gunModel[90] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 178
		gunModel[91] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 179
		gunModel[92] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 180
		gunModel[93] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 182
		gunModel[94] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 183
		gunModel[95] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 184
		gunModel[96] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 185
		gunModel[97] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 186
		gunModel[98] = new ModelRendererTurbo(this, 127, 98, textureX, textureY); // Box 187
		gunModel[99] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 188
		gunModel[100] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 189
		gunModel[101] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 204
		gunModel[102] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 205
		gunModel[103] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 206
		gunModel[104] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 218
		gunModel[105] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 215
		gunModel[106] = new ModelRendererTurbo(this, 224, 113, textureX, textureY); // Box 241
		gunModel[107] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 242
		gunModel[108] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 213
		gunModel[109] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 219
		gunModel[110] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 222
		gunModel[111] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 235
		gunModel[112] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 236
		gunModel[113] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 237
		gunModel[114] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 238
		gunModel[115] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 239
		gunModel[116] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 246
		gunModel[117] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 248
		gunModel[118] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 249
		gunModel[119] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 250
		gunModel[120] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 251
		gunModel[121] = new ModelRendererTurbo(this, 232, 81, textureX, textureY); // Box 252
		gunModel[122] = new ModelRendererTurbo(this, 121, 92, textureX, textureY); // Box 226
		gunModel[123] = new ModelRendererTurbo(this, 127, 94, textureX, textureY); // Box 227
		gunModel[124] = new ModelRendererTurbo(this, 153, 101, textureX, textureY); // Box 228
		gunModel[125] = new ModelRendererTurbo(this, 145, 101, textureX, textureY); // Box 229
		gunModel[126] = new ModelRendererTurbo(this, 162, 65, textureX, textureY); // Box 230
		gunModel[127] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 231
		gunModel[128] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 232

		gunModel[0].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[0].setRotationPoint(-14.75F, -54F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		gunModel[1].setRotationPoint(-14F, -54.5F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		gunModel[2].setRotationPoint(-14F, -54.5F, 2F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[3].setRotationPoint(-14F, -52.5F, 2F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F); // Box 41
		gunModel[4].setRotationPoint(-14F, -52.5F, -3F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[5].setRotationPoint(-14F, -50.5F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[6].setRotationPoint(-6F, -50.5F, -3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[7].setRotationPoint(-2F, -50.5F, -3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[8].setRotationPoint(2F, -50.5F, -3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[9].setRotationPoint(-24F, -54.5F, -3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 48
		gunModel[10].setRotationPoint(-15F, -54.5F, -3F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 49
		gunModel[11].setRotationPoint(-24F, -49.5F, -2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 50
		gunModel[12].setRotationPoint(-19F, -48.5F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 51
		gunModel[13].setRotationPoint(-17F, -45.5F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[14].setRotationPoint(-27F, -39.5F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[15].setRotationPoint(-23F, -39.5F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[16].setRotationPoint(-32F, -40.5F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F); // Box 57
		gunModel[17].setRotationPoint(-25F, -54.5F, -3F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F); // Box 58
		gunModel[18].setRotationPoint(-25F, -49.5F, -2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[19].setRotationPoint(-30F, -49.5F, -2F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[20].setRotationPoint(-22F, -54.5F, 2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 62
		gunModel[21].setRotationPoint(-21F, -51.5F, 2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[22].setRotationPoint(-21F, -53.5F, 2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[23].setRotationPoint(-18F, -51F, 2.25F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[24].setRotationPoint(-18F, -51.5F, 1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 67
		gunModel[25].setRotationPoint(-35F, -45.5F, -2F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -2F, 0F, 1.5F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 1.5F, 0F, -1F, 1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1.5F); // Box 68
		gunModel[26].setRotationPoint(-33F, -49.5F, -2F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, -2F, 0F, 1.5F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 69
		gunModel[27].setRotationPoint(-35F, -48.5F, -2F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, -1F, 1.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.5F, -1F, 1.5F); // Box 70
		gunModel[28].setRotationPoint(-35F, -43.5F, -2F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, -0.5F, -0.5F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F); // Box 71
		gunModel[29].setRotationPoint(-36F, -39.5F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 12, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 2F); // Box 72
		gunModel[30].setRotationPoint(-36F, -37.5F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F); // Box 73
		gunModel[31].setRotationPoint(-39F, -25.5F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		gunModel[32].setRotationPoint(-49F, -49.5F, -3.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F); // Box 75
		gunModel[33].setRotationPoint(-48F, -48.5F, -3.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 76
		gunModel[34].setRotationPoint(-48F, -47.5F, -3.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 77
		gunModel[35].setRotationPoint(-48F, -42.5F, -3.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -0.5F); // Box 81
		gunModel[36].setRotationPoint(-52F, -50.5F, -2.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[37].setRotationPoint(-50F, -49.5F, -3.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F); // Box 84
		gunModel[38].setRotationPoint(-50F, -42.5F, -1.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 4F, -1F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, 4F, -1F, 0F); // Box 85
		gunModel[39].setRotationPoint(-51F, -38.5F, -1.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 86
		gunModel[40].setRotationPoint(-55F, -27.5F, -1.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[41].setRotationPoint(-53F, -23.5F, -3F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 1F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		gunModel[42].setRotationPoint(-49F, -49.5F, 2.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, -2F, 0F); // Box 89
		gunModel[43].setRotationPoint(-48F, -48.5F, 2.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 90
		gunModel[44].setRotationPoint(-48F, -47.5F, 2.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 91
		gunModel[45].setRotationPoint(-48F, -42.5F, 2.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 4F, 3F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, 0F, 4F, 3F, 0F); // Box 92
		gunModel[46].setRotationPoint(-49F, -38.5F, 2.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F, 0F, 0F, -0.5F, 4F, 11F, -0.5F, 4F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[47].setRotationPoint(-53F, -26.5F, 2.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[48].setRotationPoint(-37F, -42.5F, -3F);
		gunModel[48].rotateAngleZ = -0.26179939F;

		gunModel[49].addShapeBox(2F, -0.5F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		gunModel[49].setRotationPoint(-37F, -42.5F, -2F);
		gunModel[49].rotateAngleZ = -0.26179939F;

		gunModel[50].addShapeBox(3F, -0.5F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 98
		gunModel[50].setRotationPoint(-37F, -42.5F, -2F);
		gunModel[50].rotateAngleZ = -0.26179939F;

		gunModel[51].addShapeBox(1F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[51].setRotationPoint(-37F, -42.5F, 2F);
		gunModel[51].rotateAngleZ = -0.26179939F;

		gunModel[52].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[52].setRotationPoint(-37F, -42.5F, -3.5F);
		gunModel[52].rotateAngleZ = -0.26179939F;

		gunModel[53].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -10F, 0F, 0F); // Box 101
		gunModel[53].setRotationPoint(-48F, -43.5F, 2.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -10F, 0F, 0F); // Box 102
		gunModel[54].setRotationPoint(-48F, -43.5F, -3.5F);

		gunModel[55].addShapeBox(-1F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[55].setRotationPoint(-37F, -42.5F, -3.5F);
		gunModel[55].rotateAngleZ = -0.26179939F;

		gunModel[56].addShapeBox(-1F, 2F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[56].setRotationPoint(-37F, -42.5F, -3.5F);
		gunModel[56].rotateAngleZ = -0.26179939F;

		gunModel[57].addShapeBox(-1F, 3F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[57].setRotationPoint(-37F, -42.5F, -3.5F);
		gunModel[57].rotateAngleZ = -0.26179939F;

		gunModel[58].addShapeBox(2F, -1.5F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[58].setRotationPoint(-37F, -42.5F, -2.5F);
		gunModel[58].rotateAngleZ = -0.26179939F;

		gunModel[59].addShapeBox(2F, 2.5F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[59].setRotationPoint(-37F, -42.5F, -2.5F);
		gunModel[59].rotateAngleZ = -0.26179939F;

		gunModel[60].addShapeBox(3F, -1.5F, 0F, 1, 1, 3, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F); // Box 109
		gunModel[60].setRotationPoint(-37F, -42.5F, -1.5F);
		gunModel[60].rotateAngleZ = -0.26179939F;

		gunModel[61].addShapeBox(4F, 0.5F, 0F, 1, 2, 3, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 110
		gunModel[61].setRotationPoint(-37F, -42.5F, -1.5F);
		gunModel[61].rotateAngleZ = -0.26179939F;

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 111
		gunModel[62].setRotationPoint(-33F, -41.5F, -1.5F);

		gunModel[63].addShapeBox(0F, -1F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[63].setRotationPoint(-37F, -42.5F, -3.5F);
		gunModel[63].rotateAngleZ = -0.26179939F;

		gunModel[64].addShapeBox(0F, 2F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[64].setRotationPoint(-37F, -42.5F, -3.5F);
		gunModel[64].rotateAngleZ = -0.26179939F;

		gunModel[65].addShapeBox(-1F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[65].setRotationPoint(-37F, -42.5F, 2.5F);
		gunModel[65].rotateAngleZ = -0.26179939F;

		gunModel[66].addShapeBox(0F, -1F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[66].setRotationPoint(-37F, -42.5F, 1.5F);
		gunModel[66].rotateAngleZ = -0.26179939F;

		gunModel[67].addShapeBox(3F, 2.5F, 0F, 1, 1, 3, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Box 117
		gunModel[67].setRotationPoint(-37F, -42.5F, -1.5F);
		gunModel[67].rotateAngleZ = -0.26179939F;

		gunModel[68].addShapeBox(-1F, 2F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[68].setRotationPoint(-37F, -42.5F, 2.5F);
		gunModel[68].rotateAngleZ = -0.26179939F;

		gunModel[69].addShapeBox(-1F, 3F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gunModel[69].setRotationPoint(-37F, -42.5F, 2.5F);
		gunModel[69].rotateAngleZ = -0.26179939F;

		gunModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		gunModel[70].setRotationPoint(-55F, -50.5F, -2F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 124
		gunModel[71].setRotationPoint(-55F, -51.5F, -2F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F); // Box 126
		gunModel[72].setRotationPoint(-52F, -54.5F, 1F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 141
		gunModel[73].setRotationPoint(-56F, -51.5F, 0F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 142
		gunModel[74].setRotationPoint(-56F, -50.5F, -2F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 22, 5, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 144
		gunModel[75].setRotationPoint(-48F, -54.5F, 2.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 145
		gunModel[76].setRotationPoint(-54F, -51.5F, 1F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 146
		gunModel[77].setRotationPoint(-29F, -48.5F, -1F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		gunModel[78].setRotationPoint(-28F, -47.5F, -1F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 148
		gunModel[79].setRotationPoint(-27F, -44.5F, -1F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 149
		gunModel[80].setRotationPoint(-26F, -43F, -1F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -1.5F, 0F); // Box 167
		gunModel[81].setRotationPoint(-48.25F, -61.5F, -1F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		gunModel[82].setRotationPoint(-52F, -54.5F, -1F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		gunModel[83].setRotationPoint(-51F, -61F, -1F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		gunModel[84].setRotationPoint(-49F, -61F, -1F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, -2F, 0.5F, 0F); // Box 173
		gunModel[85].setRotationPoint(-51F, -60F, -1F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 1F, 3.5F, 0F, 1F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		gunModel[86].setRotationPoint(-49F, -55.5F, -1F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		gunModel[87].setRotationPoint(-50F, -54.5F, -1F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		gunModel[88].setRotationPoint(-37F, -53.5F, 3F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 177
		gunModel[89].setRotationPoint(-27F, -52.5F, 3F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 178
		gunModel[90].setRotationPoint(-38F, -53.5F, 3F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gunModel[91].setRotationPoint(-33F, -53.5F, 4F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 180
		gunModel[92].setRotationPoint(-34F, -53.5F, 4F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		gunModel[93].setRotationPoint(-38F, -54.5F, 4F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		gunModel[94].setRotationPoint(-38F, -53.5F, 5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		gunModel[95].setRotationPoint(-29F, -54F, -3.8F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 185
		gunModel[96].setRotationPoint(-24F, -54F, -3.8F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		gunModel[97].setRotationPoint(-30F, -54F, -3.8F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		gunModel[98].setRotationPoint(-35F, -52F, -3.8F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		gunModel[99].setRotationPoint(-19.5F, -53.5F, -3.25F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		gunModel[100].setRotationPoint(-18.5F, -51F, -3.25F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		gunModel[101].setRotationPoint(-54F, -21F, -1F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		gunModel[102].setRotationPoint(-51F, -21F, -1F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 206
		gunModel[103].setRotationPoint(-54F, -19.5F, -1F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 218
		gunModel[104].setRotationPoint(-50F, -62F, -1F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F); // Box 215
		gunModel[105].setRotationPoint(-50F, -47.5F, -1.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 241
		gunModel[106].setRotationPoint(-56F, -51.5F, -2F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F); // Box 242
		gunModel[107].setRotationPoint(-56F, -50.5F, 0F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, -2F, -2F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F); // Box 213
		gunModel[108].setRotationPoint(-50F, -49.5F, 0.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 219
		gunModel[109].setRotationPoint(-54F, -20F, -1F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		gunModel[110].setRotationPoint(-54F, -22F, -1F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, -1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 235
		gunModel[111].setRotationPoint(-19F, -41.5F, -1.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F, 0F, 0F, 0F, 4F, 11F, 0F, 4F, 11F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 236
		gunModel[112].setRotationPoint(-53F, -26.5F, -3.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 4F, 3F, 0F, 0F, -8F, 0F, 0F, -8F, -0.5F, 4F, 3F, -0.5F); // Box 237
		gunModel[113].setRotationPoint(-49F, -38.5F, -3.5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		gunModel[114].setRotationPoint(-51F, -22F, -1F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 239
		gunModel[115].setRotationPoint(-51F, -20F, -1F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 246
		gunModel[116].setRotationPoint(-24F, -54.5F, 3F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		gunModel[117].setRotationPoint(-50F, -54.5F, 1.5F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		gunModel[118].setRotationPoint(-50F, -54.5F, -3.5F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 250
		gunModel[119].setRotationPoint(-48F, -54.5F, -3.5F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 8, 5, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 251
		gunModel[120].setRotationPoint(-34F, -54.5F, -3F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		gunModel[121].setRotationPoint(-54F, -22.5F, -2.5F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 226
		gunModel[122].setRotationPoint(-36F, -52F, -3.8F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		gunModel[123].setRotationPoint(-35F, -51F, -3.8F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		gunModel[124].setRotationPoint(-19.5F, -54F, -3.25F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 229
		gunModel[125].setRotationPoint(-19.5F, -53F, -3.25F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		gunModel[126].setRotationPoint(-31F, -49.5F, -2F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 231
		gunModel[127].setRotationPoint(-52F, -54.5F, -3F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -1F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		gunModel[128].setRotationPoint(-54F, -51.5F, -3F);

		barrelOrigin.set(-87F / 160F, 59.5F / 160F, 0F);
		caseOrigin.set(-41F / 160F, 59.5F / 160F, 0F);
		caseEjectVelocity.set(-4F / 160F, 20F / 160F, 20F / 160F);
		caseEjectRandV .set(12F / 160F, 10F / 160F, 10F / 160F);
		caseEjectAngularV.set(-0.3F, -0.4F, 0.4F);
		caseEjectRandAV.set(0.6F, -0.5F, 0.5F);
		caseEjectVelocityWC.set(-3F / 160F, 15F / 160F, 15F / 160F);
		caseEjectRandVWC.set(6F / 160F, 3F / 160F, 3F / 160F);
		caseEjectAngularVWC = caseEjectAngularV;
		caseEjectRandAVWC = caseEjectRandAV;

		magAttachPoint.set(-44F / 160F, 54.5F / 160F, 0F);

		aimingTranslate.set(45F / 160F, 0F, 0F);
		holdingTranslate.set(30F / 160F, -10F / 160F, 10F / 160F);
		holdingRotate.set(-5F, 0F, 0F);
		thirdPersonOffset.set(44F / 160F, -27F / 160F, 0F);

		takeOutTranslate.set(-220F / 160F, -180F / 160F, 40F / 160F);
		takeOutRotate.set(0F, 0F, -160F);
		sprintTranslate.set(-10F / 160F, -40F / 160F, -15F / 160F);
		sprintRotate.set(0F, 10F, -10F);
		restTranslate.set(10F / 160F, 70F / 160F, 60F / 160F);
		restRotate.set(5F, -15F, 80F);

		reloadTranslate.set(20F / 160F, 0F, 0F);
		reloadRotate.set(15F, 0F, 0F);
		magTranslate.set(-23.81F / 160F, -100F / 160F, 0F);

		checkAmmoTranslate = reloadTranslate;
		checkAmmoRotate.set(15F, 0F, 0F);
		checkAmmoMagTranslate.set(-7.619F / 160F, -32F / 160F, 0F);
		checkAmmoMagTranslate2.set(10F / 160F, 15F / 160F, -60F / 160F);
		checkAmmoMagRotate2.set(-30F, 0F, 0F);
		checkChamberTranslate.set(30F / 160F, 65F / 160F, -15F / 160F);
		checkChamberRotate.set(0F, 5F, 65F);
		checkChamberTiltTimeRatio = 0.4F;
		checkChamberChargeTimeRatio = 0.67F;
		checkChamberTiltBCTimeRatio = 0.57F;

		gunSlideDistance = 17F / 16F;
		slideLockDistance = 13F / 16F;
		chargeHandleDistance =  17F / 16F;

		leftHandAmmo = true;
		leftHandCheckChamber = true;
		leftHandCharge = true;
		rightHandRelease = true;
		rightHandReloadingRelease = true;
		leftArmPos.set(-44F / 160F, 25F / 160F, -5F / 160F);
		leftArmRot.set(0F, -20F, 15F);
		rightArmPos.set(-40F / 160F, 29F / 160F, 1F / 160F);
		rightArmRot.set(0F, 16F, 7F);
		leftArmAmmoPos.set(-42F / 160F, 6F / 160F, 7F / 160F);
		leftArmAmmoRot.set(-8F, -58F, 18F);
		leftHandCheckChamberPos.set(-49F / 160F, 50F / 160F, 10F / 160F);
		leftHandCheckChamberRot.set(-5F, -70F, 10F);
		leftArmChargePos.set(-20F / 160F, 67F / 160F, -16F / 160F);
		leftArmChargeRot.set(-18F, -62F, 17F);
		rightArmReleasePos.set(-40F / 160F, 29F / 160F, 1F / 160F);
		rightArmReleaseRot.set(7F, 16F, 7F);
		rightArmReloadingReleasePos = rightArmReleasePos;
		rightArmReloadingReleaseRot = rightArmReleaseRot;

		bulletAttachPoint1 = new Vector3f[1];
		bulletAttachPoint1[0] = new Vector3f(-30F / 160F, 59.5F / 160F, 0F);

		recoilShakeRotX = 6F;

		flipAll();
	}
}