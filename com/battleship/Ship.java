package com.battleship;

class Ship
{
	private int bowRow;
	private int bowColumn;
	private int length;
	private boolean horizontal;
	private boolean[] hit;
	
	public int getLength()
	{
		return 1;
	}
	
	/**
	 * Getters
	 */
	 
	public int getBowRow()
	{
		return bowRow;
	}
	
	public int getBowColumn()
	{
		return bowColumn;
	}

	public boolean isHorizontal()
	{
		return horizontal;
	}
	
	/**
	 * Setters
	 */
	 
	public void setBowRow(int row)
	{
		bowRow = row;
	}
	
	public void setBowColumn(int column)
	{
		bowColumn = column;
	}
	
	public void setHorizontal(boolean horizontal)
	{
		horizontal = horizontal;
	}
	
	@Override
	public String getShipType()
	{
		return "";
	}
	
	public boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean)
	{
		
	}
	
	public void placeShipAt(int row, int column, boolean horizontal, Ocean ocean)
	{
		// code
	}
	
	public boolean shootAt(int row, int column)
	{
		// code
	}
	
	public boolean isSunk()
	{
		// code
	}
	
	@Override
	public String toString()
	{
		if(!isSunk())
		{
			return "S";
		}
		return "x";
	}
	
	
}
