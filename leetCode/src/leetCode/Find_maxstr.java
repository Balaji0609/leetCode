package leetCode;

import java.util.HashMap;

public class Find_maxstr {
	
	public static String Find_max(String str)
	{
		char arr[] = str.toCharArray();
		HashMap<Character, Integer> mp = new HashMap<Character,Integer>();
		StringBuilder string = new StringBuilder();
		for(char ch : arr)
		{
			if(mp.containsKey(ch))
			{
				mp.put(ch, mp.get(ch)+1);
			}
			else
				mp.put(ch, 1);
		}
		int i = 0;
		char c = 0;
		int v;
		while(i < str.length())
		{
			if(mp.get(str.charAt(i)) == 1)
			{
				string.append(str.charAt(i));
				i++;
			}
			else
			{
				v = i;
				c = str.charAt(i);
				//if(c == )
			}
		}
		return null;
	}
	
	
	
	public static void main(String args[])
	{
		@SuppressWarnings("unused")
		String str = "abbcdefg";
	}

}
