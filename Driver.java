public class Driver {
	public static void main(String[] args) {
		String filename = "words_test.txt";
		WordTree wordtree = new WordTree(filename);
		//wordtree.printPrefix("a");
		//wordtree.numPrefix("a");
		/*for(int i=0; i<1000; i++) {
			System.out.println(wordtree.randword());
		}*/
		System.out.println(wordtree.randword());
		System.out.println(wordtree.longestWord());
	}
}
