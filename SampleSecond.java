package com.corejava.demo;

class SampleDemo{
	
	int x=5;
	
	public void SampleDemoMethod() {
		
		System.out.println("Value of x for sample Demo method" + x);  // login in method

	}
}

 public class SampleSecond { // class declaration

	int x=10;  // variable declaration and initilization

    public void method1() // method definition
	{
		System.out.println("Value of x " + x);  // login in method
	}
	
	public static void main(String[]args) {  // starting point for the
		
		SampleSecond ss1=new SampleSecond(); //object created and memory allocated to ss1
		SampleDemo sm=new SampleDemo();
		ss1.method1(); // calling method
		sm.SampleDemoMethod();
;	}
}
