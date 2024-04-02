package package1;

class Parent{
	String name;
	public Parent (String n)
	{
		name=n;
	}
}
 public class SuperDemo2 extends Parent
{   
	String name;

	public SuperDemo2(String n1, String n2) {
		super(n1);
		this.name = n2;
	}
	public void details()
	{
		System.out.println(super.name+ " and "+name);
	}
	
	public static void main(String[] args) {
	      SuperDemo2 obj =new SuperDemo2("Parent","Child");
	      obj.details();
	      
	}
}
