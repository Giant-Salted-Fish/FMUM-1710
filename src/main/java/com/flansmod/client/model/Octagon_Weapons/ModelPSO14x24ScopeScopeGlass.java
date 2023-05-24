//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PSO-1 4x24 Scope Scope Glass
// Model Creator: 
// Created on: 22.12.2019 - 13:22:03
// Last changed on: 22.12.2019 - 13:22:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPSO14x24ScopeScopeGlass extends ModelDefault //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSO14x24ScopeScopeGlass() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[3];
		defaultModel[0] = new ModelRendererTurbo(this, 81, -219, textureX, textureY); // Box 108
		defaultModel[1] = new ModelRendererTurbo(this, 131, -169, textureX, textureY); // Box 109
		defaultModel[2] = new ModelRendererTurbo(this, 131, 131, textureX, textureY); // Box 111

		defaultModel[0].addShapeBox(0F, -125F, -175F, 1, 250, 350, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		defaultModel[0].setRotationPoint(0F, 0F, 0F);

		defaultModel[1].addShapeBox(0F, -175F, -125F, 1, 50, 250, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		defaultModel[1].setRotationPoint(0F, 0F, 0F);

		defaultModel[2].addShapeBox(0F, 125F, -125F, 1, 50, 250, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		defaultModel[2].setRotationPoint(0F, 0F, 0F);

		flipAllBy(false, false, true);
	}
}