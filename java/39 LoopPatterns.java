package code;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nummber of rows: ");
		int rows=sc.nextInt();
		System.out.println("Right Half Pyramid:");
		printRightHalfPyramid(rows);
		System.out.println("Reverse Right Half Pyramid:");
        printReverseRightHalfPyramid(rows);
        System.out.println("Left Half Pyramid:");
        printLeftHalfPyramid(rows);

	}
	 static void printLeftHalfPyramid(int rows) {
		 for(int i=0;i<rows;i++) {
				for(int j=rows-1-i;j>0;j--) {
					System.out.print(" ");
				}
				for(int k=0;k<i+1;k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
	}
	 static void printReverseRightHalfPyramid(int rows) {
		for(int i=0;i<rows;i++) {
			for(int j=rows-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	 static void printRightHalfPyramid(int rows) {
		for(int i=0;i<=rows;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
