package com.iit.cs.oodp.exam;

import java.awt.Color;

public class CreateBatman extends AbstractFactory{
	private CreateBatman()
	{
	}
	public static CreateBatman getInstance()
	{
		return new CreateBatman();
	}
	public Fighter createFighter(){
		return new Fighter("Batman",50,108);
	}
	
}