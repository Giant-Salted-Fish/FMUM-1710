//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CICEPR3R45
// Model Creator: 
// Created on: 09.11.2019 - 16:36:12
// Last changed on: 09.11.2019 - 16:36:12

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICEPR3R45 extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelCICEPR3R45() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[12];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 155
		attachmentModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 156
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 157
		attachmentModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 158
		attachmentModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 159
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 160
		attachmentModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 161
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 162
		attachmentModel[8] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 163
		attachmentModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 164
		attachmentModel[10] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 165
		attachmentModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 166

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 155
		attachmentModel[0].setRotationPoint(-3.5F, -1F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		attachmentModel[1].setRotationPoint(-3.5F, 0F, -4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		attachmentModel[2].setRotationPoint(-3.5F, 0F, 3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		attachmentModel[3].setRotationPoint(-0.5F, 0F, 3.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 159
		attachmentModel[4].setRotationPoint(0.5F, -1F, 4F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		attachmentModel[5].setRotationPoint(0.5F, 1F, 4F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		attachmentModel[6].setRotationPoint(-3.5F, 0F, -7F);

		attachmentModel[7].addShapeBox(0F, -1F, -6F, 16, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		attachmentModel[7].setRotationPoint(-7F, 0F, -5F);
		attachmentModel[7].rotateAngleX = 0.78539816F;

		attachmentModel[8].addShapeBox(0F, -2F, -6F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		attachmentModel[8].setRotationPoint(-7F, 0F, -5F);
		attachmentModel[8].rotateAngleX = 0.78539816F;

		attachmentModel[9].addShapeBox(0F, -2F, -6F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		attachmentModel[9].setRotationPoint(-2F, 0F, -5F);
		attachmentModel[9].rotateAngleX = 0.78539816F;

		attachmentModel[10].addShapeBox(0F, -2F, -6F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		attachmentModel[10].setRotationPoint(2F, 0F, -5F);
		attachmentModel[10].rotateAngleX = 0.78539816F;

		attachmentModel[11].addShapeBox(0F, -2F, -6F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		attachmentModel[11].setRotationPoint(6F, 0F, -5F);
		attachmentModel[11].rotateAngleX = 0.78539816F;

		flipAll();
	}
}