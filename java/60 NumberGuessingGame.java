package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 5;
		int guess;
		do {
			System.out.println("Enter a number (0 to 9): ");
			guess=sc.nextInt();
			if(guess>9 || guess<0) {
				System.out.println("Out of range");
			}
			else if(guess>num) {
				System.out.println("Guess lower");
			}
			else if(guess<num){
				System.out.println("Guess higher");
			}
		}while(num!=guess);
		System.out.println("Game end");
	}
}
