import java.util.Scanner;
import java.io.File;

public class WordTree {
	private TreeNode root;
	
	public WordTree(String filename) {
		root = new TreeNode('a');
		Scanner input = null;
		try {
			input = new Scanner(new File(filename));
		} catch(Exception e) {
			System.out.println(e);
		}
		
		while(input.hasNext()) {
			String word = input.next();
			TreeNode next = root.getNode(word.charAt(0));
			
			for(int i=1; i<word.length(); i++) {
				next = root.getNode(word.charAt(i));
			}
		}
	}
	
	public void printAll() {
		ArrayList<String> values = printAllHelper(root);
	}
	private ArrayList<String> printAllHelper(TreeNode node) {
		if(node == null)
			return null;
		ArrayList<TreeNode> children = node.getChildren();
		for(TreeNode n : children) {
		}
	}
}
