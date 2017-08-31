package leetCode;
import java.util.*;

public class Two_Sum_1 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length; i ++)
        {
            int diff = target - nums[i];
            if(!(hmap.containsKey(diff)))
            {
                hmap.put(nums[i],i);
            }
            else
            {
                return new int[]{hmap.get(diff),i};
            }
        }
        return new int[]{0,0};
    }
}
