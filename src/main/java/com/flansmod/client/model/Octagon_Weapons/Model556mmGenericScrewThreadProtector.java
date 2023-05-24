//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 5.56mm Generic Screw Thread Protector
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model556mmGenericScrewThreadProtector extends ModelAttachment //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public Model556mmGenericScrewThreadProtector() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[8];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 473
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 474
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 475
		attachmentModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 476
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 477
		attachmentModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 478
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 479
		attachmentModel[7] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 480

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		attachmentModel[0].setRotationPoint(0F, -3F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		attachmentModel[1].setRotationPoint(0F, 2F, -1F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		attachmentModel[2].setRotationPoint(0F, -1F, -3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		attachmentModel[3].setRotationPoint(0F, -1F, 2F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 477
		attachmentModel[4].setRotationPoint(0F, -3F, 0.999999999999995F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		attachmentModel[5].setRotationPoint(0F, -3F, -3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		attachmentModel[6].setRotationPoint(0F, 2F, -3F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 480
		attachmentModel[7].setRotationPoint(0F, 2F, 0.999999999999995F);

		muzzleFlashPoint = new Vector3f(3F / 16F, 0F, 0F);

		flipAll();
	}
}