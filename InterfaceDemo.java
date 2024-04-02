package com.demo;
//interfaces, another way of implementing abstraction in java.
//all the interfaces in java are by default abstract
//by default all the methods in the interfaces are abstract
//interfaces should have all abstract methods.
//All the methods in interface are pure abstract method no concrete method till java 1.8 version
//After 1.8 you can add concrete methods in interface but they must be default and static
//By default the  field in the interface are public static and final
// you cannot create object of interface
// we cannot create  SIB- static initilizalion block and  IIB - initialization block

interface InterfaceSample{
	
	int i=0;
	void display();
	
	void show();
}
interface Sample
{
	void xyz();
	
}
class Abc implements InterfaceSample,Sample{

	
	@Override
	public void display() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		
		
	}

}