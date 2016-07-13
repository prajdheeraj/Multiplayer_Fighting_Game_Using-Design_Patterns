package com.iit.cs.oodp.exam;

import java.awt.*;

public class Fighter extends MortalFighter implements Moves{
	private static defaultLevel=0;
	Level fighter_level=new Level();
	public Fighter(String id,int x,int y) {
		super(id,x,y);
	}
	public void draw(Graphics g) {
		int X = getX( );    
		int Y = getY( ); 
		String fighter=getID();
		//draw the fighter based on the character
		if(fighter.equalsIgnorecase("Batman"))
		{
			system.out.println("Batman Character Created");
		}else if(fighter.equals("Joker"))
		{
			system.out.println("Joker Character Created");
		}else if(fighter.equals("Flash"))
		{
			system.out.println("Flash Character Created");
		}else if(fighter.equals("Zoom"))
		{
			system.out.println("Zoom Character Created");
		}else if(fighter.equals("Scorpion"))
		{
			system.out.println("Scorpion Character Created");
		}else if(fighter.equals("SubZero"))
		{
			system.out.println("SubZero Character Created");
		}
		//Here goes the code to create those characters using fillPolygon or fillArc and/or setColor.

	}
	public int getFighterLevel()
	{
		return fighter_level.getFinalValue();

	}
	public void kick_power_calculator() {
		int Basic (int)(Math.random()*10);
		int Special =(int)(Math.random()*10);
		int Combo =(int)(Math.random()*7)
		int combo_power=Combo*basic_kick;
		int basic_power=Basic*basic_kick;
		int special_power=Special*special_kick;
}