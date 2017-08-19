package leetCode;

public class Convert_Sorted_Array_to_Binary_Search_Tree_108 
{
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	 }
    public TreeNode insertFunc(int[] nums, int start, int end)
    {
        if(start>end)
            return null;
        int mid = start+(end-start)/2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = insertFunc(nums,start,mid-1);
        newNode.right = insertFunc(nums,mid+1,end);
        return newNode;
    }
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        if(nums.length == 0)
            return null;
        return insertFunc(nums,0,nums.length-1);
    }
}
