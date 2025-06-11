package code;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String filename = "E:\\Study Material\\Code\\KGcoding_Solutions\\README.md";

        try {
            File file = new File(filename);
            FileReader fileReader = new FileReader(file);
            Scanner fileScanner = new Scanner(fileReader);

            System.out.println("File contents:");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
	}
}