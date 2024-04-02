package com.demo;



/*
throwable
Exception
RuntimeException
ArrayIndexOutOfBoundsException
IndexOutOfBoundsException
MyException


*/
class MyException extends ArrayIndexOutOfBoundsException
{
	public int ex;

	public MyException(int ex) {
		super();
		this.ex = ex;
	}

	@Override
	public String toString() {
		return "MyException [ex=" + ex + "]";
	}	
}

public class UserDefinedException 
{

	void sum(int a, int b)throws MyException
	{
		if(a<0)
		{
			throw new MyException(a);
		}
		else
		{
			System.out.println("The addition is" + (a+b));
		}
	}
	public static void main(String[] args) throws MyException
	{
		
		UserDefinedException ud = new UserDefinedException();
		
		try{
			ud.sum(-10, 15);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}
