//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: .408 7 Rounds Magazine
// Model Creator: 
// Created on: 03.07.2019 - 20:04:57
// Last changed on: 03.07.2019 - 20:04:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model4087RoundsMagazine extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Model4087RoundsMagazine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[6];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 97
		gunModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 498
		gunModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 499
		gunModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 500
		gunModel[4] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 501
		gunModel[5] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 502

		gunModel[0].addShapeBox(0F, 0F, 0F, 34, 40, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 97
		gunModel[0].setRotationPoint(0F, 0F, -2.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 41, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1765F, 0F, 0F, -0.1765F, 0F, 0F, 0F, 0F); // Box 498
		gunModel[1].setRotationPoint(0F, 0F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 39, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6544F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.6544F, 0F); // Box 499
		gunModel[2].setRotationPoint(30.5F, 0F, -3F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 6, 39, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.0074F, 0F, 0F, 0.7426F, 0F, 0F, 0.7426F, 0F, 0F, 1.0074F, 0F); // Box 500
		gunModel[3].setRotationPoint(22.5F, 0F, -3F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 6, 39, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3824F, 0F, 0.5F, 1.0956F, 0F, 0.5F, 1.0956F, 0F, 0F, 1.3824F, 0F); // Box 501
		gunModel[4].setRotationPoint(14F, 0F, -3F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 6, 39, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.7353F, 0F, 0F, 1.4706F, 0F, 0F, 1.4706F, 0F, 0F, 1.7353F, 0F); // Box 502
		gunModel[5].setRotationPoint(6F, 0F, -3F);

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		flipAll();
	}
}