//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 7.62x39mm 30 Rounds Magazine
// Model Creator: 
// Created on: 24.07.2019 - 22:49:56
// Last changed on: 24.07.2019 - 22:49:56

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model762x39mm30RoundsMagazine extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Model762x39mm30RoundsMagazine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[42];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 386
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 387
		gunModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 388
		gunModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 389
		gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 390
		gunModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 391
		gunModel[6] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 392
		gunModel[7] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 393
		gunModel[8] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 394
		gunModel[9] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 395
		gunModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 396
		gunModel[11] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 397
		gunModel[12] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 398
		gunModel[13] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 399
		gunModel[14] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 400
		gunModel[15] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 401
		gunModel[16] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 402
		gunModel[17] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 403
		gunModel[18] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 404
		gunModel[19] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 405
		gunModel[20] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 406
		gunModel[21] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 417
		gunModel[22] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 418
		gunModel[23] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 419
		gunModel[24] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 420
		gunModel[25] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 421
		gunModel[26] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 422
		gunModel[27] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 423
		gunModel[28] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 424
		gunModel[29] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 425
		gunModel[30] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 426
		gunModel[31] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 427
		gunModel[32] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 428
		gunModel[33] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 429
		gunModel[34] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 430
		gunModel[35] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 431
		gunModel[36] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 432
		gunModel[37] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 433
		gunModel[38] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 434
		gunModel[39] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 435
		gunModel[40] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 436
		gunModel[41] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 437

		gunModel[0].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		gunModel[0].setRotationPoint(2F, 0F, -3.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 1F, 0F); // Box 387
		gunModel[1].setRotationPoint(2F, 4F, -3.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 2F, 0F); // Box 388
		gunModel[2].setRotationPoint(3F, 10F, -3.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 3F, 0F); // Box 389
		gunModel[3].setRotationPoint(4F, 15F, -3.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 3F, 0F); // Box 390
		gunModel[4].setRotationPoint(6F, 21F, -3.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -3F, 4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 4F, 0F); // Box 391
		gunModel[5].setRotationPoint(9F, 28F, -3.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, 4F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -4F, 4F, 0F); // Box 392
		gunModel[6].setRotationPoint(12F, 34F, -3.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, 4F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -4F, 4F, 0F); // Box 393
		gunModel[7].setRotationPoint(16F, 40F, -3.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, 3.5F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -4F, 3.5F, 0F); // Box 394
		gunModel[8].setRotationPoint(20F, 45F, -3.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 17, 5, 7, 0F, 0F, -0.5F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0F, -0.5F, 0F, -9F, 3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -9F, 3F, 0F); // Box 395
		gunModel[9].setRotationPoint(24F, 49F, -3.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 8F, 0F, 0F); // Box 396
		gunModel[10].setRotationPoint(41F, 46F, -3.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		gunModel[11].setRotationPoint(15F, 0F, -2.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 398
		gunModel[12].setRotationPoint(15F, 4F, -2.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 399
		gunModel[13].setRotationPoint(16F, 9F, -2.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0F, 0F); // Box 400
		gunModel[14].setRotationPoint(17F, 13F, -2.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F); // Box 401
		gunModel[15].setRotationPoint(19F, 18F, -2.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3F, 0F, 0F); // Box 402
		gunModel[16].setRotationPoint(22F, 25F, -2.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, -5F, 0F, 0F); // Box 403
		gunModel[17].setRotationPoint(25F, 30F, -2.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, -0.5F, 0F, 6F, -0.5F, 0F, -5F, 0F, 0F); // Box 404
		gunModel[18].setRotationPoint(30F, 36F, -2.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -6F, 0F, 0F); // Box 405
		gunModel[19].setRotationPoint(35F, 41F, -2.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F); // Box 406
		gunModel[20].setRotationPoint(41F, 44F, -2.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		gunModel[21].setRotationPoint(0F, 0F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 418
		gunModel[22].setRotationPoint(0F, 4F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 419
		gunModel[23].setRotationPoint(1F, 10F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0.5F, 0F); // Box 420
		gunModel[24].setRotationPoint(2F, 15F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 1F, 0F); // Box 421
		gunModel[25].setRotationPoint(4F, 21F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 1F, 0F); // Box 422
		gunModel[26].setRotationPoint(7F, 29F, -1.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 1F, 0F); // Box 423
		gunModel[27].setRotationPoint(10F, 35F, -1.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 1F, 0F); // Box 424
		gunModel[28].setRotationPoint(14F, 41F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -4.5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4.5F, 2F, 0F); // Box 425
		gunModel[29].setRotationPoint(18F, 46F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, -0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, -7F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, -7F, 0F, 0F); // Box 426
		gunModel[30].setRotationPoint(22F, 51F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -5.5F, 0F, 0F); // Box 427
		gunModel[31].setRotationPoint(29F, 57F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 428
		gunModel[32].setRotationPoint(15F, 0F, -3.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F); // Box 429
		gunModel[33].setRotationPoint(15F, 4F, -3.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F); // Box 430
		gunModel[34].setRotationPoint(16F, 9F, -3.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0.5F, 0F, 2F, 0.5F, -1F, 2F, 0.5F, -1F, -2F, 0.5F, 0F); // Box 431
		gunModel[35].setRotationPoint(17F, 13F, -3.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F); // Box 432
		gunModel[36].setRotationPoint(19F, 18F, -3.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F); // Box 433
		gunModel[37].setRotationPoint(22F, 25F, -3.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, -1F, 5F, 0F, -1F, -5F, 0F, 0F); // Box 434
		gunModel[38].setRotationPoint(25F, 30F, -3.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, -1F, 5F, 0F, -1F, -5F, 0F, 0F); // Box 435
		gunModel[39].setRotationPoint(30F, 36F, -3.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, -1F, 6F, 0F, -1F, -6F, 0F, 0F); // Box 436
		gunModel[40].setRotationPoint(35F, 41F, -3.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, -1F, 2F, -1F, -1F, -3F, 0F, 0F); // Box 437
		gunModel[41].setRotationPoint(41F, 46F, -3.5F);

		holdingTranslate = new Vector3f(0F, 30F / 16F, 25F / 16F);
		holdingRotate = new Vector3f(-10F, 0F, 15F);
		thirdPersonOffset = new Vector3f(0F, 5F / 16F, 0F);
		gunModifyTranslate = new Vector3f(0.5F, 20F / 16F, 0F);

		flipAll();
	}
}