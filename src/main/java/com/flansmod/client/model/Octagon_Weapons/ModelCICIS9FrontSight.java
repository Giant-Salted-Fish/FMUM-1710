//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC IS-9 Sight
// Model Creator: 
// Created on: 09.07.2019 - 14:05:25
// Last changed on: 09.07.2019 - 14:05:25

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICIS9FrontSight extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	private ModelRendererTurbo[] lightModel;

	public ModelCICIS9FrontSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[14];
		attachmentModel[0] = new ModelRendererTurbo(this, 38, 38, textureX, textureY); // Box 38
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 39
		attachmentModel[2] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 40
		attachmentModel[3] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 41
		attachmentModel[4] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 42
		attachmentModel[5] = new ModelRendererTurbo(this, 49, 10, textureX, textureY); // Box 43
		attachmentModel[6] = new ModelRendererTurbo(this, 32, 10, textureX, textureY); // Box 44
		attachmentModel[7] = new ModelRendererTurbo(this, 14, 11, textureX, textureY); // Box 45
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 46
		attachmentModel[9] = new ModelRendererTurbo(this, 13, 24, textureX, textureY); // Box 47
		attachmentModel[10] = new ModelRendererTurbo(this, 9, 39, textureX, textureY); // Box 48
		attachmentModel[11] = new ModelRendererTurbo(this, 46, 33, textureX, textureY); // Box 49
		attachmentModel[12] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 50
		attachmentModel[13] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 51

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		attachmentModel[0].setRotationPoint(-1.5F, -1F, -4F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		attachmentModel[1].setRotationPoint(-1.5F, 0F, -4F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		attachmentModel[2].setRotationPoint(-1.5F, 0F, 3F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		attachmentModel[3].setRotationPoint(-1.5F, -3F, -4F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		attachmentModel[4].setRotationPoint(-1.5F, -3F, 2F);

		attachmentModel[5].addShapeBox(-1F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		attachmentModel[5].setRotationPoint(0.5F, -2F, -2F);

		attachmentModel[6].addShapeBox(-1F, -2F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		attachmentModel[6].setRotationPoint(0.5F, -2F, -2F);

		attachmentModel[7].addShapeBox(-1F, -3F, 0F, 3, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 45
		attachmentModel[7].setRotationPoint(0.5F, -2F, -2F);

		attachmentModel[8].addShapeBox(-1F, -6F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		attachmentModel[8].setRotationPoint(0.5F, -2F, -1.5F);

		attachmentModel[9].addShapeBox(1F, -8F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		attachmentModel[9].setRotationPoint(0.5F, -2F, -0.5F);

		attachmentModel[10].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		attachmentModel[10].setRotationPoint(0.5F, -2F, -4F);
		attachmentModel[10].rotateAngleZ = 0.78539816F;

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 49
		attachmentModel[11].setRotationPoint(-0.5F, -1F, -7F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		attachmentModel[12].setRotationPoint(-0.5F, 0F, -6.5F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 51
		attachmentModel[13].setRotationPoint(-0.5F, 1F, -7F);

		lightModel = new ModelRendererTurbo[1];
		lightModel[0] = new ModelRendererTurbo(this, 2, 36, textureX, textureY); // Box 52

		lightModel[0].addShapeBox(0.99F, -8F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		lightModel[0].setRotationPoint(0.5F, -2F, -0.5F);

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