//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RVG Grip
// Model Creator: 
// Created on: 03.10.2019 - 20:52:35
// Last changed on: 03.10.2019 - 20:52:35

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelRVGGrip extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelRVGGrip() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[41];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		attachmentModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		attachmentModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 9
		attachmentModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
		attachmentModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 12
		attachmentModel[7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 13
		attachmentModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 14
		attachmentModel[9] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 15
		attachmentModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 16
		attachmentModel[11] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 17
		attachmentModel[12] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 18
		attachmentModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 20
		attachmentModel[14] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 21
		attachmentModel[15] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 23
		attachmentModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
		attachmentModel[17] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 26
		attachmentModel[18] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 27
		attachmentModel[19] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 28
		attachmentModel[20] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 29
		attachmentModel[21] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 30
		attachmentModel[22] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 26
		attachmentModel[23] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 27
		attachmentModel[24] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 28
		attachmentModel[25] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 29
		attachmentModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 30
		attachmentModel[27] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 31
		attachmentModel[28] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 32
		attachmentModel[29] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 33
		attachmentModel[30] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 34
		attachmentModel[31] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 35
		attachmentModel[32] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 37
		attachmentModel[33] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 38
		attachmentModel[34] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 39
		attachmentModel[35] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 40
		attachmentModel[36] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 41
		attachmentModel[37] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 42
		attachmentModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 43
		attachmentModel[39] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 44
		attachmentModel[40] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 45

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		attachmentModel[0].setRotationPoint(-3.5F, 0F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 2
		attachmentModel[1].setRotationPoint(5.5F, 0F, -3F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 3
		attachmentModel[2].setRotationPoint(-5.5F, 0F, -3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		attachmentModel[3].setRotationPoint(-3.5F, -1F, 3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 9
		attachmentModel[4].setRotationPoint(-3.5F, -1F, -4F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 11
		attachmentModel[5].setRotationPoint(-2.5F, 1F, -4F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, 0F); // Box 12
		attachmentModel[6].setRotationPoint(5.5F, 1F, -3F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -1F); // Box 13
		attachmentModel[7].setRotationPoint(-5.5F, 1F, -3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		attachmentModel[8].setRotationPoint(-2.5F, 3F, -3F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 15
		attachmentModel[9].setRotationPoint(4.5F, 3F, -3F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 16
		attachmentModel[10].setRotationPoint(-3.5F, 3F, -3F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		attachmentModel[11].setRotationPoint(-2.5F, 8F, -4F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 18
		attachmentModel[12].setRotationPoint(4.5F, 8F, 3F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 20
		attachmentModel[13].setRotationPoint(4.5F, 4F, -2F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 21
		attachmentModel[14].setRotationPoint(-4.5F, 4F, -2F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 7, 4, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		attachmentModel[15].setRotationPoint(-2.5F, 4F, -4F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		attachmentModel[16].setRotationPoint(-2.5F, 8F, 3F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 26
		attachmentModel[17].setRotationPoint(4.5F, 8F, -4F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 27
		attachmentModel[18].setRotationPoint(-4.5F, 8F, -4F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 28
		attachmentModel[19].setRotationPoint(-4.5F, 8F, 3F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		attachmentModel[20].setRotationPoint(5.5F, 8F, -2F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		attachmentModel[21].setRotationPoint(-4.5F, 8F, -2F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 26
		attachmentModel[22].setRotationPoint(-1.25F, -0.5F, 3F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 27
		attachmentModel[23].setRotationPoint(1.25F, -0.5F, 3F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		attachmentModel[24].setRotationPoint(3.5F, -1F, 3F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 29
		attachmentModel[25].setRotationPoint(3.5F, 0F, -4F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 30
		attachmentModel[26].setRotationPoint(-1.5F, 0F, -4F);

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 31
		attachmentModel[27].setRotationPoint(3.5F, 1F, -4F);

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		attachmentModel[28].setRotationPoint(-1.5F, -2F, 3F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0.25F, 0F); // Box 33
		attachmentModel[29].setRotationPoint(-1.5F, -1F, 3F);

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		attachmentModel[30].setRotationPoint(-1.5F, -1F, 3F);

		attachmentModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.75F, 0.625F, 0F, -0.75F, 0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		attachmentModel[31].setRotationPoint(-1.5F, 1F, -3F);

		attachmentModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 37
		attachmentModel[32].setRotationPoint(1F, -1F, 3F);

		attachmentModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.75F, 0F); // Box 38
		attachmentModel[33].setRotationPoint(2.5F, -1F, 3F);

		attachmentModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 39
		attachmentModel[34].setRotationPoint(-0.5F, -1F, 3F);

		attachmentModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 40
		attachmentModel[35].setRotationPoint(-3.5F, 0.75F, 3F);

		attachmentModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 41
		attachmentModel[36].setRotationPoint(3.5F, 0.75F, 3F);

		attachmentModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F); // Box 42
		attachmentModel[37].setRotationPoint(2.75F, 1F, 3F);

		attachmentModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F); // Box 43
		attachmentModel[38].setRotationPoint(-1.75F, 1F, 3F);

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 44
		attachmentModel[39].setRotationPoint(1F, 0.75F, 3F);

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.375F, 1F, -0.25F, -0.375F); // Box 45
		attachmentModel[40].setRotationPoint(1F, 1F, 3F);

		armTranslate = new Vector3f(4.5F / 160F, 23.5F / 160F, 0F); //7.5F
	}
}