package leetCode;

import java.util.*;

public class Longest_Palindrome_409 
{
    public int longestPalindrome(String s) 
    {
        if(s.length() == 0)
            return 0;
        Set<Character> st = new HashSet<Character>();
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char temp = s.charAt(i);
            if(st.contains(temp))
            {
                count++;
                st.remove(temp);
            }
            else
                st.add(temp);
        }
        
        if(!st.isEmpty())
            return count*2+1;
        
        return count * 2;
        
        
    }

}
