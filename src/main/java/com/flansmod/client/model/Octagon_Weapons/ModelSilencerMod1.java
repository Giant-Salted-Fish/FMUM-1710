//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SilencerMod1
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSilencerMod1 extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelSilencerMod1() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[22];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 213
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 214
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 215
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 216
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 217
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 218
		attachmentModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 219
		attachmentModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 220
		attachmentModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 221
		attachmentModel[9] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 222
		attachmentModel[10] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 10
		attachmentModel[11] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 11
		attachmentModel[12] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 12
		attachmentModel[13] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 13
		attachmentModel[14] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 14
		attachmentModel[15] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 15
		attachmentModel[16] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 16
		attachmentModel[17] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 17
		attachmentModel[18] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 18
		attachmentModel[19] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 19
		attachmentModel[20] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 20
		attachmentModel[21] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 21

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 41, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 213
		attachmentModel[0].setRotationPoint(3F, -4F, -2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 41, 2, 4, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		attachmentModel[1].setRotationPoint(3F, 2F, -2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 41, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		attachmentModel[2].setRotationPoint(3F, -2F, -4F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 41, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		attachmentModel[3].setRotationPoint(3F, -2F, 1F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		attachmentModel[4].setRotationPoint(3F, -2F, -1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		attachmentModel[5].setRotationPoint(3F, 1F, -1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 219
		attachmentModel[6].setRotationPoint(0F, -2.5F, -1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 220
		attachmentModel[7].setRotationPoint(0F, -1F, -2.5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		attachmentModel[8].setRotationPoint(0F, 1.5F, -1F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		attachmentModel[9].setRotationPoint(0F, -1F, 1.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 10
		attachmentModel[10].setRotationPoint(0F, 1F, 1F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 11
		attachmentModel[11].setRotationPoint(0F, 1F, -2F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 12
		attachmentModel[12].setRotationPoint(0F, -2F, -2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		attachmentModel[13].setRotationPoint(0F, -2F, 1F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		attachmentModel[14].setRotationPoint(2F, -4F, -1F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 15
		attachmentModel[15].setRotationPoint(2F, 2F, -1F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		attachmentModel[16].setRotationPoint(2F, -1F, -4F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 17
		attachmentModel[17].setRotationPoint(2F, -1F, 2F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 18
		attachmentModel[18].setRotationPoint(2F, -4F, -4F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 19
		attachmentModel[19].setRotationPoint(2F, -4F, 2F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 20
		attachmentModel[20].setRotationPoint(2F, 2F, 2F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		attachmentModel[21].setRotationPoint(2F, 2F, -4F);



		flipAll();
	}
}