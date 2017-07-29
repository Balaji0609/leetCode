package leetCode;

public class Convert_BST_to_Greater_Tree_538 
{
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
    public int helperFunc(TreeNode root,int temp)
    {
        if(root == null)
            return temp;
        temp = helperFunc(root.right, temp);
        temp += root.val;
        root.val = temp;
        temp = helperFunc(root.left, temp);
        return temp;
    }
    public TreeNode convertBST(TreeNode root) 
    {
        int temp = 0;
        helperFunc(root,temp);
        return root;
    }
}
