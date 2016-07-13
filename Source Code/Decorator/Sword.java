package com.iit.cs.oodp;
import java.awt.Color;
import java.awt.Graphics;

public class Sword implements Decorator{
	protected Decorator d;
	protected Fighter fighter;
	public Sword(Decorator dObject,Fighter player)
	{
		d = dobject;
		fighter = player;
	}
	public void draw(Graphics g)
	{    //Draw The Sword Here
		 d.draw(g); 
	}
}
