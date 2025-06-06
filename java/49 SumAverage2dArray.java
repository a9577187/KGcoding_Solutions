package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr1[][]= {{1,2,3,2,1},{4,5,6,4},{7,8,9}};
		int sum=0;
		int counter=0;
		boolean found=false;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				sum+=arr1[i][j];
				counter++;
			}
		}
		System.out.println("Sum is "+sum+" and average is "+sum/counter);
	}
}
