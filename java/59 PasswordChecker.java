package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String password = null;
		do {
			System.out.println("Enter your password: ");
			password=sc.nextLine();
		}while(password.length()<6);
		System.out.println("Password set successful");
	}
}
