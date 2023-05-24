package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class RenderTest extends RenderFlan implements IItemRenderer
{
	public static Minecraft minecraft;
	
	public RenderTest()
	{
		//initialize values
		minecraft = FlansModClient.minecraft;
	}
	
	@Override
	public boolean handleRenderType(ItemStack itemStack, ItemRenderType rType)
	{
		switch(rType) // If render model in 2D in some of the cases if to reduce the load
		{
			case ENTITY: return false;
			case EQUIPPED:
			case EQUIPPED_FIRST_PERSON: //check if the condition is allowing us to render 3D model
				return itemStack != null && ((ItemPart)itemStack.getItem()).type.model != null;
			default: return false;
		}
	}
	
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType t, ItemStack i, ItemRendererHelper h) { return false; }

	private static ItemStack itemStack;
	private static PartType partType;
	private static ModelTest model;
	@Override
	public void renderItem(ItemRenderType rt, ItemStack is, Object... data)
	{
		model = (partType = ((ItemPart)(itemStack = is).getItem()).type).model;
		switch(rt)
		{
			case ENTITY:
				renderEntity();
				break;
			case EQUIPPED:
				renderThirdPerson();
				break;
			case EQUIPPED_FIRST_PERSON:
				renderFirstPerson();
				break;
			default:;
		}
	}
	
	private void renderEntity()
	{
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.2F + model.itemFrameOffset.x, 0.2F + model.itemFrameOffset.y, 0.1F + model.itemFrameOffset.z);
		model.render(f);
		GL11.glPopMatrix();
	}

	private void renderThirdPerson()
	{
		GL11.glPushMatrix();
		GL11.glRotatef(35F, 0F, 0F, 1F);
		GL11.glRotatef(-5F, 0F, 1F, 0F);
		GL11.glTranslatef(0.75F, -0.22F, -0.08F);
		GL11.glScalef(1F, 1F, -1F);
		GL11.glTranslatef(model.thirdPersonOffset.x, model.thirdPersonOffset.y, model.thirdPersonOffset.z);
		model.render(f);
		GL11.glPopMatrix();
	}

	private void renderFirstPerson()
	{
		GL11.glPushMatrix();GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		Project.gluPerspective(getFOVModifier(), (float)mc.displayWidth / (float)mc.displayHeight, 0.05F, mc.gameSettings.renderDistanceChunks * 32F);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glRotatef(20F, 0F, 0F, 1F);
		GL11.glRotatef(-5F, 0F, 1F, 0F);
		GL11.glTranslatef(0.15F, 0.375F, -1.005F);
		GL11.glRotatef(0.5F, 1F, 0F, 0F);
		GL11.glRotatef(5F, 0F, 0F, 1F);
		GL11.glTranslatef(0F, 0.7F / 160F - 0.03F, -0.35F / 160F);
		model.render(f);
		GL11.glPopMatrix();
	}
}
