package leetCode;

public class Remove_Duplicates_from_Sorted_Array_26 
{
    public int removeDuplicates(int[] nums) 
    {
        int start = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] != nums[i])
                nums[start++] = nums[i];
        }
        return start;
    }
}
