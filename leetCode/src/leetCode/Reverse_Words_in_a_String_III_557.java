package leetCode;

public class Reverse_Words_in_a_String_III_557 
{
    public String reverseWords(String s) 
    {
        StringBuilder stb = new StringBuilder();
        String[] strArr = s.split(" ");
        for(int i = 0; i < strArr.length-1;i++)
        {
            stb.append(new StringBuilder(strArr[i]).reverse()).append(" ");
        }
        stb.append(new StringBuilder(strArr[strArr.length-1]).reverse());
        return stb.toString();
    }
}
