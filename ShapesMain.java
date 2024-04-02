package package1;
class shapes{
	
	public double getArea() {
		return 0;
	}
}
class Rectangle extends shapes
{ 
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
		}
	public double getArea() {
		return length * width;
	}
	}

public class ShapesMain {
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(5.5, 4);
		System.out.println("Area of rectangle = " +r.getArea());

		
	}

}
