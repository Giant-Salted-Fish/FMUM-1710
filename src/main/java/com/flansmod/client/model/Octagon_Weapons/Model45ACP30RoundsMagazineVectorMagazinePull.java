//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: .45 ACP 30 Rounds Magazine - Vector & Magazine Pull
// Model Creator: 
// Created on: 29.09.2019 - 18:59:49
// Last changed on: 29.09.2019 - 18:59:49

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model45ACP30RoundsMagazineVectorMagazinePull extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Model45ACP30RoundsMagazineVectorMagazinePull() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 210
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 211
		gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 484
		gunModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 489
		gunModel[4] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 490
		gunModel[5] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 491
		gunModel[6] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 492
		gunModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 493
		gunModel[8] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 494
		gunModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 495
		gunModel[10] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 496
		gunModel[11] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 497

		gunModel[0].addShapeBox(0F, 0F, 0F, 12, 27, 7, 0F, -12F, 0F, 0F, 11F, -2F, 0F, 11F, -2F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 210
		gunModel[0].setRotationPoint(-12F, 0F, -3.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 13, 29, 9, 0F, -14F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -14F, 0F, 0F, -3F, 0.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, -3F, 0.5F, 0F); // Box 211
		gunModel[1].setRotationPoint(-25.5F, 27F, -4.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 33, 7, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 13F, 0.5F, 1F, -13F, 0.5F, 0F, -13F, 0.5F, 0F, 13F, 0.5F, 1F); // Box 484
		gunModel[2].setRotationPoint(0.5F, 27F, -3.62F);

		gunModel[3].addShapeBox(0F, -9F, 0F, 12, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		gunModel[3].setRotationPoint(-22.5F, 56.5F, -5.5F);
		gunModel[3].rotateAngleZ = -0.34906585F;

		gunModel[4].addShapeBox(0F, -9F, 0F, 12, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		gunModel[4].setRotationPoint(-22.5F, 56.5F, 4.5F);
		gunModel[4].rotateAngleZ = -0.34906585F;

		gunModel[5].addShapeBox(-1F, -9F, 0F, 1, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 491
		gunModel[5].setRotationPoint(-22.5F, 56.5F, -4.5F);
		gunModel[5].rotateAngleZ = -0.34906585F;

		gunModel[6].addShapeBox(12F, -9F, 0F, 1, 9, 9, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 492
		gunModel[6].setRotationPoint(-22.5F, 56.5F, -4.5F);
		gunModel[6].rotateAngleZ = -0.34906585F;

		gunModel[7].addShapeBox(3F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		gunModel[7].setRotationPoint(-22.5F, 56.5F, 4.5F);
		gunModel[7].rotateAngleZ = -0.34906585F;

		gunModel[8].addShapeBox(4F, 7F, 0F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 494
		gunModel[8].setRotationPoint(-22.5F, 56.5F, 4.5F);
		gunModel[8].rotateAngleZ = -0.34906585F;

		gunModel[9].addShapeBox(4F, 7F, 0F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 495
		gunModel[9].setRotationPoint(-22.5F, 56.5F, -5.5F);
		gunModel[9].rotateAngleZ = -0.34906585F;

		gunModel[10].addShapeBox(3F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		gunModel[10].setRotationPoint(-22.5F, 56.5F, -5.5F);
		gunModel[10].rotateAngleZ = -0.34906585F;

		gunModel[11].addShapeBox(4F, 9F, 0F, 4, 1, 7, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		gunModel[11].setRotationPoint(-22.5F, 56.5F, -3.5F);
		gunModel[11].rotateAngleZ = -0.34906585F;

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		flipAll();
	}
}