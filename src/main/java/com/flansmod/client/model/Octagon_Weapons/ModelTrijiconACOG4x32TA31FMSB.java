//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Trijicon ACOG 4x32 TA31F
// Model Creator: 
// Created on: 09.11.2019 - 16:36:12
// Last changed on: 09.11.2019 - 16:36:12

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTrijiconACOG4x32TA31FMSB extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelTrijiconACOG4x32TA31FMSB() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[12];
		attachmentModel[0] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 160
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 161
		attachmentModel[2] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 162
		attachmentModel[3] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 163
		attachmentModel[4] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 164
		attachmentModel[5] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 165
		attachmentModel[6] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 166
		attachmentModel[7] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 167
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 168
		attachmentModel[9] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 169
		attachmentModel[10] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 170
		attachmentModel[11] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 171

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F); // Box 160
		attachmentModel[0].setRotationPoint(-0.75F, 3F, 5F);

		attachmentModel[1].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		attachmentModel[1].setRotationPoint(0F, 4.25F, 5.75F);
		attachmentModel[1].rotateAngleY = 0.78539816F;

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3.5F, 0.5F, 0F, 3.5F); // Box 162
		attachmentModel[2].setRotationPoint(-0.75F, 0F, 2F);

		attachmentModel[3].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		attachmentModel[3].setRotationPoint(0F, 4.25F, -5.75F);
		attachmentModel[3].rotateAngleY = 0.78539816F;

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 164
		attachmentModel[4].setRotationPoint(-0.75F, 3F, -6F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3F, 0.5F, 0F, -3F); // Box 165
		attachmentModel[5].setRotationPoint(-0.75F, 0F, -3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 166
		attachmentModel[6].setRotationPoint(-0.75F, -1F, -3.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F); // Box 167
		attachmentModel[7].setRotationPoint(-2.25F, -2F, 3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.5F, -1F, 0F); // Box 168
		attachmentModel[8].setRotationPoint(-2.25F, -2F, -3F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F); // Box 169
		attachmentModel[9].setRotationPoint(-2.25F, -2F, -4F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		attachmentModel[10].setRotationPoint(7.75F, -2F, -4F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 171
		attachmentModel[11].setRotationPoint(7.75F, -2F, 2F);

		flipAll();
	}
}