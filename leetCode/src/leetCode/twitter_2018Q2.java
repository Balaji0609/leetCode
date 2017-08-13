package leetCode;

import java.util.HashMap;
import java.util.Map;

public class twitter_2018Q2
{
    public int findComplement(String s, String t) 
    {
    	Map<String, Integer> map = new HashMap<String, Integer>();
        return findMaxMoves(t, s, map, t.length());
    }
		
	static int findMaxMoves(String s, String t, Map<String, Integer> map, int length) 
	{
		int start = Integer.MIN_VALUE;
		int end = Integer.MIN_VALUE;
		int firstIndex = t.indexOf(s);
		int endIndex = t.lastIndexOf(s);
		if(firstIndex == -1 && endIndex == -1) return 0;
		String str = t.substring(0, firstIndex) + t.substring(firstIndex + length, t.length());
		start = map.getOrDefault(str, findMaxMoves(s, str, map, length));
		map.put(str, start);
		if(firstIndex != endIndex) 
		{
			String laststr = t.substring(0, endIndex) + t.substring(endIndex + length, t.length());
			end = map.getOrDefault(laststr, findMaxMoves(s, laststr, map, length));
			map.put(laststr, end);
		}
		return Math.max(start, end) + 1 ;
	}
}
		