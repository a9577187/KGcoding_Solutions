package code;
import java.util.*;
public class Test {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<(arr.length)/2;i++) {
			swap(arr,i,arr.length-1-i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	 static void swap(int arr[],int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;	
	}
}
