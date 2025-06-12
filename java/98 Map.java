package code;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String,String> m1=new HashMap<String, String>();
		m1.put("India", "New delhi");
		m1.put("Nepal", "Katmandu");
		m1.put("BG", "Dhaka");
		m1.put("Japan", "Tokyo");
		m1.put("Russia", "Moscow");
		System.out.println("Enter name of any contry: ");
		String inp=sc.next();
		if(m1.containsKey(inp)) {
			System.out.println(m1.get(inp));
		}
	}
}