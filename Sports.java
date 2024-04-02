package com.demo;

public class Sports {
	public void play()
	{
		System.out.println("Lets Play the Sports");
	}
}
class Football extends Sports
{
	public void play()
	{
		System.out.println("I Love Playing the Football..");
	}
}
class Basketball extends Sports
{
	public void play()
	{
		System.out.println("I Love Playing the Basketball..");
	}
}
class Rugby extends Sports
{
	public void play()
	{
		System.out.println("I Love Playing the Rugby..");
	}
	public static void main(String[] args) {
		Sports sp=new Sports();
		sp.play();
		
		Football fb=new Football();
		fb.play();
		
		Basketball bb=new Basketball();
		bb.play();
		
		Rugby rb=new Rugby();
		rb.play();
		
	}
}

