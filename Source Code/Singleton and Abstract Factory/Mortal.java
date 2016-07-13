package com.iit.cs.oodp.exam;


import java.awt.Graphics;


	public abstract class MortalFighter {
		private int x; // x position
		private int y; // y position
		private String ID; // animal ID

		// constructor
		public MortalFighter() {
			ID = "";
		}

		// overloaded constructor
		public MortalFighter(String rID, int rX, int rY) {
			ID = rID;
			x = rX;
			y = rY;
		}

		public String getID() {
			return ID;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public void setX(int newX) {
			x = newX;
		}

		public void setY(int newY) {
			y = newY;
		}
		public abstract void draw( Graphics g );
	}


