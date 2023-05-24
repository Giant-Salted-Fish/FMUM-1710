//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CIC IS-4 Sight
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCICIS4FrontSight extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	private ModelRendererTurbo[] lightModel;

	public ModelCICIS4FrontSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[15];
		attachmentModel[0] = new ModelRendererTurbo(this, 24, 35, textureX, textureY); // Box 38
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 47, textureX, textureY); // Box 39
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 51, textureX, textureY); // Box 40
		attachmentModel[3] = new ModelRendererTurbo(this, 57, 22, textureX, textureY); // Box 41
		attachmentModel[4] = new ModelRendererTurbo(this, 41, 21, textureX, textureY); // Box 42
		attachmentModel[5] = new ModelRendererTurbo(this, 53, 32, textureX, textureY); // Box 43
		attachmentModel[6] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 44
		attachmentModel[7] = new ModelRendererTurbo(this, 42, 32, textureX, textureY); // Box 45
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 46
		attachmentModel[9] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 47
		attachmentModel[10] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 48
		attachmentModel[11] = new ModelRendererTurbo(this, 31, 8, textureX, textureY); // Box 49
		attachmentModel[12] = new ModelRendererTurbo(this, 30, 18, textureX, textureY); // Box 50
		attachmentModel[13] = new ModelRendererTurbo(this, 23, 10, textureX, textureY); // Box 51
		attachmentModel[14] = new ModelRendererTurbo(this, 14, 43, textureX, textureY); // Box 55

		attachmentModel[0].addShapeBox(1F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 38
		attachmentModel[0].setRotationPoint(-2.5F, -1F, -4F);

		attachmentModel[1].addShapeBox(1F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		attachmentModel[1].setRotationPoint(-2.5F, 0F, -4F);

		attachmentModel[2].addShapeBox(1F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		attachmentModel[2].setRotationPoint(-2.5F, 0F, 3F);

		attachmentModel[3].addShapeBox(1F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 41
		attachmentModel[3].setRotationPoint(-0.5F, -2F, -3F);

		attachmentModel[4].addShapeBox(1F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 42
		attachmentModel[4].setRotationPoint(-0.5F, -3.5F, -3F);

		attachmentModel[5].addShapeBox(-1F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		attachmentModel[5].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[6].addShapeBox(-1F, -6F, 0F, 2, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		attachmentModel[6].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[7].addShapeBox(1F, -5F, 0F, 1, 3, 4, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		attachmentModel[7].setRotationPoint(1.5F, -2F, -2F);

		attachmentModel[8].addShapeBox(0F, -8F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		attachmentModel[8].setRotationPoint(1.5F, -2F, -0.5F);

		attachmentModel[9].addShapeBox(1F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 47
		attachmentModel[9].setRotationPoint(-0.5F, -3.5F, 2F);

		attachmentModel[10].addShapeBox(1F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 48
		attachmentModel[10].setRotationPoint(-0.5F, -2F, 2F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		attachmentModel[11].setRotationPoint(-0.5F, 0F, -6.5F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		attachmentModel[12].setRotationPoint(0.5F, 1F, -7F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 51
		attachmentModel[13].setRotationPoint(0.5F, -1F, -7F);

		attachmentModel[14].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		attachmentModel[14].setRotationPoint(1.5F, -2F, -3.5F);
		attachmentModel[14].rotateAngleZ = -0.78539816F;

		lightModel = new ModelRendererTurbo[1];
		lightModel[0] = new ModelRendererTurbo(this, 58, 28, textureX, textureY); // Box 53

		lightModel[0].addShapeBox(-0.01F, -8F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		lightModel[0].setRotationPoint(1.5F, -2F, -0.5F);

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