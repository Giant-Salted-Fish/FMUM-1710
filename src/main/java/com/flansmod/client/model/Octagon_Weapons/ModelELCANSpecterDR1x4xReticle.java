//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ELCAN SpecterDR 1x/4x Division
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelELCANSpecterDR1x4xReticle extends ModelDefault //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelELCANSpecterDR1x4xReticle() //Same as Filename
	{
		defaultModel = new ModelRendererTurbo[36];
		defaultModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 320
		defaultModel[1] = new ModelRendererTurbo(this, 6, 1, textureX, textureY); // Box 133
		defaultModel[2] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 134
		defaultModel[3] = new ModelRendererTurbo(this, 16, 1, textureX, textureY); // Box 135
		defaultModel[4] = new ModelRendererTurbo(this, 21, 1, textureX, textureY); // Box 136
		defaultModel[5] = new ModelRendererTurbo(this, 56, 1, textureX, textureY); // Box 137
		defaultModel[6] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // Box 138
		defaultModel[7] = new ModelRendererTurbo(this, 61, 1, textureX, textureY); // Box 139
		defaultModel[8] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 140
		defaultModel[9] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 141
		defaultModel[10] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 142
		defaultModel[11] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 143
		defaultModel[12] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 144
		defaultModel[13] = new ModelRendererTurbo(this, 31, 1, textureX, textureY); // Box 145
		defaultModel[14] = new ModelRendererTurbo(this, 36, 1, textureX, textureY); // Box 146
		defaultModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 147
		defaultModel[16] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 148
		defaultModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 149
		defaultModel[18] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 150
		defaultModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 151
		defaultModel[20] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 152
		defaultModel[21] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 153
		defaultModel[22] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 154
		defaultModel[23] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 155
		defaultModel[24] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 156
		defaultModel[25] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 157
		defaultModel[26] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 158
		defaultModel[27] = new ModelRendererTurbo(this, 1, 46, textureX, textureY); // Box 159
		defaultModel[28] = new ModelRendererTurbo(this, 1, 61, textureX, textureY); // Box 160
		defaultModel[29] = new ModelRendererTurbo(this, 1, 64, textureX, textureY); // Box 161
		defaultModel[30] = new ModelRendererTurbo(this, 1, 67, textureX, textureY); // Box 162
		defaultModel[31] = new ModelRendererTurbo(this, 1, 70, textureX, textureY); // Box 163
		defaultModel[32] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 164
		defaultModel[33] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 165
		defaultModel[34] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 166
		defaultModel[35] = new ModelRendererTurbo(this, 1, 40, textureX, textureY); // Box 167

		defaultModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 320
		defaultModel[0].setRotationPoint(0F, -0.199999999999999F, -0.2F);

		defaultModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 133
		defaultModel[1].setRotationPoint(0F, -0.0500000000000007F, -1.4F);

		defaultModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0.6F, 0F, -0.6F, 0.6F); // Box 134
		defaultModel[2].setRotationPoint(0F, -0.199999999999999F, -3F);

		defaultModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 135
		defaultModel[3].setRotationPoint(0F, -0.0500000000000007F, 0.4F);

		defaultModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0.6F, 0F, -0.6F, 0.6F); // Box 136
		defaultModel[4].setRotationPoint(0F, -0.199999999999999F, 1.4F);

		defaultModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.9F, 0F, 0.4F, -0.9F); // Box 137
		defaultModel[5].setRotationPoint(0F, -2.8F, -0.05F);

		defaultModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 138
		defaultModel[6].setRotationPoint(0F, 0.400000000000001F, -0.5F);

		defaultModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.9F, 0F, 0.7F, -0.9F); // Box 139
		defaultModel[7].setRotationPoint(0F, 0.500000000000001F, -0.05F);

		defaultModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 140
		defaultModel[8].setRotationPoint(0F, 0.800000000000001F, -0.3F);

		defaultModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.6F, 0F, -0.9F, -0.6F); // Box 141
		defaultModel[9].setRotationPoint(0F, 1.2F, -0.2F);

		defaultModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.6F, 0F, -0.9F, -0.6F); // Box 142
		defaultModel[10].setRotationPoint(0F, 1.6F, -0.2F);

		defaultModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F); // Box 143
		defaultModel[11].setRotationPoint(0F, 2F, 0.2F);

		defaultModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F); // Box 144
		defaultModel[12].setRotationPoint(0F, 2F, -0.4F);

		defaultModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 145
		defaultModel[13].setRotationPoint(0F, 2.4F, -0.5F);

		defaultModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 146
		defaultModel[14].setRotationPoint(0F, 2.4F, 0.2F);

		defaultModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.6F, 0F, -0.9F, -0.6F); // Box 147
		defaultModel[15].setRotationPoint(0F, 2.8F, 0.2F);

		defaultModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.6F, 0F, -0.9F, -0.6F); // Box 148
		defaultModel[16].setRotationPoint(0F, 2.8F, -0.6F);

		defaultModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F); // Box 149
		defaultModel[17].setRotationPoint(0F, 3.2F, -0.2F);

		defaultModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 150
		defaultModel[18].setRotationPoint(0F, 0.300000000000001F, -1F);

		defaultModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 151
		defaultModel[19].setRotationPoint(0F, 0.500000000000001F, -1F);

		defaultModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 152
		defaultModel[20].setRotationPoint(0F, 0.7F, -1F);

		defaultModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F); // Box 153
		defaultModel[21].setRotationPoint(0F, 1.3F, -0.9F);

		defaultModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F); // Box 154
		defaultModel[22].setRotationPoint(0F, 1.9F, -1F);

		defaultModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F); // Box 155
		defaultModel[23].setRotationPoint(0F, 2.1F, -1F);

		defaultModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F); // Box 156
		defaultModel[24].setRotationPoint(0F, 2.3F, -1F);

		defaultModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 157
		defaultModel[25].setRotationPoint(0F, 0.400000000000001F, -1F);

		defaultModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 158
		defaultModel[26].setRotationPoint(0F, 0.6F, -0.8F);

		defaultModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.9F, 0F, -0.8F, -0.9F); // Box 159
		defaultModel[27].setRotationPoint(0F, 1.1F, -0.8F);

		defaultModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 160
		defaultModel[28].setRotationPoint(0F, 1.1F, -1F);

		defaultModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 161
		defaultModel[29].setRotationPoint(0F, 1.9F, -0.8F);

		defaultModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 162
		defaultModel[30].setRotationPoint(0F, 2.2F, -1F);

		defaultModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 163
		defaultModel[31].setRotationPoint(0F, 2.7F, -0.9F);

		defaultModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 164
		defaultModel[32].setRotationPoint(0F, 2.9F, -0.9F);

		defaultModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 165
		defaultModel[33].setRotationPoint(0F, 3.1F, -0.9F);

		defaultModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 166
		defaultModel[34].setRotationPoint(0F, 2.7F, -0.8F);

		defaultModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 167
		defaultModel[35].setRotationPoint(0F, 2.7F, -1F);

		flipAll();
	}
}