package com.demo;


class Shape {
	public void draw()
	{
		System.out.println("draw shape");
	}
	public double calculateArea()
	{
		return 0;
	}
}
class Circle
{
	double radius;
	
	public Circle(double radius)
	{
		this.radius= radius;
	}
	public void draw() 
	{
		System.out.println("Draw the circle..");
	}
	public double calculateArea()
	{
		return Math.PI * radius *radius;
	}
}
class Square
{ 
	double side; 
	public Square(double side)
	{
		this.side= side;
	}
	void draw() 
	{
		System.out.println("Draw the square.. ");
	}
	public double calculateArea()
	{
		return side *side;
	}
}
class Triangle extends Shape
{
	double base,height;
	
	public Triangle(double base, double height)
	{
		this.base= base;
		this.height= height;
	}
	
	public void draw() 
	{
		System.out.println("Draw the square.. ");
	}
	public double calculateArea()
	{
		return 0.5 * base * height;
	}
	
	public static void main(String[] args) {
		
		Shape sh=new Shape();
		sh.draw();
		sh.calculateArea();
     //   System.out.println("Area: " + sh.calculateArea());

		
		
		Circle cr=new Circle(5);
		cr.draw();
		cr.calculateArea();
        System.out.println("Area: " + cr.calculateArea());


		Square sq =new Square(4);
		sq.draw();
		sq.calculateArea();
        System.out.println("Area: " + sq.calculateArea());

		
		Triangle tri = new Triangle(4,5);
		tri.draw();
		tri.calculateArea();
        System.out.println("Area: " + tri.calculateArea());

		
		
	}
	

}

