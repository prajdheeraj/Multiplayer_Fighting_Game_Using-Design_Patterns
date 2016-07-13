package com.iit.cs.oodp.exam;

import java.awt.Color;

public class CreateSubZero extends AbstractFactory{
	private CreateSubZero()
	{
	}
	public static CreateSubZero getInstance()
	{
		return new CreateSubZero();
	}
	Fighter createFighter(){
		return new Fighter("SubZero",50,108);
	}
	
}