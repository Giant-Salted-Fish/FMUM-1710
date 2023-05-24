//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Default Muzzle Flash
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelDefaultMuzzleFlash extends ModelDefault //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDefaultMuzzleFlash() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[7];
		defaultModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 519
		defaultModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 520
		defaultModel[2] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 521
		defaultModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 522
		defaultModel[4] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 523
		defaultModel[5] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 524
		defaultModel[6] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 525

		defaultModel[0].addShapeBox(0F, -30F, -0.5F, 120, 60, 1, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F); // Box 519
		defaultModel[0].setRotationPoint(-5F, 0F, 0F);

		defaultModel[1].addShapeBox(0F, -30F, -0.5F, 120, 60, 1, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F); // Box 520
		defaultModel[1].setRotationPoint(-5F, 0F, 0F);
		defaultModel[1].rotateAngleX = 1.57079633F;

		defaultModel[2].addShapeBox(5F, -30F, -30F, 1, 60, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		defaultModel[2].setRotationPoint(-5F, 0F, 0F);

		defaultModel[3].addShapeBox(30F, -30F, -30F, 1, 60, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		defaultModel[3].setRotationPoint(-5F, 0F, 0F);

		defaultModel[4].addShapeBox(60F, -30F, -30F, 1, 60, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		defaultModel[4].setRotationPoint(-5F, 0F, 0F);

		defaultModel[5].addShapeBox(90F, -30F, -30F, 1, 60, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		defaultModel[5].setRotationPoint(-5F, 0F, 0F);

		defaultModel[6].addShapeBox(115F, -30F, -30F, 1, 60, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		defaultModel[6].setRotationPoint(-5F, 0F, 0F);

		flipAll();
	}
}