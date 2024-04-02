// 1.Write a Java program to get a number from the user and print whether it is positive or negative.

package com.corejava.demo;
import java.util.*;

public class Demo1 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER A NUMBER");
	
	int i =sc.nextInt();
	if(i<0)
	{
		System.out.println("given number is negative");
	}
	else if(i>0)
	{	
		System.out.println("given number is positive number");
	}
	else
		System.out.println("given number is zero");
	}
}