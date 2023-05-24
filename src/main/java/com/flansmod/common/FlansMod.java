package com.flansmod.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.RenderFlan;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityWheel;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.ItemMecha;
import com.flansmod.common.driveables.mechas.ItemMechaAddon;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.eventhandlers.PlayerDeathEventListener;
import com.flansmod.common.eventhandlers.PlayerLoginEventListener;
import com.flansmod.common.guns.AAGunType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.boxes.BlockGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.network.PacketGunAttachment;
import com.flansmod.common.network.PacketHandler;
import com.flansmod.common.paintjob.BlockPaintjobTable;
import com.flansmod.common.paintjob.TileEntityPaintjobTable;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.BlockArmourBox;
import com.flansmod.common.teams.BlockSpawner;
import com.flansmod.common.teams.ChunkLoadingHandler;
import com.flansmod.common.teams.CommandTeams;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.teams.EntityTeamItem;
import com.flansmod.common.teams.ItemFlagpole;
import com.flansmod.common.teams.ItemOpStick;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.teams.TileEntitySpawner;
import com.flansmod.common.tools.EntityParachute;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.material.Material;
import net.minecraft.command.CommandHandler;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;

@Mod(modid = FlansMod.MODID, name = "Flan's mod Ultimate 1.1 Modified", version = "@VERSION@", 
		acceptableRemoteVersions = "@ALLOWEDVERSIONS@", guiFactory = "com.flansmod.client.gui.config.ModGuiFactory")
public final class FlansMod
{
	/** Universe randomizer */
	public static final Random rand = new Random();
	
	/** whether you want to ban some of the functions of MC itself */
	public static boolean allowThirdPersonView = true, allowHideGUI = true, allowShowHitBox = true, atHitBoxTest = true;
	public static int flashRefreshRate = 3, preLockSlideTime = 10;
	public static float shootAnimationRange = 150F, chargeAnimationRange = 50F, forceGammaSetting = -1F;
	public static float isAimPhase = 0.9F, mouseSensitivityMult = 0.8F, timeToHoldBreath = 0.8F, hurryBreathCycle = 4F, hurryBreathAmplitude = 2.5F;
	public static int maxLayers = 8, maxAttachments = 5, maxSights = 8, numScopeTextures = 3, numSmoke = 8, numCase = 8, holdBreathKey = org.lwjgl.input.Keyboard.KEY_LSHIFT;
	public static boolean enableCasing = false, onlyLoadCaseWhenManualMode = true, switchCoSightWhenNoSight = true, loopWhenChangeZoom = false, zoomWithWheel = true, 
						  renderGunEntityIn2D = false, lineLineTriCoorTest = false, avoidSprintWhenAim = true, viewBobbing = true;
	public static float weightCapacity = 100F, volumeCapacity = 100F, 
						maxDelayToRecoverStamina = 80F, minDelayToRecoverStamina = 15F, recoverStaminaDelay = 0.8F, 
						breathRecoverStaminaDelay = 0.6F, minAirWhenMove = 0.2F, canBreathAir = 0.2F, 
						staminaRecoverAmount = 0.004F, walkStaminaRecoverAmount = 0.002F, airRecoverAmount = 0.002F, walkAirRecoverAmount = 0.0013F, 
						breathAirDrop = 0.005F, breathStaminaDrop = 0.002F, 
						sprintStaminaDrop = 0.003F, jumpStaminaDrop = 0.01F, walkJumpStaminaDrop = 0.03F, sprintJumpStaminaDrop = 0.05F, 
						jumpRecoverStaminaDelay = 7F, walkJumpRecoverStaminaDelay = 12F, sprintJumpRecoverStaminaDelay = 20F, 
						sprintAirDrop = 0.004F, jumpAirDrop = 0.012F, walkJumpAirDrop = 0.035F, sprintJumpAirDrop = 0.06F;
	public static float decreaseRecoilPitch = 0.8F, decreaseRecoilYaw = 0.8F, decreaseRecoilShake = 0.8F;
	public static float headDamageMult = 2F, armDamageMult = 0.6F;
	public static int scopeGlassResolution = 256;
	// Config category names
	public static final String ADVANCED_SERVER_SETTINGS = "Advanced Server Settings", 
			SERVER_SETTINGS = "Server Settings", CLIENT_SETTINGS = "Client Settings";
	//Core mod stuff
	public static boolean DEBUG = false;
	public static Configuration configFile;
	public static final String MODID = "flansmod";
	@Instance(MODID)
	public static FlansMod INSTANCE;
	public static boolean printDebugLog = true, printStackTrace = true;
	public static int numPlayerSnapshots = 20;
	public static int noticeSpawnKillTime = 10;
	public static int breakableArmor = 0, defaultArmorDurability = 500;
	public static boolean crosshairEnable = false;
	public static boolean hitCrossHairEnable = false;
	public static boolean hdHitCrosshair = false;
	public static boolean addGunpowderRecipe = true;
	public static boolean addAllPaintjobsToCreative = false;
	@SidedProxy(clientSide = "com.flansmod.client.ClientProxy", serverSide = "com.flansmod.common.CommonProxy")
	public static CommonProxy proxy;
	public static int ticker = 0;
	public static File flanDir;
	public static final float soundRange = 50F;
	public static final float driveableUpdateRange = 400F;
	
	public static int armourSpawnRate = 20;
	
	/** The spectator team. Moved here to avoid a concurrent modification error */
	public static Team spectators = new Team("spectators", "Spectators", 0x404040, '7');
	
	//Handlers
	public static final PacketHandler packetHandler = new PacketHandler();
	public static final PlayerHandler playerHandler = new PlayerHandler();
	public static final TeamsManager teamsManager = new TeamsManager();
	public static final CommonTickHandler tickHandler = new CommonTickHandler();
	public static FlansHooks hooks = new FlansHooks();
	
	//Items and creative tabs
	public static BlockFlansWorkbench workbench;
	public static BlockPaintjobTable paintjobTable;
	public static BlockSpawner spawner;
	public static ItemOpStick opStick;
	public static ItemFlagpole flag;
	public static ArrayList<BlockGunBox> gunBoxBlocks = new ArrayList<BlockGunBox>();
	public static ArrayList<ItemBullet> bulletItems = new ArrayList<ItemBullet>();
	public static ArrayList<ItemGun> gunItems = new ArrayList<ItemGun>();
	public static ArrayList<ItemAttachment> attachmentItems = new  ArrayList<ItemAttachment>();
	public static ArrayList<ItemPart> partItems = new ArrayList<ItemPart>();
	public static ArrayList<ItemPlane> planeItems = new ArrayList<ItemPlane>();
	public static ArrayList<ItemVehicle> vehicleItems = new ArrayList<ItemVehicle>();
	public static ArrayList<ItemMechaAddon> mechaToolItems = new ArrayList<ItemMechaAddon>();
	public static ArrayList<ItemMecha> mechaItems = new ArrayList<ItemMecha>();
	public static ArrayList<ItemAAGun> aaGunItems = new ArrayList<ItemAAGun>();
	public static ArrayList<ItemGrenade> grenadeItems = new ArrayList<ItemGrenade>();
	public static ArrayList<ItemTool> toolItems = new ArrayList<ItemTool>();
	public static ArrayList<ItemTeamArmour> armourItems = new ArrayList<ItemTeamArmour>();
	public static ArrayList<BlockArmourBox> armourBoxBlocks = new ArrayList<BlockArmourBox>();
	public static CreativeTabFlan tabFlanGuns = new CreativeTabFlan(0), tabFlanDriveables = new CreativeTabFlan(1),
			tabFlanParts = new CreativeTabFlan(2), tabFlanTeams = new CreativeTabFlan(3), tabFlanMechas = new CreativeTabFlan(4);
	
	/** The mod pre-initialiser method */
	@EventHandler
	public void onPreInit(FMLPreInitializationEvent event)
	{
		log("Preinitialising Flan's mod.");
		configFile = new Configuration(event.getSuggestedConfigurationFile());
		syncConfig(event.getSide());

		//TODO : Load properties
		//configuration = new Configuration(event.getSuggestedConfigurationFile());
		//loadProperties();

		if(!(flanDir = new File(event.getModConfigurationDirectory().getParentFile(), "Flan/")).exists())
		{
			log("Content pack folder not found. Creating empty folder.");
			log("You should get some content packs and put them in the Flan folder.");
			flanDir.mkdirs();
			flanDir.mkdir();
		}

		//Set up mod blocks and items
		workbench = (BlockFlansWorkbench)(new BlockFlansWorkbench(1, 0).setBlockName("flansWorkbench").setBlockTextureName("flansWorkbench"));
		GameRegistry.registerBlock(workbench, ItemBlockManyNames.class, "flansWorkbench");
		GameRegistry.addRecipe(new ItemStack(workbench, 1, 0), "BBB", "III", "III", 'B', Items.bowl, 'I', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(workbench, 1, 1), "ICI", "III", 'C', Items.cauldron, 'I', Items.iron_ingot);
		opStick = new ItemOpStick();
		GameRegistry.registerItem(opStick, "opStick", MODID);
		flag = (ItemFlagpole)(new ItemFlagpole().setUnlocalizedName("flagpole"));
		GameRegistry.registerItem(flag, "flagpole", MODID);
		spawner = (BlockSpawner)(new BlockSpawner(Material.iron).setBlockName("teamsSpawner").setBlockUnbreakable().setResistance(1000000F));
		GameRegistry.registerBlock(spawner, ItemBlockManyNames.class, "teamsSpawner");
		GameRegistry.registerTileEntity(TileEntitySpawner.class, "teamsSpawner");
		
		paintjobTable = new BlockPaintjobTable();
		GameRegistry.registerBlock(paintjobTable, "paintjobTable");
		GameRegistry.registerTileEntity(TileEntityPaintjobTable.class, MODID);
		
		proxy.registerRenderers();

		// Read content packs
		readContentPacks(event);
		
		if(gunItems.size() >= 1)
			MinecraftForge.EVENT_BUS.register(gunItems.get(0));

		//Do proxy loading
		proxy.load();
		//Force Minecraft to reload all resources in order to load content pack resources.
		proxy.forceReload();

		log("Preinitializing complete.");
	}

	/** The mod initialiser method */
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		log("Initialising Flan's Mod.");

		//Initialising handlers
		packetHandler.initialise();
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new CommonGuiHandler());

		// Recipes
		for(InfoType type : InfoType.infoTypes) type.addRecipe();
		if(addGunpowderRecipe)
		{
			ItemStack charcoal = new ItemStack(Items.coal, 1, 1);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder), charcoal, charcoal, charcoal, new ItemStack(Items.glowstone_dust));
		}
		log("Loaded recipes.");

		//Register teams mod entities
		EntityRegistry.registerGlobalEntityID(EntityFlagpole.class, "Flagpole", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFlagpole.class, "Flagpole", 93, this, 40, 5, true);
		EntityRegistry.registerGlobalEntityID(EntityFlag.class, "Flag", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFlag.class, "Flag", 94, this, 40, 5, true);
		EntityRegistry.registerGlobalEntityID(EntityTeamItem.class, "TeamsItem", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityTeamItem.class, "TeamsItem", 97, this, 100, 10000, true);
		EntityRegistry.registerGlobalEntityID(EntityGunItem.class, "GunItem", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityGunItem.class, "GunItem", 98, this, 100, 20, true);

		//Register driveables
		EntityRegistry.registerGlobalEntityID(EntityPlane.class, "Plane", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityPlane.class, "Plane", 90, this, 200, 3, true);
		EntityRegistry.registerGlobalEntityID(EntityVehicle.class, "Vehicle", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityVehicle.class, "Vehicle", 95, this, 400, 10, true);
		EntityRegistry.registerGlobalEntityID(EntitySeat.class, "Seat", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntitySeat.class, "Seat", 99, this, 250, 10, true);
		EntityRegistry.registerGlobalEntityID(EntityWheel.class, "Wheel", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityWheel.class, "Wheel", 103, this, 200, 20, true);
		EntityRegistry.registerGlobalEntityID(EntityParachute.class, "Parachute", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityParachute.class, "Parachute", 101, this, 40, 20, false);
		EntityRegistry.registerGlobalEntityID(EntityMecha.class, "Mecha", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityMecha.class, "Mecha", 102, this, 250, 20, false);

		//Register bullets and grenades
		EntityRegistry.registerGlobalEntityID(EntityBullet.class, "Bullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", 96, this, 200, 20, false);
		EntityRegistry.registerGlobalEntityID(EntityGrenade.class, "Grenade", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityGrenade.class, "Grenade", 100, this, 40, 100, true);

		//Register MGs and AA guns
		EntityRegistry.registerGlobalEntityID(EntityMG.class, "MG", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityMG.class, "MG", 91, this, 40, 5, true);
		EntityRegistry.registerGlobalEntityID(EntityAAGun.class, "AAGun", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityAAGun.class, "AAGun", 92, this, 40, 500, false);

		//Register the chunk loader
		//TODO : Re-do chunk loading
		ForgeChunkManager.setForcedChunkLoadingCallback(this, new ChunkLoadingHandler());

		//Config
		FMLCommonHandler.instance().bus().register(INSTANCE);
		//Starting the EventListener
		new PlayerDeathEventListener();
		new PlayerLoginEventListener();
		//new ServerTickEvent();
		log("Loading complete.");
	}

	/** The mod post-initialisation method */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		packetHandler.postInitialise();

		hooks.hook();
		
		if(FMLCommonHandler.instance().getSide().isClient()) RenderFlan.postInit();
		/* TODO : ICBM
		isICBMSentryLoaded = Loader.instance().isModLoaded("ICBM|Sentry");

		log("ICBM hooking complete.");
		*/
	}

	@SubscribeEvent
	public void playerDrops(PlayerDropsEvent event)
	{
		for(int i = event.drops.size(); --i >= 0; )
		{
			EntityItem ent = event.drops.get(i);
			InfoType type = InfoType.getType(ent.getEntityItem());
			if(type != null && !type.canDrop) event.drops.remove(i);
		}
	}

	/*@SubscribeEvent
	public void onItemToss(ItemTossEvent event)
	{
		InfoType type = InfoType.getType(event.entityItem.getEntityItem());
		if(type != null && !type.canDrop) event.setCanceled(true);
	}*/
	
	/** Teams command register method */
	@EventHandler
	public void registerCommand(FMLServerStartedEvent e)
	{
		CommandHandler handler = ((CommandHandler)FMLCommonHandler.instance().getSidedDelegate().getServer().getCommandManager());
		handler.registerCommand(new CommandTeams());
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs)
	{ if(eventArgs.modID.equals(MODID)) syncConfig(Side.CLIENT); }

	@SubscribeEvent
	public void onLivingSpecialSpawn(LivingSpawnEvent.CheckSpawn event)
	{
		int chance = event.world.rand.nextInt(101);

		if(chance < armourSpawnRate && (event.entityLiving instanceof EntityZombie || event.entityLiving instanceof EntitySkeleton))
		{
			if(event.world.rand.nextBoolean() && ArmourType.armours.size() > 0)
			{
				//Give a completely random piece of armour
				ArmourType armour = ArmourType.armours.get(event.world.rand.nextInt(ArmourType.armours.size()));
				if(armour != null && armour.type != 2)
					event.entityLiving.setCurrentItemOrArmor(armour.type + 1, new ItemStack(armour.item));
			}
			else if(Team.teams.size() > 0)
			{
				//Give a random set of armour
				Team team = Team.teams.get(event.world.rand.nextInt(Team.teams.size()));
				if(team.hat != null)
					event.entityLiving.setCurrentItemOrArmor(1, team.hat.copy());
				if(team.chest != null)
					event.entityLiving.setCurrentItemOrArmor(2, team.chest.copy());
				//if(team.legs != null)
				//	event.entityLiving.setCurrentItemOrArmor(3, team.legs.copy());
				if(team.shoes != null)
					event.entityLiving.setCurrentItemOrArmor(4, team.shoes.copy());
			}
		}
	}
	
	private static String getTypeName(File typeFile)
	{
		String fName = typeFile.getName();
		int i = fName.indexOf('.');
		return i < 0 ? fName : fName.substring(0, i);
	}
	
	/** Reads type files from all content packs */
	private void getTypeFiles(List<File> contentPackFiles) // TODO: mark 2021-6-16
	{
		for(File packFile : contentPackFiles)
		{
			if(packFile.isDirectory())
			{
				File packDir;
				for(EnumType type : EnumType.values())
				{
					if(!(packDir = new File(packFile, type.folderName)).exists()) continue;
					for(File file : packDir.listFiles())
					{
						try
						{
							BufferedReader reader = new BufferedReader(new FileReader(file));
							TypeFile typeFile = new TypeFile(type, getTypeName(file), packFile.getName());
							for(String line; (line = reader.readLine()) != null; typeFile.lines.add(line));
							reader.close();
						}
						catch(IOException e) { e.printStackTrace(); }
					}
				}
			}
			else if(packFile.getName().endsWith(".ssf"))
			{
				//TODO
			}
			else
			{
				try
				{
					ZipInputStream zipStream = new ZipInputStream(new FileInputStream(packFile));
					BufferedReader reader = new BufferedReader(new InputStreamReader(zipStream));
					
					for(ZipEntry zipEntry = zipStream.getNextEntry(); (zipEntry = zipStream.getNextEntry()) != null; )
					{
						TypeFile typeFile = null;
						for(EnumType type : EnumType.values())
						{
							if(zipEntry.getName().startsWith(type.folderName + "/") 
									&& zipEntry.getName().split(type.folderName + "/").length > 1 
									&& zipEntry.getName().split(type.folderName + "/")[1].length() > 0)
							{
								String[] splitName = zipEntry.getName().split("/");
								typeFile = new TypeFile(type, splitName[splitName.length - 1].split("\\.")[0], packFile.getName());
							}
						}
						if(typeFile == null) continue;
						for(String s; (s = reader.readLine()) != null; typeFile.lines.add(s));
					}
					reader.close();
					zipStream.close();
				}
				catch(IOException e) { e.printStackTrace(); }
			}
		}
	}

	/** Content pack reader method */
	private void readContentPacks(FMLPreInitializationEvent event)
	{
		// Icons, Skins, Models
		// Get the classloader in order to load the images
		List<File> contentPacks = proxy.getContentList();

		getTypeFiles(contentPacks);

		for(EnumType type : EnumType.values())
		{
			for(TypeFile typeFile : TypeFile.files.get(type))
			{
				try
				{
					InfoType infoType = (type.typeClass.getConstructor(TypeFile.class).newInstance(typeFile));
					infoType.read(typeFile);
					switch(type)
					{
						case bullet: bulletItems.add((ItemBullet)new ItemBullet((BulletType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case attachment: attachmentItems.add((ItemAttachment)new ItemAttachment((AttachmentType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case gun: gunItems.add((ItemGun)new ItemGun((GunType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case grenade: grenadeItems.add((ItemGrenade)new ItemGrenade((GrenadeType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case part: partItems.add((ItemPart)new ItemPart((PartType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case plane: planeItems.add((ItemPlane)new ItemPlane((PlaneType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case vehicle: vehicleItems.add((ItemVehicle)new ItemVehicle((VehicleType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case aa: aaGunItems.add((ItemAAGun)new ItemAAGun((AAGunType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case mechaItem: mechaToolItems.add((ItemMechaAddon)new ItemMechaAddon((MechaItemType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case mecha: mechaItems.add((ItemMecha)new ItemMecha((MechaType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case tool: toolItems.add((ItemTool)new ItemTool((ToolType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case box: gunBoxBlocks.add((BlockGunBox)new BlockGunBox((GunBoxType)infoType).setBlockName(infoType.shortName)); break;
						case armour: armourItems.add((ItemTeamArmour)new ItemTeamArmour((ArmourType)infoType).setUnlocalizedName(infoType.shortName)); break;
						case armourBox: armourBoxBlocks.add((BlockArmourBox)new BlockArmourBox((ArmourBoxType)infoType).setBlockName(infoType.shortName)); break;
						case playerClass: case team: break;
						default : log("Unrecognised type for " + infoType.shortName); break;
					}
				}
				catch(Exception e)
				{
					log("Failed to load " + type.name() + ": " + typeFile.name);
					if(printStackTrace) e.printStackTrace();
				}
			}
			log("Loaded " + type.name() + ".");
		}
		Team.spectators = spectators;
	}

	public static PacketHandler getPacketHandler() { return INSTANCE.packetHandler; }
	
	/** Read mod config */
	public static void syncConfig(Side side) 
	{
		// Advanced Server Settings
		printDebugLog = configFile.getBoolean("PrintDebugLog", ADVANCED_SERVER_SETTINGS, printDebugLog, "Whether to print debug log");
		printStackTrace = configFile.getBoolean("PrintStackTrace", ADVANCED_SERVER_SETTINGS, printStackTrace, "Print stack trace, provide more detailed information to help debug");
		numPlayerSnapshots = configFile.getInt("NumPlayerSnapshots", ADVANCED_SERVER_SETTINGS, numPlayerSnapshots, 0, 100, "How many playerSnapshots the server will storage for each player");
		TeamsManager.bulletSnapshotMin = configFile.getInt("BltSS_Min", ADVANCED_SERVER_SETTINGS,  0, 0, 100, "<bullet hit detect lag compensation> Base index of playerSnapshot to use");
		TeamsManager.bulletSnapshotDivisor = configFile.getInt("BltSS_Divisor", ADVANCED_SERVER_SETTINGS, 50, 0, 1000, "<bullet hit detect lag compensation> Index of snapShot to use = BltSS_Min + playerPing / BltSS_Divisor");
		
		// Server Gaming Settings
		allowHideGUI = configFile.getBoolean("AllowHideGUI", SERVER_SETTINGS, allowHideGUI, "Whether the player is allowed to use F1 in this server");
		allowThirdPersonView = configFile.getBoolean("AllowThirdPerson", SERVER_SETTINGS, allowThirdPersonView, "Whether the player is allowed to use F5 in this server");
		allowShowHitBox = configFile.getBoolean("AllowShowHitBox", SERVER_SETTINGS, allowShowHitBox, "Whether the player is allowed to use F3+B in this server");
		forceGammaSetting = configFile.getFloat("ForceGammaSetting", SERVER_SETTINGS, forceGammaSetting, -1F, 1000F, "value < 0 = no request on this setting, otherwise force every player to use this value as gamma setting");
		isAimPhase = configFile.getFloat("IsAimPhase", SERVER_SETTINGS, isAimPhase, 0F, 1F, "Time Ratio when player is considered 'is aiming'");
		maxLayers = configFile.getInt("MaxLayers", SERVER_SETTINGS, maxLayers, 1, 100, "Max layers of attachments that can be added to a gun");
		maxAttachments = configFile.getInt("MaxAttachments", SERVER_SETTINGS, maxAttachments, 1, 100, "Max num of attachments that can be added to a single gun slot or picatinny rail");
		weightCapacity = configFile.getFloat("WeightCapacity", SERVER_SETTINGS, 100F, 0F, 10000F, "Default max weight that a player can carry");
		volumeCapacity = configFile.getFloat("VolumeCapacity", SERVER_SETTINGS, 100F, 0F, 10000F, "Default max volume that a player can carry");
		maxDelayToRecoverStamina = configFile.getFloat("MaxDelayToRecoverStamina", SERVER_SETTINGS, maxDelayToRecoverStamina, 0F, 10000F, "Max delay in ticks before starting to recover stamina");
		minDelayToRecoverStamina = configFile.getFloat("MinDelayToRecoverStamina", SERVER_SETTINGS, minDelayToRecoverStamina, 0F, 10000F, "Min delay in ticks before starting to recover stamina");
		recoverStaminaDelay = configFile.getFloat("RecoverStaminaDelay", SERVER_SETTINGS, recoverStaminaDelay, 0F, 10000F, "Increasement of delay before recovering stamina each tick sprinting");
		breathRecoverStaminaDelay = configFile.getFloat("BreathRecoverStaminaDelay", SERVER_SETTINGS, breathRecoverStaminaDelay, 0F, 10000F, "Increasement of delay before recovering stamina each tick holding breath");
		minAirWhenMove = configFile.getFloat("MinAirWhenMove", SERVER_SETTINGS, minAirWhenMove, 0F, 10000F, "Min air that you can keep when sprinting");
		canBreathAir = configFile.getFloat("CanBreathAir", SERVER_SETTINGS, canBreathAir, 0F, 10000F, "Min air that you can re-hold breath once air left below this value");
		staminaRecoverAmount = configFile.getFloat("StaminaRecoverAmount", SERVER_SETTINGS, staminaRecoverAmount, 0F, 10000F, "Amount of stamina to recover each tick when standing but not walking");
		walkStaminaRecoverAmount = configFile.getFloat("WalkStaminaRecoverAmount", SERVER_SETTINGS, walkStaminaRecoverAmount, 0F, 10000F, "Amount of stamina to recover each tick when walking");
		airRecoverAmount = configFile.getFloat("AirRecoverAmount", SERVER_SETTINGS, airRecoverAmount, 0F, 10000F, "Amount of air to recover each tick when standing but not walking");
		walkAirRecoverAmount = configFile.getFloat("WalkAirRecoverAmount", SERVER_SETTINGS, walkAirRecoverAmount, 0F, 10000F, "Amount of air to recover each tick when walking");
		breathAirDrop = configFile.getFloat("BreathAirDrop", SERVER_SETTINGS, breathAirDrop, 0F, 10000F, "Amount of air to decrease each tick holding breath");
		breathStaminaDrop = configFile.getFloat("BreathStaminaDrop", SERVER_SETTINGS, breathStaminaDrop, 0F, 10000F, "Amount of stamina to decrease each tick holding breath");
		sprintStaminaDrop = configFile.getFloat("SprintStaminaDrop", SERVER_SETTINGS, sprintStaminaDrop, 0F, 10000F, "Amount of stamina to decrease each tick sprinting");
		jumpStaminaDrop = configFile.getFloat("JumpStaminaDrop", SERVER_SETTINGS, jumpStaminaDrop, 0F, 10000F, "Amount of stamina to decrease when jump while standing");
		walkJumpStaminaDrop = configFile.getFloat("WalkJumpStaminaDrop", SERVER_SETTINGS, walkJumpStaminaDrop, 0F, 10000F, "Amount of stamina to decrease when jump while walking");
		sprintJumpStaminaDrop = configFile.getFloat("SprintJumpStaminaDrop", SERVER_SETTINGS, sprintJumpStaminaDrop, 0F, 10000F, "Amount of stamina to decrease when jump while sprinting");
		jumpRecoverStaminaDelay = configFile.getFloat("JumpRecoverStaminaDelay", SERVER_SETTINGS, jumpRecoverStaminaDelay, 0F, 10000F, "Increasement of delay before recovering stamina after jump while standing");
		walkJumpRecoverStaminaDelay = configFile.getFloat("WalkJumpRecoverStaminaDelay", SERVER_SETTINGS, walkJumpRecoverStaminaDelay, 0F, 10000F, "Increasement of delay before recovering stamina after jump while walking");
		sprintJumpRecoverStaminaDelay = configFile.getFloat("SprintJumpRecoverStaminaDelay", SERVER_SETTINGS, sprintJumpRecoverStaminaDelay, 0F, 10000F, "Increasement of delay before recovering stamina after jump while sprinting");
		sprintAirDrop = configFile.getFloat("SprintAirDrop", SERVER_SETTINGS, sprintAirDrop, 0F, 10000F, "Amount of air to decrease when sprinting");
		jumpAirDrop = configFile.getFloat("JumpAirDrop", SERVER_SETTINGS, jumpAirDrop, 0F, 10000F, "Amount of air to decrease when jump while standing");
		walkJumpAirDrop = configFile.getFloat("WalkJumpAirDrop", SERVER_SETTINGS, walkJumpAirDrop, 0F, 10000F, "Amount of air to decrease when jump while walking");
		sprintJumpAirDrop = configFile.getFloat("SprintJumpAirDrop", SERVER_SETTINGS, sprintJumpAirDrop, 0F, 10000F, "Amount of air to decrease when jump while sprinting");
		decreaseRecoilPitch = configFile.getFloat("DecreaseRecoilPitch", SERVER_SETTINGS, 0.8F, 0F, 1F, "Multiplier on recoil pitch when player is crouching");
		decreaseRecoilYaw = configFile.getFloat("DecreaseRecoilYaw", SERVER_SETTINGS, 0.8F, 0F, 1F, "Multiplier on recoil Yaw when player is crouching");
		decreaseRecoilShake = configFile.getFloat("DecreaseRecoilShake", SERVER_SETTINGS, 0.8F, 0F, 1024F, "Multiplier on recoil Shake when player is crouching");
		headDamageMult = configFile.getFloat("HeadDamageMult", SERVER_SETTINGS, 2F, 0F, 1000F, "Damage multiplier when bullet hit player on head");
		armDamageMult = configFile.getFloat("ArmDamageMult", SERVER_SETTINGS, 0.6F, 0F, 1000F, "Damage multiplier when bullet hit player on arm");
		noticeSpawnKillTime = configFile.getInt("NoticeSpawnKillTime", SERVER_SETTINGS,  10, 0, 600, "Time to display player kill notice on the right bottom of the screen in seconds");
		enableCasing = configFile.getBoolean("EnableCasing", SERVER_SETTINGS, false, "Whether to generate bullet case on shot");
		hitCrossHairEnable = configFile.getBoolean("EnableHitmarkers", SERVER_SETTINGS, false, "Whether to show hitmark when player hit another player");
		crosshairEnable = configFile.getBoolean("EnableCrosshairs", SERVER_SETTINGS, false, "Whether it is allowed to show crosshair in client side");
		breakableArmor = configFile.getInt("BreakableArmor", SERVER_SETTINGS, 3, 0, 3, "0 = Non-breakable, 1 = All breakable, 2 = Refer to armor config, 3 = real mode");
		defaultArmorDurability = configFile.getInt("DefaultArmorDurability", SERVER_SETTINGS, 500, 1, 10000, "Default durability if \"breakableArmor\" = 1");
		armourSpawnRate = configFile.getInt("ArmourSpawnRate", SERVER_SETTINGS, 20, 0, 100, "The rate of Zombie or Skeleton to spawn equipped with a Flan armor (0=0%, 100=100%)");
		addGunpowderRecipe = configFile.getBoolean("GunpowderRecipe", SERVER_SETTINGS, false, "Whether to add an extra gunpowder recipe (3 charcoal + 1 lightstone)");
		shootAnimationRange = configFile.getInt("ShootAnimationRange", SERVER_SETTINGS, 150, 0, 1000, "Max distance that a player can see other players' shoot animation");
		chargeAnimationRange = configFile.getInt("ChargeAnimationRange", SERVER_SETTINGS, 50, 0, 200, "Max distance that a player can see other players' charge/slideRelease animation");
		
		// Client Gaming Settings
		if(side.isClient())
		{
			viewBobbing = configFile.getBoolean("ViewBobbing", CLIENT_SETTINGS, viewBobbing, "Whether to enable view bobbing in gaming");
			mouseSensitivityMult = configFile.getFloat("MouseSensitivityMult", CLIENT_SETTINGS, 0.8F, 0F, 1F, "Multiplier on mouse sensitivity when you aim");
			switchCoSightWhenNoSight = configFile.getBoolean("SwitchCoSightWhenNoSight", CLIENT_SETTINGS, true, "Whether to use sight switch key to switch co-sight if currently has no other sights");
			loopWhenChangeZoom = configFile.getBoolean("LoopWhenChangeZoom", CLIENT_SETTINGS, false, "Whether to loop when changing zoom of a sight");
			holdBreathKey = org.lwjgl.input.Keyboard.getKeyIndex(configFile.getString("HoldBreathKey", CLIENT_SETTINGS, "LSHIFT", "Key to hold breath").toUpperCase());
			onlyLoadCaseWhenManualMode = configFile.getBoolean("OnlyLoadCaseWhenManualMode", CLIENT_SETTINGS, true, "If true, only load case when manual mode enabled");
			preLockSlideTime = configFile.getInt("AnimationCompensationTime", CLIENT_SETTINGS, preLockSlideTime, 0, 100, "Compensation time for animation lag");
			flashRefreshRate = configFile.getInt("FlashRefreshRate", CLIENT_SETTINGS, flashRefreshRate, 1, 20, "Rate of flash light to refresh, higher when this value is smaller");
			numSmoke = configFile.getInt("NumSmoke", CLIENT_SETTINGS, numSmoke, 2, 1024, "Max gun smoke that will be generated in a short time");
			numCase = configFile.getInt("NumCase", CLIENT_SETTINGS, numCase, 1, 1024, "Max gun case that will be generated in a short time");
			numScopeTextures = configFile.getInt("NumScopeTextures", CLIENT_SETTINGS, numScopeTextures, 1, 1024, "Num scope textures that will be generated for rendering scope glass");
			scopeGlassResolution = configFile.getInt("ScopeGlassResolution", CLIENT_SETTINGS, scopeGlassResolution, 64, 4096, "Resolution when rendering scope glass texture");
			renderGunEntityIn2D = configFile.getBoolean("RenderGunEntityIn2D", CLIENT_SETTINGS, false, "Whether to render gun entity on ground in 2D");
			hdHitCrosshair = configFile.getBoolean("EnableHDHitMarker", CLIENT_SETTINGS, hdHitCrosshair, "Whether to enable HD hit mark");
			addAllPaintjobsToCreative = configFile.getBoolean("AddAllPaintjobsToCreative", CLIENT_SETTINGS, false, "Whether to list all available paintjobs in the creative item menu");
			lineLineTriCoorTest = configFile.getBoolean("LineLineTriCoorTest", CLIENT_SETTINGS, false, "Whether to enable tri coor test when calculating line-line intersection");
			FlansModClient.postConfigRead();
		}
		PacketGunAttachment.init(maxLayers << 1);
		if(configFile.hasChanged()) configFile.save();
	}
	
	public static void updateBltssConfig(int min, int divisor)
	{
		ConfigCategory category = configFile.getCategory(ADVANCED_SERVER_SETTINGS);
		category.get("BltSS_Min").set(min);
		category.get("BltSS_Divisor").set(divisor);
		TeamsManager.bulletSnapshotMin = min; // TODO
		TeamsManager.bulletSnapshotDivisor	= divisor;
		configFile.save();
	}
	
	/* TODO
	public static ItemStack getItemStackByName(String itemName)
	{
		if(!itemName.contains(".")) return InfoType.getRecipeElement(itemName, 0);
		String[] splits = itemName.split("\\.");
		return InfoType.getRecipeElement(splits[0], Short.parseShort(splits[1]));
	}*/
	
	//TODO : Proper logger
	public static void log(String string) { if(printDebugLog) System.out.println("[Flan's mod] " + string); }
	
	public static void log(String format, Object ... args) { log(String.format(format, args)); }
	
	public static byte[] copyByteArray(byte[] toCopy)
	{
		byte[] toReturn = new byte[toCopy.length];
		for(int i = toReturn.length; --i >= 0; ) toReturn[i] = toCopy[i];
		return toReturn;
	}
	
	public static int getInt(float value)
	{
		int intValue = (int)value;
		return value - intValue < 0.5 ? intValue : intValue + 1;
	}
	
	//Round values to n number of decimal points
	public static float roundFloat(float value, int points)
	{
		int pow = 1;
		while(--points >= 0) pow *= 10;
		return (((value *= pow) - (int)value) >= 0.5f ? (int)value + 1 : (int)value) / (float)pow;
	}
	
	//convert ticks in to time
	public static float getTimeFromTicks(int ticks, int points) { return roundFloat(ticks * 0.05F, points); }
	
	public static void record(String i, String p, String done)
	{
		
	}
	
	/* 3D helpers */
	public static void getLinePlaneIntersection(float a1, float b1, float c1, float A1, float B1, float C1, 
			float a2, float b2, float c2, float A2, float B2, float C2, Vector3f dest)
	{ dest.set(a1 + A1 * (dest.x = ((a2 - a1) * A2 + (b2 - b1) * B2 + (c2 - c1) * C2) / (A1 * A2 + B1 * B2 + C1 * C2)), b1 + B1 * dest.x, c1 + C1 * dest.x); }
	
	public static boolean getLineLineIntersection(float a1, float b1, float c1, float A1, float B1, float C1, 
			float a2, float b2, float c2, float A2, float B2, float C2, Vector3f dest)
	{
		float t = B1 * C2 - B2 * C1;
		if(t == 0F)
		{
			if((t = A1 * B2 - A2 * B1) == 0F)
			{
				if((t = A1 * C2 - A2 * C1) == 0F) return false;
				dest.set(a1 + A1 * (t = ((c1 - c2) * A2 - (a1 - a2) * C2) / t), b1 + B1 * t, c1 + C1 * t);
				if(lineLineTriCoorTest) return isFloatEquals(dest.y, b2 + B2 * (A2 == 0F ? (dest.z - c2) / C2 : (dest.x - a2) / A2));
				return true;
			}
			dest.set(a1 + A1 * (t = ((b1 - b2) * A2 - (a1 - a2) * B2) / t), b1 + B1 * t, c1 + C1 * t);
			if(lineLineTriCoorTest) return isFloatEquals(dest.z, c2 + C2 * (A2 == 0F ? (dest.y - b2) / B2 : (dest.x - a2) / A2));
			return true;
		}
		dest.set(a1 + A1 * (t = ((c1 - c2) * B2 - (b1 - b2) * C2) / t), b1 + B1 * t, c1 + C1 * t);
		if(lineLineTriCoorTest) return isFloatEquals(dest.x, a2 + A2 * (B2 == 0F ? (dest.z - c2) / C2 : (dest.y - b2) / B2));
		return true;
	}
	
	public static boolean betweenTest(Vector3f target, Vector3f start, Vector3f end)
	{
		float absX = Math.abs(start.x - end.x), absY = Math.abs(start.y - end.y);
		if(absY > absX)
		{
			if(Math.abs(start.z - end.z) > absY) return start.z > end.z ? target.z <= start.z && target.z >= end.z : target.z >= start.z && target.z <= end.z;
			return start.y > end.y ? target.y <= start.y && target.y >= end.y : target.y >= start.y && target.y <= end.y;
		}
		if(Math.abs(start.z - end.z) > absX) return start.z > end.z ? target.z <= start.z && target.z >= end.z : target.z >= start.z && target.z <= end.z;
		return start.x > end.x ? target.x <= start.x && target.x >= end.x : target.x >= start.x && target.x <= end.x;
	}
	
	public static boolean onRayTest(Vector3f target, float a, float b, float c, float A, float B, float C)
	{
		if(A == 0F) return B == 0F ? (target.z - c) / C >= 0F : (target.y - b) / B >= 0F;
		return (target.x - a) / A >= 0F;
	}
	
	private static Vector3f vector = new Vector3f(), dest = new Vector3f();
	public static boolean insideBorder(Vector3f coor, Vector3f[] border)
	{
		int count = 0, i = border.length;
		Vector3f vec0 = border[0], vec1 = border[--i];
		vector.set(vec0.x - vec1.x, vec0.y - vec1.y, vec0.z - vec1.z);
		while(i > 0)
		{
			if(getLineLineIntersection(coor.x, coor.y, coor.z, vector.x, vector.y, vector.z, 
					(vec0 = vec1).x, vec0.y, vec0.z,
					vec0.x - (vec1 = border[--i]).x, vec0.y - vec1.y, vec0.z - vec1.z, 
					dest)
			   && betweenTest(dest, vec0, vec1) 
			   && onRayTest(dest, coor.x, coor.y, coor.z, vector.x, vector.y, vector.z))
			{ ++count; }
		}
		return (count & 1) == 1;
	}
	
	public static final float FLOAT_ERROR_RANGE = 0.0001F;
	public static boolean isFloatEquals(float f1, float f2) { return Math.abs(f1 - f2) < FLOAT_ERROR_RANGE; }
	
	/*public static String byteArrayToString(byte[] b) { return byteArrayToString(b, b.length); }
	
	public static String byteArrayToString(byte[] b, int len)
	{
		if(b == null || b.length == 0 || len == 0) return "";
		String s = Byte.toString(b[0]);
		for(int i = 0; ++i < len; ) s += " " + b[i];
		return s;
	}*/
	
	public static boolean isInt(String s)
	{
		try { Integer.parseInt(s); }
		catch(Exception e) { return false; }
		return true;
	}
	
	/** for test 
	public static void testLog(String s) { log(s); }
	/** for test */
}
