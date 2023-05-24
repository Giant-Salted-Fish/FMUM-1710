//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BerettaM9RearSight
// Model Creator: 
// Created on: 24.08.2019 - 09:46:57
// Last changed on: 24.08.2019 - 09:46:57

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelAtSight;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBerettaM9RearSight extends ModelAtSight //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	private ModelRendererTurbo[] lightModel;
	
	public ModelBerettaM9RearSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[9];
		attachmentModel[0] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 210
		attachmentModel[1] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 211
		attachmentModel[2] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 218
		attachmentModel[3] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 233
		attachmentModel[4] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 235
		attachmentModel[5] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 236
		attachmentModel[6] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 254
		attachmentModel[7] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 255
		attachmentModel[8] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 256

		attachmentModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.625F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.625F, -0.5F, 0F); // Box 210
		attachmentModel[0].setRotationPoint(-0.75F, -0.5F, -2F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.2F, 0F, -0.325F, -0.2F, 0F, -0.325F, -0.2F, 0.2F, 0.25F, -0.2F, 0.2F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0.25F, 0.5F, 0.2F); // Box 211
		attachmentModel[1].setRotationPoint(0.25F, -2F, -0.6F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 218
		attachmentModel[2].setRotationPoint(-1.25F, -1F, -0.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 233
		attachmentModel[3].setRotationPoint(-1.25F, -1.5F, -1.5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 235
		attachmentModel[4].setRotationPoint(-0.25F, -2.5F, 0.5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, -0.375F, 0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 236
		attachmentModel[5].setRotationPoint(-1.25F, -1.5F, 0.5F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 254
		attachmentModel[6].setRotationPoint(-1.25F, -2.5F, 1F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 255
		attachmentModel[7].setRotationPoint(-1.25F, -2.5F, -2F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 256
		attachmentModel[8].setRotationPoint(-0.25F, -2.5F, -1.5F);
		
		lightModel = new ModelRendererTurbo[2];
		lightModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 214
		lightModel[1] = new ModelRendererTurbo(this, 6, 65, textureX, textureY); // Box 257

		lightModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.7F, -0.4F, -0.25F, -0.7F, -0.4F); // Box 214
		lightModel[0].setRotationPoint(-0.259999999999998F, -2.5F, 0.670000000000002F);

		lightModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F); // Box 257
		lightModel[1].setRotationPoint(-0.259999999999998F, -2.5F, -1.67F);

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