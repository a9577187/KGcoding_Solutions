package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("values before swap\na="+a+"\nb="+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("values after swap\na="+a+"\nb="+b);
	}

}
