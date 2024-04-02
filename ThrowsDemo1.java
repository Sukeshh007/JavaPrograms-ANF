package com.demo;

import java.io.IOException;

public class ThrowsDemo1 {
	
	void method1() throws IOException
	{
		throw new IOException("Some Hardware Exception");
	}
	void method2() throws IOException {
		method1();
	}
	void method3() throws IOException {
		
			method2();
		
	}
	public static void main(String[] args) throws IOException {
		ThrowsDemo1 td = new ThrowsDemo1();
		try
		{
			td.method3();
		}
		catch(IOException ie)
		{
			System.out.println("remaining code will execute");
		}
		System.out.println("execute");
		
		
	}

}
