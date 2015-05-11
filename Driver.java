import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String filename = "words_full.txt";
		WordTree wordtree = new WordTree(filename);
		String s =	"\n\nThis is Dalton Wu's WordTree project.\n";
		s +=		"Type a method name and parameter (if needed) separated by [4mone space[0m. You can find the list of methods in the readme file. Please don't break my code. Examples:\n\n";
		s +=		"randword\n\n";
		s +=		"printPrefix abc\n\n";
		System.out.println(s);
		String again = "";
		while(true) {
			String query = input.nextLine().trim();
			String[] in = query.split(" ");
			try {
			if(in.length > 2) {
				System.out.println("I thought I told you not to do that.");
			}
			if(in[0].equalsIgnoreCase("getAll")) {
				System.out.println(wordtree.getAll());
			}
			else if(in[0].equalsIgnoreCase("printAll")) {
				wordtree.printAll();
			}
			else if(in[0].equalsIgnoreCase("getPrefix")) {
				System.out.println(wordtree.getPrefix(in[1]));
			}
			else if(in[0].equalsIgnoreCase("printPrefix")) {
				wordtree.printPrefix(in[1]);
			}
			else if(in[0].equalsIgnoreCase("numPrefix")) {
				System.out.println(wordtree.numPrefix(in[1]));
			}
			else if(in[0].equalsIgnoreCase("randword")) {
				System.out.println(wordtree.randword());
			}
			else if(in[0].equalsIgnoreCase("longestWord")) {
				System.out.println(wordtree.longestWord());
			}
			else {
				System.out.println("What? Try typing that again?");
			}
			} catch(Exception e) {
				System.out.println("What? Try typing that again?");
			}
			System.out.println("");
		}
		//wordtree.printPrefix("a");
		//wordtree.numPrefix("a");
		/*for(int i=0; i<1000; i++) {
			System.out.println(wordtree.randword());
		}*/
		//System.out.println(wordtree.randword());
		//System.out.println(wordtree.longestWord());
	}
}
