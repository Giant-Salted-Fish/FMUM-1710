package com.flansmod.common.guns;

import java.util.LinkedList;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.AttachmentType.AttachmentTag;
import com.flansmod.common.parts.PartType;

import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class DefaultAts
{
	public ModifiableType ownerType = null;
	float pos = 0F;
	short dam = 0;
	public LinkedList[] defaultAts = null;
	
	public DefaultAts() { }
	
	public DefaultAts(ModifiableType ot) { ownerType = ot; }
	
	public int parseDefaultAts(String[] split, int head)
	{
		defaultAts = new LinkedList[ownerType.slots.length]; // init value
		DefaultAts onReadingDA = null;
		byte onReading = 0;
		for(int onPR = 0; ++head < split.length && !split[head].equals("]"); )
		{
			if(split[head].equals("["))
			{
				head = ((DefaultAts)defaultAts[onPR].get(defaultAts[onPR].size() - 1)).parseDefaultAts(split, head);
				onReading = 0;
			}	// not [
			else if(split[head].equals("next")) { ++onPR; onReading = 0; }
			else switch(onReading)
			{
				case 0: //type reading
					if(defaultAts[onPR] == null) defaultAts[onPR] = new LinkedList<DefaultAts>();
					defaultAts[onPR].add(onReadingDA = new DefaultAts());
					if((onReadingDA.ownerType = AttachmentType.getAttachment(split[head])) == null)
					{
						defaultAts[onPR].remove(defaultAts[onPR].size() - 1);
						FlansMod.log("can not find default at <" + split[head] + "> for at <" + ownerType.shortName + ">");
						//++head; if not valid type, jump pos read
						continue;
					}
					else ++onReading;
					break;
				case 1: //trans step
					onReadingDA.pos = ownerType.slots[onPR].attachVec * Short.parseShort(split[head]);
					++onReading;
					break;
				case 2: //offset
					onReadingDA.pos += ((AttachmentType)onReadingDA.ownerType).attachOffset[Byte.parseByte(split[head])];
					++onReading;
					break;
				case 3: //paintjob
					if(FlansMod.isInt(split[head])) dam = Short.parseShort(split[head]);
					else
					{
						PartType p = PartType.getPart(split[head]);
						if(p == null) FlansMod.log("can not find paintjob Part <" + split[head] + "> for default at <" + onReadingDA.ownerType.shortName + ">");
						else dam = (short)(Item.getIdFromItem(p.item) | (1 << 15));
					}
				default: onReading = 0; break;
			}
		}
		return head;
	}
	
	public void addDefaultAttachmentToTag(NBTTagCompound atTag)
	{
		NBTTagList prList = ModifiableType.getPRList(atTag), prTag;
		DefaultAts toAddDA;
		for(int i = ownerType.slots.length; --i >= 0; )
		{
			if(defaultAts[i] == null) continue; // no at on this slot, continue
			prTag = ModifiableType.getTagListFromTagList(prList, i);
			for(int j = defaultAts[i].size(), atStates[]; --j >= 0; )
			{
				prTag.appendTag(atTag = ((AttachmentType)(toAddDA = (DefaultAts)defaultAts[i].get(j)).ownerType).writeAttachableToTag((short)0, null));
				ModifiableType.setState(atStates = ModifiableType.getStates(atTag), AttachmentTag.POS, toAddDA.pos); // set init pos for at added
				AttachmentType.setAtDam(atStates, toAddDA.dam);
				if(toAddDA.defaultAts != null) toAddDA.addDefaultAttachmentToTag(atTag);
			}
		}
	}
}