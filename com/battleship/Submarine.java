package com.battleship;

class Submarine extends Ship
{
	
	public Submarine()
	{
		length = 1;
		hit = new boolean[1];
	}
	
	@Override
	public String getShipType()
	{
		return "submarine";
	}
}
