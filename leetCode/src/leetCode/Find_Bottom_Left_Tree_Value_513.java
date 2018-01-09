package leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Find_Bottom_Left_Tree_Value_513 
{
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
    public int findBottomLeftValue(TreeNode root) 
    {
        if(root == null)
            return -1;
        Queue<TreeNode> tree = new LinkedList<TreeNode>();
        int size = 0;
        tree.offer(root);
        int leftMostValue = 0;
        while(!tree.isEmpty())
        {
            size = tree.size();
            TreeNode t = tree.peek();
            leftMostValue = t.val;
            for(int i = 0 ; i < size ; i++)
            {
                TreeNode tmp = tree.poll();
                if(tmp.left != null)
                    tree.offer(tmp.left);
                if(tmp.right != null)
                    tree.offer(tmp.right);
            }
        }
        return leftMostValue;
    }
}
