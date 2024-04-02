package com.demo;

public class Calculator1 {
	
		int a;
		float b,result;
		
		public void add(int a, int b) {
			result=a+b;
			System.out.println(result);
		}
		public void add(int a, float b) {
			result=a+b;
			System.out.println(result);
		}
		public void add(float a, float b) {
			result=a+b;
			System.out.println(result);
		}
		public void add(int a, int b, int c) {
			result=a+b+c;
			System.out.println(result);
		}
		

		public static void main(String[] args) {
			Calculator1 cal=new Calculator1();
			cal.add(2, 3.5f);
			cal.add(5, 7);
			cal.add(3, 7.5f);
			cal.add(3, 7,9 );

		}

}
