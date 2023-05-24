//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PG-7VS
// Model Creator:
// Created on:08.10.2019 - 17:19:41
// Last changed on: 08.10.2019 - 17:19:41

package com.flansmod.client.model.Octagon_Weapons;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelPG7VS extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelPG7VS()
	{
		pg7vsModel = new ModelRendererTurbo[46];
		pg7vsModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		pg7vsModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		pg7vsModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		pg7vsModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		pg7vsModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 5
		pg7vsModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
		pg7vsModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 7
		pg7vsModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8
		pg7vsModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 9
		pg7vsModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 10
		pg7vsModel[10] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 11
		pg7vsModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 12
		pg7vsModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 13
		pg7vsModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 14
		pg7vsModel[14] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 15
		pg7vsModel[15] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 16
		pg7vsModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 17
		pg7vsModel[17] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 18
		pg7vsModel[18] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		pg7vsModel[19] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 20
		pg7vsModel[20] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 21
		pg7vsModel[21] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 22
		pg7vsModel[22] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 23
		pg7vsModel[23] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 24
		pg7vsModel[24] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 25
		pg7vsModel[25] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 26
		pg7vsModel[26] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 27
		pg7vsModel[27] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 28
		pg7vsModel[28] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 29
		pg7vsModel[29] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 30
		pg7vsModel[30] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 31
		pg7vsModel[31] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		pg7vsModel[32] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 33
		pg7vsModel[33] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 34
		pg7vsModel[34] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 35
		pg7vsModel[35] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 36
		pg7vsModel[36] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 37
		pg7vsModel[37] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 38
		pg7vsModel[38] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 39
		pg7vsModel[39] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 40
		pg7vsModel[40] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 41
		pg7vsModel[41] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 42
		pg7vsModel[42] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 43
		pg7vsModel[43] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 44
		pg7vsModel[44] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 45
		pg7vsModel[45] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 46

		pg7vsModel[0].addShapeBox(0F, 0F, 0F, 16, 25, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		pg7vsModel[0].setRotationPoint(-8F, 128F, -3F);

		pg7vsModel[1].addShapeBox(0F, 0F, 0F, 16, 25, 5, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		pg7vsModel[1].setRotationPoint(-8F, 128F, -8F);

		pg7vsModel[2].addShapeBox(0F, 0F, 0F, 16, 25, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 2
		pg7vsModel[2].setRotationPoint(-8F, 128F, 3F);

		pg7vsModel[3].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 4
		pg7vsModel[3].setRotationPoint(-3F, 179F, 1F);

		pg7vsModel[4].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		pg7vsModel[4].setRotationPoint(-3F, 179F, -1F);

		pg7vsModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		pg7vsModel[5].setRotationPoint(-3F, 179F, -3F);

		pg7vsModel[6].addShapeBox(0F, 0F, 0F, 6, 26, 2, 0F, 5F, 0F, -2F, 5F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 7
		pg7vsModel[6].setRotationPoint(-3F, 153F, 1F);

		pg7vsModel[7].addShapeBox(0F, 0F, 0F, 6, 26, 2, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 5F, 0F, -2F, 5F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		pg7vsModel[7].setRotationPoint(-3F, 153F, -3F);

		pg7vsModel[8].addShapeBox(0F, 0F, 0F, 6, 26, 2, 0F, 5F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		pg7vsModel[8].setRotationPoint(-3F, 153F, -1F);

		pg7vsModel[9].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		pg7vsModel[9].setRotationPoint(-2.5F, 182F, -1.5F);

		pg7vsModel[10].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		pg7vsModel[10].setRotationPoint(-2.5F, 182F, -2.5F);

		pg7vsModel[11].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		pg7vsModel[11].setRotationPoint(-2.5F, 182F, 1.5F);

		pg7vsModel[12].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 1F); // Box 13
		pg7vsModel[12].setRotationPoint(-4F, 115F, -2F);

		pg7vsModel[13].addShapeBox(0F, 0F, 0F, 8, 74, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		pg7vsModel[13].setRotationPoint(-4F, 41F, -2F);

		pg7vsModel[14].addShapeBox(0F, 0F, 0F, 8, 74, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		pg7vsModel[14].setRotationPoint(-4F, 41F, -4F);

		pg7vsModel[15].addShapeBox(0F, 0F, 0F, 8, 74, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 16
		pg7vsModel[15].setRotationPoint(-4F, 41F, 2F);

		pg7vsModel[16].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, -1F, 4F, 0F, -1F, -1F, 0F, 4F, -1F, 0F, 4F); // Box 17
		pg7vsModel[16].setRotationPoint(-4F, 115F, 2F);

		pg7vsModel[17].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, 4F, 0F, -1F, 4F, 0F, -1F); // Box 18
		pg7vsModel[17].setRotationPoint(-4F, 115F, -4F);

		pg7vsModel[18].addShapeBox(-6F, 0F, -0.5F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 19
		pg7vsModel[18].setRotationPoint(0F, 101F, 0F);

		pg7vsModel[19].addShapeBox(-6F, 0F, -0.5F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 20
		pg7vsModel[19].setRotationPoint(0F, 101F, 0F);
		pg7vsModel[19].rotateAngleY = 1.04719755F;

		pg7vsModel[20].addShapeBox(-6F, 0F, -0.5F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 21
		pg7vsModel[20].setRotationPoint(0F, 101F, 0F);
		pg7vsModel[20].rotateAngleY = 2.0943951F;

		pg7vsModel[21].addShapeBox(-6F, 0F, -0.5F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 22
		pg7vsModel[21].setRotationPoint(0F, 101F, 0F);
		pg7vsModel[21].rotateAngleY = 3.14159265F;

		pg7vsModel[22].addShapeBox(-6F, 0F, -0.5F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 23
		pg7vsModel[22].setRotationPoint(0F, 101F, 0F);
		pg7vsModel[22].rotateAngleY = 4.1887902F;

		pg7vsModel[23].addShapeBox(-6F, 0F, -0.5F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 24
		pg7vsModel[23].setRotationPoint(0F, 101F, 0F);
		pg7vsModel[23].rotateAngleY = 5.23598776F;

		pg7vsModel[24].addShapeBox(0F, 0F, 0F, 4, 52, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		pg7vsModel[24].setRotationPoint(-2F, -11F, -1F);

		pg7vsModel[25].addShapeBox(0F, 0F, 0F, 4, 52, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 26
		pg7vsModel[25].setRotationPoint(-2F, -11F, 1F);

		pg7vsModel[26].addShapeBox(0F, 0F, 0F, 4, 52, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		pg7vsModel[26].setRotationPoint(-2F, -11F, -2F);

		pg7vsModel[27].addShapeBox(-0.5F, 0F, 0F, 1, 3, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		pg7vsModel[27].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[27].rotateAngleX = 0.10471976F;
		pg7vsModel[27].rotateAngleY = 0.78539816F;

		pg7vsModel[28].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		pg7vsModel[28].setRotationPoint(-3F, -17F, -1F);

		pg7vsModel[29].addShapeBox(-0.5F, 0F, 34F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 30
		pg7vsModel[29].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[29].rotateAngleX = 0.10471976F;
		pg7vsModel[29].rotateAngleY = 0.78539816F;

		pg7vsModel[30].addShapeBox(-0.5F, 0F, 39F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		pg7vsModel[30].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[30].rotateAngleX = 0.10471976F;
		pg7vsModel[30].rotateAngleY = 0.78539816F;

		pg7vsModel[31].addShapeBox(-0.5F, 0F, 0F, 1, 3, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		pg7vsModel[31].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[31].rotateAngleX = 0.10471976F;
		pg7vsModel[31].rotateAngleY = 2.35619449F;

		pg7vsModel[32].addShapeBox(-0.5F, 0F, 34F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 33
		pg7vsModel[32].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[32].rotateAngleX = 0.10471976F;
		pg7vsModel[32].rotateAngleY = 2.35619449F;

		pg7vsModel[33].addShapeBox(-0.5F, 0F, 39F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		pg7vsModel[33].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[33].rotateAngleX = 0.10471976F;
		pg7vsModel[33].rotateAngleY = 2.35619449F;

		pg7vsModel[34].addShapeBox(-0.5F, 0F, 0F, 1, 3, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		pg7vsModel[34].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[34].rotateAngleX = 0.10471976F;
		pg7vsModel[34].rotateAngleY = 3.92699082F;

		pg7vsModel[35].addShapeBox(-0.5F, 0F, 34F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 36
		pg7vsModel[35].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[35].rotateAngleX = 0.10471976F;
		pg7vsModel[35].rotateAngleY = 3.92699082F;

		pg7vsModel[36].addShapeBox(-0.5F, 0F, 39F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		pg7vsModel[36].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[36].rotateAngleX = 0.10471976F;
		pg7vsModel[36].rotateAngleY = 3.92699082F;

		pg7vsModel[37].addShapeBox(-0.5F, 0F, 0F, 1, 3, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		pg7vsModel[37].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[37].rotateAngleX = 0.10471976F;
		pg7vsModel[37].rotateAngleY = 5.49778714F;

		pg7vsModel[38].addShapeBox(-0.5F, 0F, 34F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 39
		pg7vsModel[38].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[38].rotateAngleX = 0.10471976F;
		pg7vsModel[38].rotateAngleY = 5.49778714F;

		pg7vsModel[39].addShapeBox(-0.5F, 0F, 39F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		pg7vsModel[39].setRotationPoint(0F, 9F, 0F);
		pg7vsModel[39].rotateAngleX = 0.10471976F;
		pg7vsModel[39].rotateAngleY = 5.49778714F;

		pg7vsModel[40].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		pg7vsModel[40].setRotationPoint(-3F, -17F, -3F);

		pg7vsModel[41].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 42
		pg7vsModel[41].setRotationPoint(-3F, -17F, 1F);

		pg7vsModel[42].addShapeBox(2F, 0F, -1.5F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 43
		pg7vsModel[42].setRotationPoint(0F, -17F, 0F);

		pg7vsModel[43].addShapeBox(2F, 0F, -1.5F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 44
		pg7vsModel[43].setRotationPoint(0F, -17F, 0F);
		pg7vsModel[43].rotateAngleY = -1.57079633F;

		pg7vsModel[44].addShapeBox(2F, 0F, -1.5F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 45
		pg7vsModel[44].setRotationPoint(0F, -17F, 0F);
		pg7vsModel[44].rotateAngleY = -3.14159265F;

		pg7vsModel[45].addShapeBox(2F, 0F, -1.5F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 46
		pg7vsModel[45].setRotationPoint(0F, -17F, 0F);
		pg7vsModel[45].rotateAngleY = -4.71238898F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		GL11.glScalef(0.1F, 0.1F, 0.1F);

		for(int i = 0; i < 46; i++)
		{
			pg7vsModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo pg7vsModel[];
}