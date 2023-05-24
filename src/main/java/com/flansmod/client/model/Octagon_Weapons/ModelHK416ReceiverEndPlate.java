//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416ReceiverEndPlate
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416ReceiverEndPlate extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHK416ReceiverEndPlate() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[20];
		attachmentModel[0] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 635
		attachmentModel[1] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 637
		attachmentModel[2] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 638
		attachmentModel[3] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 566
		attachmentModel[4] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 569
		attachmentModel[5] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 567
		attachmentModel[6] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 568
		attachmentModel[7] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 569
		attachmentModel[8] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 570
		attachmentModel[9] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 570
		attachmentModel[10] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 571
		attachmentModel[11] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 572
		attachmentModel[12] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Box 573
		attachmentModel[13] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 575
		attachmentModel[14] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 576
		attachmentModel[15] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 578
		attachmentModel[16] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 579
		attachmentModel[17] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 580
		attachmentModel[18] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 581
		attachmentModel[19] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 582

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 1.3333F, -0.5F, 0F, 1.3333F, -0.5F, 0F, 1.3333F, 0F, 0F, 1.3333F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 635
		attachmentModel[0].setRotationPoint(-0.5F, 1.5F, -1.5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 637
		attachmentModel[1].setRotationPoint(-0.5F, -12.5F, -2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 638
		attachmentModel[2].setRotationPoint(-0.5F, -9.5F, -5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 566
		attachmentModel[3].setRotationPoint(-0.5F, -9.5F, 4F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 569
		attachmentModel[4].setRotationPoint(-0.5F, -5.5F, 2F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -0.5F, -1F, -3F, -0.5F, -1F, 3F, 0F, -1F, 3F); // Box 567
		attachmentModel[5].setRotationPoint(-0.5F, -12.5F, 1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 3F, -0.5F, -1F, 3F, -0.5F, -1F, -3F, 0F, -1F, -3F); // Box 568
		attachmentModel[6].setRotationPoint(-0.5F, -12.5F, -2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 3F, -0.5F, -1F, 3F, -0.5F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -1F, 0F, -1F, -1F); // Box 569
		attachmentModel[7].setRotationPoint(-0.5F, -6.5F, -2F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -3F, -0.5F, -1F, -3F, -0.5F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 570
		attachmentModel[8].setRotationPoint(-0.5F, -6.5F, 1F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 570
		attachmentModel[9].setRotationPoint(-0.5F, -5.5F, -4F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 571
		attachmentModel[10].setRotationPoint(-0.5F, -3.5F, -2F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 572
		attachmentModel[11].setRotationPoint(-0.5F, -0.5F, -2F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1667F, -0.5F, 0F, -0.1667F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 573
		attachmentModel[12].setRotationPoint(-0.5F, 0.5F, -3F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.1667F, 0F, 0F, -0.1667F); // Box 575
		attachmentModel[13].setRotationPoint(-0.5F, 0.5F, 1F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 576
		attachmentModel[14].setRotationPoint(-0.5F, -1.5F, 1F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 578
		attachmentModel[15].setRotationPoint(-0.5F, -1.5F, -2F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 579
		attachmentModel[16].setRotationPoint(-0.5F, -0.5F, 1F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 580
		attachmentModel[17].setRotationPoint(0F, -2F, -2F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		attachmentModel[18].setRotationPoint(0F, -1F, -2F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		attachmentModel[19].setRotationPoint(0F, 1F, -2F);

		flipAll();
	}
}