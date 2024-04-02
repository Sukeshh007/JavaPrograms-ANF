package com.corejava.demo;

// passing array of derived type as a parameter to the method: 

class A{
	
	int i; // ha instance class aahe 
}
	
public class ArrayInJava9 {
	
	static void method1(A[]a)   //  static method la parameter as  array pass kel
	{
		a[2].i= 25;  //  array madhe 2nd index la 25 store kel   //  changing the value field of A-Type object reffered by element at index 2
		a[5].i= 45;  //  array madhe 5nd index la 45 store kel   //  changing the value field of A-Type object reffered by element at index 5
	}
	
	public static void main(String[]args) {
		
		A[] a= new A[8];   // object create kel ani arrray chi size 8 aahe 
		a[2]=new A(); //  obj create kel ani assign kel 2nd index la  //creating the object and assigining it to element index 2 
		a[5]=new A(); //  obj create kel ani assign kel 5nd index la   //creating the object and assigining it to element index 5
		
		a[2].i=10;  // Changing value of field  of A-type reffered by element  at index 2 
		a[5].i=20;  //Changing value of field  of A-type reffered by element  at index 5
		
		method1(a); // calling method
		
		System.out.println(a[2].i);
		System.out.println(a[5].i);	

	}

}
