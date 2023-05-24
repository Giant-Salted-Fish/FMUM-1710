//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ELCAN SpecterDR 1x/4x
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAtSight;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelELCANSpecterDR1x4xIronSight extends ModelAtSight //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelELCANSpecterDR1x4xIronSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[7];
		attachmentModel[0] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 132
		attachmentModel[1] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 133
		attachmentModel[2] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 134
		attachmentModel[3] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 135
		attachmentModel[4] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 136
		attachmentModel[5] = new ModelRendererTurbo(this, 187, 12, textureX, textureY); // Box 165
		attachmentModel[6] = new ModelRendererTurbo(this, 6, 23, textureX, textureY); // Box 175

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 132
		attachmentModel[0].setRotationPoint(-1F, -2F, -1.5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 133
		attachmentModel[1].setRotationPoint(-1F, -2F, 0.5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		attachmentModel[2].setRotationPoint(-1F, -0.5F, -1.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F); // Box 135
		attachmentModel[3].setRotationPoint(-1F, -3F, -1.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 136
		attachmentModel[4].setRotationPoint(31F, -1.5F, -0.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		attachmentModel[5].setRotationPoint(31F, -0.5F, -1.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
		attachmentModel[6].setRotationPoint(-1F, -1F, -0.5F);

		flipAll();
	}
}