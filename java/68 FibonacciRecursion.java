package code;
import java.util.*;
public class Test {
	static int fib(int num) {
		if(num==0) {
			return 0;
		}
		if(num==1) {
			return 1;
		}
		return fib(num-1)+fib(num-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a small number: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.print(fib(i)+" ");
		}
	}
}