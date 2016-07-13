package com.iit.cs.oodp.exam;

public class FactoryMaker {
	
private static AbstractFactory af=null;
static AbstractFactory getFactoryInstance(String fighterName){
			    if(fighterName.equalsIgnoreCase("Batman")){
				af=CreateBatman.getInstance();
				}else if(fighterName.equalsIgnoreCase("Joker")){
				af=CreateJoker.getInstance();
				}else if(fighterName.equalsIgnoreCase("Flash")){
				af=CreateFlash.getInstance();
				}else if(fighterName.equalsIgnoreCase("Zoom")){
				af=CreateZoom.getInstance();
				}else if(fighterName.equalsIgnoreCase("Scorpion")){
				af=CreateScorpion.getInstance();
				}else if(fighterName.equalsIgnoreCase("SubZero")){
				af=CreateSubZero.getInstance();
				}return af;
		}
	}
}
