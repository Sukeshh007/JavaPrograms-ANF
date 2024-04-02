package package1;

class demoparent{
	 
	String name;
	 
	 
}


public class SuperPrime extends demoparent{

	   String name;
		
		
		public void details()
		{
			super.name="parent";
			name="child";
			
			System.out.println(super.name);
			System.out.println(name);
		}

	


	public static void main(String[] args) {
		SuperPrime sp=new SuperPrime();
		sp.details();
	}
}


