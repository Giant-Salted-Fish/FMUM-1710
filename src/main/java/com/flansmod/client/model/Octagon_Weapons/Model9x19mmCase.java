//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 9x19mm Case
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model9x19mmCase extends ModelDefault //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public Model9x19mmCase() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[10];
		defaultModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		defaultModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
		defaultModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6
		defaultModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
		defaultModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 9
		defaultModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 10
		defaultModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 11
		defaultModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		defaultModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 13
		defaultModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 14

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		defaultModel[0].setRotationPoint(0F, -0.5F, -1.5F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F); // Box 5
		defaultModel[1].setRotationPoint(0F, -1.5F, -1.5F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		defaultModel[2].setRotationPoint(0F, 0.5F, -1.5F);

		defaultModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 7
		defaultModel[3].setRotationPoint(0F, -0.5F, -1F);

		defaultModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 9
		defaultModel[4].setRotationPoint(0F, -1.5F, -0.5F);

		defaultModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 10
		defaultModel[5].setRotationPoint(0F, 0.5F, -0.5F);

		defaultModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		defaultModel[6].setRotationPoint(1F, -0.5F, -1.5F);

		defaultModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 12
		defaultModel[7].setRotationPoint(1F, -1.5F, -1.5F);

		defaultModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		defaultModel[8].setRotationPoint(1F, 0.5F, -1.5F);

		defaultModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		defaultModel[9].setRotationPoint(1F, -0.5F, 0.5F);
	}
}