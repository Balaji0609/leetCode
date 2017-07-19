package leetCode;

public class Compression {
	
	public static void main(String args[])
	{
		String Comp = "aabcccccaaa";
		char[] Str = Comp.toCharArray();
		StringBuilder SB = new StringBuilder();
		int Len = Comp.length();
		int i = 1;
		int Count = 1;
		while( i < Len)
		{
			
			if(Str[i] == Str[i-1] )
			{
				
				Count += 1;
			}
			else
			{
				SB.append(Str[i-1]);
				SB.append(Count);
				Count = 1;
			}
			i++;
		}
		SB.append(Str[i-1]);
		SB.append(Count);
		String Temp = SB.toString();
		System.out.println(Temp);
		
	}

}
