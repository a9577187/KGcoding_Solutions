package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,6,5,4,3,2,1,4,5,3,1,1,5,4,2,1,3,4};
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\nEnter a number: ");
		int num=sc.nextInt();
		int counter=0;
		for(int i : arr) {
			if(i==num) {
				counter++;
			}
		}
		System.out.println("Freq of "+num+" is "+counter);
	}
}