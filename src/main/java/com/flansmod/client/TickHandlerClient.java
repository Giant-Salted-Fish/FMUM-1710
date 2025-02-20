package com.flansmod.client;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.model.RenderFlag;
import com.flansmod.client.model.RenderFlan;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.OperationQueue.Operation;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.GunType.GunTag;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketGunAttachment;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Vector3i;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MouseHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.MinecraftForge;

public class TickHandlerClient
{
	public static final ResourceLocation offHand = new ResourceLocation("flansmod","gui/offHand.png");
	public static ArrayList<Vector3i> blockLightOverrides = new ArrayList<Vector3i>();
	public static ArrayList<Vector3i>vehicleLightOverrides = new ArrayList<Vector3i>();
	public static int lightOverrideRefreshRate = 5;
	public static int vehicleLightOverrideRefreshRate = 1;
	int tickcount = 0;
	int tickcountflash = 0;
	int tickcountWounded = 0;
	boolean isInFlash;
	int flashTime;
	EntityPlayer entityPlayerFlash;
	private static GuiScreen guiDriveableController = null;
	private static final ResourceLocation stateBar = new ResourceLocation("flansmod", "gui/stateBar.png");

	public TickHandlerClient()
	{
		FMLCommonHandler.instance().bus().register(this);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void eventHandler(MouseEvent event)
	{
		if(Math.abs(event.dwheel) > 0 && FlansModClient.itemStack != null && FlansModClient.itemStack.getItem() instanceof ItemGun 
				&& FlansModClient.currentScope && FlansMod.zoomWithWheel)
		{
			boolean cancelEvent = false;
			LinkedList<byte[]> sightsOnUse = GunType.getOnUseSightsAt(GunType.getStates(FlansModClient.itemStack), GunType.getSightList(FlansModClient.itemStack));
			if(sightsOnUse.size() == 0) return;
			NBTTagCompound sightTag;
			AttachmentType sightType;
			for(byte[] sightAt : sightsOnUse)
			{
				sightType = AttachmentType.getAtType(sightTag = 
						GunType.getAtTagAt(FlansModClient.itemStack.stackTagCompound, sightAt, sightAt.length & -2));
				if(sightType.FOVZoomLevel.length < 2) continue;
				cancelEvent = true;
				byte currentZoomStep = AttachmentType.getZoomStep(AttachmentType.getStates(sightTag));
				boolean lastOutOfBound = currentZoomStep == 0, nextOutOfBound = currentZoomStep + 1 == sightType.FOVZoomLevel.length;
				float currentZoom = sightType.FOVZoomLevel[currentZoomStep], 
						lastZoom = sightType.FOVZoomLevel[(lastOutOfBound ? sightType.FOVZoomLevel.length : currentZoomStep) - 1], 
						nextZoom = sightType.FOVZoomLevel[nextOutOfBound ? 0 : (currentZoomStep + 1)];
				if(FlansMod.loopWhenChangeZoom)
				{
					FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(
							(event.dwheel < 0 ? nextZoom < currentZoom : nextZoom > currentZoom) ? Operation.NEXT_ZOOM_L : Operation.LAST_ZOOM_L));
					event.setCanceled(true);
					return;
				}
				if(event.dwheel < 0)
				{
					if(nextZoom < currentZoom && !nextOutOfBound) FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.NEXT_ZOOM));
					else if(lastZoom < currentZoom && !lastOutOfBound) FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.LAST_ZOOM));
					else continue;
				}
				else if(nextZoom > currentZoom && !nextOutOfBound) FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.NEXT_ZOOM));
				else if(lastZoom > currentZoom && !lastOutOfBound) FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.LAST_ZOOM));
				else continue;
				break;
			}
			if(cancelEvent) event.setCanceled(true);
		}
	}

	@SubscribeEvent
	public void eventHandler(RenderGameOverlayEvent event)
	{
		Minecraft mc = FlansModClient.minecraft;
		//If main config is set to false, blanket disable crosshairs (client synced)
		if(event.type == ElementType.CROSSHAIRS && mc.thePlayer != null && mc.thePlayer.getHeldItem() != null && mc.thePlayer.getHeldItem().getItem() instanceof ItemGun)
		{
			if(!FlansMod.crosshairEnable || !((ItemGun)mc.thePlayer.getHeldItem().getItem()).type.showCrosshair || FlansModClient.currentScope)
			{
				event.setCanceled(true);
				return;
			}
		}

		ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();

		Tessellator tessellator = Tessellator.instance;

		if(!event.isCancelable() && event.type == ElementType.HELMET)
		{
			//helmet overlays
			String overlayTexture = null;
			if(mc.thePlayer != null)
			{
				ItemStack helmetStack = mc.thePlayer.inventory.armorInventory[3];
				if(helmetStack != null && helmetStack.getItem() instanceof ItemTeamArmour
						&& (overlayTexture = ((ItemTeamArmour)helmetStack.getItem()).type.overlay[com.flansmod.common.teams.ArmourType.getMask(helmetStack) ? 1 : 0]) != null)
				{
					FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
					GL11.glEnable(3042 /* GL_BLEND */);
					GL11.glDisable(2929 /* GL_DEPTH_TEST */);
					GL11.glDepthMask(false);
					GL11.glBlendFunc(770, 771);
					GL11.glColor4f(1F, 1F, 1F, 1F);
					GL11.glDisable(3008 /* GL_ALPHA_TEST */);
	
					mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(overlayTexture));
	
					tessellator.startDrawingQuads();
					tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0D, 1D);
					tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1D, 1D);
					tessellator.addVertexWithUV(i / 2 + 2 * j, 0D, -90D, 1D, 0D);
					tessellator.addVertexWithUV(i / 2 - 2 * j, 0D, -90D, 0D, 0D);
					tessellator.draw();
					GL11.glDepthMask(true);
					GL11.glEnable(2929 /* GL_DEPTH_TEST */);
					GL11.glEnable(3008 /* GL_ALPHA_TEST */);
					GL11.glColor4f(1F, 1F, 1F, 1F);
				}
			}
		}

	    if(!event.isCancelable() && event.type == ElementType.HOTBAR)
	    {
			//Player ammo overlay
			/*if(FlansMod.bulletGuiEnable && mc.thePlayer != null)
			{
				ItemStack stack = mc.thePlayer.inventory.getCurrentItem();
				if(stack != null && stack.getItem() instanceof ItemGun)
				{
					ItemGun gunItem = (ItemGun)stack.getItem();
					GunType gunType = gunItem.type;
					int x = 0;
					for(int n = 0; n < gunType.getNumAmmoItemsInGun(stack); ++n)
					{
						ShootableType bulletType = FlansModClient.getBulletItemStackClient(stack, n);
						if(bulletType != null)// && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
						{
							RenderHelper.enableGUIStandardItemLighting();
							GL11.glEnable(GL12.GL_RESCALE_NORMAL);
							OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
							drawSlotInventory(mc.fontRenderer, new ItemStack(bulletType.item), i / 2 + 16 + x, j - 65);
							GL11.glDisable(GL12.GL_RESCALE_NORMAL);
							RenderHelper.disableStandardItemLighting();
							/*String s = (bulletType.getMaxDamage() - bulletType.getItemDamage()) + "/" + bulletType.getMaxDamage();
							if(gunType.submode.length > 1)
								s = s + "[" + GunType.getFireMode(stack) + "]";
							if(bulletType.getMaxDamage() == 1)
								s = "";
							mc.fontRenderer.drawString(s, i / 2 + 32 + x, j - 59, 0x000000); //mark here to learn how to draw string
							mc.fontRenderer.drawString(s, i / 2 + 33 + x, j - 60, 0xffffff);
							x += 16 + mc.fontRenderer.getStringWidth(s);
						}
					}
					//Render secondary gun
					PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);
					if(gunType.oneHanded && data.offHandGunSlot != -1)
					{
						ItemStack offHandStack = mc.thePlayer.inventory.getStackInSlot(data.offHandGunSlot);
						if(offHandStack != null && offHandStack.getItem() instanceof ItemGun)
						{
							GunType offHandGunType = ((ItemGun)offHandStack.getItem()).type;
							x = 0;
							for(int n = 0; n < offHandGunType.getNumAmmoItemsInGun(offHandStack); ++n)
							{
								ShootableType bulletType = FlansModClient.getBulletItemStackClient(offHandStack, n);
								if(bulletType != null)
								{
									//Find the string we are displaying next to the ammo item
									String s = (bulletType.getMaxDamage() - bulletType.getItemDamage()) + "/" + bulletType.getMaxDamage();
									if(gunType.submode.length > 1)
										s = s + "[" + GunType.getFireMode(offHandStack) + "]";
									if(bulletType.getMaxDamage() == 1)
										s = "";

									//Draw the slot and then move leftwards
									RenderHelper.enableGUIStandardItemLighting();
									GL11.glColor4f(1F, 1F, 1F, 1F);
									GL11.glEnable(GL12.GL_RESCALE_NORMAL);
									OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
									drawSlotInventory(mc.fontRenderer, bulletType, i / 2 - 32 - x, j - 65);
									x += 16 + mc.fontRenderer.getStringWidth(s);

									//Draw the string
									GL11.glDisable(GL12.GL_RESCALE_NORMAL);
									RenderHelper.disableStandardItemLighting();
									mc.fontRenderer.drawString(s, i / 2 - 16 - x, j - 59, 0x000000);
									mc.fontRenderer.drawString(s, i / 2 - 17 - x, j - 60, 0xffffff);
								}
							}
						}
					}
				}
			}*/
			
			PacketTeamInfo teamInfo = FlansModClient.teamInfo;
			
			//if(FlansMod.enableStaminaSystem)
			//{
				GL11.glEnable(3042 /* GL_BLEND */);
				GL11.glDisable(2929 /* GL_DEPTH_TEST */);
				GL11.glDepthMask(false);
				GL11.glBlendFunc(770, 771);
				GL11.glColor4f(1F, 1F, 1F, 1F);
				GL11.glDisable(3008 /* GL_ALPHA_TEST */);
				
				mc.renderEngine.bindTexture(stateBar);
				//stamina reference dot
				tessellator.startDrawingQuads();
				tessellator.addVertexWithUV(i * 0.7F, j * 0.98F, -90D, 0D / 256D, 4D / 16D);
				tessellator.addVertexWithUV(i, j * 0.98F, -90D, 256D / 256D, 4D / 16D);
				tessellator.addVertexWithUV(i, j * 0.97F, -90D, 256D / 256D, 0D / 16D);
				tessellator.addVertexWithUV(i * 0.7F, j * 0.97F, -90D, 0D / 256D, 0D / 16D);
				tessellator.draw();
				//stamina bar
				float tempFloat = FlansModClient.lastCurrentStamina + (FlansModClient.currentStamina - FlansModClient.lastCurrentStamina) * event.partialTicks;
				tessellator.startDrawingQuads();
				tessellator.addVertexWithUV(i * 0.702F, j * 0.965F, -90D, 0D / 256D, 16D / 16D);
				tessellator.addVertexWithUV(i * (0.702F + 0.282F * tempFloat), j * 0.965F, -90D, 256D / 256D, 16D / 16D);
				tessellator.addVertexWithUV(i * (0.702F + 0.282F * tempFloat), j * 0.958F, -90D, 256D / 256D, 10D / 16D);
				tessellator.addVertexWithUV(i * 0.702F, j * 0.958F, -90D, 0D / 256D, 10D / 16D);
				tessellator.draw();
				//air bar
				tempFloat = FlansModClient.lastCurrentAir + (FlansModClient.currentAir - FlansModClient.lastCurrentAir) * event.partialTicks;
				tessellator.startDrawingQuads();
				tessellator.addVertexWithUV(i * 0.702F, j * 0.952F, -90D, 0D / 256D, 10D / 16D);
				tessellator.addVertexWithUV(i * (0.702F + 0.282F * tempFloat), j * 0.952F, -90D, 256D / 256D, 10D / 16D);
				tessellator.addVertexWithUV(i * (0.702F + 0.282F * tempFloat), j * 0.945F, -90D, 256D / 256D, 4D / 16D);
				tessellator.addVertexWithUV(i * 0.702F, j * 0.945F, -90D, 0D / 256D, 4D / 16D);
				tessellator.draw();
				
				GL11.glDepthMask(true);
				GL11.glEnable(2929 /* GL_DEPTH_TEST */);
				GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			//}
			
			if(teamInfo != null && FlansModClient.minecraft.thePlayer != null && (teamInfo.numTeams > 0 || !teamInfo.sortedByTeam) && teamInfo.getPlayerScoreData(FlansModClient.minecraft.thePlayer.getCommandSenderName()) != null)
			{
				GL11.glEnable(3042 /* GL_BLEND */);
				GL11.glDisable(2929 /* GL_DEPTH_TEST */);
				GL11.glDepthMask(false);
				GL11.glBlendFunc(770, 771);
				GL11.glColor4f(1F, 1F, 1F, 1F);
				GL11.glDisable(3008 /* GL_ALPHA_TEST */);

				mc.renderEngine.bindTexture(GuiTeamScores.texture);

				tessellator.startDrawingQuads();
				tessellator.addVertexWithUV(i / 2 - 43, 27, -90D, 85D / 256D, 27D / 256D);
				tessellator.addVertexWithUV(i / 2 + 43, 27, -90D, 171D / 256D, 27D / 256D);
				tessellator.addVertexWithUV(i / 2 + 43, 0D, -90D, 171D / 256D, 0D / 256D);
				tessellator.addVertexWithUV(i / 2 - 43, 0D, -90D, 85D / 256D, 0D / 256D);
				tessellator.draw();

				//If we are in a two team gametype, draw the team scores at the top of the screen
				if(teamInfo.numTeams == 2 && teamInfo.sortedByTeam)
				{
					//Draw team 1 colour bit
					int colour = teamInfo.teamData[0].team.teamColour;
					GL11.glColor4f(((colour >> 16) & 0xff) / 256F, ((colour >> 8) & 0xff) / 256F, (colour & 0xff) / 256F, 1.0F);
					tessellator.startDrawingQuads();
					tessellator.addVertexWithUV(i / 2 - 43, 27, -90D, 0D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 - 19, 27, -90D, 24D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 - 19, 0D, -90D, 24D / 256D, 98D / 256D);
					tessellator.addVertexWithUV(i / 2 - 43, 0D, -90D, 0D / 256D, 98D / 256D);
					tessellator.draw();
					//Draw team 2 colour bit
					colour = teamInfo.teamData[1].team.teamColour;
					GL11.glColor4f(((colour >> 16) & 0xff) / 256F, ((colour >> 8) & 0xff) / 256F, (colour & 0xff) / 256F, 1.0F);
					tessellator.startDrawingQuads();
					tessellator.addVertexWithUV(i / 2 + 19, 27, -90D, 62D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 + 43, 27, -90D, 86D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 + 43, 0D, -90D, 86D / 256D, 98D / 256D);
					tessellator.addVertexWithUV(i / 2 + 19, 0D, -90D, 62D / 256D, 98D / 256D);
					tessellator.draw();

					GL11.glDepthMask(true);
					GL11.glEnable(2929 /* GL_DEPTH_TEST */);
					GL11.glEnable(3008 /* GL_ALPHA_TEST */);
					GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

					//Draw the team scores
					mc.fontRenderer.drawString(teamInfo.teamData[0].score + "", i / 2 - 35, 9, 0x000000);
					mc.fontRenderer.drawString(teamInfo.teamData[0].score + "", i / 2 - 36, 8, 0xffffff);
					mc.fontRenderer.drawString(teamInfo.teamData[1].score + "", i / 2 + 35 - mc.fontRenderer.getStringWidth(teamInfo.teamData[1].score + ""), 9, 0x000000);
					mc.fontRenderer.drawString(teamInfo.teamData[1].score + "", i / 2 + 34 - mc.fontRenderer.getStringWidth(teamInfo.teamData[1].score + ""), 8, 0xffffff);
				}

				mc.fontRenderer.drawString(teamInfo.gametype + "", i / 2 + 48, 9, 0x000000);
				mc.fontRenderer.drawString(teamInfo.gametype + "", i / 2 + 47, 8, 0xffffff);
				mc.fontRenderer.drawString(teamInfo.map + "", i / 2 - 47 - mc.fontRenderer.getStringWidth(teamInfo.map + ""), 9, 0x000000);
				mc.fontRenderer.drawString(teamInfo.map + "", i / 2 - 48 - mc.fontRenderer.getStringWidth(teamInfo.map + ""), 8, 0xffffff);

				int secondsLeft = teamInfo.timeLeft / 20;
				int minutesLeft = secondsLeft / 60;
				secondsLeft = secondsLeft % 60;
				String timeLeft = minutesLeft + ":" + (secondsLeft < 10 ? "0" + secondsLeft : secondsLeft);
				mc.fontRenderer.drawString(timeLeft, i / 2 - mc.fontRenderer.getStringWidth(timeLeft) / 2 - 1, 29, 0x000000);
				mc.fontRenderer.drawString(timeLeft, i / 2 - mc.fontRenderer.getStringWidth(timeLeft) / 2, 30, 0xffffff);


				GL11.glDepthMask(true);
				GL11.glEnable(2929 /* GL_DEPTH_TEST */);
				GL11.glEnable(3008 /* GL_ALPHA_TEST */);
				GL11.glColor4f(1F, 1F, 1F, 1F);
				String playerUsername = FlansModClient.minecraft.thePlayer.getCommandSenderName();

				mc.fontRenderer.drawString(teamInfo.getPlayerScoreData(playerUsername).score + "", i / 2 - 7, 1, 0x000000);
				mc.fontRenderer.drawString(teamInfo.getPlayerScoreData(playerUsername).kills + "", i / 2 - 7, 9, 0x000000);
				mc.fontRenderer.drawString(teamInfo.getPlayerScoreData(playerUsername).deaths + "", i / 2 - 7, 17, 0x000000);
			}
			//marked here to disable show killers
			for(KillMessage killMessage : killMessages)
				mc.fontRenderer.drawString("\u00a7" + killMessage.killerName + "     " + "\u00a7" + killMessage.killedName, i - mc.fontRenderer.getStringWidth(killMessage.killerName + "     " + killMessage.killedName) - 6, j - 32 - killMessage.line * 16, 0xffffff);

			//Draw icons indicated weapons used
			RenderHelper.enableGUIStandardItemLighting();
			GL11.glColor4f(1F, 1F, 1F, 1F);
			GL11.glEnable(GL12.GL_RESCALE_NORMAL);
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
			for(KillMessage killMessage : killMessages)
				drawSlotInventory(mc.fontRenderer, new ItemStack(killMessage.weapon.item), i - mc.fontRenderer.getStringWidth("     " + killMessage.killedName) - 12, j - 36 - killMessage.line * 16);
			
			GL11.glDisable(3042 /*GL_BLEND*/);
			RenderHelper.disableStandardItemLighting();

			//Off-hand weapon graphics
			mc.renderEngine.bindTexture(offHand);

			ItemStack currentStack = mc.thePlayer.inventory.getCurrentItem();
			PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);

			/** for offhand gun, out dated
			if(currentStack != null && currentStack.getItem() instanceof ItemGun && ((ItemGun)currentStack.getItem()).type.oneHanded)
			{
				for(int n = 0; n < 9; n++)
				{
					if(data.offHandGunSlot == n)
					{
						tessellator.startDrawingQuads();
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 3, -90D, 16D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 3, -90D, 32D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 19, -90D, 32D / 64D, 0D / 32D);
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 19, -90D, 16D / 64D, 0D / 32D);
						tessellator.draw();
					}
					else if(data.isValidOffHandWeapon(mc.thePlayer, n))
					{
						tessellator.startDrawingQuads();
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 3, -90D, 0D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 3, -90D, 16D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 19, -90D, 16D / 64D, 0D / 32D);
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 19, -90D, 0D / 64D, 0D / 32D);
						tessellator.draw();
					}
				}
			}*/
			//RenderHitCrossHair
			if(EntityBullet.hitCrossHair)
			{
				tickcount = 20;
				EntityBullet.hitCrossHair = false;
			}
			if(FlansMod.hitCrossHairEnable && tickcount > 0)
			{
				ItemStack stack = mc.thePlayer.inventory.getCurrentItem();
				if(stack != null && stack.getItem() instanceof ItemGun)
				{
					GunType gunType = ((ItemGun)stack.getItem()).type;
					FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
					GL11.glEnable(GL11.GL_BLEND);
					GL11.glDisable(GL11.GL_DEPTH_TEST);
					GL11.glDepthMask(false);
					GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
					GL11.glColor4f(1F, 1F, 1F, tickcount / 20F);
					GL11.glDisable(GL11.GL_ALPHA_TEST);
					//Custom hit marker GUI if set in gun config
					if(gunType.hitTexture != null)
						mc.renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(gunType.hitTexture));
					else //Default hit marker GUI
						mc.renderEngine.bindTexture(new ResourceLocation("flansmod", FlansMod.hdHitCrosshair ? "gui/HDCrossHair.png" : "gui/CrossHair.png"));
					
					tessellator.startDrawingQuads();
					tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0D, 1D);
					tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1D, 1D);
					tessellator.addVertexWithUV(i / 2 + 2 * j, 0D, -90D, 1D, 0D);
					tessellator.addVertexWithUV(i / 2 - 2 * j, 0D, -90D, 0D, 0D);
					tessellator.draw();
					GL11.glDepthMask(true);
					GL11.glEnable(GL11.GL_DEPTH_TEST);
					GL11.glEnable(GL11.GL_ALPHA_TEST);
					GL11.glColor4f(1F, 1F, 1F, 1F);
				}
			}
			//render hurt red screen
			if(mc.thePlayer.hurtTime > 0)
				tickcountWounded = 40;
			if(tickcountWounded > 0)
			{
				mc.entityRenderer.setupOverlayRendering();
				GL11.glEnable(GL11.GL_BLEND);
				GL11.glDisable(GL11.GL_DEPTH_TEST);
				GL11.glDepthMask(false);
				GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
				GL11.glColor4f(1F, 1F, 1F, tickcountWounded / 20);
				GL11.glDisable(GL11.GL_ALPHA_TEST);

				mc.renderEngine.bindTexture(new ResourceLocation("flansmod", "gui/Blood.png"));

				tessellator.startDrawingQuads();
				tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0D, 1D);
				tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1D, 1D);
				tessellator.addVertexWithUV(i / 2 + 2 * j, 0D, -90D, 1D, 0D);
				tessellator.addVertexWithUV(i / 2 - 2 * j, 0D, -90D, 0D, 0D);
				tessellator.draw();
				GL11.glDepthMask(true);
				GL11.glEnable(GL11.GL_DEPTH_TEST);
				GL11.glEnable(GL11.GL_ALPHA_TEST);
				GL11.glColor4f(1F, 1F, 1F, 1F);
			}

			//DEBUG vehicles
			if(mc.thePlayer.ridingEntity instanceof EntitySeat)
			{
				EntityDriveable ent = ((EntitySeat)mc.thePlayer.ridingEntity).driveable;
				float speed = (float) (ent.motionX * ent.motionX + ent.motionY * ent.motionY + ent.motionZ * ent.motionZ);
				int healthP = (int)((float)ent.getDriveableData().parts.get(EnumDriveablePart.core).health / (float)ent.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth * 100);
				int colour = 0;
				if(healthP > 75) colour = 0xffffff;
				else if (healthP < 75 && healthP > 50) colour = 0x00ff00;
				else if (healthP < 50 && healthP > 25) colour = 0xdaa520;
				else colour = 0xff0000;
				mc.fontRenderer.drawString(String.format("Throttle : %.0f%%", ent.throttle*100), 2, 2, 0xffffff);
				//mc.fontRenderer.drawString("Throttle : " + ent.throttle, 2, 2, 0xffffff);
				//mc.fontRenderer.drawString("Health : " + ent.getDriveableData().parts.get(EnumDriveablePart.core).health+ " / " +ent.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth, 2, 12, 0xffffff);
				mc.fontRenderer.drawString("Health : " + healthP + "%" , 2, 12, colour);
				mc.fontRenderer.drawString(String.format("Speed : %.2f", Math.sqrt(speed)), 2, 22, 0xffffff);
				mc.fontRenderer.drawString(String.format("Yaw : %.0f%%", ((EntitySeat)mc.thePlayer.ridingEntity).looking.getYaw()), 92, 2, 0xffffff);
				mc.fontRenderer.drawString(String.format("Pitch : %.0f%%", ((EntitySeat)mc.thePlayer.ridingEntity).looking.getPitch()), 92, 12, 0xffffff);
				if(ent instanceof EntityPlane)
				{
					EntityDriveable entP = (EntityDriveable)ent;
					if(entP.getDriveableType().hasFlare)
					{
						if(entP.ticksFlareUsing <= 0 && entP.flareDelay <= 0)
							mc.fontRenderer.drawString("Flare : READY"  , 2, 32, 0x00ff00);
	
						if(entP.ticksFlareUsing > 0)
							mc.fontRenderer.drawString("Flare : Deploying"  , 2, 42, 0xff0000);
	
						if(entP.flareDelay > 0)
							mc.fontRenderer.drawString("Flare : Reloading"  , 2, 52, 0xdaa520);
					}
					Vector3f up2 = (Vector3f)entP.axes.getYAxis().normalise();
					mc.fontRenderer.drawString(String.format("Lift : %.0f%%", (float)entP.getSpeedXYZ()*(float)entP.getSpeedXYZ()*up2.y), 92, 22, 0xffffff);

				}
				if(ent instanceof EntityVehicle)
				{
					EntityDriveable entP = (EntityDriveable)ent;
					if(entP.getDriveableType().hasFlare)
					{
						if(entP.ticksFlareUsing <= 0 && entP.flareDelay <= 0)
							mc.fontRenderer.drawString("Smoke : READY"  , 2, 32, 0x00ff00);
	
						if(entP.ticksFlareUsing > 0)
							mc.fontRenderer.drawString("Smoke : Deploying"  , 2, 42, 0xff0000);
	
						if(entP.flareDelay > 0)
							mc.fontRenderer.drawString("Smoke : Reloading"  , 2, 52, 0xdaa520);
					}
					
					if(((EntityVehicle)ent).getVehicleType().shootWithOpenDoor)
					{
						if(((EntityVehicle)ent).varDoor){
							mc.fontRenderer.drawString("Weapon : READY"  , 2, 62, 0x00ff00);
							mc.fontRenderer.drawString("["+ Keyboard.getKeyName(KeyInputHandler.FlanVKeyBinding.V_DOOR.keyCode())+ " to disable]", 100, 62, 0x00ff00);
						}

						if(!((EntityVehicle)ent).varDoor){
							mc.fontRenderer.drawString("Weapon : DISABLED"  , 2, 62, 0xff0000);
							mc.fontRenderer.drawString("["+ Keyboard.getKeyName(KeyInputHandler.FlanVKeyBinding.V_DOOR.keyCode())+ " to activate]", 100, 62, 0xff0000);
						}
					}
				}

				if(FlansMod.DEBUG)
				{
					mc.fontRenderer.drawString("MotionX : " + ent.motionX, 2, 32, 0xffffff);
					mc.fontRenderer.drawString("MotionY : " + ent.motionY, 2, 42, 0xffffff);
					mc.fontRenderer.drawString("MotionZ : " + ent.motionZ, 2, 52, 0xffffff);
					mc.fontRenderer.drawString("Break Blocks : " + TeamsManager.driveablesBreakBlocks, 2, 62, 0xffffff);
				}
			}
	    }
	}

	@SubscribeEvent
	public void renderTick(TickEvent.RenderTickEvent event)
	{
		switch(event.phase)
		{
			case START:
				renderTickStart(Minecraft.getMinecraft(), event.renderTickTime);
				break;
			case END:
				renderTickEnd(Minecraft.getMinecraft());
			default:;
		}
	}

	@SubscribeEvent
	public void clientTick(TickEvent.ClientTickEvent event)
	{
		switch(event.phase)
		{
			case START :
				clientTickStart(Minecraft.getMinecraft());
				break;
			case END :
				clientTickEnd(Minecraft.getMinecraft());
			default:;
		}
	}

	public void renderTickStart(Minecraft mc, float smoothing)
	{
		// CAPTURE MOUSE INPUT!
		if(mc.currentScreen == null && FlansModClient.controlModeMouse)
		{
			MouseHelper mouse = mc.mouseHelper;
			Entity ridden = mc.thePlayer.ridingEntity;

			if(ridden instanceof EntityDriveable)
			{
				EntityDriveable entity = (EntityDriveable) ridden;
				entity.onMouseMoved(mouse.deltaX, mouse.deltaY);
			}
		}
		if(mc.thePlayer != null)
		{
			RenderFlan.smoothing = smoothing;
			ItemStack holdingStack = mc.thePlayer.getHeldItem();
			if(holdingStack != null && holdingStack.getItem() instanceof ItemGun)
			{
				RenderGun.gunTypeOfScopeToRender = ((ItemGun)(RenderGun.scopeToRenderGunStack = holdingStack).getItem()).type;
				RenderGun.renderTickStart();
			}
			FlansModClient.renderTick(smoothing);
		}

		if(mc.currentScreen instanceof GuiDriveableController)
		{
			guiDriveableController = mc.currentScreen;
			mc.currentScreen = null;
		}
		else guiDriveableController = null;
	}

	public void renderTickEnd(Minecraft mc)
	{
		if(mc.currentScreen==null && guiDriveableController!=null)
		{
			mc.currentScreen = guiDriveableController;
			guiDriveableController = null;
		}
		
		Tessellator tessellator = Tessellator.instance;
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();

		//FlashBan
		/** TODO
		if(FlansMod.isInFlash)
		{
			isInFlash = true;
			flashTime = FlansMod.flashTime;
			tickcountflash = 0;
			FlansMod.isInFlash = false;
			FlansMod.flashTime = 0;
		}
		if(isInFlash && tickcountflash < flashTime)
		{
			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			GL11.glEnable(3042 /* GL_BLEND /);
			GL11.glDisable(2929 /* GL_DEPTH_TEST /);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(1F, 1F, 1F, 1.0F);
			GL11.glDisable(3008 /* GL_ALPHA_TEST /);

			mc.renderEngine.bindTexture(new ResourceLocation("flansmod", "gui/flash.png"));

			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /* GL_DEPTH_TEST /);
			GL11.glEnable(3008 /* GL_ALPHA_TEST /);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			//System.out.println(mc.gameSettings.hideGUI);
			tickcountflash++;
		}
		else
		{
			isInFlash = false;
			flashTime = 0;
			tickcountflash = 0;
		}*/
		/*
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();

		String overlayTexture = null;
		if (FlansModClient.currentScope != null && FlansModClient.currentScope.hasZoomOverlay() && FMLClientHandler.instance().getClient().currentScreen == null && FlansModClient.zoomProgress > 0.8F)
		{
			overlayTexture = FlansModClient.currentScope.getZoomOverlay();
		}
		else if(mc.thePlayer != null)
		{
			ItemStack stack = mc.thePlayer.inventory.armorInventory[3];
			if(stack != null && stack.getItem() instanceof ItemTeamArmour)
			{
				overlayTexture = ((ItemTeamArmour)stack.getItem()).type.overlay;
			}
		}

		if(overlayTexture != null)
		{
			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			GL11.glEnable(3042);
			GL11.glDisable(2929);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(mc.ingameGUI.prevVignetteBrightness, mc.ingameGUI.prevVignetteBrightness, mc.ingameGUI.prevVignetteBrightness, 1.0F);
			GL11.glDisable(3008);

			mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(overlayTexture));

			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929);
			GL11.glEnable(3008);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
		*/
	}

	/** Handle flashlight block light override */
	public void clientTickStart(Minecraft mc)
	{
		if(tickcount > 0) --tickcount;
		if(tickcountWounded > 0) --tickcountWounded;
		//change config settings to change flash refresh rate
		if(FlansMod.ticker % FlansMod.flashRefreshRate == 0 && mc.theWorld != null)
		{	//Reset old light values
			for(Vector3i v : blockLightOverrides) mc.theWorld.updateLightByType(EnumSkyBlock.Block, v.x, v.y, v.z);
			blockLightOverrides.clear(); //Clear the list
			for(Object obj : mc.theWorld.playerEntities) //Find all flashlights
			{
				EntityPlayer player = (EntityPlayer)obj;
				ItemStack currentHeldItem = player.getCurrentEquippedItem();
				if(currentHeldItem != null && currentHeldItem.getItem() instanceof ItemGun && GunType.hasStates(currentHeldItem))
				{
					int[] states = GunType.getStates(currentHeldItem);
					float flashlightRange = GunType.getState(states, GunTag.LIGHT_RANGE);
					if(flashlightRange < 0F) continue;
					//if this player is player on playing, use values from FlansModClient
					MovingObjectPosition ray = player == mc.thePlayer ? ItemGun.rayTrace(player, flashlightRange, false) 
							: player.rayTrace(GunType.getTOF(states, GunTag.RUN_POSE_ON) ? 1F : flashlightRange, 1F);
					if(ray == null) continue; // if ray exists, then apply the light
					int x = ray.blockX;
					int y = ray.blockY;
					int z = ray.blockZ;
					int side = ray.sideHit;
					switch(side)
					{
						case 0: --y; break;
						case 1: ++y; break;
						case 2: --z; break;
						case 3: ++z; break;
						case 4: --x; break;
						case 5: ++x;
					}
					blockLightOverrides.add(new Vector3i(x, y, z));
					mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, 12);
					mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
					mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
					mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
					mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y, z);
					mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
					mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
				}
			}

			for(Object obj : mc.theWorld.loadedEntityList)
			{
				if(obj instanceof EntityBullet)
				{
					EntityBullet bullet = (EntityBullet)obj;
					//IDynamicLightSource iDynamicLightSource = new AddFlansLightSource((Entity)bullet,15);
					if(!bullet.isDead && bullet.type.hasLight)
					{
						/*int x = MathHelper.floor_double(bullet.posX);
						int y = MathHelper.floor_double(bullet.posY);
						int z = MathHelper.floor_double(bullet.posZ);
						blockLightOverrides.add(new Vector3i(x, y, z));
						mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, 15);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);*/
						//DynamicLights.addLightSource(iDynamicLightSource);
					}
					else if(bullet.isDead && bullet.type.hasLight) { /*DynamicLights.removeLightSource(iDynamicLightSource);*/ }
				}
				else if(obj instanceof EntityMecha)
				{
					EntityMecha mecha = (EntityMecha)obj;
					int x = MathHelper.floor_double(mecha.posX);
					int y = MathHelper.floor_double(mecha.posY);
					int z = MathHelper.floor_double(mecha.posZ);
					if(mecha.lightLevel() > 0)
					{
						blockLightOverrides.add(new Vector3i(x, y, z));
						mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, Math.max(mc.theWorld.getBlockLightValue(x, y, z), mecha.lightLevel()));
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y + 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
					}
					if(mecha.forceDark())
					{
						for(int i = -3, j, k, xd, yd, zd; i <= 3; ++i)
						{
							for(j = -3; j <= 3; ++j)
							{
								for(k = -3; k <= 3; ++k)
								{
									blockLightOverrides.add(new Vector3i(xd = i + x, yd = j + y, zd = k + z));
									mc.theWorld.setLightValue(EnumSkyBlock.Sky, xd, yd, zd, Math.abs(i) + Math.abs(j) + Math.abs(k));
								}
							}
						}
					}
				}
			}
		}
		
		if(FlansMod.ticker % vehicleLightOverrideRefreshRate == 0 && mc.theWorld != null)
		{
			//Check graphics setting and adjust refresh rate
			vehicleLightOverrideRefreshRate = mc.gameSettings.fancyGraphics ? 1 : 2;

			//Reset old light values
			for(Vector3i v : vehicleLightOverrides)
				mc.theWorld.updateLightByType(EnumSkyBlock.Block, v.x, v.y, v.z);
			//Clear the list
			vehicleLightOverrides.clear();
		}
	}

	public void clientTickEnd(Minecraft minecraft)
	{ /* Client side only */
		for(int i = 0; i < killMessages.size(); i++)
		{
			killMessages.get(i).timer--;
			if(killMessages.get(i).timer == 0)
			{
				killMessages.remove(i);
			}
		}
		RenderFlag.angle += 2F;
		FlansModClient.tick();
	}

	private void drawSlotInventory(FontRenderer fontRenderer, ItemStack itemstack, int i, int j)
	{
		if(itemstack == null || itemstack.getItem() == null)
			return;
		itemRenderer.renderItemIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
	}

	public static void addKillMessage(boolean headshot, InfoType infoType, String killer, String killed)
	{
		for(KillMessage killMessage : killMessages)
		{
			killMessage.line++;
			if(killMessage.line > 10)
				killMessage.timer = 0;
		}
		killMessages.add(new KillMessage(headshot, infoType, killer, killed));
	}

	private static RenderItem itemRenderer = new RenderItem();
	private static List<KillMessage> killMessages = new ArrayList<KillMessage>();

	private static class KillMessage
	{
		public KillMessage(boolean head, InfoType infoType, String killer, String killed)
		{
			headshot = head;
			killerName = killer;
			killedName = killed;
			weapon = infoType;
			line = 0;
			timer = 200;
		}

		public String killerName;
		public String killedName;
		public InfoType weapon;
		public int timer;
		public int line;
		public boolean headshot;
	}
}
