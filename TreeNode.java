import java.util.ArrayList;

public class TreeNode {
	private char data;
	private ArrayList<TreeNode> children;
	
	public TreeNode(char data) {
		setData(data);
		children = new ArrayList<>();
	}
	
	public void setData(char d) {
		data = d;
	}
	public char getData() {
		return data;
	}
	
	public TreeNode getNode(char data) {
		for(TreeNode node : children) {
			if(node.getData() == data)
				return node;
		}
		
		TreeNode newNode = new TreeNode(data);
		children.add(newNode);
		return newNode;
	}
	public ArrayList<TreeNode> getChildren() {
		return children;
	}
	public void addNode(TreeNode child) {
		children.add(child);
	}
}
