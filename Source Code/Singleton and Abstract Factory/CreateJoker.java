package com.iit.cs.oodp.exam;

import java.awt.Color;

public class CreateJoker extends AbstractFactory{
	private CreateJoker()
	{
	}
	public static CreateJoker getInstance()
	{
		return new CreateJoker();
	}
	Fighter createFighter(){
		return new Fighter("Joker",50,108);
	}
	
}