package com.iit.cs.oodp.exam;

import java.awt.Color;

public class CreateZoom extends AbstractFactory{
	private CreateZoom()
	{
	}
	public static CreateZoom getInstance()
	{
		return new CreateZoom();
	}
	Fighter createFighter(){
		return new Fighter("Zoom",50,108);
	}
	
}