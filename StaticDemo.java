package com.corejava.demo;



public class StaticDemo {
	static int a2= 0; // static variable 
	
	int a=0;   // instance varaible
	
	public void display() {
		
		int c=0; // local method
		a++;
		System.out.println(a);
	}
	public static void main(String[]args) {
		StaticDemo sd1=new StaticDemo();
		sd1.display();
		
		StaticDemo sd2=new StaticDemo();
		sd2.display();
		
		StaticDemo sd3=new StaticDemo();
		sd3.display();

	}

	class StaticBlock{
		static int staticVariable;
		
		static {
			
			System.out.println("Static Component SIB(Static Initilization Block)");
			staticVariable=10;
		}
		static void staticMethod
		{
			
		}
		
	}
}
