//3. Write a Java program that takes three numbers from the user and prints
//the greatest number.
	

package com.corejava.demo;
	import java.util.*;

	public class Demo2 {
		public static void main(String args[]) {
		
			Scanner sc = new Scanner(System.in);

		System.out.println("ENTER first NUMBER");
		
		int i =sc.nextInt();
		
		System.out.println("ENTER second NUMBER");
		
		int j=sc.nextInt();
		
		System.out.println("ENTER third NUMBER");

		int k=sc.nextInt();
		
		if(i>j & i>k)
		{ 
			System.out.println(i +"is a greater number");
			
		}
		else if(j>i & j>k) {
			
			System.out.println(j+ " is a greater number");
		}
		else
			System.out.println(k + "is a greater number");	
		}
	}