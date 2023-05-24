//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Noblex Docter Optics Sight II Plus
// Model Creator: 
// Created on: 25.10.2019 - 22:26:11
// Last changed on: 25.10.2019 - 22:26:11

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAtSight;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelNoblexDocterOpticsSightIIPlus extends ModelAtSight //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelNoblexDocterOpticsSightIIPlus() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[19];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 25, 22, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		attachmentModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 10
		attachmentModel[6] = new ModelRendererTurbo(this, 21, 28, textureX, textureY); // Box 11
		attachmentModel[7] = new ModelRendererTurbo(this, 33, 27, textureX, textureY); // Box 12
		attachmentModel[8] = new ModelRendererTurbo(this, 49, 27, textureX, textureY); // Box 13
		attachmentModel[9] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 14
		attachmentModel[10] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 15
		attachmentModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 16
		attachmentModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17
		attachmentModel[13] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 18
		attachmentModel[14] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 19
		attachmentModel[15] = new ModelRendererTurbo(this, 17, 58, textureX, textureY); // Box 21
		attachmentModel[16] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 21
		attachmentModel[17] = new ModelRendererTurbo(this, 35, 34, textureX, textureY); // Box 22
		attachmentModel[18] = new ModelRendererTurbo(this, 52, 33, textureX, textureY); // Box 23

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 14, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-7F, -2F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		attachmentModel[1].setRotationPoint(-7F, -3F, -2F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		attachmentModel[2].setRotationPoint(-7F, -3F, -4F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		attachmentModel[3].setRotationPoint(-7F, -3F, 3F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		attachmentModel[4].setRotationPoint(6F, -3F, 3F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 10
		attachmentModel[5].setRotationPoint(6F, -3F, -4F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, 0.5F, 0F, 0.375F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F); // Box 11
		attachmentModel[6].setRotationPoint(3F, -6F, 3F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 12
		attachmentModel[7].setRotationPoint(2F, -5F, 3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F); // Box 13
		attachmentModel[8].setRotationPoint(3F, -7F, -4F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 14
		attachmentModel[9].setRotationPoint(3F, -7F, 2F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 15
		attachmentModel[10].setRotationPoint(3F, -8F, -2F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		attachmentModel[11].setRotationPoint(-7F, -3F, -3F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 17
		attachmentModel[12].setRotationPoint(-7F, -3F, 2F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 18
		attachmentModel[13].setRotationPoint(-1.5F, -2.5F, 1F);

		attachmentModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 19
		attachmentModel[14].setRotationPoint(-1.5F, -2.5F, -3F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.375F, 0.5F, 0F, 0.25F, 0.5F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F); // Box 21
		attachmentModel[15].setRotationPoint(3F, -6F, -4F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 21
		attachmentModel[16].setRotationPoint(2F, -5F, -4F);

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0F); // Box 22
		attachmentModel[17].setRotationPoint(-4F, -3.5F, -0.5F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 23
		attachmentModel[18].setRotationPoint(-3F, -3.5F, -1F);

		pupilRefCenter.set(4F / 16F, 10F / 16F, 0F);
		reticleAt[0].set(4096F, 4.5F / 160F, 0F);
		reticleScale = 0.15F;

		reticleBorder = new Vector3f[6];
		reticleBorder[0] = new Vector3f(4F / 160F, 6.5F / 160F, -3F / 160F);
		reticleBorder[1] = new Vector3f(4F / 160F, 7F / 160F, -2F / 160F);
		reticleBorder[2] = new Vector3f(4F / 160F, 7F / 160F, 2F / 160F);
		reticleBorder[3] = new Vector3f(4F / 160F, 6.5F / 160F, 3F / 160F);
		reticleBorder[4] = new Vector3f(4F / 160F, 2F / 160F, 3F / 160F);
		reticleBorder[5] = new Vector3f(4F / 160F, 2F / 160F, -3F / 160F);

		flipAll();
	}
}