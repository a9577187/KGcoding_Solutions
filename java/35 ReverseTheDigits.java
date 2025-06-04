package code;
import java.util.Scanner;
public class Test {
	static int isPrime(int num) {
		int temp=0;
		while(num>0) {
			temp=temp*10+num%10;
			num/=10;
		}
		return temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nummber: ");
		int num1=sc.nextInt();
		System.out.println("Reverse is "+isPrime(num1));
	}
}
