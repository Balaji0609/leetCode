/**
 * This class contains the fucntion to count the bits.  
 *
 * @author      Balaji Chandrasekaran.
 * @version     1.0
 *
 */
public class Solution 
{
	/**
     * This is the function which takes num as input and generates the count of all the bits set from 1 to the given num.
     *
     * @param num    	Upto which the count of set bits need to be found.    
     * @return int[]    Return an array of counts of set bit for each num from 1.      
     */
    public int[] countBits(int num) 
    {
        int[] retarr = new int[num+1];
        retarr[0] = 0;
        for(int i = 1 ; i <= num; i++)				// Only runs n times.
        {
            retarr[i] = retarr[i&(i-1)] + 1; 
        }
        return retarr;
    }
}