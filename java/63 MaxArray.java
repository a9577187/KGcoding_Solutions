package code;
public class Test {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int max=arr[0];
		for(int i : arr) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println("Max elemnt is "+max);
	}
}