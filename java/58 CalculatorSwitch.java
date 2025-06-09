package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice = null;
		do {
			System.out.println("Enter first number: ");
			int num1=sc.nextInt();
			System.out.println("Enter + for addition\nEnter - for subraction\nEnter / for division\nEnter * for multiplication\n");
			String operation=sc.next();
			System.out.println("Enter second number: ");
			int num2=sc.nextInt();
			switch(operation) {
			case "+":
				System.out.println(num1+" + "+num2+" = "+(num1+num2));
				break;
			case "-":
				System.out.println(num1+" - "+num2+" = "+(num1-num2));
				break;
			case "/":
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
				break;
			case "*":
				System.out.println(num1+" * "+num2+" = "+(num1*num2));
				break;
			default:
				System.out.println("Invalid input");
			}
			System.out.println("Press enter to continue or Type exit to quit: ");
			sc.nextLine();
            choice = sc.nextLine();
		}while(!choice.equalsIgnoreCase("exit"));
		System.out.println("END");
	}
}
