package leetCode;

public class Valid_Perfect_Square_367 
{
    public boolean isPerfectSquare(int num) 
    {
        if(num == 0 || num == 1)
            return true;
        int start = 0, end = num;
        
        while(start <= end)
        {
            float mid = start + (end - start)/2;
            float temp = num/mid;
            
            if(mid == temp)
                return true;
            if(mid > temp)
                end = (int)mid - 1;
            else
                start = (int)mid + 1;
        }
        return false;
        
    }

}
