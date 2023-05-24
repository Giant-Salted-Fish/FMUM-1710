//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Pistol Laser Pointer Mod 0 - Laser FP
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPistolLaserPointerMod0LaserFP extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelPistolLaserPointerMod0LaserFP() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[8];
		attachmentModel[0] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 254
		attachmentModel[1] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 260
		attachmentModel[2] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 10
		attachmentModel[3] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 11
		attachmentModel[4] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 12
		attachmentModel[5] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 13
		attachmentModel[6] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 14
		attachmentModel[7] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 15

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F); // Box 254
		attachmentModel[0].setRotationPoint(20F, 2F, 0F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F); // Box 260
		attachmentModel[1].setRotationPoint(20F, 3F, -1F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F); // Box 10
		attachmentModel[2].setRotationPoint(1021F, 3F, -1F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F); // Box 11
		attachmentModel[3].setRotationPoint(1021F, 2F, 0F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F); // Box 12
		attachmentModel[4].setRotationPoint(2022F, 3F, -1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F); // Box 13
		attachmentModel[5].setRotationPoint(2022F, 2F, 0F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F); // Box 14
		attachmentModel[6].setRotationPoint(3023F, 3F, -1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1000F, 0F, 0F, 1000F, 0F, 0F, 0F, 0F, 0F); // Box 15
		attachmentModel[7].setRotationPoint(3023F, 2F, 0F);



		flipAll();
	}
}