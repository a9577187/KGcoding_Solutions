package code;
import java.util.Scanner;
public class Test {
	static int oddSum(int num) {
		int sum=0;
		for(int i=1;i<num;i+=2) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nummber: ");
		int num1=sc.nextInt();
		System.out.println("Sum is "+oddSum(num1));
	}
}
