package com.demo;

class Shapee
{
	public void draw()
	{
		System.out.println("Draw Shape");
	}
	
	public double calculateArea()
	{
		return 0.0;
	}
}

class Circlee extends Shapee
{
	private double r;
	public Circlee(double r)
	{
		this.r= r;
	}
	
	public void draw()
	{
		System.out.println("Draw Circle");
	}
	
	public double calculateArea()
	{
		return 3.14 * r *r;
	}
}

class Cylinder extends Shapee
{
	private double ht,r;
	public Cylinder(double r, double ht)
	{
		this.r=r;
		this.ht= ht;
	}
	
	public void draw()
	{
		System.out.println("Draw Cylinder");
	}
	
	public double calculateArea()
	{
		return (2*3.14*r*ht)+(2*3.14*r*r);
	}
}
public class Shape1
{

	public static void main(String[] args)
	{
		Circlee c= new Circlee(5);
		c.draw();
		System.out.println("Area of Circle:"+c.calculateArea());
		
		Cylinder cy = new Cylinder(3,7);
		cy.draw();
		System.out.println("Area of cylinder:"+cy.calculateArea());
	}

}