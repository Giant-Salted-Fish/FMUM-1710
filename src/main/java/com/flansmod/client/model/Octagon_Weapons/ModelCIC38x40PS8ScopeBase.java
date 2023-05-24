//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC 3-8x40 PS-8 Scope
// Model Creator: 
// Created on: 27.10.2019 - 16:45:48
// Last changed on: 27.10.2019 - 16:45:48

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCIC38x40PS8ScopeBase extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelCIC38x40PS8ScopeBase() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[41];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 4
		attachmentModel[5] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 5
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		attachmentModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 7
		attachmentModel[8] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 8
		attachmentModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 9
		attachmentModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 10
		attachmentModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		attachmentModel[12] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 15
		attachmentModel[13] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 17
		attachmentModel[14] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 18
		attachmentModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 20
		attachmentModel[16] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 21
		attachmentModel[17] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 30
		attachmentModel[18] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 32
		attachmentModel[19] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 34
		attachmentModel[20] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 140
		attachmentModel[21] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 141
		attachmentModel[22] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 142
		attachmentModel[23] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 143
		attachmentModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 144
		attachmentModel[25] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 145
		attachmentModel[26] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 146
		attachmentModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 147
		attachmentModel[28] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 148
		attachmentModel[29] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 125
		attachmentModel[30] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 126
		attachmentModel[31] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 127
		attachmentModel[32] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 163
		attachmentModel[33] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 164
		attachmentModel[34] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 165
		attachmentModel[35] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 166
		attachmentModel[36] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 167
		attachmentModel[37] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 168
		attachmentModel[38] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 169
		attachmentModel[39] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 170
		attachmentModel[40] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 171

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 30, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-6F, -1F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 1
		attachmentModel[1].setRotationPoint(-6F, -2F, -3F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		attachmentModel[2].setRotationPoint(-6F, -3F, -3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		attachmentModel[3].setRotationPoint(-6F, 0F, -4F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		attachmentModel[4].setRotationPoint(-6F, 0F, 3F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		attachmentModel[5].setRotationPoint(-6F, -6F, -3F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		attachmentModel[6].setRotationPoint(18F, -6F, -3F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 7
		attachmentModel[7].setRotationPoint(-6F, -4F, -3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 8
		attachmentModel[8].setRotationPoint(18F, -4F, -3F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		attachmentModel[9].setRotationPoint(-0.5F, 0F, -6.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 10
		attachmentModel[10].setRotationPoint(0F, -1F, -7F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		attachmentModel[11].setRotationPoint(15.5F, 0F, -6.5F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		attachmentModel[12].setRotationPoint(-6F, -12F, -5F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 17
		attachmentModel[13].setRotationPoint(-6F, -8F, 4F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		attachmentModel[14].setRotationPoint(-6F, -15F, 4F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		attachmentModel[15].setRotationPoint(-6F, -12F, 4F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		attachmentModel[16].setRotationPoint(-6F, -15F, -2F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		attachmentModel[17].setRotationPoint(18F, -12F, 4F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		attachmentModel[18].setRotationPoint(18F, -15F, -2F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		attachmentModel[19].setRotationPoint(18F, -12F, -5F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 140
		attachmentModel[20].setRotationPoint(18F, -11F, 5F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		attachmentModel[21].setRotationPoint(19F, -12F, 5F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		attachmentModel[22].setRotationPoint(22F, -12F, 5F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		attachmentModel[23].setRotationPoint(22F, -12F, -6F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		attachmentModel[24].setRotationPoint(19F, -12F, -6F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		attachmentModel[25].setRotationPoint(-2F, -12F, -6F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		attachmentModel[26].setRotationPoint(-5F, -12F, -6F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		attachmentModel[27].setRotationPoint(-5F, -12F, 5F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		attachmentModel[28].setRotationPoint(-2F, -12F, 5F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 125
		attachmentModel[29].setRotationPoint(-6F, -8F, -5F);

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 126
		attachmentModel[30].setRotationPoint(18F, -8F, -5F);

		attachmentModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 127
		attachmentModel[31].setRotationPoint(18F, -8F, 4F);

		attachmentModel[32].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		attachmentModel[32].setRotationPoint(-6F, -15F, -5F);

		attachmentModel[33].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		attachmentModel[33].setRotationPoint(18F, -15F, -5F);

		attachmentModel[34].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		attachmentModel[34].setRotationPoint(18F, -15F, 4F);

		attachmentModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 166
		attachmentModel[35].setRotationPoint(18F, -11F, -6F);

		attachmentModel[36].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 167
		attachmentModel[36].setRotationPoint(-6F, -11F, -6F);

		attachmentModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 168
		attachmentModel[37].setRotationPoint(-6F, -11F, 5F);

		attachmentModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 169
		attachmentModel[38].setRotationPoint(0F, 1F, -7F);

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 170
		attachmentModel[39].setRotationPoint(16F, 1F, -7F);

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 171
		attachmentModel[40].setRotationPoint(16F, -1F, -7F);

		flipAll();
	}
}