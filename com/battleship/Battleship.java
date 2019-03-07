package com.battleship;

class Battleship extends Ship
{
	
	public Battleship()
	{
		length = 4;
		hit = new boolean[4];
	}
	
	@Override
	public String getShipType()
	{
		return "battleship";
	}
}
