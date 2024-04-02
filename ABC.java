package com.demo;
//same package
public class ABC {
	
 protected int a;
 
	
	public int getA() {
	return a;
}


public void setA(int a) {
	this.a = a;
}


	public static void main(String[] args) {
		
	}

}
class PQR{
	ABC ab= new ABC();
	void dispaly()
	{
		System.out.println(ab.a);
	
	}
	class MNC extends ABC{
		void show()
		{
			System.out.println(ab.a);
		}
	}
}
