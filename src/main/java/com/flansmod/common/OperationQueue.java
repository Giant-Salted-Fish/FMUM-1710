package com.flansmod.common;

public class OperationQueue
{
	//public String playerName;
	
	public static class Operation
	{
		private static byte a = -1;
		// for attachments
		public static final byte UNSTALL_AT = a--, REPOS_AT = a--, REPAINT_AT = a--, 
				PAINTJOB = a--, EX_PAINTJOB = a--, NEXT_AIM_CENTER = a--, 
				LAST_AIM_CENTER = a--, SWITCH_CO_SIGHT = a--, TOGGLE_AT = a--, 
				SWITCH_LASER = a--, SWITCH_LIGHT = a--, NEXT_ZOOM = a--,
				LAST_ZOOM = a--, NEXT_ZOOM_L = a--, LAST_ZOOM_L = a--, SWITCH_DOT = a--;
		// for PacketOperation
		public static final byte CHECK_TAG = 0, SWITCH_MASK = 1, UNLOAD_MAG = 2, 
				LOAD_MAG = 3, ADVANCED_LOAD_MAG = 4, CHARGE_GUN = 5, RELEASE_BOLT = 6, 
				PUSH_BULLET = 7, PULL_BULLET = 8, SET_MAG_USED = 9, SET_MAG_UNUSED = 10, 
				SWITCH_FIREMODE = 11, SWITCH_UNDERBARREL = 12, CHECK_BAG = 13;
		//for play sound
		public static final byte RELOAD_SOUND = -1, EMPTY_CLICK_SOUND = -2, SAFE_EMPTY_CLICK_SOUND = -3, 
				CHARGE_GUN_SOUND = -4, RELEASE_BOLT_SOUND = -5, CHECK_CHAMBER_SOUND = -6, CHECK_AMMO_SOUND = -7;
	}
}
