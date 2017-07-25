package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Keyboard_Row_500 
{
    public String[] findWords(String[] words) 
    {
        if(words.length == 0)
            return new String[]{};
        List<String> retArr = new ArrayList<String>();
        for(int i = 0 ; i < words.length; i++)
        {
            String temp = words[i].toLowerCase();
            if(temp.matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
                retArr.add(words[i]);
        }
        return retArr.toArray(new String[retArr.size()]);
    }
}
