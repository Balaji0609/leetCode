package leetCode;

import java.util.StringTokenizer;

public class stringTokenizer {

	void normalTokenizer(String str)
	{
		StringTokenizer token = new StringTokenizer(str);
		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}
	}
	
	void splitTokenizer(String str)
	{
		String[] strarr = str.split("\\s");
		for(int i = 0 ; i < strarr.length;i++)
		{
			System.out.println(strarr[i]);
		}
	}
	public static void main(String[] args) {
		stringTokenizer obj = new stringTokenizer();
		String str = "hai how are you";
		obj.normalTokenizer(str);
		System.out.println("");
		obj.splitTokenizer(str);

	}

}
