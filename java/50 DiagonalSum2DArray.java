package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		boolean found=false;
		int n=arr1.length;
		for(int i=0;i<n;i++) {
			sum+=arr1[i][i];
			if(i!=n-1-i) {
				sum+=arr1[i][n-1-i];
			}
		}
		System.out.println("Sum is "+sum);
	}
}
