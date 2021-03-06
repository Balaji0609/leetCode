package leetCode;

public class Move_Zeroes_283 
{
    public void moveZeroes(int[] nums) {
        
        int size = nums.length;
        
        int counter = 0;
        
        for(int i = 0; i < size; i++)
        {
            if(nums[i] == 0)
            {
                counter++;
            }
            else if(counter != 0)
            {
                nums[i - counter] = nums[i];
            }
        }
        
        for(int i = (size-1); i >= 0 && counter != 0; i--, counter--)
        {
                nums[i] = 0;
        }
        
    }
}
