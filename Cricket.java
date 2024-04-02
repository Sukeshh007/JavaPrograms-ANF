package package1;

class Game
{
	public void Type()
	{
		System.out.println("Indoor & Outdoor");
	}
}
class Carrom extends Game
{
	public void Type()
	{
		System.out.println("Indoor");
	}
}
public class Cricket extends Game{

	public void Type()
	{
		System.out.println("Cricket is Outdoor game");
	}
	
	public static void main(String[] args) {
		
		Game gm=new Game();
		gm.Type();//call Game class method
		
		Cricket ck=new Cricket();
		ck.Type();// call cricket class method.
		
		Game gm1=new Game();
		gm1.Type();//call Game class method
		
		Game gm2=new Cricket();//gm refers to Cricket object
		gm2.Type(); // call cricket class method.
		
		
		gm=ck;  //gm refers to Cricket object
		gm.Type();// call cricket class method.
	}


		
		
	
		
		
	}
}
}