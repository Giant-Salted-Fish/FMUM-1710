package com.flansmod.common;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import com.flansmod.common.driveables.ContainerDriveableInventory;
import com.flansmod.common.driveables.ContainerDriveableMenu;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.ContainerMechaInventory;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.ContainerGunModTable;
import com.flansmod.common.guns.boxes.ContainerGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.network.PacketBreakSound;
import com.flansmod.common.paintjob.ContainerPaintjobTable;
import com.flansmod.common.paintjob.TileEntityPaintjobTable;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.InfoType;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class CommonProxy
{
	protected static final Pattern PACK_PATTERN = Pattern.compile("(.+)\\.(zip|jar)$");
	
	protected static final String SUFFIX = new String(new byte[]{ 11 + 35, 5 * 23, 100 + 12 + 3, 51 << 1 });
	
	/** Returns the list of content pack files, and on the client, adds the content pack resources and models to the classpath */
	public List<File> getContentList()
	{
		List<File> contentPacks = new ArrayList<File>();
		for(File file : FlansMod.flanDir.listFiles())
		{
			File resourceFile = null;
			if(file.isDirectory() || PACK_PATTERN.matcher(file.getName()).matches())
				resourceFile = file;
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
					
//					ByteArrayOutputStream bout = new ByteArrayOutputStream();
//					for(int buf; (buf = in.read()) != -1; bout.write(buf));
					in.close();
//					byte[] byteStream = bout.toByteArray();
//					bout.close();
//					for(int i = byteStream.length; --i >= 0; byteStream[i] ^= i);
//					
//					int p = 0, i;
//					for(byte[] bytes; p < byteStream.length; )
//					{
//						for(i = 32, pathLen = 0; (i -= 8) >= 0; pathLen |= (byteStream[p++] << i) & (-1 >>> (24 - i)));
//						for(bytes = new byte[pathLen], i = 0; i < pathLen; bytes[i++] = byteStream[p++]);
//						String key = new String(bytes);
//						for(i = 32, pathLen = 0; (i -= 8) >= 0; pathLen |= (byteStream[p++] << i) & (-1 >>> (24 - i)));
//						for(bytes = new byte[pathLen], i = 0; i < pathLen; bytes[i++] = byteStream[p++]);
//						Coder.instance.putSource(key, bytes);
//					}
				}
				catch(IOException e) { }
			}
			else continue;
			
//			contentPacks.add(resourceFile);
		}
		
		
		for(File file : FlansMod.flanDir.listFiles())
		{
			// Load folders and valid zip files
			if(file.isDirectory() || PACK_PATTERN.matcher(file.getName()).matches())
			{
				// Add the directory to the content pack list
				FlansMod.log("Loaded content pack: " + file.getName());
				contentPacks.add(file);
			}
			else FlansMod.log("Unknow file type to read: " + file.getName());
		}
		FlansMod.log("Loaded content pack list server side.");
		return contentPacks;
	}
	
	/** A ton of client only methods follow */
	public void load() { }
	
	public void forceReload() { }
		
	public void registerRenderers()	{ }
	
	public void doTutorialStuff(EntityPlayer player, EntityDriveable entityType) { }
	
	public void changeControlMode(EntityPlayer player) { }
	
	public boolean mouseControlEnabled() { return false; }
	
	public void openDriveableMenu(EntityPlayer player, World world, EntityDriveable driveable) { }
	
	public <T> T loadModel(String s, String shortName, Class<T> typeClass) { return null; }
	
	public void loadSound(String contentPack, String type, String sound) { }
	
	public boolean isThePlayer(EntityPlayer player) { return false; }
	
	public EntityPlayer getThePlayer() { return null; }
	
	public boolean isOnSameTeamClientPlayer(EntityLivingBase entity) { return false; }
	
	public void buyGun(GunBoxType type, InfoType gun) { }

	public void buyAmmo(GunBoxType box, int ammo, int type) { }
	
	/** Gets the client GUI element from ClientProxy */
	public Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{ return null; }

	/** Gets the container for the specified GUI */
	public Container getServerGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID) 
		{	
			case 0 : return null; //Driveable crafting. No server side
			case 1 : return null; //Driveable repair. No server side
			case 2: return new ContainerGunModTable(player.inventory, world);
			case 3: return new ContainerDriveableMenu(player.inventory, world);
			case 4: return new ContainerDriveableMenu(player.inventory, world, true, ((EntitySeat)player.ridingEntity).driveable);
			case 5: return new ContainerGunBox(player.inventory, world);
			//Plane inventory screens
			case 6: return new ContainerDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 0);
			case 7: return new ContainerDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 1);
			case 8: return new ContainerDriveableMenu(player.inventory, world, true, ((EntitySeat)player.ridingEntity).driveable);
			case 9: return new ContainerDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 2);
			case 10: return new ContainerMechaInventory(player.inventory, world, (EntityMecha)((EntitySeat)player.ridingEntity).driveable);
			case 11 : return null; //Armour box. No server side
			case 12 : return new ContainerDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 3);
			case 13: return new ContainerPaintjobTable(player.inventory, world, (TileEntityPaintjobTable)world.getTileEntity(x, y, z));
		}
		return null;
	}
	
	/** Play a block break sound here */
	public void playBlockBreakSound(int x, int y, int z, Block blockHit)
	{ FlansMod.packetHandler.sendToAll(new PacketBreakSound(x, y, z, blockHit)); }

	public void addItem(EntityPlayer player, int id)
	{
		ItemStack item = new ItemStack(Item.getItemById(id),1, 4);
		player.inventory.addItemStackToInventory(item);
		
		ArrayList<ItemStack> dirts = new ArrayList<ItemStack>();
		dirts.add(0, new ItemStack(Item.getItemById(3)));
		CraftingInstance crafting = new CraftingInstance(player.inventory, dirts, new ItemStack(Item.getItemById(id)));
		if(crafting.canCraft()) crafting.craft(player.inventory.player);
	}

	public void craftDriveable(EntityPlayer player, DriveableType type)
	{
		//Create a temporary copy of the player inventory for backup purposes
		InventoryPlayer temporaryInventory = new InventoryPlayer(null);
		temporaryInventory.copyInventory(player.inventory);
		
		//This becomes false if some recipe element is not found on the player
		boolean canCraft = true;
		//Iterate over rows then columns
		for(ItemStack recipeStack : type.driveableRecipe)
		{
			//The total amount of items found that match this recipe stack
			int totalAmountFound = 0;
			//Iterate over the player's inventory
			for(int n = 0; n < player.inventory.getSizeInventory(); n++)
			{
				//Get the stack in each slot
				ItemStack stackInSlot = player.inventory.getStackInSlot(n);
				//If the stack is what we want
				if(stackInSlot != null && stackInSlot.getItem() == recipeStack.getItem() && stackInSlot.getItemDamage() == recipeStack.getItemDamage())
				{
					//Work out the amount to take from the stack
					int amountFound = Math.min(stackInSlot.stackSize, recipeStack.stackSize - totalAmountFound);
					//Take it
					stackInSlot.stackSize -= amountFound;
					//Check for empty stacks
					if(stackInSlot.stackSize <= 0)
						stackInSlot = null;
					//Put the modified stack back in the inventory
					player.inventory.setInventorySlotContents(n, stackInSlot);
					//Increase the amount found counter
					totalAmountFound += amountFound;
					//If we have enough, stop looking
					if(totalAmountFound == recipeStack.stackSize)
						break;
				}
			}
			//If we didn't find enough, give the stack a red outline
			if(totalAmountFound < recipeStack.stackSize)
			{
				//For some reason, the player sent a craft packet, despite being unable to
				canCraft = false;
				break;
			}
		}
		
		//Some item was missing. Restore inventory and return
		if(!canCraft)
		{
			player.inventory.copyInventory(temporaryInventory);
			return;
		}
		
		//Now we no longer need the temporary inventory backup, so we will use it to find the best stack of engines		
		//Collect up all the engines into neat and tidy stacks so we can find if any of them are big enough and which of those stacks are best
		HashMap<PartType, ItemStack> engines = new HashMap<PartType, ItemStack>();
		
		//Find some suitable engines
		for(int n = 0; n < temporaryInventory.getSizeInventory(); n++)
		{
			//Get the stack in each slot
			ItemStack stackInSlot = temporaryInventory.getStackInSlot(n);
			//Check to see if its a part
			if(stackInSlot != null && stackInSlot.getItem() instanceof ItemPart)
			{
				PartType partType = ((ItemPart)stackInSlot.getItem()).type;
				//Check its an engine
				if(partType.category == 2 && partType.worksWith.contains(EnumType.getFromObject(type)))
				{
					//If we already have engines of this type, add these ones to the stack
					if(engines.containsKey(partType))
					{
						engines.get(partType).stackSize += stackInSlot.stackSize;
					}
					//Else, make this the first stack
					else engines.put(partType, stackInSlot);
				}
			}
		}
		
		//Find the stack of engines that is fastest but which also has enough for this driveable
		float bestEngineSpeed = -1F;
		ItemStack bestEngineStack = null;
		for(PartType part : engines.keySet())
		{
			//If this engine outperforms the currently selected best one and there are enough of them, swap
			if(part.engineSpeed > bestEngineSpeed && engines.get(part).stackSize >= type.numEngines())
			{
				bestEngineSpeed = part.engineSpeed;
				bestEngineStack = engines.get(part);
			}
		}
		
		//If the player doesn't have any suitable engines, return
		if(bestEngineStack == null)
		{
			player.inventory.copyInventory(temporaryInventory);
			return;
		}
		
		//Remove the engines from the inventory
		int numEnginesAcquired = 0;
		for(int n = 0; n < player.inventory.getSizeInventory(); n++)
		{
			//Get the stack in each slot
			ItemStack stackInSlot = player.inventory.getStackInSlot(n);
			//Check to see if its the engine we want
			if(stackInSlot != null && stackInSlot.getItem() == bestEngineStack.getItem())
			{
				//Work out the amount to take from the stack
				int amountFound = Math.min(stackInSlot.stackSize, type.numEngines() - numEnginesAcquired);
				//Take it
				stackInSlot.stackSize -= amountFound;
				//Check for empty stacks
				if(stackInSlot.stackSize <= 0)
					stackInSlot = null;
				//Put the modified stack back in the inventory
				player.inventory.setInventorySlotContents(n, stackInSlot);
				//Increase the amount found counter
				numEnginesAcquired += amountFound;
				//If we have enough, stop looking
				if(numEnginesAcquired == type.numEngines())
					break;
			}
		}
		
		//Give them their brand new shiny driveable item :D
		ItemStack driveableStack = new ItemStack(type.item);
		NBTTagCompound tags = new NBTTagCompound();
		tags.setString("Engine", ((ItemPart)bestEngineStack.getItem()).type.shortName);
		tags.setString("Type", type.shortName);
    	for(EnumDriveablePart part : EnumDriveablePart.values())
    	{
    		tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
    		tags.setBoolean(part.getShortName() + "_Fire", false);
    	}
		driveableStack.stackTagCompound = tags;
		if(!player.inventory.addItemStackToInventory(driveableStack))
			player.dropPlayerItemWithRandomChoice(driveableStack, false);
	}

	public void repairDriveable(EntityPlayer driver, EntityDriveable driving, DriveablePart part) 
	{
		//If any of this parts parent parts are broken, then it cannot be repaired
		for(EnumDriveablePart parent : part.type.getParents())
		{
			if(!driving.isPartIntact(parent))
				return;
		}
		
		//Create a temporary copy of the player inventory for backup purposes
		InventoryPlayer temporaryInventory = new InventoryPlayer(null);
		temporaryInventory.copyInventory(driver.inventory);
		
		//This becomes false if some recipe element is not found on the player
		boolean canRepair = true;
		
		//Get the array of stacks needed
		ArrayList<ItemStack> stacksNeeded = driving.getDriveableType().getItemsRequired(part, driving.getDriveableData().engine);
		//Draw the stacks that should be in each slot
		for(ItemStack stackNeeded : stacksNeeded)
		{
			//The total amount of items found that match this recipe stack
			int totalAmountFound = 0;
			//Iterate over the temporary inventory
			for(int m = 0; m < temporaryInventory.getSizeInventory(); m++)
			{
				//Get the stack in each slot
				ItemStack stackInSlot = temporaryInventory.getStackInSlot(m);
				//If the stack is what we want
				if(stackInSlot != null && stackInSlot.getItem() == stackNeeded.getItem() && stackInSlot.getItemDamage() == stackNeeded.getItemDamage())
				{
					//Work out the amount to take from the stack
					int amountFound = Math.min(stackInSlot.stackSize, stackNeeded.stackSize - totalAmountFound);
					//Take it
					stackInSlot.stackSize -= amountFound;
					//Check for empty stacks
					if(stackInSlot.stackSize <= 0)
						stackInSlot = null;
					//Put the modified stack back in the inventory
					temporaryInventory.setInventorySlotContents(m, stackInSlot);
					//Increase the amount found counter
					totalAmountFound += amountFound;
					//If we have enough, stop looking
					if(totalAmountFound == stackNeeded.stackSize)
						break;
				}
			}
			if(totalAmountFound < stackNeeded.stackSize)
				canRepair = false;
		}
		
		if(canRepair)
		{
			driver.inventory.copyInventory(temporaryInventory);
			part.health = Math.max(1, part.maxHealth / 10);
			part.onFire = false;
			part.dead = false;
			driving.checkParts();
		}
	}
	
	public boolean isScreenOpen() { return false; }
	
	public boolean isKeyDown(int key) { return false; }
	
	public boolean keyDown(int keycode) { return false; }

	public void buyArmour(String shortName, int piece, ArmourBoxType type) { }

	public void spawnParticle(String p_72869_1_,
			double p_72869_2_, double p_72869_4_, double p_72869_6_,
			double p_72869_8_, double p_72869_10_, double p_72869_12_)
	{ }
	
	public float getMouseSensitivity() { return 0.5F; }
	
	protected static final class Coder extends URLClassLoader
	{
		private final HashMap<String, byte[]> source = new HashMap<String, byte[]>();
		
		private Coder() { super(new URL[0], net.minecraft.server.MinecraftServer.class.getClassLoader()); }
		
		public final byte[] putSource(String key, byte[] value) { return source.put(key, value); }
		
		//public final void clear() { source.clear(); } TODO: call this?
		
		@Override
		protected final Class<?> findClass(String name) throws ClassNotFoundException
		{
			byte[] bytes = source.get(name);
			return bytes != null ? defineClass(name, bytes, 0, bytes.length) : super.findClass(name);
		}
		
		private static Method method = null;
		static
		{
			try
			{
				method = java.net.URLClassLoader.class.getDeclaredMethod("addURL", java.net.URL.class);
				method.setAccessible(true);
			}
			catch(Exception e)
			{
				FlansMod.log("Failed to get reflected load method, all model load will fail");
				if(FlansMod.printStackTrace) e.printStackTrace();
			}
		}
		public final void addURLToParent(URL url)
		{
			if(method == null) return;
			try { method.invoke(getParent(), url); }
			catch(Exception e)
			{
				FlansMod.log("Failed to add url <" + url + ">");
				if(FlansMod.printStackTrace) e.printStackTrace();
			}
		}
		
		public static final Coder instance = new Coder();
	}
}