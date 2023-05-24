//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kobra EKP-8M-PP - Dot
// Model Creator: 
// Created on: 27.10.2019 - 13:16:05
// Last changed on: 27.10.2019 - 13:16:05

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelKobraEKP8MPPDot extends ModelDefault //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelKobraEKP8MPPDot() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[8];
		defaultModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 43
		defaultModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 46
		defaultModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 47
		defaultModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
		defaultModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		defaultModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 9
		defaultModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		defaultModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8

		defaultModel[0].addShapeBox(0F, -0.2F, -0.2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 43
		defaultModel[0].setRotationPoint(0F, 0F, 0F);
		defaultModel[0].rotateAngleX = 0.78539816F;

		defaultModel[1].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 46
		defaultModel[1].setRotationPoint(0F, 0F, 0F);
		defaultModel[1].rotateAngleX = 0.78539816F;

		defaultModel[2].addShapeBox(0F, -0.3F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 47
		defaultModel[2].setRotationPoint(0F, 0F, 0F);
		defaultModel[2].rotateAngleX = 2.35619449F;

		defaultModel[3].addShapeBox(0F, -0.15F, -1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 7
		defaultModel[3].setRotationPoint(0F, 0F, 0F);
		defaultModel[3].rotateAngleX = -3.14159265F;

		defaultModel[4].addShapeBox(0F, -0.15F, -1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 8
		defaultModel[4].setRotationPoint(0F, 0F, 0F);

		defaultModel[5].addShapeBox(0F, -0.15F, -1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 9
		defaultModel[5].setRotationPoint(0F, 0F, 0F);
		defaultModel[5].rotateAngleX = 1.57079633F;

		defaultModel[6].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 7
		defaultModel[6].setRotationPoint(0F, 0.5F, 0F);
		defaultModel[6].rotateAngleX = 0.78539816F;

		defaultModel[7].addShapeBox(0F, -0.3F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 8
		defaultModel[7].setRotationPoint(0F, 0.5F, 0F);
		defaultModel[7].rotateAngleX = 2.35619449F;

		flipAll();
	}
}