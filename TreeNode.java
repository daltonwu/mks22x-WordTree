public class TreeNode {
	private char data;
	private TreeNode next;
	
	public class TreeNode(char data) {
		setData(data);
		next = null;
	}
	
	public void setNext(TreeNode next) {
		this.next = next;
	}
	public void setData(char data) {
		this.data = data;
	}
	
	public char getData() {
		return this.data;
	}
	public TreeNode getNext() {
		return next;
	}
}
