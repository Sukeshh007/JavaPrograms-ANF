package com.demo;


class Vehicle2{
	String brand ="Maruti";  //vehicle attribute
	public void honk()   //Vehicle Method
	{
		System.out.println("Beep.. Beep..!");
	}
}
	
public class Vehicle extends Vehicle2  {
	
	String modelName="Maruti800";  // car attribute
	
	public static void main(String[] args) {
		Vehicle vh=new Vehicle();
		vh.honk();
		
		System.out.println(vh.brand + "  "+ vh.modelName);
	}
}
