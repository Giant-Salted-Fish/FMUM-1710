//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Rectangle Muzzle Brake Mod 0
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelRectangleMuzzleBrakeMod0 extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelRectangleMuzzleBrakeMod0() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[31];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 211
		attachmentModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 212
		attachmentModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 213
		attachmentModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 214
		attachmentModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 215
		attachmentModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 216
		attachmentModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 217
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 218
		attachmentModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 219
		attachmentModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 220
		attachmentModel[10] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 222
		attachmentModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 223
		attachmentModel[12] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 224
		attachmentModel[13] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 225
		attachmentModel[14] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 226
		attachmentModel[15] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 227
		attachmentModel[16] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 228
		attachmentModel[17] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 229
		attachmentModel[18] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 230
		attachmentModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 231
		attachmentModel[20] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 232
		attachmentModel[21] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 233
		attachmentModel[22] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 234
		attachmentModel[23] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 235
		attachmentModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 236
		attachmentModel[25] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 237
		attachmentModel[26] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 238
		attachmentModel[27] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 239
		attachmentModel[28] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 242
		attachmentModel[29] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 243
		attachmentModel[30] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 244

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		attachmentModel[0].setRotationPoint(0F, -1F, 2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		attachmentModel[1].setRotationPoint(0F, 2F, -3F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		attachmentModel[2].setRotationPoint(0F, -1F, -3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 214
		attachmentModel[3].setRotationPoint(0F, -3F, -3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 215
		attachmentModel[4].setRotationPoint(0F, -3F, 1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		attachmentModel[5].setRotationPoint(0F, -3F, -1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		attachmentModel[6].setRotationPoint(0F, 3F, -2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 218
		attachmentModel[7].setRotationPoint(0F, 1F, 1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		attachmentModel[8].setRotationPoint(0F, 1F, -3F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 220
		attachmentModel[9].setRotationPoint(3F, -3F, -1F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		attachmentModel[10].setRotationPoint(3F, -1F, 1F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		attachmentModel[11].setRotationPoint(3F, -1F, -3F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		attachmentModel[12].setRotationPoint(3F, 1F, -3F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 225
		attachmentModel[13].setRotationPoint(4F, 1F, -2F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		attachmentModel[14].setRotationPoint(5F, 1F, -3F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		attachmentModel[15].setRotationPoint(5F, -1F, -3F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 228
		attachmentModel[16].setRotationPoint(5F, -3F, -1F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		attachmentModel[17].setRotationPoint(5F, -1F, 1F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		attachmentModel[18].setRotationPoint(7F, 1F, -3F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		attachmentModel[19].setRotationPoint(7F, -1F, -3F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 232
		attachmentModel[20].setRotationPoint(7F, -3F, -1F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		attachmentModel[21].setRotationPoint(7F, -1F, 1F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		attachmentModel[22].setRotationPoint(9F, 1F, -3F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		attachmentModel[23].setRotationPoint(9F, -1F, -3F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 236
		attachmentModel[24].setRotationPoint(9F, -3F, -1F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		attachmentModel[25].setRotationPoint(9F, -1F, 1F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 238
		attachmentModel[26].setRotationPoint(6F, 1F, -2F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 239
		attachmentModel[27].setRotationPoint(8F, 1F, -2F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		attachmentModel[28].setRotationPoint(4F, 2F, -3F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		attachmentModel[29].setRotationPoint(6F, 2F, -3F);

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		attachmentModel[30].setRotationPoint(8F, 2F, -3F);

		muzzleFlashPoint = new Vector3f(4F / 16F, 0, 0);

		flipAll();
	}
}