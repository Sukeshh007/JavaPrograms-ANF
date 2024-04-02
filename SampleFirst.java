package com.corejava.demo;
class Sample{

	int x;
}

public class SampleFirst {
	final int x=10; // instance variable
	           // 10 will be the constant value for the variable x which 
	          // we cannot modify  value of x throughout the program
	final float pi=3.14f; // example
	
	public static void main(String[] args) {
		SampleFirst sf1=new SampleFirst();
		sf1.x=40;
		System.out.println(sf1.x);
		
		SampleFirst sf2=new SampleFirst();

		System.out.println(sf2.x);
		
		
	//  Sample sm=new Sample(); // creating object of sample class
	//	System.out.println(sm.x); //5
	//	System.out.println(sf1.x);//10 
	//	System.out.println(sf2.x);//10
		
		
	}

}
