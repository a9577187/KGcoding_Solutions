package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first nummber: ");
		int num1=sc.nextInt();
		System.out.print("Enter second number: ");
		int num2=sc.nextInt();
		System.out.println("Xor is "+(num1^num2));
	}
}
