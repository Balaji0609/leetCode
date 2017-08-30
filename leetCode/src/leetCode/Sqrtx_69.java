package leetCode;

public class Sqrtx_69 
{
    public int mySqrt(int x) 
    {
        if(x == 0 || x == 1)
            return x;
        int start = 1, end = x;
        int ret = 0;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(mid == x/mid)
                return mid;
            if(mid < x/mid)
            {
                start = mid+1;
                ret = mid;
            }
            else
                end = mid-1;
        }
        return ret;
    }
}
