package leetCode;

import java.util.HashMap;

public class FNC {
public static char F_Function( String str)
{
	char arr[] = str.toCharArray();
	HashMap<Character,Integer> set = new HashMap<Character,Integer>();
	for(char ch: arr)
	{
		if(set.containsKey(ch))
		{
			set.put(ch, set.get(ch)+1);
		}
		else
		{
			set.put(ch, 1);
		}
	}
	
	for(char ch: arr)
	{
		int v = set.get(ch);
		if(v == 1)
			return ch;
	}
	
	return 0;
}

public static void main(String args[])
{
	String str = "ghgjkkjh";
	char c = F_Function(str);
	if(c == 0)
		System.out.println("no unique");
	else
		System.out.println(c);
}
}
