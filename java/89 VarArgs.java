package code;
public class Test {
	static int add(int...nums ) {
		int sum=0;
		for(int num:nums) {
			sum+=num;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1,2,3,4));
	}
}