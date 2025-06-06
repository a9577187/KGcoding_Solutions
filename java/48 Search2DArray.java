package code;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr1[][]= {{1,2,3,2,1},{4,5,6,4},{7,8,9}};
		int target=8;
		boolean found=false;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				if(arr1[i][j]==target) {
					System.out.println("Matched at row "+i+" and column "+j);
					found=true;
					break;
				}
			}
			if (found){
				break;
			}
		}
		if (!found){
			System.out.println("Not matched");
		}
	}
}
