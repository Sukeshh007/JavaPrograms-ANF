package com.corejava.demo;

public class ExampleMin {
	
	  public int minFunction (int i, int j)
	{
		int min;
		//n*m=11.5*9=103.5
		if(i<j)
		{
			min=j;
		}
		else
		{
			min=i;
		}
		return min;
		
	}
	public static void main(String[]args) {
		 //int a=10;
		//int b=15;
		
		ExampleMin ex= new ExampleMin();
		
		System.out.println("Minimum value " + ex.minFunction(3,9));
	}

	
	public double minFunction (double i, int j)
	{
		double min;
		//n*m=11.5*9=103.5
		if(i<j)
		{
			min=j;
		}
		else
		{
			min=i;
		}
		return min;
		
	}
	public static void main1(String[]args) {
		 //int a=10;
		//int b=15;
		
		ExampleMin ex= new ExampleMin();
		
		System.out.println("Minimum value " + ex.minFunction(3,9));
	}

	
}
