package com.flansmod.common.parts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.flansmod.client.model.ModelTest;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;

public class PartType extends InfoType
{
	/** Category (TODO : Replace with Enum) */
	public int category;
	/** paintjob category */
	public int exPaintjobType = 0;
	/** Max stack size of item */
	public int stackSize;
	/** (Engine) Multiplier applied to the thrust of the driveable */
	public float engineSpeed = 1.0F;
	/** (Engine) Rate at which this engine consumes fuel */
	public float fuelConsumption = 1.0F;
	/** (Fuel) The amount of fuel this fuel tank gives */
	public int fuel = 0;
	/** The types of driveables that this engine works with. Used to designate some engines as mecha CPUs and whatnot */
	public List<EnumType> worksWith = Arrays.asList(EnumType.mecha, EnumType.plane, EnumType.vehicle);
	
	public ArrayList<ItemStack> partBoxRecipe = new ArrayList<ItemStack>();
	
	//------- RedstoneFlux -------
	/** If true, then this engine will draw from RedstoneFlux power source items such as power cubes. Otherwise it will draw from Flan's Mod fuel items */
	public boolean useRFPower = false;
	/** The power draw rate for RF (per tick) */
	public int RFDrawRate = 1;
	//-----------------------------
	
	/** for test */
	@SideOnly(Side.CLIENT)
	public ModelTest model;
	@SideOnly(Side.CLIENT)
	public String modelName;
	//@SideOnly(Side.CLIENT)
	public float progress = 0.02F;
	
	/** The default engine (normally the first one read by the type loader) for driveables with corrupt nbt or those spawned in creative  */
	public static HashMap<EnumType, PartType> defaultEngines = new HashMap<EnumType, PartType>();
	
	/** The list of all PartTypes */
	public static List<PartType> parts = new ArrayList<PartType>();
	
	public PartType(TypeFile file)
	{
		super(file);
		parts.add(this);
	}
	
	@Override
	protected void preRead(TypeFile file) { }
	
	@Override
	public void postRead(TypeFile file) 
	{
		if(category == 2 && !useRFPower)
			for(EnumType type : worksWith)
			{
				//If there is already a default engine for this type, compare and see if this one is better
				if(defaultEngines.containsKey(type))
				{
					PartType possiblyInferiorEngine = defaultEngines.get(type);
					if(isInferiorEngine(possiblyInferiorEngine))
						defaultEngines.put(type, this);
				}
				else defaultEngines.put(type, this);
			}
	}

	@Override
	protected void read(String[] split, TypeFile file) 
	{
		super.read(split, file);
		try 
		{
			if(split[0].equals("Category")) category = getCategory(split[1]);
			else if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(modelName = split[1], shortName, ModelTest.class);
			else if(split[0].equals("ProgressTime")) progress = 1F / Float.parseFloat(split[1]);
			else if(split[0].equals("ExPaintjob")) exPaintjobType = split[1].hashCode();
			else if(split[0].equals("StackSize")) stackSize = Integer.parseInt(split[1]);
			else if(split[0].equals("EngineSpeed")) engineSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("FuelConsumption")) fuelConsumption = Float.parseFloat(split[1]);
			else if(split[0].equals("Fuel")) fuel = Integer.parseInt(split[1]);
			else if(split[0].equals("PartBoxRecipe")) //Recipe
			{
				ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
				for(int i = 0; i < (split.length - 2) / 2; i++)
				{
					int amount = Integer.parseInt(split[2 * i + 2]);
					boolean damaged = split[2 * i + 3].contains(".");
					String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
					int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
					stacks[i] = getRecipeElement(itemName, amount, damage, shortName);
				}
				partBoxRecipe.addAll(Arrays.asList(stacks));
			}
			else if(split[0].equals("WorksWith"))
			{
				worksWith = new ArrayList<EnumType>();
				for(int i = 0; i < split.length - 1; i++) worksWith.add(EnumType.get(split[i + 1]));
			}
			
			//------- RedstoneFlux -------
			else if(split[0].equals("UseRF") || split[0].equals("UseRFPower")) useRFPower = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("RFDrawRate")) RFDrawRate = Integer.parseInt(split[1]);
			//----------------------------
		} 
		catch (Exception e) 
		{
			String line = split[0];
			for(int i = 1; i < split.length; ++i) line += " " + split[i];
			FlansMod.log("error > failed to parse key word <" + line + "> for part <" + shortName + ">");
			if(FlansMod.printStackTrace) e.printStackTrace();
		}
	}
	
	public boolean isInferiorEngine(PartType possiblyInferiorEngine)
	{ return engineSpeed > possiblyInferiorEngine.engineSpeed; }

	public static PartType getPart(String s)
	{
		for(PartType part : parts) if(part.shortName.equals(s)) return part;
		return null;
	}

	private int getCategory(String s)
	{
		if(s.equals("Cockpit")) return 0;
		if(s.equals("Wing")) return 1;
		if(s.equals("Engine")) return 2;
		if(s.equals("Propeller")) return 3;
		if(s.equals("Bay")) return 4;
		if(s.equals("Tail")) return 5;
		if(s.equals("Wheel")) return 6;
		if(s.equals("Chassis")) return 7;
		if(s.equals("Turret")) return 8;
		if(s.equals("Fuel")) return 9;
		//if(s.equals("Misc")) return 10;
		return 10;
	}

	@Override
	public float GetRecommendedScale() { return 50F; }

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() { return model; }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void reloadModel()
	{ if(model != null) model = FlansMod.proxy.loadModel(modelName, shortName, ModelTest.class); }
}