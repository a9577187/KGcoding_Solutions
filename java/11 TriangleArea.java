package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base: ");
		float num1=sc.nextFloat();
		System.out.print("Enter height: ");
		float num2=sc.nextFloat();
		System.out.println("Perimeter of rectangle is "+(0.5*num1*num2));
	}
}
