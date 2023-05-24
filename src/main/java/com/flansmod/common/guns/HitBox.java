package com.flansmod.common.guns;

import java.util.LinkedList;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.ModelDefault;
import com.flansmod.client.model.ModelFlan;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ModifiableType.AttachmentPos;
import com.flansmod.common.vector.Vector3f;

public class HitBox
{
	private static final byte NUM_VERTEX = 8;
	public Vector3f[] coors;
	
	public HitBox(Vector3f[] p) { coors = p; }
	
	public HitBox()
	{
		coors = new Vector3f[NUM_VERTEX];
		for(int i = NUM_VERTEX; --i >= 0; ) coors[i] = new Vector3f();
	}
	
	public HitBox(HitBox toCopy)
	{
		coors = new Vector3f[NUM_VERTEX];
		for(int i = NUM_VERTEX; --i >= 0; ) coors[i] = toCopy.coors[i].copy();
	}
	
	public int parseHitBox(String[] split, int head)
	{
		int i = head;
		++head;
		while(!split[++i].equals("]")) Vector3f.parseVector3f(split[i], coors[i - head]).scale(1F / 16F);
		return i;
	}
	
	public void scale(float f) { for(int i = 8; --i >= 0; ) coors[i].scale(f); }
	
	public void trans(AttachmentPos atPos)
	{
		for(Vector3f vec : coors) vec.set(atPos.x + vec.x, atPos.y + vec.y * atPos.cos - vec.z * atPos.sin, 
				atPos.z + vec.y * atPos.sin + vec.z * atPos.cos);
	}
	
	public float getMaxX()
	{
		float max = coors[0].x;
		for(int i = coors.length; --i > 0; ) if(coors[i].x > max) max = coors[i].x;
		return max;
	}
	
	private static class Plane
	{
		public Vector3f[] coors;
		
		public Plane(int l) { coors = new Vector3f[l]; }
		
		public Plane(Vector3f[] c) { coors = c; }
		
		public Plane set(Vector3f vec0, Vector3f vec1, Vector3f vec2, Vector3f vec3)
		{
			coors[0] = vec0;
			coors[1] = vec1;
			coors[2] = vec2;
			coors[3] = vec3;
			return this;
		}
		
		private static class Planes
		{
			public Plane[] planes;
			
			public Planes(int l)
			{
				planes = new Plane[l];
				while(--l >= 0) planes[l] = new Plane(4);
			}
			
			private static Vector3f vector = new Vector3f(), normal = new Vector3f(), dest[] = new Vector3f[]{ new Vector3f(), new Vector3f() };
			private static byte onDest;
			private void getIntersectionWithLine(Vector3f coor, Vector3f vec)
			{
				onDest = 0;
				Vector3f vec1, vec2, vec3;
				for(Plane p : planes) //check if this line intersects with each plane
				{
					FlansMod.getLinePlaneIntersection(coor.x, coor.y, coor.z, vec.x, vec.y, vec.z, 
							(vec1 = p.coors[0]).x, vec1.y, vec1.z, Vector3f.cross(vec1.x - (vec2 = p.coors[1]).x, vec1.y - vec2.y, vec1.z - vec2.z, 
									vec2.x - (vec3 = p.coors[2]).x, vec2.y - vec3.y, vec2.z - vec3.z, normal).x, normal.y, normal.z, dest[onDest]);
					if(FlansMod.insideBorder(dest[onDest], p.coors) && ++onDest == 2) return; // two intersections max
				}
			}
			
			private boolean conflictsWithCoors(Vector3f coor0, Vector3f coor1)
			{
				vector.set(coor0.x - coor1.x, coor0.y - coor1.y, coor0.z - coor1.z);
				getIntersectionWithLine(coor0, vector);
				if(onDest < 2) return false; // no intersection, no conflict //TODO: sp case: only one hit
				//if(FlansMod.betweenTest(dest[0], coor0, coor1) && FlansMod.betweenTest(dest[1], coor0, coor1)) return true; //bewteen test not needed
				onDest = 0; //use it to count ray test hits
				if(FlansMod.onRayTest(dest[0], coor0.x, coor0.y, coor0.z, vector.x, vector.y, vector.z)) ++onDest;
				if(FlansMod.onRayTest(dest[1], coor0.x, coor0.y, coor0.z, vector.x, vector.y, vector.z)) ++onDest;
				if(onDest == 1) return true; //odd number on ray, return true
				if(FlansMod.onRayTest(dest[0], coor1.x, coor1.y, coor1.z, vector.x, vector.y, vector.z))
					return onDest == 0 ? true : !FlansMod.onRayTest(dest[1], coor1.x, coor1.y, coor1.z, vector.x, vector.y, vector.z);
				return onDest == 2 ? true : FlansMod.onRayTest(dest[1], coor1.x, coor1.y, coor1.z, vector.x, vector.y, vector.z);
			}
			
			private boolean conflictsWithLine(Vector3f coor0, Vector3f coor1)
			{
				vector.set(coor0.x - coor1.x, coor0.y - coor1.y, coor0.z - coor1.z);
				getIntersectionWithLine(coor0, vector);
				if(onDest < 2) return false; // no intersection, no conflict //TODO: sp case: only one hit
				return FlansMod.betweenTest(dest[0], coor0, coor1) && FlansMod.betweenTest(dest[1], coor0, coor1); //bewteen test
			}
		}
	}
	
	private static Plane.Planes planes = new Plane.Planes(6);
	private Plane.Planes toPlanes(Plane.Planes dest)
	{
		Plane[] p = dest.planes;
		p[0].set(coors[0], coors[1], coors[2], coors[3]);
		p[1].set(coors[4], coors[5], coors[6], coors[7]);
		p[2].set(coors[0], coors[1], coors[5], coors[4]);
		p[3].set(coors[1], coors[2], coors[6], coors[5]);
		p[4].set(coors[2], coors[3], coors[7], coors[6]);
		p[5].set(coors[3], coors[0], coors[4], coors[7]);
		return dest;
	}
	
	public boolean conflictsWithBox(HitBox hb)
	{
		/** sp test may be needed */
		hb.toPlanes(planes); //get planes of target box
		int i = 8, j;
		while(--i > 3) if(planes.conflictsWithCoors(coors[i - 4], coors[i])) return true; //8 coors down with this loop
		for(i = 0, j = 3; i < 4; i = (j = i) + 1) if(planes.conflictsWithLine(coors[i], coors[j])) return true; //8 lines left
		for(i = 4, j = 7; i < 8; i = (j = i) + 1) if(planes.conflictsWithLine(coors[i], coors[j])) return true;
		return false;
	}
	
	public boolean conflictsWithEachOther(HitBox hb) { return conflictsWithBox(hb) || hb.conflictsWithBox(this); }
	
	public void renderHitBox(ModelDefault model, float f)
	{
		Vector3f vec;
		for(int i = coors.length; --i >= 0; )
		{
			GL11.glPushMatrix();
			{
				GL11.glTranslatef((vec = coors[i]).x, vec.y, vec.z);
				ModelFlan.bindTex("Color" + i);
				GL11.glScalef(f, f, f);
				model.render(1F / 16F);
			}
			GL11.glPopMatrix();
		}
	}
	
	/*public String toString()
	{
		String s = "[ ";
		for(Vector3f v : coors) s += v.getString() + " ";
		return s + "]";
	}*/
	
	public static class HitBoxes
	{
		HitBox[] hitBoxes;
		
		public HitBoxes(int l) { hitBoxes = new HitBox[l]; }
		
		public static HitBoxes parseHitBoxes(String[] split, HitBoxes dest)
		{
			LinkedList<HitBox> boxes = new LinkedList<HitBox>();
			int i = 0;
			while(++i < split.length) if(split[i].equals("["))
			{
				boxes.add(new HitBox());
				i = boxes.get(boxes.size() - 1).parseHitBox(split, i);
			}
			if(dest != null)
			{
				HitBox[] newHitBoxs = new HitBox[i = dest.hitBoxes.length + boxes.size()];
				while(--i >= dest.hitBoxes.length) newHitBoxs[i] = boxes.get(i - dest.hitBoxes.length);
				while(i >= 0) newHitBoxs[i] = dest.hitBoxes[i--];
				dest.hitBoxes = newHitBoxs;
			}
			else
			{
				dest = new HitBoxes(i = boxes.size());
				while(--i >= 0) dest.hitBoxes[i] = boxes.get(i);
			}
			return dest;
		}
		
		public HitBoxes trans(AttachmentPos atPos)
		{
			for(int i = hitBoxes.length; --i >= 0; ) hitBoxes[i].trans(atPos);
			return this;
		}
		
		public void scale(float f) { for(int i = hitBoxes.length; --i >= 0; ) hitBoxes[i].scale(f); }
		
		public HitBoxes copy()
		{
			HitBoxes copy = new HitBoxes(hitBoxes.length);
			for(int i = hitBoxes.length, j; --i >= 0; ) copy.hitBoxes[i] = new HitBox(hitBoxes[i]);
			return copy;
		}
		
		public HitBoxes get3DHitBoxes(AttachmentPos atPos)
		{
			HitBoxes hitBoxes = copy();
			hitBoxes.trans(atPos);
			return hitBoxes;
		}
		
		public boolean conflictsWithHitBoxes(HitBoxes hbs)
		{
			//FlansModClient.hbs0 = this; FlansModClient.hbs1 = hbs;
			for(HitBox lhb : hitBoxes) for(HitBox rhb : hbs.hitBoxes) if(lhb.conflictsWithEachOther(rhb)) return true;
			return false;
		}
		
		public float getMaxX()
		{
			float max = hitBoxes[0].getMaxX(), f;
			for(int i = hitBoxes.length; --i > 0; ) if((f = hitBoxes[i].getMaxX()) > max) max = f;
			return max;
		}
		
		/** for test
		public String toString()
		{
			String s = "";
			for(HitBox hb : hitBoxes) s += hb.toString() + " ";
			return s;
		}
		/** for test */
		
		public void renderHitBoxes(ModelDefault model, float f) { for(HitBox hb : hitBoxes) hb.renderHitBox(model, f); }
	}
}