//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC 3-8x40 PS-8 Scope Reticle
// Model Creator: 
// Created on: 27.10.2019 - 16:45:48
// Last changed on: 27.10.2019 - 16:45:48

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCIC38x40PS8ScopeReticle extends ModelDefault //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCIC38x40PS8ScopeReticle() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[14];
		defaultModel[0] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 104
		defaultModel[1] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 105
		defaultModel[2] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 2
		defaultModel[3] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 3
		defaultModel[4] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 4
		defaultModel[5] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		defaultModel[6] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 6
		defaultModel[7] = new ModelRendererTurbo(this, 52, 2, textureX, textureY); // Box 7
		defaultModel[8] = new ModelRendererTurbo(this, 47, 2, textureX, textureY); // Box 8
		defaultModel[9] = new ModelRendererTurbo(this, 10, 2, textureX, textureY); // Box 9
		defaultModel[10] = new ModelRendererTurbo(this, 21, 2, textureX, textureY); // Box 10
		defaultModel[11] = new ModelRendererTurbo(this, 32, 2, textureX, textureY); // Box 11
		defaultModel[12] = new ModelRendererTurbo(this, 37, 2, textureX, textureY); // Box 12
		defaultModel[13] = new ModelRendererTurbo(this, 42, 2, textureX, textureY); // Box 13

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.92F, 0F, 0F, -0.92F, 0F, 0F, -0.92F, 0F, 0F, -0.92F, 0F); // Box 104
		defaultModel[0].setRotationPoint(0F, -0.0399999999999987F, -2F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.92F, 0F, 0F, -0.92F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.92F, 0F, 0F, -0.92F); // Box 105
		defaultModel[1].setRotationPoint(0F, -2F, -0.04F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 2
		defaultModel[2].setRotationPoint(0F, -0.15F, -6F);

		defaultModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 3
		defaultModel[3].setRotationPoint(0F, -0.15F, 2F);

		defaultModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 4
		defaultModel[4].setRotationPoint(0F, -6F, -0.15F);

		defaultModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 5
		defaultModel[5].setRotationPoint(0F, 2F, -0.15F);

		defaultModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.92F, -0.1F, 0F, -0.92F, -0.1F, 0F, -0.92F, -0.1F, 0F, -0.92F, -0.1F); // Box 6
		defaultModel[6].setRotationPoint(0F, 0.150000000000001F, -0.5F);

		defaultModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.92F, -0.2F, 0F, -0.92F, -0.2F, 0F, -0.92F, -0.2F, 0F, -0.92F, -0.2F); // Box 7
		defaultModel[7].setRotationPoint(0F, 0.45F, -0.5F);

		defaultModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.92F, -0.3F, 0F, -0.92F, -0.3F, 0F, -0.92F, -0.3F, 0F, -0.92F, -0.3F); // Box 8
		defaultModel[8].setRotationPoint(0F, 0.800000000000001F, -0.5F);

		defaultModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.92F, -0.4F, 0F, -0.92F, -0.4F, 0F, -0.92F, -0.4F, 0F, -0.92F, -0.4F); // Box 9
		defaultModel[9].setRotationPoint(0F, 1.2F, -0.5F);

		defaultModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.92F, -0.25F, 0F, -0.92F, -0.25F, 0F, -0.92F, -0.25F, 0F, -0.92F, -0.25F); // Box 10
		defaultModel[10].setRotationPoint(0F, 2F, -0.5F);

		defaultModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.92F, 0F, -0.25F, -0.92F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.92F, 0F, -0.25F, -0.92F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 11
		defaultModel[11].setRotationPoint(0F, -0.5F, -3F);

		defaultModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.92F, 0F, -0.25F, -0.92F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.92F, 0F, -0.25F, -0.92F); // Box 12
		defaultModel[12].setRotationPoint(0F, -0.5F, 2F);

		defaultModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.92F, -0.25F, 0F, -0.92F, -0.25F, 0F, -0.92F, -0.25F, 0F, -0.92F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13
		defaultModel[13].setRotationPoint(0F, -3F, -0.5F);

		flipAll();
	}
}