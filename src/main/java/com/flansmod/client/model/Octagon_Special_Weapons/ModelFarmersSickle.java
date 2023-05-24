//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Farmer's Sickle
// Model Creator: 
// Created on: 02.01.2020 - 20:29:24
// Last changed on: 02.01.2020 - 20:29:24

package com.flansmod.client.model.Octagon_Special_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFarmersSickle extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelFarmersSickle() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[42];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 619
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 65
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 67
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 68
		gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 69
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 70
		gunModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 71
		gunModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 72
		gunModel[8] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 73
		gunModel[9] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 74
		gunModel[10] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 75
		gunModel[11] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 76
		gunModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 77
		gunModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 78
		gunModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 79
		gunModel[15] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 80
		gunModel[16] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 81
		gunModel[17] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 82
		gunModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 83
		gunModel[19] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 84
		gunModel[20] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 85
		gunModel[21] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 86
		gunModel[22] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 87
		gunModel[23] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 88
		gunModel[24] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 89
		gunModel[25] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 90
		gunModel[26] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 91
		gunModel[27] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 92
		gunModel[28] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 93
		gunModel[29] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 94
		gunModel[30] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 95
		gunModel[31] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 96
		gunModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 97
		gunModel[33] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 98
		gunModel[34] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 99
		gunModel[35] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 100
		gunModel[36] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 101
		gunModel[37] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 102
		gunModel[38] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 103
		gunModel[39] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 104
		gunModel[40] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 105
		gunModel[41] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 106

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 619
		gunModel[0].setRotationPoint(-4F, -17.5F, -0.25F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[1].setRotationPoint(-4F, -6.5F, -2.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 67
		gunModel[2].setRotationPoint(-4F, -2.5F, -2.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[3].setRotationPoint(-4F, 2.5F, -3.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 69
		gunModel[4].setRotationPoint(-4F, 7.5F, -2.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 70
		gunModel[5].setRotationPoint(-1F, 2.5F, -1.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 71
		gunModel[6].setRotationPoint(-6F, 2.5F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, 0F); // Box 72
		gunModel[7].setRotationPoint(-1F, 7.5F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -1F); // Box 73
		gunModel[8].setRotationPoint(-6F, 7.5F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 74
		gunModel[9].setRotationPoint(-1F, -6.5F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 75
		gunModel[10].setRotationPoint(-5F, -6.5F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 76
		gunModel[11].setRotationPoint(-1F, -2.5F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 77
		gunModel[12].setRotationPoint(-6F, -2.5F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[13].setRotationPoint(-4F, -12.5F, -3.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 79
		gunModel[14].setRotationPoint(-1F, -12.5F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 80
		gunModel[15].setRotationPoint(-6F, -12.5F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F); // Box 81
		gunModel[16].setRotationPoint(-1F, -11.5F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[17].setRotationPoint(-4F, -11.5F, -2.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F); // Box 83
		gunModel[18].setRotationPoint(-6F, -11.5F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 84
		gunModel[19].setRotationPoint(-4F, -13.5F, -2.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 85
		gunModel[20].setRotationPoint(-1F, -13.5F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 86
		gunModel[21].setRotationPoint(-6F, -13.5F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 87
		gunModel[22].setRotationPoint(-1F, -15.5F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		gunModel[23].setRotationPoint(-4F, -15.5F, -2.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 89
		gunModel[24].setRotationPoint(-5F, -15.5F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F); // Box 90
		gunModel[25].setRotationPoint(-4F, -18.5F, -0.25F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, -1F, 0F, -0.5F); // Box 91
		gunModel[26].setRotationPoint(-5F, -18.5F, -0.25F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.5F, -1F, 0F, -1.5F, 2.5F, 0F, -1.5F, 2.5F, -0.5F, 0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.5F, -0.5F, 0F, -0.5F); // Box 92
		gunModel[27].setRotationPoint(-6F, -20.5F, -0.25F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -2.5F, 0F, -1F, 1F, 0F, -1F, 1F, -0.5F, 0F, -2.5F, -0.5F, -4.5F, 2F, 0F, 2.5F, -1.5F, 0F, 2.5F, -1.5F, -0.5F, -4.5F, 2F, -0.5F); // Box 93
		gunModel[28].setRotationPoint(-11F, -27.5F, -0.25F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, -0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, -0.5F, -0.5F, -1F, -0.5F, -3F, 1.5F, 0F, 2F, -2F, 0F, 2F, -2F, -0.5F, -3F, 1.5F, -0.5F); // Box 94
		gunModel[29].setRotationPoint(-14F, -31.5F, -0.25F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 95
		gunModel[30].setRotationPoint(-14F, -37.5F, -0.25F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.5F, -0.5F, 1F, -0.5F); // Box 96
		gunModel[31].setRotationPoint(-14F, -34.5F, -0.25F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, -0.5F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 97
		gunModel[32].setRotationPoint(-14F, -41.5F, -0.25F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, -1.5F, 1F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, -0.5F, -1.5F, 1F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 98
		gunModel[33].setRotationPoint(-13F, -46.5F, -0.25F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, -2.5F, 0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, -0.5F, -2.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F); // Box 99
		gunModel[34].setRotationPoint(-11F, -51.5F, -0.25F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, -3.5F, 0.5F, 0F, 3.5F, -1.5F, 0F, 3.5F, -1.5F, -0.5F, -3.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.5F, 0F, -0.5F); // Box 100
		gunModel[35].setRotationPoint(-8F, -56F, -0.25F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, -3.5F, -0.5F, 0F, 5.5F, -1.5F, 0F, 5.5F, -1.5F, -0.5F, -3.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 101
		gunModel[36].setRotationPoint(-4F, -60F, -0.25F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 5.5F, -3.5F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 5.5F, -3.5F, -0.5F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 102
		gunModel[37].setRotationPoint(5F, -63F, -0.25F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 3F, -3F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -0.5F, 3F, -3F, -0.5F, -0.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 1.5F, -0.5F); // Box 103
		gunModel[38].setRotationPoint(9F, -66F, -0.25F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, -0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, -0.5F, 0.5F, 0F, -0.5F); // Box 104
		gunModel[39].setRotationPoint(14F, -66F, -0.25F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 105
		gunModel[40].setRotationPoint(21F, -67F, -0.25F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0.01F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 106
		gunModel[41].setRotationPoint(26F, -67F, -0.25F);

		holdingTranslate.set(40F / 160F, 5F / 160F, 50F / 160F);
		holdingRotate.set(-10F, 5F, 10F);

		rightArmPos.set(-0.5F / 160F, 0F / 160F, 0F / 160F);
		rightArmRot.set(0F, 0F, 0F);

		flipAll();
	}
}