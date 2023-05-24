//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 9mmSilencer Type A - Short
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model9mmSilencerTypeAShort extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public Model9mmSilencerTypeAShort() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[26];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 581
		attachmentModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 582
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 583
		attachmentModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 584
		attachmentModel[4] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 585
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 586
		attachmentModel[6] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 587
		attachmentModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 588
		attachmentModel[8] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 589
		attachmentModel[9] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 592
		attachmentModel[10] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 593
		attachmentModel[11] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 594
		attachmentModel[12] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 595
		attachmentModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 596
		attachmentModel[14] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 597
		attachmentModel[15] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 598
		attachmentModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 599
		attachmentModel[17] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 600
		attachmentModel[18] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 601
		attachmentModel[19] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 602
		attachmentModel[20] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 603
		attachmentModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 604
		attachmentModel[22] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 22
		attachmentModel[23] = new ModelRendererTurbo(this, 49, 52, textureX, textureY); // Box 23
		attachmentModel[24] = new ModelRendererTurbo(this, 49, 47, textureX, textureY); // Box 24
		attachmentModel[25] = new ModelRendererTurbo(this, 1, 54, textureX, textureY); // Box 25

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 21, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 581
		attachmentModel[0].setRotationPoint(4F, -6F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 21, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 582
		attachmentModel[1].setRotationPoint(4F, -3F, -6F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 21, 3, 6, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		attachmentModel[2].setRotationPoint(4F, 3F, -3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 584
		attachmentModel[3].setRotationPoint(25F, -5F, -2F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 585
		attachmentModel[4].setRotationPoint(25F, 4F, -2F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 586
		attachmentModel[5].setRotationPoint(25F, -2F, -5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 587
		attachmentModel[6].setRotationPoint(0F, -3F, -4F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -2F, 2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 588
		attachmentModel[7].setRotationPoint(25F, -5F, -5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, -1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, 0F); // Box 589
		attachmentModel[8].setRotationPoint(0F, -3F, 2F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 592
		attachmentModel[9].setRotationPoint(0F, -4F, -3F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 1F, -2F, 0F, 3F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		attachmentModel[10].setRotationPoint(0F, -3F, -4F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -1F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 3F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 594
		attachmentModel[11].setRotationPoint(0F, 1F, -4F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, -1F, 0F, 1F, -2F); // Box 595
		attachmentModel[12].setRotationPoint(0F, 1F, 2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, -1F, 0F); // Box 596
		attachmentModel[13].setRotationPoint(0F, -3F, 2F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F); // Box 597
		attachmentModel[14].setRotationPoint(0F, 2F, -3F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -2F, 2F); // Box 598
		attachmentModel[15].setRotationPoint(25F, 2F, -5F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 599
		attachmentModel[16].setRotationPoint(25F, -2F, 4F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -2F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 1F, -2F); // Box 600
		attachmentModel[17].setRotationPoint(25F, 2F, 4F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -2F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 601
		attachmentModel[18].setRotationPoint(25F, -5F, 4F);

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 21, 6, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		attachmentModel[19].setRotationPoint(4F, -3F, 1F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 603
		attachmentModel[20].setRotationPoint(4F, -3F, -1F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		attachmentModel[21].setRotationPoint(4F, 1F, -1F);

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		attachmentModel[22].setRotationPoint(4F, 1F, -2F);

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
		attachmentModel[23].setRotationPoint(4F, 1F, 1F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		attachmentModel[24].setRotationPoint(4F, -3F, 1F);

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
		attachmentModel[25].setRotationPoint(4F, -3F, -2F);
	}
}