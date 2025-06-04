package code;
import java.util.Scanner;
public class Test {
	static void isPrime(int num) {
		if(num<2) {
			System.out.println("Not a prime number");
			return;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("Not a prime number");
				return;
			}
		}
		System.out.println("Prime number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nummber: ");
		int num1=sc.nextInt();
		isPrime(num1);
	}
}
