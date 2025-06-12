package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,3,4,3,1,3,2,1,2,3,4,2,2,1,3,4,2,1);
		System.out.println(list);
		Collections.swap(list, 0, 1);
		System.out.println(list);
	}
}