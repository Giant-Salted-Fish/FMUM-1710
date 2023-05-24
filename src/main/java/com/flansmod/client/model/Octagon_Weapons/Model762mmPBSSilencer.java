//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 7.62mm PBS Silencer
// Model Creator: 
// Created on: 24.07.2019 - 22:49:56
// Last changed on: 24.07.2019 - 22:49:56

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model762mmPBSSilencer extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public Model762mmPBSSilencer() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[30];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 371
		attachmentModel[1] = new ModelRendererTurbo(this, 144, 1, textureX, textureY); // Box 520
		attachmentModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 521
		attachmentModel[3] = new ModelRendererTurbo(this, 218, 1, textureX, textureY); // Box 522
		attachmentModel[4] = new ModelRendererTurbo(this, 221, 8, textureX, textureY); // Box 526
		attachmentModel[5] = new ModelRendererTurbo(this, 177, 26, textureX, textureY); // Box 527
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 528
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 529
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 532
		attachmentModel[9] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 537
		attachmentModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 538
		attachmentModel[11] = new ModelRendererTurbo(this, 206, 10, textureX, textureY); // Box 14
		attachmentModel[12] = new ModelRendererTurbo(this, 191, 10, textureX, textureY); // Box 15
		attachmentModel[13] = new ModelRendererTurbo(this, 176, 12, textureX, textureY); // Box 16
		attachmentModel[14] = new ModelRendererTurbo(this, 131, 24, textureX, textureY); // Box 17
		attachmentModel[15] = new ModelRendererTurbo(this, 128, 12, textureX, textureY); // Box 18
		attachmentModel[16] = new ModelRendererTurbo(this, 179, 47, textureX, textureY); // Box 19
		attachmentModel[17] = new ModelRendererTurbo(this, 182, 43, textureX, textureY); // Box 20
		attachmentModel[18] = new ModelRendererTurbo(this, 201, 45, textureX, textureY); // Box 21
		attachmentModel[19] = new ModelRendererTurbo(this, 138, 47, textureX, textureY); // Box 22
		attachmentModel[20] = new ModelRendererTurbo(this, 178, 35, textureX, textureY); // Box 23
		attachmentModel[21] = new ModelRendererTurbo(this, 131, 31, textureX, textureY); // Box 24
		attachmentModel[22] = new ModelRendererTurbo(this, 146, 23, textureX, textureY); // Box 25
		attachmentModel[23] = new ModelRendererTurbo(this, 143, 10, textureX, textureY); // Box 26
		attachmentModel[24] = new ModelRendererTurbo(this, 214, 23, textureX, textureY); // Box 30
		attachmentModel[25] = new ModelRendererTurbo(this, 215, 36, textureX, textureY); // Box 31
		attachmentModel[26] = new ModelRendererTurbo(this, 134, 41, textureX, textureY); // Box 32
		attachmentModel[27] = new ModelRendererTurbo(this, 221, 42, textureX, textureY); // Box 33
		attachmentModel[28] = new ModelRendererTurbo(this, 221, 49, textureX, textureY); // Box 34
		attachmentModel[29] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 35

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 65, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 371
		attachmentModel[0].setRotationPoint(0F, -6F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		attachmentModel[1].setRotationPoint(1F, -8F, -3F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		attachmentModel[2].setRotationPoint(1F, -3F, 6F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 522
		attachmentModel[3].setRotationPoint(1F, -8F, 3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		attachmentModel[4].setRotationPoint(1F, -3F, -8F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		attachmentModel[5].setRotationPoint(1F, 6F, -3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 62, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		attachmentModel[6].setRotationPoint(3F, 1F, -1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 62, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		attachmentModel[7].setRotationPoint(3F, -3F, 1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 62, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		attachmentModel[8].setRotationPoint(3F, -3F, -6F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 62, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		attachmentModel[9].setRotationPoint(3F, -3F, -1F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 65, 3, 6, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		attachmentModel[10].setRotationPoint(0F, 3F, -3F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		attachmentModel[11].setRotationPoint(0F, -1F, -6F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		attachmentModel[12].setRotationPoint(0F, -1F, 2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		attachmentModel[13].setRotationPoint(0F, -2F, 2F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		attachmentModel[14].setRotationPoint(0F, -2F, -6F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 18
		attachmentModel[15].setRotationPoint(0F, 1F, -6F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		attachmentModel[16].setRotationPoint(0F, 1F, 2F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		attachmentModel[17].setRotationPoint(0F, -3F, -6F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		attachmentModel[18].setRotationPoint(0F, 2F, -6F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		attachmentModel[19].setRotationPoint(0F, 6F, -3F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 23
		attachmentModel[20].setRotationPoint(0F, -3F, -7F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 24
		attachmentModel[21].setRotationPoint(0F, -7F, -3F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		attachmentModel[22].setRotationPoint(0F, -3F, 6F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 26
		attachmentModel[23].setRotationPoint(0F, -7F, 3F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, -3F, 0F, 0F, -3F); // Box 30
		attachmentModel[24].setRotationPoint(0F, -7F, -4F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 31
		attachmentModel[25].setRotationPoint(0F, 3F, -4F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 32
		attachmentModel[26].setRotationPoint(0F, 3F, 3F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 33
		attachmentModel[27].setRotationPoint(1F, -8F, -4F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 34
		attachmentModel[28].setRotationPoint(1F, 3F, -4F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 35
		attachmentModel[29].setRotationPoint(1F, 3F, 3F);
	}
}