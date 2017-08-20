package leetCode;
import java.util.*;
public class Intersection_of_Two_Arrays_349 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        if(nums1.length == 0 || nums2.length == 0)
            return new int[]{};
        List<Integer> retArr= new ArrayList<Integer>(); 
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int n : nums1)
        {
            hmap.put(n, (hmap.getOrDefault(n,0) + 1));
        }
        for(int n : nums2)
        {
            if(hmap.containsKey(n) && (hmap.get(n) > 0))
            {
                if(!retArr.contains(n))
                    retArr.add(n);
                hmap.put(n, (hmap.get(n) - 1));
            }
        }
        int[] ret = new int[retArr.size()];
        for(int j = 0 ; j < ret.length; j++)
        {
            ret[j] = retArr.get(j);
        }
        return ret;
    }
}
