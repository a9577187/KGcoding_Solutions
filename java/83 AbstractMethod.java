package code;
abstract class Shapes{
	String colour;

	public Shapes(String colour) {
		this.colour = colour;
	}
	abstract double calculateArea();
	
	String getColour() {
		return colour;
	}
	void setColour(String colour) {
		this.colour = colour;
	}
}
class Circle extends Shapes{
	double radius;

	public Circle(String colour,double radius) {
		super(colour);
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		return Math.PI*Math.pow(this.radius,2);
	}
	
}
class Rectangle extends Shapes{
	double length,width;

	public Rectangle(String colour,double length, double width) {
		super(colour);
		this.length = length;
		this.width = width;
	}

	@Override
	double calculateArea() {
		return this.length*this.width;
	}
	
}
public class Test {
	public static void main(String[] args) {
		Circle circle1 = new Circle("Red", 5.0);
        Rectangle rectangle1 = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Area: " + circle1.calculateArea());

        System.out.println("Area: "+rectangle1.calculateArea());
	}
}