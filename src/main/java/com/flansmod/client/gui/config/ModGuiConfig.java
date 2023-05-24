package com.flansmod.client.gui.config;

import com.flansmod.common.FlansMod;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen parent)
    {
        super(parent,
                new ConfigElement(FlansMod.configFile.getCategory(FlansMod.CLIENT_SETTINGS)).getChildElements(),
                FlansMod.MODID, false, false, GuiConfig.getAbridgedConfigPath(FlansMod.configFile.toString()));
    }
}
