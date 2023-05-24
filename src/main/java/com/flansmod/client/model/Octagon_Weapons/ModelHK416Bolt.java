//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416Bolt
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416Bolt extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416Bolt() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[18];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 86
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 123
		attachmentModel[2] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 247
		attachmentModel[3] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 490
		attachmentModel[4] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 620
		attachmentModel[5] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 621
		attachmentModel[6] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 622
		attachmentModel[7] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 623
		attachmentModel[8] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 624
		attachmentModel[9] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 625
		attachmentModel[10] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 626
		attachmentModel[11] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 545
		attachmentModel[12] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 546
		attachmentModel[13] = new ModelRendererTurbo(this, 320, 217, textureX, textureY); // Box 561
		attachmentModel[14] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 583
		attachmentModel[15] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 584
		attachmentModel[16] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 585
		attachmentModel[17] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Box 586

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 50, 2, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		attachmentModel[0].setRotationPoint(-38F, -1F, 2.5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 24, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		attachmentModel[1].setRotationPoint(-12F, -3F, -1.5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 247
		attachmentModel[2].setRotationPoint(-12F, -2F, -3.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F); // Box 490
		attachmentModel[3].setRotationPoint(6F, -2F, -3.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 620
		attachmentModel[4].setRotationPoint(-9F, -5F, -1.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 621
		attachmentModel[5].setRotationPoint(-3F, -6F, -1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 13, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		attachmentModel[6].setRotationPoint(-38F, -3F, -1.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, -1F, 0F); // Box 623
		attachmentModel[7].setRotationPoint(-2F, -7F, -1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 624
		attachmentModel[8].setRotationPoint(-38F, -2F, 1.5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 24, 4, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 625
		attachmentModel[9].setRotationPoint(-12F, -2F, 1.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 626
		attachmentModel[10].setRotationPoint(-38F, -2F, -2.5F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, -4F, 0F); // Box 545
		attachmentModel[11].setRotationPoint(-2F, -3F, -2.51F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 24, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		attachmentModel[12].setRotationPoint(-12F, -3F, -2.5F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		attachmentModel[13].setRotationPoint(12F, -1.5F, -1.5F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 583
		attachmentModel[14].setRotationPoint(-38F, -1F, -3.5F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 584
		attachmentModel[15].setRotationPoint(-13F, -2F, -3.5F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 585
		attachmentModel[16].setRotationPoint(-13F, 0F, -2.5F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 586
		attachmentModel[17].setRotationPoint(-13F, -2F, -2.5F);

		flipAll();
	}
}