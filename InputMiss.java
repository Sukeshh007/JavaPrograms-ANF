package com.lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMiss
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter An Integer:");
		try
		{
			int n1 = sc.nextInt();
			System.out.println("Entered Value:"+n1);
		} 
		catch (InputMismatchException e)
		{
			System.out.println("Invalid Input.Please Enter an Integer5");
		}
	}

}
