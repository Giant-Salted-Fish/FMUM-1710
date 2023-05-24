//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 7.62x51mm
// Model Creator: 
// Created on: 02.01.2020 - 20:29:24
// Last changed on: 02.01.2020 - 20:29:24

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model762x51mm extends ModelDefault //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Model762x51mm() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[25];
		defaultModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		defaultModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 19
		defaultModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
		defaultModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 21
		defaultModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 22
		defaultModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 23
		defaultModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 24
		defaultModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 25
		defaultModel[8] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 26
		defaultModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 27
		defaultModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		defaultModel[11] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 29
		defaultModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 30
		defaultModel[13] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 31
		defaultModel[14] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 32
		defaultModel[15] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 33
		defaultModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 34
		defaultModel[17] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 35
		defaultModel[18] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 36
		defaultModel[19] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 37
		defaultModel[20] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 38
		defaultModel[21] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 59
		defaultModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 60
		defaultModel[23] = new ModelRendererTurbo(this, 19, 33, textureX, textureY); // Box 62
		defaultModel[24] = new ModelRendererTurbo(this, 10, 33, textureX, textureY); // Box 64

		defaultModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		defaultModel[0].setRotationPoint(1F, -0.5F, -1.5F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
		defaultModel[1].setRotationPoint(1F, -1.5F, -0.5F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		defaultModel[2].setRotationPoint(1F, 0.5F, -0.5F);

		defaultModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 21
		defaultModel[3].setRotationPoint(0F, -0.5F, -1.5F);

		defaultModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F); // Box 22
		defaultModel[4].setRotationPoint(0F, -1.5F, -0.5F);

		defaultModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		defaultModel[5].setRotationPoint(0F, 0.5F, -0.5F);

		defaultModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 24
		defaultModel[6].setRotationPoint(13F, -0.5F, -1F);

		defaultModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 25
		defaultModel[7].setRotationPoint(13F, -1F, -0.5F);

		defaultModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 26
		defaultModel[8].setRotationPoint(13F, 0F, -0.5F);

		defaultModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 1F); // Box 27
		defaultModel[9].setRotationPoint(11F, -1F, -0.5F);

		defaultModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 28
		defaultModel[10].setRotationPoint(11F, 0F, -0.5F);

		defaultModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F); // Box 29
		defaultModel[11].setRotationPoint(11F, -0.5F, -1F);

		defaultModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 30
		defaultModel[12].setRotationPoint(14F, -1F, -0.5F);

		defaultModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		defaultModel[13].setRotationPoint(14F, -0.5F, -1F);

		defaultModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		defaultModel[14].setRotationPoint(14F, 0F, -0.5F);

		defaultModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0.5F, -0.4F, -0.8F, 0.5F, -0.4F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.4F, -0.8F, 0.5F, -0.4F, -0.8F, 0F, 0F, 0F); // Box 33
		defaultModel[15].setRotationPoint(16F, -0.5F, -1F);

		defaultModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0.5F, -0.8F, -0.4F, 0.5F, -0.8F, -0.4F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F, 0F, -0.5F, 0.5F); // Box 34
		defaultModel[16].setRotationPoint(16F, -1F, -0.5F);

		defaultModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0.5F, -0.8F, -0.4F, 0.5F, -0.8F, -0.4F, 0F, 0F, 0F); // Box 35
		defaultModel[17].setRotationPoint(16F, 0F, -0.5F);

		defaultModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 36
		defaultModel[18].setRotationPoint(0.5F, -1F, -0.5F);

		defaultModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		defaultModel[19].setRotationPoint(0.5F, -0.5F, -1F);

		defaultModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		defaultModel[20].setRotationPoint(0.5F, 0F, -0.5F);

		defaultModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
		defaultModel[21].setRotationPoint(-0.01F, -0.5F, -0.5F);

		defaultModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2286F, -0.4571F, 0.5F, -0.4F, -0.8F, 0.5F, -0.4F, -0.8F, 0F, -0.2286F, -0.4571F, 0F, -0.2286F, -0.4571F, 0.5F, -0.4F, -0.8F, 0.5F, -0.4F, -0.8F, 0F, -0.2286F, -0.4571F); // Box 60
		defaultModel[22].setRotationPoint(18.01F, -0.5F, -1F);

		defaultModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.0571F, -0.7286F, 0.5F, -0.4F, -0.9F, 0.5F, -0.4F, -0.9F, 0F, -0.0571F, -0.7286F, 0F, -0.6714F, -0.4571F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0F, -0.6714F, -0.4571F); // Box 62
		defaultModel[23].setRotationPoint(18.01F, -0.6F, -1F);

		defaultModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.6714F, -0.4571F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0F, -0.6714F, -0.4571F, 0F, -0.0571F, -0.7286F, 0.5F, -0.4F, -0.9F, 0.5F, -0.4F, -0.9F, 0F, -0.0571F, -0.7286F); // Box 64
		defaultModel[24].setRotationPoint(18.01F, -0.4F, -1F);

		flipAll();
	}
}