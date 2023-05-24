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

public class ModelCICAPT1B0 extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCICAPT1B0() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[13];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 18
		attachmentModel[5] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 46
		attachmentModel[6] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 49
		attachmentModel[7] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 50
		attachmentModel[8] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 50
		attachmentModel[9] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 51
		attachmentModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 52
		attachmentModel[11] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 58
		attachmentModel[12] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 59

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-2F, -1.5F, -5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		attachmentModel[1].setRotationPoint(-2F, 0F, -5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		attachmentModel[2].setRotationPoint(-2F, 0F, 3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		attachmentModel[3].setRotationPoint(-1F, -5F, -3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		attachmentModel[4].setRotationPoint(-1F, -6F, -1.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		attachmentModel[5].setRotationPoint(-0.5F, 0F, -7.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		attachmentModel[6].setRotationPoint(7.5F, 0F, -7.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 50
		attachmentModel[7].setRotationPoint(8F, -1F, -8F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 50
		attachmentModel[8].setRotationPoint(8F, 1F, -8F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 51
		attachmentModel[9].setRotationPoint(0F, 1F, -8F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 52
		attachmentModel[10].setRotationPoint(0F, -1F, -8F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 58
		attachmentModel[11].setRotationPoint(-1F, -6F, 1.5F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		attachmentModel[12].setRotationPoint(-1F, -6F, -2.5F);

		flipAll();
	}
}