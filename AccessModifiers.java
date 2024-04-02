package com.corejava.demo;

 // There are four access modifiers

/* private
 * public
 * protected
 * default
*/

class ABC
{
	public int a;
	void dispaly() {
		System.out.println(a);	
	}
}

public class AccessModifiers {
	
	public static void main(String[]args) {
		ABC a1= new ABC();
		System.out.println(a1.a);
		
	}

}
