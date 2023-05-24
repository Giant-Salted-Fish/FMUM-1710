//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Pistol Laser Pointer Mod 0 - Laser
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPistolLaserPointerMod0Laser extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelPistolLaserPointerMod0Laser() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[10];
		attachmentModel[0] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 254
		attachmentModel[1] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 255
		attachmentModel[2] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 256
		attachmentModel[3] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 257
		attachmentModel[4] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 258
		attachmentModel[5] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 259
		attachmentModel[6] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 260
		attachmentModel[7] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 261
		attachmentModel[8] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 262
		attachmentModel[9] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 263

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 132F, 0F, 0F, 132F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 132F, 0F, 0F, 132F, 0F, 0F, 0F, 0F, 0F); // Box 254
		attachmentModel[0].setRotationPoint(20F, 2F, 0F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 255
		attachmentModel[1].setRotationPoint(155F, 2F, 0F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 256
		attachmentModel[2].setRotationPoint(168F, 2F, 0F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 257
		attachmentModel[3].setRotationPoint(172F, 2F, 0F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 258
		attachmentModel[4].setRotationPoint(180F, 2F, 0F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		attachmentModel[5].setRotationPoint(180F, 3F, -1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 132F, 0F, 0F, 132F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 132F, 0F, 0F, 132F, 0F, 0F, 0F, 0F, 0F); // Box 260
		attachmentModel[6].setRotationPoint(20F, 3F, -1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 261
		attachmentModel[7].setRotationPoint(155F, 3F, -1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		attachmentModel[8].setRotationPoint(168F, 3F, -1F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 263
		attachmentModel[9].setRotationPoint(172F, 3F, -1F);



		flipAll();
	}
}