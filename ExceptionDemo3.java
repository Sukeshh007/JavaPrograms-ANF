package com.demo;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		int[] arr= new int[4];
		
		try
		{
		int i=arr[3];
		System.out.println("This statement will Execute ");
		}
		catch(ArrayIndexOutOfBoundsException )
		{
			System.out.println("Searching...");
		}
	
		
}
