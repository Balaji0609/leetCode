package leetCode;

public class Length_of_Last_Word_58 
{
    public int lengthOfLastWord(String s) 
    {
        String[] str = s.split("\\s");
        int val = str.length;
        if(val > 0)
            return str[val-1].length();
        else 
            return 0;
    }

}
