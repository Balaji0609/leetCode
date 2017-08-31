package leetCode;

public class Third_Maximum_Number_414 
{
    public int thirdMax(int[] nums) 
    {
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;
        for(int i: nums)
        {
            if(i == Integer.MIN_VALUE)
                i = i+1;
            if(i > firstmax)
            {
                thirdmax = secondmax;
                secondmax = firstmax;
                firstmax = i;
            }
            if(i > secondmax && i < firstmax)
            {
                thirdmax = secondmax;
                secondmax = i;
            }
            if(i > thirdmax && i < secondmax)
                thirdmax = i;
        }
        if(thirdmax == Integer.MIN_VALUE)
            return firstmax;
        if(thirdmax == Integer.MIN_VALUE+1)
            return thirdmax-1;
        else
            return thirdmax;
    }
}
