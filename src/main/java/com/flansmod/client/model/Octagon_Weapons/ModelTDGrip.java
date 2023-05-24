//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TD Grip
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelTDGrip extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelTDGrip() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[19];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 568
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 569
		attachmentModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 570
		attachmentModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 571
		attachmentModel[4] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 575
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 576
		attachmentModel[6] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 577
		attachmentModel[7] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 578
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 579
		attachmentModel[9] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 580
		attachmentModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 585
		attachmentModel[11] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 586
		attachmentModel[12] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 587
		attachmentModel[13] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 588
		attachmentModel[14] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 15
		attachmentModel[15] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 16
		attachmentModel[16] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 17
		attachmentModel[17] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 18
		attachmentModel[18] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 18

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 568
		attachmentModel[0].setRotationPoint(-6F, 0F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 4, 12, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		attachmentModel[1].setRotationPoint(-1F, 17F, -4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 2, 12, 4, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 570
		attachmentModel[2].setRotationPoint(3F, 17F, -2F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 2, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 571
		attachmentModel[3].setRotationPoint(-3F, 17F, -2F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		attachmentModel[4].setRotationPoint(-0.5F, 29F, -3.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 576
		attachmentModel[5].setRotationPoint(2.5F, 29F, -2.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 577
		attachmentModel[6].setRotationPoint(-2.5F, 29F, -2.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 578
		attachmentModel[7].setRotationPoint(-6F, 0F, -3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 579
		attachmentModel[8].setRotationPoint(2F, 0F, -3F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 580
		attachmentModel[9].setRotationPoint(0F, 1F, -5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 585
		attachmentModel[10].setRotationPoint(-6F, -2F, 3F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 4, 15, 8, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		attachmentModel[11].setRotationPoint(-1F, 2F, -4F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 2, 15, 6, 0F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 587
		attachmentModel[12].setRotationPoint(-3F, 2F, -3F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 15, 6, 0F, 0.5F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 588
		attachmentModel[13].setRotationPoint(3F, 2F, -3F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 15
		attachmentModel[14].setRotationPoint(2F, -2F, 3F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 16
		attachmentModel[15].setRotationPoint(2F, -2F, -5F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		attachmentModel[16].setRotationPoint(0F, -2F, -5F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 18
		attachmentModel[17].setRotationPoint(-6F, -2F, -5F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		attachmentModel[18].setRotationPoint(0F, -2F, 3F);

		armTranslate = new Vector3f(4.5F / 160F, 23.5F / 160F, 0F); //7.5F
	}
}