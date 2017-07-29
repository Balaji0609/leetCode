package leetCode;

public class Find_the_Difference_389 
{
    public char findTheDifference(String s, String t) 
    {
        int charValueS = 0;
        int charValueT = 0;
        for(int i = 0; i < s.length(); i++)
            charValueS += (int)s.charAt(i);
        for(int i = 0; i < t.length(); i++)
            charValueT += (int)t.charAt(i);
        return (char)(charValueT-charValueS);
    }
}
