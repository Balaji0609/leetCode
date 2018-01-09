package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array_442 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> ls = new ArrayList<Integer>();
        for(int i = 0; i < nums.length;i++)
        {
            int val = Math.abs(nums[i]) - 1;
            
            if(nums[val] < 0)
                ls.add(val+1);
            else
                nums[val] = - nums[val];
        }
        return ls;        
    }

}
