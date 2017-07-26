package leetCode;

public class Reverse_String_344 
{
    public String reverseString(String s) {
        int len = s.length();
        char temp;
        StringBuilder str = new StringBuilder(s);
        for(int i = 0,j = (len-1); i < (int)len/2; i++, j--)
        {
            temp = str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
        }
        
        return str.toString();
    }
}
