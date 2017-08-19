package leetCode;
import java.util.*;
public class Contains_Duplicate_II_219 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int index = 0;
        for(int n : nums)
        {
            if(hmap.containsKey(n))
            {
                if(index - hmap.get(n) <= k)
                    return true;
                else
                    hmap.put(n,index);
            }
            else
                hmap.put(n,index);
            index++;
        }
        return false;
    }
}
