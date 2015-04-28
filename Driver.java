import java.util.Scanner;
import java.io.File;

public class Driver {
	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(new File("words_test.txt"));
		} catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
