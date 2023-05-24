//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CICWTS36ChargingHandle
// Model Creator: 
// Created on: 22.12.2019 - 19:48:03
// Last changed on: 22.12.2019 - 19:48:03

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICWTS36ChargingHandle extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCICWTS36ChargingHandle() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[17];
		attachmentModel[0] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 49
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 223
		attachmentModel[2] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 225
		attachmentModel[3] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 226
		attachmentModel[4] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 227
		attachmentModel[5] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 229
		attachmentModel[6] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 232
		attachmentModel[7] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 233
		attachmentModel[8] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 282
		attachmentModel[9] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 284
		attachmentModel[10] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 402
		attachmentModel[11] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 404
		attachmentModel[12] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 398
		attachmentModel[13] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 399
		attachmentModel[14] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 468
		attachmentModel[15] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 469
		attachmentModel[16] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 470

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		attachmentModel[0].setRotationPoint(-3F, 1F, 3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		attachmentModel[1].setRotationPoint(-3F, 1F, 4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		attachmentModel[2].setRotationPoint(-2.5F, 2F, 12.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		attachmentModel[3].setRotationPoint(-2.5F, 0F, 12.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 61, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		attachmentModel[4].setRotationPoint(-61F, 0F, -1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 229
		attachmentModel[5].setRotationPoint(-0.5F, 0.5F, 12.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		attachmentModel[6].setRotationPoint(-3F, 0F, 2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 233
		attachmentModel[7].setRotationPoint(-1F, 1F, 6.5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F); // Box 282
		attachmentModel[8].setRotationPoint(-4F, 1F, 6.5F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		attachmentModel[9].setRotationPoint(-2F, 0.5F, 6.5F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		attachmentModel[10].setRotationPoint(-3.5F, 0F, 5.5F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		attachmentModel[11].setRotationPoint(-3.5F, 2F, 5.5F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 61, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		attachmentModel[12].setRotationPoint(-61F, 0F, 1F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 61, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		attachmentModel[13].setRotationPoint(-61F, 0F, -2F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 468
		attachmentModel[14].setRotationPoint(-3.5F, 0.5F, 12.5F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 469
		attachmentModel[15].setRotationPoint(-0.5F, 0.5F, 5.5F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 470
		attachmentModel[16].setRotationPoint(-4.5F, 0.5F, 5.5F);

		flipAll();
	}
}