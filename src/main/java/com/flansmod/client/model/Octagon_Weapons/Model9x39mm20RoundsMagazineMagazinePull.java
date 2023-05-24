//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 9x39mm 20 Rounds Magazine & Magazine Pull
// Model Creator: 
// Created on: 07.09.2019 - 17:05:00
// Last changed on: 07.09.2019 - 17:05:00

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model9x39mm20RoundsMagazineMagazinePull extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Model9x39mm20RoundsMagazineMagazinePull() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[21];
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
		gunModel[12] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 378
		gunModel[13] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 379
		gunModel[14] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 380
		gunModel[15] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 381
		gunModel[16] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 382
		gunModel[17] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 383
		gunModel[18] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 384
		gunModel[19] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 385
		gunModel[20] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 386

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

		gunModel[12].addShapeBox(0F, -9F, 0F, 19, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		gunModel[12].setRotationPoint(8F, 41F, -4F);
		gunModel[12].rotateAngleZ = 0.31415927F;

		gunModel[13].addShapeBox(0F, -9F, 0F, 19, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		gunModel[13].setRotationPoint(8F, 41F, 3F);
		gunModel[13].rotateAngleZ = 0.31415927F;

		gunModel[14].addShapeBox(-1F, -9F, 0F, 1, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 380
		gunModel[14].setRotationPoint(8F, 41F, -3F);
		gunModel[14].rotateAngleZ = 0.31415927F;

		gunModel[15].addShapeBox(19F, -9F, 0F, 1, 9, 6, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 381
		gunModel[15].setRotationPoint(8F, 41F, -3F);
		gunModel[15].rotateAngleZ = 0.31415927F;

		gunModel[16].addShapeBox(6.5F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		gunModel[16].setRotationPoint(8F, 41F, 3F);
		gunModel[16].rotateAngleZ = 0.31415927F;

		gunModel[17].addShapeBox(6.5F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		gunModel[17].setRotationPoint(8F, 41F, -4F);
		gunModel[17].rotateAngleZ = 0.31415927F;

		gunModel[18].addShapeBox(7.5F, 7F, 0F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 384
		gunModel[18].setRotationPoint(8F, 41F, -4F);
		gunModel[18].rotateAngleZ = 0.31415927F;

		gunModel[19].addShapeBox(7.5F, 7F, 0F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 385
		gunModel[19].setRotationPoint(8F, 41F, 3F);
		gunModel[19].rotateAngleZ = 0.31415927F;

		gunModel[20].addShapeBox(7.5F, 9F, 0F, 4, 1, 4, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		gunModel[20].setRotationPoint(8F, 41F, -2F);
		gunModel[20].rotateAngleZ = 0.31415927F;

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		flipAll();
	}
}