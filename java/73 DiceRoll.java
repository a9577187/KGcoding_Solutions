package code;
public class Test {
	public static void main(String[] args) {
		int dice;
		while (true) {
			dice=((int)(Math.random()*10));
			if(dice>=1 && dice<=6) {
				System.out.println(dice);
				break;
			}
		}
	}
}