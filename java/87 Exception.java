package code;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			try {
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				int res=num1/num2;
				System.out.println(res);
			} catch (ArithmeticException e) {
				System.out.println("Can't divide by zero");
				e.printStackTrace();
			}finally {
				System.out.println("END");
			}
	}
}