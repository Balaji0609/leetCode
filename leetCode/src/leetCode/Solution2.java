package leetCode;

public class Solution2 
{

	public static void shakespeareCount(String inputString)
	{
		int count = 0;
		if(inputString.length() == 0)
		{
			System.out.println(count);
			return;
		}
		String[] words = inputString.trim().split("\\s");
		for(int i = 0; i < words.length; i++)
		{
			if(words[i].toLowerCase().equals("shakespeare"))
				count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		Solution2.shakespeareCount("shakespeare Shakespeare shakespearE ....   ");
		// TODO Auto-generated method stub

	}

}
