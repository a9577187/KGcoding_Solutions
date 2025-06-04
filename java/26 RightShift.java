package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nummber: ");
		int num1=sc.nextInt();
		System.out.println("Right Shift is "+(num1>>1));
	}
}
