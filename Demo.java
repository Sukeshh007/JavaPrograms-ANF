package com.corejava.demo;

public class Demo {
	
	public Demo(int a)
	{
		System.out.println("Value of a"  + a*a);
		
	}
	public Demo(int a , int b)
	{
		System.out.println("Multiplication of a"  + a*b);
		
	}
	public Demo(int a, float b)
	{
		System.out.println("Multiplication of a"  + a*b);
		
	}

	public class ConstructorDemo{
	
		public static void main(String[]args) {
			
			Demo d=new Demo();
			System.out.println(d.a);
		}
	}

}
