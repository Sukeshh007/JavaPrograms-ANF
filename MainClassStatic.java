package com.corejava.demo;

public class MainClassStatic {
	
	static int staticVariable;
	
	static 
	{
		System.out.println("Static component SIB(Static initilization block)");
		staticVariable=10;
		
	}
	static void staticMethod() 
	{
		
		System.out.println("Freom static method");
		System.out.println(staticVariable);
	}
}
public class MainClassStatic{
	static{
		System.out.println("Main Class SIB)");

	
	
		public static void main(String[]args) {
			StaticBlock.staticVariable=20;
			staticBlock.staticMethod();
		}
	}
}
