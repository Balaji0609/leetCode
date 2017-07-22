package leetCode;

public class stringReverse 
{

	String reverseFunc(String str)
	{
		StringBuilder strb = new StringBuilder(str);
		int end = (str.length() - 1);
		int start = 0;
		while(start < end)
		{
			char c = strb.charAt(start);
			strb.setCharAt(start, strb.charAt(end));
			strb.setCharAt(end, c);
			start++;
			end--;
		}
		return strb.toString();
	}
	public static void main(String[] args) 
	{
		stringReverse obj = new stringReverse();
		String str = "hai how are you";
		System.out.println(obj.reverseFunc(str));
	}

}
