package com.flansmod.client;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import com.flansmod.api.IControllable;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.gui.GuiTeamSelect;
import com.flansmod.common.FlansMod;
import com.flansmod.common.OperationQueue.Operation;
import com.flansmod.common.guns.GunType.GunOperation;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketOperation;
import com.flansmod.common.network.PacketRequestDebug;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;

@SideOnly(Side.CLIENT)
public class KeyInputHandler
{
	/** Key categories */
	private static final String 
		KEY_CATEGORY_BASIC = "keycategory.flan",
		KEY_CATEGORY_GUN = "keycategory.flanguns",
		KEY_CATEGORY_MODIFY = "keycategory.flangunmodify",
		KEY_CATEGORY_ASSIST = "keycategory.flanassist",
		KEY_CATEGORY_VEHICLES = "keycategory.flanvehicles";
	
	/** Co-key */
	public static final KeyBinding coKey = ck("key.cokey", Keyboard.KEY_Z, KEY_CATEGORY_ASSIST);
	
	/** Standard keys */
	private static final FlanKeyBinding[] keys;
	private static enum FlanKeyBinding
	{
		SELECT_UP("key.selectup", Keyboard.KEY_UP, KEY_CATEGORY_MODIFY)
		{
			@Override
			protected void trigger() { FlansModClient.selectUpKeyDown = true; }
		},
		SELECT_DOWN("key.selectdown", Keyboard.KEY_DOWN, KEY_CATEGORY_MODIFY)
		{
			@Override
			protected void trigger() { FlansModClient.selectDownKeyDown = true; }
		},
		SELECT_LEFT("key.selectleft", Keyboard.KEY_LEFT, KEY_CATEGORY_MODIFY)
		{
			@Override
			protected void trigger() { FlansModClient.selectLeftKeyDown = true; }
		},
		SELECT_RIGHT("key.selectright", Keyboard.KEY_RIGHT, KEY_CATEGORY_MODIFY)
		{
			@Override
			protected void trigger() { FlansModClient.selectRightKeyDown = true; }
		},
		SELECT_CONFIRM("key.selectconfirm", Keyboard.KEY_G, KEY_CATEGORY_MODIFY)
		{
			@Override
			protected void trigger() { FlansModClient.selectConfirmKeyDown = true; }
		},
		SELECT_CANCEL("key.selectcancel", Keyboard.KEY_H, KEY_CATEGORY_MODIFY)
		{
			@Override
			protected void trigger() { FlansModClient.selectCancelKeyDown = true; }
		},
		SELECT_SWAP("key.selectswap", Keyboard.KEY_V, KEY_CATEGORY_MODIFY)
		{
			@Override
			protected void trigger() { FlansModClient.selectSwapKeyDown = true; }
		};
		
		public final KeyBinding key;
		public boolean lastDown = false;
		
		private FlanKeyBinding(String name, int key, String category)
		{ this.key = ck(name, key, category); }
		
		public final boolean keyDown()
		{
			return key.getKeyCode() != 0 
					&& (key.getKeyCode() < 0 ? Mouse.isButtonDown(key.getKeyCode() + 100) 
							: Keyboard.isKeyDown(key.getKeyCode()));
		}
		
		protected void update()
		{
			if(!keyDown()) lastDown = false;
			else if(!lastDown)
			{
				trigger();
				lastDown = true;
			}
		}
		
		protected abstract void trigger();
	}
	
	/** Co-keys */
	private static final FlanCoKeyBinding[] coKeys;
	private static enum FlanCoKeyBinding
	{
		//Flan's Mod Assist
		CO_ADVANCED_RELOAD("cokey.advancedreload", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.operationToDo = GunOperation.PRE_RELOAD;
				FlansModClient.isAdvancedReload = true;
			}
		},
		CO_CHECK_AMMO("cokey.checkammo", Keyboard.KEY_R, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.operationToDo = GunOperation.CHECK_AMMO; }
		},
		CO_CHECK_CHAMBER("cokey.checkchamber", Keyboard.KEY_T, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.operationToDo = GunOperation.PRE_CHAMBER_CHECK; }
		},
		CO_CHARGE_GUN("cokey.chargegun", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.operationToDo = GunOperation.CHARGE; }
		},
		CO_RELEASE_BOLT("cokey.releasebolt", Keyboard.KEY_G, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.operationToDo = GunOperation.RELEASE_BOLT; }
		},
		CO_FIRE_MODE("cokey.switchfiremode", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger()
			{ FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.SWITCH_FIREMODE)); }
		},
		CO_ZOOM_IN("cokey.zoomin", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.zoomUp = true; }
		},
		CO_ZOOM_OUT("cokey.zoomout", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.zoomDown = true; }
		},
		CO_SWITCH_COSIGHT("cokey.switchcosight", Keyboard.KEY_TAB, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.switchCoSight = true; }
		},
		CO_TOGGLE_AT("cokey.toggleat", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.toggleAt = true; }
		},
		CO_LAST_SIGHT("cokey.lastsight", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.switchToLastAimCenter = true; }
		},
		CO_NEXT_SIGHT("cokey.nextsight", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.switchToNextAimCenter = true; }
		},
		CO_SWITCH_RETICLE("cokey.switchreticle", Keyboard.KEY_B, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.switchDot = FlansModClient.itemStack != null 
						&& FlansModClient.itemStack.getItem() instanceof ItemGun;
			}
		},
		CO_SWITCH_LIGHT("cokey.switchlight", Keyboard.KEY_Y, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.switchLight = FlansModClient.itemStack != null 
						&& FlansModClient.itemStack.getItem() instanceof ItemGun;
			}
		},
		CO_SWITCH_LASER("cokey.switchlaser", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.switchLaser = FlansModClient.itemStack != null 
						&& FlansModClient.itemStack.getItem() instanceof ItemGun;
			}
		},
		CO_REST("cokey.rest", Keyboard.KEY_V, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger()
			{
				if(FlansModClient.operatingState == GunOperation.REST)
				{
					FlansModClient.operatingState = GunOperation.UNREST;
					FlansModClient.manuallyRest = false;
				}
				else
				{
					if(FlansModClient.operatingState == GunOperation.UNREST)
						FlansModClient.operatingState = GunOperation.REST;
					else FlansModClient.operationToDo = GunOperation.REST;
					FlansModClient.manuallyRest = true;
				}
			}
		},
		CO_MANUAL_MODE("cokey.manualmode", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.tellPlayer(I18n.format((FlansModClient.manualMode = !FlansModClient.manualMode) 
						? "message.manualmodeenabled" : "message.manualmodedisenabled"), 1);
			}
		},
		CO_MODIFY_GUN("cokey.gunmodifymode", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.operationToDo = GunOperation.MODIFY; }
		},
		CO_MASK("cokey.mask", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger() { FlansModClient.switchMask = true; }
		},
		CO_ADJUST_MODE("cokey.adjustmode", Keyboard.KEY_NONE, KEY_CATEGORY_ASSIST)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.tellPlayer(I18n.format(
						FlansModClient.canChangeSettings ? "message.adjustmodeenabled" : "adjustmodedisenabled"), 1);
				FlansModClient.canChangeSettings = true;
			}
		};
		
		public final KeyBinding key;
		public boolean lastDown = false;
		
		private FlanCoKeyBinding(String name, int key, String category)
		{ this.key = ck(name, key, category); }
		
		public final boolean keyDown()
		{
			return key.getKeyCode() != 0 
					&& (key.getKeyCode() < 0 ? Mouse.isButtonDown(key.getKeyCode() + 100) 
							: Keyboard.isKeyDown(key.getKeyCode()));
		}
		
		protected void update()
		{
			if(!keyDown()) lastDown = false;
			else if(!lastDown)
			{
				trigger();
				lastDown = true;
			}
		}
		
		protected abstract void trigger();
	}
	
	/** Non-co-keys */
	private static final FlanIncoKeyBinding[] incoKeys;
	private static enum FlanIncoKeyBinding
	{
		// Flan's mod
		DEBUG("key.debugmode", Keyboard.KEY_F10, KEY_CATEGORY_BASIC)
		{
			@Override
			protected void trigger()
			{
				if(FlansMod.DEBUG) FlansMod.DEBUG = false;
				else FlansMod.packetHandler.sendToServer(new PacketRequestDebug());
			}
		},
		RELOAD_MODEL("key.reloadmodel", Keyboard.KEY_F9, KEY_CATEGORY_BASIC)
		{
			@Override
			protected void trigger()
			{ FlansModClient.reloadModels(KeyInputHandler.keyDown(Keyboard.KEY_LSHIFT)); }
		},
		ADJUST_MODE("key.adjustmode", Keyboard.KEY_P, KEY_CATEGORY_BASIC)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.tellPlayer(I18n.format(
						FlansModClient.canChangeSettings ? "message.adjustmodeenabled" : "adjustmodedisenabled"), 1);
				FlansModClient.canChangeSettings = true;
			}
		},
		TEAM_MENU("key.teammenu", Keyboard.KEY_NONE, KEY_CATEGORY_BASIC)
		{
			@Override
			protected void trigger() { FlansModClient.minecraft.displayGuiScreen(new GuiTeamSelect()); }
		},
		TEAM_SCORE("key.teamscore", Keyboard.KEY_NONE, KEY_CATEGORY_BASIC)
		{
			@Override
			protected void trigger() { FlansModClient.minecraft.displayGuiScreen(new GuiTeamScores()); }
		},
		// Flan's mod guns
		RELOAD("key.reload", Keyboard.KEY_R, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.operationToDo = GunOperation.PRE_RELOAD;
				FlansModClient.isAdvancedReload = false;
			}
		},
		ADVANCED_RELOAD("key.advancedreload", Keyboard.KEY_T, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.operationToDo = GunOperation.PRE_RELOAD;
				FlansModClient.isAdvancedReload = true;
			}
		},
		CHECK_AMMO("key.checkammo", Keyboard.KEY_NONE, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.operationToDo = GunOperation.CHECK_AMMO; }
		},
		CHECK_CHAMBER("key.checkchamber", Keyboard.KEY_NONE, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.operationToDo = GunOperation.PRE_CHAMBER_CHECK; }
		},
		CHARGE_GUN("key.chargegun", Keyboard.KEY_G, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.operationToDo = GunOperation.CHARGE; }
		},
		RELEASE_BOLT("key.releasebolt", Keyboard.KEY_H, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.operationToDo = GunOperation.RELEASE_BOLT; }
		},
		FIRE_MODE("key.switchfiremode", Keyboard.KEY_X, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger()
			{ FlansMod.getPacketHandler().sendToServer(new PacketOperation(Operation.SWITCH_FIREMODE)); }
		},
		ZOOM_IN("key.zoomin", Keyboard.KEY_B, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.zoomUp = true; }
		},
		ZOOM_OUT("key.zoomout", Keyboard.KEY_V, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.zoomDown = true; }
		},
		SWITCH_COSIGHT("key.switchcosight", Keyboard.KEY_NONE, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.switchCoSight = true; }
		},
		TOGGLE_AT("key.toggleat", Keyboard.KEY_CAPITAL, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.toggleAt = true; }
		},
		LAST_SIGHT("key.lastsight", Keyboard.KEY_NONE, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.switchToLastAimCenter = true; }
		},
		NEXT_SIGHT("key.nextsight", Keyboard.KEY_TAB, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.switchToNextAimCenter = true; }
		},
		SWITCH_RETICLE("key.switchreticle", Keyboard.KEY_COMMA, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.switchDot = FlansModClient.itemStack != null 
						&& FlansModClient.itemStack.getItem() instanceof ItemGun;
			}
		},
		SWITCH_LIGHT("key.switchlight", Keyboard.KEY_U, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.switchLight = FlansModClient.itemStack != null 
						&& FlansModClient.itemStack.getItem() instanceof ItemGun;
			}
		},
		SWITCH_LASER("key.switchlaser", Keyboard.KEY_Y, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.switchLaser = FlansModClient.itemStack != null 
						&& FlansModClient.itemStack.getItem() instanceof ItemGun;
			}
		},
		REST("key.rest", Keyboard.KEY_O, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger()
			{
				if(FlansModClient.operatingState == GunOperation.REST)
				{
					FlansModClient.operatingState = GunOperation.UNREST;
					FlansModClient.manuallyRest = false;
				}
				else
				{
					if(FlansModClient.operatingState == GunOperation.UNREST)
						FlansModClient.operatingState = GunOperation.REST;
					else FlansModClient.operationToDo = GunOperation.REST;
					FlansModClient.manuallyRest = true;
				}
			}
		},
		MANUAL_MODE("key.manualmode", Keyboard.KEY_PERIOD, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger()
			{
				FlansModClient.tellPlayer(I18n.format((FlansModClient.manualMode = !FlansModClient.manualMode) 
						? "message.manualmodeenabled" : "message.manualmodedisenabled"), 1);
			}
		},
		MASK("key.mask", Keyboard.KEY_N, KEY_CATEGORY_GUN)
		{
			@Override
			protected void trigger() { FlansModClient.switchMask = true; }
		},
		// Flan's Mod Modify
		MODIFY_GUN("key.gunmodifymode", Keyboard.KEY_I, KEY_CATEGORY_MODIFY)
		{
			@Override
			protected void trigger() { FlansModClient.operationToDo = GunOperation.MODIFY; }
		};
		
		public final KeyBinding key;
		public boolean lastDown = false;
		
		private FlanIncoKeyBinding(String name, int key, String category)
		{ this.key = ck(name, key, category); }
		
		public final boolean keyDown()
		{
			return key.getKeyCode() != 0 
					&& (key.getKeyCode() < 0 ? Mouse.isButtonDown(key.getKeyCode() + 100) 
							: Keyboard.isKeyDown(key.getKeyCode()));
		}
		
		protected void update()
		{
			if(!keyDown()) lastDown = false;
			else if(!lastDown)
			{
				trigger();
				lastDown = true;
			}
		}
		
		protected abstract void trigger();
	}
	
	/** Vehicle keys */
	private static final FlanVKeyBinding[] vKeys;
	public static enum FlanVKeyBinding
	{
		// Flan's Mod Vehicles
		V_DOWN("key.down", Keyboard.KEY_NUMPAD7, KEY_CATEGORY_VEHICLES)
		{
			@Override
			protected void update() { riding.pressKey(5, player); }
		},
		V_ROLL_LEFT("key.rollleft", Keyboard.KEY_LEFT, KEY_CATEGORY_VEHICLES)
		{
			@Override
			protected void update() { riding.pressKey(11, player); }
		},
		V_ROLL_RIGHT("key.rollright", Keyboard.KEY_RIGHT, KEY_CATEGORY_VEHICLES)
		{
			@Override
			protected void update() { riding.pressKey(12, player); }
		},
		V_INVENTORY("key.vehicleinventory", Keyboard.KEY_NUMPAD8, KEY_CATEGORY_VEHICLES),
		V_CONTROL_SWITCH("key.controlswitch", Keyboard.KEY_C, KEY_CATEGORY_VEHICLES)
		{
			@Override
			protected void trigger() { riding.pressKey(10, player); }
		},
		V_GEAR("key.switchgear", Keyboard.KEY_NUMPAD3, KEY_CATEGORY_VEHICLES)
		{
			@Override
			protected void trigger() { riding.pressKey(13, player); }
		},
		V_DOOR("key.switchdoor", Keyboard.KEY_NUMPAD4, KEY_CATEGORY_VEHICLES)
		{
			@Override
			protected void trigger() { riding.pressKey(14, player); }
		},
		V_BOMB("key.bomb", Keyboard.KEY_NUMPAD1, KEY_CATEGORY_VEHICLES)
		{
			@Override
			protected void trigger() { riding.pressKey(8, player); }
		},
		V_GUN("key.gun", Keyboard.KEY_NUMPAD2, KEY_CATEGORY_VEHICLES)
		{
			@Override
			protected void update() { riding.pressKey(9, player); }
		},
		V_FLARE("key.flare", Keyboard.KEY_NUMPAD6, KEY_CATEGORY_VEHICLES)
		{
			@Override
			protected void trigger() { riding.pressKey(18, player); }
		},
		V_MODE("key.switchmode", Keyboard.KEY_NUMPAD3, KEY_CATEGORY_VEHICLES)
		{
			@Override
			protected void trigger() { riding.pressKey(15, player); }
		};
		
		private static EntityPlayer player;
		private static IControllable riding;
		
		public final KeyBinding key;
		public boolean lastDown = false;
		
		private FlanVKeyBinding(String name, int key, String category)
		{ this.key = ck(name, key, category); }
		
		public final boolean keyDown()
		{
			return key.getKeyCode() != 0 
					&& (key.getKeyCode() < 0 ? Mouse.isButtonDown(key.getKeyCode() + 100) 
							: Keyboard.isKeyDown(key.getKeyCode()));
		}
		
		protected void update()
		{
			if(!keyDown()) lastDown = false;
			else if(!lastDown)
			{
				trigger();
				lastDown = true;
			}
		}
		
		protected void trigger() { };
		
		private static void updateAll()
		{
			riding = (IControllable)(player = FlansModClient.minecraft.thePlayer).ridingEntity;
			for(FlanVKeyBinding k : values()) k.update();
		}
		
		public final int keyCode() { return key.getKeyCode(); }
	}
	
	static
	{
		keys = FlanKeyBinding.values();
		coKeys = FlanCoKeyBinding.values();
		incoKeys = FlanIncoKeyBinding.values();
		vKeys = FlanVKeyBinding.values();
	}
	
	//for Flan's Mod Guns
	public static int
			fireKey = -100,
			aimHoldKey = -99,
			aimToggleKey = Keyboard.KEY_NONE;
	public static boolean
			fireKeyDown = false,
			lastFireKeyDown = false,
			aimHoldKeyDown = false,
			lastAimHoldKeyDown = false,
			aimToggleKeyDown = false,
			lastAimToggleKeyDown = false;
	/** for test 
	public static KeyBinding testUpKey = ck("Test Up Key", Keyboard.KEY_UP, "Flan's Mod Test");
	public static KeyBinding testDownKey = ck("Test Down Key", Keyboard.KEY_DOWN, "Flan's Mod Test");
	public static KeyBinding testLeftKey = ck("Test Left Key", Keyboard.KEY_LEFT, "Flan's Mod Test");
	public static KeyBinding testRightKey = ck("Test Right Key", Keyboard.KEY_RIGHT, "Flan's Mod Test");
	public static KeyBinding getNumKey = ck("Get Num Key", Keyboard.KEY_NUMPAD5, "Flan's Mod Test");
	/** for test */

	public KeyInputHandler()
	{
		/** for test 
		ClientRegistry.registerKeyBinding(testUpKey);
		ClientRegistry.registerKeyBinding(testDownKey);
		ClientRegistry.registerKeyBinding(testLeftKey);
		ClientRegistry.registerKeyBinding(testRightKey);
		ClientRegistry.registerKeyBinding(getNumKey);
		/** for test */
	}
	
	private static KeyBinding ck(String kn, int k, String kc)
	{
		KeyBinding kb = new KeyBinding(kn, k, kc);
		ClientRegistry.registerKeyBinding(kb);
		return kb;
	}
	
	public static void updateLastKeyDown()
	{
		lastFireKeyDown = fireKeyDown;
		lastAimHoldKeyDown = aimHoldKeyDown;
		lastAimToggleKeyDown = aimToggleKeyDown;
	}

	@SubscribeEvent
	public void onInput(InputEvent event)
	{
		if(FMLClientHandler.instance().isGUIOpen(GuiChat.class) || FlansModClient.minecraft.currentScreen != null) return;

		//Handle universal keys
		/** for test 
		if(testUpKey.isPressed()) FlansModClient.tu = true;
		if(testDownKey.isPressed()) FlansModClient.td = true;
		if(testLeftKey.isPressed()) FlansModClient.tl = true;
		if(testRightKey.isPressed()) FlansModClient.tr = true;
		if(getNumKey.isPressed()) FlansModClient.gn = true;
		/** for test */
		
		fireKeyDown = keyDown(fireKey);
		aimHoldKeyDown = keyDown(aimHoldKey);
		aimToggleKeyDown = keyDown(aimToggleKey);
		
		if(keyDown(coKey.getKeyCode()))
			for(FlanCoKeyBinding k : coKeys) k.update();
		else for(FlanIncoKeyBinding k : incoKeys) k.update();
		for(FlanKeyBinding k : keys) k.update();

		//Handle driving keys
		if(FlansModClient.minecraft.thePlayer.ridingEntity instanceof IControllable)
		{
			EntityPlayer player = FlansModClient.minecraft.thePlayer;
			IControllable riding = (IControllable)player.ridingEntity;
			if(FlansModClient.minecraft.gameSettings.keyBindForward.isPressed())//if(accelerateKey.isPressed())
				riding.pressKey(0, player);
			if(FlansModClient.minecraft.gameSettings.keyBindBack.isPressed())//if(decelerateKey.isPressed())
				riding.pressKey(1, player);
			if(FlansModClient.minecraft.gameSettings.keyBindLeft.isPressed())//if(leftKey.isPressed())
				riding.pressKey(2, player);
			if(FlansModClient.minecraft.gameSettings.keyBindRight.isPressed())//if(rightKey.isPrkeyDown(.pressKey(3, player);
			if(FlansModClient.minecraft.gameSettings.keyBindJump.isPressed())//if(upKey.isPressed())
				riding.pressKey(4, player);
			if(FlansModClient.minecraft.gameSettings.keyBindSneak.isPressed())//if(exitKey.isPressed())
				riding.pressKey(6, player);
			if(FlansModClient.minecraft.gameSettings.keyBindInventory.isPressed()/* || inventoryKey.isPressed()*/)
				riding.pressKey(7, player);
			FlanVKeyBinding.updateAll();
		}
	}
	
	public static boolean keyDown(int keyCode)
	{ return keyCode != 0 && (keyCode < 0 ? Mouse.isButtonDown(keyCode + 100) : Keyboard.isKeyDown(keyCode)); }
	
	public static boolean aimKeyDown() {
		return aimHoldKeyDown || aimToggleKeyDown;
	}
	
	public static boolean lastAimKeyDown() {
		return lastAimHoldKeyDown || lastAimToggleKeyDown;
	}

	public static int getReloadModelKeyCode() {
		return FlanIncoKeyBinding.RELOAD_MODEL.key.getKeyCode();
	}
}
