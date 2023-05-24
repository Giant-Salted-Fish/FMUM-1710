//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 12Gauge 8 Rounds Magazine
// Model Creator: 
// Created on: 22.07.2019 - 09:40:24
// Last changed on: 22.07.2019 - 09:40:24

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model12Gauge8RoundsMagazine extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Model12Gauge8RoundsMagazine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[2];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 22

		gunModel[0].addShapeBox(0F, 0F, 0F, 18, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[0].setRotationPoint(0F, 0F, -3F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 18, 39, 6, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 1F, 0F); // Box 22
		gunModel[1].setRotationPoint(0F, 9F, -3F);

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		flipAll();
	}
}