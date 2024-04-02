package com.threaddemo;

import java.util.LinkedHashSet;

//1 way of creating the thread by extendng Thread Class
//ThreadOne is a Thread
class ThreadOne extends Thread //(internally implemnts runnable)
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thraed One =" + i);
			
		}
	}
}
class ThreadTwo extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thraed Two =" + i);
			
		}
	}
}
public class ThreadInJava {

	public static void main(String[] args) {
	
		ThreadOne t1=new ThreadOne(); // new state
		ThreadTwo t2=new ThreadTwo();
		t1.start();   // runnable 
		t1.start();
		t2.start();
		System.out.println("mai main method hu");
		//t1.join();
	}

}

//new state- runnable state- running state -blocks state - dead
