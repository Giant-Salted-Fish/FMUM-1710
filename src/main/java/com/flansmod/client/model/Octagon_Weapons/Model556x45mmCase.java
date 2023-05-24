//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 5.56x45mm Case
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model556x45mmCase extends ModelDefault //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Model556x45mmCase() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[19];
		defaultModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 102
		defaultModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 103
		defaultModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 106
		defaultModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 112
		defaultModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 113
		defaultModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 114
		defaultModel[6] = new ModelRendererTurbo(this, 2, 18, textureX, textureY); // Box 115
		defaultModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 116
		defaultModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 117
		defaultModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 118
		defaultModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 119
		defaultModel[11] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 120
		defaultModel[12] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 121
		defaultModel[13] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 122
		defaultModel[14] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		defaultModel[15] = new ModelRendererTurbo(this, 19, 13, textureX, textureY); // Box 100
		defaultModel[16] = new ModelRendererTurbo(this, 25, 31, textureX, textureY); // Box 27
		defaultModel[17] = new ModelRendererTurbo(this, 34, 31, textureX, textureY); // Box 28
		defaultModel[18] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 29

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 102
		defaultModel[0].setRotationPoint(10.5F, -0.75F, -0.25F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		defaultModel[1].setRotationPoint(10.5F, -0.25F, -0.75F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 106
		defaultModel[2].setRotationPoint(10.5F, -0.25F, -0.25F);

		defaultModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -0.75F, 0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0.25F); // Box 112
		defaultModel[3].setRotationPoint(9.5F, -0.75F, -0.25F);

		defaultModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.75F); // Box 113
		defaultModel[4].setRotationPoint(9.5F, -0.25F, -0.75F);

		defaultModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F); // Box 114
		defaultModel[5].setRotationPoint(9.5F, -0.25F, -0.25F);

		defaultModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 115
		defaultModel[6].setRotationPoint(1F, -0.5F, -1F);

		defaultModel[7].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 116
		defaultModel[7].setRotationPoint(1F, -1.5F, -0.5F);

		defaultModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		defaultModel[8].setRotationPoint(1F, 0.5F, -0.5F);

		defaultModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 118
		defaultModel[9].setRotationPoint(0F, -1.5F, -0.5F);

		defaultModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
		defaultModel[10].setRotationPoint(0.5F, -0.75F, -0.25F);

		defaultModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 120
		defaultModel[11].setRotationPoint(0.5F, -0.25F, -0.75F);

		defaultModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		defaultModel[12].setRotationPoint(0.5F, -0.25F, -0.25F);

		defaultModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 122
		defaultModel[13].setRotationPoint(0F, 0.5F, -0.5F);

		defaultModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
		defaultModel[14].setRotationPoint(0F, -0.5F, -1F);

		defaultModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 100
		defaultModel[15].setRotationPoint(-0.01F, -0.5F, -0.5F);

		defaultModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 27
		defaultModel[16].setRotationPoint(10.5F, -0.25F, 0.25F);

		defaultModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.25F, -1.25F); // Box 28
		defaultModel[17].setRotationPoint(9.5F, -0.25F, -0.25F);

		defaultModel[18].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29
		defaultModel[18].setRotationPoint(1F, -0.5F, 0.5F);
	}
}