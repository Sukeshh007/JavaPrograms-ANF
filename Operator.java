package com.corejava.demo;

public class Operator {
	public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	int result=a+b;
	
	System.out.println("a + b = "+ result);
	System.out.println("a - b = " + (a - b));
	System.out.println("a / b = " + (a / b));
	System.out.println("a * b = " + (a * b));
	System.out.println("a % b = " + (a % b));
	
	// Relatinonal operator
			System.out.println("a > b = " + (a > b));
			System.out.println("a < b = " + (a < b));
			System.out.println("a >= b = " + (a >= b));
			System.out.println("a <= b = " + (a <= b));
			System.out.println("a == b = " + (a == b));
			System.out.println("a != b = " + (a != b));
			
			
			// bitwise operator
		
			int m=25; 
			int n=10; 
			// a&b = 0000 1100 = 12
			/*
			 * a|b = 0011 1101 =61 
			   a^b = 0011 0001 =49 
	           ~a  = 1100 0011 =

			 */
			
			result=m & n;
			System.out.println(result);
			
			result=m | n;
			System.out.println(result);
			
			result=m ^ n;
			System.out.println(result);
			
			result=m & n;
			System.out.println(result);
			
			result=m >> 2; // 15
			System.out.println("m >> 2" + result);
			
			result=m << 2; // 15
			System.out.println("m << 2" + result);
			
			// Ternary Operator
			int min=(a<b)? a : b;
			System.out.println(min);
			
			// increment and decrement operators
			
			int x=7;
			
			
			System.out.println(x);
			//x++;
			//System.out.println(x++); 
			
			//System.out.println(x--);
			
			
			
			//preincrement and post increment
			
			System.out.println(++x); //pre-increment operator
			System.out.println(x++); //post- increment operator

			

	}
}
