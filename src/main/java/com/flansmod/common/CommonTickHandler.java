package com.flansmod.common;

import com.flansmod.common.teams.TeamsManager;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class CommonTickHandler 
{
	public CommonTickHandler() { FMLCommonHandler.instance().bus().register(this); }
	
	@SubscribeEvent
	public void tick(TickEvent.ClientTickEvent event)
	{
		switch(event.phase)
		{
			case START:
				return;
			case END:
				FlansMod.playerHandler.clientTick();
		}
	}
	
	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event)
	{
		switch(event.phase)
		{
			case START:
				return;
			case END:
			{
				TeamsManager.getInstance().tick();
				FlansMod.playerHandler.serverTick();
				FlansMod.ticker++;
			}		
		}
	}
}
