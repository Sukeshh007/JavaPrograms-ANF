package com.corejava.demo;

class A{
	static int nonStaticVariable;
	static int StaticVariable;
	
	static void staticMethod()
	{
		System.out.println(StaticVariable);
		//System.out.println(nonStaticVariable); non static method can't be accessed into static methods
	}
	static void nonstaticMethod() // instance method
	{
		System.out.println(StaticVariable);
		System.out.println(nonStaticVariable);

	}	
	
	/*void display1()
	{
		System.out.println(StaticVariable);
		System.out.println(nonStaticVariable);  
	}*/
		
}

public class MainInstanceClass {
	
	public static void main(String[]args) {
		
		A.StaticVariable=10;
		A.staticMethod();
		
		A a1=new A();
		A a2=new A();
		
		System.out.println(a1.nonStaticVariable);
		System.out.println(a2.StaticVariable);
		
		System.out.println(a2.StaticVariable);
		a1.StaticVariable=20;
		
		System.out.println(a2.StaticVariable);
		}
	
	
}
	

