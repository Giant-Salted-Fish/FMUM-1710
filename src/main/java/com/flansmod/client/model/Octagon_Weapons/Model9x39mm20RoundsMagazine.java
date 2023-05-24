//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 9x39mm 20 Rounds Magazine
// Model Creator: 
// Created on: 07.09.2019 - 17:05:00
// Last changed on: 07.09.2019 - 17:05:00

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model9x39mm20RoundsMagazine extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Model9x39mm20RoundsMagazine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 145
		gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 146
		gunModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 147
		gunModel[3] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 148
		gunModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 370
		gunModel[5] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 371
		gunModel[6] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 372
		gunModel[7] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 373
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 374
		gunModel[9] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 375
		gunModel[10] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 376
		gunModel[11] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 377

		gunModel[0].addShapeBox(0F, 0F, 0F, 19, 10, 5, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 145
		gunModel[0].setRotationPoint(0F, 3F, -2.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 18, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		gunModel[1].setRotationPoint(0F, 0F, -2.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 21, 12, 5, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F); // Box 147
		gunModel[2].setRotationPoint(1F, 13F, -2.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 22, 11, 5, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -4F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 5F, 0F); // Box 148
		gunModel[3].setRotationPoint(4F, 25F, -2.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 14, 10, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 370
		gunModel[4].setRotationPoint(0F, 3F, -3F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 16, 12, 6, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F); // Box 371
		gunModel[5].setRotationPoint(1F, 13F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 17, 11, 6, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -4F, 5F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, -4F, 5F, 0F); // Box 372
		gunModel[6].setRotationPoint(4F, 25F, -3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		gunModel[7].setRotationPoint(0F, 0F, -3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 374
		gunModel[8].setRotationPoint(13F, 0F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F); // Box 375
		gunModel[9].setRotationPoint(13F, 3F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 1F); // Box 376
		gunModel[10].setRotationPoint(14F, 13F, -2F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4.5F, 0.25F, 1F, 4.5F, -0.1F, 0F, 4.5F, -0.1F, 0F, -4.5F, 0.25F, 1F); // Box 377
		gunModel[11].setRotationPoint(17F, 25F, -2F);

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		flipAll();
	}
}