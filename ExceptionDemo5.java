package com.demo;

//Employee e = new Employee() // early binding
// Employee e;  //reference   // late binding
// e=null;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		int result, a=10, b=0;
		try
		{
			result=a/b;
			System.out.println(result);
		}
			catch(NullPointerException ae)
			{
				System.out.println("no val in variable");
			}
			catch(ArithmeticException ae)
			{
				System.out.println("divisible by zero");
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("out of range");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		finally {
		System.out.println("close all connection");
		
		}
		System.out.println("Heyy..");
	}
}
