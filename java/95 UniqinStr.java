package code;
import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Character> set1=new HashSet<>();
		String s1="vasvbascbscbdvcsdacsadcbvdscvad";
		char arr[]=s1.toCharArray();
		for(char ele:arr) {
			set1.add(ele);
		}
		System.out.println(set1);
	}
}