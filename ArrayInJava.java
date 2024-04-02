package com.corejava.demo;

public class ArrayInJava {
 /* int [] a= {10,15,25,7,0}; // initilize and delare the array
  
  int[] b=a; // value of a is copied in b
  
  // printing the data
  
  for(int i=0; i< b.length; i++)
    {
        System.out.println(b[i]);	
    }
    System.out.println(b[2]);
   
  */  
    
  
	public static void main(String[] args) {
	int [] a= {10,15,25,7,0};
	int [] b= new int[a.length];   // declaring and instating another array of int
	{		
	for(int i = 0; i <a.length; i++)// copying a array variable 
		{
		b[i]=a[i];
	}	
	a[2]=56; //changing 3rd element value 
	System.out.println(b[2]);
}
}
}