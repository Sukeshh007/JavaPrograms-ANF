package com.demo;

public class ThrowDemo {
	
	void validate(int age)
	{
		if(age<18)
		throw new ArithmeticException("Age is not valid");
		else
			System.out.println("Eligible for voting");
	}
	public static void main(String[] args) {
		ThrowDemo td = new ThrowDemo();
		try {
			td.validate(15);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Welcome for voting");
		}	
		System.out.println("Hello");
	}

}
