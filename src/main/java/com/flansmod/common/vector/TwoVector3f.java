package com.flansmod.common.vector;

public class TwoVector3f
{
	public float x1, y1, z1, x2, y2, z2;
	
	public TwoVector3f() { }
	
	public TwoVector3f(Vector3f vecA, Vector3f vecB)
	{
		x1 = vecA.x;
		y1 = vecA.y;
		z1 = vecA.z;
		x2 = vecB.x;
		y2 = vecB.y;
		z2 = vecB.z;
	}
	
	public TwoVector3f(float xa, float ya, float za, float xb, float yb, float zb) 
	{
		x1 = xa;
		y1 = ya;
		z1 = za;
		x2 = xb;
		y2 = yb;
		z2 = zb;
	}
	
	public TwoVector3f(float a) { this(a, a, a, a, a, a); }
	
	public TwoVector3f set1(float x, float y, float z)
	{
		x1 = x;
		y1 = y;
		z1 = z;
		return this;
	}
	
	public TwoVector3f set2(float x, float y, float z)
	{
		x2 = x;
		y2 = y;
		z2 = z;
		return this;
	}
	
	public TwoVector3f trans1(float x, float y, float z)
	{
		x1 += x;
		y1 += y;
		z1 += z;
		return this;
	}
	
	public TwoVector3f trans2(float x, float y, float z)
	{
		x2 += x;
		y2 += y;
		z2 += z;
		return this;
	}
}