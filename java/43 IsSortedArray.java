package code;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int counter=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				counter++;
			}
		}
		if(counter==arr.length-1) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("Unsorted");
		}
	}
}
