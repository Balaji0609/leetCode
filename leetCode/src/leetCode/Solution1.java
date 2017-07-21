package leetCode;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		int array[];
		int size = 0;
		int maxval = 0;
		
		//input
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		size = reader.nextInt();
		array = new int[size];
		for(int i = 0; i < size; i++)
		{
			array[i] = reader.nextInt();
		}
		maxval = reader.nextInt();
		
		//calculating maxlength
		int maxlength = 0;
		int prevmaxlength = 0;
		int maxglobal = 0;
		int sum = 0;
		
		for(int i = 0; i < size-1; i++)
		{
			prevmaxlength = maxlength;
			maxlength = 0;
			if(array[i] < maxval)
			{
				sum = 0;
				sum+= array[i];
				for(int j = i+1; j < size-1; j++){
					sum += array[j];
					maxlength += 1;
					if(sum == maxval)
					{
						break;
					}
					else if(sum > maxval)
					{
						maxlength -=1;
						break;
					}
					
				}
			}else
			{
				maxlength += 1;
			}
			System.out.println(maxlength);
			System.out.println(prevmaxlength);
			maxglobal = Math.max(maxlength, prevmaxlength);
		}
		System.out.println(maxglobal);
		
		// TODO Auto-generated method stub

	}

}
