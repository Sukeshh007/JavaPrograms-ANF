package com.lab5;

import java.util.Scanner;


public class age
{
	void validate(int age) throws ArithmeticException
	{
		
		if(age<18)
		throw new ArithmeticException ("age is not valid"); //throw instance of class(ArithmeticException)
		else
			System.out.println("You are eligible for voting");
	}
	public static void main(String[] args)
	{
		age td = new age();
		try
		{
			td.validate(23);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Welcome for Voting");
		}
		//System.out.println("It will be executed");
	}
}


