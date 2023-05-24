//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BerettaM953Barrel
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBerettaM953Barrel extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBerettaM953Barrel() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[11];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 217
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 231
		attachmentModel[6] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 232
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 233
		attachmentModel[8] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 234
		attachmentModel[9] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 231
		attachmentModel[10] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 232

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		attachmentModel[0].setRotationPoint(0F, -7.5F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		attachmentModel[1].setRotationPoint(0F, -8F, -2.5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		attachmentModel[2].setRotationPoint(0F, -6F, -2.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		attachmentModel[3].setRotationPoint(0F, -6F, 1.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 217
		attachmentModel[4].setRotationPoint(0F, -3.5F, -2F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		attachmentModel[5].setRotationPoint(0F, -8F, 1.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 232
		attachmentModel[6].setRotationPoint(0F, -4F, 1.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		attachmentModel[7].setRotationPoint(0F, -3.5F, -1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 234
		attachmentModel[8].setRotationPoint(0F, -4F, -2.5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 231
		attachmentModel[9].setRotationPoint(0F, -3.5F, 1F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 232
		attachmentModel[10].setRotationPoint(0F, -2.5F, -1F);

		muzzleFlashPoint.set(41F / 16F, 5F / 16F, 0F);

		flipAll();
	}
}