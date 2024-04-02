package package1;
class Animal
{
	public void move() {
		System.out.println("This is a Animal Class ");
	}
}
class Cheetah  extends Animal 
{  
	public void move() {
		System.out.println("Cheetah can run Fast..");
	}
}
public class AnimalMain {
	public static void main(String[] args) {
		Animal A = new Animal();
		A.move();
		
		Cheetah ch= new Cheetah();
		ch.move();
	}
}
