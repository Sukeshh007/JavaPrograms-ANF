package com.corejava.demo;

//Write a Java program to display the cube of the given number up to an integer.

import java.util.*;

public class Demo5 {
	public void cube(int n) 
	{
		int cube= n*n*n;
		System.out.println("CUBE OF " +n   +  "is"  +cube);
	}
	
	public static void main(String args[])
	
	{
		Demo5 d =new Demo5();
		
	Scanner sc = new Scanner(System.in);

	System.out.println("ENTER A NUMBER");
	
	int i =sc.nextInt();
	for(int a =1;a<=i;a++)
	{
		d.cube(a);
		
	}
}
}