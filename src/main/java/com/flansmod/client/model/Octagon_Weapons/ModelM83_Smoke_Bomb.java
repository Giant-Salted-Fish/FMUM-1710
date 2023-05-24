//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M-83 Smoke Bomb
// Model Creator:
// Created on:07.10.2019 - 17:58:10
// Last changed on: 07.10.2019 - 17:58:10

package com.flansmod.client.model.Octagon_Weapons;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelM83_Smoke_Bomb extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelM83_Smoke_Bomb()
	{
		m83_smoke_bombModel = new ModelRendererTurbo[55];
		m83_smoke_bombModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 136
		m83_smoke_bombModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 137
		m83_smoke_bombModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 139
		m83_smoke_bombModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 140
		m83_smoke_bombModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 141
		m83_smoke_bombModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 142
		m83_smoke_bombModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 143
		m83_smoke_bombModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 144
		m83_smoke_bombModel[8] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 145
		m83_smoke_bombModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 146
		m83_smoke_bombModel[10] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 147
		m83_smoke_bombModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 148
		m83_smoke_bombModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 149
		m83_smoke_bombModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 150
		m83_smoke_bombModel[14] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 151
		m83_smoke_bombModel[15] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 152
		m83_smoke_bombModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 153
		m83_smoke_bombModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 154
		m83_smoke_bombModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 155
		m83_smoke_bombModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 156
		m83_smoke_bombModel[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 157
		m83_smoke_bombModel[21] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 158
		m83_smoke_bombModel[22] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 159
		m83_smoke_bombModel[23] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 160
		m83_smoke_bombModel[24] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 161
		m83_smoke_bombModel[25] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 162
		m83_smoke_bombModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 163
		m83_smoke_bombModel[27] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 164
		m83_smoke_bombModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 165
		m83_smoke_bombModel[29] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 166
		m83_smoke_bombModel[30] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 167
		m83_smoke_bombModel[31] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 168
		m83_smoke_bombModel[32] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 169
		m83_smoke_bombModel[33] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 170
		m83_smoke_bombModel[34] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 171
		m83_smoke_bombModel[35] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 172
		m83_smoke_bombModel[36] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 173
		m83_smoke_bombModel[37] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 174
		m83_smoke_bombModel[38] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 175
		m83_smoke_bombModel[39] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 176
		m83_smoke_bombModel[40] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 177
		m83_smoke_bombModel[41] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 178
		m83_smoke_bombModel[42] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 179
		m83_smoke_bombModel[43] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 180
		m83_smoke_bombModel[44] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 185
		m83_smoke_bombModel[45] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 194
		m83_smoke_bombModel[46] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 178
		m83_smoke_bombModel[47] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 179
		m83_smoke_bombModel[48] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 180
		m83_smoke_bombModel[49] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 181
		m83_smoke_bombModel[50] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 182
		m83_smoke_bombModel[51] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 183
		m83_smoke_bombModel[52] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 184
		m83_smoke_bombModel[53] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 185
		m83_smoke_bombModel[54] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 186

		m83_smoke_bombModel[0].addShapeBox(0F, 0F, 0F, 6, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		m83_smoke_bombModel[0].setRotationPoint(-3F, 44F, -8F);

		m83_smoke_bombModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 137
		m83_smoke_bombModel[1].setRotationPoint(3F, 44F, -8F);

		m83_smoke_bombModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 139
		m83_smoke_bombModel[2].setRotationPoint(-8F, 44F, -8F);

		m83_smoke_bombModel[3].addShapeBox(0F, 0F, 0F, 13, 12, 14, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		m83_smoke_bombModel[3].setRotationPoint(-10F, 51F, -7F);

		m83_smoke_bombModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		m83_smoke_bombModel[4].setRotationPoint(-3F, 47F, -8F);

		m83_smoke_bombModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F); // Box 142
		m83_smoke_bombModel[5].setRotationPoint(3F, 47F, -8F);

		m83_smoke_bombModel[6].addShapeBox(0F, 0F, 0F, 4, 14, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 143
		m83_smoke_bombModel[6].setRotationPoint(3F, 49F, -7F);

		m83_smoke_bombModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F); // Box 144
		m83_smoke_bombModel[7].setRotationPoint(-8F, 47F, -8F);

		m83_smoke_bombModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		m83_smoke_bombModel[8].setRotationPoint(7F, 60F, -2.5F);

		m83_smoke_bombModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		m83_smoke_bombModel[9].setRotationPoint(9F, 61F, -6F);

		m83_smoke_bombModel[10].addShapeBox(0F, 0F, 0F, 17, 1, 16, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		m83_smoke_bombModel[10].setRotationPoint(-10F, 63F, -8F);

		m83_smoke_bombModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		m83_smoke_bombModel[11].setRotationPoint(10F, 59F, -7F);

		m83_smoke_bombModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		m83_smoke_bombModel[12].setRotationPoint(9F, 60F, -6F);

		m83_smoke_bombModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 150
		m83_smoke_bombModel[13].setRotationPoint(9F, 62F, -6F);

		m83_smoke_bombModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 151
		m83_smoke_bombModel[14].setRotationPoint(11F, 59F, -7F);

		m83_smoke_bombModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 152
		m83_smoke_bombModel[15].setRotationPoint(9F, 59F, -7F);

		m83_smoke_bombModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		m83_smoke_bombModel[16].setRotationPoint(7F, 61F, -7F);

		m83_smoke_bombModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		m83_smoke_bombModel[17].setRotationPoint(7F, 63F, -7F);

		m83_smoke_bombModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		m83_smoke_bombModel[18].setRotationPoint(7F, 63F, 3F);

		m83_smoke_bombModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		m83_smoke_bombModel[19].setRotationPoint(7F, 61F, 3F);

		m83_smoke_bombModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 157
		m83_smoke_bombModel[20].setRotationPoint(9F, 59F, 3F);

		m83_smoke_bombModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		m83_smoke_bombModel[21].setRotationPoint(10F, 59F, 3F);

		m83_smoke_bombModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 159
		m83_smoke_bombModel[22].setRotationPoint(11F, 59F, 3F);

		m83_smoke_bombModel[23].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		m83_smoke_bombModel[23].setRotationPoint(-9F, 62F, -8F);

		m83_smoke_bombModel[24].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		m83_smoke_bombModel[24].setRotationPoint(-9F, 61F, -8F);

		m83_smoke_bombModel[25].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		m83_smoke_bombModel[25].setRotationPoint(-9F, 61F, 7F);

		m83_smoke_bombModel[26].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		m83_smoke_bombModel[26].setRotationPoint(-9F, 62F, 7F);

		m83_smoke_bombModel[27].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 6F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		m83_smoke_bombModel[27].setRotationPoint(-11F, 56F, 7F);

		m83_smoke_bombModel[28].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 165
		m83_smoke_bombModel[28].setRotationPoint(-10.5F, 57.5F, 10F);
		m83_smoke_bombModel[28].rotateAngleZ = 0.17453293F;

		m83_smoke_bombModel[29].addShapeBox(-0.5F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		m83_smoke_bombModel[29].setRotationPoint(-10.5F, 57.5F, -12F);
		m83_smoke_bombModel[29].rotateAngleZ = -0.17453293F;

		m83_smoke_bombModel[30].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 6F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		m83_smoke_bombModel[30].setRotationPoint(-11F, 56F, -8F);

		m83_smoke_bombModel[31].addShapeBox(-4F, -0.5F, -0.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		m83_smoke_bombModel[31].setRotationPoint(-10.5F, 57.5F, -11F);
		m83_smoke_bombModel[31].rotateAngleX = -2.37364778F;
		m83_smoke_bombModel[31].rotateAngleZ = -0.17453293F;

		m83_smoke_bombModel[32].addShapeBox(4F, -0.5F, -0.5F, 7, 7, 1, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F); // Box 169
		m83_smoke_bombModel[32].setRotationPoint(-10.5F, 57.5F, -11F);
		m83_smoke_bombModel[32].rotateAngleX = -2.37364778F;
		m83_smoke_bombModel[32].rotateAngleZ = -0.17453293F;

		m83_smoke_bombModel[33].addShapeBox(-11F, -0.5F, -0.5F, 7, 7, 1, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F); // Box 170
		m83_smoke_bombModel[33].setRotationPoint(-10.5F, 57.5F, -11F);
		m83_smoke_bombModel[33].rotateAngleX = -2.37364778F;
		m83_smoke_bombModel[33].rotateAngleZ = -0.17453293F;

		m83_smoke_bombModel[34].addShapeBox(-11F, 6.5F, -0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		m83_smoke_bombModel[34].setRotationPoint(-10.5F, 57.5F, -11F);
		m83_smoke_bombModel[34].rotateAngleX = -2.37364778F;
		m83_smoke_bombModel[34].rotateAngleZ = -0.17453293F;

		m83_smoke_bombModel[35].addShapeBox(10F, 6.5F, -0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		m83_smoke_bombModel[35].setRotationPoint(-10.5F, 57.5F, -11F);
		m83_smoke_bombModel[35].rotateAngleX = -2.37364778F;
		m83_smoke_bombModel[35].rotateAngleZ = -0.17453293F;

		m83_smoke_bombModel[36].addShapeBox(4F, 13.5F, -0.5F, 7, 7, 1, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 173
		m83_smoke_bombModel[36].setRotationPoint(-10.5F, 57.5F, -11F);
		m83_smoke_bombModel[36].rotateAngleX = -2.37364778F;
		m83_smoke_bombModel[36].rotateAngleZ = -0.17453293F;

		m83_smoke_bombModel[37].addShapeBox(-11F, 13.5F, -0.5F, 7, 7, 1, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 174
		m83_smoke_bombModel[37].setRotationPoint(-10.5F, 57.5F, -11F);
		m83_smoke_bombModel[37].rotateAngleX = -2.37364778F;
		m83_smoke_bombModel[37].rotateAngleZ = -0.17453293F;

		m83_smoke_bombModel[38].addShapeBox(-4F, 19.5F, -0.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		m83_smoke_bombModel[38].setRotationPoint(-10.5F, 57.5F, -11F);
		m83_smoke_bombModel[38].rotateAngleX = -2.37364778F;
		m83_smoke_bombModel[38].rotateAngleZ = -0.17453293F;

		m83_smoke_bombModel[39].addShapeBox(0F, 0F, 0F, 19, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 176
		m83_smoke_bombModel[39].setRotationPoint(-16F, 49F, -7F);

		m83_smoke_bombModel[40].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		m83_smoke_bombModel[40].setRotationPoint(-17F, 50F, -7F);

		m83_smoke_bombModel[41].addShapeBox(0F, 0F, 0F, 1, 11, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 178
		m83_smoke_bombModel[41].setRotationPoint(-18F, 52F, -8F);

		m83_smoke_bombModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 179
		m83_smoke_bombModel[42].setRotationPoint(-25F, 46F, -8F);

		m83_smoke_bombModel[43].addShapeBox(0F, 0F, 0F, 1, 51, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		m83_smoke_bombModel[43].setRotationPoint(-25F, -5F, -5F);

		m83_smoke_bombModel[44].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		m83_smoke_bombModel[44].setRotationPoint(3F, 57F, -7F);

		m83_smoke_bombModel[45].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		m83_smoke_bombModel[45].setRotationPoint(-10.5F, 57.5F, -10F);
		m83_smoke_bombModel[45].rotateAngleZ = 0.17453293F;

		m83_smoke_bombModel[46].addShapeBox(0F, 0F, 0F, 16, 3, 46, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		m83_smoke_bombModel[46].setRotationPoint(-8F, 41F, -23F);

		m83_smoke_bombModel[47].addShapeBox(0F, 0F, 0F, 14, 81, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		m83_smoke_bombModel[47].setRotationPoint(-7F, -40F, -21F);

		m83_smoke_bombModel[48].addShapeBox(0F, 0F, 0F, 14, 81, 42, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F); // Box 180
		m83_smoke_bombModel[48].setRotationPoint(-21F, -40F, -21F);

		m83_smoke_bombModel[49].addShapeBox(0F, 0F, 0F, 14, 81, 42, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F); // Box 181
		m83_smoke_bombModel[49].setRotationPoint(7F, -40F, -21F);

		m83_smoke_bombModel[50].addShapeBox(0F, 0F, 0F, 15, 3, 46, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); // Box 182
		m83_smoke_bombModel[50].setRotationPoint(-23F, 41F, -23F);

		m83_smoke_bombModel[51].addShapeBox(0F, 0F, 0F, 15, 3, 46, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 183
		m83_smoke_bombModel[51].setRotationPoint(8F, 41F, -23F);

		m83_smoke_bombModel[52].addShapeBox(0F, 0F, 0F, 16, 3, 46, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		m83_smoke_bombModel[52].setRotationPoint(-8F, -43F, -23F);

		m83_smoke_bombModel[53].addShapeBox(0F, 0F, 0F, 15, 3, 46, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 185
		m83_smoke_bombModel[53].setRotationPoint(8F, -43F, -23F);

		m83_smoke_bombModel[54].addShapeBox(0F, 0F, 0F, 15, 3, 46, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); // Box 186
		m83_smoke_bombModel[54].setRotationPoint(-23F, -43F, -23F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		GL11.glScalef(0.04F, 0.04F, 0.04F);

		for(int i = 0; i < 55; i++)
		{
			m83_smoke_bombModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo m83_smoke_bombModel[];
}