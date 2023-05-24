//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: .45 ACP 30 Rounds Magazine - Vector
// Model Creator: 
// Created on: 29.09.2019 - 18:59:49
// Last changed on: 29.09.2019 - 18:59:49

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model45ACP30RoundsMagazineVector extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Model45ACP30RoundsMagazineVector() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[3];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 210
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 211
		gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 484

		gunModel[0].addShapeBox(0F, 0F, 0F, 12, 27, 7, 0F, -12F, 0F, 0F, 11F, -2F, 0F, 11F, -2F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 210
		gunModel[0].setRotationPoint(-12F, 0F, -3.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 13, 29, 9, 0F, -14F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -14F, 0F, 0F, -3F, 0.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, -3F, 0.5F, 0F); // Box 211
		gunModel[1].setRotationPoint(-25.5F, 27F, -4.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 33, 7, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 13F, 0.5F, 1F, -13F, 0.5F, 0F, -13F, 0.5F, 0F, 13F, 0.5F, 1F); // Box 484
		gunModel[2].setRotationPoint(0.5F, 27F, -3.62F);

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		flipAll();
	}
}