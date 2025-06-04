package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		float num1=sc.nextFloat();
		if(num1%2==0) {
			System.out.println("Even");
		}	
		else {
			System.out.println("Odd");
		}
	}
}
