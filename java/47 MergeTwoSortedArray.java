package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr1[]= {1,3,5,7,9};
		int arr2[]= {2,4,6,8};
		int length1=arr1.length;
		int length2=arr2.length;
		int res=length1+length2;
		int result[]= new int[res];
		int index=0;
		int i=0;
		int j=0;
		while(i<length1 && j<length2) {
			if(arr1[i]<=arr2[j]) {
				result[index++]=arr1[i++];
			}
			else {
				result[index++]=arr2[j++];
			}
		}
		while (i<length1) {
			result[index++]=arr1[i++];
		}
		while (j<length2) {
			result[index++]=arr2[j++];
		}
		for(int k=0;k<res;k++) {
			System.out.print(result[k]+" ");
		}
	}
}
