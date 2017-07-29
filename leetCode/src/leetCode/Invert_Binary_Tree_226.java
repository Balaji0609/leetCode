package leetCode;

public class Invert_Binary_Tree_226 
{
	public class TreeNode 
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
    public TreeNode helperInvert(TreeNode root)
    {
        if(root == null)
            return null;
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        helperInvert(root.right);
        helperInvert(root.left);
        return root;
    }
    public TreeNode invertTree(TreeNode root) 
    {
        return helperInvert(root);
        
    }
}
