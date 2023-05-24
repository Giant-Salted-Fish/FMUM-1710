//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Beretta M9A1
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model9x19mm15RoundMagazine extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Model9x19mm15RoundMagazine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 285
		gunModel[1] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 286
		gunModel[2] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 287
		gunModel[3] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 288
		gunModel[4] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 289
		gunModel[5] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 290
		gunModel[6] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 293
		gunModel[7] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 294
		gunModel[8] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 295
		gunModel[9] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 302
		gunModel[10] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 303

		gunModel[0].addShapeBox(0F, 0F, 0F, 9, 34, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 8F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0F, 7.5F, 0F, 0F); // Box 285
		gunModel[0].setRotationPoint(0F, 0F, 2F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 34, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, 0F, 8F, 0F, 0F); // Box 286
		gunModel[1].setRotationPoint(0F, 0F, -2.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 9, 34, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 7.5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -0.5F, 8F, 0F, -0.5F); // Box 287
		gunModel[2].setRotationPoint(0F, 0F, -3F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 34, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 8F, 0F, 0F, -8F, 0F, -1F, -8.5F, 0F, 0F, 8F, 0F, -0.5F); // Box 288
		gunModel[3].setRotationPoint(9F, 0F, -3F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 34, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 7.5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 7.5F, 0F, 0F); // Box 289
		gunModel[4].setRotationPoint(9F, 0F, -2F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 34, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 8F, 0F, -0.5F, -8.5F, 0F, 0F, -8F, 0F, -1F, 8F, 0F, 0F); // Box 290
		gunModel[5].setRotationPoint(9F, 0F, 2F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -1F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1.5F, -1.5F, 0.5F, -1.5F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -0.5F, 0F, 0F); // Box 293
		gunModel[6].setRotationPoint(0F, -2F, 2F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -1.5F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 1F, -1F, 0.5F, 1F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 294
		gunModel[7].setRotationPoint(0F, -2F, -3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.8F, 0F, -1.2F, 0.3F, 0F, -1.2F, 0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F); // Box 295
		gunModel[8].setRotationPoint(0F, -2F, -2.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F); // Box 302
		gunModel[9].setRotationPoint(-8F, 34F, -4F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 2.5F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0.5F); // Box 303
		gunModel[10].setRotationPoint(2F, 34F, -1.5F);

		takeOutTranslate = new Vector3f(-11F / 16F, -9F / 16F, 2F / 16F);
		takeOutRotate = new Vector3f(0F, 0F, -80F);
		holdingTranslate = new Vector3f(0F, 3F / 16F, 2.5F / 16F);
		holdingRotate = new Vector3f(-10F, 0F, 15F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F);
		gunModifyTranslate = new Vector3f(0.5F, 10F /16F, 0F);

		bulletAttachPoint1 = new Vector3f[4];
		bulletAttachPoint1[0] = new Vector3f(1F / 160F, 1.5F / 160F, 0F);
		bulletAttachPoint1[1] = new Vector3f(0.29414F / 160F, -1.5F / 160F, -0.5F / 160F);
		bulletAttachPoint1[2] = new Vector3f(-0.2942F / 160F, -4F / 160F, 0.75F / 160F);
		bulletAttachPoint1[3] = new Vector3f(-0.7647F / 160F, -6F / 160F, -1F / 160F);

		bulletAttachPoint2 = new Vector3f[4];
		bulletAttachPoint2[0] = bulletAttachPoint1[0];
		bulletAttachPoint2[1] = new Vector3f(0.29414F / 160F, -1.5F / 160F, 0.5F / 160F);
		bulletAttachPoint2[2] = new Vector3f(-0.2942F / 160F, -4F / 160F, -0.75F / 160F);
		bulletAttachPoint2[3] = new Vector3f(-0.7647F / 160F, -6F / 160F, 1F / 160F);

		magFollowerAttachPos = new Vector3f[5];
		magFollowerAttachPos[0] = new Vector3f(1F / 160F, 0F, 0F);
		magFollowerAttachPos[1] = new Vector3f(0.5294F / 160F, -2F / 160F, 0F);
		magFollowerAttachPos[2] = new Vector3f(-0.0588F / 160F, -4.5F / 160F, 0F);
		magFollowerAttachPos[3] = new Vector3f(-0.5294F / 160F, -6.5F / 160F, 0F);
		magFollowerAttachPos[4] = new Vector3f(-1F / 160F, -8.5F / 160F, 0F);

		flipAll();
	}
}