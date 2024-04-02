package com.corejava.demo;

//method returning an array of derived type

class AB{
	
	
	
	int i;

	@Override
	public String toString() {
		return "AB [i=" + i + "]";
	} 
	
	// instance var
	
	
	
}
public class ArrayInJava10 {

	static AB[] method1() {  // static method 
		
		AB a[] = new AB[8];   //  obj create kel AB cha ani AB la * ch index dil mhnjee 8 val tyat store kel  a= reference aahe
		a[2]=new AB();        //  2nd index la memory allocate kel  AB madhe   // ithe AB navane array aahe 
		a[5]=new AB();
		a[2].i=10;            //  2nd index la value assing kel 
		a[5].i=12;
		return a;             // a la return kel
		
	}
	public static void main(String[]args) {   
		AB[]a=method1();    // method la call hot 
		System.out.println(a[2]);   // print  krt
		System.out.println(a[5]);
		
	}
}
