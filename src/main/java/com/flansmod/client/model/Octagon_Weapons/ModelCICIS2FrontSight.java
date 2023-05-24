//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC IS-2 Sight
// Model Creator: 
// Created on: 02.01.2020 - 20:29:24
// Last changed on: 02.01.2020 - 20:29:24

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICIS2FrontSight extends ModelAttachment //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	private ModelRendererTurbo[] lightModel;
	
	public ModelCICIS2FrontSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[19];
		attachmentModel[0] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 64
		attachmentModel[1] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 65
		attachmentModel[2] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 66
		attachmentModel[3] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 67
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 68
		attachmentModel[5] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 69
		attachmentModel[6] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 70
		attachmentModel[7] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 71
		attachmentModel[8] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 72
		attachmentModel[9] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 73
		attachmentModel[10] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 74
		attachmentModel[11] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 75
		attachmentModel[12] = new ModelRendererTurbo(this, 59, 14, textureX, textureY); // Box 76
		attachmentModel[13] = new ModelRendererTurbo(this, 71, 16, textureX, textureY); // Box 77
		attachmentModel[14] = new ModelRendererTurbo(this, 79, 26, textureX, textureY); // Box 81
		attachmentModel[15] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 82
		attachmentModel[16] = new ModelRendererTurbo(this, 50, 14, textureX, textureY); // Box 87
		attachmentModel[17] = new ModelRendererTurbo(this, 50, 9, textureX, textureY); // Box 89
		attachmentModel[18] = new ModelRendererTurbo(this, 36, 22, textureX, textureY); // Box 86

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		attachmentModel[0].setRotationPoint(-10.75F, -1F, -2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 65
		attachmentModel[1].setRotationPoint(-0.5F, -1F, 4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 66
		attachmentModel[2].setRotationPoint(-11.75F, -1F, -2F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		attachmentModel[3].setRotationPoint(-0.5F, 0F, 3.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 68
		attachmentModel[4].setRotationPoint(-0.5F, 1F, 4F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 69
		attachmentModel[5].setRotationPoint(-7.75F, -1F, 2F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F); // Box 70
		attachmentModel[6].setRotationPoint(-7.75F, -1F, -3F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		attachmentModel[7].setRotationPoint(-0.75F, -1F, 3F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 72
		attachmentModel[8].setRotationPoint(-0.75F, -1F, -4F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 73
		attachmentModel[9].setRotationPoint(-5.75F, -2F, -3F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 74
		attachmentModel[10].setRotationPoint(-4.75F, -3F, -3F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 75
		attachmentModel[11].setRotationPoint(-4.75F, -3F, 2F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 76
		attachmentModel[12].setRotationPoint(-5.75F, -2F, 2F);

		attachmentModel[13].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		attachmentModel[13].setRotationPoint(-1.25F, -2F, -3.5F);
		attachmentModel[13].rotateAngleZ = -0.78539816F;

		attachmentModel[14].addShapeBox(-1F, -6F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 81
		attachmentModel[14].setRotationPoint(-1.25F, -2F, -2F);

		attachmentModel[15].addShapeBox(-0.5F, -8F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		attachmentModel[15].setRotationPoint(-1.25F, -2F, -0.5F);

		attachmentModel[16].addShapeBox(-1F, -9F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		attachmentModel[16].setRotationPoint(-1.25F, -2F, 1F);

		attachmentModel[17].addShapeBox(-1F, -9F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		attachmentModel[17].setRotationPoint(-1.25F, -2F, -2F);

		attachmentModel[18].addShapeBox(0F, -6F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 86
		attachmentModel[18].setRotationPoint(-1.25F, -2F, -2F);
		
		lightModel = new ModelRendererTurbo[1];
		lightModel[0] = new ModelRendererTurbo(this, 25, 29, textureX, textureY);

		lightModel[0].addShapeBox(-0.51F, -8F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		lightModel[0].setRotationPoint(-1.25F, -2F, -0.5F);

		flipAll();
		flip(lightModel);
	}
	
	@Override
	public void render(float f)
	{
		render(attachmentModel, f);
		glowOn();
		render(lightModel, f);
		glowOff();
	}
	
	@Override
	public void renderWithoutGlow(float f)
	{
		render(attachmentModel, f);
		render(lightModel, f);
	}
}