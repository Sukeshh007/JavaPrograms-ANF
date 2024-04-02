package com.threaddemo;

class MyThread extends Thread
{
	@Override//(method overriding)
	public void run()
	{
		System.out.println("Sukesh - this is my task!!!");
	}
	
}
class MyThread2 extends Thread
{
	@Override//(method overriding)
	public void run()
	{
		System.out.println("this is my task!!!");
	}
}
public class ThreadNameDemo {

	public static void main(String[] args) {
		MyThread th=new MyThread();
		th.start();
		th.setName("Sukesh");
		th.setPriority(1);
		String name= th.getName();
	   System.out.println(th.getId());
		System.out.println(th.getPriority());
		System.out.println(name);
		
		
		MyThread2 th1=new MyThread2();
		th1.setName("Pavan");
		System.out.println(th1.getName());
		System.out.println(th1.getId());
		th1.start();
		/*min   - 1
		 * max  - 10
		 * norm -5
		 * *
		 */
		
	}

}
