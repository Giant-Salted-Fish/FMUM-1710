//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 5.56x45mm 30 Rounds Magazine Follower
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model556x45mm30RoundMagazineFollower extends ModelDefault //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public Model556x45mm30RoundMagazineFollower() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[4];
		defaultModel[0] = new ModelRendererTurbo(this, 46, 83, textureX, textureY); // Box 91
		defaultModel[1] = new ModelRendererTurbo(this, 46, 79, textureX, textureY); // Box 95
		defaultModel[2] = new ModelRendererTurbo(this, 72, 76, textureX, textureY); // Box 96
		defaultModel[3] = new ModelRendererTurbo(this, 80, 79, textureX, textureY); // Box 97

		defaultModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 91
		defaultModel[0].setRotationPoint(0F, 0F, -1.75F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 95
		defaultModel[1].setRotationPoint(1.5F, -1F, -1.25F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 96
		defaultModel[2].setRotationPoint(14F, 0F, -1.75F);

		defaultModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 97
		defaultModel[3].setRotationPoint(15F, 0F, -1.75F);

		flipAll();
	}
}