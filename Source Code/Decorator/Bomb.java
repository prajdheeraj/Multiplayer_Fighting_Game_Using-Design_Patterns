package com.iit.cs.oodp;
import java.awt.Color;
import java.awt.Graphics;

public class Bomb implements Decorator{
	Decorator d;
	Fighter fighter;
	public Bomb(Decorator dObject,Fighter player)
	{
		dobject = d;
		fighter = player;
	}
	public void draw(Graphics g)
	{     //Draw The Bomb Here
		 d.draw(g);
	}
}
