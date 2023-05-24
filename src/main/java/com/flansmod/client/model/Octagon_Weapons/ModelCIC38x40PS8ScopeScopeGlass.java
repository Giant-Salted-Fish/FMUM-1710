//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC 3-8x40 PS-8 Scope Scope Glass
// Model Creator: 
// Created on: 27.10.2019 - 16:45:48
// Last changed on: 27.10.2019 - 16:45:48

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCIC38x40PS8ScopeScopeGlass extends ModelDefault //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCIC38x40PS8ScopeScopeGlass() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[3];
		defaultModel[0] = new ModelRendererTurbo(this, 6, -444, textureX, textureY); // Box 172
		defaultModel[1] = new ModelRendererTurbo(this, 56, -394, textureX, textureY); // Box 173
		defaultModel[2] = new ModelRendererTurbo(this, 56, 56, textureX, textureY); // Box 131

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 400, 500, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		defaultModel[0].setRotationPoint(0F, -200F, -250F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 50, 400, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		defaultModel[1].setRotationPoint(0F, -250F, -200F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 50, 400, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		defaultModel[2].setRotationPoint(0F, 200F, -200F);

		flipAllBy(false, false, true);
	}
}