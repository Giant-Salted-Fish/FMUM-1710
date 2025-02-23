//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HitBox1
// Model Creator: 
// Created on: 02.01.2020 - 20:29:24
// Last changed on: 02.01.2020 - 20:29:24

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHitBox1 extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelHitBox1() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[1];
		attachmentModel[0] = new ModelRendererTurbo(this, 3, 5, textureX, textureY); // Box 64

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 12, 12, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		attachmentModel[0].setRotationPoint(-6F, -12F, -8F);

		flipAll();
	}
}