package code;
import java.util.Scanner;
public class Test {
	static int LCM(int num1,int num2) {
		int min=num1>num2?num2:num1;
		int res=num1*num2;
		int hcf=1;
		for(int i=min;i>0;i--) {
			if(num1%i==0 && num2%i==0) {
				hcf=i;
				break;
			}
		}
		res/=hcf;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first nummber: ");
		int num1=sc.nextInt();
		System.out.print("Enter second nummber: ");
		int num2=sc.nextInt();
		System.out.println("LCM is "+LCM(num1,num2));
	}
}
