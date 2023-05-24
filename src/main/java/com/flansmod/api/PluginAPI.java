package com.flansmod.api;

import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ModifiableType.ItsType;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

/**
 * An API class provided for plugin developer
 * that wants their plugin to be able to interact
 * with FMUM
 * 
 * @author Giant_Salted_Fish
 */
public class PluginAPI
{
	/**
	 * Get a gun from player's inventory.
	 * Throws exception if player with corresponding name is not found
	 * or index is out of the range of player's inventory.
	 * Return null if the item in required slot does not exist or is not
	 * a Flan's mod gun.
	 * @see FlanGun
	 * 
	 * @param playerName Name of the player to get gun
	 * @param index Slot of the inventory to get gun
	 * @return A representation of this gun
	 */
	public static FlanGun getGunFromPlayer(String playerName, int index)
	{
		ItemStack stack = playerCheck(playerName, index).inventory.getStackInSlot(index);
		return stack != null && stack.getItem() instanceof ItemGun ? new FlanGun(stack) : null;
	}
	
	/**
	 * Get an ammo from player's inventory.
	 * Throws exception if player with corresponding name is not found
	 * or index is out of the range of player's inventory.
	 * Return null if the item in required slot does not exist or is not
	 * a Flan's mod ammo.
	 * @see FlanAmmo
	 * 
	 * @param playerName Name of the player to get gun
	 * @param index Slot of the inventory to get gun
	 * @return A representation of this ammo
	 */
	public static FlanAmmo getAmmoFromPlayer(String playerName, int index)
	{
		ItemStack stack = playerCheck(playerName, index).inventory.getStackInSlot(index);
		return stack != null && stack.getItem() instanceof ItemShootable ? 
				new FlanAmmo(((ItemShootable)stack.getItem()).type, stack.stackSize) : null;
	}
	
	/**
	 * Set a Flan representation item in player's inventory.
	 * Throws exception if player with corresponding name is not found
	 * or index is out of the range of player's inventory.
	 * @see FlanItem
	 * 
	 * @param playerName Name of the player to get gun
	 * @param index Slot of the inventory to get gun
	 * @param item Flan item to set
	 */
	public static void setFlanItemForPlayer(String playerName, int index, FlanItem item)
	{ playerCheck(playerName, index).inventory
		.setInventorySlotContents(index, item != null ? item.getStack() : null); }
	
	/**
	 * Get a representation of a gun in Flan's mod with given short name.
	 * Return null if corresponding gun does not found.
	 * @see FlanGun
	 * 
	 * @param gunShortName Name of the gun
	 * @return A representation of this gun
	 */
	public static FlanGun getGun(String gunShortName)
	{
		GunType type = GunType.getGun(gunShortName);
		return type != null ? new FlanGun(new ItemStack(type.item)) : null;
	}

	/**
	 * Get a representation of an ammo in Flan's mod with given short name.
	 * Return null if corresponding ammo does not found.
	 * @see FlanAmmo
	 * 
	 * @param ammoShortName Name of the ammo
	 * @return A representation of this ammo
	 */
	public static FlanAmmo getAmmo(String ammoShortName)
	{
		ShootableType type = ShootableType.getTypeByName(ammoShortName);
		return type != null ? new FlanAmmo(type) : null;
	}
	
	/**
	 * A representation of an item in Flan's mod
	 * 
	 * @author Giant_Salted_Fish
	 */
	public static abstract class FlanItem
	{
		/**
		 * @return Short Name of the item
		 */
		public String getShortName() { return getInfoType().shortName; }

		/**
		 * @return Name of the item
		 */
		public String getName() { return getInfoType().name; }
		
		protected abstract InfoType getInfoType();
		
		protected abstract ItemStack getStack();
		
		@Override
		public String toString() { return getShortName(); }
	}
	
	/**
	 * A representation of a gun in Flan's mod
	 * 
	 * @author Giant_Salted_Fish
	 */
	public static class FlanGun extends FlanItem
	{
		private final ItemStack gunStack;
		private final GunType type;
		
		private FlanGun(ItemStack stack)
		{ type = ((ItemGun)(gunStack = stack).getItem()).type; }
		
		/**
		 * @return Whether this is a mag
		 */
		public boolean isMag() { return type.itsType == ItsType.MAG; }
		
		/**
		 * Get the mag in this gun.
		 * This should only be called for guns.
		 * You can use {@link #isMag()} to test if this is a gun.
		 * Return null if it currently does not have a mag
		 * 
		 * @return A representation of the mag in this gun.
		 */
		public FlanGun getMag()
		{
			if(isMag()) throw new IllegalStateException("can not get mag from a mag");
			ItemStack magStack = GunType.getMagStack(gunStack, null);
			return magStack != null ? new FlanGun(magStack) : null;
		}
		
		/**
		 * Set the mag of this gun.
		 * This should only be called for guns.
		 * You can use {@link #isMag()} to test if this is a gun.
		 * If this gun already has a mag, then that mag will disappear.
		 * 
		 * @param gun Gun to set mag
		 * @param mag Mag to set
		 */
		public void setMag(FlanGun gun, FlanGun mag)
		{
			if(gun == null) throw new IllegalArgumentException("gun can not be null");
			if(gun.isMag()) throw new IllegalArgumentException("gun should not be a mag");
			if(mag != null && !mag.isMag()) throw new IllegalArgumentException("mag should not be a gun");
			GunType.setMagStack(gun.gunStack, mag != null ? mag.gunStack : null);
		}
		
		/**
		 * @return Number of bullets this can hold
		 */
		public int getAmmoCapacity() { return type.ammoCapacity; }
		
		/**
		 * Get the ammo in mag at required index.
		 * Call this for gun with param 0 will return the bullet
		 * in barrel.
		 * 
		 * @param index Index of the bullet to get
		 * @return A representation of this ammo, null if it does not exist
		 */
		public FlanAmmo getAmmoAt(int index)
		{
			if(index < 0 || index >= getAmmoCapacity())
				throw new IndexOutOfBoundsException("(" + getAmmoCapacity() + "): " + index);
			ShootableType ammoType = GunType.getAmmoAt(gunStack, index);
			return ammoType != null ? new FlanAmmo(ammoType) : null;
		}
		
		/**
		 * Set the ammo in mag at required index.
		 * Call this for gun with param index 0 will set the bullet
		 * in barrel.
		 * 
		 * @param index Index to set the ammo
		 * @param ammo Ammo to set, null if you want to remove it from the mag
		 */
		public void setAmmoAt(int index, FlanAmmo ammo)
		{
			if(index < 0 || index >= getAmmoCapacity())
				throw new IndexOutOfBoundsException("(" + getAmmoCapacity() + "): " + index);
			GunType.setAmmoAt(gunStack, index, ammo.type);
		}
		
		/**
		 * @return Number of bullets currently in this mag
		 */
		public int getTotalAmmo() { return type.getFirstAmmoAt(gunStack) + 1; }
		
		/**
		 * Try to add a bullet into this mag.
		 * Return false if {@code ammo == null} or this mag is already full.
		 * 
		 * @param ammo Ammo to add
		 * @return True if succeed to add given bullet
		 */
		public boolean addAmmo(FlanAmmo ammo)
		{
			int i = getTotalAmmo();
			if(i >= getAmmoCapacity() || ammo == null) return false;
			GunType.setAmmoAt(gunStack, getTotalAmmo(), ammo.type);
			return true;
		}
		
		/**
		 * Try to remove a bullet from this mag.
		 * 
		 * @return The bullet that has been removed, null if mag is empty
		 */
		public FlanAmmo removeAmmo()
		{
			int i = getAmmoCapacity();
			if(i > 0)
			{
				FlanAmmo ammo = new FlanAmmo(GunType.getAmmoAt(gunStack, i - 1));
				GunType.setAmmoAt(gunStack, i - 1, null);
				return ammo;
			}
			return null;
		}
		
		@Override
		public boolean equals(Object obj)
		{ return obj instanceof FlanGun && gunStack == ((FlanGun)obj).gunStack; }
		
		@Override
		protected InfoType getInfoType() { return type; }
		
		@Override
		protected ItemStack getStack() { return gunStack; }
	}
	
	/**
	 * A representation of the ammo in Flan's mod
	 * 
	 * @author Giant_Salted_Fish
	 */
	public static class FlanAmmo extends FlanItem
	{
		private final ShootableType type;
		private int size = 1;
		
		private FlanAmmo(ShootableType t) { type = t; }
		
		private FlanAmmo(ShootableType t, int s)
		{
			type = t;
			size = s;
		}
		
		/**
		 * @return Number of bullets in this stack
		 */
		public int getSize() { return size; }
		
		/**
		 * Set number of bullets in this stack
		 * 
		 * @param newSize New size to set
		 */
		public void setSize(int newSize) { size = newSize; }
		
		@Override
		public boolean equals(Object obj)
		{ return obj instanceof FlanAmmo && type == ((FlanAmmo)obj).type; }
		
		@Override
		protected InfoType getInfoType() { return type; }
		
		@Override
		protected ItemStack getStack() { return new ItemStack(type.item, size); }
	}

	private static EntityPlayerMP playerCheck(String playerName, int index)
	{
		if(playerName == null) throw new IllegalArgumentException("player name can not be null");
		EntityPlayerMP p = TeamsManager.getPlayer(playerName);
		if(p == null) throw new IllegalArgumentException("player with name <" + playerName + "> is not found");
		if(index < 0 || index > p.inventory.getSizeInventory())
			throw new IndexOutOfBoundsException("index out of bounds(" + p.inventory.getSizeInventory() + "): " + index);
		return p;
	}
}
