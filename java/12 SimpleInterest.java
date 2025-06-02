package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principle amount: ");
		float num1=sc.nextFloat();
		System.out.print("Enter rate of interest: ");
		float num2=sc.nextFloat();
		System.out.print("Enter time: ");
		float num3=sc.nextFloat();
		System.out.println("Simple interest is "+((num3*num1*num2)/100));
	}
}
