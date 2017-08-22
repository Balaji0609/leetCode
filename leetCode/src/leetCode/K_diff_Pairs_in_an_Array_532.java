package leetCode;
import java.util.*;
import java.util.Map.Entry;
public class K_diff_Pairs_in_an_Array_532 
{
    public int findPairs(int[] nums, int k) 
    {
        if (nums == null || nums.length == 0 || k < 0)   
            return 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0) + 1);
        }
        int count = 0;
        Map.Entry<Integer,Integer> entry;
        Iterator<Entry<Integer, Integer>> it = hmap.entrySet().iterator();
        while(it.hasNext())
        {
            entry = (Map.Entry<Integer,Integer>)it.next();
            if(k == 0)
            {
                if(entry.getValue() >= 2) {
                    count++;
                }
            }
            else
            {
                if(hmap.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
        
    }
}
