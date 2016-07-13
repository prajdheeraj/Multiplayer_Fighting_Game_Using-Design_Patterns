package com.iit.cs.oodp.exam;

import java.awt.Graphics;


import javax.swing.JApplet;

public class GameClientDemo extends JApplet{
	private AbstractFactory pf;
	private Fighter player;
	private Fighter opponent;
	private Strategy sr;
	Observable co;
	Decorator dobject;
	  private static final long serialVersionUID = 1L;


	Context context = new Context();
	Healthy healthy = new Healthy();
	Weak weak = new Weak();
	Dead dead= new Dead();
      
	Base base;
		 public void init( ) {
			 resize(500,200);
			 Arena.loadArena("file.gif");//code to load arena;
			    pf=FactoryMaker.getFactoryInstance("Batman");
			    player=pf.createFighter();
			    if(player.getFighterLevel()==0)
			    {
			    	sr=new Strategy("batman");
			    	opponent=sf.findOpponent();
			    	Level l=new Level(0,1);
			    }
			    else if(player.getFighterLevel()==1)
			    {
			    	sr=new Strategy("batman");
			    	opponent=sf.findOpponent();
			    	Level l=new Level(1,1);
			    	dobject=new WeaponDecorator(new Bomb());

			    }else if(player.getFighterLevel()==2)
			    {
			    	sr=new Strategy("batman");
			    	opponent=sf.findOpponent();
			    	Level l=new Level(2,1);
			    	dobject=new WeaponDecorator(new Sword());
			    }else if(player.getFighterLevel()==3)
			    {
			    	sr=new Strategy("batman");
			    	opponent=sf.findOpponent();
			    	Level l=new Level(3,1);
			    	dobject=new WeaponDecorator(new Gun());
			    }
			    //Code for other Players Selected 
		 }
		 public void paint( Graphics g ) {
		 for ( int i = 0; i < getWidth( )/7; i++ )      
		    {

		    	healthy.gameplay(context);
				System.out.println(context.getState().toString());
				co = new ConcreteObservable(healthy);
				co.notify();
		    	dobject.draw(g);
		      	player.draw(g);
		      	opponent.draw(g);
		      	//Code for fight to happen
		      	//The State sets to Weak in between
		      	weak.gameplay(context);
				System.out.println(context.getState().toString());
				co = new ConcreteObservable(weak);
				co.notify();
				//when the game ends the state sets to dead
		      	dead.gameplay(context);
		      	co = new ConcreteObservable(dead);
		      	co.notify();
		      	//Some code to Restart Game or Quit Game here
		      	if(base!=null)
		      	{
		      		Experience e=new Experience(base);
		      		Power p=new Power(base.getValue,base.getMultiplier);
		      		Level l= new Level(base.getValue,base.getMultiplier);
		      	}
		      	else
		      	{
		      		Experience e=new Experience(20,5);
		      		Power p=new Power(30,5);
		      		Level l= new Level(0,1);
		      	}
		      	
		        try {
		  		Thread.sleep(50);
		        } 
		        catch (InterruptedException e)
		        {
		  		e.printStackTrace();
		  	    }    
		     
		      }
		    System.exit(0);
		 }
}

