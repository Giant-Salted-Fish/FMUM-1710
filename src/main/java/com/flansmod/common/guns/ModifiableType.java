package com.flansmod.common.guns;

import java.lang.reflect.Field;
import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedList;
import java.util.List;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.AttachmentType.AttachmentTag;
import com.flansmod.common.guns.HitBox.HitBoxes;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagByteArray;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagIntArray;
import net.minecraft.nbt.NBTTagList;

public abstract class ModifiableType extends PaintableType
{
	public AttachableSlot[] slots = new AttachableSlot[0];
	public byte itsType = ItsType.DEFAULT;
	public LinkedList<Integer> neededToShoot = null, neededToAuto = null, neededToCharge = null;
	public HitBoxes bigHitBox = null, hitBox = null;
	public float aimCenterY = 0F, aimCenterZ = 0F;
	
	private static Field fieldTagList;
	static
	{
		try { fieldTagList = NBTTagList.class.getDeclaredField("field_74747_a"); }
		catch(Exception e) { }
		if(fieldTagList == null)
		{
			try { fieldTagList = NBTTagList.class.getDeclaredField("tagList"); }
			catch(Exception e) { }
		}
		if(fieldTagList == null) FlansMod.log("Fatal Error: can not get field NBTTagList.class.tagList");
		else fieldTagList.setAccessible(true);
	}
	
	public static List getListFromTagList(NBTTagList target)
	{
		try { return (List)fieldTagList.get(target); }
		catch(Exception e) { return null; }
	}
	
	public static NBTTagList getTagListFromTagList(NBTTagList target, int i)
	{
		try { return (NBTTagList)((List)fieldTagList.get(target)).get(i); }
		catch(Exception e) { return null; }
	}
	
	public static NBTTagByteArray getByteArrayTagFromTagList(NBTTagList target, int i)
	{
		try { return (NBTTagByteArray)((List)fieldTagList.get(target)).get(i); }
		catch(Exception e) { return null; }
	}
	
	public static byte[] getByteArrayFromTagList(NBTTagList target, int i)
	{
		try { return ((NBTTagByteArray)((List)fieldTagList.get(target)).get(i)).func_150292_c(); }
		catch(Exception e) { return null; }
	}
	
	public ModifiableType(TypeFile file) { super(file); }
	
	@Override
	public void preRead(TypeFile file) { super.preRead(file); }
	
	@Override
	public void postRead(TypeFile file)
	{
		super.postRead(file);
		aimCenterY *= modelScale;
		aimCenterZ *= modelScale;
		for(int i = slots.length; --i >= 0; ) slots[i].applyModelScale(modelScale);
		if(bigHitBox == null) return;
		bigHitBox.scale(modelScale);
		if(hitBox == null) hitBox = bigHitBox;
		else hitBox.scale(modelScale);
	}
	
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("AimCenter"))
			{
				aimCenterY = Float.parseFloat(split[1]) / 16F;
				if(split.length > 2) aimCenterZ = Float.parseFloat(split[2]) / 16F;
			}
			else if(split[0].equals("AttachPoints"))
			{
				slots = new AttachableSlot[(split.length - 1) / 3];
				for(int i = 3; i < split.length; i += 3) (slots[i / 3 - 1] = new AttachableSlot()).attachPos.set(
							Float.parseFloat(split[i - 2]) / 16F, Float.parseFloat(split[i - 1]) / 16F, Float.parseFloat(split[i]) / 16F);
			}
			else if(split[0].equals("AttachVectors"))
				for(int i = 2; i < split.length; i += 2) slots[(i >>> 1) - 1].setStepVec(Float.parseFloat(split[i - 1]) / 16F, Short.parseShort(split[i]));
			else if(split[0].equals("AttachRotates")) for(int i = split.length; --i > 0; ) slots[i - 1].attachRot = Float.parseFloat(split[i]);
			else if(split[0].equals("MaxAttachments")) for(int i = 1; i < split.length; ++i) slots[i - 1].maxCanAttach = Byte.parseByte(split[i]);
			else if(split[0].equals("BigHitBox")) bigHitBox = HitBoxes.parseHitBoxes(split, bigHitBox);
			else if(split[0].equals("HitBox")) hitBox = HitBoxes.parseHitBoxes(split, hitBox);
			else if(split[0].equals("NeededToShoot"))
			{
				neededToShoot = new LinkedList<Integer>();
				for(int i = split.length; --i > 0; ) neededToShoot.add(split[i].hashCode());
			}
			else if(split[0].equals("NeededToAuto"))
			{
				neededToAuto = new LinkedList<Integer>();
				for(int i = split.length; --i > 0; ) neededToAuto.add(split[i].hashCode());
			}
			else if(split[0].equals("NeededToCharge"))
			{
				neededToCharge = new LinkedList<Integer>();
				for(int i = split.length; --i > 0; ) neededToCharge.add(split[i].hashCode());
			}
			else
			{
				byte listType;
				if(split[0].equals("AttachmentWhitelist")) listType = 0;
				else if(split[0].equals("AttachmentBlacklist")) listType = 1;
				else if(split[0].equals("TypeWhitelist")) listType = 2;
				else if(split[0].equals("TypeBlacklist")) listType = 3;
				else return;
				int head = 1, end = 1, onSlot = 0;
				while(end < split.length)
				{
					if(split[end].equals("next"))
					{
						if(head != end) parseList(split, head, end, onSlot, listType);
						head = ++end;
						++onSlot;
					}
					else ++end;
				}
				if(head != end) parseList(split, head, end, onSlot, listType);
			}
		}
		catch(Exception e)
		{
			String line = split[0];
			for(int i = 1; i < split.length; ++i) line += " " + split[i];
			FlansMod.log("error > failed to parse line <" + line + "> for modifiable item <" + shortName + ">");
			if(FlansMod.printStackTrace) e.printStackTrace();
		}
	}
	
	private void parseList(String[] split, int head, int end, int onSlot, byte listType)
	{
		if(listType > 1) parseTypeList(split, head, end, onSlot, listType == 2);
		else parseAttachmentList(split, head, end, onSlot, listType == 0);
	}
	
	private void parseAttachmentList(String[] split, int head, int end, int onSlot, boolean whitelist)
	{
		String[] s = new String[end - head];
		for(int i = head; i < end; ++i) s[i - head] = split[i];
		if(whitelist) slots[onSlot].attachmentWhitelist = s;
		else slots[onSlot].attachmentBlacklist = s;
	}
	
	private void parseTypeList(String[] split, int head, int end, int onSlot, boolean whitelist)
	{
		int[] a = new int[end - head];
		for(int i = head; i < end; ++i) a[i - head] = split[i].hashCode();
		if(whitelist) slots[onSlot].typeWhitelist = a;
		else slots[onSlot].typeBlacklist = a;
	}
	
	public static class ItsType
	{
		public static final byte MAG = -1, AUTO_GUN = 1, BOLT_GUN = 2;
		public static final byte BARREL = -1, MUZZLE = -2, BOLT = -3, SIGHT = -4, CHARGING_HANDLE = -5, ALT_CHARGE_HANDLE = -6, 
				HANDGUARD = -7, GRIP = -8, BUFFER_TUBE = -9, STOCK = -10, PISTON = -11, REAR_GRIP = -12; 
		public static final byte DEFAULT = 0, NONE = -128;
		// sp type
		public static final byte LASER = 1, LIGHT = 2, CO_SIGHT_FLIPPED = 3, TOGGLABLE = 4;
	}
	
	public static class ModifiableTag
	{
		public static final String STATES = "st", PR_LIST = "pr";
		public static final int EX_PAINT_MASK = -1 >>> 17;
	}
	
	/* methods for states */
	public static int[] getStates(NBTTagCompound tag) { return ((NBTTagIntArray)tag.getTag(ModifiableTag.STATES)).func_150302_c(); }
	
	public static void setState(int[] states, byte i, float toSet) { states[i] = Float.floatToIntBits(toSet); }
	
	public static float getState(int[] states, byte i) { return Float.intBitsToFloat(states[i]); }
	
	/* methods for attachments */
	public static NBTTagList getPRList(NBTTagCompound tag) { return ((NBTTagList)tag.getTag(ModifiableTag.PR_LIST)); }
	
	public static NBTTagCompound getAtTagAt(NBTTagCompound atTag, int onPR, int num)
	{ return getTagListFromTagList(getPRList(atTag), onPR).getCompoundTagAt(num); }
	
	public static NBTTagCompound getAtTagAt(NBTTagCompound atTag, byte[] at, int len)
	{
		for(int i = 0; i < len; i += 2) atTag = getTagListFromTagList(getPRList(atTag), at[i]).getCompoundTagAt(at[i + 1]);
		return atTag;
	}
	
	public static AttachmentType getAtTypeAt(NBTTagCompound atTag, byte[] at, int len)
	{ return AttachmentType.getAtType(getAtTagAt(atTag, at, len)); }
	
	private static AttachmentPos atPos = new AttachmentPos();
	public boolean checkAtConflicts(HitBoxes itsBigHBs, HitBoxes itsHBs, NBTTagCompound baseTag, 
			int nextOn, float lastX, float lastY, float lastZ, float rotX)
	{
		float sin = (float)Math.toRadians(rotX), cos = (float)Math.cos(sin), x, y, z; //TODO:
		sin = (float)Math.sin(sin);
		Vector3f vec;
		NBTTagList prList = getPRList(baseTag), prTag;
		for(byte i = (byte)prList.tagCount(), j; --i >= 0; )
		{
			x = lastX + (vec = slots[i].attachPos).x;
			y = lastY + vec.y * cos - vec.z * sin;
			z = lastZ + vec.y * sin + vec.z * cos;
			for(j = (byte)(prTag = getTagListFromTagList(prList, i)).tagCount(); --j >= 0; )
			{
				if(AttachmentType.getTOF(AttachmentType.getStates(baseTag = prTag.getCompoundTagAt(j)), AttachmentTag.AVOID_CHECK_ON)) continue;
				if(AttachmentType.getAtType(baseTag).checkAtConflicts(itsBigHBs, itsHBs, baseTag, 
						nextOn + 2, x + AttachmentType.getPos(baseTag), y, z, rotX + slots[i].attachRot)) return true;
			}
		}
		if(bigHitBox == null) return false;
		atPos.set(lastX, lastY, lastZ).rotX = rotX;
		return bigHitBox.get3DHitBoxes(atPos.updateTriValues()).conflictsWithHitBoxes(itsBigHBs) ? hitBox.get3DHitBoxes(atPos).conflictsWithHitBoxes(itsHBs) : false;
	}
	
	public boolean checkConflictsAfterMovingAt(NBTTagCompound atTag, AttachmentPos atPos, float xOffset, byte[] at, int curOn, ItemStack gunStack, GunType gunType)
	{
		NBTTagList prList = getPRList(atTag), prTag;
		int[] atStates = getStates(atTag);
		AttachmentType.setTOFOn(atStates, AttachmentTag.AVOID_CHECK_ON); //avoid checking with it self
		for(byte i = (byte)prList.tagCount(), j; (at[curOn] = --i) >= 0; ) for(j = (byte)(prTag = getTagListFromTagList(prList, i)).tagCount(); (at[curOn + 1] = --j) >= 0; )
			if(AttachmentType.getAtType(atTag = prTag.getCompoundTagAt(j)).checkConflictsAfterMovingAt(atTag, atPos, xOffset, at, curOn + 2, gunStack, gunType))
			{
				AttachmentType.setTOFOff(atStates, AttachmentTag.AVOID_CHECK_OFF);
				return true;
			}
		getPosOfAttachableAt(atPos, at, curOn).x += xOffset;
		AttachmentType atType = (AttachmentType)this;
		boolean res = atType.bigHitBox != null && gunType.checkAtConflicts(atType.bigHitBox.get3DHitBoxes(atPos.updateTriValues()), 
				atType.hitBox.get3DHitBoxes(atPos), gunStack.stackTagCompound, 0, 0F, 0F, 0F, 0F);
		AttachmentType.setTOFOff(atStates, AttachmentTag.AVOID_CHECK_OFF);
		/*if(!res)*/ atPos.resetAtTag(gunStack.stackTagCompound, gunType); //reset the atPos we just used so outer can use this again
		return res;
	}
	
	/* undefined */
	public boolean[] checkCanOperate(NBTTagCompound baseTag, boolean[] cans)
	{
		LinkedList<Integer> shootNeed = new LinkedList<Integer>();
		if(neededToShoot != null) shootNeed.addAll(neededToShoot);
		LinkedList<Integer> autoNeed = new LinkedList<Integer>();
		if(neededToAuto != null) autoNeed.addAll(neededToAuto);
		LinkedList<Integer> chargeNeed = new LinkedList<Integer>();
		if(neededToCharge != null) chargeNeed.addAll(neededToCharge);
		NBTTagList prList = getPRList(baseTag), prTag;
		AttachmentType atType;
		for(Integer i = prList.tagCount(), j, intType; --i >= 0; )
		{
			for(j = (prTag = getTagListFromTagList(prList, i)).tagCount(); --j >= 0; )
			{
				(atType = AttachmentType.getAtType(baseTag = prTag.getCompoundTagAt(j))).checkCanOperate(baseTag, cans);
				shootNeed.remove(intType = atType.attachmentType);
				autoNeed.remove(intType);
				chargeNeed.remove(intType);
			}
		}
		if(cans[0]) cans[0] = shootNeed.size() == 0;
		if(cans[1]) cans[1] = autoNeed.size() == 0;
		if(cans[2]) cans[2] = chargeNeed.size() == 0;
		return cans;
	}
	
	/* methods to assist */
	/** take care this method does not allow at.length to be smaller than 2 */
	public static NBTTagCompound getAttachmentTagAt_T(NBTTagList prList, byte[] at, int len)
	{
		int i = -1, a; len -= 4;
		while(i < len)
		{
			if((a = at[++i]) >= 0 && a < prList.tagCount()) prList = getTagListFromTagList(prList, a);
			else return null;
			if((a = at[++i]) >= 0 && a < prList.tagCount()) prList = getPRList(prList.getCompoundTagAt(a));
			else return null;
		}
		if((a = at[++i]) >= 0 && a < prList.tagCount()) prList = getTagListFromTagList(prList, a);
		else return null;
		return (a = at[++i]) >= 0 && a < prList.tagCount() ? prList.getCompoundTagAt(a) : null;
	}
	
	public void recordSights(NBTTagCompound baseAtTag, byte[] lastOnAt, Vector3f lastOnPos, float rot, LinkedList<SimpleEntry<byte[], Vector3f>> sights)
	{	// temply use transX to storage radians value
		float transX = (float)Math.toRadians(rot), sin = (float)Math.sin(transX), cos = (float)Math.cos(transX);
		if(itsType == ItsType.SIGHT) // trick for gun(type never match)
		{	// if fit requirement, record it
			Vector3f itsPos = lastOnPos.copy();
			AttachmentType thisType = (AttachmentType)this;
			itsPos.y += thisType.aimCenterY * cos - thisType.aimCenterZ * sin;
			itsPos.z += thisType.aimCenterY * sin + thisType.aimCenterZ * cos;
			if(((AttachmentType)this).FOVZoomLevel[0] > 0F) // scope has sp MARK
			{
				byte[] scopeAt = new byte[lastOnAt.length + 1];
				for(int i = lastOnAt.length; --i >= 0; ) scopeAt[i] = lastOnAt[i];
				sights.add(new SimpleEntry<byte[], Vector3f>(scopeAt, itsPos));
			}
			else sights.add(new SimpleEntry<byte[], Vector3f>(FlansMod.copyByteArray(lastOnAt), itsPos));
		}
		byte[] onAt = new byte[lastOnAt.length + 2];
		for(int i = lastOnAt.length; --i >= 0; ) onAt[i] = lastOnAt[i];
		Vector3f onPos = lastOnPos.copy(), posVec;
		NBTTagList prList = getPRList(baseAtTag), prTag;
		NBTTagCompound atTag;
		for(byte i = (byte)prList.tagCount(), j; (onAt[lastOnAt.length] = --i) >= 0; )
		{	// to that pr
			onPos.translate((posVec = slots[i].attachPos).x, posVec.y * cos - posVec.z * sin, posVec.y * sin + posVec.z * cos);
			for(j = (byte)(prTag = getTagListFromTagList(prList, i)).tagCount(); (onAt[onAt.length - 1] = --j) >= 0; )
			{
				onPos.x += (transX = AttachmentType.getPos(atTag = prTag.getCompoundTagAt(j)));
				AttachmentType.getAtType(atTag).recordSights(atTag, onAt, onPos, rot + slots[i].attachRot, sights);
				onPos.x -= transX; // done one at, subtract back x trans
			}
			onPos.set(lastOnPos); // done one pr, set back pos vec
		}
	}
	
	public static class AttachmentPos
	{
		public float x, y, z, rotX, sin, cos;
		public NBTTagCompound atTag;
		public ModifiableType atType;
		
		public AttachmentPos() { }
		
		public AttachmentPos(NBTTagCompound tag, ModifiableType baseType) { atTag = tag; atType = baseType; }
		
		/**
		 * reset this AtPos with new baseTag and new baseType, this will also set x, y, z, rotX, sin and cos to 0F
		 * @param newTag newTag to set
		 * @param newType new Type to set
		 * @return this AtPos
		 */
		public AttachmentPos resetAtTag(NBTTagCompound newTag, ModifiableType newType)
		{
			atTag = newTag;
			atType = newType;
			x = y = z = rotX = sin = cos = 0F;
			return this;
		}
		
		public AttachmentPos set(float a, float b, float c)
		{
			x = a;
			y = b;
			z = c;
			return this;
		}
		
		public AttachmentPos updateTriValues()
		{
			sin = (float)Math.sin(cos = (float)Math.toRadians(rotX));
			cos = (float)Math.cos(cos);
			return this;
		}
	}
	
	/**
	 * method to get the 3D-position of specified attachment installed on gun
	 * @param baseType
	 * @param atPos input an atPos with atTag, can use new AttachmentPos(ItemStack) to create one
	 * @param at put the location of the attachment, be care this does not tolerate any error
	 * @return atPos with attachment's x, y, z, x-rot, sin, cos, atTag
	 */
	public static AttachmentPos getPosOfAttachableAt(AttachmentPos atPos, byte[] at, int len)
	{
		Vector3f vec;
		for(int i = 0; i < len; i += 2)
		{
			atPos.x += (vec = atPos.atType.slots[at[i]].attachPos).x + AttachmentType.getPos(
					atPos.atTag = getTagListFromTagList(getPRList(atPos.atTag), at[i]).getCompoundTagAt(at[i + 1]));
			atPos.y += vec.y * atPos.updateTriValues().cos - vec.z * atPos.sin;
			atPos.z += vec.y * atPos.sin + vec.z * atPos.cos;
			atPos.rotX += atPos.atType.slots[at[i]].attachRot;
			atPos.atType = AttachmentType.getAtType(atPos.atTag);
		}
		return atPos;
	}
	
	public static float getXCoorOfAtAt(NBTTagCompound baseTag, ModifiableType baseType, byte[] at)
	{ return getXCoorOfAtAt(baseTag, baseType, at, at.length); }
	
	public static float getXCoorOfAtAt(NBTTagCompound baseTag, ModifiableType baseType, byte[] at, int len)
	{
		float x = 0F;
		for(int i = 0; i < len; i += 2)
		{
			x += baseType.slots[at[i]].attachPos.x 
					+ AttachmentType.getPos(baseTag = getTagListFromTagList(getPRList(baseTag), at[i]).getCompoundTagAt(at[i + 1]));
			baseType = AttachmentType.getAtType(baseTag);
		}
		return x;
	}
	
	public float getGunLength(NBTTagCompound baseTag, float x)
	{
		float max = x, tempX;
		if(hitBox != null) max += hitBox.getMaxX();
		NBTTagList prList = getPRList(baseTag), prTag;
		NBTTagCompound atTag;
		for(int i = prList.tagCount(), j; --i >= 0; ) for(j = (prTag = getTagListFromTagList(prList, i)).tagCount(); --j >= 0; )
		{
			if((tempX = AttachmentType.getAtType(atTag = prTag.getCompoundTagAt(j))
					.getGunLength(atTag, x + slots[i].attachPos.x + AttachmentType.getPos(atTag))) > max) max = tempX;
		}
		return max;
	}
}
