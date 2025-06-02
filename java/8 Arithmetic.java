package code;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter Second number: ");
		int num2=sc.nextInt();
		System.out.println("Addtion of "+num1+" and "+num2+" is "+(num1+num2));
		System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
		System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2));
	}

}
