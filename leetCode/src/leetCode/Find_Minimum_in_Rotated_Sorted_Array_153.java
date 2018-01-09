package leetCode;

public class Find_Minimum_in_Rotated_Sorted_Array_153 
{
    public int binarySearch(int[] nums, int start, int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            System.out.println("mid: " + mid);
            if(mid > 0 && nums[mid] < nums[mid-1])
                return nums[mid];
            
            if(nums[start] <= nums[mid] && nums[mid] > nums[end])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        
        return nums[start];
    }
    public int findMin(int[] nums) 
    {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        return binarySearch(nums,0,nums.length-1);
    }
}
