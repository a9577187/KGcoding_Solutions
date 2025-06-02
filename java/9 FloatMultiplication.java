package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		float num1=sc.nextFloat();
		System.out.print("Enter Second number: ");
		float num2=sc.nextFloat();
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
	}
}
