package com.flansmod.common.types;

import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.ItemMecha;
import com.flansmod.common.driveables.mechas.ItemMechaAddon;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.AAGunType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.boxes.BlockGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.BlockArmourBox;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.tools.ToolType;

public enum EnumType 
{
	part("parts", PartType.class), bullet("bullets", BulletType.class), grenade("grenades", GrenadeType.class), 
	attachment("attachments", AttachmentType.class), gun("guns", GunType.class), aa("aaguns", AAGunType.class), 
	vehicle("vehicles", VehicleType.class), plane("planes", PlaneType.class), mechaItem("mechaItems", MechaItemType.class), 
	mecha("mechas", MechaType.class), tool("tools", ToolType.class), armour("armorFiles", ArmourType.class), 
	armourBox("armorBoxes", ArmourBoxType.class), box("boxes", GunBoxType.class), playerClass("classes", PlayerClass.class), 
	team("teams", Team.class); //, itemHolder("itemHolders")
	
	public final String folderName;
	public final Class<? extends InfoType> typeClass;
	
	private EnumType(String s, Class<? extends InfoType> tc)
	{
		folderName = s;
		typeClass = tc;
	}
	
	public static EnumType get(String s)
	{
		for(EnumType e : values()) if(e.folderName.equals(s)) return e;
		return null;
	}
	
	/*public Class<? extends InfoType> getTypeClass()
	{
		switch(this)
		{
			case bullet: 		return BulletType.class;
			case aa: 			return AAGunType.class;
			case vehicle:		return VehicleType.class;
			case plane: 		return PlaneType.class;
			case mechaItem: 	return MechaItemType.class;
			case mecha: 		return MechaType.class;
			case attachment: 	return AttachmentType.class;
			case gun: 			return GunType.class;
			case grenade: 		return GrenadeType.class;
			case tool:			return ToolType.class;
			case armour: 		return ArmourType.class;
			case armourBox: 	return ArmourBoxType.class;
			case playerClass:	return PlayerClass.class;
			case team:			return Team.class;
			case box:			return GunBoxType.class;
			case part:			return PartType.class;
			default: 			return InfoType.class;
		}
	}*/

	public static EnumType getFromObject(Object o)
	{
		if(o instanceof MechaType 			|| o instanceof ItemMecha		|| o instanceof EntityMecha) 	return mecha;
		if(o instanceof PlaneType 			|| o instanceof ItemPlane 		|| o instanceof EntityPlane) 	return plane;
		if(o instanceof VehicleType			|| o instanceof ItemVehicle 	|| o instanceof EntityVehicle) 	return vehicle;
		if(o instanceof BulletType			|| o instanceof ItemBullet		|| o instanceof EntityBullet) 	return bullet;
		if(o instanceof AAGunType			|| o instanceof ItemAAGun		|| o instanceof EntityAAGun) 	return aa;
		if(o instanceof MechaItemType  		|| o instanceof ItemMechaAddon) 								return mechaItem;
		if(o instanceof AttachmentType  	|| o instanceof ItemAttachment) 								return attachment;
		if(o instanceof GunType  			|| o instanceof ItemGun  		|| o instanceof EntityMG) 		return gun;
		if(o instanceof GrenadeType 		|| o instanceof ItemGrenade 	|| o instanceof EntityGrenade) 	return grenade;
		if(o instanceof ToolType 			|| o instanceof ItemTool) 										return tool;
		if(o instanceof ArmourType  		|| o instanceof ItemTeamArmour) 								return armour;
		if(o instanceof ArmourBoxType  		|| o instanceof BlockArmourBox) 								return armourBox;
		if(o instanceof PlayerClass) 																		return playerClass;
		if(o instanceof Team) 																				return team;
		if(o instanceof GunBoxType  		|| o instanceof BlockGunBox) 									return box;
		if(o instanceof PartType  			|| o instanceof ItemPart) 										return part;
		return null;
	}
}