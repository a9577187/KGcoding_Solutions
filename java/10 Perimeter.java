package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first side: ");
		float num1=sc.nextFloat();
		System.out.print("Enter Second side: ");
		float num2=sc.nextFloat();
		System.out.print("Enter third side: ");
		float num3=sc.nextFloat();
		System.out.print("Enter forth side: ");
		float num4=sc.nextFloat();
		System.out.println("Perimeter of rectangle is "+(num1+num2+num3+num4));
	}
}
