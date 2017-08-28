package leetCode;
import java.util.*;
public class Path_Sum_III_437 
{
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	 }
    public int helperFunc(TreeNode root, int sum, int target, Map<Integer,Integer> hmap)
    {
        if(root == null)
            return 0;
        sum +=root.val;
        int res = hmap.getOrDefault(sum-target,0);
        hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        
        res += helperFunc(root.left,sum,target,hmap) + helperFunc(root.right,sum,target,hmap);
        hmap.put(sum,hmap.get(sum)-1);
        return res;
    }
    public int pathSum(TreeNode root, int sum) 
    {
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        hmap.put(0,1);
        return helperFunc(root,0,sum,hmap);
    }
}
