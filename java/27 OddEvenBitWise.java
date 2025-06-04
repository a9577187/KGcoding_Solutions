package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nummber: ");
		int num1=sc.nextInt();
		if((num1&1)==1) {
			System.out.println("Odd");			
		}
		else {
			System.out.println("Even");	
		}
	}
}
