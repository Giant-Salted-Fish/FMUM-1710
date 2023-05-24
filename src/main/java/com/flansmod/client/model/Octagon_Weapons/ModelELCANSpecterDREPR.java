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

public class ModelELCANSpecterDREPR extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelELCANSpecterDREPR() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[10];
		attachmentModel[0] = new ModelRendererTurbo(this, 111, 28, textureX, textureY); // Box 176
		attachmentModel[1] = new ModelRendererTurbo(this, 94, 21, textureX, textureY); // Box 177
		attachmentModel[2] = new ModelRendererTurbo(this, 40, 38, textureX, textureY); // Box 178
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 179
		attachmentModel[4] = new ModelRendererTurbo(this, 68, 29, textureX, textureY); // Box 180
		attachmentModel[5] = new ModelRendererTurbo(this, 43, 82, textureX, textureY); // Box 182
		attachmentModel[6] = new ModelRendererTurbo(this, 193, 38, textureX, textureY); // Box 183
		attachmentModel[7] = new ModelRendererTurbo(this, 86, 80, textureX, textureY); // Box 184
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 186
		attachmentModel[9] = new ModelRendererTurbo(this, 70, 95, textureX, textureY); // Box 187

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 176
		attachmentModel[0].setRotationPoint(-1F, -1.7F, 4.5F);
		attachmentModel[0].rotateAngleX = -0.62831853F;

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 177
		attachmentModel[1].setRotationPoint(-1F, -1F, 4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		attachmentModel[2].setRotationPoint(-10F, -1F, -4F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 179
		attachmentModel[3].setRotationPoint(-1F, -1F, -6F);

		attachmentModel[4].addShapeBox(0F, 0F, -2F, 2, 1, 2, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 180
		attachmentModel[4].setRotationPoint(-1F, -1.7F, -4.5F);
		attachmentModel[4].rotateAngleX = 0.62831853F;

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		attachmentModel[5].setRotationPoint(-6F, -3.5F, -3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		attachmentModel[6].setRotationPoint(2F, -3.5F, -3F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		attachmentModel[7].setRotationPoint(-2F, -3.5F, -3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		attachmentModel[8].setRotationPoint(-10F, -2.5F, -3F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		attachmentModel[9].setRotationPoint(-10F, -3.5F, -3F);

		flipAll();
	}
}