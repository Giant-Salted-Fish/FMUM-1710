//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M-67 Grenade
// Model Creator:
// Created on:07.10.2019 - 17:58:10
// Last changed on: 07.10.2019 - 17:58:10

package com.flansmod.client.model.Octagon_Weapons;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelM67_Grenade extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelM67_Grenade()
	{
		m67_grenadeModel = new ModelRendererTurbo[60];
		m67_grenadeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 136
		m67_grenadeModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 137
		m67_grenadeModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 139
		m67_grenadeModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 140
		m67_grenadeModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 141
		m67_grenadeModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 142
		m67_grenadeModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 143
		m67_grenadeModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 144
		m67_grenadeModel[8] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 145
		m67_grenadeModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 146
		m67_grenadeModel[10] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 147
		m67_grenadeModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 148
		m67_grenadeModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 149
		m67_grenadeModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 150
		m67_grenadeModel[14] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 151
		m67_grenadeModel[15] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 152
		m67_grenadeModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 153
		m67_grenadeModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 154
		m67_grenadeModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 155
		m67_grenadeModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 156
		m67_grenadeModel[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 157
		m67_grenadeModel[21] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 158
		m67_grenadeModel[22] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 159
		m67_grenadeModel[23] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 160
		m67_grenadeModel[24] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 161
		m67_grenadeModel[25] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 162
		m67_grenadeModel[26] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 163
		m67_grenadeModel[27] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 164
		m67_grenadeModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 165
		m67_grenadeModel[29] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 166
		m67_grenadeModel[30] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 167
		m67_grenadeModel[31] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 168
		m67_grenadeModel[32] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 169
		m67_grenadeModel[33] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 170
		m67_grenadeModel[34] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 171
		m67_grenadeModel[35] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 172
		m67_grenadeModel[36] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 173
		m67_grenadeModel[37] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 174
		m67_grenadeModel[38] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 175
		m67_grenadeModel[39] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 176
		m67_grenadeModel[40] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 177
		m67_grenadeModel[41] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 178
		m67_grenadeModel[42] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 179
		m67_grenadeModel[43] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 180
		m67_grenadeModel[44] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 185
		m67_grenadeModel[45] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 194
		m67_grenadeModel[46] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 55
		m67_grenadeModel[47] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 56
		m67_grenadeModel[48] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 57
		m67_grenadeModel[49] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 58
		m67_grenadeModel[50] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 59
		m67_grenadeModel[51] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 60
		m67_grenadeModel[52] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 64
		m67_grenadeModel[53] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 59
		m67_grenadeModel[54] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 60
		m67_grenadeModel[55] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 61
		m67_grenadeModel[56] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 64
		m67_grenadeModel[57] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 65
		m67_grenadeModel[58] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 66
		m67_grenadeModel[59] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 67

		m67_grenadeModel[0].addShapeBox(0F, 0F, 0F, 6, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		m67_grenadeModel[0].setRotationPoint(-3F, 24F, -8F);

		m67_grenadeModel[1].addShapeBox(0F, 0F, 0F, 5, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 137
		m67_grenadeModel[1].setRotationPoint(3F, 24F, -8F);

		m67_grenadeModel[2].addShapeBox(0F, 0F, 0F, 5, 8, 16, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 139
		m67_grenadeModel[2].setRotationPoint(-8F, 24F, -8F);

		m67_grenadeModel[3].addShapeBox(0F, 0F, 0F, 13, 12, 14, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		m67_grenadeModel[3].setRotationPoint(-10F, 36F, -7F);

		m67_grenadeModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		m67_grenadeModel[4].setRotationPoint(-3F, 32F, -8F);

		m67_grenadeModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F); // Box 142
		m67_grenadeModel[5].setRotationPoint(3F, 32F, -8F);

		m67_grenadeModel[6].addShapeBox(0F, 0F, 0F, 4, 14, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 143
		m67_grenadeModel[6].setRotationPoint(3F, 34F, -7F);

		m67_grenadeModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F); // Box 144
		m67_grenadeModel[7].setRotationPoint(-8F, 32F, -8F);

		m67_grenadeModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		m67_grenadeModel[8].setRotationPoint(7F, 45F, -2.5F);

		m67_grenadeModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		m67_grenadeModel[9].setRotationPoint(9F, 46F, -6F);

		m67_grenadeModel[10].addShapeBox(0F, 0F, 0F, 17, 1, 16, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		m67_grenadeModel[10].setRotationPoint(-10F, 48F, -8F);

		m67_grenadeModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		m67_grenadeModel[11].setRotationPoint(10F, 44F, -7F);

		m67_grenadeModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		m67_grenadeModel[12].setRotationPoint(9F, 45F, -6F);

		m67_grenadeModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 150
		m67_grenadeModel[13].setRotationPoint(9F, 47F, -6F);

		m67_grenadeModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 151
		m67_grenadeModel[14].setRotationPoint(11F, 44F, -7F);

		m67_grenadeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 152
		m67_grenadeModel[15].setRotationPoint(9F, 44F, -7F);

		m67_grenadeModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		m67_grenadeModel[16].setRotationPoint(7F, 46F, -7F);

		m67_grenadeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		m67_grenadeModel[17].setRotationPoint(7F, 48F, -7F);

		m67_grenadeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		m67_grenadeModel[18].setRotationPoint(7F, 48F, 3F);

		m67_grenadeModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		m67_grenadeModel[19].setRotationPoint(7F, 46F, 3F);

		m67_grenadeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 157
		m67_grenadeModel[20].setRotationPoint(9F, 44F, 3F);

		m67_grenadeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		m67_grenadeModel[21].setRotationPoint(10F, 44F, 3F);

		m67_grenadeModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 159
		m67_grenadeModel[22].setRotationPoint(11F, 44F, 3F);

		m67_grenadeModel[23].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		m67_grenadeModel[23].setRotationPoint(-9F, 47F, -8F);

		m67_grenadeModel[24].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		m67_grenadeModel[24].setRotationPoint(-9F, 46F, -8F);

		m67_grenadeModel[25].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		m67_grenadeModel[25].setRotationPoint(-9F, 46F, 7F);

		m67_grenadeModel[26].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		m67_grenadeModel[26].setRotationPoint(-9F, 47F, 7F);

		m67_grenadeModel[27].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 6F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		m67_grenadeModel[27].setRotationPoint(-11F, 41F, 7F);

		m67_grenadeModel[28].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 165
		m67_grenadeModel[28].setRotationPoint(-10.5F, 42.5F, 10F);
		m67_grenadeModel[28].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[29].addShapeBox(-0.5F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		m67_grenadeModel[29].setRotationPoint(-10.5F, 42.5F, -12F);
		m67_grenadeModel[29].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[30].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 6F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		m67_grenadeModel[30].setRotationPoint(-11F, 41F, -8F);

		m67_grenadeModel[31].addShapeBox(-4F, -0.5F, -0.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		m67_grenadeModel[31].setRotationPoint(-10.5F, 42.5F, -11F);
		m67_grenadeModel[31].rotateAngleX = -2.37364778F;
		m67_grenadeModel[31].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[32].addShapeBox(4F, -0.5F, -0.5F, 7, 7, 1, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F); // Box 169
		m67_grenadeModel[32].setRotationPoint(-10.5F, 42.5F, -11F);
		m67_grenadeModel[32].rotateAngleX = -2.37364778F;
		m67_grenadeModel[32].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[33].addShapeBox(-11F, -0.5F, -0.5F, 7, 7, 1, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F); // Box 170
		m67_grenadeModel[33].setRotationPoint(-10.5F, 42.5F, -11F);
		m67_grenadeModel[33].rotateAngleX = -2.37364778F;
		m67_grenadeModel[33].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[34].addShapeBox(-11F, 6.5F, -0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		m67_grenadeModel[34].setRotationPoint(-10.5F, 42.5F, -11F);
		m67_grenadeModel[34].rotateAngleX = -2.37364778F;
		m67_grenadeModel[34].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[35].addShapeBox(10F, 6.5F, -0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		m67_grenadeModel[35].setRotationPoint(-10.5F, 42.5F, -11F);
		m67_grenadeModel[35].rotateAngleX = -2.37364778F;
		m67_grenadeModel[35].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[36].addShapeBox(4F, 13.5F, -0.5F, 7, 7, 1, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 173
		m67_grenadeModel[36].setRotationPoint(-10.5F, 42.5F, -11F);
		m67_grenadeModel[36].rotateAngleX = -2.37364778F;
		m67_grenadeModel[36].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[37].addShapeBox(-11F, 13.5F, -0.5F, 7, 7, 1, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 174
		m67_grenadeModel[37].setRotationPoint(-10.5F, 42.5F, -11F);
		m67_grenadeModel[37].rotateAngleX = -2.37364778F;
		m67_grenadeModel[37].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[38].addShapeBox(-4F, 19.5F, -0.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		m67_grenadeModel[38].setRotationPoint(-10.5F, 42.5F, -11F);
		m67_grenadeModel[38].rotateAngleX = -2.37364778F;
		m67_grenadeModel[38].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[39].addShapeBox(0F, 0F, 0F, 19, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 176
		m67_grenadeModel[39].setRotationPoint(-16F, 34F, -7F);

		m67_grenadeModel[40].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		m67_grenadeModel[40].setRotationPoint(-17F, 35F, -7F);

		m67_grenadeModel[41].addShapeBox(0F, 0F, 0F, 1, 11, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 178
		m67_grenadeModel[41].setRotationPoint(-18F, 38F, -8F);

		m67_grenadeModel[42].addShapeBox(0F, 0F, 0F, 1, 10, 16, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Box 179
		m67_grenadeModel[42].setRotationPoint(-26F, 28F, -8F);

		m67_grenadeModel[43].addShapeBox(0F, 0F, 0F, 1, 38, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		m67_grenadeModel[43].setRotationPoint(-33F, -22F, -5F);

		m67_grenadeModel[44].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		m67_grenadeModel[44].setRotationPoint(3F, 42F, -7F);

		m67_grenadeModel[45].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		m67_grenadeModel[45].setRotationPoint(-10.5F, 42.5F, -10F);
		m67_grenadeModel[45].rotateAngleZ = 0.17453293F;

		m67_grenadeModel[46].addShapeBox(0F, -1F, 0F, 24, 12, 24, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		m67_grenadeModel[46].setRotationPoint(-13F, 13F, -12F);

		m67_grenadeModel[47].addShapeBox(0F, 0F, 0F, 24, 24, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		m67_grenadeModel[47].setRotationPoint(-13F, -12F, -28F);

		m67_grenadeModel[48].addShapeBox(0F, 0F, 0F, 24, 16, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F); // Box 57
		m67_grenadeModel[48].setRotationPoint(-13F, -28F, -12F);

		m67_grenadeModel[49].addShapeBox(0F, 0F, 0F, 16, 24, 24, 0F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F); // Box 58
		m67_grenadeModel[49].setRotationPoint(11F, -12F, -12F);

		m67_grenadeModel[50].addShapeBox(0F, 0F, 0F, 16, 24, 24, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F); // Box 59
		m67_grenadeModel[50].setRotationPoint(-29F, -12F, -12F);

		m67_grenadeModel[51].addShapeBox(0F, 0F, 0F, 16, 16, 12, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		m67_grenadeModel[51].setRotationPoint(11F, -28F, -12F);

		m67_grenadeModel[52].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		m67_grenadeModel[52].setRotationPoint(-26F, 16F, -5F);

		m67_grenadeModel[53].addShapeBox(0F, 0F, 0F, 16, 16, 12, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 0F); // Box 59
		m67_grenadeModel[53].setRotationPoint(-29F, -28F, 0F);

		m67_grenadeModel[54].addShapeBox(0F, 0F, 0F, 16, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 0F, -8F, -6F, 0F, -8F, -6F, 0F, 0F, 0F, 0F); // Box 60
		m67_grenadeModel[54].setRotationPoint(11F, 12F, 0F);

		m67_grenadeModel[55].addShapeBox(0F, 0F, 0F, 16, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -6F, 0F); // Box 61
		m67_grenadeModel[55].setRotationPoint(-29F, 12F, -12F);

		m67_grenadeModel[56].addShapeBox(0F, 0F, 0F, 16, 12, 12, 0F, -16F, 0F, 0F, -8F, -6F, 0F, -8F, -6F, 0F, -16F, 0F, 0F, 0F, -12F, 16F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, -12F, 0F); // Box 64
		m67_grenadeModel[56].setRotationPoint(11F, 12F, -12F);

		m67_grenadeModel[57].addShapeBox(0F, 0F, 0F, 16, 12, 12, 0F, -8F, -6F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -8F, -6F, 0F, -16F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 16F, -16F, 0F, 0F); // Box 65
		m67_grenadeModel[57].setRotationPoint(-29F, 12F, 0F);

		m67_grenadeModel[58].addShapeBox(0F, 0F, 0F, 16, 16, 12, 0F, -16F, 0F, 0F, 0F, -16F, 16F, 0F, -16F, 0F, -16F, 0F, 0F, -8F, -8F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -8F, -8F, 0F); // Box 66
		m67_grenadeModel[58].setRotationPoint(-29F, -28F, -12F);

		m67_grenadeModel[59].addShapeBox(0F, 0F, 0F, 16, 16, 12, 0F, 0F, -16F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, -16F, 16F, -16F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, -16F, 0F, 0F); // Box 67
		m67_grenadeModel[59].setRotationPoint(11F, -28F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		GL11.glScalef(0.04F, 0.04F, 0.04F);

		for(int i = 0; i < 60; i++)
		{
			m67_grenadeModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo m67_grenadeModel[];
}