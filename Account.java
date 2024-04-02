package com.threaddemo;

public class Account extends Thread
{	
	static int balance=1000;
	
	
	public void run()
	{
		synchronized (Account.class) {
		
		if(balance>800)
		{
			System.out.println(Thread.currentThread() .getName()+ " Your balance is" + balance + 
					" rs u can withdarw" );
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance = 200;
			System.out.println(Thread.currentThread() .getName()+" after withdrawal your balance is "+ balance );
			
		}
		else 
		{
			System.out.println(" your Balance is " + balance + 
					" So you can't withdraw the amount ");
		}
		}
	}
}
