package com.inheritancedemo;

// private for same class
// public for all class
// default for same package every where but no different class
// protected for same  package and only in inherited classes in other pacakge



public class XYZ extends ABC {
   public static void main(String[] args) {
	ABC ab= new ABC();
	System.out.println(ab.getA());
}
}

class OPP extends ABC{
	ABC ab= new ABC();
	void dispaly()
	{
		System.out.println(ab.getA());
	
	}
}



