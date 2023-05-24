//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BerettaM9Slide
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBerettaM9Slide extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	private ModelRendererTurbo[] fireModeModel, lightModel;

	public ModelBerettaM9Slide() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[72];
		attachmentModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
		attachmentModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
		attachmentModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 7
		attachmentModel[3] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 8
		attachmentModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 9
		attachmentModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 10
		attachmentModel[6] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 11
		attachmentModel[7] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 12
		attachmentModel[8] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 13
		attachmentModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		attachmentModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 18
		attachmentModel[11] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 19
		attachmentModel[12] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 21
		attachmentModel[13] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 23
		attachmentModel[14] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 24
		attachmentModel[15] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 25
		attachmentModel[16] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 26
		attachmentModel[17] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 33
		attachmentModel[18] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 35
		attachmentModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 36
		attachmentModel[20] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 37
		attachmentModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 132
		attachmentModel[22] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 134
		attachmentModel[23] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 135
		attachmentModel[24] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 138
		attachmentModel[25] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 152
		attachmentModel[26] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 154
		attachmentModel[27] = new ModelRendererTurbo(this, 36, 14, textureX, textureY); // Box 155
		attachmentModel[28] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 216
		attachmentModel[29] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 223
		attachmentModel[30] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 230
		attachmentModel[31] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 233
		attachmentModel[32] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 234
		attachmentModel[33] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 236
		attachmentModel[34] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 237
		attachmentModel[35] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 238
		attachmentModel[36] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 243
		attachmentModel[37] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 225
		attachmentModel[38] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 239
		attachmentModel[39] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 250
		attachmentModel[40] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 251
		attachmentModel[41] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 312
		attachmentModel[42] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 316
		attachmentModel[43] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 317
		attachmentModel[44] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 318
		attachmentModel[45] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 319
		attachmentModel[46] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 320
		attachmentModel[47] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 323
		attachmentModel[48] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 324
		attachmentModel[49] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 325
		attachmentModel[50] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 342
		attachmentModel[51] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 343
		attachmentModel[52] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 344
		attachmentModel[53] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 345
		attachmentModel[54] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 346
		attachmentModel[55] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 348
		attachmentModel[56] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 349
		attachmentModel[57] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 291
		attachmentModel[58] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 319
		attachmentModel[59] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 324
		attachmentModel[60] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 325
		attachmentModel[61] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 327
		attachmentModel[62] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 328
		attachmentModel[63] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 329
		attachmentModel[64] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 330
		attachmentModel[65] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 331
		attachmentModel[66] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 332
		attachmentModel[67] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 358
		attachmentModel[68] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 359
		attachmentModel[69] = new ModelRendererTurbo(this, 16, 147, textureX, textureY); // Box 360
		attachmentModel[70] = new ModelRendererTurbo(this, 169, 125, textureX, textureY); // Box 361
		attachmentModel[71] = new ModelRendererTurbo(this, 1, 156, textureX, textureY); // Box 363

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 4
		attachmentModel[0].setRotationPoint(42F, -8.5F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.4F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 6
		attachmentModel[1].setRotationPoint(42F, -8.5F, 2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		attachmentModel[2].setRotationPoint(39F, -4.5F, -3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		attachmentModel[3].setRotationPoint(18F, -5F, 3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 9
		attachmentModel[4].setRotationPoint(40F, -4F, 3F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		attachmentModel[5].setRotationPoint(39F, -5F, 3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		attachmentModel[6].setRotationPoint(17F, -5F, 3F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		attachmentModel[7].setRotationPoint(11F, -4F, 3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		attachmentModel[8].setRotationPoint(10F, -5F, 3F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 14
		attachmentModel[9].setRotationPoint(-4F, -4F, 3F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F); // Box 18
		attachmentModel[10].setRotationPoint(41F, -6F, -3F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 2F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 19
		attachmentModel[11].setRotationPoint(40F, -4F, -4F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		attachmentModel[12].setRotationPoint(39F, -5F, -4F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		attachmentModel[13].setRotationPoint(18F, -5F, -4F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		attachmentModel[14].setRotationPoint(17F, -5F, -4F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		attachmentModel[15].setRotationPoint(11F, -4F, -4F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		attachmentModel[16].setRotationPoint(10F, -5F, -4F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 33
		attachmentModel[17].setRotationPoint(39F, -2.5F, -3F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 35
		attachmentModel[18].setRotationPoint(39F, 2.5F, -1F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		attachmentModel[19].setRotationPoint(39F, 0.5F, -2F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 37
		attachmentModel[20].setRotationPoint(39F, 0.5F, 1F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F); // Box 132
		attachmentModel[21].setRotationPoint(-5.5F, -3F, 3F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 134
		attachmentModel[22].setRotationPoint(-11F, -3F, 3F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		attachmentModel[23].setRotationPoint(-11.5F, -4.5F, 3F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F, 0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 138
		attachmentModel[24].setRotationPoint(-6F, -8F, -1F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0.3333F, -0.5F, 0F, 0.3333F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		attachmentModel[25].setRotationPoint(-8.5F, -1F, 3F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 1.5F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 1.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 2.5F, 0F, -0.5F); // Box 154
		attachmentModel[26].setRotationPoint(-11F, -6F, 1F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 155
		attachmentModel[27].setRotationPoint(-12F, -6F, 2F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F); // Box 216
		attachmentModel[28].setRotationPoint(43F, -9.5F, -0.5F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 223
		attachmentModel[29].setRotationPoint(-12F, -3F, 3F);

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
		attachmentModel[30].setRotationPoint(41F, -6.5F, 2F);

		attachmentModel[31].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0.4F, -1F, 1F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 233
		attachmentModel[31].setRotationPoint(42F, -8.5F, -3F);

		attachmentModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 234
		attachmentModel[32].setRotationPoint(41F, -6.5F, -3F);

		attachmentModel[33].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		attachmentModel[33].setRotationPoint(39F, -0.5F, -2.5F);

		attachmentModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0.25F, -1F, -1F, -0.5F, 0F, 0F, 0F); // Box 237
		attachmentModel[34].setRotationPoint(40F, -6F, 3F);

		attachmentModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 1F, -2F, -1F, 1F, -2F, 0.5F, 0F, 0F, 0F); // Box 238
		attachmentModel[35].setRotationPoint(40F, -6F, -4F);

		attachmentModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243
		attachmentModel[36].setRotationPoint(8F, -5F, -3F);

		attachmentModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Box 225
		attachmentModel[37].setRotationPoint(-11F, -8F, -1F);

		attachmentModel[38].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Box 239
		attachmentModel[38].setRotationPoint(-14F, -5.5F, 1F);

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 250
		attachmentModel[39].setRotationPoint(-14.5F, -4F, 3F);

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 251
		attachmentModel[40].setRotationPoint(-15F, -3F, 3F);

		attachmentModel[41].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F); // Box 312
		attachmentModel[41].setRotationPoint(-12F, -6F, -3F);

		attachmentModel[42].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 316
		attachmentModel[42].setRotationPoint(18F, -5F, -3F);

		attachmentModel[43].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 317
		attachmentModel[43].setRotationPoint(8F, -4F, -3F);

		attachmentModel[44].addShapeBox(0F, 0F, 0F, 23, 2, 2, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		attachmentModel[44].setRotationPoint(-15F, -5F, -3F);

		attachmentModel[45].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 319
		attachmentModel[45].setRotationPoint(-14F, -4F, -4F);

		attachmentModel[46].addShapeBox(0F, 0F, 0F, 25, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 320
		attachmentModel[46].setRotationPoint(-15F, -3F, -4F);

		attachmentModel[47].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 323
		attachmentModel[47].setRotationPoint(18F, -5F, 2F);

		attachmentModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 324
		attachmentModel[48].setRotationPoint(41F, -6F, 2F);

		attachmentModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 325
		attachmentModel[49].setRotationPoint(8F, -5F, 2F);

		attachmentModel[50].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3333F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.3333F, 0F, 0F); // Box 342
		attachmentModel[50].setRotationPoint(-15F, -3F, 1F);

		attachmentModel[51].addShapeBox(0F, 0F, 0F, 55, 1, 1, 0F, -0.3333F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3333F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		attachmentModel[51].setRotationPoint(-16F, -1F, 2F);

		attachmentModel[52].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		attachmentModel[52].setRotationPoint(-15F, -4F, 1F);

		attachmentModel[53].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3333F, 0F, 0F); // Box 345
		attachmentModel[53].setRotationPoint(-15F, -3F, -3F);

		attachmentModel[54].addShapeBox(0F, 0F, 0F, 55, 1, 1, 0F, -0.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3333F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 346
		attachmentModel[54].setRotationPoint(-16F, -1F, -3F);

		attachmentModel[55].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		attachmentModel[55].setRotationPoint(39F, -4.5F, 1F);

		attachmentModel[56].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		attachmentModel[56].setRotationPoint(8F, -4F, 2F);

		attachmentModel[57].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.125F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 291
		attachmentModel[57].setRotationPoint(-14F, -4.5F, 1F);

		attachmentModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.5F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 1F, -0.5F, 0.5F); // Box 319
		attachmentModel[58].setRotationPoint(-10F, -8F, -1F);

		attachmentModel[59].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.125F, 0F, -0.5F); // Box 324
		attachmentModel[59].setRotationPoint(-6F, -8F, -3F);

		attachmentModel[60].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F); // Box 325
		attachmentModel[60].setRotationPoint(-6F, -8F, -1F);

		attachmentModel[61].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.5F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Box 327
		attachmentModel[61].setRotationPoint(-6F, -8F, 2F);

		attachmentModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.125F, 0F, 0F, 0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 1F, 0.375F, 0F, 1F); // Box 328
		attachmentModel[62].setRotationPoint(-9F, -7F, 1F);

		attachmentModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 1.5F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 1.5F, 0F, 0F); // Box 329
		attachmentModel[63].setRotationPoint(-11F, -8F, 1F);

		attachmentModel[64].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		attachmentModel[64].setRotationPoint(-11F, -7F, -1F);

		attachmentModel[65].addShapeBox(0F, -0.5F, -0.5F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		attachmentModel[65].setRotationPoint(-11.5F, -5F, 0F);

		attachmentModel[66].addShapeBox(0F, -0.5F, -3.25F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		attachmentModel[66].setRotationPoint(-2.99F, -5F, 0F);
		attachmentModel[66].rotateAngleX = -0.34906585F;

		attachmentModel[67].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0.125F, -1F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 358
		attachmentModel[67].setRotationPoint(-6F, -7F, 1F);

		attachmentModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 1.5F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 2.5F, 0F, 0F); // Box 359
		attachmentModel[68].setRotationPoint(-11F, -6F, -3F);

		attachmentModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 1.5F, 0F, 0F); // Box 360
		attachmentModel[69].setRotationPoint(-11F, -8F, -3F);

		attachmentModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.125F, 0F, 0F, 0.375F, 0F, 1F, -0.125F, 0F, 1F, -0.125F, 0F, 0F, 0.375F, 0F, 0F); // Box 361
		attachmentModel[70].setRotationPoint(-9F, -7F, -2F);

		attachmentModel[71].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0.125F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Box 363
		attachmentModel[71].setRotationPoint(-6F, -7F, -3F);
		
		fireModeModel = new ModelRendererTurbo[24];
		fireModeModel[0] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 220
		fireModeModel[1] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 221
		fireModeModel[2] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 222
		fireModeModel[3] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 223
		fireModeModel[4] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 224
		fireModeModel[5] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 225
		fireModeModel[6] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 226
		fireModeModel[7] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 227
		fireModeModel[8] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 228
		fireModeModel[9] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 229
		fireModeModel[10] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 230
		fireModeModel[11] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 231
		fireModeModel[12] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 372
		fireModeModel[13] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 373
		fireModeModel[14] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 374
		fireModeModel[15] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 375
		fireModeModel[16] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 376
		fireModeModel[17] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 377
		fireModeModel[18] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 378
		fireModeModel[19] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 379
		fireModeModel[20] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 380
		fireModeModel[21] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 381
		fireModeModel[22] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 382
		fireModeModel[23] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 383

		fireModeModel[0].addShapeBox(-1.5F, 0.5F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 220
		fireModeModel[0].setRotationPoint(-9F, -5F, -4.25F);
		fireModeModel[0].rotateAngleZ = -0.78539816F;

		fireModeModel[1].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		fireModeModel[1].setRotationPoint(-9F, -5F, -4.25F);
		fireModeModel[1].rotateAngleZ = -0.78539816F;

		fireModeModel[2].addShapeBox(-1.5F, -1.5F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 222
		fireModeModel[2].setRotationPoint(-9F, -5F, -4.25F);
		fireModeModel[2].rotateAngleZ = -0.78539816F;

		fireModeModel[3].addShapeBox(0F, -1F, 0F, 2, 3, 1, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0.5F, -0.5F, 0F); // Box 223
		fireModeModel[3].setRotationPoint(-9F, -5F, -5.25F);
		fireModeModel[3].rotateAngleZ = -0.78539816F;

		fireModeModel[4].addShapeBox(2F, 1F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F); // Box 224
		fireModeModel[4].setRotationPoint(-9F, -5F, -5.25F);
		fireModeModel[4].rotateAngleZ = -0.78539816F;

		fireModeModel[5].addShapeBox(4F, 1F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 225
		fireModeModel[5].setRotationPoint(-9F, -5F, -5.25F);
		fireModeModel[5].rotateAngleZ = -0.78539816F;

		fireModeModel[6].addShapeBox(-2F, -2F, 0F, 3, 1, 1, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 226
		fireModeModel[6].setRotationPoint(-9F, -5F, 3F);
		fireModeModel[6].rotateAngleZ = -0.78539816F;

		fireModeModel[7].addShapeBox(-2F, -1F, 0F, 4, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		fireModeModel[7].setRotationPoint(-9F, -5F, 3F);
		fireModeModel[7].rotateAngleZ = -0.78539816F;

		fireModeModel[8].addShapeBox(-2F, 1F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 228
		fireModeModel[8].setRotationPoint(-9F, -5F, 3F);
		fireModeModel[8].rotateAngleZ = -0.78539816F;

		fireModeModel[9].addShapeBox(1F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		fireModeModel[9].setRotationPoint(-9F, -5F, 3F);
		fireModeModel[9].rotateAngleZ = -0.78539816F;

		fireModeModel[10].addShapeBox(3F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 230
		fireModeModel[10].setRotationPoint(-9F, -5F, 4F);
		fireModeModel[10].rotateAngleZ = -0.78539816F;

		fireModeModel[11].addShapeBox(1F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 231
		fireModeModel[11].setRotationPoint(-9F, -5F, 4F);
		fireModeModel[11].rotateAngleZ = -0.78539816F;

		fireModeModel[12].addShapeBox(2F, 1F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F); // Box 372
		fireModeModel[12].setRotationPoint(-9F, -5F, -5.25F);

		fireModeModel[13].addShapeBox(4F, 1F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 373
		fireModeModel[13].setRotationPoint(-9F, -5F, -5.25F);

		fireModeModel[14].addShapeBox(0F, -1F, 0F, 2, 3, 1, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0.5F, -0.5F, 0F); // Box 374
		fireModeModel[14].setRotationPoint(-9F, -5F, -5.25F);

		fireModeModel[15].addShapeBox(-1.5F, 0.5F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 375
		fireModeModel[15].setRotationPoint(-9F, -5F, -4.25F);

		fireModeModel[16].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		fireModeModel[16].setRotationPoint(-9F, -5F, -4.25F);

		fireModeModel[17].addShapeBox(-1.5F, -1.5F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 377
		fireModeModel[17].setRotationPoint(-9F, -5F, -4.25F);

		fireModeModel[18].addShapeBox(-2F, -2F, 0F, 3, 1, 1, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 378
		fireModeModel[18].setRotationPoint(-9F, -5F, 3F);

		fireModeModel[19].addShapeBox(-2F, -1F, 0F, 4, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		fireModeModel[19].setRotationPoint(-9F, -5F, 3F);

		fireModeModel[20].addShapeBox(-2F, 1F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 380
		fireModeModel[20].setRotationPoint(-9F, -5F, 3F);

		fireModeModel[21].addShapeBox(1F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 381
		fireModeModel[21].setRotationPoint(-9F, -5F, 4F);

		fireModeModel[22].addShapeBox(3F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 382
		fireModeModel[22].setRotationPoint(-9F, -5F, 4F);

		fireModeModel[23].addShapeBox(1F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		fireModeModel[23].setRotationPoint(-9F, -5F, 3F);
		
		lightModel = new ModelRendererTurbo[1];
		lightModel[0] = new ModelRendererTurbo(this, 11, 65, textureX, textureY); // Box 217

		lightModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 217
		lightModel[0].setRotationPoint(42.99F, -9.5F, -0.5F);

		flipAll();
		flip(fireModeModel);
		flip(lightModel);
	}
	
	@Override
	public void render(float f)
	{
		render(attachmentModel, f);
		if(getFireModeNum() != 0) partialRender(fireModeModel, 12, 24, f);
		else partialRender(fireModeModel, 0, 12, f);
		glowOn();
		render(lightModel, f);
		glowOff();
	}
	
	@Override
	public void renderWithoutGlow(float f)
	{
		render(attachmentModel, f);
		if(getFireModeNum() != 0) partialRender(fireModeModel, 12, 24, f);
		else partialRender(fireModeModel, 0, 12, f);
		render(lightModel, f);
	}
}