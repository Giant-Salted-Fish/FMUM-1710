package com.flansmod.common.guns;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

//marked here to modify a gun
public class InventoryGunModTable extends InventoryBasic
{
	public InventoryGunModTable() 
	{
		super("Gun Modification Table", true, 17);
	}

	public ItemStack lastGunStack;
	public GunType gunType;
	public int genericScroll = 0;
	/** Hacky way to change slots within onInventoryChanged without causing a huge stack overflow */
	private boolean busy = false;
	
	@Override
	public void markDirty() 
	{
		if(busy)
			return;
		ItemStack gunStack = getStackInSlot(0);
		if(gunStack == null || !(gunStack.getItem() instanceof ItemGun))
			return;
		
		gunType = ((ItemGun)gunStack.getItem()).type;
		//String[] tags = {"barrel", "scope", "stock", "grip", "gadget", "slide", "pump", "accessory"};
		
		//If we changed the gun (i.e. a new gun has been placed in the table)
		/**if(gunStack != lastGunStack)
		{
			busy = true;
			//check if this gun has "attachment compound"
			if(gunStack.stackTagCompound.hasKey("attachments"))
			{
				NBTTagCompound attachmentTags = gunStack.stackTagCompound.getCompoundTag("attachments");
				for(int i = 0; i < 8; i++)
					setInventorySlotContents(i + 1, ItemStack.loadItemStackFromNBT(attachmentTags.getCompoundTag(tags[i])));
			
			
				//genericScroll = 0;
				for(int i = 0; i < Math.min(gunType.numGenericAttachmentSlots, 8); i++)
				{
					if(gunStack.stackTagCompound.hasKey("generic_" + i))
						setInventorySlotContents(tags.length + i + 1, ItemStack.loadItemStackFromNBT(attachmentTags.getCompoundTag("generic_" + i)));
				}
			}
			genericScroll = 0;
			busy = false;
		}
		//Else we changed an attachment
		else
		{
			//Create a new NBT tag compound for our gun item
			NBTTagCompound gunTags = new NBTTagCompound();
			//Copy the ammo and paintjob from the old stack
			if(gunStack.stackTagCompound.hasKey(GunType.GunTag.AMMO))
				gunTags.setTag(GunType.GunTag.AMMO, gunStack.stackTagCompound.getTag(GunType.GunTag.AMMO));
			//cpoy the magazine for our gun if it uses the mag
			if(gunStack.stackTagCompound.hasKey(GunTag.MAGAZINE) && gunStack.loadItemStackFromNBT(gunStack.stackTagCompound.getCompoundTag(GunTag.MAGAZINE)) != null)
				gunTags.setTag(GunTag.MAGAZINE, gunStack.stackTagCompound.getTag(GunTag.MAGAZINE));
			//copy gun slide state
			if(gunStack.stackTagCompound.hasKey("slide"))
				gunTags.setTag("slide", gunStack.stackTagCompound.getTag("slide"));
			//copy stock settings
			if(gunStack.stackTagCompound.hasKey("foldStock"))
				gunTags.setTag("foldStock", gunStack.stackTagCompound.getTag("foldStock"));
			if(gunStack.stackTagCompound.hasKey("stockStep"))
				gunTags.setTag("stockStep", gunStack.stackTagCompound.getTag("stockStep"));
			if(gunStack.stackTagCompound.hasKey("stockDistance"))
				gunTags.setTag("stockDistance", gunStack.stackTagCompound.getTag("stockDistance"));
			
			//Add each attachment from the inventory to our gun stack
	    	NBTTagCompound attachmentTags = new NBTTagCompound();
			for(int i = 0; i < 8; i++)
				writeAttachmentTags(attachmentTags, getStackInSlot(i + 1), tags[i]);
			
	       	//Change all the attachments that we are looking at, but copy in the old ones
	       	for(int i = 0; i < gunType.numGenericAttachmentSlots; i++)
	       	{
	       		if(i >= genericScroll * 4 && i < genericScroll * 4 + 8)
	       			writeAttachmentTags(attachmentTags, getStackInSlot(i - genericScroll * 4 + tags.length + 1), "generic_" + i);
	       		else
					attachmentTags.setTag("generic_" + i, gunStack.stackTagCompound.getTag("generic_" + i));
	       	}
			
			for(int i = 1; i <= gunType.attachPoints.length; i++)
			{
				if(gunStack.stackTagCompound.hasKey("pr" + i))
					attachmentTags.setTag("pr" + i, attachmentTags.getTag("pr" + i));
				else
					attachmentTags.setTag("pr" + i, new NBTTagCompound());
			}
			
	       	//Set the tags to be these new tags (marked here)
	       	gunTags.setTag("attachments", attachmentTags);
	       	gunStack.stackTagCompound = gunTags;
		}
		
		lastGunStack = gunStack;*/
	}
	
	public void writeAttachmentTags(NBTTagCompound attachmentTags, ItemStack attachmentStack, String attachmentName)
	{
		NBTTagCompound tags = new NBTTagCompound();
		if(attachmentStack != null) attachmentStack.writeToNBT(tags);
        attachmentTags.setTag(attachmentName, tags);
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) { return false; }
}
