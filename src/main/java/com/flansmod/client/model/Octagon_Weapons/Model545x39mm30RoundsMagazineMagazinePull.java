//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 5.45x39mm 30 Rounds Magazine & Magazine Pull
// Model Creator: 
// Created on: 15.09.2019 - 15:18:34
// Last changed on: 15.09.2019 - 15:18:34

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model545x39mm30RoundsMagazineMagazinePull extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Model545x39mm30RoundsMagazineMagazinePull() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[25];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 125
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 126
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 127
		gunModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 128
		gunModel[4] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 129
		gunModel[5] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 130
		gunModel[6] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 131
		gunModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 132
		gunModel[8] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 133
		gunModel[9] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 134
		gunModel[10] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 135
		gunModel[11] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 136
		gunModel[12] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 137
		gunModel[13] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 138
		gunModel[14] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 139
		gunModel[15] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 140
		gunModel[16] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 410
		gunModel[17] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 411
		gunModel[18] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 412
		gunModel[19] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 413
		gunModel[20] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 414
		gunModel[21] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 415
		gunModel[22] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 416
		gunModel[23] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 417
		gunModel[24] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 418

		gunModel[0].addShapeBox(0F, 0F, 0F, 13, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 125
		gunModel[0].setRotationPoint(2F, 0F, -3F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 13, 11, 6, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, 0F, 0F); // Box 126
		gunModel[1].setRotationPoint(2F, 5F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 13, 12, 6, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -4F, 1F, 0F); // Box 127
		gunModel[2].setRotationPoint(4F, 16F, -3F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 13, 11, 6, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -6F, 3F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, -6F, 3F, 0F); // Box 128
		gunModel[3].setRotationPoint(8F, 29F, -3F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 13, 11, 6, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 5F, -8F, 0F, 5F, -8F, 0F, -6F, 0F, 0F); // Box 129
		gunModel[4].setRotationPoint(14F, 43F, -3F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		gunModel[5].setRotationPoint(15F, 0F, -2F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 5, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 131
		gunModel[6].setRotationPoint(15F, 4F, -2F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 132
		gunModel[7].setRotationPoint(17F, 15F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 5, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 8F, 3F, 0F, 8F, 3F, 0F, -6F, 0F, 0F); // Box 133
		gunModel[8].setRotationPoint(21F, 27F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, -5F, 1F, 0F); // Box 134
		gunModel[9].setRotationPoint(27F, 39F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 5, 17, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 135
		gunModel[10].setRotationPoint(0F, 0F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 136
		gunModel[11].setRotationPoint(15F, 0F, -3F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F); // Box 137
		gunModel[12].setRotationPoint(15F, 4F, -3F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F); // Box 138
		gunModel[13].setRotationPoint(17F, 15F, -3F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, -1F, 6F, 0F, -1F, -6F, 0F, 0F); // Box 139
		gunModel[14].setRotationPoint(21F, 27F, -3F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 1F, 0F, 4.3F, 0F, -1F, 4.3F, 0F, -1F, -5F, 1F, 0F); // Box 140
		gunModel[15].setRotationPoint(27F, 39F, -3F);

		gunModel[16].addShapeBox(0F, -11F, 0F, 19, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		gunModel[16].setRotationPoint(20F, 54F, -4F);
		gunModel[16].rotateAngleZ = 0.50614548F;

		gunModel[17].addShapeBox(-1F, -11F, 0F, 1, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 411
		gunModel[17].setRotationPoint(20F, 54F, -3F);
		gunModel[17].rotateAngleZ = 0.50614548F;

		gunModel[18].addShapeBox(19F, -11F, 0F, 1, 9, 6, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 412
		gunModel[18].setRotationPoint(20F, 54F, -3F);
		gunModel[18].rotateAngleZ = 0.50614548F;

		gunModel[19].addShapeBox(0F, -11F, 0F, 19, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		gunModel[19].setRotationPoint(20F, 54F, 3F);
		gunModel[19].rotateAngleZ = 0.50614548F;

		gunModel[20].addShapeBox(6.5F, -2F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		gunModel[20].setRotationPoint(20F, 54F, 3F);
		gunModel[20].rotateAngleZ = 0.50614548F;

		gunModel[21].addShapeBox(7.5F, 5F, 0F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 415
		gunModel[21].setRotationPoint(20F, 54F, 3F);
		gunModel[21].rotateAngleZ = 0.50614548F;

		gunModel[22].addShapeBox(7.5F, 5F, 0F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 416
		gunModel[22].setRotationPoint(20F, 54F, -4F);
		gunModel[22].rotateAngleZ = 0.50614548F;

		gunModel[23].addShapeBox(6.5F, -2F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		gunModel[23].setRotationPoint(20F, 54F, -4F);
		gunModel[23].rotateAngleZ = 0.50614548F;

		gunModel[24].addShapeBox(7.5F, 7F, 0F, 4, 1, 4, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		gunModel[24].setRotationPoint(20F, 54F, -2F);
		gunModel[24].rotateAngleZ = 0.50614548F;

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		flipAll();
	}
}