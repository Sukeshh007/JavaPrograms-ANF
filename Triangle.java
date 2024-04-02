package com.interfacedemo;

public class Triangle implements Shape {

	private double side;
	
	public Triangle(int i) {
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (1/2 * side * side);
	}

}
