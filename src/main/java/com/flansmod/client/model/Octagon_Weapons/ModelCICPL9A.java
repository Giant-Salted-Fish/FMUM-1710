//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC PL-9A
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelCICPL9A extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCICPL9A() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[55];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 213
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 214
		attachmentModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 215
		attachmentModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 216
		attachmentModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 217
		attachmentModel[5] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 218
		attachmentModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 219
		attachmentModel[7] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 220
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 221
		attachmentModel[9] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 222
		attachmentModel[10] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 223
		attachmentModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 225
		attachmentModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 226
		attachmentModel[13] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 227
		attachmentModel[14] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 228
		attachmentModel[15] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 229
		attachmentModel[16] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 230
		attachmentModel[17] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 232
		attachmentModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 233
		attachmentModel[19] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 234
		attachmentModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 235
		attachmentModel[21] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 236
		attachmentModel[22] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 237
		attachmentModel[23] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 238
		attachmentModel[24] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 239
		attachmentModel[25] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 240
		attachmentModel[26] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 241
		attachmentModel[27] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 242
		attachmentModel[28] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 243
		attachmentModel[29] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 244
		attachmentModel[30] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 245
		attachmentModel[31] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 246
		attachmentModel[32] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 248
		attachmentModel[33] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 249
		attachmentModel[34] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 252
		attachmentModel[35] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 253
		attachmentModel[36] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 265
		attachmentModel[37] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 51
		attachmentModel[38] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 52
		attachmentModel[39] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 53
		attachmentModel[40] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 54
		attachmentModel[41] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 55
		attachmentModel[42] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 56
		attachmentModel[43] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 57
		attachmentModel[44] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 58
		attachmentModel[45] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 59
		attachmentModel[46] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 60
		attachmentModel[47] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 61
		attachmentModel[48] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 62
		attachmentModel[49] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 63
		attachmentModel[50] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 64
		attachmentModel[51] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 55
		attachmentModel[52] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 56
		attachmentModel[53] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 57
		attachmentModel[54] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 58

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 19, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 213
		attachmentModel[0].setRotationPoint(-3.5F, 0.5F, -3.5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 214
		attachmentModel[1].setRotationPoint(10.5F, 6.5F, -4.2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F); // Box 215
		attachmentModel[2].setRotationPoint(15.5F, 2F, -2F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		attachmentModel[3].setRotationPoint(16.5F, 12.5F, -1.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 1F, 0F, 0F, 1F); // Box 217
		attachmentModel[4].setRotationPoint(15.5F, 1F, -1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F); // Box 218
		attachmentModel[5].setRotationPoint(15.5F, 4F, -1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		attachmentModel[6].setRotationPoint(16.5F, 6.5F, -1.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		attachmentModel[7].setRotationPoint(16.5F, 8.5F, -3.5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 221
		attachmentModel[8].setRotationPoint(-1.5F, 13F, -3F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F, 1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		attachmentModel[9].setRotationPoint(-2.5F, 4F, -4F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F); // Box 223
		attachmentModel[10].setRotationPoint(15.5F, 2F, 1F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		attachmentModel[11].setRotationPoint(-3.5F, -2F, 3F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		attachmentModel[12].setRotationPoint(-1.5F, 6F, 3F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		attachmentModel[13].setRotationPoint(-1.5F, 12F, 3F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		attachmentModel[14].setRotationPoint(-1.5F, 8F, 3F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		attachmentModel[15].setRotationPoint(4.5F, 8F, 3F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 230
		attachmentModel[16].setRotationPoint(0.5F, 8F, 3F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		attachmentModel[17].setRotationPoint(0.5F, 9F, 3F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 233
		attachmentModel[18].setRotationPoint(1.5F, 7.2F, 3F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 234
		attachmentModel[19].setRotationPoint(3.5F, 7F, 3F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		attachmentModel[20].setRotationPoint(3.5F, 11F, 3F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		attachmentModel[21].setRotationPoint(-1.5F, 11F, 3F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 237
		attachmentModel[22].setRotationPoint(-1.5F, 7F, 3F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 18, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		attachmentModel[23].setRotationPoint(-1.5F, 6F, -4F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 239
		attachmentModel[24].setRotationPoint(8.5F, 10.5F, -4.2F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		attachmentModel[25].setRotationPoint(-1.5F, 5F, -4F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 241
		attachmentModel[26].setRotationPoint(16.5F, 6.5F, -3.5F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 242
		attachmentModel[27].setRotationPoint(16.5F, 6.5F, 1.5F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 243
		attachmentModel[28].setRotationPoint(16.5F, 11.5F, 1.5F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		attachmentModel[29].setRotationPoint(16.5F, 11.5F, -3.5F);

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		attachmentModel[30].setRotationPoint(16.5F, 8.5F, 2.5F);

		attachmentModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 246
		attachmentModel[31].setRotationPoint(0.5F, -2F, -7F);

		attachmentModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		attachmentModel[32].setRotationPoint(-0.5F, -1F, -6.5F);

		attachmentModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		attachmentModel[33].setRotationPoint(9.5F, -1F, -6.5F);

		attachmentModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 252
		attachmentModel[34].setRotationPoint(8.5F, 13.3F, -1F);

		attachmentModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 253
		attachmentModel[35].setRotationPoint(10.5F, 1.5F, 2.7F);

		attachmentModel[36].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		attachmentModel[36].setRotationPoint(-3.5F, -2F, -4F);

		attachmentModel[37].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 51
		attachmentModel[37].setRotationPoint(-3.5F, 0F, -3.5F);

		attachmentModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 52
		attachmentModel[38].setRotationPoint(-3.5F, 8F, -4F);

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 53
		attachmentModel[39].setRotationPoint(-3.5F, 6F, -3F);

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 54
		attachmentModel[40].setRotationPoint(-3.5F, 12F, -3F);

		attachmentModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 55
		attachmentModel[41].setRotationPoint(-3.5F, 10.5F, -4F);

		attachmentModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		attachmentModel[42].setRotationPoint(-3.5F, 9.5F, -4F);

		attachmentModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		attachmentModel[43].setRotationPoint(-3.5F, 9.5F, 2F);

		attachmentModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		attachmentModel[44].setRotationPoint(-2.5F, 8.5F, -3.5F);

		attachmentModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 59
		attachmentModel[45].setRotationPoint(-2.5F, 6.5F, -1.5F);

		attachmentModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		attachmentModel[46].setRotationPoint(-2.5F, 11.5F, -1.5F);

		attachmentModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 61
		attachmentModel[47].setRotationPoint(-0.5F, 9F, 3F);

		attachmentModel[48].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		attachmentModel[48].setRotationPoint(18F, 7.5F, -2.5F);

		attachmentModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 63
		attachmentModel[49].setRotationPoint(16.5F, 2.5F, -3F);

		attachmentModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 64
		attachmentModel[50].setRotationPoint(16.5F, 2.5F, 2F);

		attachmentModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 55
		attachmentModel[51].setRotationPoint(0.5F, 0F, -7F);

		attachmentModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 56
		attachmentModel[52].setRotationPoint(10.5F, 0F, -7F);

		attachmentModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 57
		attachmentModel[53].setRotationPoint(10.5F, -2F, -7F);

		attachmentModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 58
		attachmentModel[54].setRotationPoint(0.5F, 10F, 3F);

		laserFrom = new Vector3f(15.5F / 16F, 3F / 16F, 0F);
	}
}