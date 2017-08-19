package leetCode;

public class Count_Primes_204 
{
    public int countPrimes(int n) 
    {
        int count = 0;
        boolean []arr = new boolean[n];
        for(int i = 2 ; i < n ; i++)
        {
            if(arr[i] == false)
            {
                count++;
                for(int j = 2; j*i < n; j++)
                {
                    arr[j*i] = true;
                }
            }
        }
        return count;
        
    }
}
