package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	static void sortList(List<String> str) {
		Collections.sort(str, new Comparator<String>() {

			public int compare(String o1, String o2) {
				if(o1.equals(o2)){
					return 0;
				}
				else if (o1.charAt(0)<o2.charAt(0)) {
					return 1;
				}
				else {
					return -1;
				}
			}
		}
		);
	}
	public static void main(String[] args) {
		List<String> list =Arrays.asList("bcd","def", "abc");
		sortList(list);
		System.out.println(list);
	}
}