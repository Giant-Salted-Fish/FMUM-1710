//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BerettaM9LeftGrip
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBerettaM9LeftGrip extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBerettaM9LeftGrip() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[19];
		attachmentModel[0] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 226
		attachmentModel[1] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 275
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 276
		attachmentModel[3] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 277
		attachmentModel[4] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 278
		attachmentModel[5] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 279
		attachmentModel[6] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 280
		attachmentModel[7] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 281
		attachmentModel[8] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 282
		attachmentModel[9] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 283
		attachmentModel[10] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 284
		attachmentModel[11] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 285
		attachmentModel[12] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 286
		attachmentModel[13] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 341
		attachmentModel[14] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 342
		attachmentModel[15] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 343
		attachmentModel[16] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Box 344
		attachmentModel[17] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 345
		attachmentModel[18] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 346

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 2F, 0F, 0F, 0.1765F, 0F, 0F, 2.1765F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, -2F); // Box 226
		attachmentModel[0].setRotationPoint(-12F, 23F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F, 1.9412F, 0F, 0F, 0.7258F, 0F, 0F, -0.2742F, 0F, 0F, 0.9412F, 0F, 0F, 4.0588F, 0F, 0F, -1.7419F, 0F, 0F, -2.7419F, 0F, 0F, 3.0588F, 0F, 0F); // Box 275
		attachmentModel[1].setRotationPoint(-1F, -2F, 0F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F, 0.6471F, 0F, 0F, 1.5726F, 0F, 0F, 0.4274F, 0F, 0F, -0.3529F, 0F, 0F, 5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 4F, 0.5F, 0F); // Box 276
		attachmentModel[2].setRotationPoint(-5F, 9.5F, 0F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 2F, 0F, 0F, -0.4706F, 0F, 0F, 1.5294F, 0F, -2F, -2F, 0F, -2F, 2F, 0.5F, 0F, -0.8235F, 0.5F, 0F, 1.1765F, 0.5F, -2F, -2F, 0.5F, -2F); // Box 277
		attachmentModel[3].setRotationPoint(-12F, 21.5F, -1F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 1.0588F, 0F, 0F, 1.2581F, 0F, 0F, -0.2419F, 0F, 0F, 0.0588F, 0F, 0F, 1.6471F, -0.5F, 0F, 0.5726F, -0.5F, 0F, -0.9274F, -0.5F, 0F, 0.6471F, -0.5F, 0F); // Box 278
		attachmentModel[4].setRotationPoint(-4F, 7F, 0F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 2, 13, 4, 0F, 2F, 0F, 0F, -1.4118F, 0F, 0F, 0.5882F, 0F, -2F, -1F, 0F, -2F, 7F, 0F, 0F, -4.4706F, 0F, 0F, -2.4706F, 0F, -2F, 3F, 0F, -2F); // Box 279
		attachmentModel[5].setRotationPoint(-7F, 8.5F, -1F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 1F, -0.5F, 0F, -0.8235F, -0.5F, 0F, 1.1765F, -0.5F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, -1.4118F, 0F, 0F, 0.5882F, 0F, -1F, -1F, 0F, -1F); // Box 280
		attachmentModel[6].setRotationPoint(-7F, 5.5F, -1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 1F, 0F, 0F, 0.1176F, 0F, 0F, 2.1176F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, 0F, -0.8235F, 0F, 0F, 1.1765F, 0F, -1F, -2F, -0.5F, -1F); // Box 281
		attachmentModel[7].setRotationPoint(-7F, 2F, -1F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 2.5F, 0F, 0F, -0.4118F, 0F, 0F, 1.5882F, 0F, -1F, -0.5F, 0F, -1F, 1F, 0F, 0F, -0.8824F, 0F, 0F, 1.1176F, 0F, -1F, -2F, 0F, -1F); // Box 282
		attachmentModel[8].setRotationPoint(-7F, 0F, -1F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 2F, 0.5F, 0F, -1.0588F, 0.5F, 0F, 0.9412F, 0.5F, -1F, -1.5F, 0.5F, -1F, 0.5F, 0F, 0F, -1.4118F, 0F, 0F, 0.5882F, 0F, -1F, -2.5F, 0F, -1F); // Box 283
		attachmentModel[9].setRotationPoint(-9F, -1F, -1F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0.5F, 0F, 0F, 0.7647F, 0F, 0F, 2.7647F, 0F, -1F, -2.5F, 0F, -1F, 2F, 0.5F, 0F, -0.0588F, 0.5F, 0F, 1.9412F, 0.5F, -1F, -1.5F, 0.5F, -1F); // Box 284
		attachmentModel[10].setRotationPoint(-9F, -5F, -1F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 1.7059F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.7059F, 0F, 0F, 1.9412F, 0F, 0F, -0.2742F, 0F, 0F, -1.2742F, 0F, 0F, 0.9412F, 0F, 0F); // Box 285
		attachmentModel[11].setRotationPoint(-1F, -3F, 0F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.2353F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.7647F, 0F, 0F, 0.7059F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2941F, 0F, 0F); // Box 286
		attachmentModel[12].setRotationPoint(-2F, -5F, 0F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 341
		attachmentModel[13].setRotationPoint(-7F, 22F, 1F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 342
		attachmentModel[14].setRotationPoint(-6F, 23F, 1F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F); // Box 343
		attachmentModel[15].setRotationPoint(-6F, 21F, 1F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F); // Box 344
		attachmentModel[16].setRotationPoint(-0.5F, -1.5F, 1F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 345
		attachmentModel[17].setRotationPoint(-1.5F, -0.5F, 1F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 346
		attachmentModel[18].setRotationPoint(-0.5F, 0.5F, 1F);

		flipAll();
	}
}