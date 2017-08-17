package leetCode;

public class Best_Time_to_Buy_and_Sell_Stock_121 
{
    public int maxProfit(int[] prices) 
    {
        int minEle = Integer.MAX_VALUE;
        int maxDif = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < minEle)
                minEle = prices[i];
            if(maxDif < prices[i] - minEle)
                maxDif = prices[i] - minEle;
        }
        return maxDif;
    }
}
