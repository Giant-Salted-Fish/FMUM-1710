//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 7.62x51mm 10 Rounds Magazine & Magazine Sheath
// Model Creator: 
// Created on: 02.01.2020 - 20:29:24
// Last changed on: 02.01.2020 - 20:29:24

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model762x51mm10RoundsMagazineMagazineSheath extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Model762x51mm10RoundsMagazineMagazineSheath() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[38];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 187
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 581
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 582
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 583
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 584
		gunModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 585
		gunModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 586
		gunModel[7] = new ModelRendererTurbo(this, 103, 60, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 76, 90, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 166, 88, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 135, 73, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 132, 95, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 186, 85, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 194, 86, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 39
		gunModel[17] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 40
		gunModel[18] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 41
		gunModel[19] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 45
		gunModel[20] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 46
		gunModel[21] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 47
		gunModel[22] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 48
		gunModel[23] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 49
		gunModel[24] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 50
		gunModel[25] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 51
		gunModel[26] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 55
		gunModel[27] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 56
		gunModel[28] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 57
		gunModel[29] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 58
		gunModel[30] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 59
		gunModel[31] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 59
		gunModel[32] = new ModelRendererTurbo(this, 21, 76, textureX, textureY); // Box 38
		gunModel[33] = new ModelRendererTurbo(this, 76, 66, textureX, textureY); // Box 39
		gunModel[34] = new ModelRendererTurbo(this, 134, 83, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 83, 77, textureX, textureY); // Box 37
		gunModel[36] = new ModelRendererTurbo(this, 156, 84, textureX, textureY); // Box 38
		gunModel[37] = new ModelRendererTurbo(this, 179, 85, textureX, textureY); // Box 39

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 22, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		gunModel[0].setRotationPoint(22F, 0F, -2.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 22, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6364F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.6364F, 0F); // Box 581
		gunModel[1].setRotationPoint(19.5F, 0F, -3.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1818F, 0F, 0F, 0.0909F, 0F, 0F, 0.0909F, 0F, 0F, 1.1818F, 0F); // Box 582
		gunModel[2].setRotationPoint(11F, 0F, -3.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3636F, 0F, 0.5F, 0.3636F, 0F, 0.5F, 0.3636F, 0F, 0F, 1.3636F, 0F); // Box 583
		gunModel[3].setRotationPoint(4.5F, 0F, -3.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2727F, 0F, 0.5F, -0.2727F, 0F, 0F, 0F, 0F); // Box 584
		gunModel[4].setRotationPoint(1F, 0F, -3.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 11, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F); // Box 585
		gunModel[5].setRotationPoint(1F, 0F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 26, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		gunModel[6].setRotationPoint(0F, 0F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(10.5F, 25.5F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 22, 1, 7, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(1F, 26.5F, -3.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[9].setRotationPoint(22F, 23.5F, -3.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F); // Box 11
		gunModel[10].setRotationPoint(3F, 25F, -2.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[11].setRotationPoint(1F, 26.5F, -3.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(18F, 24.5F, 1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[13].setRotationPoint(4.5F, 26.5F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 25, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F); // Box 16
		gunModel[14].setRotationPoint(1F, 0F, -2.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 22, 1, 5, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 17
		gunModel[15].setRotationPoint(1F, 21F, -2.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 11, 15, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 39
		gunModel[16].setRotationPoint(1F, 9F, 2F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2727F, 0F, 0.5F, -0.2727F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[17].setRotationPoint(1F, 0F, 2.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3636F, 0F, 0.5F, 0.3636F, 0F, 0.5F, 0.3636F, 0F, 0F, 1.3636F, 0F); // Box 41
		gunModel[18].setRotationPoint(4.5F, 9F, 2.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 6, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1818F, 0F, 0F, 0.0909F, 0F, 0F, 0.0909F, 0F, 0F, 1.1818F, 0F); // Box 45
		gunModel[19].setRotationPoint(11F, 0F, 2.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 22, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6364F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.6364F, 0F); // Box 46
		gunModel[20].setRotationPoint(19.5F, 0F, 2.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 7, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 1F, -0.5F); // Box 47
		gunModel[21].setRotationPoint(15F, 0F, 2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 7, 22, 1, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 48
		gunModel[22].setRotationPoint(15F, 0F, -3F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[23].setRotationPoint(1F, -1F, -3.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0.5F, -1.5F, -1F, 0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[24].setRotationPoint(1F, -1.75F, -3.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[25].setRotationPoint(1F, -1F, 2.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 55
		gunModel[26].setRotationPoint(4.5F, 0F, 2.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 56
		gunModel[27].setRotationPoint(1F, 0F, 2F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57
		gunModel[28].setRotationPoint(2.5F, 6.5F, 2F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 58
		gunModel[29].setRotationPoint(10F, 6.5F, 2F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 59
		gunModel[30].setRotationPoint(5.25F, 9F, 3F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[31].setRotationPoint(1F, -1.75F, 2.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 22, 9, 7, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 38
		gunModel[32].setRotationPoint(1F, 12F, -3.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F, 0.1F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0.1F, 0F, 0.1F); // Box 39
		gunModel[33].setRotationPoint(0F, 12F, -1.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[34].setRotationPoint(21F, 27.5F, -3.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 20, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[35].setRotationPoint(1F, 27.5F, -3.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 38
		gunModel[36].setRotationPoint(0F, 26.5F, -2.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 39
		gunModel[37].setRotationPoint(18F, 24.5F, -2F);

		holdingTranslate = new Vector3f(0F, 5F / 16F, -2F /16F);
		thirdPersonOffset = new Vector3f(0F, 5F /16F, 0F /16F);

		bulletAttachPoint1 = new Vector3f[6];
		bulletAttachPoint1[0] = new Vector3f(1.5F / 16F, 0.25F / 16F, 1F /16F);
		bulletAttachPoint1[1] = new Vector3f(1.5F / 16F, -1.25F / 16F, -1F /16F);
		bulletAttachPoint1[2] = new Vector3f(1.5F / 16F, -2.75F / 16F, 1F /16F);
		bulletAttachPoint1[3] = new Vector3f(1.5F / 16F, -4.25F / 16F, -1F /16F);
		bulletAttachPoint1[4] = new Vector3f(1.5F / 16F, -5.75F / 16F, 1F /16F);
		bulletAttachPoint1[5] = new Vector3f(1.5F / 16F, -7.25F / 16F, -1F /16F);

		bulletAttachPoint2 = new Vector3f[6];
		bulletAttachPoint2[0] = new Vector3f(1.5F / 16F, 0.25F / 16F, -1F /16F);
		bulletAttachPoint2[1] = new Vector3f(1.5F / 16F, -1.25F / 16F, 1F /16F);
		bulletAttachPoint2[2] = new Vector3f(1.5F / 16F, -2.75F / 16F, -1F /16F);
		bulletAttachPoint2[3] = new Vector3f(1.5F / 16F, -4.25F / 16F, 1F /16F);
		bulletAttachPoint2[4] = new Vector3f(1.5F / 16F, -5.75F / 16F, -1F /16F);
		bulletAttachPoint2[5] = new Vector3f(1.5F / 16F, -7.25F / 16F, 1F /16F);

		magFollowerAttachPos = new Vector3f[7];
		magFollowerAttachPos[0] = new Vector3f(1.5F / 16F, 0F, 0F);
		magFollowerAttachPos[1] = new Vector3f(1.5F / 16F, -1.25F / 16F, 0F);
		magFollowerAttachPos[2] = new Vector3f(1.5F / 16F, -2.75F / 16F, 0F);
		magFollowerAttachPos[3] = new Vector3f(1.5F / 16F, -4.25F / 16F, 0F);
		magFollowerAttachPos[4] = new Vector3f(1.5F / 16F, -5.75F / 16F, 0F);
		magFollowerAttachPos[5] = new Vector3f(1.5F / 16F, -7.25F / 16F, 0F);
		magFollowerAttachPos[6] = new Vector3f(1.5F / 16F, -8.75F / 16F, 0F);

		flipAll();
	}
}