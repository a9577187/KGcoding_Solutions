package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		float num1=sc.nextFloat();
		if(num1>0) {
			System.out.println("Positive");
		}
		else if(num1==0){
			System.out.println("Zero");
		}
			
		else {
			System.out.println("Negative");
		}
	}
}
