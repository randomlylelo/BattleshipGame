package com.battleship;

import java.util.*;

class Ocean
{
	private Ship[][] ships = new Ship[10][10];
	private int shotsFired;
	private int hitCount;
	private int shipsSunk;
	
	public Ocean()
	{
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
		
		for(int i = 0; i < ships.length; i++)
		{
			for(int j = 0; j < ships[i].length; j++)
			{
				ships[i][j] = new EmptySea();
			}
		}
	}
	
	public void placeAllShipsRandomly()
	{
		Random rd = new Random();
		
	}
	
	public boolean isOccupied(int row, int column)
	{
		if(ships[row][column] != )
		{
			return true;
		}
		return false;
	}
	
	public boolean shootAt(int row, int column)
	{
		// code
	}
	
	public int getSHotsFired()
	{
		return shotsFired;
	}
	
	public int getHitCount()
	{
		return hitCount;
	}
	
	public int getShipsSunk()
	{
		return shipsSunk;
	}
	
	public boolean isGameOver()
	{
		if(//all ships sunk)
		{
			return true;
		}
		return false;
	}
	
	public Ship[][] getShipArray()
	{
		// code
	}
	
	public void print()
	{
		System.out.print("ocean");
		
	}
}

