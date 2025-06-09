package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		String res=num1%2==0?"Even":"Odd";
		System.out.println("Number is "+res);
	}
}
