package com.corejava.demo;

import java.util.Scanner;

public class ProgramDemo {
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the alphabet");
	String input=sc.next().toLowerCase();
	// input=a;
	
	boolean upperCase=input.charAt(0) >=65 && input.charAt(0) <=90;
    boolean lowerCase=input.charAt(0) >=97 && input.charAt(0) <=122;		
	boolean vowels=input.equals("a") ||	input.equals("e") || input.equals("i") ||
			input.equals("0") || input.equals("u");
	
	
	if(input.length() > 1)
	{
		System.out.println("Error Not a single character");
		
	}
	else if(!upperCase || lowerCase)
	{
		System.out.println("letter is not Uppercase");
	}
	else if (vowels)
	{
		System.out.println("Letter is Vowel");
	}
	else
	{
		System.out.println("Letter is Consonant");
	}
	
		
	}

}