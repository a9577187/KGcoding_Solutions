package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		String exit = null;
		while(true) {
			System.out.println("Enter a number: ");
			int input=sc.nextInt();
			sum+=input;
			System.out.println("Sum is "+sum);
			System.out.println("Type yes to exit or Type no to continue: ");
			exit=sc.next();
			if(exit.equalsIgnoreCase("yes")) {
				break;
			}
			else {
				continue;
			}
		}
		System.out.println("END");
	}
}