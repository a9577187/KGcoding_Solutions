package code;
import java.util.Scanner;
public class Test {
	static void printTable(int num) {
		for(int i=1;i<11;i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nummber: ");
		int num1=sc.nextInt();
		printTable(num1);
	}
}
