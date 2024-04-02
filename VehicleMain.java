package package1;



class Vehicle
{
	public void drive() {
		System.out.println();
	}
}
class Car extends Vehicle 
{  
	public void drive() {
		System.out.println("Repairing the car");
	}
}

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle vc= new Vehicle();
		vc.drive();
		
		Car c = new Car();
		c.drive();
	}
}
