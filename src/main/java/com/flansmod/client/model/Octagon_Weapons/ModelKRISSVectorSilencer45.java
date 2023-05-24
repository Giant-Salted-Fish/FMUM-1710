//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KRISS Vector Silencer@.45
// Model Creator: 
// Created on: 31.12.2019 - 12:40:14
// Last changed on: 31.12.2019 - 12:40:14

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelKRISSVectorSilencer45 extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelKRISSVectorSilencer45() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[16];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
		attachmentModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
		attachmentModel[7] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 7
		attachmentModel[8] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 8
		attachmentModel[9] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 9
		attachmentModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		attachmentModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11
		attachmentModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 12
		attachmentModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 13
		attachmentModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 14
		attachmentModel[15] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 15

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-5F, -4.5F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 64, 3, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		attachmentModel[1].setRotationPoint(3F, -4.5F, -1F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		attachmentModel[2].setRotationPoint(-5F, -1F, -4.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 3
		attachmentModel[3].setRotationPoint(-5F, -4.5F, -4F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 4
		attachmentModel[4].setRotationPoint(-5F, -1F, 2.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F); // Box 5
		attachmentModel[5].setRotationPoint(-5F, -4.5F, 2F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 64, 2, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		attachmentModel[6].setRotationPoint(3F, -1F, -4.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		attachmentModel[7].setRotationPoint(-5F, 2.5F, -4F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 8
		attachmentModel[8].setRotationPoint(-5F, 2.5F, -1F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F); // Box 9
		attachmentModel[9].setRotationPoint(-5F, 2.5F, 2F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2.5F, 0F, 1.5F, -2.5F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 10
		attachmentModel[10].setRotationPoint(3F, -4.5F, -4F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1.5F, -2.5F, 0F, 1.5F, -2.5F); // Box 11
		attachmentModel[11].setRotationPoint(3F, -4.5F, 2F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1.5F, -2.5F, 0F, 1.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F); // Box 12
		attachmentModel[12].setRotationPoint(3F, 2.5F, 2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, 1.5F, -2.5F, 0F, 1.5F, -2.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		attachmentModel[13].setRotationPoint(3F, 2.5F, -4F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 64, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 14
		attachmentModel[14].setRotationPoint(3F, -1F, 1.5F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 64, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 15
		attachmentModel[15].setRotationPoint(3F, 1.5F, -1F);



		flipAll();
	}
}