//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BerettaM9Frame
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBerettaM9A1Frame extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBerettaM9A1Frame() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[159];
		gunModel[0] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 32
		gunModel[1] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 38
		gunModel[2] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 39
		gunModel[3] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 40
		gunModel[4] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 41
		gunModel[5] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 42
		gunModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 43
		gunModel[7] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 44
		gunModel[8] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 45
		gunModel[9] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 47
		gunModel[10] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 49
		gunModel[11] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 50
		gunModel[12] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 51
		gunModel[13] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 52
		gunModel[14] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 53
		gunModel[15] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 55
		gunModel[16] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 57
		gunModel[17] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 58
		gunModel[18] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 59
		gunModel[19] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 61
		gunModel[20] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 62
		gunModel[21] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 63
		gunModel[22] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 64
		gunModel[23] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 67
		gunModel[24] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 68
		gunModel[25] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 69
		gunModel[26] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 70
		gunModel[27] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 81
		gunModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 89
		gunModel[29] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 90
		gunModel[30] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 111
		gunModel[31] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 124
		gunModel[32] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 144
		gunModel[33] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 146
		gunModel[34] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 147
		gunModel[35] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 148
		gunModel[36] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 149
		gunModel[37] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 167
		gunModel[38] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 168
		gunModel[39] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 170
		gunModel[40] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 171
		gunModel[41] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 173
		gunModel[42] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 184
		gunModel[43] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 185
		gunModel[44] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 186
		gunModel[45] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 187
		gunModel[46] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 188
		gunModel[47] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 189
		gunModel[48] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 204
		gunModel[49] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 205
		gunModel[50] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 206
		gunModel[51] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 218
		gunModel[52] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 219
		gunModel[53] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 235
		gunModel[54] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 239
		gunModel[55] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 250
		gunModel[56] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 251
		gunModel[57] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 227
		gunModel[58] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 228
		gunModel[59] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 229
		gunModel[60] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 238
		gunModel[61] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 239
		gunModel[62] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 240
		gunModel[63] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 241
		gunModel[64] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 243
		gunModel[65] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 244
		gunModel[66] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 245
		gunModel[67] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 246
		gunModel[68] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 248
		gunModel[69] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 258
		gunModel[70] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 259
		gunModel[71] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 260
		gunModel[72] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 261
		gunModel[73] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 262
		gunModel[74] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 263
		gunModel[75] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 264
		gunModel[76] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 265
		gunModel[77] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 266
		gunModel[78] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 267
		gunModel[79] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 268
		gunModel[80] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 269
		gunModel[81] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 273
		gunModel[82] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 274
		gunModel[83] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 275
		gunModel[84] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 276
		gunModel[85] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 277
		gunModel[86] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 278
		gunModel[87] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 279
		gunModel[88] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 280
		gunModel[89] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 281
		gunModel[90] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 282
		gunModel[91] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 283
		gunModel[92] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 284
		gunModel[93] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 238
		gunModel[94] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 241
		gunModel[95] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 242
		gunModel[96] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 243
		gunModel[97] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 244
		gunModel[98] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 245
		gunModel[99] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 246
		gunModel[100] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 247
		gunModel[101] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 248
		gunModel[102] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 249
		gunModel[103] = new ModelRendererTurbo(this, 250, 106, textureX, textureY); // Box 252
		gunModel[104] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 253
		gunModel[105] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 254
		gunModel[106] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 255
		gunModel[107] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 256
		gunModel[108] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 257
		gunModel[109] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 258
		gunModel[110] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 259
		gunModel[111] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 260
		gunModel[112] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 261
		gunModel[113] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 262
		gunModel[114] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 263
		gunModel[115] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 264
		gunModel[116] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 265
		gunModel[117] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 266
		gunModel[118] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 268
		gunModel[119] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 269
		gunModel[120] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 270
		gunModel[121] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 271
		gunModel[122] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 272
		gunModel[123] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 273
		gunModel[124] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 287
		gunModel[125] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 288
		gunModel[126] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 289
		gunModel[127] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 290
		gunModel[128] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 291
		gunModel[129] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 292
		gunModel[130] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 293
		gunModel[131] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 294
		gunModel[132] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 295
		gunModel[133] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 296
		gunModel[134] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 311
		gunModel[135] = new ModelRendererTurbo(this, 35, 144, textureX, textureY); // Box 326
		gunModel[136] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 327
		gunModel[137] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 328
		gunModel[138] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 329
		gunModel[139] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 330
		gunModel[140] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 331
		gunModel[141] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 333
		gunModel[142] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 334
		gunModel[143] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 335
		gunModel[144] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 336
		gunModel[145] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 337
		gunModel[146] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 338
		gunModel[147] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 350
		gunModel[148] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 351
		gunModel[149] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 352
		gunModel[150] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 354
		gunModel[151] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 355
		gunModel[152] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 356
		gunModel[153] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 357
		gunModel[154] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 358
		gunModel[155] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 284
		gunModel[156] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 292
		gunModel[157] = new ModelRendererTurbo(this, 244, 106, textureX, textureY); // Box 360
		gunModel[158] = new ModelRendererTurbo(this, 40, 144, textureX, textureY); // Box 361

		gunModel[0].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[0].setRotationPoint(-14.75F, -54F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		gunModel[1].setRotationPoint(-12F, -54.5F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		gunModel[2].setRotationPoint(-12F, -54.5F, 2F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[3].setRotationPoint(-12F, -52.5F, 2F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F); // Box 41
		gunModel[4].setRotationPoint(-12F, -52.5F, -3F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[5].setRotationPoint(-12F, -50.5F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[6].setRotationPoint(-6F, -50.5F, -3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[7].setRotationPoint(-2F, -50.5F, -3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[8].setRotationPoint(2F, -50.5F, -3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 12, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[9].setRotationPoint(-24F, -54.5F, -3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[10].setRotationPoint(-24F, -50F, -2F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 50
		gunModel[11].setRotationPoint(-19F, -48.5F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F); // Box 51
		gunModel[12].setRotationPoint(-17F, -45.5F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[13].setRotationPoint(-27F, -39.5F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[14].setRotationPoint(-23F, -39.5F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[15].setRotationPoint(-31F, -40.5F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 1F); // Box 57
		gunModel[16].setRotationPoint(-25F, -54.5F, -3F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0.5F, 0.5F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 58
		gunModel[17].setRotationPoint(-25F, -50F, -2F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0.5F, -1F, 1F, 0.5F, -1F, 1F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 59
		gunModel[18].setRotationPoint(-30F, -50.5F, -2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
		gunModel[19].setRotationPoint(-21.5F, -54.5F, 3F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 62
		gunModel[20].setRotationPoint(-21.5F, -51.5F, 3F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 63
		gunModel[21].setRotationPoint(-21.5F, -53.5F, 3F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[22].setRotationPoint(-18.5F, -51F, 3F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 67
		gunModel[23].setRotationPoint(-35F, -45.5F, -2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -1F, 0F, 2F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1.5F, 0.5F, 2F, 1F, -0.5F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 2F); // Box 68
		gunModel[24].setRotationPoint(-33F, -49.5F, -2F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -1F, 0.5F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F); // Box 69
		gunModel[25].setRotationPoint(-35F, -47.5F, -2F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, -0.5F, 2F); // Box 70
		gunModel[26].setRotationPoint(-35F, -43.5F, -2F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 81
		gunModel[27].setRotationPoint(-52F, -50.5F, -1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F); // Box 89
		gunModel[28].setRotationPoint(-31F, -54.5F, 3F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F, 0.2353F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7647F, 0F, 0F, 2.9412F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.9412F, 0.5F, 0F); // Box 90
		gunModel[29].setRotationPoint(-43F, -54.5F, 3F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[30].setRotationPoint(-34F, -42.5F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 124
		gunModel[31].setRotationPoint(-55F, -51F, -2F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 144
		gunModel[32].setRotationPoint(-30F, -54.5F, 3F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 146
		gunModel[33].setRotationPoint(-28F, -48.5F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 147
		gunModel[34].setRotationPoint(-27F, -47.5F, -1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 148
		gunModel[35].setRotationPoint(-27F, -45.5F, -1F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 149
		gunModel[36].setRotationPoint(-26F, -43F, -1F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, 0F, 0F); // Box 167
		gunModel[37].setRotationPoint(-47.5F, -62F, -1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		gunModel[38].setRotationPoint(-50F, -54.5F, -1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		gunModel[39].setRotationPoint(-51.5F, -61.25F, -1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		gunModel[40].setRotationPoint(-49.5F, -61.25F, -1F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 173
		gunModel[41].setRotationPoint(-50.5F, -60F, -1F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 184
		gunModel[42].setRotationPoint(-29F, -54F, -3.8F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 185
		gunModel[43].setRotationPoint(-24F, -54F, -3.8F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		gunModel[44].setRotationPoint(-30F, -53.5F, -3.8F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 187
		gunModel[45].setRotationPoint(-35F, -52F, -3.8F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		gunModel[46].setRotationPoint(-20.5F, -53.5F, -4F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		gunModel[47].setRotationPoint(-18.25F, -50.75F, -3.25F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		gunModel[48].setRotationPoint(-54.5F, -21.5F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		gunModel[49].setRotationPoint(-51.5F, -21.5F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 206
		gunModel[50].setRotationPoint(-54.5F, -20F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 218
		gunModel[51].setRotationPoint(-50.5F, -62.25F, -1F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 219
		gunModel[52].setRotationPoint(-54.5F, -20.5F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, -1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 235
		gunModel[53].setRotationPoint(-19F, -41.5F, -1.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 239
		gunModel[54].setRotationPoint(-51.5F, -20.5F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		gunModel[55].setRotationPoint(-35F, -54.5F, -4F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Box 251
		gunModel[56].setRotationPoint(-32F, -54.5F, -3F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		gunModel[57].setRotationPoint(-35F, -51.5F, -3.8F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 228
		gunModel[58].setRotationPoint(-19.5F, -54.5F, -4F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 229
		gunModel[59].setRotationPoint(-19.5F, -52.5F, -4F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		gunModel[60].setRotationPoint(-39F, -26.5F, -1.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, -0.5F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 239
		gunModel[61].setRotationPoint(-40F, -26.5F, 2.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 11, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 240
		gunModel[62].setRotationPoint(-36F, -37.5F, -1.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 241
		gunModel[63].setRotationPoint(-35F, -39.5F, -1.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 1F, -1F, 2F, -0.5F, -1F, 1F, 0F, 0F, 2F, 0.5F, -0.5F, 2F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 243
		gunModel[64].setRotationPoint(-31F, -50.5F, -2F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 244
		gunModel[65].setRotationPoint(-18.75F, -50.75F, -3.25F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 245
		gunModel[66].setRotationPoint(-16.75F, -50.75F, -3.25F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 246
		gunModel[67].setRotationPoint(-32F, -41.5F, -1.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 248
		gunModel[68].setRotationPoint(-28.5F, -50F, -1F);

		gunModel[69].addShapeBox(-1F, -1F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		gunModel[69].setRotationPoint(-37F, -41.25F, 3F);
		gunModel[69].rotateAngleZ = -1.04719755F;

		gunModel[70].addShapeBox(0.5F, -1.75F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 259
		gunModel[70].setRotationPoint(-37F, -41.25F, -3.5F);
		gunModel[70].rotateAngleZ = -0.26179939F;

		gunModel[71].addShapeBox(1.75F, -1.75F, 0F, 1, 3, 5, 0F, 0F, 0F, 0.75F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 1F); // Box 260
		gunModel[71].setRotationPoint(-37F, -41.25F, -2F);
		gunModel[71].rotateAngleZ = -0.26179939F;

		gunModel[72].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 261
		gunModel[72].setRotationPoint(-37F, -41.25F, -4F);
		gunModel[72].rotateAngleZ = -0.26179939F;

		gunModel[73].addShapeBox(0.5F, -1.75F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 262
		gunModel[73].setRotationPoint(-37F, -41.25F, 3F);
		gunModel[73].rotateAngleZ = -0.26179939F;

		gunModel[74].addShapeBox(0.5F, -1.75F, 0F, 1, 3, 1, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 263
		gunModel[74].setRotationPoint(-37F, -41.25F, -3.5F);
		gunModel[74].rotateAngleZ = -0.26179939F;

		gunModel[75].addShapeBox(-3F, -2F, 0F, 2, 4, 1, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		gunModel[75].setRotationPoint(-37F, -41.25F, 3F);
		gunModel[75].rotateAngleZ = -1.04719755F;

		gunModel[76].addShapeBox(-2F, 1F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F); // Box 265
		gunModel[76].setRotationPoint(-37F, -41.25F, 3F);
		gunModel[76].rotateAngleZ = -1.04719755F;

		gunModel[77].addShapeBox(-0.5F, -2.75F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, 0F, -0.025F, -0.525F, 0F, -0.025F, -0.525F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 266
		gunModel[77].setRotationPoint(-37F, -41.25F, 3F);
		gunModel[77].rotateAngleZ = -0.26179939F;

		gunModel[78].addShapeBox(-0.5F, 1.75F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0F, 0.5F, 0F); // Box 267
		gunModel[78].setRotationPoint(-37F, -41.25F, 3F);
		gunModel[78].rotateAngleZ = -0.26179939F;

		gunModel[79].addShapeBox(-2F, -1F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		gunModel[79].setRotationPoint(-37F, -41.25F, -4F);
		gunModel[79].rotateAngleZ = -0.26179939F;

		gunModel[80].addShapeBox(-2F, -2F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 269
		gunModel[80].setRotationPoint(-37F, -41.25F, -4F);
		gunModel[80].rotateAngleZ = -0.26179939F;

		gunModel[81].addShapeBox(1.5F, -2.75F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, -0.25F, 0F, 0F); // Box 273
		gunModel[81].setRotationPoint(-37F, -41.25F, -2F);
		gunModel[81].rotateAngleZ = -0.26179939F;

		gunModel[82].addShapeBox(2.5F, -1.75F, 0F, 1, 3, 4, 0F, -0.25F, 1F, 0F, 0.125F, 0.2F, 0F, 0.125F, 0.2F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, -0.25F, 1F, 0F); // Box 274
		gunModel[82].setRotationPoint(-37F, -41.25F, -2F);
		gunModel[82].rotateAngleZ = -0.26179939F;

		gunModel[83].addShapeBox(1.5F, 1.75F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 275
		gunModel[83].setRotationPoint(-37F, -41.25F, -2F);
		gunModel[83].rotateAngleZ = -0.26179939F;

		gunModel[84].addShapeBox(-2F, 1F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 276
		gunModel[84].setRotationPoint(-37F, -41.25F, -4F);
		gunModel[84].rotateAngleZ = -0.26179939F;

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 277
		gunModel[85].setRotationPoint(-34F, -41.5F, -1.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1.5F, 0F); // Box 278
		gunModel[86].setRotationPoint(-33.5F, -54.5F, 3F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F); // Box 279
		gunModel[87].setRotationPoint(-35F, -54.5F, 3F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F, 1.2353F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.2353F, 0F, 0F, 3.8235F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.8235F, 0F, 0F); // Box 280
		gunModel[88].setRotationPoint(-46F, -37.5F, 3F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F, 0F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0.5F, 3F, 0F, -1F, -4F, 0F, 1F, -3F, 0F, -2F, 3F, 0F, 0.5F); // Box 281
		gunModel[89].setRotationPoint(-37F, -37.5F, 2.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, -1F, 0.5F, 1F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0.5F, 2F, 0F, 0F); // Box 282
		gunModel[90].setRotationPoint(-35F, -39.5F, 1.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1.2353F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2353F, 0F, 0F); // Box 283
		gunModel[91].setRotationPoint(-46F, -38.5F, 3F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0.9412F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.0588F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 284
		gunModel[92].setRotationPoint(-45F, -43F, 3F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 1.8235F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8235F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 238
		gunModel[93].setRotationPoint(-48F, -26.5F, 3F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, -0.5F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F); // Box 241
		gunModel[94].setRotationPoint(-49F, -47.5F, -1F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -2F, 1F, 2F, -2F, 1F, 2F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, -1F, -0.5F, 0F); // Box 242
		gunModel[95].setRotationPoint(-50F, -48.5F, -1F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 2F, -2F, 0.5F, 2F, 1F, 0F, 0F); // Box 243
		gunModel[96].setRotationPoint(-49F, -43.5F, -1F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F, 0F, 0F, 0F, -1F, -0.5F, 2F, -1F, -0.5F, 2F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, 0.5F, 2F, -6F, 0.5F, 2F, 5F, 0F, 0F); // Box 244
		gunModel[97].setRotationPoint(-50F, -41.5F, -1F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, -0.5F, 2F, -1F, -0.5F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 0.5F, 0F, 0F); // Box 245
		gunModel[98].setRotationPoint(-55F, -28.5F, -1F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.5F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 0.5F, 0F, 0F); // Box 246
		gunModel[99].setRotationPoint(-55F, -26.5F, -1F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.5F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F); // Box 247
		gunModel[100].setRotationPoint(-55F, -23.5F, -1F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 248
		gunModel[101].setRotationPoint(-55F, -51F, -1F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 249
		gunModel[102].setRotationPoint(-55F, -52F, -1F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		gunModel[103].setRotationPoint(-52F, -55F, 1F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F); // Box 253
		gunModel[104].setRotationPoint(-54F, -52F, 1F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 1F, 1F); // Box 254
		gunModel[105].setRotationPoint(-53F, -53F, 1F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0F); // Box 255
		gunModel[106].setRotationPoint(-56F, -51F, -1.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.75F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F); // Box 256
		gunModel[107].setRotationPoint(-56F, -52F, 0.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, -0.5F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 257
		gunModel[108].setRotationPoint(-56F, -52F, -1.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.5F, -0.5F); // Box 258
		gunModel[109].setRotationPoint(-56F, -50.5F, -0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.75F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.75F, 0F); // Box 259
		gunModel[110].setRotationPoint(-56F, -50.5F, -1.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 260
		gunModel[111].setRotationPoint(-53F, -51F, -1F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, 0F, 0F, 0.5294F, 0F, 0F, 0.5294F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 261
		gunModel[112].setRotationPoint(-54F, -28F, -3F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F, 0F, 0F, 0F, 0.5882F, 0F, 0F, 0.5882F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2.4706F, 0F, 0F, -2.4706F, 0F, 0F, 5F, 0F, 0F); // Box 262
		gunModel[113].setRotationPoint(-49F, -41F, -3F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 0F, -0.5F, 0F, 0.1765F, -0.5F, 0F, 0.1765F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, -0.4118F, 0F, 0F, -0.4118F, 0F, 0F, 1F, 0F, 0F); // Box 263
		gunModel[114].setRotationPoint(-48F, -44F, -3F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F, 0F, 0F, 0F, 1.1176F, 0F, 0F, 1.1176F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1765F, 0F, 0F, 0.1765F, 0F, 0F, 0F, 0F, 0F); // Box 264
		gunModel[115].setRotationPoint(-48F, -47.5F, -3F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 1F, 0F, 0F, 0.5882F, 0F, 0F, 0.5882F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.1176F, 0F, 0F, 0.1176F, 0F, 0F, -1F, 0F, 0F); // Box 265
		gunModel[116].setRotationPoint(-49F, -49.5F, -3F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 1F, 0F, 0F, 0.8235F, 0F, 0F, 0.8235F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5882F, 0F, 0F, 0.5882F, 0F, 0F, -1F, 0F, 0F); // Box 266
		gunModel[117].setRotationPoint(-51F, -50.5F, -3F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, 0.4118F, 0F, 0F, 0.4118F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.0588F, 0F, 0F, -0.0588F, 0F, 0F, 1F, 0F, 0F); // Box 268
		gunModel[118].setRotationPoint(-52F, -53F, 1F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, -0.5F, 0F, 0.7647F, -0.5F, 0F, 0.7647F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.4118F, 0F, 0F, 0.4118F, 0F, 0F, 0F, 0F, 0F); // Box 269
		gunModel[119].setRotationPoint(-51F, -55F, 1F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 270
		gunModel[120].setRotationPoint(-35F, -50.5F, -4F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 1F, -1F, 0F, -2F, -1F, 0.5F, 1F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -3F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 271
		gunModel[121].setRotationPoint(-35F, -39.5F, -3.5F);

		gunModel[122].addShapeBox(-0.5F, -2.75F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, 0F, -0.025F, -0.525F, 0F, -0.025F, -0.525F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 272
		gunModel[122].setRotationPoint(-37F, -41.25F, -4F);
		gunModel[122].rotateAngleZ = -0.26179939F;

		gunModel[123].addShapeBox(-0.5F, 1.75F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0F, 0.5F, 0F); // Box 273
		gunModel[123].setRotationPoint(-37F, -41.25F, -4F);
		gunModel[123].rotateAngleZ = -0.26179939F;

		gunModel[124].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F, -0.7647F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2353F, 0F, 0F, 1.9412F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2.9412F, 0.5F, 0F); // Box 287
		gunModel[124].setRotationPoint(-43F, -54.5F, -4F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, -0.0588F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9412F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F); // Box 288
		gunModel[125].setRotationPoint(-45F, -43F, -4F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.2353F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2353F, 0F, 0F); // Box 289
		gunModel[126].setRotationPoint(-46F, -38.5F, -4F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F, 0.2353F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.2353F, 0F, 0F, 2.8235F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3.8235F, 0F, 0F); // Box 290
		gunModel[127].setRotationPoint(-46F, -37.5F, -4F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 0.8235F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8235F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 291
		gunModel[128].setRotationPoint(-48F, -26.5F, -4F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, -1F, 3F, 0F, 0.5F, -3F, 0F, -2F, -4F, 0F, 1F, 3F, 0F, -1F); // Box 292
		gunModel[129].setRotationPoint(-37F, -37.5F, -3.5F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, -0.5F); // Box 293
		gunModel[130].setRotationPoint(-40F, -26.5F, -3.5F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		gunModel[131].setRotationPoint(-35F, -53F, -3.8F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F); // Box 295
		gunModel[132].setRotationPoint(-35F, -49.5F, -4F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F); // Box 296
		gunModel[133].setRotationPoint(-35F, -49.5F, -4F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 311
		gunModel[134].setRotationPoint(-24.5F, -54.5F, 3F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 326
		gunModel[135].setRotationPoint(-52F, -55F, 2F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, -1F, 1F, 0.5F, -1F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 327
		gunModel[136].setRotationPoint(-53F, -52F, -2F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		gunModel[137].setRotationPoint(-54F, -52F, -2F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, 0.4118F, 0F, 0F, 0.4118F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.0588F, 0F, 0F, -0.0588F, 0F, 0F, 1F, 0F, 0F); // Box 329
		gunModel[138].setRotationPoint(-52F, -53F, -3F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, -0.5F, 0F, 0.7647F, -0.5F, 0F, 0.7647F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.4118F, 0F, 0F, 0.4118F, 0F, 0F, 0F, 0F, 0F); // Box 330
		gunModel[139].setRotationPoint(-51F, -55F, -3F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F, 0F, 0F, 0F, 0.9412F, 0F, 0F, 0.9412F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8235F, -0.5F, 0F, 0.8235F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 331
		gunModel[140].setRotationPoint(-53F, -51F, -3F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0.5F, -0.3333F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 333
		gunModel[141].setRotationPoint(-51F, -55.5F, 1F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, -0.6667F, 0F, 0F, 0.6667F, 0F, 0F, 0.6667F, 0F, 0F, -0.6667F, 0F, 0F, -0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, -0.3333F, 0F, 0F); // Box 334
		gunModel[142].setRotationPoint(-51F, -56.5F, 1F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3333F, 0F, 0F, -0.3333F, 0F, 0F, -0.3333F, 0F, -0.5F, 0.3333F, 0F, -0.5F); // Box 335
		gunModel[143].setRotationPoint(-50F, -57.5F, 1F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, 0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.625F, 0F, -0.5F); // Box 336
		gunModel[144].setRotationPoint(-49F, -59F, 1F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, -0.6667F, 0F, 0F, 0.6667F, 0F, 0F, 0.6667F, 0F, 0F, -0.6667F, 0F, 0F, -0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, -0.3333F, 0F, 0F); // Box 337
		gunModel[145].setRotationPoint(-51F, -56.5F, -3F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -0.3333F, 0F, 0.5F, 0.3333F, 0F, 0.5F, 0.3333F, 0F, 0F, -0.3333F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		gunModel[146].setRotationPoint(-51F, -55.5F, -2F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 350
		gunModel[147].setRotationPoint(-31F, -56.5F, 2F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 351
		gunModel[148].setRotationPoint(-32F, -55.5F, 2F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		gunModel[149].setRotationPoint(-21F, -56.5F, 2F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		gunModel[150].setRotationPoint(-21F, -56.5F, -3F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		gunModel[151].setRotationPoint(-32F, -55.5F, -3F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 356
		gunModel[152].setRotationPoint(-31F, -56.5F, -3F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		gunModel[153].setRotationPoint(-48F, -56.5F, -1F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		gunModel[154].setRotationPoint(-54F, -51.5F, -1.5F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 284
		gunModel[155].setRotationPoint(-31F, -56.5F, -2F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -0.375F, 0F, 0F, 0.1667F, 0F, 0F, 0.1667F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 292
		gunModel[156].setRotationPoint(-50F, -58F, 1F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		gunModel[157].setRotationPoint(-52F, -55F, -3F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		gunModel[158].setRotationPoint(-52F, -55F, -2F);


		boltCatchButtonModel = new ModelRendererTurbo[16];
		boltCatchButtonModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 176
		boltCatchButtonModel[1] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 177
		boltCatchButtonModel[2] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 178
		boltCatchButtonModel[3] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 179
		boltCatchButtonModel[4] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 180
		boltCatchButtonModel[5] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 182
		boltCatchButtonModel[6] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 183
		boltCatchButtonModel[7] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 310
		boltCatchButtonModel[8] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 368
		boltCatchButtonModel[9] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 369
		boltCatchButtonModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 370
		boltCatchButtonModel[11] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 371
		boltCatchButtonModel[12] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 372
		boltCatchButtonModel[13] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 373
		boltCatchButtonModel[14] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 374
		boltCatchButtonModel[15] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 375

		boltCatchButtonModel[0].addShapeBox(-6F, -2.5F, 0F, 10, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		boltCatchButtonModel[0].setRotationPoint(-31F, -51.5F, 3.5F);

		boltCatchButtonModel[1].addShapeBox(4F, -1.5F, 0F, 1, 2, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 177
		boltCatchButtonModel[1].setRotationPoint(-31F, -51.5F, 3.5F);

		boltCatchButtonModel[2].addShapeBox(-7F, -2.5F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 178
		boltCatchButtonModel[2].setRotationPoint(-31F, -51.5F, 3.5F);

		boltCatchButtonModel[3].addShapeBox(-2F, -2.5F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		boltCatchButtonModel[3].setRotationPoint(-31F, -51.5F, 4.5F);

		boltCatchButtonModel[4].addShapeBox(-3F, -2.5F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 180
		boltCatchButtonModel[4].setRotationPoint(-31F, -51.5F, 4.5F);

		boltCatchButtonModel[5].addShapeBox(-7F, -3.5F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 182
		boltCatchButtonModel[5].setRotationPoint(-31F, -51.5F, 4.5F);

		boltCatchButtonModel[6].addShapeBox(-7F, -2.5F, 0F, 3, 1, 1, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		boltCatchButtonModel[6].setRotationPoint(-31F, -51.5F, 5.5F);

		boltCatchButtonModel[7].addShapeBox(-7F, -2.5F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		boltCatchButtonModel[7].setRotationPoint(-31F, -51.5F, 4.5F);

		boltCatchButtonModel[8].addShapeBox(-2F, -2.5F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		boltCatchButtonModel[8].setRotationPoint(-31F, -51.5F, 4.5F);
		boltCatchButtonModel[8].rotateAngleZ = -0.06981317F;

		boltCatchButtonModel[9].addShapeBox(4F, -1.5F, 0F, 1, 2, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 369
		boltCatchButtonModel[9].setRotationPoint(-31F, -51.5F, 3.5F);
		boltCatchButtonModel[9].rotateAngleZ = -0.06981317F;

		boltCatchButtonModel[10].addShapeBox(-6F, -2.5F, 0F, 10, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		boltCatchButtonModel[10].setRotationPoint(-31F, -51.5F, 3.5F);
		boltCatchButtonModel[10].rotateAngleZ = -0.06981317F;

		boltCatchButtonModel[11].addShapeBox(-3F, -2.5F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 371
		boltCatchButtonModel[11].setRotationPoint(-31F, -51.5F, 4.5F);
		boltCatchButtonModel[11].rotateAngleZ = -0.06981317F;

		boltCatchButtonModel[12].addShapeBox(-7F, -2.5F, 0F, 3, 1, 1, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		boltCatchButtonModel[12].setRotationPoint(-31F, -51.5F, 5.5F);
		boltCatchButtonModel[12].rotateAngleZ = -0.06981317F;

		boltCatchButtonModel[13].addShapeBox(-7F, -3.5F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 373
		boltCatchButtonModel[13].setRotationPoint(-31F, -51.5F, 4.5F);
		boltCatchButtonModel[13].rotateAngleZ = -0.06981317F;

		boltCatchButtonModel[14].addShapeBox(-7F, -2.5F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		boltCatchButtonModel[14].setRotationPoint(-31F, -51.5F, 4.5F);
		boltCatchButtonModel[14].rotateAngleZ = -0.06981317F;

		boltCatchButtonModel[15].addShapeBox(-7F, -2.5F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 375
		boltCatchButtonModel[15].setRotationPoint(-31F, -51.5F, 3.5F);
		boltCatchButtonModel[15].rotateAngleZ = -0.06981317F;

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
		checkChamberChargeRatio = 0.4F;

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
		bulletAttachPoint1[0] = new Vector3f(-27F / 160F, 59.5F / 160F, 0F);

		recoilShakeRotX = 6F;

		flipAll();
	}
}