package code;
import java.util.*;
public class Test {
	static boolean isPalindrome(char str[],int start,int end) {
		if(start>=end) {
			return true;
		}
		else if (str[start]==str[end]) {
			return isPalindrome(str, start+1, end-1);
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a small number: ");
		String str=sc.nextLine();
		int end=str.length()-1;
		char arr[]=str.toCharArray();
		System.out.println(isPalindrome(arr, 0, end));
	}
}