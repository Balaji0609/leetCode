package leetCode;

public class Reverse_String_II_541 
{
    public String reverseStr(String s, int k) 
    {   
        if(s.length() < k)
            return new StringBuilder(s).reverse().toString();
        
        StringBuilder stb = new StringBuilder();
        
        int startIndex = 0;
        int endIndex = k;
        int flag = 0;
        
        while(startIndex < s.length())
        {
            if (flag == 0)
                stb.append(new StringBuilder(s.substring(startIndex,endIndex)).reverse());
            else
                stb.append(s.substring(startIndex,endIndex));
            
            startIndex += k;
            
            if(startIndex+k > s.length())
                endIndex = s.length();
            else
                endIndex = startIndex+k;
            
            if(flag == 0)
                flag = 1;
            else
                flag = 0;
        }
        return stb.toString();
    }
}
