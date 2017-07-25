package leetCode;

public class Hamming_Distance_461 {
    public int hammingDistance(int x, int y) 
    {
        int val = x^y;
        int count = 0;
        while(val != 0)
        {
            val = val & (val-1);
            count++;
        }
        return count;
    }
}
