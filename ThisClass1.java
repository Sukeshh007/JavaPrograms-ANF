package package1;
//this=current class

public class ThisClass1 {
	int a;
	int b;
	ThisClass1()  //default constructor
	{
		this.a=10;
		b=20;
	}	
	ThisClass1 get()
	{
		return this;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		ThisClass1 ts= new ThisClass1();
		ts.get().display();
	}
}
