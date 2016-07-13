package com.iit.cs.oodp.exam;

import java.awt.Color;

public class CreateFlash extends AbstractFactory{
	private CreateFlash()
	{
	}
	public static CreateFlash getInstance()
	{
		return new CreateFlash();
	}
	Fighter createFighter(){
		return new Fighter("Flash",50,108);
	}
	
}