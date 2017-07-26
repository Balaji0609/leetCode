package leetCode;

import java.util.*;

public class Next_Greater_Element_I_496 
{
    public int[] nextGreaterElement(int[] findNums, int[] nums) 
    {
        if(findNums.length == 0)
            return new int[]{};
        int[] retNums = new int[findNums.length];
        Stack<Integer> st = new Stack<Integer>();
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        
        for(int val : nums)
        {
            while(!st.isEmpty() && st.peek() < val )
            {
                mp.put(st.pop(),val);
            }
            st.push(val);
        }
        int j = 0;
        for(int vals : findNums)
        {
            retNums[j++] = mp.getOrDefault(vals,-1);
        }
        return retNums;
    }
}
