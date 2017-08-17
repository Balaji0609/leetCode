package leetCode;

public class Balanced_Binary_Tree_110 
{
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	 }
    public int maxDepth(TreeNode root)
    {
        
        if(root == null)
            return 0;
        return 1+ Math.max(maxDepth(root.right), maxDepth(root.left));

    }
    public boolean isBalanced(TreeNode root) 
    {
        if(root == null)
            return true;
        int val1 = maxDepth(root.left);
        int val2 = maxDepth(root.right);
        if(val1 - val2 > 1 || val1 - val2 < -1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
