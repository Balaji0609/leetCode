package leetCode;

import java.util.*;

public class Binary_Tree_Level_Order_Traversal_II_107 
{
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
        if(root == null)
            return new ArrayList<>();    
        Queue<TreeNode> qTmp = new LinkedList<TreeNode>();
        qTmp.offer(root);
        List<List<Integer>> retArr = new ArrayList<>();
        int size;
        List<Integer> tmp;
        TreeNode t = new TreeNode(0);
        while(!qTmp.isEmpty())
        {
            size = qTmp.size();
            tmp = new ArrayList<Integer>();
            for(int i = 0; i < size ; i++)
            {
                t = qTmp.poll();
                //if(t != null)
                //{
                tmp.add(t.val);
                if(t.left != null)
                    qTmp.offer(t.left);
                if(t.right != null)
                    qTmp.offer(t.right);
                //}
            }
            retArr.add(0,tmp);
        }
        return retArr;
    }
}
