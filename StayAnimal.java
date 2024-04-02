package package1;

class stayAnimals
{
	public void makeSound() {
		System.out.println("These are the Animal that makes., sound ");
	}
}
class Cat  extends stayAnimals
{  
	public void makeSound() {
		System.out.println("The Cat  makes sound like Meow..");
	}
}

public class StayAnimal {
	public static void main(String[] args) {
		stayAnimals a= new stayAnimals();
		a.makeSound();
		
		Cat c= new Cat();
		c.makeSound();
	}
}
