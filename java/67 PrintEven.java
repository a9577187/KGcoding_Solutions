package code;
public class Test {

	public static void main(String[] args) {
		for(int i=0;i<101;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			else {
				continue;
			}
		}
	}
}