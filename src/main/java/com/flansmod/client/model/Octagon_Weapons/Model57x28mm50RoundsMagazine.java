//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 5.7x28mm 50 Rounds Magazine
// Model Creator: 
// Created on: 09.07.2019 - 14:05:25
// Last changed on: 09.07.2019 - 14:05:25

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model57x28mm50RoundsMagazine extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public Model57x28mm50RoundsMagazine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 120
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 121
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 122
		gunModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 129
		gunModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 295
		gunModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 344
		gunModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 345
		gunModel[7] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 346
		gunModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 378
		gunModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 379
		gunModel[10] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 380
		gunModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 381

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[0].setRotationPoint(-1.5F, -8F, -5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gunModel[1].setRotationPoint(-2.5F, -8F, -5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 66, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		gunModel[2].setRotationPoint(-68.5F, -7F, -5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 1F, 0F, 1F); // Box 129
		gunModel[3].setRotationPoint(-3.5F, -1F, -0.999999999999997F);
		gunModel[3].rotateAngleZ = -1.57079633F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0.5F); // Box 295
		gunModel[4].setRotationPoint(-73.5F, -1F, -5.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		gunModel[5].setRotationPoint(-73.5F, -7F, -6F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 345
		gunModel[6].setRotationPoint(-77.5F, -7F, -6F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 346
		gunModel[7].setRotationPoint(-69.5F, -7F, -6F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		gunModel[8].setRotationPoint(-73.5F, -1F, 2.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		gunModel[9].setRotationPoint(-77F, -1F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		gunModel[10].setRotationPoint(-77F, -1F, 1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 1F, 0F, 1F, -1F, 0F, 0F, -1F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 381
		gunModel[11].setRotationPoint(-3.5F, -1F, -0.999999999999997F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		flipAll();
	}
}