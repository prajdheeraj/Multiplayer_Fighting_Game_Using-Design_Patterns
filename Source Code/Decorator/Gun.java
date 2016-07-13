package com.iit.cs.oodp;
import java.awt.Color;
import java.awt.Graphics;

public class Gun implements Decorator{
	Decorator d;
	Fighter fighter;
	public Gun(Decorator dObject,Fighter player)
	{
		d = dobject;
		fighter = player;
	}
	public void draw(Graphics g)
	{ //Draw The Gun Here
	  d.draw(g);
	}
}
