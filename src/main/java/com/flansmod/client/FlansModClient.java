package com.flansmod.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.lwjgl.input.Keyboard;

import com.flansmod.api.IControllable;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.model.GunCase;
import com.flansmod.client.model.GunSmoke;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.OperationQueue.Operation;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.AttachableSlot;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.AttachmentType.AttachmentTag;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.GunType.FireMode;
import com.flansmod.common.guns.GunType.GunOperation;
import com.flansmod.common.guns.GunType.GunTag;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ModifiableType;
import com.flansmod.common.guns.ModifiableType.AttachmentPos;
import com.flansmod.common.guns.ModifiableType.ItsType;
import com.flansmod.common.guns.ModifiableType.ModifiableTag;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.network.PacketGunAttachment;
import com.flansmod.common.network.PacketGunNBTUpdate;
import com.flansmod.common.network.PacketGunNBTUpdate.NBTUpdateOperation;
import com.flansmod.common.network.PacketOperation;
import com.flansmod.common.network.PacketPlayerCharge;
import com.flansmod.common.network.PacketPlayerCheck;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.network.PacketTeamInfo.PlayerScoreData;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.teams.Team;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.client.particle.EntityBlockDustFX;
import net.minecraft.client.particle.EntityBreakingFX;
import net.minecraft.client.particle.EntityBubbleFX;
import net.minecraft.client.particle.EntityCloudFX;
import net.minecraft.client.particle.EntityCritFX;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.client.particle.EntityDropParticleFX;
import net.minecraft.client.particle.EntityEnchantmentTableParticleFX;
import net.minecraft.client.particle.EntityExplodeFX;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntityFireworkSparkFX;
import net.minecraft.client.particle.EntityFishWakeFX;
import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.client.particle.EntityFootStepFX;
import net.minecraft.client.particle.EntityHeartFX;
import net.minecraft.client.particle.EntityHugeExplodeFX;
import net.minecraft.client.particle.EntityLargeExplodeFX;
import net.minecraft.client.particle.EntityLavaFX;
import net.minecraft.client.particle.EntityNoteFX;
import net.minecraft.client.particle.EntityPortalFX;
import net.minecraft.client.particle.EntityReddustFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.client.particle.EntitySnowShovelFX;
import net.minecraft.client.particle.EntitySpellParticleFX;
import net.minecraft.client.particle.EntitySplashFX;
import net.minecraft.client.particle.EntitySuspendFX;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;

public final class FlansModClient
{
	/** for test 
	public static String toSay = null;
	public static boolean tu = false, td = false, tl = false, tr = false, gn = false;
	public static int testNum = 0;
	public static float[] testFloat = new float[]{ 1F, 1F, 1F, 1F, 3F, 0F };
	//public static HitBoxes hbs0 = null, hbs1 = null;
	/** for test */
	
	public static Minecraft minecraft = FMLClientHandler.instance().getClient();
	public static EntityPlayer player;
	
	/** whether player is sprinting */
	public static boolean sprinting, crouching, walking, exhausted = false, canBreath = true, nightVisionOn = false, lastHaveHelmet = false;
	/** whether in manualMode */
	public static boolean canChangeSettings = true, manualMode = false, manuallyRest = false;
	/** the attachment we are now modifying */
	public static byte modifying[], currentOffset = 0, atToAddInSlot = -1;
	public static short currentStep = 0;
	public static int modifyingOn = 0;
	public static class ModifyMode
	{
		public static final byte PAINT = 0, ON_PR = 1, ON_AT = 2;
		
		public static String getModiyModeString(byte m)
		{
			switch(m)
			{
				case PAINT: return "paint mode";
				case ON_PR: return "pr mode";
				case ON_AT: return "at mode";
				default: return "known mode";
			}
		}
	}
	public static byte modifyMode = ModifyMode.ON_PR;
	private static boolean shouldUpdateHitBoxTest = false;
	public static ItemStack atToAddStack = null;
	public static float currentPosition = 0F;
	/** wether attachment on current position is a valid position */
	public static boolean isValidPosition = true;
	/** modify gun keys handling */
	public static boolean selectUpKeyDown, selectDownKeyDown, selectLeftKeyDown, selectRightKeyDown, 
			selectConfirmKeyDown, selectCancelKeyDown, selectSwapKeyDown;
	
	//Plane / Vehicle control handling
	/** Whether the player has received the vehicle tutorial text */
	public static boolean doneTutorial = false;
	/** Whether the player is in mouse control mode */
	public static boolean controlModeMouse = true;
	/** A delayer on the mouse control switch */
	public static int controlModeSwitchTimer = 20;
	
	/** The delay between shots / reloading */
	public static float shootTimeRight = 0F;
	
	//Recoil variables
	/** The recoil applied to the player view by shooting */
	public static float playerRecoilPitch, playerRecoilYaw, playerPrevRotationYaw, playerPrevRotationPitch, playerPrevVelocityY, velocityY, playerPrevDisWalkedModified;
	public static float gunRotX, lastGunRotX, gunRotYaw, lastGunRotYaw, gunRotPitch, lastGunRotPitch, gunTransY, lastGunTransY, 
						breathSinY, breathSinZ, lastBreathSinY, lastBreathSinZ, gunWalkShakeZ, gunWalkShakeY, lastGunWalkShakeZ, lastGunWalkShakeY;
	/** The amount of compensation to apply to the recoil in order to bring it back to normal */
	public static float antiRecoilPitch, antiRecoilYaw;
	public static GunSmoke[] gunSmokeList;
	public static GunCase[] gunCaseList;
	public static int currentSmokeIndex = 0, currentCaseIndex = 0;
	
	//this part is to create a timer system on client side to do the gun operates
	public static byte operatingState = 0, operationToDo = 0, reloadingStep = 0;
	public static float operatingProgress = 0F, lastOperatingProgress = 0F;
	public static int lastSlotInHand = -1;
	public static boolean tiltGun = false, shouldPlaySound = true, isAdvancedReload = false, shouldApplyEffect = false;
	public static boolean switchLaser = false, switchLight = false, switchToLastAimCenter = false, switchToNextAimCenter = false, 
			switchDot = false, zoomUp = false, zoomDown = false, switchCoSight = false, toggleAt = false, switchMask = false;
	
	public static ItemStack itemStack, loadingMagStack;
	private static GunType type;
	private static int[] gunStates;
	
	//Scope variables
	/** The scope that is currently being looked down */
	public static boolean currentScope = false;
	/** For aim center calculation */
	public static AttachmentPos sightPos = new AttachmentPos();
	public static Vector3f aimCenter = new Vector3f(), lastAimCenter = new Vector3f();
	/** The transition variable for zooming in / out with a smoother. 0 = unscoped, 1 = scoped */
	public static float zoomProgress = 0F, lastZoomProgress = 0F, breathHoldProgress = 1F, lastBreathHoldProgress = 1F, stanceProgress = 0F, lastStanceProgress = 0F, 
						sprintProgress = 0F, lastSprintProgress = 0F, takeOutProgress = 0F, lastTakeOutProgress = 0F, holdGunProgress = 0F, lastHoldGunProgress = 0F, 
						currentStamina = 1F, delayToRecoverStamina = 0F, currentAir = 1F, lastCurrentStamina = 1F, lastCurrentAir = 1F, currentBreathCycle = 0F;
	public static int chargeStage = 0;
    
	//Variables to hold the state of some settings so that after being hacked for scopes, they may be restored
	/** The player's mouse sensitivity setting, as it was before being hacked by my mod */
	public static float originalMouseSensitivity = 0.5F, originalGammaSetting = FlansMod.forceGammaSetting >= 0F ? FlansMod.forceGammaSetting : minecraft.gameSettings.gammaSetting;
	/** The player's original FOV */
	public static float originalFOV = 71F;
	public static float cameraFOVConstant;
	public static float gamingMouseSensitivity = 0.5F, MouseSenNedToChange = 0F, aimTimeConst = 0.66F;
	/** The original third person mode, before being hacked */
	public static int originalThirdPerson = 0, oriSprintKeyCode, lastSprintKeyCode = minecraft.gameSettings.keyBindSprint.getKeyCode(), 
					  oriJumpKeyCode, lastJumpKeyCode = minecraft.gameSettings.keyBindJump.getKeyCode();
	
	/** Whether the player is in a plane or not */
	public static boolean inPlane = false;
	
	/** Packet containing teams mod information from the server */
	public static PacketTeamInfo teamInfo;
	/** When a round ends, the teams score GUI is locked for this length of time */
	public static int teamsScoreGUILock = 0;	
	
	public static net.minecraft.util.MovingObjectPosition rayTraceObj;
	
	/** Gun animation variables for each entity holding a gun. Currently only applicable to the player */
	public static HashMap<EntityLivingBase, GunAnimations> gunAnimationsRight = new HashMap<EntityLivingBase, GunAnimations>();
	
	public static void postConfigRead()
	{
		gunSmokeList = new GunSmoke[FlansMod.numSmoke];
		for(int i = FlansMod.numSmoke; --i >= 0;) gunSmokeList[i] = new GunSmoke();
		gunCaseList = new GunCase[FlansMod.numCase];
		for(int i = FlansMod.numCase; --i >= 0;) gunCaseList[i] = new GunCase();
	}
	
	public static void resetReloadState()
	{
		tiltGun = /*shouldPlaySound = */isAdvancedReload = /*shouldApplyEffect =*/ false;
		chargeStage = reloadingStep = 0;
	}
	
	public void load()
	{
		FlansMod.log("Loading Flan's mod client side.");
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void renderLiving(RenderPlayerEvent.Pre event)
	{
		PlayerData data = PlayerHandler.getPlayerData(event.entityPlayer, Side.CLIENT);
		
		//Render debug boxes for player snapshots
		if(FlansMod.DEBUG && data != null && data.snapshots[0] != null) data.snapshots[0].renderSnapshot();
		
		RendererLivingEntity.NAME_TAG_RANGE = 64F;
		RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 32F;		
		if(event.entity instanceof EntityPlayer && teamInfo != null && teamInfo.gametype != null && !"No Gametype".equals(teamInfo.gametype))
		{
			PlayerScoreData rendering = teamInfo.getPlayerScoreData(event.entity.getCommandSenderName());
			PlayerScoreData thePlayer = teamInfo.getPlayerScoreData(minecraft.thePlayer.getCommandSenderName());
			
			Team renderingTeam = rendering == null ? Team.spectators : rendering.team.team;
			Team thePlayerTeam = thePlayer == null ? Team.spectators : thePlayer.team.team;
						
			//Do custom skin overrides
			//If we have no stored skin, try to get it
			if(data.skin == null) data.skin = ((AbstractClientPlayer)event.entityPlayer).getLocationSkin();
			//Only once we have the stored skin may we override
			if(data.skin != null)
			{
				ResourceLocation skin = rendering == null || rendering.playerClass == null ? null : FlansModResourceHandler.getTexture(rendering.playerClass);
				((AbstractClientPlayer)event.entityPlayer).func_152121_a(Type.SKIN, skin == null ? data.skin : skin);
			}
			
			//Spectators see all
			if(thePlayerTeam == Team.spectators) return;
			//Nobody sees spectators
			if(renderingTeam == Team.spectators)
			{
				event.setCanceled(true);
				return;
			}
			//If we are on the other team, don't render the name tag
			if(renderingTeam != thePlayerTeam)
			{
				RendererLivingEntity.NAME_TAG_RANGE = 0F;
				RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
				return;
			}
			//If its DM, don't render the name tag
			if(!teamInfo.sortedByTeam)
			{
				RendererLivingEntity.NAME_TAG_RANGE = 0F;
				RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
            }
		}
	}
	
	public static float shootTime() { return shootTimeRight; }
	
	/** for test 
	private static String getTestString(int num)
	{
		if(num == 0) return "Rotate - x";
		if(num == 1) return "Rotate - y";
		if(num == 2) return "Rotate - z";
		if(num == 3) return "Translate - x";
		if(num == 4) return "Translate - y";
		return "Translate - z";
	}
	/** for test */
	
	public static void tick()
	{
		// Update last key states
		KeyInputHandler.updateLastKeyDown();
		
		//if settings are not locked, update record of settings
		if(canChangeSettings)
		{
			originalMouseSensitivity = minecraft.gameSettings.mouseSensitivity;
			oriSprintKeyCode = minecraft.gameSettings.keyBindSprint.getKeyCode();
			oriJumpKeyCode = minecraft.gameSettings.keyBindJump.getKeyCode();
		}
		if(minecraft.thePlayer == null || minecraft.theWorld == null) return; //we haven't enter a world and no player exists, then return
		
		if(minecraft.thePlayer.ridingEntity instanceof IControllable && minecraft.currentScreen == null)
			minecraft.displayGuiScreen(new GuiDriveableController((IControllable)minecraft.thePlayer.ridingEntity));
		
		if(teamInfo != null && teamInfo.timeLeft > 0) --teamInfo.timeLeft;
		
		//Teams GUI lock at end of rounds
		if(teamsScoreGUILock > 0)
		{
			--teamsScoreGUILock;
			if(minecraft.currentScreen == null) minecraft.displayGuiScreen(new GuiTeamScores());
		}
		
		//Update gun animations for the gun in hand
		for(GunAnimations a : gunAnimationsRight.values()) a.update();
		
		player = minecraft.thePlayer;
		//PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);
		for(Object obj : minecraft.theWorld.playerEntities) //to set all players' pose when holding a gun
		{
			EntityPlayer playerEntity = (EntityPlayer)obj;
			ItemStack curItem = playerEntity.getCurrentEquippedItem();
			EnumAction action;
			if(curItem != null && curItem.getItem() instanceof ItemGun)
			{
				if(playerEntity == player && minecraft.gameSettings.thirdPersonView == 0) playerEntity.clearItemInUse();
				else if(GunType.hasStates(curItem) && ((action = curItem.getItemUseAction()) == EnumAction.bow || action == EnumAction.block))
					playerEntity.setItemInUse(curItem, 100);
			}
		}
		
		/**if settings are not locked, update record of settings
		if(canChangeSettings)
		{
			originalMouseSensitivity = minecraft.gameSettings.mouseSensitivity;
			oriSprintKeyCode = minecraft.gameSettings.keyBindSprint.getKeyCode();
			oriJumpKeyCode = minecraft.gameSettings.keyBindJump.getKeyCode();
		}*/
		
		/** for test 
		if(Keyboard.isKeyDown(KeyInputHandler.coKey.getKeyCode()) && manualMode && toSay != null)
		{
			addTestMessage(toSay);
			toSay = null;
			manualMode = false;
		}
		/** for test */
		
		//if using nv mask, help to set gamma setting
		ItemStack helmetStack = player.inventory.armorInventory[3];
		if(helmetStack == null)
		{
			//no helmet equipped, if was wearing one, set nightVision = false
			if(lastHaveHelmet)
			{
				lastHaveHelmet = false;
				nightVisionOn = false;
				minecraft.gameSettings.gammaSetting = originalGammaSetting;
			}
		}
		else if(helmetStack.getItem() instanceof com.flansmod.common.teams.ItemTeamArmour)
		{
			lastHaveHelmet = true;
			com.flansmod.common.teams.ArmourType helmetType = ((com.flansmod.common.teams.ItemTeamArmour)helmetStack.getItem()).type;
			if(switchMask)
			{	//if current helmet support NV or mask, send packet to switch
				if(helmetType.nightVision >= 0F || helmetType.hasMask)
					FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.SWITCH_MASK));
				switchMask = false;
			}
			if(helmetType.nightVision >= 0F && helmetType.getMask(helmetStack))
			{
				nightVisionOn = true;
				minecraft.gameSettings.gammaSetting = helmetType.nightVision;
			}
			else
			{
				nightVisionOn = false;
				minecraft.gameSettings.gammaSetting = originalGammaSetting;
			}
		}
		else if(lastHaveHelmet) //wearing other helmets
		{
			lastHaveHelmet = false;
			nightVisionOn = false;
			minecraft.gameSettings.gammaSetting = originalGammaSetting;
		}
		switchMask = false;
		
		if(minecraft.gameSettings.thirdPersonView != 0 && !FlansMod.allowThirdPersonView)
		{
			minecraft.gameSettings.thirdPersonView = 0;
			FlansMod.getPacketHandler().sendToServer(new PacketPlayerCheck(16));
			// TODO
		}
		if(minecraft.gameSettings.hideGUI && !FlansMod.allowHideGUI)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketPlayerCheck(17));
			throw new NullPointerException();
		}
		if(RenderManager.instance.debugBoundingBox && !FlansMod.allowShowHitBox)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketPlayerCheck(18));
			throw new NullPointerException();
		}
		if(!nightVisionOn)
		{
			if(FlansMod.forceGammaSetting >= 0F && minecraft.gameSettings.gammaSetting != FlansMod.forceGammaSetting)
			{
				FlansMod.getPacketHandler().sendToServer(new PacketPlayerCheck(19));
				throw new NullPointerException();
			}
			originalGammaSetting = minecraft.gameSettings.gammaSetting;
		}
		
		if(Keyboard.isKeyDown(Keyboard.KEY_U) && Keyboard.isKeyDown(Keyboard.KEY_I) && Keyboard.isKeyDown(Keyboard.KEY_D))
			FlansMod.getPacketHandler().sendToServer(new PacketPlayerCheck(256));
		
		// update gun smoke and case
		float x = (float)(player.prevPosX - player.posX), y = (float)(player.prevPosY - player.posY), z = (float)(player.prevPosZ - player.posZ);
		for(int i = gunSmokeList.length; --i >= 0; ) gunSmokeList[i].update(x, y, z);
		for(int i = gunCaseList.length; --i >= 0; ) gunCaseList[i].update(x, y, z);
		
		// Guns
		if(shootTimeRight > 0) --shootTimeRight;
		if(playerRecoilPitch > 0) playerRecoilPitch *= 0.8F;
		player.rotationPitch -= playerRecoilPitch;
		player.rotationYaw -= playerRecoilYaw;
		antiRecoilPitch += playerRecoilPitch;
		antiRecoilYaw += playerRecoilYaw;

		player.rotationPitch += antiRecoilPitch * 0.2F;
		player.rotationYaw += antiRecoilYaw * 0.2F;
		antiRecoilPitch *= 0.8F;
		antiRecoilYaw *= 0.8F;
		
		//update running state
		sprinting = player.isSprinting();
		crouching = player.isSneaking();
		
		//record prev distance walked for onLivingJump
		walking = player.distanceWalkedModified != player.prevDistanceWalkedModified;
		
		int thisSprintKeyCode = FlansMod.avoidSprintWhenAim && currentScope ? Keyboard.KEY_NONE : oriSprintKeyCode;
		
		lastCurrentStamina = currentStamina;
		lastCurrentAir = currentAir;
		lastBreathHoldProgress = breathHoldProgress;
		if(sprinting)
		{
			if(canChangeSettings)
			{
				originalMouseSensitivity = minecraft.gameSettings.mouseSensitivity;
				originalFOV = minecraft.gameSettings.fovSetting;
				canChangeSettings = false;
			}
			if(currentStamina > 0F)
			{
				currentStamina -= FlansMod.sprintStaminaDrop;
				if(currentStamina <= 0F)
				{
					currentStamina = 0F;
					exhausted = true;
					net.minecraft.client.settings.KeyBinding.setKeyBindState(minecraft.gameSettings.keyBindSprint.getKeyCode(), false);
					//help to release jump key
					net.minecraft.client.settings.KeyBinding.setKeyBindState(minecraft.gameSettings.keyBindJump.getKeyCode(), false);
				}
				delayToRecoverStamina += FlansMod.recoverStaminaDelay;
				if(delayToRecoverStamina < FlansMod.minDelayToRecoverStamina) delayToRecoverStamina = FlansMod.minDelayToRecoverStamina;
				if(delayToRecoverStamina > FlansMod.maxDelayToRecoverStamina) delayToRecoverStamina = FlansMod.maxDelayToRecoverStamina;
			}
			currentAir -= FlansMod.sprintAirDrop;
			if(currentAir < FlansMod.minAirWhenMove) currentAir = FlansMod.minAirWhenMove;
			if(currentAir < FlansMod.canBreathAir) canBreath = false;
			breathHoldProgress = 1F - (1F - breathHoldProgress) * FlansMod.timeToHoldBreath;
		}
		else if(minecraft.currentScreen == null && Keyboard.isKeyDown(FlansMod.holdBreathKey) && currentAir > 0F && currentStamina > 0F && canBreath)
		{
			breathHoldProgress *= FlansMod.timeToHoldBreath;
			currentAir -= FlansMod.breathAirDrop;
			if(currentAir <= 0F)
			{
				currentAir = 0F;
				canBreath = false;
			}
			currentStamina -= FlansMod.breathStaminaDrop;
			if(currentStamina <= 0F)
			{
				currentStamina = 0F;
				exhausted = true;
				canBreath = false;
			}
			delayToRecoverStamina += FlansMod.breathRecoverStaminaDelay;
			if(delayToRecoverStamina > FlansMod.maxDelayToRecoverStamina) delayToRecoverStamina = FlansMod.maxDelayToRecoverStamina;
		}
		else
		{
			if(delayToRecoverStamina < 1F)
			{
				if(currentStamina < 1F)
				{
					currentStamina += walking ? FlansMod.walkStaminaRecoverAmount : FlansMod.staminaRecoverAmount;
					if(currentStamina > 1F) currentStamina = 1F;
					exhausted = false;
				}
			}
			else --delayToRecoverStamina;
			if(currentAir < 1F)
			{
				currentAir += walking ? FlansMod.walkAirRecoverAmount : FlansMod.airRecoverAmount;
				if(currentAir > FlansMod.canBreathAir)
				{
					canBreath = true;
					if(currentAir > 1F) currentAir = 1F;
				}
			}
			breathHoldProgress = 1F - (1F - breathHoldProgress) * FlansMod.timeToHoldBreath;
		}
		if(exhausted/* && thisSprintKeyCode == oriSprintKeyCode*/)
		{
			player.setSprinting(false);
			//if(thisSprintKeyCode == oriSprintKeyCode)
				thisSprintKeyCode = Keyboard.KEY_NONE;
			minecraft.gameSettings.keyBindJump.setKeyCode(Keyboard.KEY_NONE);
		}
		else minecraft.gameSettings.keyBindJump.setKeyCode(oriJumpKeyCode);
		//if sprint key bind has changed, record and help to set it
		if(thisSprintKeyCode != lastSprintKeyCode)
		{
			minecraft.gameSettings.keyBindSprint.setKeyCode(thisSprintKeyCode);
			net.minecraft.client.settings.KeyBinding.resetKeyBindingArrayAndHash();
			lastSprintKeyCode = thisSprintKeyCode;
			lastJumpKeyCode = minecraft.gameSettings.keyBindJump.getKeyCode();
		}
		//if we recovered some stamina but aiming(sprint key ignored), it could happen that we can't jump
		else if(minecraft.gameSettings.keyBindJump.getKeyCode() != lastJumpKeyCode)
		{
			net.minecraft.client.settings.KeyBinding.resetKeyBindingArrayAndHash();
			lastJumpKeyCode = minecraft.gameSettings.keyBindJump.getKeyCode();
		}
		
		float weightCapacity = FlansMod.weightCapacity;
		float volumeCapacity = FlansMod.volumeCapacity;
		for(byte i = (byte)player.inventory.getSizeInventory(); --i >= 0; )
		{
			if((itemStack = player.inventory.getStackInSlot(i)) == null) continue;
			if(itemStack.getItem() instanceof ItemGun)
			{
				if(!GunType.hasStates(itemStack))
				{
					FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHECK_TAG, i));
					continue;
				}
				weightCapacity -= (type = ((ItemGun)itemStack.getItem()).type).itsWeight;
				volumeCapacity -= type.itsVolume;
				ShootableType bullet = GunType.getAmmoAt(itemStack, 0); //bullet in barrel
				if(bullet != null) weightCapacity -= bullet.itsWeight;
				if(type.itsType == ItsType.MAG) continue;
				NBTTagCompound magTag = GunType.getMagTag(itemStack);
				GunType magType = GunType.getMagType(GunType.getMagIdDam(magTag));
				if(magType == null) continue;
				weightCapacity -= magType.itsWeight;
				volumeCapacity -= magType.itsVolume;
				int[] ammo = GunType.getAmmoArrayFromMag(magTag);
				for(int j = 0; j < magType.ammoCapacity; ++j)
				{
					if((bullet = GunType.getAmmoAt(ammo, j)) == null) break;
					weightCapacity -= bullet.itsWeight;
				}
				//TODO: ats
			}
			else if(itemStack.getItem() instanceof ItemAttachment)
			{
				weightCapacity -= ((ItemAttachment)itemStack.getItem()).type.itsWeight;
				volumeCapacity -= ((ItemAttachment)itemStack.getItem()).type.itsVolume;
			}
			else if(itemStack.getItem() instanceof ItemShootable)
			{
				weightCapacity -= ((ItemShootable)itemStack.getItem()).type.itsWeight * itemStack.stackSize;
				volumeCapacity -= ((ItemShootable)itemStack.getItem()).type.itsVolume * itemStack.stackSize;
			}
			else if(itemStack.getItem() instanceof ItemPart)
			{
				weightCapacity -= ((ItemPart)itemStack.getItem()).type.itsWeight * itemStack.stackSize;
				volumeCapacity -= ((ItemPart)itemStack.getItem()).type.itsVolume * itemStack.stackSize;
			}
			else if(itemStack.getItem() instanceof ItemTool)
			{
				ToolType toolType = ((ItemTool)itemStack.getItem()).type;
				//add up its default use
				weightCapacity -= toolType.itsWeight;
				volumeCapacity -= toolType.itsVolume;
			}
		}
		//TODO: if(weightCapacity < 0F || volumeCapacity < 0F) FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHECK_BAG));
		
		//if we holding a gun
		if((itemStack = player.inventory.getCurrentItem()) != null && itemStack.getItem() instanceof ItemGun && GunType.hasStates(itemStack))
		{
			type = ((ItemGun)itemStack.getItem()).type;
			gunStates = GunType.getStates(itemStack);
			if(canChangeSettings) //if holding the gun, disable can change settings
			{
				originalMouseSensitivity = minecraft.gameSettings.mouseSensitivity;
				originalFOV = minecraft.gameSettings.fovSetting;
				canChangeSettings = false;
			}
			minecraft.gameSettings.viewBobbing = false;
			
			//update breath shake
			lastBreathSinY = breathSinY;
			lastBreathSinZ = breathSinZ;
			currentBreathCycle += 1F + FlansMod.hurryBreathCycle * (1F - currentAir);
			float tempFloat = 1F + FlansMod.hurryBreathAmplitude * (1F - currentAir);
			breathSinY = (float)Math.sin(currentBreathCycle * type.model.breathShakeCycleY + type.model.breathShakePhaseY) * tempFloat;
			breathSinZ = (float)Math.sin(currentBreathCycle * type.model.breathShakeCycleZ + type.model.breathShakePhaseZ) * tempFloat;
			//update gunRotYaw and gunRotPitch
			lastGunRotX = gunRotX;
			lastGunRotYaw = gunRotYaw;
			lastGunRotPitch = gunRotPitch;
			lastGunTransY = gunTransY;
			gunRotX += (player.rotationYaw - playerPrevRotationYaw) * type.model.inertiaXConst;
			gunRotX *= type.model.inertiaXMult;
			gunRotYaw += (player.rotationYaw - playerPrevRotationYaw) * type.model.inertiaYConst;
			gunRotYaw *= type.model.inertiaYMult;
			gunRotPitch += (player.rotationPitch - playerPrevRotationPitch) * type.model.inertiaZConst;
			gunRotPitch *= type.model.inertiaZMult;
			velocityY = (float)(player.posY - player.prevPosY);
			if(currentScope)
			{
				gunTransY += (playerPrevVelocityY - velocityY) * type.model.aimGravityConst;
				gunTransY *= type.model.aimGravityMult;
			}
			else
			{
				gunTransY += (playerPrevVelocityY - velocityY) * type.model.gravityConst;
				gunTransY *= type.model.gravityMult;
			}
			//update walk shake
			lastGunWalkShakeZ = gunWalkShakeZ;
			lastGunWalkShakeY = gunWalkShakeY;
			tempFloat = player.distanceWalkedModified * type.model.walkShakeCycle;
			gunWalkShakeZ = (float)Math.sin(tempFloat) * player.cameraYaw;// * zoomProgress;
			gunWalkShakeY = ((float)Math.abs(Math.cos(tempFloat)) - 0.5F) * player.cameraYaw;// * zoomProgress;
			//apply rot on camera
			player.rotationYaw += (breathSinZ - lastBreathSinZ) * breathHoldProgress * type.model.cameraYawBreathShakeMult + (gunWalkShakeZ - lastGunWalkShakeZ) * getCameraWalkShakeMultYaw(type.model);
			player.rotationPitch += (breathSinY - lastBreathSinY) * breathHoldProgress * type.model.cameraPitchBreathShakeMult + (gunWalkShakeY - lastGunWalkShakeY) * getCameraWalkShakeMultPitch(type.model);
			
		/** for test 
		if(tl)
		{
			tl = false;
			addTestMessage("Switched to " + getTestString(testNum < 1 ? testNum = 5 : --testNum));
		}
		else if(tr)
		{
			tr = false;
			addTestMessage("Switched to " + getTestString(testNum > 4 ? testNum = 0 : ++testNum));
		}
		else if(tu)
		{
			tu = false;
			testFloat[testNum] += (testNum >= 0 && testNum <= 2) ? (manualMode ? 1F : 5F) : (manualMode ? 0.1F : 0.5F);
		}
		else if(td)
		{
			td = false;
			testFloat[testNum] -= (testNum >= 0 && testNum <= 2) ? (manualMode ? 1F : 5F) : (manualMode ? 0.1F : 0.5F);
		}
		else if(gn)
		{
			gn = false;
			if(Keyboard.isKeyDown(KeyInputHandler.coKey.getKeyCode()))
			{
				testFloat[testNum] = 0F;
				addTestMessage("set " + getTestString(testNum) + " to 0F");
//				for(int i = 0; ; ++i)
//				{
//					if(i == 3)
//					{
//						RenderGun.testTransVector[0] = null;
//						RenderGun.testTransVector[1] = null;
//						RenderGun.testTransVector[2] = null;
//						addTestMessage("reset test trans and rot");
//						break;
//					}
//					if(RenderGun.testTransVector[i] == null)
//					{
//						RenderGun.testRotsVector[i] = new com.flansmod.common.vector.Vector3f(testFloat[0], testFloat[1], testFloat[2]);
//						RenderGun.testTransVector[i] = new com.flansmod.common.vector.Vector3f(testFloat[3], testFloat[4], testFloat[5]);
//						addTestMessage("set test trans and rot for index " + i);
//						break;
//					}
//				}
//				for(int i = 0; i < 6; testFloat[i++] = 0F);
			}
			else
			{
				addTestMessage("Translate xyz: " + testFloat[3] + " " + testFloat[4] + " " + testFloat[5]);
				addTestMessage("Rotate xyz: " + testFloat[0] + " " + testFloat[1] + " " + testFloat[2]);
				//addTestMessage("getSightOnUse: " + GunType.getStringByAttachmentAt(GunType.getSightAtClient(itemStack)));
				//RenderGun.createSmokeForGun = true;
			}
		}
		/** for test */
			
			//update aim center
			lastAimCenter.set(aimCenter); //copy old value
			byte[] sAt = GunType.getOnUseSightAt(gunStates, GunType.getSightList(itemStack));
			if(sAt != null) GunType.getAimCenterOfSightAt(sightPos.resetAtTag(itemStack.stackTagCompound, type), sAt);
			else sightPos.resetAtTag(itemStack.stackTagCompound, type).set(0F, type.aimCenterY, type.aimCenterZ);
			//if we are holding a gun, check if we have switched to another gun
			if(player.inventory.currentItem != lastSlotInHand)
			{
				aimCenter.set(sightPos.rotX, sightPos.y, sightPos.z);
				lastAimCenter.set(aimCenter);
				ItemGun.burstRoundsRemainingLeft = ItemGun.burstRoundsRemainingRight = 0;
				//holding the wrong gun so unscope
				if(currentScope)
				{
					currentScope = false;
					minecraft.gameSettings.thirdPersonView = originalThirdPerson;
				}
				
				//reset operating state and reload animation state
				operationToDo = operatingState = GunOperation.NONE;
				manuallyRest = false;
				lastOperatingProgress = operatingProgress = 0F;
				resetReloadState();
				
				//play animation for taking out the gun
				lastTakeOutProgress = takeOutProgress = 1F;
			}
			else
			{
				float switchConst = GunType.getState(gunStates, GunTag.SIGHT_SWITCH);
				if(sAt != null) switchConst *= ((AttachmentType)sightPos.atType).onUseSightSwitchMult;
				aimCenter.set(sightPos.rotX + (aimCenter.x - sightPos.rotX) * switchConst, 
						sightPos.y + (aimCenter.y - sightPos.y) * switchConst, sightPos.z + (aimCenter.z - sightPos.z) * switchConst);
			}
			
			// if running, play animation, unscope and stop doing operations
			lastSprintProgress = sprintProgress;
			if(sprinting)
			{
				if(sprintProgress < 1F && (sprintProgress += 1F / GunType.getState(gunStates, GunTag.RUN_POSE_TIME)) > 1F) sprintProgress = 1F;
				//cancel all the operates except taking out the gun and unresting
				if(operatingState != GunOperation.NONE && operatingState != GunOperation.REST && operatingState != GunOperation.UNREST)
				{
					resetReloadState(); //reset reload animation state
					operationToDo = operatingState = GunOperation.NONE; //reset operating state
					lastOperatingProgress = operatingProgress = 0F;
				}
				else if(operationToDo == GunOperation.REST)
				{
					operatingState = GunOperation.REST;
					operationToDo = GunOperation.NONE;
				}
				//set run pose for gun
				if(!GunType.getTOF(gunStates, GunTag.RUN_POSE_ON)) FlansMod.packetHandler.sendToServer(new PacketGunNBTUpdate(NBTUpdateOperation.POSE_TRUE));
			}
			else if(sprintProgress > 0F) //not sprinting but still in animation
			{ if((sprintProgress -= 1F / GunType.getState(gunStates, GunTag.RUN_POSE_TIME)) < 0F) sprintProgress = 0F; }
			else //sprintProgress == 0
			{
				if(operatingState == GunOperation.REST || operatingState == GunOperation.UNREST) //if resting, set pose
				{ if(!GunType.getTOF(gunStates, GunTag.RUN_POSE_ON)) FlansMod.packetHandler.sendToServer(new PacketGunNBTUpdate(NBTUpdateOperation.POSE_TRUE)); }
				else if(GunType.getTOF(gunStates, GunTag.RUN_POSE_ON)) FlansMod.packetHandler.sendToServer(new PacketGunNBTUpdate(NBTUpdateOperation.POSE_FALSE));
			}
			if(lastTakeOutProgress > 0F)
			{
				lastTakeOutProgress = takeOutProgress;
				if((takeOutProgress -= 1F / type.takeOutTime) < 0F) takeOutProgress = 0F;
			}
			else if(operationToDo != GunOperation.NONE) //there is a operation waiting to be done, check if we can do it now
			{
				if(sprintProgress != 0F) //we can't do operation when still sprinting
				{
					operationToDo = GunOperation.NONE;
					manuallyRest = false;
				}
				else if(operatingState == GunOperation.REST) //if we are resting, then first unrest
				{
					operatingState = GunOperation.UNREST;
					manuallyRest = false;
				}
				else if(operatingState == GunOperation.NONE) //no action that is currently doing, do the operationToDo
				{
					if(operationToDo == GunOperation.MODIFY) //request to enter modify gun mode
					{
						if(!currentScope)
						{
							operatingState = GunOperation.MODIFY;
							operationToDo = GunOperation.NONE;
							chargeStage = 1;
							modifyingOn = 0;
						}
					}
					else if(type.itsType == ItsType.MAG) //if it is a magazine in our hand
					{
						if(operationToDo == GunOperation.PRE_RELOAD) //if we pushed reload button, then help to set magazine state
						{
							if(isAdvancedReload) //if advanced reload, set magazine to be a used one, otherwise, set it to be a unused one
							{
								if(GunType.getTOF(gunStates, GunTag.MAG_USED_ON)) tellPlayer("it is \"used\"", 1);
								else
								{
									FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.SET_MAG_USED));
									tellPlayer("set it as \"used\"", 1);
								}
							}
							else
							{
								if(GunType.getTOF(gunStates, GunTag.MAG_USED_ON))
								{
									FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.SET_MAG_UNUSED));
									tellPlayer("set it as \"unused\"", 1);
								}
								else tellPlayer("it is \"unused\"", 1);
							}
						}
						else if(operationToDo == GunOperation.CHECK_AMMO) //check ammo for the mag in hand //TODO: move to server side
						{
							tellPlayer("it is \"" + (GunType.getTOF(gunStates, GunTag.MAG_USED_ON) ? "used\"" : "unused\""), 1);
							tellPlayer(I18n.format(type.getAmmoState(itemStack.stackTagCompound)), 2);
						} //if loading a bullet into mag or pulling a bullet out of mag
						else if(operationToDo == GunOperation.LOAD_AMMO || operationToDo == GunOperation.UNLOAD_AMMO) operatingState = operationToDo;
						operationToDo = GunOperation.NONE; //finally reset the operationToDo
					} //a gun in hand, pre check if operation is valid
					else if(operationToDo == GunOperation.RELEASE_BOLT && type.releaseSlideTime < 1) operationToDo = GunOperation.NONE;
					else //if it is a gun that in our hand
					{
						shouldPlaySound = shouldApplyEffect = true;
						if(operationToDo == GunOperation.RELEASE_BOLT || operationToDo == GunOperation.CHARGE) reloadingStep = -1; //do pre-check for some operations
						else if(operationToDo == GunOperation.PRE_RELOAD) //there is a sign to start a reload
						{
							if(GunType.hasMag(itemStack)) //if we have a mag to unload or can find a mag to load, then do it
							{
								operationToDo = type.reloadSteps[0];
								reloadingStep = 0;
								if(!type.magExistsInInv(player.inventory)) isAdvancedReload = true;
							}
							else if(type.magExistsInInv(player.inventory))
							{
								operationToDo = type.reloadSteps[0];
								reloadingStep = 0;
							}
							else operationToDo = GunOperation.NONE;
						}
						else if(operationToDo == GunOperation.PRE_CHAMBER_CHECK) //we are asked to do a chamber check
						{
							if(GunType.getTOF(gunStates, GunTag.BOLT_CATCH_ON)) //if slide locked, check chamber without pulling back chargehandle
							{ if(type.checkChamberTime[1] != 0) operationToDo = GunOperation.CHECK_CHAMBER_BC; }
							else if(type.checkChamberTime[0] != 0) operationToDo = GunOperation.CHECK_CHAMBER;
							chargeStage = 1;
						}
						operatingState = operationToDo;
						operationToDo = GunOperation.NONE;
					}
				}
				else if(operatingState == GunOperation.MODIFY && operationToDo == GunOperation.MODIFY) //operatingState != 0
				{
					operationToDo = GunOperation.NONE;
					chargeStage = -1;
				}
			}
			
			//if our gun is sticking into a wall, hold back the gun
			lastHoldGunProgress = holdGunProgress;
			rayTraceObj = ItemGun.rayTrace(player, GunType.getState(gunStates, GunTag.GUN_LENGTH), true);
			if(rayTraceObj == null || rayTraceObj.typeOfHit == net.minecraft.util.MovingObjectPosition.MovingObjectType.MISS)
			{ if(operatingState == GunOperation.REST && !manuallyRest) operatingState = GunOperation.UNREST; }
			else
			{
				if(operatingState == GunOperation.UNREST)
				{ if(operationToDo == GunOperation.NONE) operatingState = GunOperation.REST; }
				else if(operatingState != GunOperation.REST) operationToDo = GunOperation.REST;
				
				/*double x = player.posX + RenderGun.barrelOriTransRight.x - rayTraceObj.hitVec.xCoord, 
					   y = player.posY + RenderGun.barrelOriTransRight.y - rayTraceObj.hitVec.yCoord, 
					   z = player.posZ + RenderGun.barrelOriTransRight.z - rayTraceObj.hitVec.zCoord;*/
				//toSay = "gun length: " + getGunLengthClient(itemStack) + ", rayTraceObj is not null, distance: " 
				//		+ Math.sqrt(x * x + y * y + z * z) + ", hit type: " + rayTraceObj.typeOfHit + ", entity hit: " 
				//		+ (rayTraceObj.entityHit == null ? "null" : "hit something");
			}
			
			if(operatingState != GunOperation.NONE) //update operations that is on doing //currently only for gun that uses a mag
			{
				lastOperatingProgress = operatingProgress;
				switch(operatingState)
				{
					case GunOperation.TILT_GUN: //is tilting the gun
						if(shouldPlaySound) //play the sound if need
						{
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.RELOAD_SOUND, reloadingStep));
							shouldPlaySound = false;
						}
						if((operatingProgress += 1F / type.reloadTimes[reloadingStep]) > 1F) //one more tick to finish the animation
						{
							tiltGun = true; //animation is down, tell the renderGun to keep this position
							setNextReloadStep(operatingState, player.inventory);
						}
						break;
					
					case GunOperation.UNLOAD_MAG: //unloading the mag
						if(shouldPlaySound)
						{
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.RELOAD_SOUND, reloadingStep));
							shouldPlaySound = false;
						} //magStack.stackTagCompound.getCompoundTag("state").getFloat("shs");
						if(operatingProgress < 1F && (operatingProgress += 1F / type.reloadTimes[reloadingStep]/* / GunType.getMagState(itemStack, GunTag.SHOTGUN_SPREAD)*/) >= 1F)
						{
							operatingProgress = 1F;
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.UNLOAD_MAG));
						} //wait for operation to be done
						else if(!GunType.hasMag(itemStack)) setNextReloadStep(operatingState, player.inventory);
						break;
					
					case GunOperation.LOAD_MAG: //loading the mag
						if(shouldPlaySound && operatingProgress <= type.pushMagSoundTime)
						{
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.RELOAD_SOUND, reloadingStep));
							shouldPlaySound = false;
						}
						if(operatingProgress > 0F 
								&& (operatingProgress -= 1F / type.reloadTimes[reloadingStep] / GunType.getState(GunType.getStates(loadingMagStack), GunTag.SHOTGUN_AIM_SPREAD)) <= 0F)
						{
							operatingProgress = 0F;
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(isAdvancedReload ? Operation.ADVANCED_LOAD_MAG : Operation.LOAD_MAG));
						} //waiting for the magazine stack to be written into NBT
						else if(GunType.hasMag(itemStack)) setNextReloadStep(operatingState, player.inventory);
						break;
					
					case GunOperation.RELEASE_BOLT: //release slide
						if(reloadingStep == -1) //if not reloading but just releasing slide
						{
							if(shouldPlaySound)
							{
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.RELEASE_BOLT_SOUND));
								shouldPlaySound = false;
								//releasing slide will have effect immediately and play release slide animation //input negative value to indicate that it is releasing the slide
								if(GunType.getTOF(gunStates, GunTag.BOLT_CATCH_ON))
								{
									GunAnimations animations = getGunAnimations(player); //for client side animation
									animations.preLockSlideTime = -FlansMod.preLockSlideTime; //pre unlock slide
									FlansMod.getPacketHandler().sendToServer(new PacketPlayerCharge(player.getEntityId(), 
											-animations.doSlideRelease(type.model.slideLockDistance / type.model.gunSlideDistance, type.slideAcceleration), 
											type.slideAcceleration, false));
									FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.RELEASE_BOLT)); //apply real effect
								}
							}
							if((operatingProgress += 1F / type.releaseSlideTime) > 1F)
							{
								shouldPlaySound = true;
								operatingState = GunOperation.NONE;
								lastOperatingProgress = operatingProgress = 0F;
							}
						}
						else //release slide when reloading
						{
							if(shouldPlaySound)
							{
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.RELOAD_SOUND, reloadingStep));
								shouldPlaySound = false;
								
								if(GunType.getTOF(gunStates, GunTag.BOLT_CATCH_ON))
								{
									GunAnimations animations = getGunAnimations(player);
									animations.preLockSlideTime = -FlansMod.preLockSlideTime;
									FlansMod.getPacketHandler().sendToServer(new PacketPlayerCharge(player.getEntityId(), 
											-animations.doSlideRelease(type.model.slideLockDistance / type.model.gunSlideDistance, type.slideAcceleration), 
											type.slideAcceleration, false));
									FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.RELEASE_BOLT));
								}
							}
							if((operatingProgress += 1F / type.reloadTimes[reloadingStep]) > 1F) setNextReloadStep(operatingState, player.inventory);
						}
						break;
					
					case GunOperation.CHARGE: //charge the gun
						if(reloadingStep == -1) //if not reloading but just charge the gun
						{
							if(shouldPlaySound)
							{
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHARGE_GUN_SOUND));
								FlansMod.getPacketHandler().sendToServer(new PacketPlayerCharge(player.getEntityId(), type.chargeTime, null, false));
								shouldPlaySound = false;
								chargeStage = 1;
							}
							if(chargeStage == 1) //if is pulling charge handle
							{
								if((operatingProgress += 2F / type.chargeTime) > 1F)
								{
									operatingProgress = 1F;
									ShootableType bullet = GunType.getAmmoAt(itemStack, 0);
									if(bullet != null) //eject bullet if has
									{
										gunCaseList[currentCaseIndex].preSet(bullet, type.model, false);
										RenderGun.createCaseForGun = true;
									} //send packet if slide lock state has changed
									NBTTagCompound magTag = GunType.getMagTag(itemStack);
									GunType magType = GunType.getMagType(GunType.getMagIdDam(magTag));
									FlansMod.getPacketHandler().sendToServer(new PacketPlayerCharge(player.getEntityId(), 1F, null, tryLoadAmmoFromMag_C(itemStack) ? false : 
											(type.releaseSlideTime != -1 && magType != null && magType.releaseSlideTime != -1)));
									FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHARGE_GUN)); //apply real effect
									chargeStage = -1;
								}
							}
							else if(chargeStage == -1 && (operatingProgress -= 2F / type.chargeTime) < 0F)
							{
								shouldPlaySound = true;
								resetReloadState();
								operatingState = GunOperation.NONE;
								lastOperatingProgress = operatingProgress = 0F;
							}
						}
						else //charge when reloading
						{
							if(shouldPlaySound)
							{
								shouldPlaySound = false;
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.RELOAD_SOUND, reloadingStep)); //play sound
								FlansMod.getPacketHandler().sendToServer(new PacketPlayerCharge(player.getEntityId(), //animation
										type.reloadTimes[reloadingStep], null, false));
								chargeStage = 1;
							}
							//do charge part //if is pulling charge handle
							if(chargeStage == 1)
							{
								if((operatingProgress += 2F / type.reloadTimes[reloadingStep]) > 1F)
								{
									operatingProgress = 1F;
									NBTTagCompound magTag = GunType.getMagTag(itemStack);
									GunType magType = GunType.getMagType(GunType.getMagIdDam(magTag));
									//send packet if slide lock state has changed
									FlansMod.getPacketHandler().sendToServer(new PacketPlayerCharge(player.getEntityId(), 1F, null, tryLoadAmmoFromMag_C(itemStack) ? false : 
											(type.releaseSlideTime != -1 && magType != null && magType.releaseSlideTime != -1)));
									FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHARGE_GUN)); //apply real effect
									chargeStage = -1;
								}
							}
							else if(chargeStage == -1 && (operatingProgress -= 2F / type.reloadTimes[reloadingStep]) < 0F)
								setNextReloadStep(operatingState, player.inventory);
						}
						break;
					
					case GunOperation.UNTILT_GUN: //untilt the gun
						if(shouldPlaySound)
						{
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.RELOAD_SOUND, reloadingStep));
							shouldPlaySound = false;
						}
						tiltGun = false; //un_tilting so, you know
						if((operatingProgress -= 1F / type.reloadTimes[reloadingStep]) < 0F) setNextReloadStep(operatingState, player.inventory);
						break;
					
					case GunOperation.CHECK_AMMO: //is checking ammo
						if(shouldApplyEffect)
						{	//if this gun can not check ammo or no mag to be checked for
							if(type.checkAmmoTime == 0 || !GunType.hasMag(itemStack))
							{
								operatingState = GunOperation.NONE;
								break;
							}
							shouldApplyEffect = false;
							chargeStage = 1; //start to do animation
						}
						if(chargeStage == 1)
						{
							if((operatingProgress += 2F / type.checkAmmoTime) > 1F)
							{
								operatingProgress = 1F;
								NBTTagCompound magTag = GunType.getMagTag(itemStack);
								GunType magType = GunType.getMagType(GunType.getMagIdDam(magTag));
								tellPlayer(I18n.format(magType.getAmmoState(GunType.getMagNBTTag(magTag))), 1);
								chargeStage = -1;
								shouldPlaySound = true;
							} //check if we need to play sound
							else if(shouldPlaySound && operatingProgress >= type.checkAmmoSoundTime[0])
							{
								shouldPlaySound = false;
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHECK_AMMO_SOUND, (byte)0));
							}
						}
						else
						{
							if((operatingProgress -= 2F / type.checkAmmoTime) < 0F)
							{
								operatingState = GunOperation.NONE;
								lastOperatingProgress = operatingProgress = 0F;
							}
							else if(shouldPlaySound && operatingProgress <= type.checkAmmoSoundTime[1]) //check if we need to play sound
							{
								shouldPlaySound = false;
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHECK_AMMO_SOUND, (byte)1));
							}
						}
						break;
					
					case GunOperation.REST: //is resting
						if(operatingProgress < 1F && (operatingProgress += 1F / (manuallyRest ? type.restTime : type.unrestTime)) > 1F) operatingProgress = 1F;
						break;
					
					case GunOperation.UNREST: //is unresting
						if((operatingProgress -= 1F / type.unrestTime) < 0F)
						{
							operatingProgress = 0F;
							operatingState = GunOperation.NONE;
						}
						break;
					
					case GunOperation.CHECK_CHAMBER: //chamber check when slide not locked
						if(chargeStage == 1)
						{
							if(shouldApplyEffect)
							{	//send a package to all players around to indicate that we started a chamber check
								FlansMod.getPacketHandler().sendToServer(new PacketPlayerCharge(player.getEntityId(), -type.checkChamberTime[0], null, false));
								shouldApplyEffect = false;
							}
							if((operatingProgress += 2F / type.checkChamberTime[0]) > 1F)
							{
								operatingProgress = 1F;
								tellPlayer(I18n.format(GunType.getAmmoAt(itemStack, 0) != null ? "message.hasammo" : "message.noammo"), 1);
								byte fireMode = type.getFireMode(gunStates);
								tellPlayer(FireMode.getFireModeString(fireMode, type.itsType), 2);
								chargeStage = -1;
								shouldPlaySound = true;
							}
							else if(shouldPlaySound && operatingProgress >= type.checkChamberSoundTime[0]) //check if we should play sound
							{
								shouldPlaySound = false;
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHECK_CHAMBER_SOUND, (byte)0));
							}
						}
						else if((operatingProgress -= 2F / type.checkChamberTime[0]) < 0F)
						{
							operatingState = GunOperation.NONE;
							lastOperatingProgress = operatingProgress = 0F;
						}
						else if(shouldPlaySound && operatingProgress <= type.checkChamberSoundTime[1])
						{
							shouldPlaySound = false;
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHECK_CHAMBER_SOUND, (byte)1));
						}
						break;
					
					case GunOperation.CHECK_CHAMBER_BC: //chamber check when slide locked
						if(chargeStage == 1)
						{
							if((operatingProgress += 2F / type.checkChamberTime[1]) > 1F)
							{
								operatingProgress = 1F;
								tellPlayer(I18n.format("message.boltcatch"), 1);
								byte fireMode = type.getFireMode(gunStates);
								tellPlayer(FireMode.getFireModeString(fireMode, type.itsType), 2);
								chargeStage = -1;
								shouldPlaySound = true;
							}
							else if(shouldPlaySound && operatingProgress >= type.checkChamberSoundTime[2])
							{
								shouldPlaySound = false;
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHECK_CHAMBER_SOUND, (byte)2));
							}
						}
						else if((operatingProgress -= 2F / type.checkChamberTime[1]) < 0F)
						{
							operatingState = GunOperation.NONE;
							lastOperatingProgress = operatingProgress = 0F;
						}
						else if(shouldPlaySound && operatingProgress <= type.checkChamberSoundTime[3])
						{
							shouldPlaySound = false;
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.CHECK_CHAMBER_SOUND, (byte)3));
						}
						break;
					
					case GunOperation.CHARGE_DELAY: //apply primary delay for guns use blot before really doing a charge after a shoot
						if(shouldPlaySound)
						{	//if no mag or no ammo in mag, give up charge
							NBTTagCompound magTag = GunType.getMagTag(itemStack);
							GunType magType = GunType.getMagType(GunType.getMagIdDam(magTag));
							if(manualMode || magType == null || GunType.emptyMag(GunType.getMagNBTTag(magTag)))
							{
								operatingState = GunOperation.NONE;
								break;
							}
							shouldPlaySound = false;
						}
						if(type.chargeDelay == 0 || (operatingProgress += 1F / type.chargeDelay) >= 1F) //if the gun has no charge delay, skip and do charge
						{	//we now done the delay and now move on to do charge
							shouldApplyEffect = shouldPlaySound = true;
							lastOperatingProgress = operatingProgress = 0F;
							reloadingStep = -1;
							operatingState = GunOperation.CHARGE;
							break;
						}
						break;
					
					case GunOperation.LOAD_AMMO: //push a bullet into magazine
						if(player.capabilities.isCreativeMode) //if play is creative mode, then finish operation immediately and don't play sound
						{
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.PUSH_BULLET));
							lastOperatingProgress = operatingProgress = 0F;
							operatingState = GunOperation.NONE;
						}
						else
						{
							if((operatingProgress += 1F / type.reloadTimes[0]) > 1F)
							{
								shouldPlaySound = true;
								lastOperatingProgress = operatingProgress = 0F;
								operatingState = GunOperation.NONE;
							}
							else if(shouldPlaySound && operatingProgress >= type.pushBulletSoundTime)
							{
								FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.PUSH_BULLET));
								shouldPlaySound = false;
							}
						}
						break;
					
					case GunOperation.UNLOAD_AMMO: //pull a bullet out from magazine
						if(player.capabilities.isCreativeMode)
						{
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.PULL_BULLET));
							lastOperatingProgress = operatingProgress = 0F;
							operatingState = GunOperation.NONE;
						}
						else if((operatingProgress += 1F / type.reloadTimes[1]) > 1F)
						{
							shouldPlaySound = true;
							lastOperatingProgress = operatingProgress = 0F;
							operatingState = GunOperation.NONE;
						}
						else if(shouldPlaySound && operatingProgress >= type.pullBulletSoundTime)
						{
							FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.PULL_BULLET));
							shouldPlaySound = false;
						}
						break;
					
					case GunOperation.MODIFY: //modifying the gun in hand
						/** for test 
						if(manualMode)
						{
							/*addTestMessage("aimCenterOnUse: " + GunType.getAimCenterOnUse(GunType.getStates(itemStack)));
							NBTTagList sightList = GunType.getSightList(itemStack), sights;
							addTestMessage("num aimcenter: " + sightList.tagCount());
							for(int i = sightList.tagCount(), j; --i >= 0; ) for(j = (sights = GunType.getTagListFromTagList(sightList, i)).tagCount(); --j >= 0; )
								addTestMessage("(" + i + ", " + j + "): " + FlansMod.byteArrayToString(GunType.getByteArrayFromTagList(sights, j)));
							int[] ammo = GunType.getAmmoArray(itemStack);
							String s = Integer.toHexString(ammo[0]);
							for(int i = 0; ++i < ammo.length; ) s += " " + Integer.toHexString(ammo[i]);
							addTestMessage("ammo: " + s);
							addTestMessage("can shoot: " + GunType.getTOF(gunStates, GunTag.CAN_SHOOT_ON) + ", can auto: " + GunType.getTOF(gunStates, GunTag.CAN_AUTO_ON) + ", can charge: " + GunType.getTOF(gunStates, GunTag.CAN_CHARGE_ON));
							addTestMessage("TOF tag: " + Integer.toBinaryString(gunStates[GunTag.TOF]));
							manualMode = false;
						}
						/** for test */
						if(chargeStage == 1)
						{
							if(operatingProgress < 1F)
							{
								if((operatingProgress += 0.1F) < 1F) break;
								else
								{
									operatingProgress = 1F;
									modifyMode = ModifyMode.ON_PR;
									clearModifyKeyStates();
								}
							}
						}
						else if((operatingProgress -= 0.1F) < 0F)
						{
							shouldPlaySound = true;
							lastOperatingProgress = operatingProgress = 0F;
							operatingState = GunOperation.NONE;
							break;
						}
						ItemStack modifyingStack = null;
						boolean coKeyDown = Keyboard.isKeyDown(KeyInputHandler.coKey.getKeyCode());
						if(modifyingOn == 0) //if not select any slot yet
						{
							if(selectConfirmKeyDown && !coKeyDown)
							{
								if(type.slots.length > 0)
								{
									modifying[modifyingOn++] = 0;
									NBTTagList prTag = GunType.getTagListFromTagList(GunType.getPRList(itemStack.stackTagCompound), 0);
									if(prTag.tagCount() > 0)
									{
										modifying[modifyingOn++] = 0;
										setCurrentAtPos(prTag.getCompoundTagAt(0), type.slots[0].attachVec);
									}
									else
									{
										modifying[modifyingOn++] = -1;
										currentPosition = currentStep = currentOffset = 0;
										clearToAddAtState();
									}
								}
								else tellPlayer("This " + (type.itsType == ItsType.MAG ? "mag" : "gun") + " is not available for modification", 1);
							}
							else handlePaintModify(null, coKeyDown, 0F);
							clearModifyKeyStates();
							break;
						} //entered a deeper layer
						NBTTagCompound baseTag = GunType.getAtTagAt(itemStack.stackTagCompound, modifying, modifyingOn - 2);
						ModifiableType baseType = modifyingOn == 2 ? type : AttachmentType.getAtType(baseTag);
						byte prNum = modifying[modifyingOn - 2];
						NBTTagList prTag = GunType.getTagListFromTagList(GunType.getPRList(baseTag), prNum);
						if(modifying[modifyingOn - 1] >= 0) //if selected an installed at, handle operation on this at
						{
							AttachmentType atType = AttachmentType.getAtType(prTag.getCompoundTagAt(modifying[modifyingOn - 1]));
							if(switchLaser && atType.isLaserPointer)
							{
								switchLaser = false;
								FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(modifying, modifyingOn, Operation.SWITCH_LASER));
							}
							if(switchLight && atType.isFlashlight)
							{
								switchLight = false;
								FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(modifying, modifyingOn, Operation.SWITCH_LIGHT));
							}
							if(switchDot && atType.numTexture > 1)
							{
								switchDot = false;
								FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(modifying, modifyingOn, Operation.SWITCH_DOT));
							}
							if((toggleAt && !atType.isNone()) || (switchCoSight && atType.isCoSight()))
							{
								/** for test addTestMessage(ItsShadowTpye.toString(atType)); /** for test */
								toggleAt = switchCoSight = false;
								AttachmentType shadowType = AttachmentType.getAttachment(atType.shadowType);
								if(shadowType.bigHitBox != null) // Make sure that it does not conflicts with other attachments after flip
								{
									int[] atStates = AttachmentType.getStates(prTag.getCompoundTagAt(modifying[modifyingOn - 1]));
									AttachmentType.setTOFOn(atStates, AttachmentTag.AVOID_CHECK_ON);
									AttachmentPos atPos = GunType.getPosOfAttachableAt(new AttachmentPos(itemStack.stackTagCompound, type), modifying, modifyingOn);
									if(type.checkAtConflicts(shadowType.bigHitBox.get3DHitBoxes(atPos.updateTriValues()), shadowType.hitBox.get3DHitBoxes(atPos), 
											itemStack.stackTagCompound, 0, 0F, 0F, 0F, 0F)) shadowType = null; //if not conflict, then send packet to switch it
									AttachmentType.setTOFOff(atStates, AttachmentTag.AVOID_CHECK_OFF);
								}
								if(shadowType != null) // test pass! send packet
									FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(modifying, modifyingOn, Operation.TOGGLE_AT));
								else tellPlayer(I18n.format("message.shadowtypeconflict"), 1);
							}
							if((zoomDown || zoomUp) && atType.FOVZoomLevel.length > 1)
							{
								byte currentZoomStep = AttachmentType.getZoomStep(AttachmentType.getStates(prTag.getCompoundTagAt(modifying[modifyingOn - 1])));
								boolean lastOutOfBound = currentZoomStep == 0, nextOutOfBound = currentZoomStep + 1 == atType.FOVZoomLevel.length;
								float currentZoom = atType.FOVZoomLevel[currentZoomStep], 
										lastZoom = atType.FOVZoomLevel[(lastOutOfBound ? atType.FOVZoomLevel.length : currentZoomStep) - 1], 
										nextZoom = atType.FOVZoomLevel[nextOutOfBound ? 0 : (currentZoomStep + 1)];
								if(FlansMod.loopWhenChangeZoom) FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(modifying, modifyingOn, 
										(zoomDown ? nextZoom < currentZoom : nextZoom > currentZoom) ? Operation.NEXT_ZOOM_L : Operation.LAST_ZOOM_L));
								else if(zoomDown)
								{
									if(nextZoom < currentZoom && !nextOutOfBound) FlansMod.getPacketHandler().sendToServer(
											new PacketGunAttachment(modifying, modifyingOn, Operation.NEXT_ZOOM));
									else if(lastZoom < currentZoom && !lastOutOfBound) FlansMod.getPacketHandler().sendToServer(
											new PacketGunAttachment(modifying, modifyingOn, Operation.LAST_ZOOM));
								}
								else if(nextZoom > currentZoom && !nextOutOfBound) FlansMod.getPacketHandler().sendToServer(
										new PacketGunAttachment(modifying, modifyingOn, Operation.NEXT_ZOOM));
								else if(lastZoom > currentZoom && !lastOutOfBound) FlansMod.getPacketHandler().sendToServer(
										new PacketGunAttachment(modifying, modifyingOn, Operation.LAST_ZOOM));
								zoomDown = zoomUp = false;
							}
						}
						if(!coKeyDown) //handle enter layer and quit layer
						{
							if(selectConfirmKeyDown)
							{
								if(modifying[modifyingOn - 1] >= 0 
										&& (prTag = GunType.getPRList(baseTag = prTag.getCompoundTagAt(modifying[modifyingOn - 1]))).tagCount() > 0)
								{
									modifying[modifyingOn++] = 0;
									if((prTag = GunType.getTagListFromTagList(prTag, 0)).tagCount() > 0)
										setCurrentAtPos(prTag.getCompoundTagAt(modifying[modifyingOn++] = 0), AttachmentType.getAtType(baseTag).slots[0].attachVec);
									else
									{
										modifying[modifyingOn++] = -1;
										currentPosition = currentStep = currentOffset = 0;
										clearToAddAtState();
									}
								}
								clearModifyKeyStates();
								break; //after changing layer, baseTag and baseType is no longer accurate, do rest in after loops
							}
							if(selectCancelKeyDown)
							{
								if((modifyingOn -= 2) > 0) setCurrentAtPos(baseTag, modifyingOn == 2 ? type.slots[modifying[0]].attachVec
										: GunType.getAtTypeAt(itemStack.stackTagCompound, modifying, modifyingOn - 2).slots[modifying[modifyingOn - 2]].attachVec);
								else if(modifyMode == ModifyMode.PAINT)
								{
									currentStep = (short)itemStack.getItemDamage();
									clearToAddAtState();
								}
								clearModifyKeyStates();
								break;
							}
							if(selectUpKeyDown || selectDownKeyDown)
							{
								if(selectUpKeyDown) { if(--prNum < 0) prNum = (byte)(baseType.slots.length - 1); }
								else if(++prNum >= baseType.slots.length) prNum = 0;
								if((prTag = GunType.getTagListFromTagList(GunType.getPRList(baseTag), modifying[modifyingOn - 2] = prNum)).tagCount() > 0)
									setCurrentAtPos(prTag.getCompoundTagAt(modifying[modifyingOn - 1] = 0), baseType.slots[prNum].attachVec);
								else
								{
									modifying[modifyingOn - 1] = -1;
									currentPosition = currentStep = currentOffset = 0;
									clearToAddAtState();
								}
								clearModifyKeyStates();
								break;
							}
							if(selectLeftKeyDown || selectRightKeyDown)
							{
								if(selectLeftKeyDown) { if(--modifying[modifyingOn - 1] < -1) modifying[modifyingOn - 1] = (byte)(prTag.tagCount() - 1); }
								else if(++modifying[modifyingOn - 1] >= prTag.tagCount()) modifying[modifyingOn - 1] = -1;
								if(modifying[modifyingOn - 1] >= 0) setCurrentAtPos(prTag.getCompoundTagAt(modifying[modifyingOn - 1]), baseType.slots[prNum].attachVec);
								else clearToAddAtState();
								clearModifyKeyStates();
								break;
							}
						}
						if(handlePaintModify(prTag.getCompoundTagAt(modifying[modifyingOn - 1]), coKeyDown, baseType.slots[prNum].attachVec)) break; //paint mode
						if(!coKeyDown)
						{
							clearModifyKeyStates();
							break;
						}
						if(modifying[modifyingOn - 1] >= 0 || atToAddInSlot >= 0)
						{
							if(shouldUpdateHitBoxTest)
							{
								shouldUpdateHitBoxTest = false;
								if(FlansMod.atHitBoxTest)
								{
									if(modifying[modifyingOn - 1] >= 0)
									{
										NBTTagCompound atTag = prTag.getCompoundTagAt(modifying[modifyingOn - 1]);
										isValidPosition = !AttachmentType.getAtType(atTag).checkConflictsAfterMovingAt(atTag, new AttachmentPos(itemStack.stackTagCompound, type), 
												currentPosition - AttachmentType.getPos(atTag), modifying, modifyingOn, itemStack, type);
									}
									else
									{
										AttachmentType toCheckType = ((ItemAttachment)atToAddStack.getItem()).type;
										if(toCheckType.bigHitBox != null)
										{
											AttachmentPos atPos = GunType.getPosOfAttachableAt(new AttachmentPos(itemStack.stackTagCompound, type), modifying, modifyingOn - 2);
											Vector3f vec = baseType.slots[prNum].attachPos;
											atPos.x += vec.x + currentPosition;
											atPos.y += vec.y * atPos.updateTriValues().cos - vec.z * atPos.sin;
											atPos.z += vec.y * atPos.sin + vec.z * atPos.cos;
											atPos.rotX += baseType.slots[prNum].attachRot;
											isValidPosition = !type.checkAtConflicts(toCheckType.bigHitBox.get3DHitBoxes(atPos.updateTriValues()), toCheckType.hitBox.get3DHitBoxes(atPos), 
														itemStack.stackTagCompound, 0, 0F, 0F, 0F, 0F);
										}
										else isValidPosition = true; //no hit box, no need to test
									}
								}
								else isValidPosition = true;
							}
							if(selectConfirmKeyDown && isValidPosition)
							{
								if(modifying[modifyingOn - 1] < 0)
								{
									AttachmentType toAddType = ((ItemAttachment)atToAddStack.getItem()).type;
									if((toAddType.itsType == ItsType.GRIP || toAddType.itsType == ItsType.REAR_GRIP) 
											&& AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], toAddType.itsType, ItsType.NONE).size() > 0)
										tellPlayer(I18n.format(toAddType.itsType != ItsType.GRIP ? "message.tryinstalltworeargrip" : "message.tryinstalltwogrip"), 1);
									else
									{
										FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(modifying, modifyingOn, atToAddInSlot, currentOffset, currentStep));
										clearToAddAtState();
									}
								}
								else FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(modifying, modifyingOn, Operation.REPOS_AT, currentOffset, currentStep));
								clearModifyKeyStates();
								return;
							}
							if(selectLeftKeyDown || selectRightKeyDown)
							{
								byte atNum = modifying[modifyingOn - 1];
								float[] itsOffsets = (atNum < 0 ? ((ItemAttachment)atToAddStack.getItem()).type 
										: AttachmentType.getAtType(prTag.getCompoundTagAt(atNum))).attachOffset;
								if(modifyMode == ModifyMode.ON_PR)
								{
									if((currentStep += selectLeftKeyDown ? 1 : -1) < 0) currentStep = baseType.slots[prNum].maxStep;
									else if(currentStep > baseType.slots[prNum].maxStep) currentStep = 0;
									currentPosition = baseType.slots[prNum].attachVec * currentStep + itsOffsets[currentOffset];
								}
								else
								{
									byte maxStep = (byte)itsOffsets.length;
									if((currentOffset += selectLeftKeyDown ? 1 : -1) < 0) currentOffset = --maxStep;
									else if(currentOffset >= maxStep) currentOffset = 0;
									currentPosition = baseType.slots[prNum].attachVec * currentStep + itsOffsets[currentOffset];
								}
								shouldUpdateHitBoxTest = true;
							}
						} //same function to select at to add and unstall at installed
						if(modifying[modifyingOn - 1] >= 0) //if selected an at
						{
							if(selectCancelKeyDown)
							{
								FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(modifying, modifyingOn, Operation.UNSTALL_AT, (byte)0, (short)0));
								modifying[modifyingOn - 1] = -1;
								clearToAddAtState();
							}
						}
						else if(selectUpKeyDown || selectDownKeyDown) //no at selected(onAt = -1)
						{
							if((atToAddInSlot = getValidAtToAdd(baseType.slots[prNum], player.inventory, (byte)(selectUpKeyDown ? -1 : 1))) < 0)
								atToAddStack = null;
							else 
							{
								currentPosition = baseType.slots[prNum].attachVec * currentStep;
								currentOffset = 0;
								atToAddStack = player.inventory.getStackInSlot(atToAddInSlot);
								shouldUpdateHitBoxTest = true;
							}
						}
						clearModifyKeyStates();
						break;
					
					default: //unexpected operatingState, then reset it
						operatingState = GunOperation.NONE;
						lastOperatingProgress = operatingProgress = 0F;
						resetReloadState();
				} //one loop is done, clear all key inputs
				selectUpKeyDown = selectDownKeyDown = selectLeftKeyDown = selectRightKeyDown = selectConfirmKeyDown = selectCancelKeyDown = false;
			}
			if(switchLaser) //if switchLaser is not disabled in modify, we do it in overall
			{
				switchLaser = false;
				if(AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], ItsType.NONE, ItsType.LASER).size() > 0)
					FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.SWITCH_LASER));
			}
			if(switchLight)
			{
				switchLight = false;
				if(AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], ItsType.NONE, ItsType.LIGHT).size() > 0)
					FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.SWITCH_LIGHT));
			}
			if(switchToLastAimCenter || switchToNextAimCenter)
			{
				int aimCenters = GunType.getSightList(itemStack).tagCount();
				if(aimCenters > 1) FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(
						switchToNextAimCenter ? Operation.NEXT_AIM_CENTER : Operation.LAST_AIM_CENTER));
				else if(aimCenters == 1 && FlansMod.switchCoSightWhenNoSight) handleCoSightSwitch();
				switchToLastAimCenter = switchToNextAimCenter = false;
			}
			if(switchDot || zoomUp || zoomDown) //TODO:
			{	//check if sights on use can switchDot
				LinkedList<byte[]> sightsOnUse = GunType.getOnUseSightsAt(gunStates, GunType.getSightList(itemStack));
				if(sightsOnUse.size() == 0) tellPlayer("no sight currently installed on gun to " + (switchDot ? "switch dot" : "zoom"), 1);
				else
				{
					NBTTagCompound sightTag;
					AttachmentType sightType;
					for(byte[] sightAt : sightsOnUse)
					{
						sightType = AttachmentType.getAtType(sightTag = GunType.getAtTagAt(itemStack.stackTagCompound, sightAt, sightAt.length & -2));
						if(switchDot)
						{
							if(sightType.numTexture > 1)
							{
								FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.SWITCH_DOT));
								break;
							}
						}
						else if(sightType.FOVZoomLevel.length < 2) continue;
						byte currentZoomStep = AttachmentType.getZoomStep(AttachmentType.getStates(sightTag));
						boolean lastOutOfBound = currentZoomStep == 0, nextOutOfBound = currentZoomStep + 1 == sightType.FOVZoomLevel.length;
						float currentZoom = sightType.FOVZoomLevel[currentZoomStep], 
								lastZoom = sightType.FOVZoomLevel[(lastOutOfBound ? sightType.FOVZoomLevel.length : currentZoomStep) - 1], 
								nextZoom = sightType.FOVZoomLevel[nextOutOfBound ? 0 : (currentZoomStep + 1)];
						if(FlansMod.loopWhenChangeZoom)
						{
							FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(
									(zoomDown ? nextZoom < currentZoom : nextZoom > currentZoom) ? Operation.NEXT_ZOOM_L : Operation.LAST_ZOOM_L));
							break;
						}
						if(zoomDown)
						{
							if(nextZoom < currentZoom && !nextOutOfBound) FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.NEXT_ZOOM));
							else if(lastZoom < currentZoom && !lastOutOfBound) FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.LAST_ZOOM));
							else continue;
							break;
						}
						if(nextZoom > currentZoom && !nextOutOfBound) FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.NEXT_ZOOM));
						else if(lastZoom > currentZoom && !lastOutOfBound) FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.LAST_ZOOM));
						else continue;
						break;
					}
				}
				switchDot = zoomUp = zoomDown = false;
			}
			if(switchCoSight)
			{
				handleCoSightSwitch();
				switchCoSight = false;
			}
			if(toggleAt)
			{
				/** for test  addTestMessage("toggle triggered!"); /** for test */
				LinkedList<byte[]> togglableAtsAt = AttachmentType.getAttachmentAtByType(itemStack.stackTagCompound, new byte[0], ItsType.NONE, ItsType.TOGGLABLE);
				if(togglableAtsAt.size() != 0)
				{
					AttachmentPos atPos = new AttachmentPos();
					AttachmentType shadowType;
					int[] atStates;
					for(byte[] atAt : togglableAtsAt)
					{
						if((shadowType = AttachmentType.getAttachment(((AttachmentType)GunType.getPosOfAttachableAt(
								atPos.resetAtTag(itemStack.stackTagCompound, type), atAt, atAt.length).atType).shadowType)).bigHitBox != null)
						{
							AttachmentType.setTOFOn(atStates = AttachmentType.getStates(atPos.atTag), AttachmentTag.AVOID_CHECK_ON);
							if(!type.checkAtConflicts(shadowType.bigHitBox.get3DHitBoxes(atPos.updateTriValues()), shadowType.hitBox.get3DHitBoxes(atPos), 
									itemStack.stackTagCompound, 0, 0F, 0F, 0F, 0F))
							{
								toggleAt = false;
								break;
							}
							AttachmentType.setTOFOff(atStates, AttachmentTag.AVOID_CHECK_OFF);
						}
						else
						{
							toggleAt = false;
							break;
						}
					}
				}
				if(toggleAt) toggleAt = false;
				else FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.TOGGLE_AT));
			}
			lastZoomProgress = zoomProgress; //update aiming progress
			if(currentScope) //if aiming
			{
				zoomProgress = 1F - (1F - zoomProgress) * aimTimeConst;
				if(!GunType.getTOF(gunStates, GunTag.AIM_ON)) FlansMod.packetHandler.sendToServer(new PacketGunNBTUpdate(NBTUpdateOperation.AIM_TRUE));
			}
			else //if not aiming
			{
				zoomProgress *= aimTimeConst;
				if(GunType.getTOF(gunStates, GunTag.AIM_ON)) FlansMod.packetHandler.sendToServer(new PacketGunNBTUpdate(NBTUpdateOperation.AIM_FALSE));
			}
		}
		else //if no gun in hand
		{
			minecraft.gameSettings.viewBobbing = FlansMod.viewBobbing;
			
			switchLaser = switchLight = switchToLastAimCenter = switchToNextAimCenter = switchDot = zoomUp = zoomDown = switchCoSight = false;
			//update gunRotYaw and gunRotPitch
			lastGunRotX = gunRotX;
			lastGunRotYaw = gunRotYaw;
			lastGunRotPitch = gunRotPitch;
			lastGunTransY = gunTransY;
			gunRotX += (player.rotationYaw - playerPrevRotationYaw) * 0.1F;
			gunRotX *= 0.8F;
			gunRotYaw += (player.rotationYaw - playerPrevRotationYaw) * 0.1F;
			gunRotYaw *= 0.8F;
			gunRotPitch += (player.rotationPitch - playerPrevRotationPitch) * 0.1F;
			gunRotPitch *= 0.8F;
			velocityY = (float)(player.posY - player.prevPosY);
			gunTransY += (playerPrevVelocityY - velocityY) * 0.05F;
			gunTransY *= 0.8F;
			if(operatingState != GunOperation.NONE || operationToDo != GunOperation.NONE) //first check if there is a operation that has not been finished
			{
				operationToDo = operatingState = GunOperation.NONE; //cancel it
				lastOperatingProgress = operatingProgress = 0F;
				resetReloadState(); //reset reload state for reload animation
			}
			
			lastSprintProgress = sprintProgress;
			if(sprinting) { if(sprintProgress < 1F && (sprintProgress += 0.05F) > 1F) sprintProgress = 1F; } //if running
			else if(sprintProgress > 0F && (sprintProgress -= 0.05F) < 0F) sprintProgress = 0F;
			//not holding the gun, so change gamingMouseSensitivity back to originalMouseSensitivity
			gamingMouseSensitivity = originalMouseSensitivity;
			//change back FOVConstant. we don't do this in renderGun because the update rate there is much higher
			cameraFOVConstant = 0F;
			if(currentScope) //if scoping, then unscope
			{
				currentScope = false;
				minecraft.gameSettings.thirdPersonView = originalThirdPerson;
			}
			lastZoomProgress = zoomProgress; //update zoomProgress
			zoomProgress *= 0.66F;
		}
		lastSlotInHand = player.inventory.currentItem; //gun part is done, update lastSlotInHand
		playerPrevRotationYaw = player.rotationYaw;
		playerPrevRotationPitch = player.rotationPitch;
		playerPrevVelocityY = velocityY;
		
		lastStanceProgress = stanceProgress;
		if(inPlane) stanceProgress = 1F - (1F - stanceProgress) * 0.66F;
		else stanceProgress *= 0.66F;
		if(minecraft.thePlayer.ridingEntity instanceof IControllable)
		{
			inPlane = true;
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((IControllable)minecraft.thePlayer.ridingEntity).getPlayerRoll(), "camRoll", "R", "field_78495_O");
			}
			catch (Exception e)
			{
				FlansMod.log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}			
			if(minecraft.thePlayer.ridingEntity instanceof IControllable)
			{
				try
				{
					ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((IControllable)minecraft.thePlayer.ridingEntity).getCameraDistance(), "thirdPersonDistance", "E", "field_78490_B");
				}
				catch (Exception e)
				{
					FlansMod.log("I forgot to update obfuscated reflection D:");
					throw new RuntimeException(e);
				}		
			}
		}
		else if(inPlane)
		{
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 0F, "camRoll", "R", "field_78495_O");
			}
			catch (Exception e)
			{
				FlansMod.log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}			
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 4.0F, "thirdPersonDistance", "E", "field_78490_B");
			}
			catch (Exception e)
			{
				FlansMod.log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}	
			inPlane = false;
		}
		if(controlModeSwitchTimer > 0) --controlModeSwitchTimer;
	}
	
	private static void setCurrentAtPos(NBTTagCompound atTag, float attachVec)
	{
		int[] atStates = AttachmentType.getStates(atTag);
		currentPosition = AttachmentType.getState(atStates, AttachmentTag.POS);
		currentOffset = (byte)AttachmentType.getOffset(atStates);
		currentStep = (short)(attachVec == 0F ? 0
				: FlansMod.getInt((currentPosition - AttachmentType.getAtType(atStates).attachOffset[currentOffset]) / attachVec));
		isValidPosition = true;
		if(modifyMode == ModifyMode.PAINT)
		{
			currentStep = -1; //TODO: further check
			clearToAddAtState();
		}
	}
	
	private static void clearToAddAtState() { atToAddInSlot = -1; atToAddStack = null; }
	
	private static void clearModifyKeyStates()
	{ selectUpKeyDown = selectDownKeyDown = selectLeftKeyDown = selectRightKeyDown = selectConfirmKeyDown = selectCancelKeyDown = selectSwapKeyDown = false; }
	
	private static boolean handlePaintModify(NBTTagCompound onTag, boolean coKeyDown, float attachVec)
	{
		if(selectSwapKeyDown)
		{
			if(modifyMode == ModifyMode.PAINT)
			{
				++modifyMode;
				if(modifyingOn > 0 && modifying[modifyingOn - 1] >= 0) setCurrentAtPos(onTag, attachVec);
			}
			else if(++modifyMode > ModifyMode.ON_AT)
			{
				modifyMode = ModifyMode.PAINT;
				currentStep = -1;
				clearToAddAtState();
			}
			tellPlayer(ModifyMode.getModiyModeString(modifyMode), 1);
			clearModifyKeyStates();
			return true;
		}
		if(modifyMode != ModifyMode.PAINT) return false;
		if((modifyingOn > 0 && modifying[modifyingOn - 1] < 0) || !coKeyDown) //not yet an at selected, no operation allowed in this mode
		{
			clearModifyKeyStates();
			return true;
		}
		if(selectLeftKeyDown || selectRightKeyDown)
		{
			if(atToAddInSlot >= 0) //if already selected an part skin
			{
				currentStep = -1;
				clearToAddAtState();
				clearModifyKeyStates();
				return true;
			}
			if(currentStep < 0 && (currentStep = (short)(modifyingOn == 0 ? itemStack.getItemDamage() 
					: AttachmentType.getAtDam(AttachmentType.getStates(onTag)))) < 0) currentStep = 0;
			else
			{
				int paintjobLen = modifyingOn == 0 ? type.paintjobs.length : AttachmentType.getAtType(onTag).paintjobs.length;
				if(selectLeftKeyDown) { if(--currentStep < 0) currentStep = (short)(paintjobLen - 1); }
				else if(++currentStep >= paintjobLen) currentStep = 0;
			}
		}
		if((selectUpKeyDown || selectDownKeyDown) && (atToAddInSlot = getValidExPaintjobItem(player.inventory, (byte)(selectUpKeyDown ? -1 : 1), 
				modifyingOn > 0 ? AttachmentType.getAtType(onTag).exPaintjobs : type.exPaintjobs)) == -1)
			atToAddStack = null; //not found or completed one loop, turn back to normal painjob
		if(selectConfirmKeyDown)
		{
			short currentDam = (short)(modifyingOn == 0 ? itemStack.getItemDamage() : AttachmentType.getAtDam(AttachmentType.getStates(onTag)));
			if(atToAddInSlot >= 0)
			{
				if(currentDam < 0 && ((ItemPart)Item.getItemById(currentDam & ModifiableTag.EX_PAINT_MASK)).type.equals(((ItemPart)atToAddStack.getItem()).type))
				{ } //TODO: tell player
				else //check pass, send packet
				{
					FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(modifying, modifyingOn > 0 ? modifyingOn : 1, Operation.EX_PAINTJOB, atToAddInSlot));
					currentStep = -1;
					clearToAddAtState();
				}
			}
			else if(currentStep >= 0)
			{
				if(currentDam == currentStep) { } //tell player
				else if(player.capabilities.isCreativeMode || (modifyingOn == 0 ? type.paintjobs[currentStep].hasMaterialsNeeded(player.inventory)
						: AttachmentType.getAtType(onTag).paintjobs[currentStep].hasMaterialsNeeded(player.inventory))) //check if all materials needed equipped
				{
					FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(modifying, modifyingOn > 0 ? modifyingOn : 1, Operation.PAINTJOB, currentStep));
					currentStep = -1;
				}
				else ; //TODO: tell player he does not have materials needed
			}
		}
		clearModifyKeyStates();
		return true;
	}
	
	private static byte getValidExPaintjobItem(InventoryPlayer inv, byte adder, HashMap<Integer, String> valid)
	{
		ItemStack stack;
		for(byte i = atToAddInSlot < 0 ? 0 : atToAddInSlot, check = i; ; )
		{
			if((i += adder) < 0) i = (byte)(inv.getSizeInventory() - 1);
			else if(i >= inv.getSizeInventory()) i = 0;
			if(i == check) break;
			if((stack = inv.getStackInSlot(i)) != null && stack.getItem() instanceof ItemPart 
					&& valid.containsKey(((ItemPart)stack.getItem()).type.exPaintjobType)) return i;
		}
		return (byte)(atToAddInSlot < 0 && (stack = inv.getStackInSlot(0)) != null && stack.getItem() instanceof ItemPart 
				&& valid.containsKey(((ItemPart)stack.getItem()).type.exPaintjobType) ? 0 : -1);
	}
	
	private static byte getValidAtToAdd(AttachableSlot slot, InventoryPlayer inv, byte adder)
	{
		ItemStack stack;
		for(byte i = atToAddInSlot < 0 ? 0 : atToAddInSlot, check = i; ; )
		{
			if((i += adder) < 0) i = (byte)(inv.getSizeInventory() - 1);
			else if(i >= inv.getSizeInventory()) i = 0;
			if(i == check) break;
			if((stack = inv.getStackInSlot(i)) != null && stack.getItem() instanceof ItemAttachment 
					&& slot.isAttachmentAllowed(((ItemAttachment)stack.getItem()).type)) return i;
		}
		return (byte)(atToAddInSlot < 0 && (stack = inv.getStackInSlot(0)) != null && stack.getItem() instanceof ItemAttachment 
				&& slot.isAttachmentAllowed(((ItemAttachment)stack.getItem()).type) ? 0 : -1);
	}
	
	private static void handleCoSightSwitch()
	{
		LinkedList<byte[]> sightsAt = GunType.getOnUseSightsAt(gunStates, GunType.getSightList(itemStack));
		if(sightsAt.size() < 1) return;
		NBTTagCompound atTag;
		AttachmentType atType, shadowType;
		AttachmentPos atPos = new AttachmentPos();
		int[] atStates;
		byte[] sightAt = null;
		for(Iterator<byte[]> i = sightsAt.iterator(); i.hasNext(); )
			if((atType = AttachmentType.getAtType(atTag = GunType.getAtTagAt(itemStack.stackTagCompound, sightAt = i.next(), sightAt.length & -2))).isCoSight())
			{
				if((shadowType = AttachmentType.getAttachment(atType.shadowType)).bigHitBox != null)
				{
					AttachmentType.setTOFOn(atStates = AttachmentType.getStates(atTag), AttachmentTag.AVOID_CHECK_ON);
					if(type.checkAtConflicts(shadowType.bigHitBox.get3DHitBoxes(GunType.getPosOfAttachableAt(atPos.resetAtTag(
							itemStack.stackTagCompound, type), sightAt, sightAt.length & -2).updateTriValues()), shadowType.hitBox.get3DHitBoxes(atPos), 
							itemStack.stackTagCompound, 0, 0F, 0F, 0F, 0F)) shadowType = null; //if not conflict, then send packet to switch it
					AttachmentType.setTOFOff(atStates, AttachmentTag.AVOID_CHECK_OFF);
					if(shadowType != null) continue;
				}
				FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.SWITCH_CO_SIGHT));
				return;
			}
		sightsAt.clear();
		if((sightsAt = AttachmentType.getAttachmentAtByType(
				itemStack.stackTagCompound, new byte[0], ItsType.NONE, ItsType.CO_SIGHT_FLIPPED, sightsAt)).size() == 0) return;
		AttachmentPos onUsePos = GunType.getAimCenterOfSightAt(new AttachmentPos(itemStack.stackTagCompound, type), sightAt);
		for(Iterator<byte[]> i = sightsAt.iterator(); i.hasNext(); )
			if((atType = (AttachmentType)GunType.getPosOfAttachableAt(atPos.resetAtTag(itemStack.stackTagCompound, type), 
					sightAt = i.next(), sightAt.length & -2).atType).aimCenterY * atPos.updateTriValues().cos - atType.aimCenterZ * atPos.sin + atPos.y == onUsePos.y 
					&& atPos.z + atType.aimCenterY * atPos.sin + atType.aimCenterZ * atPos.cos == onUsePos.z)
			{
				FlansMod.getPacketHandler().sendToServer(new PacketGunAttachment(Operation.SWITCH_CO_SIGHT));
				return;
			}
	}
	
	private static float getCameraWalkShakeMultYaw(com.flansmod.client.model.ModelGun gunModel)
	{ return gunModel.cameraWalkShakeMultYaw[0] * zoomProgress + gunModel.cameraWalkShakeMultYaw[2] * sprintProgress + gunModel.cameraWalkShakeMultYaw[1] * (2F - zoomProgress - sprintProgress) * 0.5F; }
	
	private static float getCameraWalkShakeMultPitch(com.flansmod.client.model.ModelGun gunModel)
	{ return gunModel.cameraWalkShakeMultPitch[0] * zoomProgress + gunModel.cameraWalkShakeMultPitch[2] * sprintProgress + gunModel.cameraWalkShakeMultPitch[1] * (2F - zoomProgress - sprintProgress) * 0.5F; }
	
	public static void updateMouseSenToChange(float sensitivityMult) { MouseSenNedToChange = gamingMouseSensitivity - gamingMouseSensitivity * sensitivityMult * FlansMod.mouseSensitivityMult; }
	
	public static void updateAimTimeConst(ItemStack gunStack, float aimTimeMult) { aimTimeConst = GunType.getState(GunType.getStates(gunStack), GunTag.AIM_TIME) * aimTimeMult; }
	
	/** method to load mag from inventory */
	private static boolean setLoadingMag(IInventory inv)
	{
		int bestSlot = -1;
		ItemStack stack = null;
		for(int i = -1, size = inv.getSizeInventory(); ++i < size; ) if(type.isValidMagazine(stack = inv.getStackInSlot(i)))
		{
			if(bestSlot < 0)
			{
				bestSlot = i;
				if(isAdvancedReload) break; //in advanced mode, we only load the magazine that we find first
			}
			if(!GunType.getTOF(GunType.getStates(stack), GunTag.MAG_USED_ON))
			{
				bestSlot = i;
				break;
			}
		}
		if(bestSlot < 0) return false;
		loadingMagStack = inv.getStackInSlot(bestSlot);
		return true;
	}
	
	private static void setNextReloadStep(int stepJustFinished, IInventory inv)
	{
		byte[] thisReloadSteps = type.reloadSteps;
		if(++reloadingStep < thisReloadSteps.length) //if there is still some steps to finish, then check if we need to do it
		{
			//if we need to pull mag but no mag or push mag with no valid mag in bag
			//or it is advancedReload and we have just pulled the mag out and the next step is push mag in
			//or it is advanceReload and the next step is to charge or release
			//or this step is charge but has ammo in barrel or release when slide not locked, then skip this step
			if((thisReloadSteps[reloadingStep] == GunOperation.UNLOAD_MAG && !GunType.hasMag(itemStack)) 
			   || (thisReloadSteps[reloadingStep] == GunOperation.LOAD_MAG && !setLoadingMag(inv)) 
			   || (isAdvancedReload  && ((stepJustFinished == GunOperation.UNLOAD_MAG && thisReloadSteps[reloadingStep] == GunOperation.LOAD_MAG)
			   || thisReloadSteps[reloadingStep] == GunOperation.CHARGE || thisReloadSteps[reloadingStep] == GunOperation.RELEASE_BOLT))
			   || (thisReloadSteps[reloadingStep] == GunOperation.RELEASE_BOLT && !GunType.getTOF(gunStates, GunTag.BOLT_CATCH_ON)) 
			   || (thisReloadSteps[reloadingStep] == GunOperation.CHARGE && GunType.emptyMag(GunType.getMagNBTTag(GunType.getMagTag(itemStack)))))
				setNextReloadStep(stepJustFinished, inv);
			else //next step is a valid step to do, then do it
			{
				shouldApplyEffect = shouldPlaySound = true;
				operatingState = (byte)(operatingState < GunOperation.NONE ? -thisReloadSteps[reloadingStep] : thisReloadSteps[reloadingStep]);
				if(operatingState == GunOperation.LOAD_MAG || operatingState == -GunOperation.LOAD_MAG)
					lastOperatingProgress = operatingProgress = 1F;
				else lastOperatingProgress = operatingProgress = operatingState == GunOperation.UNTILT_GUN || operatingState == -GunOperation.UNTILT_GUN ? 1F : 0F;
			}
		}
		else //no more valid steps to do, finish the operation
		{
			resetReloadState();
			operatingState = GunOperation.NONE;
			lastOperatingProgress = operatingProgress = 0F;
		}
	}
	
	/** method called to check if we can load ammo from a mag */
	private static boolean tryLoadAmmoFromMag_C(ItemStack gunStack)
	{	//first get the magazine of the gun
		NBTTagCompound magTag = GunType.getMagTag(gunStack);
		if(GunType.getMagItem(GunType.getMagIdDam(magTag)) == null) return false; //no magazine was found, return false
		return !GunType.emptyMag(GunType.getMagNBTTag(magTag));
	}
	
	public static void renderTick(float smoothing)
	{
		if(canChangeSettings) return;
		//real-time updating mouseSensitivity and fovSetting here
		minecraft.gameSettings.mouseSensitivity = gamingMouseSensitivity - MouseSenNedToChange * (lastZoomProgress + (zoomProgress - lastZoomProgress) * smoothing);
		minecraft.gameSettings.fovSetting = originalFOV * (1F + cameraFOVConstant);
	}
	
	@SubscribeEvent
	public void chatMessage(ClientChatReceivedEvent event)
	{
		if(event.message.getUnformattedText().equals("#flansmod"))
		{
			//String[] split = event.message.getUnformattedText().split("\\.");
			//split[split.length - 1] = split[split.length - 1].split("\"}")[0];
			event.setCanceled(true);
			//TickHandlerClient.addKillMessage(split);
			//FMLClientHandler.instance().getClient().thePlayer.sendChatToPlayer(split[3] + " killed " + split[2] + " with a " + InfoType.getType(split[1]).name);
		}
	}
	
	public static boolean flipControlMode()
	{
		if(controlModeSwitchTimer > 0) return false;
		controlModeMouse = !controlModeMouse;
		FMLClientHandler.instance().getClient().displayGuiScreen(controlModeMouse ? new GuiDriveableController((IControllable)FMLClientHandler.instance().getClient().thePlayer.ridingEntity) : null);
		controlModeSwitchTimer = 40;
		return true;
	}
	
	public static void reloadModels(boolean reloadSkins)
	{
		for(InfoType type : InfoType.infoTypes) type.reloadModel();
		if(reloadSkins) FlansMod.proxy.forceReload();
	}
	
	/** Gets the team class from an ID */
	public static Team getTeam(int spawnerTeamID) { return teamInfo != null ? teamInfo.getTeam(spawnerTeamID) : null; }
	
	public static boolean isCurrentMap(String map) { return !(teamInfo == null || teamInfo.mapShortName == null) && teamInfo.mapShortName.equals(map); }
	
	@SideOnly(Side.CLIENT)
	public static EntityFX getParticle(String s, World w, double x, double y, double z)
	{
		Minecraft mc = Minecraft.getMinecraft();
		//return mc.renderGlobal.doSpawnParticle(s, x, y, z, 0.01D, 0.01D, 0.01D);
		EntityFX fx = null;
		if(s.equals("hugeexplosion"))
			fx = new EntityHugeExplodeFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("largeexplode"))
			fx = new EntityLargeExplodeFX(mc.renderEngine, w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("fireworksSpark"))
			fx = new EntityFireworkSparkFX(w, x, y, z, 0D, 0D, 0D, mc.effectRenderer);
		else if(s.equals("bubble"))
			fx = new EntityBubbleFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("suspended"))
			fx = new EntitySuspendFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("depthsuspend"))
			fx = new EntityAuraFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("townaura"))
			fx = new EntityAuraFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("crit"))
			fx = new EntityCritFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("magicCrit"))
		{
			fx = new EntityCritFX(w, x, y, z, 0D, 0D, 0D);
			fx.setRBGColorF(fx.getRedColorF() * 0.3F, fx.getGreenColorF() * 0.8F, fx.getBlueColorF());
            fx.nextTextureIndexX();
		}
		else if(s.equals("smoke"))
			fx = new EntitySmokeFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("mobSpell"))
		{
			fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
			fx.setRBGColorF(0F, 0F, 0F);
		}
		else if(s.equals("mobSpellAmbient"))
		{
			fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
            fx.setAlphaF(0.15F);
            fx.setRBGColorF(0F, 0F, 0F);
		}
		else if(s.equals("spell"))
			fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("instantSpell"))
		{
			fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
			((EntitySpellParticleFX)fx).setBaseSpellTextureIndex(144);
		}
		else if(s.equals("witchMagic"))
		{
			fx = new EntitySmokeFX(w, x, y, z, 0D, 0D, 0D);
			((EntitySpellParticleFX)fx).setBaseSpellTextureIndex(144);
            float f = w.rand.nextFloat() * 0.5F + 0.35F;
            fx.setRBGColorF(1F * f, 0F * f, 1F * f);
		}
		else if(s.equals("note"))
			fx = new EntityNoteFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("portal"))
			fx = new EntityPortalFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("enchantmenttable"))
			fx = new EntityEnchantmentTableParticleFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("explode"))
			fx = new EntityExplodeFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("flame"))
			fx = new EntityFlameFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("lava"))
			fx = new EntityLavaFX(w, x, y, z);
		else if(s.equals("footstep"))
			fx = new EntityFootStepFX(mc.renderEngine, w, x, y, z);
		else if(s.equals("splash"))
			fx = new EntitySplashFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("wake"))
			fx = new EntityFishWakeFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("largesmoke"))
			fx = new EntitySmokeFX(w, x, y, z, 0D, 0D, 0D, 2.5F);
		else if(s.equals("cloud"))
			fx = new EntityCloudFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("reddust"))
			fx = new EntityReddustFX(w, x, y, z, 0F, 0F, 0F);
		else if(s.equals("snowballpoof"))
			fx = new EntityBreakingFX(w, x, y, z, Items.snowball);
		else if(s.equals("dripWater"))
			fx = new EntityDropParticleFX(w, x, y, z, Material.water);
		else if(s.equals("dripLava"))
			fx = new EntityDropParticleFX(w, x, y, z, Material.lava);
		else if(s.equals("snowshovel"))
			fx = new EntitySnowShovelFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("slime"))
			fx = new EntityBreakingFX(w, x, y, z, Items.slime_ball);
		else if(s.equals("heart"))
			fx = new EntityHeartFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("angryVillager"))
		{
			fx = new EntityHeartFX(w, x, y, z, 0D, 0D, 0D);
			fx.setParticleTextureIndex(81);
			fx.setRBGColorF(1.0F, 1.0F, 1.0F);
		}
		else if(s.equals("happyVillager"))
		{
			fx = new EntityAuraFX(w, x, y, z, 0D, 0D, 0D);
			fx.setParticleTextureIndex(82);
            fx.setRBGColorF(1.0F, 1.0F, 1.0F);
		}
		else if(s.equals("snowshovel"))
			fx = new EntitySnowShovelFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("snowshovel"))
			fx = new EntitySnowShovelFX(w, x, y, z, 0D, 0D, 0D);
		else if(s.equals("snowshovel"))
			fx = new EntitySnowShovelFX(w, x, y, z, 0D, 0D, 0D);
        else
        {
            int k;
            String[] astring;

            if (s.startsWith("iconcrack_"))
            {
                astring = s.split("_", 3);
                int j = Integer.parseInt(astring[1]);

                if (astring.length > 2)
                {
                    k = Integer.parseInt(astring[2]);
                    fx = new EntityBreakingFX(w, x, y, z, 0D, 0D, 0D, Item.getItemById(j), k);
                }
                else fx = new EntityBreakingFX(w, x, y, z, 0D, 0D, 0D, Item.getItemById(j), 0);
            }
            else
            {
                Block block;

                if (s.startsWith("blockcrack_"))
                {
                    astring = s.split("_", 3);
                    block = Block.getBlockById(Integer.parseInt(astring[1]));
                    k = Integer.parseInt(astring[2]);
                    fx = (new EntityDiggingFX(w, x, y, z, 0D, 0D, 0D, block, k)).applyRenderColor(k);
                }
                else if (s.startsWith("blockdust_"))
                {
                    astring = s.split("_", 3);
                    block = Block.getBlockById(Integer.parseInt(astring[1]));
                    k = Integer.parseInt(astring[2]);
                    fx = (new EntityBlockDustFX(w, x, y, z, 0D, 0D, 0D, block, k)).applyRenderColor(k);
                }
            }
        }
		
		if(mc.gameSettings.fancyGraphics) fx.renderDistanceWeight = 200D;
		
        if(fx != null)  mc.effectRenderer.addEffect(fx);
		return fx;
	}
	
	public static GunAnimations getGunAnimations(EntityLivingBase living)
	{
		GunAnimations animations = gunAnimationsRight.get(living);
		if(animations == null) gunAnimationsRight.put(living, animations = new GunAnimations());
		return animations;
	}
	
	/*public static void setAimType(AimType aimInputType)
	{
		Property cw = FlansMod.configFile.get("Settings", "Aim Type", "toggle", "The type of aiming that you want to use 'toggle' or 'hold'");
		cw.set(aimInputType.toString());
		FlansMod.configFile.save();
		aimType = aimInputType;
	}
	
	public static void setAimButton(FlanMouseButton buttonInput)
	{
		Property cw = FlansMod.configFile.get("Settings", "Aim Button", "left", "The mouse button used to aim a gun 'left' or 'right'");
		cw.set(buttonInput.toString());
		FlansMod.configFile.save();
		aimButton = buttonInput;
	}
	
	public static void setFireButton(FlanMouseButton buttonInput)
	{
		Property cw = FlansMod.configFile.get("Settings", "Fire Button", "right", "The mouse button used to fire a gun 'left' or 'right'");
		cw.set(buttonInput.toString());
		FlansMod.configFile.save();
		fireButton = buttonInput;
	}*/
	
	public static float staticRecoilPitch, staticRecoilYaw;
	/** update gun recoil the next shoot should use, take in count of mag if has */
	public static void updateGunRecoil(ItemStack gunStack)
	{
		int[] states = GunType.getStates(gunStack);
		staticRecoilPitch = GunType.getState(states, GunTag.RECOIL_PITCH) + (FlansMod.rand.nextFloat() - 0.5F) * GunType.getState(states, GunTag.RND_RECOIL_PITCH);
		staticRecoilYaw = GunType.getState(states, GunTag.RECOIL_YAW) + (FlansMod.rand.nextFloat() - 0.5F) * GunType.getState(states, GunTag.RND_RECOIL_YAW);
		if(crouching)
		{
			staticRecoilPitch *= FlansMod.decreaseRecoilPitch;
			staticRecoilYaw *= FlansMod.decreaseRecoilYaw;
		}
		NBTTagCompound magTag = GunType.getMagTag(gunStack);
		if(GunType.getMagItem(GunType.getMagIdDam(magTag)) == null) return;
		states = GunType.getStates(GunType.getMagNBTTag(magTag));
		staticRecoilPitch *= GunType.getState(states, GunTag.RECOIL_PITCH);
		staticRecoilYaw *= GunType.getState(states, GunTag.RND_RECOIL_YAW);
	}
	
	public static void updateSecGunRecoil(ItemStack gunStack) { }
	
	@SubscribeEvent
	public void onFOVUpdate(FOVUpdateEvent thisEvent) { thisEvent.newfov = 1F; }
	
	@SubscribeEvent
	public void onLivingJump(net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent thisEvent)
	{
		if(thisEvent.entityLiving.worldObj.isRemote && thisEvent.entityLiving instanceof EntityPlayer)
		{
			if(canChangeSettings)
			{
				originalMouseSensitivity = minecraft.gameSettings.mouseSensitivity;
				originalFOV = minecraft.gameSettings.fovSetting;
				canChangeSettings = false;
			}
			if(sprinting) //if jump when sprinting
			{
				currentStamina -= FlansMod.sprintJumpStaminaDrop;
				delayToRecoverStamina += FlansMod.sprintJumpRecoverStaminaDelay;
				net.minecraft.client.settings.KeyBinding.setKeyBindState(minecraft.gameSettings.keyBindSprint.getKeyCode(), false);
				currentAir -= FlansMod.sprintJumpAirDrop;
			}
			else if(walking)
			{
				currentStamina -= FlansMod.walkJumpStaminaDrop;
				delayToRecoverStamina += FlansMod.walkJumpRecoverStaminaDelay;
				currentAir -= FlansMod.walkJumpAirDrop;
			}
			else //jump when standing
			{
				currentStamina -= FlansMod.jumpStaminaDrop;
				delayToRecoverStamina += FlansMod.jumpRecoverStaminaDelay;
				currentAir -= FlansMod.jumpAirDrop;
			}
			//if no stamina left, set exhausted to be true
			if(currentStamina <= 0F)
			{
				currentStamina = 0F;
				exhausted = true;
				//release jump key
				net.minecraft.client.settings.KeyBinding.setKeyBindState(minecraft.gameSettings.keyBindJump.getKeyCode(), false);
			}
			if(currentAir < FlansMod.minAirWhenMove)
				currentAir = FlansMod.minAirWhenMove;
			if(currentAir < FlansMod.canBreathAir)
				canBreath = false;
			if(delayToRecoverStamina < FlansMod.minDelayToRecoverStamina)
				delayToRecoverStamina = FlansMod.minDelayToRecoverStamina;
			if(delayToRecoverStamina > FlansMod.maxDelayToRecoverStamina)
				delayToRecoverStamina = FlansMod.maxDelayToRecoverStamina;
		}
	}
	
	public static void tellPlayer(String s, int id)
	{ minecraft.ingameGUI.getChatGUI().printChatMessageWithOptionalDeletion(new ChatComponentText(s), id + 256); }
	
	/** for test */ 
	static ChatComponentText t = new ChatComponentText("test");
	public static void addTestMessage(String message)
	{
		
		if(player != null) player.addChatMessage(new ChatComponentText(message));
	}
	/** for test */
	
	/** for off hand gun rendering, out dated
	@SubscribeEvent
	public void renderOffHandGun(RenderPlayerEvent.Specials.Post event)
	{
		RenderPlayer renderer = event.renderer;
		EntityPlayer playerEntity = event.entityPlayer;
		//float dt = event.partialRenderTick;
		PlayerData data = PlayerHandler.getPlayerData(playerEntity, Side.CLIENT);
		
		ItemStack gunStack = null;
		
		//Check current stack is a one handed gun
		if(playerEntity instanceof EntityOtherPlayerMP)
			gunStack = data.offHandGunStack;
		else
		{
			ItemStack currentStack = playerEntity.getCurrentEquippedItem();
			if(data.offHandGunSlot != -1 && currentStack != null && currentStack.getItem() instanceof ItemGun && ((ItemGun)currentStack.getItem()).type.oneHanded)
				gunStack = playerEntity.inventory.getStackInSlot(data.offHandGunSlot);
			else return;
		}
		
		if(gunStack == null || !(gunStack.getItem() instanceof ItemGun)) return;
		GunType gunType = ((ItemGun)gunStack.getItem()).type;
		
		//Render!
		GL11.glPushMatrix();
		{
			renderer.modelBipedMain.bipedLeftArm.postRender(0.0625F);
			GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
	        
			GL11.glTranslatef(0F, 0.1875F, -0.3125F);
			GL11.glRotatef(20F, 1F, 0F, 0F);
			GL11.glRotatef(45F, 0F, 1F, 0F);
			GL11.glScalef(-1F, -1F, 1F);
			
			int k = gunStack.getItem().getColorFromItemStack(gunStack, 0);
			GL11.glColor4f((k >> 16 & 255) / 255F, (k >> 8 & 255) / 255F, (k & 255) / 255F, 1F);
			//ClientProxy.gunRenderer.renderOffHandGun(playerEntity, gunStack);  
			RenderGun.renderOffHandGun(playerEntity, gunStack);
		}
		GL11.glPopMatrix();
	}*/
    
}
