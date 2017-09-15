package leetCode;

import java.util.*;

public class Binary_Tree_Inorder_Traversal 
{
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        Stack<TreeNode> trav = new Stack<TreeNode>();
        List<Integer> retLis = new LinkedList<Integer>();
        TreeNode tr = root;
        while(tr != null || !trav.empty())
        {
            while(tr != null)
            {
                trav.push(tr);
                tr = tr.left;
            }
            tr = trav.pop();
            retLis.add(tr.val);
            tr = tr.right;
        }
        return retLis;
    }
}
