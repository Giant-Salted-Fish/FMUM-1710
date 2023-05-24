//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 7.62x51mm 20 Rounds Magazine - MK14
// Model Creator: 
// Created on: 02.08.2019 - 09:42:40
// Last changed on: 02.08.2019 - 09:42:40

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model762x51mm20RoundsMagazineMK14 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Model762x51mm20RoundsMagazineMK14() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[4];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 582
		gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1028
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1029
		gunModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1030

		gunModel[0].addShapeBox(0F, 0F, 0F, 21, 39, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3.5F, 3F, 0F); // Box 582
		gunModel[0].setRotationPoint(0F, 0F, -2.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 42, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 4F, -0.2195F, 0F, 4F, -0.2195F, 0F, -3.5F, 0F, 0F); // Box 1028
		gunModel[1].setRotationPoint(0F, 0F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 10, 40, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 1.6341F, 0F, 4F, 0.0976F, 0F, 4F, 0.0976F, 0F, -3.5F, 1.6341F, 0F); // Box 1029
		gunModel[2].setRotationPoint(2.5F, 0F, -3F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 39, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0.8049F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3.5F, 0.8049F, 0F); // Box 1030
		gunModel[3].setRotationPoint(15F, 0F, -3F);

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		flipAll();
	}
}