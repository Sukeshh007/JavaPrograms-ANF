package com.corejava.demo;

import java.util.Scanner;

public class SwappingExample {
	
	public void swapFunction(int a,int b) {
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		SwappingExample sx=new SwappingExample();
		
		sx.swapFunction(a,b);
//		System.out.println("Now, Before and after swapping values be the");

	}

}