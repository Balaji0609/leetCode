package leetCode;

import java.util.*;
public class Contains_Duplicate_217 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> s = new HashSet<Integer>();
        for(int n : nums)
        {
            if(s.contains(n))
                return true;
            s.add(n);
        }
        return false;
        
    }
}
