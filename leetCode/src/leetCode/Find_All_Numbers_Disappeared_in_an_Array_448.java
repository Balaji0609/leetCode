package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array_448 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> ls = new ArrayList<Integer>();
        for(int i = 0 ; i< nums.length; i++)
        {
            int val = Math.abs(nums[i]) -1;
            if(nums[val] > 0)
                nums[val] = -nums[val];
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] > 0)
                ls.add(i+1);
        }
        return ls;
    }

}
