package leetCode;

public class Number_of_1_Bits_191 
{
    public int hammingWeight(int n) 
    {
        int count = 0;
        while(n != 0)
        {
            n &= n-1;
            count++;
        }
        return count;
    }
}
