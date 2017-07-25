package leetCode;
import java.util.*;

public class Fizz_Buzz_412 
{
    @SuppressWarnings("serial")
	public List<String> fizzBuzz(int n) 
    {
        if(n == 0)
            return new ArrayList<String>(){};
        int i = 1;
        List<String> str = new ArrayList<String>();
        while(i <= n)
        {
            if(i % 3 == 0 && i % 5 == 0 )
                str.add("FizzBuzz");
            else if(i % 3 == 0)
                str.add("Fizz");
            else if(i % 5 == 0)
                str.add("Buzz");
            else
                str.add(Integer.toString(i));
            i += 1;
        }
        return str;
    }
}
