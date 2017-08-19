package leetCode;
import java.util.*;

public class Binary_Tree_Paths_257 
{
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	 }
    public void helperFunc(TreeNode root, List<String> ret, List<Integer> curr)
    {
        if(root == null)
            return;
        curr.add(new Integer(root.val));
        if(root.left == null && root.right == null)
        {
            StringBuilder strb = new StringBuilder();
            for(int i = 0; i< curr.size()-1; i++)
            {
                strb.append(curr.get(i)).append("->");
            }
            strb.append(curr.get(curr.size()-1));
            ret.add(new String(strb));
            curr.remove(curr.size()-1);
            return;
        }
        else
        {
            helperFunc(root.left,ret,curr);
            helperFunc(root.right,ret,curr);
        }
        curr.remove(curr.size()-1);
    }
    public List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> result = new LinkedList<String>();
        List<Integer> curr = new LinkedList<Integer>();
        helperFunc(root,result, curr);
        return result;
    }
}
