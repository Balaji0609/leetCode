package leetCode;

public class ArrayNesting_565 
{
    public int arrayNesting(int[] nums) 
    {
        int size = 0;
        for(int i = 0 ; i < nums.length;i++)
        {
            if(nums[i] == -1)
                continue;
            int j = i;
            int currSize = 0;
            while(nums[j]>=0)
            {
                int temp = nums[j];
                nums[j] = -1;
                currSize++;
                j = temp;
            }
            size = Math.max(currSize,size);
        }
        return size;
    }
}
