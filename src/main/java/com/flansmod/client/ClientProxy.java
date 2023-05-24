package com.flansmod.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import com.flansmod.client.debug.EntityDebugAABB;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.client.debug.RenderDebugAABB;
import com.flansmod.client.debug.RenderDebugDot;
import com.flansmod.client.debug.RenderDebugVector;
import com.flansmod.client.gui.GuiArmourBox;
import com.flansmod.client.gui.GuiDriveableCrafting;
import com.flansmod.client.gui.GuiDriveableFuel;
import com.flansmod.client.gui.GuiDriveableInventory;
import com.flansmod.client.gui.GuiDriveableMenu;
import com.flansmod.client.gui.GuiDriveableRepair;
import com.flansmod.client.gui.GuiGunBox;
import com.flansmod.client.gui.GuiGunModTable;
import com.flansmod.client.gui.GuiMechaInventory;
import com.flansmod.client.gui.GuiPaintjobTable;
import com.flansmod.client.model.RenderAAGun;
import com.flansmod.client.model.RenderBullet;
import com.flansmod.client.model.RenderFlag;
import com.flansmod.client.model.RenderFlagpole;
import com.flansmod.client.model.RenderGrenade;
import com.flansmod.client.model.RenderGun;
import com.flansmod.client.model.RenderMG;
import com.flansmod.client.model.RenderMecha;
import com.flansmod.client.model.RenderNull;
import com.flansmod.client.model.RenderParachute;
import com.flansmod.client.model.RenderPlane;
import com.flansmod.client.model.RenderTest;
import com.flansmod.client.model.RenderVehicle;
import com.flansmod.common.CommonProxy;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityWheel;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.boxes.BlockGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.network.PacketBuyArmour;
import com.flansmod.common.network.PacketBuyWeapon;
import com.flansmod.common.network.PacketCraftDriveable;
import com.flansmod.common.network.PacketGiveItem;
import com.flansmod.common.network.PacketRepairDriveable;
import com.flansmod.common.paintjob.TileEntityPaintjobTable;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.teams.BlockArmourBox;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.teams.TileEntitySpawner;
import com.flansmod.common.tools.EntityParachute;
import com.flansmod.common.types.InfoType;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLModContainer;
import cpw.mods.fml.common.MetadataCollection;
import cpw.mods.fml.common.discovery.ContainerType;
import cpw.mods.fml.common.discovery.ModCandidate;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
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
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

public final class ClientProxy extends CommonProxy
{
	public static final String MODEL_DIR = "com.flansmod.client.model.";
	
	/* These renderers handle rendering in hand items */
	public static RenderGun gunRenderer;
	public static RenderGrenade grenadeRenderer;
	public static RenderPlane planeRenderer;
	public static RenderVehicle vehicleRenderer;
	public static RenderMecha mechaRenderer;
	public static RenderTest testRenderer;

	@Override
	public void load()
	{
		(new FlansModClient()).load();
		
		gunRenderer = new RenderGun();
		grenadeRenderer = new RenderGrenade();
		planeRenderer = new RenderPlane();
		vehicleRenderer = new RenderVehicle();
		mechaRenderer = new RenderMecha();
		testRenderer = new RenderTest();
		
		// Register custom item renderers
		for(GunType gunType : GunType.guns.values()) if(gunType.model != null)
			MinecraftForgeClient.registerItemRenderer(gunType.item, gunRenderer);
		
		for(GrenadeType grenadeType : GrenadeType.grenades) if(grenadeType.model != null)
			MinecraftForgeClient.registerItemRenderer(grenadeType.item, grenadeRenderer);
		
		for(PlaneType planeType : PlaneType.types) if(planeType.model != null)
			MinecraftForgeClient.registerItemRenderer(planeType.item, planeRenderer);
		
		for(VehicleType vehicleType : VehicleType.types) if(vehicleType.model != null)
			MinecraftForgeClient.registerItemRenderer(vehicleType.item, vehicleRenderer);
		
		for(MechaType mechaType : MechaType.types) if(mechaType.model != null)
			MinecraftForgeClient.registerItemRenderer(mechaType.item, mechaRenderer);
		
		for(PartType partType : PartType.parts) if(partType.model != null)
			MinecraftForgeClient.registerItemRenderer(partType.item, testRenderer);
		
		FMLCommonHandler.instance().bus().register(new KeyInputHandler());
		new TickHandlerClient();
	}
	
	/** This method reloads all textures from all mods and resource packs. It forces Minecraft to read images from the content packs added after mod init */
	@Override
	public void forceReload() { Minecraft.getMinecraft().refreshResources(); }

	/** This method grabs all the content packs and puts them in a list. The client side part registers them as FMLModContainers which adds their resources to the game after a refresh */
	@Override
	public List<File> getContentList()
	{
		List<File> contentPacks = new ArrayList<File>();
		for(File file : FlansMod.flanDir.listFiles())
		{
			File resourceFile = null;
			if(file.isDirectory() || PACK_PATTERN.matcher(file.getName()).matches())
			{
				resourceFile = file;
				try { Coder.instance.addURLToParent(file.toURI().toURL()); }
				catch (MalformedURLException e)
				{
					FlansMod.log("Failed to add url for file <" + file.getName() + ">, model loading will fail");
					if(FlansMod.printStackTrace) e.printStackTrace();
				}
			}
			else if(file.getName().endsWith(SUFFIX))
			{
				try
				{
					BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
					
					int pathLen = 0, jarLen = 0;
					for(int i = 32; (i -= 8) >= 0; pathLen |= (in.read() << i) & (-1 >>> (24 - i)));
					for(int i = 32; (i -= 8) >= 0; jarLen |= (in.read() << i) & (-1 >>> (24 - i)));
					
					byte[] pathBytes = new byte[pathLen];
					in.read(pathBytes);
					for(int i = pathLen; --i >= 0; pathBytes[i] ^= i);
					
					if(!(resourceFile = new File(FlansMod.flanDir.getParentFile(), new String(pathBytes))).exists())
					{
						File parentDir = resourceFile.getParentFile();
						if(!parentDir.exists() || !parentDir.isDirectory()) resourceFile.getParentFile().mkdirs();
						resourceFile.createNewFile();
					}
					
					BufferedOutputStream dest = new BufferedOutputStream(new FileOutputStream(resourceFile));
					for(int i = 0; i < jarLen; ++i) dest.write(in.read() ^ i);
					dest.close();
					
					ByteArrayOutputStream bout = new ByteArrayOutputStream();
					for(int buf; (buf = in.read()) != -1; bout.write(buf));
					in.close();
					byte[] byteStream = bout.toByteArray();
					bout.close();
					for(int i = byteStream.length; --i >= 0; byteStream[i] ^= i);
					
					int p = 0, i;
					for(byte[] bytes; p < byteStream.length; )
					{
						for(i = 32, pathLen = 0; (i -= 8) >= 0; pathLen |= (byteStream[p++] << i) & (-1 >>> (24 - i)));
						for(bytes = new byte[pathLen], i = 0; i < pathLen; bytes[i++] = byteStream[p++]);
						String key = new String(bytes);
						for(i = 32, pathLen = 0; (i -= 8) >= 0; pathLen |= (byteStream[p++] << i) & (-1 >>> (24 - i)));
						for(bytes = new byte[pathLen], i = 0; i < pathLen; bytes[i++] = byteStream[p++]);
						Coder.instance.putSource(key, bytes);
					}
				}
				catch(IOException e) { }
			}
			else continue;
			
			contentPacks.add(resourceFile);
			
			HashMap<String, Object> modDescriptor = new HashMap<String, Object>();
			modDescriptor.put("modid", "FlansMod");
			modDescriptor.put("name", "Flan's Mod: " + resourceFile.getName());
			modDescriptor.put("version", "1");
			FMLModContainer container = new FMLModContainer(
					"com.flansmod.common.FlansMod", 
					new ModCandidate(
							resourceFile,
							resourceFile,
							resourceFile.isDirectory() ? ContainerType.DIR : ContainerType.JAR
					),
					modDescriptor
			);
			container.bindMetadata(MetadataCollection.from(null, null));
			FMLClientHandler.instance().addModAsResource(container);
		}
		
		return contentPacks;
	}
	
	/** Register entity renderers */
	@Override
	public void registerRenderers()
	{		
		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderGrenade());
		RenderingRegistry.registerEntityRenderingHandler(EntityPlane.class, new RenderPlane());
		RenderingRegistry.registerEntityRenderingHandler(EntityVehicle.class, new RenderVehicle());
		RenderingRegistry.registerEntityRenderingHandler(EntityAAGun.class, new RenderAAGun());
		RenderingRegistry.registerEntityRenderingHandler(EntityFlagpole.class, new RenderFlagpole());
		RenderingRegistry.registerEntityRenderingHandler(EntityFlag.class, new RenderFlag());
		RenderingRegistry.registerEntityRenderingHandler(EntitySeat.class, new RenderNull());		
		RenderingRegistry.registerEntityRenderingHandler(EntityWheel.class, new RenderNull());
		RenderingRegistry.registerEntityRenderingHandler(EntityMG.class, new RenderMG());
		RenderingRegistry.registerEntityRenderingHandler(EntityParachute.class, new RenderParachute());
		RenderingRegistry.registerEntityRenderingHandler(EntityDebugDot.class, new RenderDebugDot());
		RenderingRegistry.registerEntityRenderingHandler(EntityDebugVector.class, new RenderDebugVector());
		RenderingRegistry.registerEntityRenderingHandler(EntityDebugAABB.class, new RenderDebugAABB());
		RenderingRegistry.registerEntityRenderingHandler(EntityMecha.class, new RenderMecha());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpawner.class, new TileEntitySpawnerRenderer());
	}
	
	/** Old one time tutorial code that displays messages the first time you enter a plane / vehicle. Needs reworking */
	@Override
	public void doTutorialStuff(EntityPlayer player, EntityDriveable entityType)
	{
		if(!FlansModClient.doneTutorial)
		{
			FlansModClient.doneTutorial = true;
			
			player.addChatComponentMessage(new ChatComponentText("Press " 
					+ Keyboard.getKeyName(KeyInputHandler.FlanVKeyBinding.V_INVENTORY.keyCode()) + " to open the menu"));
			player.addChatComponentMessage(new ChatComponentText("Press " 
					+ Keyboard.getKeyName(Minecraft.getMinecraft().gameSettings.keyBindSneak.getKeyCode()) + " to get out"));
			player.addChatComponentMessage(new ChatComponentText("Press " 
					+ Keyboard.getKeyName(KeyInputHandler.FlanVKeyBinding.V_CONTROL_SWITCH.keyCode()) + " to switch controls"));
			if(entityType instanceof EntityPlane)
			{
				if(PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasGear)
					player.addChatComponentMessage(new ChatComponentText("Press " 
							+ Keyboard.getKeyName(KeyInputHandler.FlanVKeyBinding.V_GEAR.keyCode()) + " to switch the gear"));
				if(PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasDoor)
					player.addChatComponentMessage(new ChatComponentText("Press " 
							+ Keyboard.getKeyName(KeyInputHandler.FlanVKeyBinding.V_DOOR.keyCode()) + " to switch the doors"));
				if(PlaneType.getPlane(((EntityPlane)entityType).driveableType).mode == EnumPlaneMode.VTOL)
					player.addChatComponentMessage(new ChatComponentText("Press " 
							+ Keyboard.getKeyName(KeyInputHandler.FlanVKeyBinding.V_MODE.keyCode()) + " to switch VTOL mode"));					
				if(PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasWing)
					player.addChatComponentMessage(new ChatComponentText("Press " 
							+ Keyboard.getKeyName(KeyInputHandler.FlanVKeyBinding.V_MODE.keyCode()) + " to switch the wings"));
			}
		}
	}
	
	/** Adds the client side text message regarding mouse control mode switching */
	@Override
	public void changeControlMode(EntityPlayer player)
	{
		if(FlansModClient.flipControlMode())
			player.addChatComponentMessage(new ChatComponentText("Mouse Control mode is now set to " + FlansModClient.controlModeMouse));
	}
	
	/** Whether the player is in mouse control mode for planes. Now the default setting for planes, but it can be deactivated to look around while flying */
	@Override
	public boolean mouseControlEnabled()
	{
		return FlansModClient.controlModeMouse;
	}

	/** Client GUI object getter */
	@Override
	public Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		//Null riding entity, don't open GUI in this case
		if(((ID >= 6 && ID <= 10) || ID == 12) && player.ridingEntity == null)
			return null;
		
		switch(ID) 
		{
			case 0: return new GuiDriveableCrafting(player.inventory, world, x, y, z);
			case 1: return new GuiDriveableRepair(player);
			case 2: return new GuiGunModTable(player.inventory, world);
			case 5: return new GuiGunBox(player.inventory, ((BlockGunBox)world.getBlock(x, y, z)).type, world);
			case 6: return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 0);
			case 7: return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 1);
			case 8: return new GuiDriveableFuel		(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable);
			case 9: return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 2);
			case 10: return new GuiMechaInventory	(player.inventory, world, (EntityMecha)((EntitySeat)player.ridingEntity).driveable);
			case 11: return new GuiArmourBox(player.inventory, ((BlockArmourBox)world.getBlock(x, y, z)).type);
			case 12: return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 3);
			case 13: return new GuiPaintjobTable(player.inventory, world, (TileEntityPaintjobTable)world.getTileEntity(x, y, z));
 		}
 		return null;
 	}
	
	/** Called when the player presses the plane inventory key. Opens menu client side */
	@Override
	public void openDriveableMenu(EntityPlayer player, World world, EntityDriveable driveable)
	{
		FMLClientHandler.instance().getClient().displayGuiScreen(new GuiDriveableMenu(player.inventory, world, driveable));
	}
	
	/**
	 * Helper method that sorts out packages with model name input
	 * For example, the model class "com.flansmod.client.model.mw.ModelMP5"
	 * is referenced in the type file by the string "mw.MP5"
	 */
	private String getModelName(String in)
	{
		if(in.indexOf('.') < 0) return "Model" + in;
		String[] split = in.split("\\.");
		int i = split.length - 1;
		in = "Model" + split[i];
		for(; --i >= 0; in = split[i] + "." + in);
		return in;
	}
	
	/** Generic model loader method for getting model classes and casting them to the required class type */
	@Override
	public <T> T loadModel(String s, String shortName, Class<T> typeClass)
	{
		try { return typeClass.cast(Coder.instance.loadClass(MODEL_DIR + getModelName(s)).getConstructor().newInstance()); }
		catch(Exception e)
		{
			FlansMod.log("Failed to load model: " + shortName + " (" + s + ")");
			if(FlansMod.printStackTrace) e.printStackTrace();
		}
		return null;
	}
	
	/** Sound loading method. Defers to FlansModResourceHandler */
	@Override
	public void loadSound(String contentPack, String type, String sound)
	{ FlansModResourceHandler.getSound(sound); }
	
	/** Checks whether "player" is the current player. Always false on server, since there is no current player */
	@Override
	public boolean isThePlayer(EntityPlayer player)
	{
		return player == FMLClientHandler.instance().getClient().thePlayer;
	}

	@Override
	public EntityPlayer getThePlayer()
	{
		return FMLClientHandler.instance().getClient().thePlayer;
	}
	
	@Override
	public boolean isOnSameTeamClientPlayer(EntityLivingBase entity)
	{
		return FMLClientHandler.instance().getClient().thePlayer.isOnSameTeam(entity);
	}
	
	/* Gun and armour box crafting methods */
	@Override
	public void buyGun(GunBoxType type, InfoType gun)
	{
		FlansMod.getPacketHandler().sendToServer(new PacketBuyWeapon(type, gun));
		FlansModClient.shootTimeRight = 10;
	}
	
	@Override
	public void buyArmour(String shortName, int piece, ArmourBoxType box)
	{
		FlansMod.getPacketHandler().sendToServer(new PacketBuyArmour(box.shortName, shortName, piece));
		FlansModClient.shootTimeRight = 10;
	}
	
	@Override
	public void addItem(EntityPlayer player, int id){
		super.addItem(player, id);
		if(player.worldObj.isRemote)
			FlansMod.getPacketHandler().sendToServer(new PacketGiveItem(57));
	}
	
	@Override
	public void craftDriveable(EntityPlayer player, DriveableType type)
	{
		//Craft it this side (so the inventory updates immediately) and then send a packet to the server so that it is crafted that side too
		super.craftDriveable(player, type);
		if(player.worldObj.isRemote)
			FlansMod.getPacketHandler().sendToServer(new PacketCraftDriveable(type.shortName));
	}
	
	@Override
	public void repairDriveable(EntityPlayer driver, EntityDriveable driving, DriveablePart part)
	{
		//Repair it this side (so the inventory updates immediately) and then send a packet to the server so that it is repaired that side too
		super.repairDriveable(driver, driving, part);
		if(driver.worldObj.isRemote)
			FlansMod.getPacketHandler().sendToServer(new PacketRepairDriveable(part.type));
	}
	
	/** Helper method that returns whether there is a GUI open */
	@Override
	public boolean isScreenOpen() { return Minecraft.getMinecraft().currentScreen != null; }
	
	/** Mecha input getters */
	@Override
	public boolean isKeyDown(int key)
	{
		switch(key)
		{
		case 0 : //Press Forwards
			return keyDown(Minecraft.getMinecraft().gameSettings.keyBindForward.getKeyCode());
			
		case 1 : //Press Backwards
			return keyDown(Minecraft.getMinecraft().gameSettings.keyBindBack.getKeyCode()); 
			
		case 2 : //Press Left
			return keyDown(Minecraft.getMinecraft().gameSettings.keyBindLeft.getKeyCode());
			
		case 3 : //Press Right
			return keyDown(Minecraft.getMinecraft().gameSettings.keyBindRight.getKeyCode()); 

		case 4 : //Press Jump
			return keyDown(Minecraft.getMinecraft().gameSettings.keyBindJump.getKeyCode());
		}
		return false;
	}
	
	/** Helper method that deals with the way Minecraft handles binding keys to the mouse */
	@Override
	public boolean keyDown(int keyCode) { return keyCode < 0 ? Mouse.isButtonDown(keyCode + 100) : Keyboard.isKeyDown(keyCode); }
	
	@Override
	public void spawnParticle(String s,
			double x, double y, double z,
			double mx, double my, double mz)
	{
		try
		{
			this.doSpawnParticle(s, x, y, z, mx, my, mz);
		}
		catch (Throwable throwable)
		{
			throwable.printStackTrace();
		}
	}
	
	private static EntityFX doSpawnParticle(String p_72726_1_, double p_72726_2_, double p_72726_4_, double p_72726_6_, double p_72726_8_, double p_72726_10_, double p_72726_12_)
	{
		Minecraft mc = Minecraft.getMinecraft();
		World theWorld = mc.theWorld;
		if (mc != null && mc.renderViewEntity != null && mc.effectRenderer != null)
		{
			int i = mc.gameSettings.particleSetting;

			if (i == 1 && theWorld.rand.nextInt(3) == 0)
			{
				i = 2;
			}

			double d6 = mc.renderViewEntity.posX - p_72726_2_;
			double d7 = mc.renderViewEntity.posY - p_72726_4_;
			double d8 = mc.renderViewEntity.posZ - p_72726_6_;
			EntityFX entityfx = null;

			if (p_72726_1_.equals("hugeexplosion"))
			{
				mc.effectRenderer.addEffect(entityfx = new EntityHugeExplodeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_));
			}
			
			else if (p_72726_1_.equals("largeexplode"))
			{
				mc.effectRenderer.addEffect(entityfx = new EntityLargeExplodeFX(mc.renderEngine, theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_));
			}
			
			else if (p_72726_1_.equals("fireworksSpark"))
			{
				mc.effectRenderer.addEffect(entityfx = new EntityFireworkSparkFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, mc.effectRenderer));
			}

			if (entityfx != null)
			{
				return (EntityFX)entityfx;
			}
			else
			{
				double d9 = 160.0D;

				if (d6 * d6 + d7 * d7 + d8 * d8 > d9 * d9)
				{
					return null;
				}
				else if (i > 1)
				{
					return null;
				}
				else
				{
					// FlansMod only
					if (p_72726_1_.equals("flansmod.flare"))
					{
						entityfx = new EntityFlare(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}

					if (p_72726_1_.equals("flansmod.smoker"))
					{
						entityfx = new EntitySmokeGrenade(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("flansmod.flash"))
					{
						entityfx = new EntityFlash(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("flansmod.smokeburst"))
					{
						entityfx = new EntitySmokeBurst(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("flansmod.bigsmoke"))
					{
						entityfx = new EntityBigSmoke(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("flansmod.debris1"))
					{
						entityfx = new EntityDebris1(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("flansmod.fmflame"))
					{
						entityfx = new EntityFMFlame(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("flansmod.fmtracer"))
					{
						entityfx = new EntityFMTracer(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("flansmod.fmtracergreen"))
					{
						entityfx = new EntityFMTracerGreen(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("flansmod.fmtracerred"))
					{
						entityfx = new EntityFMTracerRed(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					
					if (p_72726_1_.equals("flansmod.afterburn"))
					{
						entityfx = new EntityAfterburn(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("flansmod.fmsmoke"))
					{
						entityfx = new EntityFMSmoke(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("flansmod.rocketexhaust"))
					{
						entityfx = new EntityRocketexhaust(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					
					if (p_72726_1_.equals("bubble"))
					{
						entityfx = new EntityBubbleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("suspended"))
					{
						entityfx = new EntitySuspendFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("depthsuspend"))
					{
						entityfx = new EntityAuraFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("townaura"))
					{
						entityfx = new EntityAuraFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("crit"))
					{
						entityfx = new EntityCritFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("magicCrit"))
					{
						entityfx = new EntityCritFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
						((EntityFX)entityfx).setRBGColorF(((EntityFX)entityfx).getRedColorF() * 0.3F, ((EntityFX)entityfx).getGreenColorF() * 0.8F, ((EntityFX)entityfx).getBlueColorF());
						((EntityFX)entityfx).nextTextureIndexX();
					}
					else if (p_72726_1_.equals("smoke"))
					{
						entityfx = new EntitySmokeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("mobSpell"))
					{
						entityfx = new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, 0.0D, 0.0D, 0.0D);
						((EntityFX)entityfx).setRBGColorF((float)p_72726_8_, (float)p_72726_10_, (float)p_72726_12_);
					}
					else if (p_72726_1_.equals("mobSpellAmbient"))
					{
						entityfx = new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, 0.0D, 0.0D, 0.0D);
						((EntityFX)entityfx).setAlphaF(0.15F);
						((EntityFX)entityfx).setRBGColorF((float)p_72726_8_, (float)p_72726_10_, (float)p_72726_12_);
					}
					else if (p_72726_1_.equals("spell"))
					{
						entityfx = new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("instantSpell"))
					{
						entityfx = new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
						((EntitySpellParticleFX)entityfx).setBaseSpellTextureIndex(144);
					}
					else if (p_72726_1_.equals("witchMagic"))
					{
						entityfx = new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
						((EntitySpellParticleFX)entityfx).setBaseSpellTextureIndex(144);
						float f = theWorld.rand.nextFloat() * 0.5F + 0.35F;
						((EntityFX)entityfx).setRBGColorF(1.0F * f, 0.0F * f, 1.0F * f);
					}
					else if (p_72726_1_.equals("note"))
					{
						entityfx = new EntityNoteFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("portal"))
					{
						entityfx = new EntityPortalFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("enchantmenttable"))
					{
						entityfx = new EntityEnchantmentTableParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("explode"))
					{
						entityfx = new EntityExplodeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("flame"))
					{
						entityfx = new EntityFlameFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("lava"))
					{
						entityfx = new EntityLavaFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_);
					}
					else if (p_72726_1_.equals("footstep"))
					{
						entityfx = new EntityFootStepFX(mc.renderEngine, theWorld, p_72726_2_, p_72726_4_, p_72726_6_);
					}
					else if (p_72726_1_.equals("splash"))
					{
						entityfx = new EntitySplashFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("wake"))
					{
						entityfx = new EntityFishWakeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("largesmoke"))
					{
						entityfx = new EntitySmokeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, 2.5F);
					}
					else if (p_72726_1_.equals("cloud"))
					{
						entityfx = new EntityCloudFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("reddust"))
					{
						entityfx = new EntityReddustFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, (float)p_72726_8_, (float)p_72726_10_, (float)p_72726_12_);
					}
					else if (p_72726_1_.equals("snowballpoof"))
					{
						entityfx = new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, Items.snowball);
					}
					else if (p_72726_1_.equals("dripWater"))
					{
						entityfx = new EntityDropParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, Material.water);
					}
					else if (p_72726_1_.equals("dripLava"))
					{
						entityfx = new EntityDropParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, Material.lava);
					}
					else if (p_72726_1_.equals("snowshovel"))
					{
						entityfx = new EntitySnowShovelFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("slime"))
					{
						entityfx = new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, Items.slime_ball);
					}
					else if (p_72726_1_.equals("heart"))
					{
						entityfx = new EntityHeartFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
					}
					else if (p_72726_1_.equals("angryVillager"))
					{
						entityfx = new EntityHeartFX(theWorld, p_72726_2_, p_72726_4_ + 0.5D, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
						((EntityFX)entityfx).setParticleTextureIndex(81);
						((EntityFX)entityfx).setRBGColorF(1.0F, 1.0F, 1.0F);
					}
					else if (p_72726_1_.equals("happyVillager"))
					{
						entityfx = new EntityAuraFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
						((EntityFX)entityfx).setParticleTextureIndex(82);
						((EntityFX)entityfx).setRBGColorF(1.0F, 1.0F, 1.0F);
					}
					else
					{
						int k;
						String[] astring;

						if (p_72726_1_.startsWith("iconcrack_"))
						{
							astring = p_72726_1_.split("_", 3);
							int j = Integer.parseInt(astring[1]);

							if (astring.length > 2)
							{
								k = Integer.parseInt(astring[2]);
								entityfx = new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, Item.getItemById(j), k);
							}
							else
							{
								entityfx = new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, Item.getItemById(j), 0);
							}
						}
						else
						{
							Block block;

							if (p_72726_1_.startsWith("blockcrack_"))
							{
								astring = p_72726_1_.split("_", 3);
								block = Block.getBlockById(Integer.parseInt(astring[1]));
								k = Integer.parseInt(astring[2]);
								entityfx = (new EntityDiggingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, block, k)).applyRenderColor(k);
							}
							else if (p_72726_1_.startsWith("blockdust_"))
							{
								astring = p_72726_1_.split("_", 3);
								block = Block.getBlockById(Integer.parseInt(astring[1]));
								k = Integer.parseInt(astring[2]);
								entityfx = (new EntityBlockDustFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, block, k)).applyRenderColor(k);
							}
						}
					}

					if (entityfx != null)
					{
						mc.effectRenderer.addEffect((EntityFX)entityfx);
					}

					return (EntityFX)entityfx;
				}
			}
		}
		else
		{
			return null;
		}
	}

	public float getMouseSensitivity()
	{
		return Minecraft.getMinecraft().gameSettings.mouseSensitivity;
	}
}
