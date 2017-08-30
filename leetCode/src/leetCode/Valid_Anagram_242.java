package leetCode;
import java.util.*;

public class Valid_Anagram_242 
{
	    public boolean isAnagram(String s, String t) 
	    {
	        int[] str1 = new int[26];
	        int[] str2 = new int[26];
	        int str1L = s.length();
	        int str2L = t.length();
	        
	        if(str1L != str2L)
	            return false;
	        
	        while(str1L > 0)
	        {

	            str1[s.charAt(str1L-1)-'a']++;
	            str2[t.charAt(str1L-1)-'a']++;
	            str1L--;
	        }
	        
	        return Arrays.equals(str1, str2) ? true : false;
	    }
}
