package code;
 class Calculator {
	 int add(int num1,int num2) {
		 return num1+num2;
	 }
	 int add(int num1,int num2,int num3) {
		 return num1+num2+num3;
	 }
	 float add(float num1,float num2) {
		 return num1+num2;
	 }
}
public class Test {
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		System.out.println(c1.add(1, 2));
		System.out.println(c1.add(1, 2,3));
		System.out.println(c1.add(1.4f, 2.4f));
	}
}