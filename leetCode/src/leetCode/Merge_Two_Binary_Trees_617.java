package leetCode;

public class Merge_Two_Binary_Trees_617 
{
	class TreeNode 
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
    public TreeNode helperMerge(TreeNode t1, TreeNode t2)
    {
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        t1.val +=t2.val;
        t1.left = helperMerge(t1.left,t2.left);
        t1.right = helperMerge(t1.right,t2.right);
        return t1;
    }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) 
    {
        return helperMerge(t1,t2);
        
    }
}
