//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AKMMuzzleBrake
// Model Creator: 
// Created on: 24.07.2019 - 22:49:56
// Last changed on: 24.07.2019 - 22:49:56

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAKMMuzzleBrake extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelAKMMuzzleBrake() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[19];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 521
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 522
		attachmentModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 523
		attachmentModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 524
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 525
		attachmentModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 526
		attachmentModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 527
		attachmentModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 528
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16
		attachmentModel[9] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 17
		attachmentModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 18
		attachmentModel[11] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 19
		attachmentModel[12] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 20
		attachmentModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 21
		attachmentModel[14] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 22
		attachmentModel[15] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 23
		attachmentModel[16] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 24
		attachmentModel[17] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 25
		attachmentModel[18] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 26

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		attachmentModel[0].setRotationPoint(0F, -1F, 2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 522
		attachmentModel[1].setRotationPoint(0F, -3F, 1F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		attachmentModel[2].setRotationPoint(0F, -3F, -1F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		attachmentModel[3].setRotationPoint(0F, -3F, -3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		attachmentModel[4].setRotationPoint(0F, -1F, -3F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		attachmentModel[5].setRotationPoint(0F, 2F, -3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		attachmentModel[6].setRotationPoint(0F, 2F, -1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 528
		attachmentModel[7].setRotationPoint(0F, 2F, 1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 16
		attachmentModel[8].setRotationPoint(3F, -3F, -1F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		attachmentModel[9].setRotationPoint(3F, -1F, 1F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		attachmentModel[10].setRotationPoint(3F, 1F, -1F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		attachmentModel[11].setRotationPoint(3F, -1F, -3F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 20
		attachmentModel[12].setRotationPoint(12F, 1F, -1F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 21
		attachmentModel[13].setRotationPoint(12F, -1F, -2F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 22
		attachmentModel[14].setRotationPoint(12F, -1F, 1F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 23
		attachmentModel[15].setRotationPoint(10F, -3F, -1F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 24
		attachmentModel[16].setRotationPoint(10F, -1F, 1F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 25
		attachmentModel[17].setRotationPoint(10F, 1F, -1F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		attachmentModel[18].setRotationPoint(10F, -1F, -2F);

		muzzleFlashPoint = new Vector3f(12F / 16F, 0, 0);

		flipAll();
	}
}