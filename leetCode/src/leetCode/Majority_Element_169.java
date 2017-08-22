package leetCode;

import java.util.*;

public class Majority_Element_169 
{
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0) + 1);
        }
        //Iterator<?> it;
        for(HashMap.Entry<Integer,Integer> et : hmap.entrySet())
        {
            if(et.getValue() > (nums.length/2))
                return et.getKey();
        }
        return 0;
    }
}
