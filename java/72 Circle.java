package code;
import java.util.*;
class Circle{
	int radius;
	Circle(int radius) {
		this.radius = radius;
	}
	double getCircumference(int radius) {
		return 2*Math.PI*radius;
	}
	double getArea(int radius) {
		return Math.PI*radius*radius;
	}
	public String toString() {
		return "Circle [radius=" + radius +" Area="+getArea(radius)+" Circumference="+getCircumference(radius) +"]";
	}
	
}
public class Test {
	public static void main(String[] args) {
		int radius;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius=sc.nextInt();
		Circle c1=new Circle(radius);
		System.out.println(c1);
	}
}