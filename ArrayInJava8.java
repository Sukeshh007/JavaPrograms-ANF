package com.corejava.demo;

public class ArrayInJava8 {
	
	static void method1(double d[]) {
		d[2]= 25.35;
		d[5]= 45.35;

		
	}
	
	public static void main(String[]args) {
		  
		
	double[] d= new double[8];
	d[2]=10.5;
	d[3]=15.35;
	
	method1(d);
	System.out.println(d[2]);
	System.out.println(d[5]);
	}

}
