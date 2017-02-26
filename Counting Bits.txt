
public class Solution 
{
    public int[] countBits(int num) 
    {
        int[] retarr = new int[num+1];
        retarr[0] = 0;
        for(int i = 1 ; i <= num; i++)
        {
            retarr[i] = retarr[i&(i-1)] + 1; 
        }
        return retarr;
    }
}