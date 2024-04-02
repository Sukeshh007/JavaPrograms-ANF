package package1;
// this is  pointing to current class data members current 
// <u>current class constructor and current class instances(object)
public class ThisClass {

	int a;
	int b;
	int c;
	
	/*
	 * ThisClass(int a, int b) { this.a=a; //a=10 b=20 this.b=b;
	 * 
	 * } void display() { System.out.println(a); System.out.println(b);
	 * System.out.println(c); }
	 */


	ThisClass(){
		this(10,15);
		System.out.println("Inside Default Constructor");
	}
	ThisClass(int a, int b)
	{
		this(10,15,20);
		this.a=a;
		this.b=b;
		System.out.println("Inside the parameterised constructor-1");
	}
	ThisClass(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Inside the parameterised constructor-2");
	}
	
	
	public static void main(String[] args) {
		ThisClass tiss= new ThisClass();

		//ThisClass tis= new ThisClass(10,15);
	}

}
