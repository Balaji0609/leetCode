package leetCode;

public class Minimum_Depth_of_Binary_Tree_111 
{
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
    public int minDepth(TreeNode root) 
    {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0)
            return left + right + 1;
        else
            return 1 + Math.min(left, right); 
    }
}
