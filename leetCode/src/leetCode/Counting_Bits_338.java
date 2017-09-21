package leetCode;

public class Counting_Bits_338 
{
    public int[] countBits(int num) 
    {
        int[] ret = new int[num + 1];
        ret[0] = 0;
        for(int i = 1; i <= num; i++)
        {
            ret[i] = ret[i & (i-1)] + 1;
        }
        return ret;
    }
}
