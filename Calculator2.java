package com.demo;


class ABC{
	public void add(int a, int b)  // method overriding
	{
		System.out.println(" This is from class ABC");
	}
}
class PQR extends ABC
{
	public void add(int a, int b) 
	{
		System.out.println("PQR Class");
	}
}

public class Calculator2 {
	public static void main(String[] args) {
		
		
		ABC a = new ABC();  // parent Class
		a.add(5, 7);
		
		ABC a1= new PQR();  // upcasting
		a1.add(0, 0);

		
		PQR p= new PQR();  
		p.add(5, 4);
		
		//PQR p1= (PQR)new ABC();  // incomplete  downcast
		//a.add(5, 5);
	}

}
