package com.iit.cs.oodp.exam;

import java.awt.Color;

public class CreateScorpion extends AbstractFactory{
	private CreateScorpion()
	{
	}
	public static CreateScorpion getInstance()
	{
		return new CreateScorpion();
	}
	Fighter createFighter(){
		return new Fighter("Scorpion",50,108);
	}
	
}