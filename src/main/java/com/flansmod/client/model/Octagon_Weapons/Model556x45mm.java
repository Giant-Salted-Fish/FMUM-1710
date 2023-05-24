//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 5.56x45mm
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model556x45mm extends ModelDefault //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Model556x45mm() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[27];
		defaultModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
		defaultModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 102
		defaultModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 103
		defaultModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 104
		defaultModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 105
		defaultModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 106
		defaultModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 107
		defaultModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 108
		defaultModel[8] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 110
		defaultModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 111
		defaultModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 112
		defaultModel[11] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 113
		defaultModel[12] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 114
		defaultModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 115
		defaultModel[14] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 116
		defaultModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 117
		defaultModel[16] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 118
		defaultModel[17] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 119
		defaultModel[18] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 120
		defaultModel[19] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 121
		defaultModel[20] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 122
		defaultModel[21] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		defaultModel[22] = new ModelRendererTurbo(this, 7, 13, textureX, textureY); // Box 97
		defaultModel[23] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 98
		defaultModel[24] = new ModelRendererTurbo(this, 19, 13, textureX, textureY); // Box 100
		defaultModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 102
		defaultModel[26] = new ModelRendererTurbo(this, 13, 13, textureX, textureY); // Box 103

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 101
		defaultModel[0].setRotationPoint(11.5F, -0.75F, -0.25F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 102
		defaultModel[1].setRotationPoint(10.5F, -0.75F, -0.25F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 103
		defaultModel[2].setRotationPoint(10.5F, -0.25F, -0.75F);

		defaultModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 104
		defaultModel[3].setRotationPoint(11.5F, -0.25F, -0.75F);

		defaultModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		defaultModel[4].setRotationPoint(11.5F, -0.25F, -0.25F);

		defaultModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 106
		defaultModel[5].setRotationPoint(10.5F, -0.25F, -0.25F);

		defaultModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.425F, -0.325F, -0.75F, -0.35F, -0.15F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, -0.65F, -0.65F, 0.5F, -0.65F, -0.15F, 0F, 0F, 0F); // Box 107
		defaultModel[6].setRotationPoint(12.5F, -0.25F, -0.75F);

		defaultModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, -0.75F, -0.325F, -0.575F, -0.75F, -0.325F, -0.075F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.35F, -0.65F, 0.5F, -0.35F, -0.15F, 0F, -0.5F, 0F); // Box 108
		defaultModel[7].setRotationPoint(12.5F, -0.75F, -0.75F);

		defaultModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, -0.65F, -0.15F, 0.5F, -0.65F, -0.65F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.35F, -0.15F, -0.75F, -0.425F, -0.325F, 0F, -0.5F, 0F); // Box 110
		defaultModel[8].setRotationPoint(12.5F, -0.75F, -0.25F);

		defaultModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, -0.15F, -0.65F, 0.5F, -0.15F, -0.15F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0.5F, -0.65F, -0.65F, 0.5F, -0.65F, -0.15F, 0F, -0.5F, 0.5F); // Box 111
		defaultModel[9].setRotationPoint(12.5F, -0.25F, -0.75F);

		defaultModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -0.75F, 0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0.25F); // Box 112
		defaultModel[10].setRotationPoint(9.5F, -0.75F, -0.25F);

		defaultModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0.75F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.75F); // Box 113
		defaultModel[11].setRotationPoint(9.5F, -0.25F, -0.75F);

		defaultModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F); // Box 114
		defaultModel[12].setRotationPoint(9.5F, -0.25F, -0.25F);

		defaultModel[13].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 115
		defaultModel[13].setRotationPoint(1F, -0.5F, -1F);

		defaultModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 116
		defaultModel[14].setRotationPoint(1F, -1.5F, -0.5F);

		defaultModel[15].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		defaultModel[15].setRotationPoint(1F, 0.5F, -0.5F);

		defaultModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 118
		defaultModel[16].setRotationPoint(0F, -1.5F, -0.5F);

		defaultModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
		defaultModel[17].setRotationPoint(0.5F, -0.75F, -0.25F);

		defaultModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 120
		defaultModel[18].setRotationPoint(0.5F, -0.25F, -0.75F);

		defaultModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		defaultModel[19].setRotationPoint(0.5F, -0.25F, -0.25F);

		defaultModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 122
		defaultModel[20].setRotationPoint(0F, 0.5F, -0.5F);

		defaultModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
		defaultModel[21].setRotationPoint(0F, -0.5F, -1F);

		defaultModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.09F, -0.39F, 0F, -0.15F, -0.64F, 0F, -0.15F, -0.14F, 0F, -0.09F, 0.11F, 0F, -0.59F, -0.39F, 0F, -0.65F, -0.64F, 0F, -0.65F, -0.14F, 0F, -0.59F, 0.11F); // Box 97
		defaultModel[22].setRotationPoint(14.01F, -0.25F, -0.75F);

		defaultModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.09F, -0.59F, 0F, -0.34F, -0.65F, 0F, -0.34F, -0.15F, 0F, -0.09F, -0.09F, 0F, -0.71F, -0.39F, 0F, -0.65F, -0.64F, 0F, -0.65F, -0.14F, 0F, -0.71F, 0.11F); // Box 98
		defaultModel[23].setRotationPoint(14.01F, -0.45F, -0.75F);

		defaultModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 100
		defaultModel[24].setRotationPoint(-0.01F, -0.5F, -0.5F);

		defaultModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.35F, -0.15F, 0.5F, -0.35F, -0.65F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, -0.325F, -0.075F, -0.75F, -0.325F, -0.575F, 0F, 0F, -0.5F); // Box 102
		defaultModel[25].setRotationPoint(12.5F, -0.25F, -0.25F);

		defaultModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.71F, -0.39F, 0F, -0.65F, -0.64F, 0F, -0.65F, -0.14F, 0F, -0.71F, 0.11F, 0F, -0.09F, -0.59F, 0F, -0.34F, -0.65F, 0F, -0.34F, -0.15F, 0F, -0.09F, -0.09F); // Box 103
		defaultModel[26].setRotationPoint(14.01F, -0.55F, -0.75F);
	}
}