package com.iit.cs.oodp;

import java.awt.Graphics;
//MyDraw to Extend the Decorator
public abstract class WeaponDecorator implements Decorator {
	protected Decorator d;

   public WeaponDecorator(Decorator d){
      this.d = d;
   }
   public abstract void draw(Graphics g);
   
   }
