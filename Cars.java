package com.corejava.demo;

// multilevel inheritance 

class Car1 {
	  void tata() {
	    System.out.println("This is a TATA Harrier");
	  }
	}

	class BMW extends Car1 {
	  void bmw() {
	    System.out.println("This is a BMW");
	  }
	}

	class VolksVagen extends BMW {
	  void vv() {
	    System.out.println("This is a VolksVagen");
	  }
	}

	public class Cars {

	  public static void main(String[] args) {
		  VolksVagen d = new VolksVagen();
	    d.tata();
	    d.bmw();
	    d.vv();
	  }
	}
