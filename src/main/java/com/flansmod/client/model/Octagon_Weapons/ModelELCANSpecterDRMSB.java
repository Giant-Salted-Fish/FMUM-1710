//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ELCAN SpecterDR 1x/4x
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelELCANSpecterDRMSB extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelELCANSpecterDRMSB() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[5];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 137
		attachmentModel[1] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 138
		attachmentModel[2] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 139
		attachmentModel[3] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 140
		attachmentModel[4] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 141

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		attachmentModel[0].setRotationPoint(-10F, -1F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 138
		attachmentModel[1].setRotationPoint(-1F, -1F, 4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 139
		attachmentModel[2].setRotationPoint(-1F, -1.7F, 4.5F);
		attachmentModel[2].rotateAngleX = -0.62831853F;

		attachmentModel[3].addShapeBox(0F, 0F, -2F, 2, 1, 2, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 140
		attachmentModel[3].setRotationPoint(-1F, -1.7F, -4.5F);
		attachmentModel[3].rotateAngleX = 0.62831853F;

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 141
		attachmentModel[4].setRotationPoint(-1F, -1F, -6F);

		flipAll();
	}
}