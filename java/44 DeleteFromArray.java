package code;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int index=0;
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==num) {
				index=i;
				break;
			}
		}
		for(int i=index;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
