package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year: ");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println("Leap");
		}	
		else {
			System.out.println("Not");
		}
	}
}
