package leetCode;

public class Climbing_Stairs_70 
{
    public int climbStairs(int n) 
    {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int res = 0;
        int curS = 2;
        int prevS = 1;
        for(int i = 2; i < n; i++)
        {
            res = curS + prevS;
            prevS = curS;
            curS = res;
        }
        return  res;
    }
}
