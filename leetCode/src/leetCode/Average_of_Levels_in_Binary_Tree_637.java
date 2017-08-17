package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Average_of_Levels_in_Binary_Tree_637 
{
	public class TreeNode {     
		int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
    public List<Double> averageOfLevels(TreeNode root) 
    {
        List<Double> retList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)
            return retList;
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            double sum = 0.0;
            for(int i = 0 ; i < n;i++)
            {
                TreeNode temp = q.poll();
                sum += temp.val;
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
            }
            retList.add(sum/n);
        }
        return retList;
    }
}
