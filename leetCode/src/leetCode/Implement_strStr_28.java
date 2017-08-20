package leetCode;

public class Implement_strStr_28 
{
    public int strStr(String haystack, String needle) 
    {
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        for(int i = 0 ;; i++)
        {
            for(int j = 0 ;;j++)
            {
                if(j == needleLen)
                    return i;
                if(i+j == haystackLen)
                    return -1;
                if(needle.charAt(j) != haystack.charAt(i+j))
                    break;
            }
        }
    }
}
