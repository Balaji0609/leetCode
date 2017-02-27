/**
 * This class contains the fucntion to find the Hamming Distance.  
 *
 * @author      Balaji Chandrasekaran.
 * @version     1.0
 *
 */
public class Solution 
{
	/**
     * This is the function which takes two number x and y as input and generates the Hamming Distance of them.
     *
     * @param x   	Input 1 to find the Hamming Distance.
	 * @param y		Input 2 to find the Hamming Distance.
     * @return int    Return the hamming distance of two numbers.      
     */
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