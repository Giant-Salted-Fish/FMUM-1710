//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416DustCover
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416DustCover extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416DustCover() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[5];
		attachmentModel[0] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 132
		attachmentModel[1] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 345
		attachmentModel[2] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 537
		attachmentModel[3] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 496
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 491

		attachmentModel[0].addShapeBox(0F, -1F, -1F, 24, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 132
		attachmentModel[0].setRotationPoint(-12F, 0F, 0F);
		attachmentModel[0].rotateAngleX = 2.70526034F;

		attachmentModel[1].addShapeBox(0F, -5F, -1F, 24, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		attachmentModel[1].setRotationPoint(-12F, 0F, 0F);
		attachmentModel[1].rotateAngleX = 2.70526034F;

		attachmentModel[2].addShapeBox(0F, -6F, -1F, 24, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		attachmentModel[2].setRotationPoint(-12F, 0F, 0F);
		attachmentModel[2].rotateAngleX = 2.70526034F;

		attachmentModel[3].addShapeBox(0F, -5.5F, -1F, 2, 3, 2, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0.5F, -1F, -1F, 0.5F, 0F, 0F, 0.5F, -1F, -1F, 0.5F, 0F); // Box 496
		attachmentModel[3].setRotationPoint(-1F, 0F, 0F);
		attachmentModel[3].rotateAngleX = 2.70526034F;

		attachmentModel[4].addShapeBox(0F, -4.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 491
		attachmentModel[4].setRotationPoint(0F, 0F, 0F);
		attachmentModel[4].rotateAngleX = 2.70526034F;

		flipAll();
	}
}