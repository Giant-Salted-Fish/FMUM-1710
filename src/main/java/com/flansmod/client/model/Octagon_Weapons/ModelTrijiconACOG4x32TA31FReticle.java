//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Trijicon ACOG 4x32 TA31F Division
// Model Creator: 
// Created on: 09.11.2019 - 16:36:12
// Last changed on: 09.11.2019 - 16:36:12

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTrijiconACOG4x32TA31FReticle extends ModelDefault //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTrijiconACOG4x32TA31FReticle() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[17];
		defaultModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 126
		defaultModel[1] = new ModelRendererTurbo(this, 6, 1, textureX, textureY); // Box 127
		defaultModel[2] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 128
		defaultModel[3] = new ModelRendererTurbo(this, 16, 1, textureX, textureY); // Box 129
		defaultModel[4] = new ModelRendererTurbo(this, 21, 1, textureX, textureY); // Box 130
		defaultModel[5] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // Box 132
		defaultModel[6] = new ModelRendererTurbo(this, 31, 1, textureX, textureY); // Box 133
		defaultModel[7] = new ModelRendererTurbo(this, 36, 1, textureX, textureY); // Box 134
		defaultModel[8] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 135
		defaultModel[9] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 136
		defaultModel[10] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 137
		defaultModel[11] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 138
		defaultModel[12] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 139
		defaultModel[13] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 140
		defaultModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 141
		defaultModel[15] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 179
		defaultModel[16] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 180

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F); // Box 126
		defaultModel[0].setRotationPoint(0F, 0.6F, -0.05F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 127
		defaultModel[1].setRotationPoint(0F, 1F, -0.35F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 128
		defaultModel[2].setRotationPoint(0F, 1.6F, -0.3F);

		defaultModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F); // Box 129
		defaultModel[3].setRotationPoint(0F, 2.3F, -0.25F);

		defaultModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.6F, 0F, -0.9F, -0.6F); // Box 130
		defaultModel[4].setRotationPoint(0F, 3.4F, -0.2F);

		defaultModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 132
		defaultModel[5].setRotationPoint(0F, 1F, -0.75F);

		defaultModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 133
		defaultModel[6].setRotationPoint(0F, 0.800000000000001F, -0.75F);

		defaultModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.9F, 0F, -0.8F, -0.9F); // Box 134
		defaultModel[7].setRotationPoint(0F, 0.800000000000001F, -0.55F);

		defaultModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 135
		defaultModel[8].setRotationPoint(0F, 2.3F, -0.75F);

		defaultModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 136
		defaultModel[9].setRotationPoint(0F, 2.5F, -0.75F);

		defaultModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 137
		defaultModel[10].setRotationPoint(0F, 2.1F, -0.75F);

		defaultModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 138
		defaultModel[11].setRotationPoint(0F, 2.1F, -0.55F);

		defaultModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 139
		defaultModel[12].setRotationPoint(0F, 2.4F, -0.75F);

		defaultModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F); // Box 140
		defaultModel[13].setRotationPoint(0F, 1.5F, -0.05F);

		defaultModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 141
		defaultModel[14].setRotationPoint(0F, 2.4F, -0.05F);

		defaultModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F); // Box 179
		defaultModel[15].setRotationPoint(0F, 0F, 0F);

		defaultModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 180
		defaultModel[16].setRotationPoint(0F, 0F, -1F);

		flipAll();
	}
}