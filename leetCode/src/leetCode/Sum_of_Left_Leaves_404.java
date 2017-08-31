package leetCode;

public class Sum_of_Left_Leaves_404 
{
	 public class TreeNode 
	 {
	 	int val;
	 	TreeNode left;
	 	TreeNode right;
	 	TreeNode(int x) { val = x; }
	 }
    public int sumCalc(TreeNode root, int flag)
    {
        if(root == null)
            return 0;
        if(root.right == null && root.left == null && flag == 1)
        {
            return root.val;
        }
        //int sum = sumCalc(root.left,1);
        //sum += sumCalc(root.right,-1);
        return sumCalc(root.left,1) + sumCalc(root.right,-1);
    }
    public int sumOfLeftLeaves(TreeNode root) 
    {
        
        if(root == null)
            return 0;
        if(root.right == null && root.left == null)
            return 0;
        return sumCalc(root,0);
        
    }
}
