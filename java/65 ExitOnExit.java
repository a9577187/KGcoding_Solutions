package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter something or type EXIT to exit: ");
			String input=sc.nextLine();
			if(input.equalsIgnoreCase("exit")) {
				break;
			}
			else {
				System.out.println("You entered "+input);
			}
		}
		System.out.println("END");
	}
}