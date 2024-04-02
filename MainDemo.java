package com.inheritancedemo;

//import com.demo.MainDemo.;
//
class ABC{
	public int z;
}
class PQR{
	void display()
	{
		ABC ab=new ABC();
		System.out.println(ab.z);	
	}
}
class MNC extends ABC{
	void show()
	{
		ABC ab=new ABC();
		System.out.println(ab.z);
	}
}
public class MainDemo {
	
	public int a;

	public static void main(String[] args) {
		MainDemo demo=new MainDemo();

}
}
