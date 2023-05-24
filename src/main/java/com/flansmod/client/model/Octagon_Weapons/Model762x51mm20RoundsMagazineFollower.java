//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 7.62x51mm 20 Rounds Magazine Follower
// Model Creator: 
// Created on: 02.01.2020 - 20:29:24
// Last changed on: 02.01.2020 - 20:29:24

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model762x51mm20RoundsMagazineFollower extends ModelDefault //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Model762x51mm20RoundsMagazineFollower() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[4];
		defaultModel[0] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 42
		defaultModel[1] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 43
		defaultModel[2] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 53
		defaultModel[3] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 54

		defaultModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 42
		defaultModel[0].setRotationPoint(2F, -1F, 0.75F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		defaultModel[1].setRotationPoint(13.5F, 0F, -2F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 53
		defaultModel[2].setRotationPoint(12.5F, 0F, -2F);

		defaultModel[3].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		defaultModel[3].setRotationPoint(0F, 0F, -2.5F);

		flipAll();
	}
}