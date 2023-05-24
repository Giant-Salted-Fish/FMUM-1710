//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC 3-8x40 PS-8 Scope
// Model Creator: 
// Created on: 27.10.2019 - 16:45:48
// Last changed on: 27.10.2019 - 16:45:48

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAtSight;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelCIC38x40PS8Scope extends ModelAtSight //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	private ModelRendererTurbo[] zoomStepModel;
	
	public ModelCIC38x40PS8Scope() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[65];
		attachmentModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 22
		attachmentModel[1] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 23
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		attachmentModel[3] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 37
		attachmentModel[4] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 38
		attachmentModel[5] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 39
		attachmentModel[6] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 40
		attachmentModel[7] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 41
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 42
		attachmentModel[9] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 43
		attachmentModel[10] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 44
		attachmentModel[11] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 45
		attachmentModel[12] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 47
		attachmentModel[13] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 48
		attachmentModel[14] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 52
		attachmentModel[15] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 53
		attachmentModel[16] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 54
		attachmentModel[17] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 56
		attachmentModel[18] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 61
		attachmentModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		attachmentModel[20] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 63
		attachmentModel[21] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 65
		attachmentModel[22] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 66
		attachmentModel[23] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 67
		attachmentModel[24] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 70
		attachmentModel[25] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 72
		attachmentModel[26] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 73
		attachmentModel[27] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 74
		attachmentModel[28] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 75
		attachmentModel[29] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 77
		attachmentModel[30] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 80
		attachmentModel[31] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 88
		attachmentModel[32] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 89
		attachmentModel[33] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 90
		attachmentModel[34] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 91
		attachmentModel[35] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 93
		attachmentModel[36] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 96
		attachmentModel[37] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 128
		attachmentModel[38] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 129
		attachmentModel[39] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 130
		attachmentModel[40] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 128
		attachmentModel[41] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 129
		attachmentModel[42] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 130
		attachmentModel[43] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 132
		attachmentModel[44] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 136
		attachmentModel[45] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 137
		attachmentModel[46] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 140
		attachmentModel[47] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 147
		attachmentModel[48] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 148
		attachmentModel[49] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 149
		attachmentModel[50] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 150
		attachmentModel[51] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 151
		attachmentModel[52] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 152
		attachmentModel[53] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 153
		attachmentModel[54] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 154
		attachmentModel[55] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 155
		attachmentModel[56] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 156
		attachmentModel[57] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 157
		attachmentModel[58] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 158
		attachmentModel[59] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 159
		attachmentModel[60] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 160
		attachmentModel[61] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 161
		attachmentModel[62] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 162
		attachmentModel[63] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 128
		attachmentModel[64] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 129

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 42, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 22
		attachmentModel[0].setRotationPoint(-27F, -4F, -2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 42, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		attachmentModel[1].setRotationPoint(-27F, 3F, -2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 42, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		attachmentModel[2].setRotationPoint(-27F, -2F, -4F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F); // Box 37
		attachmentModel[3].setRotationPoint(-6F, -6F, -2F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 38
		attachmentModel[4].setRotationPoint(-6F, 4F, -2F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, -2F); // Box 39
		attachmentModel[5].setRotationPoint(-6F, -2F, -6F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 40
		attachmentModel[6].setRotationPoint(-6F, -2F, 4F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, -2F, 3F, -2F, 0F, 3F, -2F, 0F); // Box 41
		attachmentModel[7].setRotationPoint(-6F, -6F, -6F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 3F, 0F, -2F, 3F, 0F, -2F); // Box 42
		attachmentModel[8].setRotationPoint(-6F, -6F, 2F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 43
		attachmentModel[9].setRotationPoint(-6F, 2F, 2F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 3F, 0F, -2F, 3F, 0F, -2F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		attachmentModel[10].setRotationPoint(-6F, 2F, -6F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		attachmentModel[11].setRotationPoint(-4F, -7F, -2F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		attachmentModel[12].setRotationPoint(-2F, -7F, 2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		attachmentModel[13].setRotationPoint(-4F, -2F, -7F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		attachmentModel[14].setRotationPoint(-4F, -2F, 6F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 53
		attachmentModel[15].setRotationPoint(-2F, -4F, -7F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		attachmentModel[16].setRotationPoint(-3F, -8F, -1F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		attachmentModel[17].setRotationPoint(-1F, -8F, 1F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		attachmentModel[18].setRotationPoint(-3F, -1F, 7F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 62
		attachmentModel[19].setRotationPoint(-1F, -3F, 7F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		attachmentModel[20].setRotationPoint(-4F, -12.5F, -2F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 65
		attachmentModel[21].setRotationPoint(-3F, -12.5F, 2F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		attachmentModel[22].setRotationPoint(-4F, -2F, -12.5F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 67
		attachmentModel[23].setRotationPoint(-3F, -4F, -12.5F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		attachmentModel[24].setRotationPoint(-4F, -2F, 7.5F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 28, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		attachmentModel[25].setRotationPoint(35F, -8F, -4F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 28, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		attachmentModel[26].setRotationPoint(35F, 7F, -4F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 28, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		attachmentModel[27].setRotationPoint(35F, -4F, -8F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 28, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		attachmentModel[28].setRotationPoint(35F, -4F, 7F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		attachmentModel[29].setRotationPoint(35F, -8F, 7F);

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 20, 4, 8, 0F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, -2F, 0F); // Box 80
		attachmentModel[30].setRotationPoint(15F, -4F, -4F);

		attachmentModel[31].addShapeBox(0F, 0F, 0F, 22, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		attachmentModel[31].setRotationPoint(-55F, -6F, -3F);

		attachmentModel[32].addShapeBox(0F, 0F, 0F, 22, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		attachmentModel[32].setRotationPoint(-55F, 5F, -3F);

		attachmentModel[33].addShapeBox(0F, 0F, 0F, 22, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		attachmentModel[33].setRotationPoint(-55F, -3F, -6F);

		attachmentModel[34].addShapeBox(0F, 0F, 0F, 22, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		attachmentModel[34].setRotationPoint(-55F, -3F, 5F);

		attachmentModel[35].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		attachmentModel[35].setRotationPoint(-55F, -6F, 5F);

		attachmentModel[36].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -2F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -2F, 3F); // Box 96
		attachmentModel[36].setRotationPoint(-33F, -4F, -3F);

		attachmentModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 128
		attachmentModel[37].setRotationPoint(61F, -7F, -4F);

		attachmentModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		attachmentModel[38].setRotationPoint(61F, 4F, -4F);

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 1, 8, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		attachmentModel[39].setRotationPoint(61F, -4F, -7F);

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		attachmentModel[40].setRotationPoint(-55F, -6F, -6F);

		attachmentModel[41].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 129
		attachmentModel[41].setRotationPoint(-55F, 3F, -6F);

		attachmentModel[42].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 130
		attachmentModel[42].setRotationPoint(-55F, 3F, 5F);

		attachmentModel[43].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F); // Box 132
		attachmentModel[43].setRotationPoint(-33F, -3F, -4F);

		attachmentModel[44].addShapeBox(0F, 0F, 0F, 42, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 136
		attachmentModel[44].setRotationPoint(-27F, 2F, 3F);

		attachmentModel[45].addShapeBox(0F, 0F, 0F, 42, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 137
		attachmentModel[45].setRotationPoint(-27F, 2F, -4F);

		attachmentModel[46].addShapeBox(0F, 0F, 0F, 20, 8, 8, 0F, 0F, -2F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -2F, 0F); // Box 140
		attachmentModel[46].setRotationPoint(15F, -4F, -4F);

		attachmentModel[47].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		attachmentModel[47].setRotationPoint(35F, -8F, -8F);

		attachmentModel[48].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, -1F, 3F); // Box 148
		attachmentModel[48].setRotationPoint(35F, 4F, -8F);

		attachmentModel[49].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 149
		attachmentModel[49].setRotationPoint(35F, 4F, 7F);

		attachmentModel[50].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 150
		attachmentModel[50].setRotationPoint(-3F, 2F, -12.5F);

		attachmentModel[51].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 151
		attachmentModel[51].setRotationPoint(-3F, -4F, 7.5F);

		attachmentModel[52].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 152
		attachmentModel[52].setRotationPoint(-3F, 2F, 7.5F);

		attachmentModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		attachmentModel[53].setRotationPoint(-1F, 1F, 7F);

		attachmentModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 154
		attachmentModel[54].setRotationPoint(-1F, -3F, -8F);

		attachmentModel[55].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		attachmentModel[55].setRotationPoint(-3F, -1F, -8F);

		attachmentModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		attachmentModel[56].setRotationPoint(-1F, 1F, -8F);

		attachmentModel[57].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 157
		attachmentModel[57].setRotationPoint(-3F, -12.5F, -4F);

		attachmentModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 158
		attachmentModel[58].setRotationPoint(-1F, -8F, -3F);

		attachmentModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 159
		attachmentModel[59].setRotationPoint(-2F, -4F, 4F);

		attachmentModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		attachmentModel[60].setRotationPoint(-2F, 2F, 4F);

		attachmentModel[61].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		attachmentModel[61].setRotationPoint(-2F, 2F, -7F);

		attachmentModel[62].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 162
		attachmentModel[62].setRotationPoint(-2F, -7F, -4F);

		attachmentModel[63].addShapeBox(0F, 0F, 0F, 20, 4, 8, 0F, 0F, -2F, 0F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, -2F); // Box 128
		attachmentModel[63].setRotationPoint(15F, 0F, -4F);

		attachmentModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, -2F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -2F, 3F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F); // Box 129
		attachmentModel[64].setRotationPoint(-33F, 1F, -3F);
		
		zoomStepModel = new ModelRendererTurbo[16];
		zoomStepModel[15] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 149
		zoomStepModel[14] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 152
		zoomStepModel[13] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 157
		zoomStepModel[12] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 130
		zoomStepModel[11] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 130
		zoomStepModel[10] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 131
		zoomStepModel[9] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 132
		zoomStepModel[8] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 133
		zoomStepModel[7] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 134
		zoomStepModel[6] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 135
		zoomStepModel[5] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 136
		zoomStepModel[4] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 137
		zoomStepModel[3] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 138
		zoomStepModel[2] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 139
		zoomStepModel[1] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 140
		zoomStepModel[0] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 141

		zoomStepModel[15].addShapeBox(0F, -7F, -3F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 149
		zoomStepModel[15].setRotationPoint(-39F, 0F, 0F);

		zoomStepModel[14].addShapeBox(0F, -3F, -7F, 5, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		zoomStepModel[14].setRotationPoint(-39F, 0F, 0F);

		zoomStepModel[13].addShapeBox(0F, -10F, -0.5F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 157
		zoomStepModel[13].setRotationPoint(-38F, 0F, 0F);
		zoomStepModel[13].rotateAngleX = -0.78539816F;

		zoomStepModel[12].addShapeBox(0F, 3F, -3F, 5, 4, 6, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		zoomStepModel[12].setRotationPoint(-39F, 0F, 0F);

		zoomStepModel[11].addShapeBox(0F, -10F, -0.5F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 130
		zoomStepModel[11].setRotationPoint(-38F, 0F, 0F);
		zoomStepModel[11].rotateAngleX = -0.26179939F;

		zoomStepModel[10].addShapeBox(0F, -7F, -3F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 131
		zoomStepModel[10].setRotationPoint(-39F, 0F, 0F);
		zoomStepModel[10].rotateAngleX = 0.52359878F;

		zoomStepModel[9].addShapeBox(0F, -3F, -7F, 5, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		zoomStepModel[9].setRotationPoint(-39F, 0F, 0F);
		zoomStepModel[9].rotateAngleX = 0.52359878F;

		zoomStepModel[8].addShapeBox(0F, 3F, -3F, 5, 4, 6, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		zoomStepModel[8].setRotationPoint(-39F, 0F, 0F);
		zoomStepModel[8].rotateAngleX = 0.52359878F;

		zoomStepModel[7].addShapeBox(0F, -10F, -0.5F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 134
		zoomStepModel[7].setRotationPoint(-38F, 0F, 0F);
		zoomStepModel[7].rotateAngleX = 0.26179939F;

		zoomStepModel[6].addShapeBox(0F, -7F, -3F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 135
		zoomStepModel[6].setRotationPoint(-39F, 0F, 0F);
		zoomStepModel[6].rotateAngleX = 1.04719755F;

		zoomStepModel[5].addShapeBox(0F, -3F, -7F, 5, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		zoomStepModel[5].setRotationPoint(-39F, 0F, 0F);
		zoomStepModel[5].rotateAngleX = 1.04719755F;

		zoomStepModel[4].addShapeBox(0F, 3F, -3F, 5, 4, 6, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		zoomStepModel[4].setRotationPoint(-39F, 0F, 0F);
		zoomStepModel[4].rotateAngleX = 1.04719755F;

		zoomStepModel[3].addShapeBox(0F, -10F, -0.5F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 138
		zoomStepModel[3].setRotationPoint(-38F, 0F, 0F);
		zoomStepModel[3].rotateAngleX = 0.78539816F;

		zoomStepModel[2].addShapeBox(0F, -7F, -3F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 139
		zoomStepModel[2].setRotationPoint(-39F, 0F, 0F);
		zoomStepModel[2].rotateAngleX = 1.57079633F;

		zoomStepModel[2].addShapeBox(0F, -3F, -7F, 5, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		zoomStepModel[2].setRotationPoint(-39F, 0F, 0F);
		zoomStepModel[2].rotateAngleX = 1.57079633F;

		zoomStepModel[0].addShapeBox(0F, 3F, -3F, 5, 4, 6, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		zoomStepModel[0].setRotationPoint(-39F, 0F, 0F);
		zoomStepModel[0].rotateAngleX = 1.57079633F;

		pupilRefCenter.set(-54F / 16F, 0F, 0F);
		scopeGlassModelScale.set(1F, 0.02F, 0.02F);
		scopeObjectiveLensCenter.set(63F / 160F, 0F, 0F);
		scopeMaskMultRotY = scopeMaskMultRotZ = 1F;
		scopeMaskMultTransY = scopeMaskMultTransZ = 0.8F;
		scopeMaskScale = 0.21F / 1600F;
		minPupilDistance = 0.009179F;
		scopeMaskAlphaDivisor = new float[]{ 0.000015F, 0.000025F, 0.000035F, 0.000045F };
		reticleAt[0].set(4096F, 0F, 0F);
		reticleScale = 1.5F / 160F;

		reticleBorder = new Vector3f[6];
		reticleBorder[0] = new Vector3f(67F / 160F, 4F / 160F, -8F / 160F);
		reticleBorder[1] = new Vector3f(67F / 160F, 8F / 160F, -4F / 160F);
		reticleBorder[2] = new Vector3f(67F / 160F, 8F / 160F, 4F / 160F);
		reticleBorder[3] = new Vector3f(67F / 160F, 4F / 160F, 8F / 160F);
		reticleBorder[4] = new Vector3f(67F / 160F, -8F / 160F, 8F / 160F);
		reticleBorder[5] = new Vector3f(67F / 160F, -8F / 160F, -8F / 160F);

		flipAll();
		flip(zoomStepModel);
	}
	
	@Override
	public void render(float f)
	{
		render(attachmentModel, f);
		byte zoomStep = getZoomStep();
		partialRender(zoomStepModel, zoomStep <<= 2, zoomStep + 4, f);
	}
}