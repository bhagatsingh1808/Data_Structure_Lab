//package node;
public class TreeNode{
	private int data;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(int data){
		this.data=data;
		left=null;
		right = null;
		}
	public int getData()
	{
		return data;
	}
	public void setLeft(TreeNode left)
	{
		this.left=left;
	}
	public TreeNode getLeft()
	{
		return left;
	}
	public void setRight(TreeNode right){
		this.right=right;
	}
	public TreeNode getRight()
	{
		return right;
	}
///getter setter 
}	