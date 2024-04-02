package com.interfacedemo;

public class Rectangle implements Shape {

	private double length;
	private double width;
	public Rectangle(int i, int j) {
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (length * width);
	}
		
}
