package leetCode;

public class Valid_Palindrome_125 
{
    public boolean isPalindrome(String s) 
    {
        s = s.replaceAll("\\s","");
        s = s.replaceAll("[^A-Za-z0-9]","");
        s = s.toLowerCase();
        if(s.length() == 0 || s.length() == 1)
            return true;
        int start = 0;
        int end = s.length()-1;
        while(start < end)
        {
            
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
