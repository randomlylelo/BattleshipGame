package com.battleship;

class EmptySea extends Ship
{
	public EmptySea()
	{
		length = 1;
	}
	
	@Override
	public boolean shootAt(int row, int column)
	{
		if(isHit) // replace with actual code if hit.
		{
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isSunk()
	{
		if(shipIsSunk) // replace with actual code
		{
			return true;
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		return //Ocean print method
	}
	
	
}
