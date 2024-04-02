package com.interfacedemo;

public class Circle implements Shape {
	
	private double radius;
	public Circle(double radius) {
		super();
	}

	@Override
	public double getArea() {
		
		// TODO Auto-generated method stub
		return Math.PI * radius * radius ;
	}


}
