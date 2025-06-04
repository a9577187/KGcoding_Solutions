package code;
import java.util.Scanner;
public class Test {
	static int digitSum(int num) {
		if(num<0) {
			num=-num;
		}
		int sum=0;
		int temp=num;
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nummber: ");
		int num1=sc.nextInt();
		System.out.println("Sum is "+digitSum(num1));
	}
}
