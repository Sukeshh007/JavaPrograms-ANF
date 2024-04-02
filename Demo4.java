package com.corejava.demo;

//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

import java.util.*;

public class Demo4 {
	
	
	public static void main(String args[])
	
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("First No:");
		
		int i =sc.nextInt();
		
		System.out.println("Second No:");

		int j =sc.nextInt();
		
		System.out.println("Third No:");

		int k =sc.nextInt();
		
		System.out.println("Fourth No:");

		int l =sc.nextInt();
		
		System.out.println("Fifth No:");

		int m =sc.nextInt();
		
		int sum =(i+j+k+l+m);
		System.out.println("SUM = " + sum);
		
		int avg = (sum / 5);
		System.out.println("AVERAGE = " +avg);
		
	}
}
