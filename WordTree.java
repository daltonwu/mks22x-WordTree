import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class WordTree {
	private TreeNode root;
	
	// constructor populates the tree
	public WordTree(String filename) {
		root = new TreeNode("");
		Scanner input = null;
		try {
			input = new Scanner(new File(filename));
		} catch(Exception e) {
			System.out.println(e);
		}
		
		while(input.hasNext()) {
			String word = input.next();
			TreeNode next = root;
			
			for(int i=0; i<word.length(); i++) {
				next = next.getNode(word.substring(i,i+1));
			}
		}
	}
	
	// some of the the following methods + helpers are (were) used only for testing
	// literally print all
	public void printAll() {
		ArrayList<String> values = getAll();
		for(String foo : values) {
			System.out.println(foo);
		}
	}
	// literally get all
	public ArrayList<String> getAll() {
		return getAllHelper(root);
	}
	private ArrayList<String> getAllHelper(TreeNode node) {
		ArrayList<String> toReturn = new ArrayList<>();
		ArrayList<TreeNode> children = node.getChildren();
		if(children.isEmpty()) {
			toReturn.add(node.getData());
		}
		else {
			for(TreeNode n : children) {
				ArrayList<String> foo = getAllHelper(n);
				for(String s : foo) {
					toReturn.add(node.getData() + s);
				}
			}
		}
		return toReturn;
	}
	
	// returns ArrayList of all words with a given prefix
	public ArrayList<String> getPrefix(String prefix) {
		ArrayList<String> values = new ArrayList<>();
		ArrayList<TreeNode> children = root.getChildren();
		for(TreeNode n : children) {
			values.addAll(getPrefixHelper(n, prefix));
		}
		return values;
	}
	private ArrayList<String> getPrefixHelper(TreeNode node, String prefix) {
		ArrayList<String> toReturn = new ArrayList<>();
		ArrayList<TreeNode> children = node.getChildren();
		boolean dataMatches = prefix.isEmpty() || node.getData().equals(prefix.substring(0,1));
		//System.out.printf("match %b, node %s, prefix %s%n", dataMatches, node, prefix);
		if(dataMatches) {
			if(children.isEmpty()) {
				if(prefix.length() <= 1) // only add if prefix is also ending at / has ended by this node
					toReturn.add(node.getData());
				else
					toReturn.add("");
			}
			else {
				for(TreeNode n : children) {
					String newPrefix = prefix.isEmpty() ? "" : prefix.substring(1);
					ArrayList<String> foo = getPrefixHelper(n, newPrefix);
					for(String s : foo) {
						toReturn.add(node.getData() + s);
					}
				}
			}
		}
		//System.out.println(toReturn);
		return toReturn;
	}
	// prints all words with a given prefix
	public void printPrefix(String prefix) {
		ArrayList<String> values = getPrefix(prefix);
		for(String foo : values) {
			System.out.println(foo);
		}
	}
	// returns number of words with a given prefix
	public int numPrefix(String prefix) {
		return getPrefix(prefix).size();
	}
	
	// generates random word
	public String randword() {
		Random rand = new Random();
		String word = "";
		TreeNode next = root;
		ArrayList<TreeNode> children = next.getChildren();
		while(!children.isEmpty()) {
			next = children.get(rand.nextInt(children.size()));
			word += next.getData();
			children = next.getChildren();
		}
		return word;
	}
	
	// finds longest word
	public String longestWord() {
		ArrayList<String> values = getAll();
		String champ = values.get(0);
		int length = champ.length();
		for(String s : values) {
			if(s.length() > length) {
				length = s.length();
				champ = s;
			}
		}
		return champ;
	}
}
