package code;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=((int)(Math.random()*100));
		while (true) {
			System.out.print("Enter a number: ");
			int inp=sc.nextInt();
			if(num==inp) {
				break;
			}
			else if(inp<num) {
				System.out.println("Higher");
			}
			else {
				System.out.println("Lower");
			}
		}
		System.out.println("End");
	}
}