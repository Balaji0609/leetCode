package leetCode;

public class Same_Tree_100 
{
	 public class TreeNode 
	 {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	public class Solution 
	{
	    public boolean helperFunc(TreeNode t1, TreeNode t2)
	    {
	        if(t1 == null && t2 == null)
	            return true;
	        else if(t1 == null || t2 == null)
	            return false;
	        else if(t1.val == t2.val)
	            return true && helperFunc(t1.left,t2.left) && helperFunc(t1.right,t2.right);
	        return false;
	    }
	    public boolean isSameTree(TreeNode p, TreeNode q) 
	    {
	        return helperFunc(p,q);
	    }
	}
}
