package code;
public class Test {
	public static void main(String[] args) {
		String arr[] ={"a","b","c","d","e","f","g","h","i","j"};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        System.out.println(sb);
	}
}