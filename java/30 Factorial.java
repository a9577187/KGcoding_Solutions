package code;
import java.util.Scanner;
public class Test {
	static int fact(int num) {
		if(num==0 || num==1) {
			return 1;
		}
		else {
			int fact=1;
			for(int i=1;i<=num;i++) {
				fact*=i;
			}
			return fact;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nummber: ");
		int num1=sc.nextInt();
		System.out.println("Factorial is "+fact(num1));
	}
}
