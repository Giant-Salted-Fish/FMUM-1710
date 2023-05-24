//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Steak Knife
// Model Creator: 
// Created on: 02.01.2020 - 20:29:24
// Last changed on: 02.01.2020 - 20:29:24

package com.flansmod.client.model.Octagon_Special_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSteakKnife extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelSteakKnife() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 65
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 43
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 44
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 46
		gunModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 47
		gunModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 48
		gunModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 10

		gunModel[0].addShapeBox(2F, 0F, -0.5F, 2, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F); // Box 65
		gunModel[0].setRotationPoint(-2F, -24F, 0F);
		gunModel[0].rotateAngleZ = 1.57079633F;

		gunModel[1].addShapeBox(-32F, 1F, -1F, 32, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 43
		gunModel[1].setRotationPoint(-2F, -24F, 0F);
		gunModel[1].rotateAngleZ = 1.57079633F;

		gunModel[2].addShapeBox(4F, 0F, -0.5F, 3, 4, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 44
		gunModel[2].setRotationPoint(-2F, -24F, 0F);
		gunModel[2].rotateAngleZ = 1.57079633F;

		gunModel[3].addShapeBox(7F, 0F, -0.5F, 18, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F); // Box 45
		gunModel[3].setRotationPoint(-2F, -24F, 0F);
		gunModel[3].rotateAngleZ = 1.57079633F;

		gunModel[4].addShapeBox(25F, 0F, -0.5F, 4, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F); // Box 46
		gunModel[4].setRotationPoint(-2F, -24F, 0F);
		gunModel[4].rotateAngleZ = 1.57079633F;

		gunModel[5].addShapeBox(29F, 0F, -0.5F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F); // Box 47
		gunModel[5].setRotationPoint(-2F, -24F, 0F);
		gunModel[5].rotateAngleZ = 1.57079633F;

		gunModel[6].addShapeBox(0F, 1F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F); // Box 48
		gunModel[6].setRotationPoint(-2F, -24F, 0F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addShapeBox(-32F, 0F, -1F, 32, 1, 1, 0F, 0F, 0.5F, 0F, 1.3333F, 0F, 0F, 1.3333F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F); // Box 7
		gunModel[7].setRotationPoint(-2F, -24F, 0.5F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addShapeBox(-32F, 2F, -1F, 32, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 1.3333F, 0F, 0F, 1.3333F, 0F, 0F, 0F, 0.5F, 0F); // Box 8
		gunModel[8].setRotationPoint(-2F, -24F, 0.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addShapeBox(0F, 0F, -0.5F, 2, 1, 1, 0F, -1.3333F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.3333F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F); // Box 9
		gunModel[9].setRotationPoint(-2F, -24F, 0F);
		gunModel[9].rotateAngleZ = 1.57079633F;

		gunModel[10].addShapeBox(0F, 2F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.3333F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.3333F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(-2F, -24F, 0F);
		gunModel[10].rotateAngleZ = 1.57079633F;

		holdingTranslate.set(40F / 160F, 5F / 160F, 30F / 160F);
		holdingRotate.set(-10F, 10F, 10F);

		rightArmPos.set(-0.5F / 160F, 0F / 160F, 0F / 160F);
		rightArmRot.set(0F, 0F, 0F);

		flipAll();
	}
}