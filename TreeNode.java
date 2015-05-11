import java.util.ArrayList;

public class TreeNode {
	private String data;
	private ArrayList<TreeNode> children;
	
	public TreeNode(String data) {
		setData(data);
		children = new ArrayList<>();
	}
	
	public String toString() {
		return data;
	}
	
	public void setData(String d) {
		data = d;
	}
	public String getData() {
		return data;
	}
	
	// the following method is used only while populating the WordTree
	public TreeNode getNode(String data) {
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
