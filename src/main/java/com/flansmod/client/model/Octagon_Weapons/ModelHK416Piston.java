//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416Piston
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416Piston extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416Piston() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[7];
		attachmentModel[0] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 560
		attachmentModel[1] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 574
		attachmentModel[2] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 575
		attachmentModel[3] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 576
		attachmentModel[4] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 577
		attachmentModel[5] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 578
		attachmentModel[6] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 579

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 69, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 560
		attachmentModel[0].setRotationPoint(-65F, -1F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F); // Box 574
		attachmentModel[1].setRotationPoint(-10F, -1.5F, -0.5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 1F); // Box 575
		attachmentModel[2].setRotationPoint(-10F, -0.5F, -0.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 576
		attachmentModel[3].setRotationPoint(-14F, -1.5F, -0.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		attachmentModel[4].setRotationPoint(-14F, -0.5F, -1.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		attachmentModel[5].setRotationPoint(-14F, 0.5F, -0.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F); // Box 579
		attachmentModel[6].setRotationPoint(-10F, 0.5F, -0.5F);

		flipAll();
	}
}