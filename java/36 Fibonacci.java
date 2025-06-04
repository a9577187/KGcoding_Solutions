package code;
import java.util.Scanner;
public class Test {
	static void fib(int num) {
		if (num <= 0) {
            return;
        } else if (num == 1) {
            System.out.print("0");
            return;
        }
		int prev = 0;
        int current = 1;
        System.out.print(prev + " " + current + " ");
        for(int i=2;i<num;i++) {
        	int next=prev+current;
        	System.out.print(next+" ");
        	prev=current;
        	current=next;
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nummber: ");
		int num1=sc.nextInt();
		fib(10);
	}
}
