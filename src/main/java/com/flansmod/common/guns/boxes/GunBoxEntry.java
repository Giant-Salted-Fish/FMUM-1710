package com.flansmod.common.guns.boxes;

import java.util.ArrayList;
import java.util.List;

import com.flansmod.common.types.InfoType;

import net.minecraft.item.ItemStack;

public class GunBoxEntry
{
    public InfoType type;
    public List<ItemStack> requiredParts;
    public List<GunBoxEntry> ammoEntryList;

    public GunBoxEntry(InfoType aType, List<ItemStack> aParts)
    {
        type = aType;
        requiredParts = aParts;
    }

    public void addAmmoEntry(GunBoxEntry ammo)
    {
        if(ammoEntryList == null)
            ammoEntryList = new ArrayList<GunBoxEntry>();
        ammoEntryList.add(ammo);
    }

    public boolean isAmmoNullOrEmpty()
    {
        if(ammoEntryList == null || ammoEntryList.isEmpty())
            return true;
        else
            return false;
    }
}
