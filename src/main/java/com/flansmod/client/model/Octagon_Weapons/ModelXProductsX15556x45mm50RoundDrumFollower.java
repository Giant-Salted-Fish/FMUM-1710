//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: X Products X-15 5.56x45mm 50 Round Drum Follower
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelXProductsX15556x45mm50RoundDrumFollower extends ModelDefault //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelXProductsX15556x45mm50RoundDrumFollower() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[11];
		defaultModel[0] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 141
		defaultModel[1] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 142
		defaultModel[2] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 143
		defaultModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 144
		defaultModel[4] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 145
		defaultModel[5] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 146
		defaultModel[6] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 147
		defaultModel[7] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 148
		defaultModel[8] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 149
		defaultModel[9] = new ModelRendererTurbo(this, 80, 117, textureX, textureY); // Box 150
		defaultModel[10] = new ModelRendererTurbo(this, 120, 118, textureX, textureY); // Box 69

		defaultModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 141
		defaultModel[0].setRotationPoint(0F, -1.5F, -1.75F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 142
		defaultModel[1].setRotationPoint(0F, -2.5F, -1.75F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 143
		defaultModel[2].setRotationPoint(0F, -0.5F, -1.75F);

		defaultModel[3].addShapeBox(0F, -0.5F, -0.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		defaultModel[3].setRotationPoint(7F, -1F, -0.75F);
		defaultModel[3].rotateAngleX = -0.78539816F;

		defaultModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		defaultModel[4].setRotationPoint(9.5F, -2.5F, -1.75F);

		defaultModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		defaultModel[5].setRotationPoint(9.5F, -1.5F, -1.75F);

		defaultModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 147
		defaultModel[6].setRotationPoint(9.5F, -0.5F, -1.75F);

		defaultModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		defaultModel[7].setRotationPoint(6.5F, -1.75F, -1F);

		defaultModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		defaultModel[8].setRotationPoint(8.5F, -1.75F, -1F);

		defaultModel[9].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		defaultModel[9].setRotationPoint(0F, 0F, -1.5F);

		defaultModel[10].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 69
		defaultModel[10].setRotationPoint(0F, 0F, -2F);

		flipAll();
	}
}