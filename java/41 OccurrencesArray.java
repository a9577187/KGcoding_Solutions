package code;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,1,2,2,2,1,3,2,1};
		System.out.println("Enter a number (1,2 or 3): ");
		int num=sc.nextInt();
		int occ=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				occ++;
			}
		}
		System.out.println(occ);
	}
}
