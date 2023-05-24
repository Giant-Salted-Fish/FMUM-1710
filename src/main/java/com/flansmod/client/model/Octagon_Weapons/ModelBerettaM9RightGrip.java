//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BerettaM9RightGrip
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBerettaM9RightGrip extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBerettaM9RightGrip() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[17];
		attachmentModel[0] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 298
		attachmentModel[1] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 300
		attachmentModel[2] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 301
		attachmentModel[3] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 302
		attachmentModel[4] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 303
		attachmentModel[5] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 304
		attachmentModel[6] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 305
		attachmentModel[7] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 306
		attachmentModel[8] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 307
		attachmentModel[9] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 308
		attachmentModel[10] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 309
		attachmentModel[11] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 335
		attachmentModel[12] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 336
		attachmentModel[13] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 337
		attachmentModel[14] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 338
		attachmentModel[15] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 339
		attachmentModel[16] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 340

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, -2.5F, 0F, 0F, 2.7647F, 0F, 0F, 0.7647F, 0F, -1F, 0.5F, 0F, -1F, -1.5F, 0.5F, 0F, 1.9412F, 0.5F, 0F, -0.0588F, 0.5F, -1F, 2F, 0.5F, -1F); // Box 298
		attachmentModel[0].setRotationPoint(-8F, -8.5F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F, 0.4706F, 0F, 0F, 0.2742F, 0F, 0F, 1.2742F, 0F, 0F, 1.4706F, 0F, 0F, 3.0588F, 0F, 0F, -2.7419F, 0F, 0F, -1.7419F, 0F, 0F, 4.0588F, 0F, 0F); // Box 300
		attachmentModel[1].setRotationPoint(0F, -7.5F, -1F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, -1.5F, 0.5F, 0F, 0.9412F, 0.5F, 0F, -1.0588F, 0.5F, -1F, 2F, 0.5F, -1F, -2.5F, 0F, 0F, 0.5882F, 0F, 0F, -1.4118F, 0F, -1F, 0.5F, 0F, -1F); // Box 301
		attachmentModel[2].setRotationPoint(-8F, -4.5F, -1F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, -0.5F, 0F, 0F, 1.5882F, 0F, 0F, -0.4118F, 0F, -1F, 2.5F, 0F, -1F, -2F, 0F, 0F, 1.1176F, 0F, 0F, -0.8824F, 0F, -1F, 1F, 0F, -1F); // Box 302
		attachmentModel[3].setRotationPoint(-6F, -3.5F, -1F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, -2F, 0F, 0F, 2.1176F, 0F, 0F, 0.1176F, 0F, -1F, 1F, 0F, -1F, -2F, -0.5F, 0F, 1.1765F, 0F, 0F, -0.8235F, 0F, -1F, 1F, 0F, -1F); // Box 303
		attachmentModel[4].setRotationPoint(-6F, -1.5F, -1F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0.0588F, 0F, 0F, -0.2419F, 0F, 0F, 1.2581F, 0F, 0F, 1.0588F, 0F, 0F, 0.6471F, -0.5F, 0F, -0.9274F, -0.5F, 0F, 0.5726F, -0.5F, 0F, 1.6471F, -0.5F, 0F); // Box 304
		attachmentModel[5].setRotationPoint(-3F, 3.5F, -1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -2F, 0F, 0F, 1.1765F, -0.5F, 0F, -0.8235F, -0.5F, -1F, 1F, -0.5F, -1F, -1F, 0F, 0F, 0.5882F, 0F, 0F, -1.4118F, 0F, -1F, 2F, 0F, -1F); // Box 305
		attachmentModel[6].setRotationPoint(-6F, 2F, -1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 13, 4, 0F, -1F, 0F, 0F, 0.5882F, 0F, 0F, -1.4118F, 0F, -2F, 2F, 0F, -2F, 3F, 0F, 0F, -2.4706F, 0F, 0F, -4.4706F, 0F, -2F, 7F, 0F, -2F); // Box 306
		attachmentModel[7].setRotationPoint(-6F, 5F, -1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F, -0.3529F, 0F, 0F, 0.4274F, 0F, 0F, 1.5726F, 0F, 0F, 0.6471F, 0F, 0F, 4F, 0.5F, 0F, -4.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 5F, 0.5F, 0F); // Box 307
		attachmentModel[8].setRotationPoint(-4F, 6F, -1F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -2F, 0F, 0F, 1.5294F, 0F, 0F, -0.4706F, 0F, -2F, 2F, 0F, -2F, -2F, 0.5F, 0F, 1.1765F, 0.5F, 0F, -0.8235F, 0.5F, -2F, 2F, 0.5F, -2F); // Box 308
		attachmentModel[9].setRotationPoint(-11F, 18F, -1F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, -2F, 0F, 0F, 2.1765F, 0F, 0F, 0.1765F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, 2F, 0F, -2F); // Box 309
		attachmentModel[10].setRotationPoint(-11F, 19.5F, -1F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		attachmentModel[11].setRotationPoint(-1.5F, -0.5F, -2F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 336
		attachmentModel[12].setRotationPoint(-0.5F, 0.5F, -2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 337
		attachmentModel[13].setRotationPoint(-0.5F, -1.5F, -2F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		attachmentModel[14].setRotationPoint(-6F, 18.5F, -2F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 339
		attachmentModel[15].setRotationPoint(-5F, 19.5F, -2F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 340
		attachmentModel[16].setRotationPoint(-5F, 17.5F, -2F);

		flipAll();
	}
}