package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Distribute_Candies_575 
{
    public int distributeCandies(int[] candies) 
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int candy: candies)
            set.add(candy);
        return Math.min(set.size(),candies.length/2);
    }	

}
