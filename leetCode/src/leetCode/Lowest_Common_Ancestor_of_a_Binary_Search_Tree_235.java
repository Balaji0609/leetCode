package leetCode;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235 
{
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
		 }
    public TreeNode ancestorHelper(TreeNode root,TreeNode p,TreeNode q)
    {
        if(root == null)
            return null;
        if(p.val> root.val && root.val<q.val)
            return ancestorHelper(root.right,p,q);
        else if(p.val< root.val && root.val>q.val)
            return ancestorHelper(root.left,p,q);
        else
            return root;     
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        return ancestorHelper(root,p,q);   
    }
}
