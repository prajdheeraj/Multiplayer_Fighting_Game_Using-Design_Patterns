package com.iit.cs.oodp.exam;

public class Base
{
	private int basevalue;
	private int basemultiplier;
	public Base(int bv,int bm)
	{
		basevalue=bv;
		basemultiplier=bm;
	}
	public int getBaseValue()
	{
		return basevalue;
	}
	public int getBaseMultiplier()
	{
		return basemultiplier;
	}
}