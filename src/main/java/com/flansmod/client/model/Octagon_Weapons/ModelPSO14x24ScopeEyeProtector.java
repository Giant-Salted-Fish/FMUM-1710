//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PSO-1 4x24 Scope
// Model Creator: 
// Created on: 22.12.2019 - 13:22:03
// Last changed on: 22.12.2019 - 13:22:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPSO14x24ScopeEyeProtector extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelPSO14x24ScopeEyeProtector() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[16];
		attachmentModel[0] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 58
		attachmentModel[1] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 59
		attachmentModel[2] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 60
		attachmentModel[3] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 61
		attachmentModel[4] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 62
		attachmentModel[5] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 63
		attachmentModel[6] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 64
		attachmentModel[7] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 65
		attachmentModel[8] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 78
		attachmentModel[9] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 79
		attachmentModel[10] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 80
		attachmentModel[11] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 81
		attachmentModel[12] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 83
		attachmentModel[13] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 111
		attachmentModel[14] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 112
		attachmentModel[15] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 113

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		attachmentModel[0].setRotationPoint(-3F, -5.5F, -1.5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 59
		attachmentModel[1].setRotationPoint(-3F, 3.5F, -1.5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 60
		attachmentModel[2].setRotationPoint(-3F, -1.5F, 3.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		attachmentModel[3].setRotationPoint(-3F, -1.5F, -5.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 62
		attachmentModel[4].setRotationPoint(-3F, -5.5F, -5.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 63
		attachmentModel[5].setRotationPoint(-3F, -5.5F, 2.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 64
		attachmentModel[6].setRotationPoint(-3F, 2.5F, 2.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		attachmentModel[7].setRotationPoint(-3F, 2.5F, -5.5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		attachmentModel[8].setRotationPoint(-2F, -4.5F, -1.5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 79
		attachmentModel[9].setRotationPoint(-2F, 3.5F, -1.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		attachmentModel[10].setRotationPoint(-2F, -1.5F, -4.5F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 81
		attachmentModel[11].setRotationPoint(-2F, -1.5F, 3.5F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		attachmentModel[12].setRotationPoint(-2F, -3.5F, -4.5F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 111
		attachmentModel[13].setRotationPoint(-2F, -3.5F, 3.5F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.1F, -3F, 0F, 0.1F, -3F); // Box 112
		attachmentModel[14].setRotationPoint(-2F, 1.5F, 3.5F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 113
		attachmentModel[15].setRotationPoint(-2F, 1.5F, -4.5F);

		flipAll();
	}
}