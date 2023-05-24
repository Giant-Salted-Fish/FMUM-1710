//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M-84 Flash Bomb
// Model Creator:
// Created on:07.10.2019 - 17:58:10
// Last changed on: 07.10.2019 - 17:58:10

package com.flansmod.client.model.Octagon_Weapons;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelM84_Flash_Bomb extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelM84_Flash_Bomb()
	{
		m84_flash_bombModel = new ModelRendererTurbo[178];
		m84_flash_bombModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		m84_flash_bombModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 14
		m84_flash_bombModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 17
		m84_flash_bombModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 18
		m84_flash_bombModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 19
		m84_flash_bombModel[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 20
		m84_flash_bombModel[6] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 21
		m84_flash_bombModel[7] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 32
		m84_flash_bombModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 33
		m84_flash_bombModel[9] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 34
		m84_flash_bombModel[10] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 35
		m84_flash_bombModel[11] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 36
		m84_flash_bombModel[12] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 37
		m84_flash_bombModel[13] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 38
		m84_flash_bombModel[14] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 39
		m84_flash_bombModel[15] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 40
		m84_flash_bombModel[16] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 41
		m84_flash_bombModel[17] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 42
		m84_flash_bombModel[18] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 43
		m84_flash_bombModel[19] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 44
		m84_flash_bombModel[20] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 45
		m84_flash_bombModel[21] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 46
		m84_flash_bombModel[22] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 47
		m84_flash_bombModel[23] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 48
		m84_flash_bombModel[24] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 49
		m84_flash_bombModel[25] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 50
		m84_flash_bombModel[26] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 51
		m84_flash_bombModel[27] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 52
		m84_flash_bombModel[28] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 53
		m84_flash_bombModel[29] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 54
		m84_flash_bombModel[30] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 55
		m84_flash_bombModel[31] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 56
		m84_flash_bombModel[32] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 57
		m84_flash_bombModel[33] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 58
		m84_flash_bombModel[34] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 59
		m84_flash_bombModel[35] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 60
		m84_flash_bombModel[36] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 61
		m84_flash_bombModel[37] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 62
		m84_flash_bombModel[38] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 63
		m84_flash_bombModel[39] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 64
		m84_flash_bombModel[40] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 65
		m84_flash_bombModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 66
		m84_flash_bombModel[42] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 67
		m84_flash_bombModel[43] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 68
		m84_flash_bombModel[44] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 69
		m84_flash_bombModel[45] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 72
		m84_flash_bombModel[46] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 77
		m84_flash_bombModel[47] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 78
		m84_flash_bombModel[48] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 81
		m84_flash_bombModel[49] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 85
		m84_flash_bombModel[50] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 90
		m84_flash_bombModel[51] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 91
		m84_flash_bombModel[52] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 94
		m84_flash_bombModel[53] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 98
		m84_flash_bombModel[54] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 103
		m84_flash_bombModel[55] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 104
		m84_flash_bombModel[56] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 107
		m84_flash_bombModel[57] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 111
		m84_flash_bombModel[58] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 116
		m84_flash_bombModel[59] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 117
		m84_flash_bombModel[60] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 120
		m84_flash_bombModel[61] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 124
		m84_flash_bombModel[62] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 129
		m84_flash_bombModel[63] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 130
		m84_flash_bombModel[64] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 131
		m84_flash_bombModel[65] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 132
		m84_flash_bombModel[66] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 133
		m84_flash_bombModel[67] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 134
		m84_flash_bombModel[68] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 135
		m84_flash_bombModel[69] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 136
		m84_flash_bombModel[70] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 137
		m84_flash_bombModel[71] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 139
		m84_flash_bombModel[72] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 140
		m84_flash_bombModel[73] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 141
		m84_flash_bombModel[74] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 142
		m84_flash_bombModel[75] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 143
		m84_flash_bombModel[76] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 144
		m84_flash_bombModel[77] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 145
		m84_flash_bombModel[78] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 146
		m84_flash_bombModel[79] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 147
		m84_flash_bombModel[80] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 148
		m84_flash_bombModel[81] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 149
		m84_flash_bombModel[82] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 150
		m84_flash_bombModel[83] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 151
		m84_flash_bombModel[84] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 152
		m84_flash_bombModel[85] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 153
		m84_flash_bombModel[86] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 154
		m84_flash_bombModel[87] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 155
		m84_flash_bombModel[88] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 156
		m84_flash_bombModel[89] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 157
		m84_flash_bombModel[90] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 158
		m84_flash_bombModel[91] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 159
		m84_flash_bombModel[92] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 160
		m84_flash_bombModel[93] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 161
		m84_flash_bombModel[94] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 162
		m84_flash_bombModel[95] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 163
		m84_flash_bombModel[96] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 164
		m84_flash_bombModel[97] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 165
		m84_flash_bombModel[98] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 166
		m84_flash_bombModel[99] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 167
		m84_flash_bombModel[100] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 168
		m84_flash_bombModel[101] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 169
		m84_flash_bombModel[102] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 170
		m84_flash_bombModel[103] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 171
		m84_flash_bombModel[104] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 172
		m84_flash_bombModel[105] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 173
		m84_flash_bombModel[106] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 174
		m84_flash_bombModel[107] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 175
		m84_flash_bombModel[108] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Box 176
		m84_flash_bombModel[109] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 177
		m84_flash_bombModel[110] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 178
		m84_flash_bombModel[111] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // Box 179
		m84_flash_bombModel[112] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 180
		m84_flash_bombModel[113] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 181
		m84_flash_bombModel[114] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 182
		m84_flash_bombModel[115] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 183
		m84_flash_bombModel[116] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 184
		m84_flash_bombModel[117] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Box 185
		m84_flash_bombModel[118] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 186
		m84_flash_bombModel[119] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 187
		m84_flash_bombModel[120] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 188
		m84_flash_bombModel[121] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 189
		m84_flash_bombModel[122] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 190
		m84_flash_bombModel[123] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 191
		m84_flash_bombModel[124] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 192
		m84_flash_bombModel[125] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 193
		m84_flash_bombModel[126] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 194
		m84_flash_bombModel[127] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 195
		m84_flash_bombModel[128] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 196
		m84_flash_bombModel[129] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 197
		m84_flash_bombModel[130] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 198
		m84_flash_bombModel[131] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 199
		m84_flash_bombModel[132] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 200
		m84_flash_bombModel[133] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 201
		m84_flash_bombModel[134] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 202
		m84_flash_bombModel[135] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 203
		m84_flash_bombModel[136] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 204
		m84_flash_bombModel[137] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 205
		m84_flash_bombModel[138] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 206
		m84_flash_bombModel[139] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 207
		m84_flash_bombModel[140] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 208
		m84_flash_bombModel[141] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 209
		m84_flash_bombModel[142] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 210
		m84_flash_bombModel[143] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 211
		m84_flash_bombModel[144] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 212
		m84_flash_bombModel[145] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 213
		m84_flash_bombModel[146] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 214
		m84_flash_bombModel[147] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 215
		m84_flash_bombModel[148] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 216
		m84_flash_bombModel[149] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 217
		m84_flash_bombModel[150] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 218
		m84_flash_bombModel[151] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 219
		m84_flash_bombModel[152] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 220
		m84_flash_bombModel[153] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 221
		m84_flash_bombModel[154] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 222
		m84_flash_bombModel[155] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 223
		m84_flash_bombModel[156] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 224
		m84_flash_bombModel[157] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 225
		m84_flash_bombModel[158] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 226
		m84_flash_bombModel[159] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 227
		m84_flash_bombModel[160] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 228
		m84_flash_bombModel[161] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 229
		m84_flash_bombModel[162] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 230
		m84_flash_bombModel[163] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 231
		m84_flash_bombModel[164] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 232
		m84_flash_bombModel[165] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 233
		m84_flash_bombModel[166] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 234
		m84_flash_bombModel[167] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 235
		m84_flash_bombModel[168] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 236
		m84_flash_bombModel[169] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 237
		m84_flash_bombModel[170] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 238
		m84_flash_bombModel[171] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 239
		m84_flash_bombModel[172] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 240
		m84_flash_bombModel[173] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 241
		m84_flash_bombModel[174] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 242
		m84_flash_bombModel[175] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 243
		m84_flash_bombModel[176] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 244
		m84_flash_bombModel[177] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 245

		m84_flash_bombModel[0].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		m84_flash_bombModel[0].setRotationPoint(0F, -39F, 0F);

		m84_flash_bombModel[1].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		m84_flash_bombModel[1].setRotationPoint(0F, -28F, 0F);

		m84_flash_bombModel[2].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		m84_flash_bombModel[2].setRotationPoint(0F, -39F, 0F);
		m84_flash_bombModel[2].rotateAngleY = -1.04719755F;

		m84_flash_bombModel[3].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		m84_flash_bombModel[3].setRotationPoint(0F, -39F, 0F);
		m84_flash_bombModel[3].rotateAngleY = -2.0943951F;

		m84_flash_bombModel[4].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		m84_flash_bombModel[4].setRotationPoint(0F, -39F, 0F);
		m84_flash_bombModel[4].rotateAngleY = -3.14159265F;

		m84_flash_bombModel[5].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		m84_flash_bombModel[5].setRotationPoint(0F, -39F, 0F);
		m84_flash_bombModel[5].rotateAngleY = -4.1887902F;

		m84_flash_bombModel[6].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		m84_flash_bombModel[6].setRotationPoint(0F, -39F, 0F);
		m84_flash_bombModel[6].rotateAngleY = -5.23598776F;

		m84_flash_bombModel[7].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		m84_flash_bombModel[7].setRotationPoint(0F, -11F, 0F);

		m84_flash_bombModel[8].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		m84_flash_bombModel[8].setRotationPoint(0F, 4F, 0F);

		m84_flash_bombModel[9].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		m84_flash_bombModel[9].setRotationPoint(0F, 19F, 0F);

		m84_flash_bombModel[10].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 35
		m84_flash_bombModel[10].setRotationPoint(0F, -28F, 0F);

		m84_flash_bombModel[11].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 36
		m84_flash_bombModel[11].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[11].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[12].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 37
		m84_flash_bombModel[12].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[12].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[13].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 38
		m84_flash_bombModel[13].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[13].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[14].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 39
		m84_flash_bombModel[14].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[14].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[15].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 40
		m84_flash_bombModel[15].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[15].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[16].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		m84_flash_bombModel[16].setRotationPoint(0F, -41F, 0F);
		m84_flash_bombModel[16].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[17].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		m84_flash_bombModel[17].setRotationPoint(0F, -41F, 0F);
		m84_flash_bombModel[17].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[18].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		m84_flash_bombModel[18].setRotationPoint(0F, -41F, 0F);
		m84_flash_bombModel[18].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[19].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		m84_flash_bombModel[19].setRotationPoint(0F, -41F, 0F);
		m84_flash_bombModel[19].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[20].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		m84_flash_bombModel[20].setRotationPoint(0F, -41F, 0F);
		m84_flash_bombModel[20].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[21].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		m84_flash_bombModel[21].setRotationPoint(0F, -41F, 0F);

		m84_flash_bombModel[22].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		m84_flash_bombModel[22].setRotationPoint(0F, 30F, 0F);
		m84_flash_bombModel[22].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[23].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		m84_flash_bombModel[23].setRotationPoint(0F, 30F, 0F);
		m84_flash_bombModel[23].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[24].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		m84_flash_bombModel[24].setRotationPoint(0F, 30F, 0F);
		m84_flash_bombModel[24].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[25].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		m84_flash_bombModel[25].setRotationPoint(0F, 30F, 0F);
		m84_flash_bombModel[25].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[26].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		m84_flash_bombModel[26].setRotationPoint(0F, 30F, 0F);
		m84_flash_bombModel[26].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[27].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		m84_flash_bombModel[27].setRotationPoint(0F, 30F, 0F);

		m84_flash_bombModel[28].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		m84_flash_bombModel[28].setRotationPoint(0F, 32F, 0F);
		m84_flash_bombModel[28].rotateAngleY = -5.23598776F;

		m84_flash_bombModel[29].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		m84_flash_bombModel[29].setRotationPoint(0F, 32F, 0F);

		m84_flash_bombModel[30].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		m84_flash_bombModel[30].setRotationPoint(0F, 32F, 0F);
		m84_flash_bombModel[30].rotateAngleY = -1.04719755F;

		m84_flash_bombModel[31].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		m84_flash_bombModel[31].setRotationPoint(0F, 32F, 0F);
		m84_flash_bombModel[31].rotateAngleY = -2.0943951F;

		m84_flash_bombModel[32].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		m84_flash_bombModel[32].setRotationPoint(0F, 32F, 0F);
		m84_flash_bombModel[32].rotateAngleY = -3.14159265F;

		m84_flash_bombModel[33].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		m84_flash_bombModel[33].setRotationPoint(0F, 32F, 0F);
		m84_flash_bombModel[33].rotateAngleY = -4.1887902F;

		m84_flash_bombModel[34].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 59
		m84_flash_bombModel[34].setRotationPoint(0F, 43F, 0F);
		m84_flash_bombModel[34].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[35].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 60
		m84_flash_bombModel[35].setRotationPoint(0F, 43F, 0F);
		m84_flash_bombModel[35].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[36].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 61
		m84_flash_bombModel[36].setRotationPoint(0F, 43F, 0F);
		m84_flash_bombModel[36].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[37].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 62
		m84_flash_bombModel[37].setRotationPoint(0F, 43F, 0F);

		m84_flash_bombModel[38].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 63
		m84_flash_bombModel[38].setRotationPoint(0F, 43F, 0F);
		m84_flash_bombModel[38].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[39].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 64
		m84_flash_bombModel[39].setRotationPoint(0F, 43F, 0F);
		m84_flash_bombModel[39].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[40].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		m84_flash_bombModel[40].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[40].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[41].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		m84_flash_bombModel[41].setRotationPoint(0F, -19F, 0F);
		m84_flash_bombModel[41].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[42].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		m84_flash_bombModel[42].setRotationPoint(0F, -17F, 0F);
		m84_flash_bombModel[42].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[43].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		m84_flash_bombModel[43].setRotationPoint(0F, -11F, 0F);
		m84_flash_bombModel[43].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[44].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 69
		m84_flash_bombModel[44].setRotationPoint(0F, -13F, 0F);
		m84_flash_bombModel[44].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[45].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		m84_flash_bombModel[45].setRotationPoint(0F, 4F, 0F);
		m84_flash_bombModel[45].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[46].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		m84_flash_bombModel[46].setRotationPoint(0F, 19F, 0F);
		m84_flash_bombModel[46].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[47].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		m84_flash_bombModel[47].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[47].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[48].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		m84_flash_bombModel[48].setRotationPoint(0F, -11F, 0F);
		m84_flash_bombModel[48].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[49].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		m84_flash_bombModel[49].setRotationPoint(0F, 4F, 0F);
		m84_flash_bombModel[49].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[50].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		m84_flash_bombModel[50].setRotationPoint(0F, 19F, 0F);
		m84_flash_bombModel[50].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[51].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		m84_flash_bombModel[51].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[51].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[52].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		m84_flash_bombModel[52].setRotationPoint(0F, -11F, 0F);
		m84_flash_bombModel[52].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[53].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		m84_flash_bombModel[53].setRotationPoint(0F, 4F, 0F);
		m84_flash_bombModel[53].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[54].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		m84_flash_bombModel[54].setRotationPoint(0F, 19F, 0F);
		m84_flash_bombModel[54].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[55].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		m84_flash_bombModel[55].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[55].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[56].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		m84_flash_bombModel[56].setRotationPoint(0F, -11F, 0F);
		m84_flash_bombModel[56].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[57].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		m84_flash_bombModel[57].setRotationPoint(0F, 4F, 0F);
		m84_flash_bombModel[57].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[58].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		m84_flash_bombModel[58].setRotationPoint(0F, 19F, 0F);
		m84_flash_bombModel[58].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[59].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		m84_flash_bombModel[59].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[59].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[60].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		m84_flash_bombModel[60].setRotationPoint(0F, -11F, 0F);
		m84_flash_bombModel[60].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[61].addShapeBox(12F, 0F, -7.5F, 1, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		m84_flash_bombModel[61].setRotationPoint(0F, 4F, 0F);
		m84_flash_bombModel[61].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[62].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		m84_flash_bombModel[62].setRotationPoint(0F, 19F, 0F);
		m84_flash_bombModel[62].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[63].addShapeBox(-9F, 0F, -5F, 18, 56, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		m84_flash_bombModel[63].setRotationPoint(0F, -28F, 0F);

		m84_flash_bombModel[64].addShapeBox(-9F, 0F, -5F, 18, 56, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		m84_flash_bombModel[64].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[64].rotateAngleY = -1.04719755F;

		m84_flash_bombModel[65].addShapeBox(-9F, 0F, -5F, 18, 56, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		m84_flash_bombModel[65].setRotationPoint(0F, -28F, 0F);
		m84_flash_bombModel[65].rotateAngleY = -2.0943951F;

		m84_flash_bombModel[66].addShapeBox(-13F, 0F, -7.5F, 26, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		m84_flash_bombModel[66].setRotationPoint(0F, 43F, 0F);

		m84_flash_bombModel[67].addShapeBox(-13F, 0F, -7.5F, 26, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		m84_flash_bombModel[67].setRotationPoint(0F, 43F, 0F);
		m84_flash_bombModel[67].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[68].addShapeBox(-13F, 0F, -7.5F, 26, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		m84_flash_bombModel[68].setRotationPoint(0F, 43F, 0F);
		m84_flash_bombModel[68].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		m84_flash_bombModel[69].setRotationPoint(-3F, 46F, -8F);

		m84_flash_bombModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 137
		m84_flash_bombModel[70].setRotationPoint(3F, 46F, -8F);

		m84_flash_bombModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 139
		m84_flash_bombModel[71].setRotationPoint(-8F, 46F, -8F);

		m84_flash_bombModel[72].addShapeBox(0F, 0F, 0F, 13, 12, 14, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		m84_flash_bombModel[72].setRotationPoint(-10F, 51F, -7F);

		m84_flash_bombModel[73].addShapeBox(0F, 0F, 0F, 6, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		m84_flash_bombModel[73].setRotationPoint(-3F, 47F, -8F);

		m84_flash_bombModel[74].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F); // Box 142
		m84_flash_bombModel[74].setRotationPoint(3F, 47F, -8F);

		m84_flash_bombModel[75].addShapeBox(0F, 0F, 0F, 4, 14, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 143
		m84_flash_bombModel[75].setRotationPoint(3F, 49F, -7F);

		m84_flash_bombModel[76].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F); // Box 144
		m84_flash_bombModel[76].setRotationPoint(-8F, 47F, -8F);

		m84_flash_bombModel[77].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		m84_flash_bombModel[77].setRotationPoint(7F, 60F, -2.5F);

		m84_flash_bombModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		m84_flash_bombModel[78].setRotationPoint(9F, 61F, -6F);

		m84_flash_bombModel[79].addShapeBox(0F, 0F, 0F, 17, 1, 16, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		m84_flash_bombModel[79].setRotationPoint(-10F, 63F, -8F);

		m84_flash_bombModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		m84_flash_bombModel[80].setRotationPoint(10F, 59F, -7F);

		m84_flash_bombModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		m84_flash_bombModel[81].setRotationPoint(9F, 60F, -6F);

		m84_flash_bombModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 150
		m84_flash_bombModel[82].setRotationPoint(9F, 62F, -6F);

		m84_flash_bombModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 151
		m84_flash_bombModel[83].setRotationPoint(11F, 59F, -7F);

		m84_flash_bombModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 152
		m84_flash_bombModel[84].setRotationPoint(9F, 59F, -7F);

		m84_flash_bombModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		m84_flash_bombModel[85].setRotationPoint(7F, 61F, -7F);

		m84_flash_bombModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		m84_flash_bombModel[86].setRotationPoint(7F, 63F, -7F);

		m84_flash_bombModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		m84_flash_bombModel[87].setRotationPoint(7F, 63F, 3F);

		m84_flash_bombModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		m84_flash_bombModel[88].setRotationPoint(7F, 61F, 3F);

		m84_flash_bombModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 157
		m84_flash_bombModel[89].setRotationPoint(9F, 59F, 3F);

		m84_flash_bombModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		m84_flash_bombModel[90].setRotationPoint(10F, 59F, 3F);

		m84_flash_bombModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 159
		m84_flash_bombModel[91].setRotationPoint(11F, 59F, 3F);

		m84_flash_bombModel[92].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		m84_flash_bombModel[92].setRotationPoint(-9F, 62F, -8F);

		m84_flash_bombModel[93].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		m84_flash_bombModel[93].setRotationPoint(-9F, 61F, -8F);

		m84_flash_bombModel[94].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		m84_flash_bombModel[94].setRotationPoint(-9F, 61F, 7F);

		m84_flash_bombModel[95].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		m84_flash_bombModel[95].setRotationPoint(-9F, 62F, 7F);

		m84_flash_bombModel[96].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 6F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		m84_flash_bombModel[96].setRotationPoint(-11F, 56F, 7F);

		m84_flash_bombModel[97].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 165
		m84_flash_bombModel[97].setRotationPoint(-10.5F, 57.5F, 10F);
		m84_flash_bombModel[97].rotateAngleZ = 0.17453293F;

		m84_flash_bombModel[98].addShapeBox(-0.5F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		m84_flash_bombModel[98].setRotationPoint(-10.5F, 57.5F, -12F);
		m84_flash_bombModel[98].rotateAngleZ = -0.17453293F;

		m84_flash_bombModel[99].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 6F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		m84_flash_bombModel[99].setRotationPoint(-11F, 56F, -8F);

		m84_flash_bombModel[100].addShapeBox(-4F, -0.5F, -0.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		m84_flash_bombModel[100].setRotationPoint(-10.5F, 57.5F, -11F);
		m84_flash_bombModel[100].rotateAngleX = -2.37364778F;
		m84_flash_bombModel[100].rotateAngleZ = -0.17453293F;

		m84_flash_bombModel[101].addShapeBox(4F, -0.5F, -0.5F, 7, 7, 1, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F); // Box 169
		m84_flash_bombModel[101].setRotationPoint(-10.5F, 57.5F, -11F);
		m84_flash_bombModel[101].rotateAngleX = -2.37364778F;
		m84_flash_bombModel[101].rotateAngleZ = -0.17453293F;

		m84_flash_bombModel[102].addShapeBox(-11F, -0.5F, -0.5F, 7, 7, 1, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F); // Box 170
		m84_flash_bombModel[102].setRotationPoint(-10.5F, 57.5F, -11F);
		m84_flash_bombModel[102].rotateAngleX = -2.37364778F;
		m84_flash_bombModel[102].rotateAngleZ = -0.17453293F;

		m84_flash_bombModel[103].addShapeBox(-11F, 6.5F, -0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		m84_flash_bombModel[103].setRotationPoint(-10.5F, 57.5F, -11F);
		m84_flash_bombModel[103].rotateAngleX = -2.37364778F;
		m84_flash_bombModel[103].rotateAngleZ = -0.17453293F;

		m84_flash_bombModel[104].addShapeBox(10F, 6.5F, -0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		m84_flash_bombModel[104].setRotationPoint(-10.5F, 57.5F, -11F);
		m84_flash_bombModel[104].rotateAngleX = -2.37364778F;
		m84_flash_bombModel[104].rotateAngleZ = -0.17453293F;

		m84_flash_bombModel[105].addShapeBox(4F, 13.5F, -0.5F, 7, 7, 1, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 173
		m84_flash_bombModel[105].setRotationPoint(-10.5F, 57.5F, -11F);
		m84_flash_bombModel[105].rotateAngleX = -2.37364778F;
		m84_flash_bombModel[105].rotateAngleZ = -0.17453293F;

		m84_flash_bombModel[106].addShapeBox(-11F, 13.5F, -0.5F, 7, 7, 1, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 174
		m84_flash_bombModel[106].setRotationPoint(-10.5F, 57.5F, -11F);
		m84_flash_bombModel[106].rotateAngleX = -2.37364778F;
		m84_flash_bombModel[106].rotateAngleZ = -0.17453293F;

		m84_flash_bombModel[107].addShapeBox(-4F, 19.5F, -0.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		m84_flash_bombModel[107].setRotationPoint(-10.5F, 57.5F, -11F);
		m84_flash_bombModel[107].rotateAngleX = -2.37364778F;
		m84_flash_bombModel[107].rotateAngleZ = -0.17453293F;

		m84_flash_bombModel[108].addShapeBox(0F, 0F, 0F, 19, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 176
		m84_flash_bombModel[108].setRotationPoint(-16F, 49F, -7F);

		m84_flash_bombModel[109].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		m84_flash_bombModel[109].setRotationPoint(-17F, 50F, -7F);

		m84_flash_bombModel[110].addShapeBox(0F, 0F, 0F, 1, 11, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 178
		m84_flash_bombModel[110].setRotationPoint(-18F, 52F, -8F);

		m84_flash_bombModel[111].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 179
		m84_flash_bombModel[111].setRotationPoint(-25F, 46F, -8F);

		m84_flash_bombModel[112].addShapeBox(0F, 0F, 0F, 1, 51, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		m84_flash_bombModel[112].setRotationPoint(-25F, -5F, -5F);

		m84_flash_bombModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		m84_flash_bombModel[113].setRotationPoint(-25F, -7F, -5F);

		m84_flash_bombModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		m84_flash_bombModel[114].setRotationPoint(-23F, -7F, -5F);

		m84_flash_bombModel[115].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 183
		m84_flash_bombModel[115].setRotationPoint(-22F, -7F, -5F);

		m84_flash_bombModel[116].addShapeBox(2F, 0.5F, -0.5F, 2, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F); // Box 184
		m84_flash_bombModel[116].setRotationPoint(0.5F, 59.5F, -11F);
		m84_flash_bombModel[116].rotateAngleX = 3.61283155F;

		m84_flash_bombModel[117].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		m84_flash_bombModel[117].setRotationPoint(3F, 57F, -7F);

		m84_flash_bombModel[118].addShapeBox(-4F, -0.5F, -0.5F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		m84_flash_bombModel[118].setRotationPoint(0.5F, 59.5F, -11F);
		m84_flash_bombModel[118].rotateAngleX = 3.61283155F;

		m84_flash_bombModel[119].addShapeBox(-15F, 21.5F, -0.5F, 30, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		m84_flash_bombModel[119].setRotationPoint(0.5F, 59.5F, -11F);
		m84_flash_bombModel[119].rotateAngleX = 3.61283155F;

		m84_flash_bombModel[120].addShapeBox(14F, 19.5F, -0.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 188
		m84_flash_bombModel[120].setRotationPoint(0.5F, 59.5F, -11F);
		m84_flash_bombModel[120].rotateAngleX = 3.61283155F;

		m84_flash_bombModel[121].addShapeBox(-16F, 19.5F, -0.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 189
		m84_flash_bombModel[121].setRotationPoint(0.5F, 59.5F, -11F);
		m84_flash_bombModel[121].rotateAngleX = 3.61283155F;

		m84_flash_bombModel[122].addShapeBox(-4F, 0.5F, -0.5F, 2, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F); // Box 190
		m84_flash_bombModel[122].setRotationPoint(0.5F, 59.5F, -11F);
		m84_flash_bombModel[122].rotateAngleX = 3.61283155F;

		m84_flash_bombModel[123].addShapeBox(-0.5F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		m84_flash_bombModel[123].setRotationPoint(0.5F, 59.5F, -12F);

		m84_flash_bombModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		m84_flash_bombModel[124].setRotationPoint(0F, 59F, -10F);

		m84_flash_bombModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		m84_flash_bombModel[125].setRotationPoint(0F, 59F, 8F);

		m84_flash_bombModel[126].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		m84_flash_bombModel[126].setRotationPoint(-10.5F, 57.5F, -10F);
		m84_flash_bombModel[126].rotateAngleZ = 0.17453293F;

		m84_flash_bombModel[127].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		m84_flash_bombModel[127].setRotationPoint(0F, -19F, 0F);

		m84_flash_bombModel[128].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		m84_flash_bombModel[128].setRotationPoint(0F, -17F, 0F);

		m84_flash_bombModel[129].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 197
		m84_flash_bombModel[129].setRotationPoint(0F, -13F, 0F);

		m84_flash_bombModel[130].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		m84_flash_bombModel[130].setRotationPoint(0F, -19F, 0F);
		m84_flash_bombModel[130].rotateAngleY = -1.04719755F;

		m84_flash_bombModel[131].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		m84_flash_bombModel[131].setRotationPoint(0F, -17F, 0F);
		m84_flash_bombModel[131].rotateAngleY = -1.04719755F;

		m84_flash_bombModel[132].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 200
		m84_flash_bombModel[132].setRotationPoint(0F, -13F, 0F);
		m84_flash_bombModel[132].rotateAngleY = -1.04719755F;

		m84_flash_bombModel[133].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		m84_flash_bombModel[133].setRotationPoint(0F, -19F, 0F);
		m84_flash_bombModel[133].rotateAngleY = -2.0943951F;

		m84_flash_bombModel[134].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		m84_flash_bombModel[134].setRotationPoint(0F, -17F, 0F);
		m84_flash_bombModel[134].rotateAngleY = -2.0943951F;

		m84_flash_bombModel[135].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 203
		m84_flash_bombModel[135].setRotationPoint(0F, -13F, 0F);
		m84_flash_bombModel[135].rotateAngleY = -2.0943951F;

		m84_flash_bombModel[136].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		m84_flash_bombModel[136].setRotationPoint(0F, -19F, 0F);
		m84_flash_bombModel[136].rotateAngleY = -3.14159265F;

		m84_flash_bombModel[137].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		m84_flash_bombModel[137].setRotationPoint(0F, -17F, 0F);
		m84_flash_bombModel[137].rotateAngleY = -3.14159265F;

		m84_flash_bombModel[138].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 206
		m84_flash_bombModel[138].setRotationPoint(0F, -13F, 0F);
		m84_flash_bombModel[138].rotateAngleY = -3.14159265F;

		m84_flash_bombModel[139].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		m84_flash_bombModel[139].setRotationPoint(0F, -4F, 0F);
		m84_flash_bombModel[139].rotateAngleY = -2.0943951F;

		m84_flash_bombModel[140].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		m84_flash_bombModel[140].setRotationPoint(0F, -2F, 0F);
		m84_flash_bombModel[140].rotateAngleY = -2.0943951F;

		m84_flash_bombModel[141].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 209
		m84_flash_bombModel[141].setRotationPoint(0F, 2F, 0F);
		m84_flash_bombModel[141].rotateAngleY = -2.0943951F;

		m84_flash_bombModel[142].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		m84_flash_bombModel[142].setRotationPoint(0F, -4F, 0F);
		m84_flash_bombModel[142].rotateAngleY = -1.04719755F;

		m84_flash_bombModel[143].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		m84_flash_bombModel[143].setRotationPoint(0F, -2F, 0F);
		m84_flash_bombModel[143].rotateAngleY = -1.04719755F;

		m84_flash_bombModel[144].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 212
		m84_flash_bombModel[144].setRotationPoint(0F, 2F, 0F);
		m84_flash_bombModel[144].rotateAngleY = -1.04719755F;

		m84_flash_bombModel[145].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		m84_flash_bombModel[145].setRotationPoint(0F, -4F, 0F);

		m84_flash_bombModel[146].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		m84_flash_bombModel[146].setRotationPoint(0F, -2F, 0F);

		m84_flash_bombModel[147].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 215
		m84_flash_bombModel[147].setRotationPoint(0F, 2F, 0F);

		m84_flash_bombModel[148].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		m84_flash_bombModel[148].setRotationPoint(0F, -4F, 0F);
		m84_flash_bombModel[148].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[149].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		m84_flash_bombModel[149].setRotationPoint(0F, -2F, 0F);
		m84_flash_bombModel[149].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[150].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 218
		m84_flash_bombModel[150].setRotationPoint(0F, 2F, 0F);
		m84_flash_bombModel[150].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[151].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		m84_flash_bombModel[151].setRotationPoint(0F, -4F, 0F);
		m84_flash_bombModel[151].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[152].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		m84_flash_bombModel[152].setRotationPoint(0F, -2F, 0F);
		m84_flash_bombModel[152].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[153].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 221
		m84_flash_bombModel[153].setRotationPoint(0F, 2F, 0F);
		m84_flash_bombModel[153].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[154].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		m84_flash_bombModel[154].setRotationPoint(0F, -4F, 0F);
		m84_flash_bombModel[154].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[155].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		m84_flash_bombModel[155].setRotationPoint(0F, -2F, 0F);
		m84_flash_bombModel[155].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[156].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 224
		m84_flash_bombModel[156].setRotationPoint(0F, 2F, 0F);
		m84_flash_bombModel[156].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[157].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		m84_flash_bombModel[157].setRotationPoint(0F, 11F, 0F);
		m84_flash_bombModel[157].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[158].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		m84_flash_bombModel[158].setRotationPoint(0F, 13F, 0F);
		m84_flash_bombModel[158].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[159].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 227
		m84_flash_bombModel[159].setRotationPoint(0F, 17F, 0F);
		m84_flash_bombModel[159].rotateAngleY = 3.14159265F;

		m84_flash_bombModel[160].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		m84_flash_bombModel[160].setRotationPoint(0F, 11F, 0F);
		m84_flash_bombModel[160].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[161].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		m84_flash_bombModel[161].setRotationPoint(0F, 13F, 0F);
		m84_flash_bombModel[161].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[162].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 230
		m84_flash_bombModel[162].setRotationPoint(0F, 17F, 0F);
		m84_flash_bombModel[162].rotateAngleY = 4.1887902F;

		m84_flash_bombModel[163].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		m84_flash_bombModel[163].setRotationPoint(0F, 11F, 0F);
		m84_flash_bombModel[163].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[164].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		m84_flash_bombModel[164].setRotationPoint(0F, 13F, 0F);
		m84_flash_bombModel[164].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[165].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 233
		m84_flash_bombModel[165].setRotationPoint(0F, 17F, 0F);
		m84_flash_bombModel[165].rotateAngleY = 5.23598776F;

		m84_flash_bombModel[166].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		m84_flash_bombModel[166].setRotationPoint(0F, 11F, 0F);
		m84_flash_bombModel[166].rotateAngleY = 6.28318531F;

		m84_flash_bombModel[167].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		m84_flash_bombModel[167].setRotationPoint(0F, 13F, 0F);
		m84_flash_bombModel[167].rotateAngleY = 6.28318531F;

		m84_flash_bombModel[168].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 236
		m84_flash_bombModel[168].setRotationPoint(0F, 17F, 0F);
		m84_flash_bombModel[168].rotateAngleY = 6.28318531F;

		m84_flash_bombModel[169].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		m84_flash_bombModel[169].setRotationPoint(0F, 11F, 0F);
		m84_flash_bombModel[169].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[170].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		m84_flash_bombModel[170].setRotationPoint(0F, 13F, 0F);
		m84_flash_bombModel[170].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[171].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 239
		m84_flash_bombModel[171].setRotationPoint(0F, 17F, 0F);
		m84_flash_bombModel[171].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[172].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		m84_flash_bombModel[172].setRotationPoint(0F, 11F, 0F);
		m84_flash_bombModel[172].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[173].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		m84_flash_bombModel[173].setRotationPoint(0F, 13F, 0F);
		m84_flash_bombModel[173].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[174].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 242
		m84_flash_bombModel[174].setRotationPoint(0F, 17F, 0F);
		m84_flash_bombModel[174].rotateAngleY = 1.04719755F;

		m84_flash_bombModel[175].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		m84_flash_bombModel[175].setRotationPoint(0F, -19F, 0F);
		m84_flash_bombModel[175].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[176].addShapeBox(12F, 0F, -2.5F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		m84_flash_bombModel[176].setRotationPoint(0F, -17F, 0F);
		m84_flash_bombModel[176].rotateAngleY = 2.0943951F;

		m84_flash_bombModel[177].addShapeBox(12F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 245
		m84_flash_bombModel[177].setRotationPoint(0F, -13F, 0F);
		m84_flash_bombModel[177].rotateAngleY = 2.0943951F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		GL11.glScalef(0.04F, 0.04F, 0.04F);

		for(int i = 0; i < 178; i++)
		{
			m84_flash_bombModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo m84_flash_bombModel[];
}