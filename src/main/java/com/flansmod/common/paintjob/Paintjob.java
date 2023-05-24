package com.flansmod.common.paintjob;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;

public class Paintjob 
{
	public int ID;
	public String iconName;
	public String textureName;
	public ItemStack[] dyesNeeded;

	public Paintjob(int id, String iconName, String textureName, ItemStack[] dyesNeeded)
	{
		this.ID = id;
		this.iconName = iconName;
		this.textureName = textureName;
		this.dyesNeeded = dyesNeeded;
	}
	
	public boolean hasMaterialsNeeded(InventoryPlayer inv)
	{
		int left = dyesNeeded.length, need[] = new int[left];
		while(--left >= 0) need[left] = dyesNeeded[left].stackSize;
		left = need.length;
		ItemStack stack;
		for(int i = inv.getSizeInventory(), j; --i >= 0; )
		{
			if((stack = inv.getStackInSlot(i)) == null) continue;
			for(j = need.length; --j >= 0; )
			{
				if(need[j] < 1) continue;
				if(stack.getItem().equals(dyesNeeded[j].getItem()) && (need[j] -= stack.stackSize) < 1 && --left < 1)
					return true;
			}
		}
		return false;
	}
	
	public boolean removeMaterialsNeeded(InventoryPlayer inv)
	{
		int left = dyesNeeded.length, need[] = new int[left];
		while(--left >= 0) need[left] = dyesNeeded[left].stackSize;
		left = need.length;
		ItemStack stack;
		for(int i = inv.getSizeInventory(), j; --i >= 0; )
		{
			if((stack = inv.getStackInSlot(i)) == null) continue;
			for(j = need.length; --j >= 0; )
			{
				if(need[j] < 1) continue;
				if(stack.getItem().equals(dyesNeeded[j].getItem()))
				{
					if(need[j] > stack.stackSize)
					{
						need[j] -= stack.stackSize;
						inv.setInventorySlotContents(i, null);
						continue;
					}
					if((stack.stackSize -= need[j]) < 1) inv.setInventorySlotContents(i, null);
					need[j] = 0;
					if(--left < 1) return true;
				}
			}
		}
		return false;
	}
}
