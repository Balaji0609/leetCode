public class Solution 
{
    public int hammingDistance(int x, int y) 
    {
        int z = (int) (x^y);
        int count = 0;
        while(z != 0)
        {
            z &= (z-1);
            count++;
        }
        return count;
    }
}