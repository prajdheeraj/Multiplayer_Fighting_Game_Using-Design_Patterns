package com.iit.cs.oodp.exam;

public class Power extends Base implements Composite{
	public int final_value;
	public Power(int value,int multiplier)
	{
		super(value,multiplier);

	}
	public int calculate(Base b)
	{
		int value=b.getBaseValue();
		int multiplier=b.getBaseMultiplier();
		final_value=value+(value*(multiplier/100));
		return final_value;
	}
	public int getFinalValue()
	{
		return final_value;
	}
}