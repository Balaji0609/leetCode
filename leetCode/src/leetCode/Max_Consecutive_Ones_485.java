package leetCode;

public class Max_Consecutive_Ones_485 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int flag = 0;
        int maxval = Integer.MIN_VALUE;
        int curval = 0;
        for(int n: nums)
        {
            if(maxval < curval)
                maxval = curval;
            if(n == 1)
            {
                if(flag == 1)
                    curval += 1;
                else
                {
                    curval = 1;
                    flag = 1;
                }
            }
            else
                flag = 0;
        }
        if(maxval < curval)
            maxval = curval;        
        return maxval;
        
    }
}
