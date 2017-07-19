package leetCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Depth_First_Search {
	public static boolean isPalindrome(String s)
	{
		for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--)
		{
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}

	public static void PalIndex(String s)
	{
		int i = 0, j = s.length() - 1;
		for (; i < s.length() / 2;)
		{
			if (s.charAt(i) == s.charAt(j))
			{
				i++;
				j--;
				continue;
			}
			if (isPalindrome(s.substring(i + 1, j + 1)))
			{
				System.out.println(i);
				break;
			}
			System.out.println(j);
			break;
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println(new Date());
		Scanner sc = new Scanner(new File("pal1.txt"));
		int count = sc.nextInt();
		List<String> strList = new ArrayList<String>();
		for (int i = 0; i < count; i++)
			strList.add(sc.next());
		sc.close();
		for (String s : strList)
		{
			if (isPalindrome(s))
			{
				System.out.println("-1");
				continue;
			}
			PalIndex(s);
		}
		System.out.println(new Date());
		// TODO Auto-generated method stub

	}

}
