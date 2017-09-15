package leetCode;

import java.util.*;

public class Binary_Tree_Level_Order_Traversal_102 
{
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	 }
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        if(root == null)
            return new ArrayList<>();
        Queue<TreeNode> qTree = new LinkedList<TreeNode>();
        qTree.offer(root);
        int curNum = 1;
        List<List<Integer>> retList= new ArrayList<>();
        List<Integer> curList;
        while(!qTree.isEmpty())
        {
            curNum = qTree.size();
            curList = new ArrayList<Integer>();
            for(int i = 0; i < curNum ; i++)
            {
                TreeNode tmp = qTree.poll();
                if(tmp.left != null)
                    qTree.add(tmp.left);
                if(tmp.right != null)
                    qTree.add(tmp.right);
                curList.add(tmp.val);
            }
            retList.add(curList);
        }
        return retList;
    }
}
