package leetCode;

public class Arranging_Coins_441 
{
    public int arrangeCoins(int n) 
    {
        return (int)((-1+ Math.sqrt(1+8*(long)n))/2);
    }
}
