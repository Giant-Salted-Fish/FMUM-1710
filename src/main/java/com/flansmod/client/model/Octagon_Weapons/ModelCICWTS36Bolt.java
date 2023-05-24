//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CICWTS36Bolt
// Model Creator: 
// Created on: 22.12.2019 - 19:48:03
// Last changed on: 22.12.2019 - 19:48:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICWTS36Bolt extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCICWTS36Bolt() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[12];
		attachmentModel[0] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 153
		attachmentModel[1] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 154
		attachmentModel[2] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 155
		attachmentModel[3] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 181
		attachmentModel[4] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 245
		attachmentModel[5] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 260
		attachmentModel[6] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 271
		attachmentModel[7] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 488
		attachmentModel[8] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 400
		attachmentModel[9] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 403
		attachmentModel[10] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 404
		attachmentModel[11] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 405

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 24, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		attachmentModel[0].setRotationPoint(-11F, -1F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 154
		attachmentModel[1].setRotationPoint(-11F, -3F, -1F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 155
		attachmentModel[2].setRotationPoint(9F, -5.5F, -1F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 181
		attachmentModel[3].setRotationPoint(-10F, 2F, -2F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		attachmentModel[4].setRotationPoint(12F, 4F, -6F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 260
		attachmentModel[5].setRotationPoint(11F, 3F, -5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 271
		attachmentModel[6].setRotationPoint(12F, 3F, -5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 2F, 0F, -1F); // Box 488
		attachmentModel[7].setRotationPoint(10F, -6.5F, -1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 400
		attachmentModel[8].setRotationPoint(3F, -4.5F, -1.5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		attachmentModel[9].setRotationPoint(12F, 5F, -5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 16, 2, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		attachmentModel[10].setRotationPoint(-3F, 3F, -2F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 405
		attachmentModel[11].setRotationPoint(6F, 3F, -3F);

		flipAll();
	}
}