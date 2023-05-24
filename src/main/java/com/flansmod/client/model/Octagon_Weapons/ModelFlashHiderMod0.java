//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FlashHiderMod0
// Model Creator: 
// Created on: 02.08.2019 - 09:42:40
// Last changed on: 02.08.2019 - 09:42:40

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFlashHiderMod0 extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelFlashHiderMod0() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[8];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1022
		attachmentModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1023
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1024
		attachmentModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 1025
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 1030
		attachmentModel[5] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 1033
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 1034
		attachmentModel[7] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 1035

		attachmentModel[0].addShapeBox(0F, -3F, -3F, 8, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1022
		attachmentModel[0].setRotationPoint(0F, 0F, 0F);
		attachmentModel[0].rotateAngleX = -0.78539816F;

		attachmentModel[1].addShapeBox(0F, 1F, -3F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1023
		attachmentModel[1].setRotationPoint(0F, 0F, 0F);
		attachmentModel[1].rotateAngleX = -0.78539816F;

		attachmentModel[2].addShapeBox(0F, -1F, -3F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1024
		attachmentModel[2].setRotationPoint(0F, 0F, 0F);
		attachmentModel[2].rotateAngleX = -0.78539816F;

		attachmentModel[3].addShapeBox(0F, -1F, 1F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1025
		attachmentModel[3].setRotationPoint(0F, 0F, 0F);
		attachmentModel[3].rotateAngleX = -0.78539816F;

		attachmentModel[4].addShapeBox(0F, -3F, 1F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1030
		attachmentModel[4].setRotationPoint(8F, 0F, 0F);
		attachmentModel[4].rotateAngleX = -0.78539816F;

		attachmentModel[5].addShapeBox(0F, -3F, -3F, 8, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1033
		attachmentModel[5].setRotationPoint(8F, 0F, 0F);
		attachmentModel[5].rotateAngleX = -0.78539816F;

		attachmentModel[6].addShapeBox(0F, 1F, -3F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1034
		attachmentModel[6].setRotationPoint(8F, 0F, 0F);
		attachmentModel[6].rotateAngleX = -0.78539816F;

		attachmentModel[7].addShapeBox(0F, 1F, 1F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1035
		attachmentModel[7].setRotationPoint(8F, 0F, 0F);
		attachmentModel[7].rotateAngleX = -0.78539816F;



		flipAll();
	}
}