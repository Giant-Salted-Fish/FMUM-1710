//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Aimpoint Micro T-1
// Model Creator: 
// Created on: 27.10.2019 - 17:33:29
// Last changed on: 27.10.2019 - 17:33:29

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAtSight;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAimpointMicroT1 extends ModelAtSight //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelAimpointMicroT1() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[43];
		attachmentModel[0] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 4
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		attachmentModel[2] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 6
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 7
		attachmentModel[4] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 11
		attachmentModel[5] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 12
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 15
		attachmentModel[8] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 16
		attachmentModel[9] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 19
		attachmentModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 20
		attachmentModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 27
		attachmentModel[12] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 28
		attachmentModel[13] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 29
		attachmentModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 30
		attachmentModel[15] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 31
		attachmentModel[16] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 32
		attachmentModel[17] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 33
		attachmentModel[18] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 34
		attachmentModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 35
		attachmentModel[20] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 36
		attachmentModel[21] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 37
		attachmentModel[22] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 38
		attachmentModel[23] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 39
		attachmentModel[24] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 40
		attachmentModel[25] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 41
		attachmentModel[26] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 42
		attachmentModel[27] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 43
		attachmentModel[28] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 44
		attachmentModel[29] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 54
		attachmentModel[30] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 50
		attachmentModel[31] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 51
		attachmentModel[32] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 52
		attachmentModel[33] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 53
		attachmentModel[34] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 50
		attachmentModel[35] = new ModelRendererTurbo(this, 122, 57, textureX, textureY); // Box 51
		attachmentModel[36] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 52
		attachmentModel[37] = new ModelRendererTurbo(this, 110, 79, textureX, textureY); // Box 53
		attachmentModel[38] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 54
		attachmentModel[39] = new ModelRendererTurbo(this, 117, 79, textureX, textureY); // Box 55
		attachmentModel[40] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 54
		attachmentModel[41] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 56
		attachmentModel[42] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 57

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		attachmentModel[0].setRotationPoint(-9F, -1.5F, -2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		attachmentModel[1].setRotationPoint(-9F, -6.5F, -4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		attachmentModel[2].setRotationPoint(-9F, -6.5F, 3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		attachmentModel[3].setRotationPoint(-9F, -8.5F, -2F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 11
		attachmentModel[4].setRotationPoint(-9F, -2.5F, -3F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 12
		attachmentModel[5].setRotationPoint(-7F, -9.5F, -2F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 2F); // Box 13
		attachmentModel[6].setRotationPoint(-7F, -9.5F, 2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 15
		attachmentModel[7].setRotationPoint(-7F, -6.5F, -5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		attachmentModel[8].setRotationPoint(-7F, -6.5F, 4F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 19
		attachmentModel[9].setRotationPoint(-7F, -1.5F, -5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 20
		attachmentModel[10].setRotationPoint(-8F, -2.5F, -4F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 27
		attachmentModel[11].setRotationPoint(-6F, -11F, -2F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		attachmentModel[12].setRotationPoint(-5F, -11F, -2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 29
		attachmentModel[13].setRotationPoint(-3F, -11F, -2F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		attachmentModel[14].setRotationPoint(-7F, -5.5F, -5F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		attachmentModel[15].setRotationPoint(-6F, -5.5F, -6F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 32
		attachmentModel[16].setRotationPoint(-6F, -6.5F, -6F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
		attachmentModel[17].setRotationPoint(-6F, -3.5F, -6F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 34
		attachmentModel[18].setRotationPoint(-0.5F, -8.5F, -5F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 35
		attachmentModel[19].setRotationPoint(1F, -8F, -5.5F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		attachmentModel[20].setRotationPoint(1F, -3F, -5.5F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		attachmentModel[21].setRotationPoint(-1F, -6F, -5.5F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		attachmentModel[22].setRotationPoint(-1.5F, -8.5F, -7.5F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 39
		attachmentModel[23].setRotationPoint(-1.5F, -2.5F, -7.5F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 40
		attachmentModel[24].setRotationPoint(-1.5F, -4F, -7.5F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 41
		attachmentModel[25].setRotationPoint(-1.5F, -6.5F, -7.5F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		attachmentModel[26].setRotationPoint(-1.5F, -5F, -7.5F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		attachmentModel[27].setRotationPoint(5.5F, -5F, -7.5F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		attachmentModel[28].setRotationPoint(-0.5F, -5F, -7F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 1.5F, 0.01F, 0F, 1.5F, 0.01F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 54
		attachmentModel[29].setRotationPoint(-7F, -10.5F, -1.5F);

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 50
		attachmentModel[30].setRotationPoint(-9F, -8.5F, -3F);

		attachmentModel[31].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 51
		attachmentModel[31].setRotationPoint(-9F, -8.5F, 2F);

		attachmentModel[32].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 52
		attachmentModel[32].setRotationPoint(-9F, -2.5F, 2F);

		attachmentModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 53
		attachmentModel[33].setRotationPoint(-6F, -9.5F, -2F);

		attachmentModel[34].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 50
		attachmentModel[34].setRotationPoint(-2F, -10.5F, -1.5F);

		attachmentModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 2F); // Box 51
		attachmentModel[35].setRotationPoint(6F, -9.5F, 2F);

		attachmentModel[36].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		attachmentModel[36].setRotationPoint(-7F, -8.5F, 4F);

		attachmentModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, 1F, 0F, -2F); // Box 53
		attachmentModel[37].setRotationPoint(-7F, -9.5F, -3F);

		attachmentModel[38].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		attachmentModel[38].setRotationPoint(-7F, -8.5F, -5F);

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, -2F, -1F, 0F, -2F); // Box 55
		attachmentModel[39].setRotationPoint(6F, -9.5F, -3F);

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		attachmentModel[40].setRotationPoint(-7.5F, -0.5F, -2F);

		attachmentModel[41].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		attachmentModel[41].setRotationPoint(-8F, -2.5F, 3F);

		attachmentModel[42].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 57
		attachmentModel[42].setRotationPoint(-7F, -1.5F, 4F);

		pupilRefCenter.set(4F / 16F, 4.5F / 16F, 0F);
		reticleAt[0].set(4096F, 4.5F / 160F, 0F);
		reticleScale = 0.15F;

		reticleBorder = new Vector3f[6];
		reticleBorder[0] = new Vector3f(0F, 6.5F / 160F, -3F / 160F);
		reticleBorder[1] = new Vector3f(0F, 7.5F / 160F, -2F / 160F);
		reticleBorder[2] = new Vector3f(0F, 7.5F / 160F, 2F / 160F);
		reticleBorder[3] = new Vector3f(0F, 6.5F / 160F, 3F / 160F);
		reticleBorder[4] = new Vector3f(0F, 1.5F / 160F, 3F / 160F);
		reticleBorder[5] = new Vector3f(0F, 1.5F / 160F, -3F / 160F);

		flipAll();
	}
}