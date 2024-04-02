package com.interfacedemo;

enum shape
{
	Circle,
	Rectangle,
	Triangle
}
enum Days
{
	Monday,Tuesday,Wednesday
}
enum Direction
{
	North,South,East,West
}
public class EnumerationDemo {

	public static void main(String[] args) {
		
		//Direction dir = Direction.North;
		//Direction dir2 = Direction.South;
		
		
		//System.out.println("First direction : " + dir);
		//System.out.println("First direction : " + dir2);
	
	/*	for(Direction dir : Direction.values())
		{
			System.out.println(dir);
		}
	*/
		Direction dir = Direction.North;
		if(dir == Direction.East)
			System.out.println(Direction.East);
		else if(dir == Direction.West);
		{
			System.out.println(Direction.East);
		}
	}
}
