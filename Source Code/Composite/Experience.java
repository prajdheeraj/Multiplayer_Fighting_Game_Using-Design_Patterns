package com.iit.cs.oodp.exam;

public class Experience extends Base implements Composite{
	public int final_value;
	public Experience(Base ba)
	{
		super(ba.basevalue,ba.basemultiplier);

	}
	public Experience(int value,int multiplier)
	{
		//constructor overloading
		super(value,multiplier);

	}
	public int calculate(Base b)
	{
		int value=b.getBaseValue();
		int multiplier=b.getBaseMultiplier();
		if(game.equals("Win"))
		{
			final_value=value+(value*((multiplier+10)/100));
		}
		else if(game.equals("Lose"))
		{
			final_value=value+(value*((multiplier+3)/100));
		}
		return final_value;
	}
	public int getFinalValue()
	{
		return final_value;
	}
}