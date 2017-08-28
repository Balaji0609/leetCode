package leetCode;
import java.util.*;
public class Roman_to_Integer_13 
{
    public int romanToInt(String s) 
    {
        int sum = 0;
        
        if(s.indexOf("IV") != -1)
            sum -= 2;
        if(s.indexOf("IX") != -1)
            sum -= 2;
        if(s.indexOf("XL") != -1)
            sum -= 20;
        if(s.indexOf("XC") != -1)
            sum -= 20;
        if(s.indexOf("CD") != -1)
            sum -= 200;
        if(s.indexOf("CM") != -1)
            sum -= 200;
        char[] ch = s.toCharArray();
        
        Map<Character, Integer> hmap = new HashMap<Character, Integer>();
        
        hmap.put('M',1000);
        hmap.put('D',500);
        hmap.put('C',100);
        hmap.put('L',50);
        hmap.put('X',10);
        hmap.put('V',5);
        hmap.put('I',1);

        for(int i = 0 ; i < ch.length ; i++)
        {
            sum += hmap.get(ch[i]);
        }
        return sum;
    }
}
