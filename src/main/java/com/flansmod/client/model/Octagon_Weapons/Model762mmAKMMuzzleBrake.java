//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 7.62mm AKM Muzzle Brake
// Model Creator: 
// Created on: 24.07.2019 - 22:49:56
// Last changed on: 24.07.2019 - 22:49:56

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model762mmAKMMuzzleBrake extends ModelAttachment //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public Model762mmAKMMuzzleBrake() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[12];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 521
		attachmentModel[1] = new ModelRendererTurbo(this, 20, 1, textureX, textureY); // Box 522
		attachmentModel[2] = new ModelRendererTurbo(this, 20, 9, textureX, textureY); // Box 525
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 16
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 17
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 19
		attachmentModel[6] = new ModelRendererTurbo(this, 14, 19, textureX, textureY); // Box 19
		attachmentModel[7] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 20
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 21
		attachmentModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		attachmentModel[10] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 23
		attachmentModel[11] = new ModelRendererTurbo(this, 20, 16, textureX, textureY); // Box 24

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		attachmentModel[0].setRotationPoint(0F, -1F, 2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		attachmentModel[1].setRotationPoint(0F, -2F, 2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		attachmentModel[2].setRotationPoint(0F, -1F, -3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 16
		attachmentModel[3].setRotationPoint(0F, -3F, -1F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 17
		attachmentModel[4].setRotationPoint(3F, -1F, 1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 19
		attachmentModel[5].setRotationPoint(3F, -1F, -3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 1F); // Box 19
		attachmentModel[6].setRotationPoint(3F, -2F, -2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		attachmentModel[7].setRotationPoint(0F, -2F, -3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		attachmentModel[8].setRotationPoint(0F, 2F, -1F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 22
		attachmentModel[9].setRotationPoint(3F, 1F, -2F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 23
		attachmentModel[10].setRotationPoint(0F, 1F, 2F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 24
		attachmentModel[11].setRotationPoint(0F, 1F, -3F);

		muzzleFlashPoint = new Vector3f(8F / 16F, 0F, 0F);

		flipAll();
	}
}