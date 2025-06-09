package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		int res=num1>=0?num1:-num1;
		System.out.println("Absolute number is "+res);
	}
}
