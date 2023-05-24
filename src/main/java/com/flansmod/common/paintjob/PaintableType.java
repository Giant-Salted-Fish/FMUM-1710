package com.flansmod.common.paintjob;

import java.util.HashMap;
import java.util.LinkedList;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ModifiableType.ModifiableTag;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class PaintableType extends InfoType
{
	//Paintjobs
	/** The list of all available paintjobs for this gun */
	public Paintjob[] paintjobs;
	public HashMap<Integer, String> exPaintjobs = new HashMap<Integer, String>();
	/** Assigns IDs to paintjobs */
	private static byte onPaintjob;
	private static LinkedList<Paintjob> tempPaintjobs = new LinkedList<Paintjob>();
	
	public PaintableType(TypeFile file) { super(file); }
	
	@Override
	public void preRead(TypeFile file) { onPaintjob = 1; tempPaintjobs.clear(); }
	
	@Override
	public void postRead(TypeFile file)
	{
		paintjobs = new Paintjob[onPaintjob];
		paintjobs[0] = new Paintjob(0, iconPath, texture, new ItemStack[0]);
		while(--onPaintjob > 0) paintjobs[onPaintjob] = tempPaintjobs.get(onPaintjob - 1);
	}
	
	/** Pack reader */
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Paintjob")) //Paintjobs
			{
				int i = (split.length - 3) / 2;
				ItemStack[] dyeStacks = new ItemStack[i];
				while(--i >= 0) dyeStacks[i] = new ItemStack(Items.dye, Integer.parseInt(split[i * 2 + 4]), getDyeDamageValue(split[i * 2 + 3]));
				tempPaintjobs.add(new Paintjob(onPaintjob++, split[1], split[2], dyeStacks));
			}
			else if(split[0].equals("ExPaintjob")) for(int i = 2; i < split.length; i += 2) exPaintjobs.put(split[i - 1].hashCode(), split[i]);
		}
		catch(Exception e)
		{
			String line = split[0];
			for(int i = 1; i < split.length; ++i) line += " " + split[i];
			FlansMod.log("error > failed to parse line <" + line + "> for paintjob item <" + shortName + ">");
			if(FlansMod.printStackTrace) e.printStackTrace();
		}
	}
	
	public String getTex(short dam)
	{ return dam < 0 ? ((ItemPart)Item.getItemById(dam & ModifiableTag.EX_PAINT_MASK)).type.shortName : paintjobs[dam].textureName; }
	
	//public Paintjob getPaintjob(int i) { return paintjobs[i]; }
	
	public float GetRecommendedScale() { return 50f; }
}