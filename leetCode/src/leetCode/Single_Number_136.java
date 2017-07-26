package leetCode;

public class Single_Number_136 
{
    public int singleNumber(int[] nums) 
    {
        int ret = 0;
        for(int i: nums)
        {
            ret ^= i;   
        }
        return ret;
    }
}
