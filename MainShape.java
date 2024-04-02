package com.interfacedemo;

public interface MainShape {
	public static void main(String[] args) {
		Rectangle rec=new Rectangle(10,15);
		Circle cir = new Circle(10);
		Triangle tri = new Triangle(15);
		
		System.out.println("Area of Rectangle =" + rec.getArea());
		System.out.println("Area of Circle =" + cir.getArea());
		System.out.println("Area of Triangle =" + tri.getArea());

	}

}
