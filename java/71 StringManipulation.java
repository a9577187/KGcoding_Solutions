package code;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first string: ");
		s1=sc.nextLine();
		System.out.print("Enter Second string: ");
		s2=sc.nextLine();
		System.out.println("Result is "+s1.concat(s2).toUpperCase());
	}
}