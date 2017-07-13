package problems;

import java.util.PriorityQueue;

public class NextBiggestString
{
	public static String findNextBiggest(String in)
	{
		int len = in.length();
		int i = len - 1;
		char temp = 0;
		StringBuilder sb = new StringBuilder(in);
		StringBuilder sb1 = new StringBuilder();
		PriorityQueue<Character> minHeap = new PriorityQueue<Character>();
		for (; i > 0; i--)
		{
			char a = in.charAt(i);
			char b = in.charAt(i - 1);
			if (a <= b)
			{
				minHeap.add(a);
				continue;
			}
			minHeap.add(a);

			System.out.println("heap " + minHeap.toString());

			temp = minHeap.poll();
			while (temp <= b)
			{
				sb1.append(temp);
				temp = minHeap.poll();
			}
			System.out.println("sb1: " + sb1.toString());
			sb.setCharAt(i - 1, temp);
			sb1.append(b);

			while (!minHeap.isEmpty())
				sb1.append(minHeap.poll());
			break;
		}
		System.out.println("sb1: " + sb1.toString());
		sb.setLength(i);
		return sb.append(sb1).toString();
	}

	public static void main(String args[])
	{
		String s = findNextBiggest("abcdeedcba");
		System.out.println(s);
	}
}
