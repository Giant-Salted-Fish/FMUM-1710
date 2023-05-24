//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 5.56x45mm
// Model Creator: 
// Created on: 22.06.2019 - 16:45:55
// Last changed on: 22.06.2019 - 16:45:55

package com.flansmod.client.model.Octagon_Weapons; //Path where the model is located

import com.flansmod.client.model.ModelTest;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelDemo extends ModelTest //Same as Filename
{
	int textureX = 128;
	int textureY = 128;
	
	ModelRendererTurbo[] canModel;
	ModelRendererTurbo[] canCoverModel;
	ModelRendererTurbo[] scoopModel;
	ModelRendererTurbo[] foodModel;
	
	Animation testAnimation = new Animation();

	public ModelDemo() //Same as Filename
	{
		testAnimation.add(0F, 0F, 0F, 0F, 0F, 0F, 10F);
		testAnimation.add(0F, 0F, 0F, 20F, 0F, 0F, 50F);
		testAnimation.add(0F, 0F, 10F / 16F, 20F, 0F, 0F, 30F);
		testAnimation.addTail(0F, 0F, 0F, 0F, 0F, 20F, 120F);
		
		canModel = new ModelRendererTurbo[17];
		canModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		canModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 18
		canModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 18
		canModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 18
		canModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 18
		canModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 18
		canModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 18
		canModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 17
		canModel[8] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 18
		canModel[9] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 18
		canModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 18
		canModel[11] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 18
		canModel[12] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 17
		canModel[13] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 17
		canModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17
		canModel[15] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 17
		canModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 17

		canModel[0].addShapeBox(-0.1F, -6F, -1F, 1, 10, 1, 0F, 0.9F, -3F, -0.125F, -1.7F, -3F, -0.175F, -1.7F, -3F, -0.175F, 0.9F, -3F, -0.125F, 0.9F, -3F, -0.125F, -1.7F, -3F, -0.175F, -1.7F, -3F, -0.175F, 0.9F, -3F, -0.125F); // Box 17
		canModel[0].setRotationPoint(0F, -1F, 0.5F);

		canModel[1].addShapeBox(-0.1F, -6F, -1F, 1, 10, 1, 0F, 0.4F, -3F, -1.4F, -0.775F, -3F, -1.75F, -0.825F, -3F, 0.95F, 0.575F, -3F, 0.525F, 0.4F, -3F, -1.4F, -0.775F, -3F, -1.75F, -0.825F, -3F, 0.95F, 0.575F, -3F, 0.525F); // Box 18
		canModel[1].setRotationPoint(0F, -1F, 0.5F);

		canModel[2].addShapeBox(-0.1F, -6F, -1F, 1, 10, 1, 0F, 0.7F, -3F, -0.825F, -1.4F, -3F, -1.4F, -1.575F, -3F, 0.525F, 0.9F, -3F, -0.125F, 0.7F, -3F, -0.825F, -1.4F, -3F, -1.4F, -1.575F, -3F, 0.525F, 0.9F, -3F, -0.125F); // Box 18
		canModel[2].setRotationPoint(0F, -1F, 0.5F);

		canModel[3].addShapeBox(-0.05F, -6F, -1F, 1, 10, 1, 0F, -0.175F, -3F, -1.75F, -0.175F, -3F, -1.75F, -0.125F, -3F, 0.95F, -0.125F, -3F, 0.95F, -0.175F, -3F, -1.75F, -0.175F, -3F, -1.75F, -0.125F, -3F, 0.95F, -0.125F, -3F, 0.95F); // Box 18
		canModel[3].setRotationPoint(0F, -1F, 0.5F);

		canModel[4].addShapeBox(-0.1F, -6F, -1F, 1, 10, 1, 0F, 0.575F, -3F, 0.525F, -0.825F, -3F, 0.95F, -0.775F, -3F, -1.75F, 0.4F, -3F, -1.4F, 0.575F, -3F, 0.525F, -0.825F, -3F, 0.95F, -0.775F, -3F, -1.75F, 0.4F, -3F, -1.4F); // Box 18
		canModel[4].setRotationPoint(0F, -1F, 0.5F);

		canModel[5].addShapeBox(-0.1F, -6F, -1F, 1, 10, 1, 0F, 0.9F, -3F, -0.125F, -1.575F, -3F, 0.525F, -1.4F, -3F, -1.4F, 0.7F, -3F, -0.825F, 0.9F, -3F, -0.125F, -1.575F, -3F, 0.525F, -1.4F, -3F, -1.4F, 0.7F, -3F, -0.825F); // Box 18
		canModel[5].setRotationPoint(0F, -1F, 0.5F);

		canModel[6].addShapeBox(-0.05F, -6F, -1F, 1, 10, 1, 0F, -0.125F, -3F, 0.95F, -0.125F, -3F, 0.95F, -0.175F, -3F, -1.75F, -0.175F, -3F, -1.75F, -0.125F, -3F, 0.95F, -0.125F, -3F, 0.95F, -0.175F, -3F, -1.75F, -0.175F, -3F, -1.75F); // Box 18
		canModel[6].setRotationPoint(0F, -1F, 0.5F);

		canModel[7].addShapeBox(0F, -6F, -1F, 1, 10, 1, 0F, -1.7F, -3F, -0.175F, 0.9F, -3F, -0.125F, 0.9F, -3F, -0.125F, -1.7F, -3F, -0.175F, -1.7F, -3F, -0.175F, 0.9F, -3F, -0.125F, 0.9F, -3F, -0.125F, -1.7F, -3F, -0.175F); // Box 17
		canModel[7].setRotationPoint(0F, -1F, 0.5F);

		canModel[8].addShapeBox(0F, -6F, -1F, 1, 10, 1, 0F, -0.775F, -3F, -1.75F, 0.4F, -3F, -1.4F, 0.575F, -3F, 0.525F, -0.825F, -3F, 0.95F, -0.775F, -3F, -1.75F, 0.4F, -3F, -1.4F, 0.575F, -3F, 0.525F, -0.825F, -3F, 0.95F); // Box 18
		canModel[8].setRotationPoint(0F, -1F, 0.5F);

		canModel[9].addShapeBox(0F, -6F, -1F, 1, 10, 1, 0F, -1.4F, -3F, -1.4F, 0.7F, -3F, -0.825F, 0.9F, -3F, -0.125F, -1.575F, -3F, 0.525F, -1.4F, -3F, -1.4F, 0.7F, -3F, -0.825F, 0.9F, -3F, -0.125F, -1.575F, -3F, 0.525F); // Box 18
		canModel[9].setRotationPoint(0F, -1F, 0.5F);

		canModel[10].addShapeBox(0F, -6F, -1F, 1, 10, 1, 0F, -0.825F, -3F, 0.95F, 0.575F, -3F, 0.525F, 0.4F, -3F, -1.4F, -0.775F, -3F, -1.75F, -0.825F, -3F, 0.95F, 0.575F, -3F, 0.525F, 0.4F, -3F, -1.4F, -0.775F, -3F, -1.75F); // Box 18
		canModel[10].setRotationPoint(0F, -1F, 0.5F);

		canModel[11].addShapeBox(0F, -6F, -1F, 1, 10, 1, 0F, -1.575F, -3F, 0.525F, 0.9F, -3F, -0.125F, 0.7F, -3F, -0.825F, -1.4F, -3F, -1.4F, -1.575F, -3F, 0.525F, 0.9F, -3F, -0.125F, 0.7F, -3F, -0.825F, -1.4F, -3F, -1.4F); // Box 18
		canModel[11].setRotationPoint(0F, -1F, 0.5F);

		canModel[12].addShapeBox(-0.3F, -0.2F, -1F, 1, 1, 1, 0F, 0.5F, -0.8F, -0.175F, -1.2F, -0.8F, 0.4F, -1.2F, -0.8F, 0.4F, 0.5F, -0.8F, -0.175F, 0.5F, 0F, -0.175F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0.4F, 0.5F, 0F, -0.175F); // Box 17
		canModel[12].setRotationPoint(0F, -1F, 0.5F);

		canModel[13].addShapeBox(0.1F, -0.2F, -1F, 1, 1, 1, 0F, 0.6F, -0.8F, 0.4F, -0.975F, -0.8F, 0.75F, -0.975F, -0.8F, 0.75F, 0.6F, -0.8F, 0.4F, 0.6F, 0F, 0.4F, -0.975F, 0F, 0.75F, -0.975F, 0F, 0.75F, 0.6F, 0F, 0.4F); // Box 17
		canModel[13].setRotationPoint(0F, -1F, 0.5F);

		canModel[14].addShapeBox(-0.05F, -0.2F, -1F, 1, 1, 1, 0F, -0.175F, -0.8F, 0.75F, -0.175F, -0.8F, 0.75F, -0.175F, -0.8F, 0.75F, -0.175F, -0.8F, 0.75F, -0.175F, 0F, 0.75F, -0.175F, 0F, 0.75F, -0.175F, 0F, 0.75F, -0.175F, 0F, 0.75F); // Box 17
		canModel[14].setRotationPoint(0F, -1F, 0.5F);

		canModel[15].addShapeBox(0.2F, -0.2F, -1F, 1, 1, 1, 0F, -1.2F, -0.8F, 0.4F, 0.5F, -0.8F, -0.175F, 0.5F, -0.8F, -0.175F, -1.2F, -0.8F, 0.4F, -1.2F, 0F, 0.4F, 0.5F, 0F, -0.175F, 0.5F, 0F, -0.175F, -1.2F, 0F, 0.4F); // Box 17
		canModel[15].setRotationPoint(0F, -1F, 0.5F);

		canModel[16].addShapeBox(-0.2F, -0.2F, -1F, 1, 1, 1, 0F, -0.975F, -0.8F, 0.75F, 0.6F, -0.8F, 0.4F, 0.6F, -0.8F, 0.4F, -0.975F, -0.8F, 0.75F, -0.975F, 0F, 0.75F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.4F, -0.975F, 0F, 0.75F); // Box 17
		canModel[16].setRotationPoint(0F, -1F, 0.5F);
		
		canCoverModel = new ModelRendererTurbo[5];
		canCoverModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 17
		canCoverModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 17
		canCoverModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 17
		canCoverModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 17
		canCoverModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 17

		canCoverModel[0].addShapeBox(-5.1F, 0.75F, -1F, 1, 1, 1, 0F, -0.125F, -0.4F, 0.95F, -0.125F, -0.4F, 0.95F, -0.125F, -0.4F, 0.95F, -0.125F, -0.4F, 0.95F, -0.125F, -0.4F, 0.95F, -0.125F, -0.4F, 0.95F, -0.125F, -0.4F, 0.95F, -0.125F, -0.4F, 0.95F); // Box 17
		canCoverModel[0].setRotationPoint(0.2F, -1.1F, 0.5F);
		canCoverModel[0].rotateAngleZ = -2.44346095F;

		canCoverModel[1].addShapeBox(-5.55F, 0.75F, -1F, 1, 1, 1, 0F, 0.5F, -0.4F, -0.125F, -1.175F, -0.4F, 0.525F, -1.175F, -0.4F, 0.525F, 0.5F, -0.4F, -0.125F, 0.5F, -0.4F, -0.125F, -1.175F, -0.4F, 0.525F, -1.175F, -0.4F, 0.525F, 0.5F, -0.4F, -0.125F); // Box 17
		canCoverModel[1].setRotationPoint(0.2F, -1.1F, 0.5F);
		canCoverModel[1].rotateAngleZ = -2.44346095F;

		canCoverModel[2].addShapeBox(-5.2F, 0.75F, -1F, 1, 1, 1, 0F, 0.525F, -0.4F, 0.525F, -0.775F, -0.4F, 0.95F, -0.775F, -0.4F, 0.95F, 0.525F, -0.4F, 0.525F, 0.525F, -0.4F, 0.525F, -0.775F, -0.4F, 0.95F, -0.775F, -0.4F, 0.95F, 0.525F, -0.4F, 0.525F); // Box 17
		canCoverModel[2].setRotationPoint(0.2F, -1.1F, 0.5F);
		canCoverModel[2].rotateAngleZ = -2.44346095F;

		canCoverModel[3].addShapeBox(-4.65F, 0.75F, -1F, 1, 1, 1, 0F, -1.175F, -0.4F, 0.525F, 0.5F, -0.4F, -0.125F, 0.5F, -0.4F, -0.125F, -1.175F, -0.4F, 0.525F, -1.175F, -0.4F, 0.525F, 0.5F, -0.4F, -0.125F, 0.5F, -0.4F, -0.125F, -1.175F, -0.4F, 0.525F); // Box 17
		canCoverModel[3].setRotationPoint(0.2F, -1.1F, 0.5F);
		canCoverModel[3].rotateAngleZ = -2.44346095F;

		canCoverModel[4].addShapeBox(-5F, 0.75F, -1F, 1, 1, 1, 0F, -0.775F, -0.4F, 0.95F, 0.525F, -0.4F, 0.525F, 0.525F, -0.4F, 0.525F, -0.775F, -0.4F, 0.95F, -0.775F, -0.4F, 0.95F, 0.525F, -0.4F, 0.525F, 0.525F, -0.4F, 0.525F, -0.775F, -0.4F, 0.95F); // Box 17
		canCoverModel[4].setRotationPoint(0.2F, -1.1F, 0.5F);
		canCoverModel[4].rotateAngleZ = -2.44346095F;

		foodModel = new ModelRendererTurbo[5];
		foodModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		foodModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 17
		foodModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 17
		foodModel[3] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 17
		foodModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 17

		foodModel[0].addShapeBox(-0.3F, -5.5F, -1F, 1, 1, 1, 0F, 0.5F, 0F, -0.175F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0.4F, 0.5F, 0F, -0.175F, 0.5F, 0F, -0.175F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0.4F, 0.5F, 0F, -0.175F); // Box 17
		foodModel[0].setRotationPoint(0F, 2F, 0.5F);

		foodModel[1].addShapeBox(0.1F, -5.5F, -1F, 1, 1, 1, 0F, 0.6F, 0F, 0.4F, -0.975F, 0F, 0.75F, -0.975F, 0F, 0.75F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.4F, -0.975F, 0F, 0.75F, -0.975F, 0F, 0.75F, 0.6F, 0F, 0.4F); // Box 17
		foodModel[1].setRotationPoint(0F, 2F, 0.5F);

		foodModel[2].addShapeBox(-0.05F, -5.5F, -1F, 1, 1, 1, 0F, -0.175F, 0F, 0.75F, -0.175F, 0F, 0.75F, -0.175F, 0F, 0.75F, -0.175F, 0F, 0.75F, -0.175F, 0F, 0.75F, -0.175F, 0F, 0.75F, -0.175F, 0F, 0.75F, -0.175F, 0F, 0.75F); // Box 17
		foodModel[2].setRotationPoint(0F, 2F, 0.5F);

		foodModel[3].addShapeBox(0.2F, -5.5F, -1F, 1, 1, 1, 0F, -1.2F, 0F, 0.4F, 0.5F, 0F, -0.175F, 0.5F, 0F, -0.175F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0.4F, 0.5F, 0F, -0.175F, 0.5F, 0F, -0.175F, -1.2F, 0F, 0.4F); // Box 17
		foodModel[3].setRotationPoint(0F, 2F, 0.5F);

		foodModel[4].addShapeBox(-0.2F, -5.5F, -1F, 1, 1, 1, 0F, -0.975F, 0F, 0.75F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.4F, -0.975F, 0F, 0.75F, -0.975F, 0F, 0.75F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.4F, -0.975F, 0F, 0.75F); // Box 17
		foodModel[4].setRotationPoint(0F, 2F, 0.5F);
		
		flip(canModel);
		flip(canCoverModel);
		flip(foodModel);
	}
	
	@Override
	public void render(float f)
	{
		float progress = getActualProgress();
		bindTex("Can");
		//scale(0.1F, 0.1F, 0.1F);
		testAnimation.applyAnimationFor(progress, canModel, f);
		//render(canModel, f);
		render(canCoverModel, f);
		render(foodModel, f);
	}
}