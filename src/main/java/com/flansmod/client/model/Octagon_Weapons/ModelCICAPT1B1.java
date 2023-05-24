//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Aimpoint Micro T-1
// Model Creator: 
// Created on: 27.10.2019 - 17:33:29
// Last changed on: 27.10.2019 - 17:33:29

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICAPT1B1 extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCICAPT1B1() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[10];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 57
		attachmentModel[1] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 58
		attachmentModel[2] = new ModelRendererTurbo(this, 34, 100, textureX, textureY); // Box 59
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 61
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 100, textureX, textureY); // Box 62
		attachmentModel[5] = new ModelRendererTurbo(this, 39, 94, textureX, textureY); // Box 63
		attachmentModel[6] = new ModelRendererTurbo(this, 25, 93, textureX, textureY); // Box 64
		attachmentModel[7] = new ModelRendererTurbo(this, 13, 93, textureX, textureY); // Box 65
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 93, textureX, textureY); // Box 66
		attachmentModel[9] = new ModelRendererTurbo(this, 65, 94, textureX, textureY); // Box 67

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 13, 1, 9, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 57
		attachmentModel[0].setRotationPoint(-5.5F, -1F, -5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		attachmentModel[1].setRotationPoint(-5.5F, -1F, -5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 59
		attachmentModel[2].setRotationPoint(-5.5F, -1F, 2F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		attachmentModel[3].setRotationPoint(-5.5F, 0F, -5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		attachmentModel[4].setRotationPoint(-5.5F, 1F, 3F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		attachmentModel[5].setRotationPoint(-5.5F, 0F, 3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		attachmentModel[6].setRotationPoint(-0.5F, 0F, 4.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 65
		attachmentModel[7].setRotationPoint(-0.5F, -1F, 5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66
		attachmentModel[8].setRotationPoint(-0.5F, 1F, 5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 67
		attachmentModel[9].setRotationPoint(0F, -0.5F, -5.25F);

		flipAll();
	}
}