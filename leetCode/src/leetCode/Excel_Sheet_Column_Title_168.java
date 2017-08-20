package leetCode;

public class Excel_Sheet_Column_Title_168 
{
    public String convertToTitle(int n) 
    {
        String res = "";
        while(n!= 0)
        {
            char ch = (char)('A' + ((n-1)%26));
            n = (n-1)/26;
            res = ch + res;
        }
        
        return res;
    }
}
