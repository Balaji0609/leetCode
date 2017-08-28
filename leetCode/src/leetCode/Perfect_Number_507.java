package leetCode;

public class Perfect_Number_507 
{
    public boolean checkPerfectNumber(int num) 
    {
        if(num == 1 || num == 0)
            return false;
        int sum = 0;
        int val = (int)Math.sqrt(num);
        for(int i = 2; i <= val; i++)
        {
            if(num % i == 0)
            {
                if(num/i == i)
                    sum += i;
                else
                    sum = sum + i + num/i;
                
            }
        }
        return sum + 1 == num? true:false;
        
    }
}
