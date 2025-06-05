package code;
import java.util.Scanner;
public class Test {
	static void isArm(int num) {
		int org=num;
		int temp=num;
		int digit=0;
		while(temp>0) {
			digit++;
			temp/=10;
		}
		double res=0;
		while(num>0) {
			res+=Math.pow((num%10),digit);
			num/=10;
		}
		if(org==res) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nummber: ");
		int num1=sc.nextInt();
		isArm(num1);
	}
}
