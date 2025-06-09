package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean isPrime=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
			else {
				isPrime=true;
			}
		}
		if(isPrime) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}
