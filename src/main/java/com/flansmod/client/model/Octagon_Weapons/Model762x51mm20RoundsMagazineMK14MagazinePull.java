//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 7.62x51mm 20 Rounds Magazine - MK14 & Magazine Pull
// Model Creator: 
// Created on: 02.08.2019 - 09:42:40
// Last changed on: 02.08.2019 - 09:42:40

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model762x51mm20RoundsMagazineMK14MagazinePull extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Model762x51mm20RoundsMagazineMK14MagazinePull() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 582
		gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1028
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1029
		gunModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1030
		gunModel[4] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 1031
		gunModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1032
		gunModel[6] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 1033
		gunModel[7] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 1034
		gunModel[8] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 1035
		gunModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1036
		gunModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1037
		gunModel[11] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 1038
		gunModel[12] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 1039

		gunModel[0].addShapeBox(0F, 0F, 0F, 21, 39, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3.5F, 3F, 0F); // Box 582
		gunModel[0].setRotationPoint(0F, 0F, -2.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 42, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 4F, -0.2195F, 0F, 4F, -0.2195F, 0F, -3.5F, 0F, 0F); // Box 1028
		gunModel[1].setRotationPoint(0F, 0F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 10, 40, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 1.6341F, 0F, 4F, 0.0976F, 0F, 4F, 0.0976F, 0F, -3.5F, 1.6341F, 0F); // Box 1029
		gunModel[2].setRotationPoint(2.5F, 0F, -3F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 39, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0.8049F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3.5F, 0.8049F, 0F); // Box 1030
		gunModel[3].setRotationPoint(15F, 0F, -3F);

		gunModel[4].addShapeBox(0F, -9F, 0F, 21, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1031
		gunModel[4].setRotationPoint(3.35F, 42F, -4F);
		gunModel[4].rotateAngleZ = 0.08726646F;

		gunModel[5].addShapeBox(-1F, -9F, 0F, 1, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1032
		gunModel[5].setRotationPoint(3.35F, 42F, -3F);
		gunModel[5].rotateAngleZ = 0.08726646F;

		gunModel[6].addShapeBox(21F, -9F, 0F, 1, 9, 6, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1033
		gunModel[6].setRotationPoint(3.35F, 42F, -3F);
		gunModel[6].rotateAngleZ = 0.08726646F;

		gunModel[7].addShapeBox(0F, -9F, 0F, 21, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1034
		gunModel[7].setRotationPoint(3.35F, 42F, 3F);
		gunModel[7].rotateAngleZ = 0.08726646F;

		gunModel[8].addShapeBox(7.5F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1035
		gunModel[8].setRotationPoint(3.35F, 42F, 3F);
		gunModel[8].rotateAngleZ = 0.08726646F;

		gunModel[9].addShapeBox(8.5F, 7F, 0F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1036
		gunModel[9].setRotationPoint(3.35F, 42F, 3F);
		gunModel[9].rotateAngleZ = 0.08726646F;

		gunModel[10].addShapeBox(8.5F, 7F, 0F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 1037
		gunModel[10].setRotationPoint(3.35F, 42F, -4F);
		gunModel[10].rotateAngleZ = 0.08726646F;

		gunModel[11].addShapeBox(7.5F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1038
		gunModel[11].setRotationPoint(3.35F, 42F, -4F);
		gunModel[11].rotateAngleZ = 0.08726646F;

		gunModel[12].addShapeBox(8.5F, 9F, 2F, 4, 1, 4, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		gunModel[12].setRotationPoint(3.35F, 42F, -4F);
		gunModel[12].rotateAngleZ = 0.08726646F;

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		flipAll();
	}
}