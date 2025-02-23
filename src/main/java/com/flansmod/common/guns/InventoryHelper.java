package com.flansmod.common.guns;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/** Adds access to the InventoryPlayer stack combination methods for arbitrary inventories */
public class InventoryHelper 
{
	/** new method to add something to player's inventory, prevent adding stack to clothes slot, this method don't care if player is creative */
	public static boolean addItemStackToPlayerInventory(IInventory inventory, ItemStack stackToAdd)
	{
		if(stackToAdd == null || stackToAdd.stackSize == 0)
			return false;
		else //is a valid stack to add
		{
			//if stack is damaged or max stack size is 0, just find a null slot to add it
			if(stackToAdd.isItemDamaged() || stackToAdd.getMaxStackSize() == 1)
			{
				for(int i = 0; i < 36; i++)
				{
					//find an null slot, set it
					if(inventory.getStackInSlot(i) == null)
					{
						stackToAdd.animationsToGo = 5;
						inventory.setInventorySlotContents(i, stackToAdd);
						return true;
					}
				}
				//check through inventory but not finding a valid slot to add, return false
				return false;
			}
			else //stack not damaged and is stackable, we need to consider stacking it with an existed itemstack in inventory
			{
				ItemStack stackInSlot;
				//check through inventory for two times, first time to see if we can stack it, second time to see if has null slot to set it
				for(int i = 0; i < 36; i++)
				{
					stackInSlot = inventory.getStackInSlot(i);
					if(stackInSlot != null && stackInSlot.getItem() == stackToAdd.getItem() && stackInSlot.isStackable() && 
					   /*stackInSlot.stackSize < stackInSlot.getMaxStackSize() && stackInSlot.stackSize < inventory.getInventoryStackLimit() && */
					   (!stackInSlot.getHasSubtypes() || stackInSlot.getItemDamage() == stackToAdd.getItemDamage()) && ItemStack.areItemStackTagsEqual(stackInSlot, stackToAdd))
					{
						int canAddSize = Math.min(stackInSlot.getMaxStackSize() - stackInSlot.stackSize, inventory.getInventoryStackLimit() - stackInSlot.stackSize);
						//size in this slot is max, can add more, continue
						if(canAddSize != 0)
						{
							if(stackToAdd.stackSize > canAddSize)
							{
								stackInSlot.stackSize += canAddSize;
								stackInSlot.animationsToGo = 5;
								stackToAdd.stackSize -= canAddSize;
							}
							else //can add size is bigger than to add size, add them all
							{
								stackInSlot.stackSize += stackToAdd.stackSize;
								stackInSlot.animationsToGo = 5;
								return true;
							}
						}
					}
				}
				//after first round there is still some left to add, find null slot to place them
				for(int i = 0; i < 36; i++)
				{
					if(inventory.getStackInSlot(i) == null)
					{
						stackToAdd.animationsToGo = 5;
						inventory.setInventorySlotContents(i, stackToAdd);
						return true;
					}
				}
				return false;
			}
		}
	}
	
	/** original method to add itemstack to inventory */
	public static boolean addItemStackToInventory(IInventory inventory, ItemStack stack, boolean creative)
	{
		if(stack == null)
            return false;
        else if(stack.stackSize == 0)
            return false;
        else
        {
            try
            {
                int i;
				
                if(stack.isItemDamaged())
                {
                    i = getFirstEmptyStack(inventory);

                    if(i >= 0)
                    {
                    	ItemStack stackToAdd = ItemStack.copyItemStack(stack);
                    	stackToAdd.animationsToGo = 5;
                    	inventory.setInventorySlotContents(i, stackToAdd);
                        stack.stackSize = 0;
                        return true;
                    }
                    else if(creative)
                    {
                        stack.stackSize = 0;
                        return true;
                    }
                    return false;
                }
                else
                {
                    do
                    {
                        i = stack.stackSize;
                        stack.stackSize = storePartialItemStack(inventory, stack);
                    }
                    while(stack.stackSize > 0 && stack.stackSize < i);
					
                    if(stack.stackSize == i && creative)
                    {
                    	stack.stackSize = 0;
                        return true;
                    }
                    else
                    {
                        return stack.stackSize < i;
                    }
                }
            }
            catch(Throwable throwable)
            {
                throwable.printStackTrace();
                return false;
            }
        }
	}
	
	public static int storeItemStack(IInventory inventory, ItemStack stack)
    {
        for (int i = 0; i < inventory.getSizeInventory(); ++i)
        {
        	ItemStack oldStack = inventory.getStackInSlot(i);
            if(oldStack != null && oldStack.getItem() == stack.getItem() && oldStack.isStackable() && oldStack.stackSize < oldStack.getMaxStackSize() && oldStack.stackSize < inventory.getInventoryStackLimit() && (!oldStack.getHasSubtypes() || oldStack.getItemDamage() == stack.getItemDamage()) && ItemStack.areItemStackTagsEqual(oldStack, stack))
            {
                return i;
            }
        }

        return -1;
    }
	
    public static int storePartialItemStack(IInventory inventory, ItemStack stack)
    {
        Item item = stack.getItem();
        int j = stack.stackSize;
        int k;

        //If the item doesn't stack, just find an empty slot for it
        if(stack.getMaxStackSize() == 1)
        {
            k = getFirstEmptyStack(inventory);
            //If it is impossible, return
            if(k < 0)
            {
                return j;
            }
            else
            {
                if(inventory.getStackInSlot(k) == null)
                {
                    inventory.setInventorySlotContents(k, ItemStack.copyItemStack(stack));
                }
                return 0;
            }
        }
        else
        {
            k = storeItemStack(inventory, stack);
            if(k < 0)
            {
                k = getFirstEmptyStack(inventory);
            }
			
            if(k < 0)
            {
                return j;
            }
            else
            {
            	ItemStack oldStack = inventory.getStackInSlot(k);
            	
                if(oldStack == null)
                {
                	oldStack = new ItemStack(item, 0, stack.getItemDamage());
                	if(stack.hasTagCompound())
                		oldStack.setTagCompound((NBTTagCompound)stack.getTagCompound().copy());
                	inventory.setInventorySlotContents(k, oldStack);
                }

                int l = j;

                if(j > oldStack.getMaxStackSize() - oldStack.stackSize)
                {
                    l = oldStack.getMaxStackSize() - oldStack.stackSize;
                }

                if(l > inventory.getInventoryStackLimit() - oldStack.stackSize)
                {
                    l = inventory.getInventoryStackLimit() - oldStack.stackSize;
                }

                if(l == 0)
                {
                    return j;
                }
                else
                {
                    j -= l;
                    oldStack.stackSize += l;
                    oldStack.animationsToGo = 5;
                    return j;
                }
            }
        }
    }
	
	/** Method from InventoryPlayer */
    public static int getFirstEmptyStack(IInventory inventory)
    {
        for(int i = 0; i < inventory.getSizeInventory(); ++i)
            if(inventory.getStackInSlot(i) == null)
                return i;
        
        return -1;
    }

	public static void dropInventoryItems(World worldIn, int x, int y, int z, IInventory tileentity) 
	{
		
	}
	
}
