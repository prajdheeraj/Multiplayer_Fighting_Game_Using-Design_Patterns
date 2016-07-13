package com.iit.cs.oodp.exam;

public class Level extends Base implements Composite{
	public int final_value;
	public Level(int value,int multiplier)
	{
		super(value,multiplier);

	}
	public int calculate(Base b)
	{
		int value=b.getBaseValue();
		int multiplier=b.getBaseMultiplier();
		Base XP=new Experience(b);
		int finalXP=XP.getFinalValue();
		if(XP>100 && XP < 200)
		{	//level 1 upgrade from level 0
			final_value=value+multiplier;
		}
		else if(XP>200 && XP < 300)
		{
			//level 2 upgrade from level 1
			final_value=value+multiplier;
		}
		else if(XP>300)
		{	
			//level 3 upgrade from level 2 max level
			final_value=value+multiplier;
		}
		else
		{
			//level 3 max so keep it that way.
			final_value=0;
		}
		return final_value;
	}
	public int getFinalValue()
	{
		return final_value;
	}
}