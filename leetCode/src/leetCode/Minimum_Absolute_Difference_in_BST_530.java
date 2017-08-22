package leetCode;
import java.util.*;

 
public class Minimum_Absolute_Difference_in_BST_530 
{
	public class TreeNode 
	{
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
    public int getMinimumDifference(TreeNode root) 
    {
        int prev = -1;
        int diff = Integer.MAX_VALUE;
        if(root == null)
            return 0;
        Stack<TreeNode> trstack = new Stack<TreeNode>();
        trstack.push(root);
        TreeNode temp = root;
        while(trstack.size() > 0)
        {
            while(temp.left != null)
            {
                trstack.push(temp.left);
                temp = temp.left;
            }
            TreeNode node = trstack.pop();
            if( prev != -1 && ((node.val - prev) < diff))
            {
                diff = node.val - prev;
            }
            prev = node.val;
            /* if(node.val > firstmax)
                firstmax = node.val;
            if(node.val > secondmax && node.val < firstmax)
                secondmax = node.val;
             */   
            if(node.right != null)
            {
                trstack.push(node.right);
                temp = node.right;
            }
        }
        return diff;
    }
}
