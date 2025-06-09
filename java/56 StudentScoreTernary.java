package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=sc.nextInt();
		String res=marks>80?"High":marks>50?"Moderate":"Low";
		System.out.println("Your marks are "+res);
	}
}
