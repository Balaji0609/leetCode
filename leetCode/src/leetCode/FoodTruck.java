package leetCode;

import java.util.*;
import java.io.*;
public class FoodTruck 
{
	public static class Stand
	{
		private int taste;
		private int timeMin;
		private double price;
		private int weekNum;
		private int standNum;
		public Stand(){}
		public Stand(int taste, int timeMin, double price, int weekNum, int standNum)
		{
			this.taste = taste;
			this.timeMin = timeMin;
			this.price = price;
			this.weekNum = weekNum;
			this.standNum = standNum;
		}
		public int gettaste()
		{
			return this.taste;
		}
		public int gettimeMin()
		{
			return this.timeMin;
		}
		public double getprice()
		{
			return this.price;
		}
		public int getweekNum()
		{
			return this.weekNum;
		}
		public int getstandNum()
		{
			return this.standNum;
		}
	}
	
	public static int[] questTwo(Map<Integer,List<Stand>> ls)
	{
		// contains standNum, startWeek, endWeek, Increase
		int []retArr = new int[4];
		//storing values
		Stand []temp = new Stand[2];
		// track cur and previous
		Stand curStand = new Stand();
		Stand prevStand = new Stand();
		// max increase
		int maxVal = Integer.MIN_VALUE;
		
		List<Stand> standWeekly = new ArrayList<Stand>();
		
		try
		{			
			for(Map.Entry<Integer,List<Stand>> it : ls.entrySet())
			{
				// for the list of stands in weekvise order.
				standWeekly = it.getValue();
				// for first stand alone
				prevStand = standWeekly.get(0);
				System.out.println(prevStand.getstandNum());
				
				for(int i = 1 ; i < standWeekly.size(); i++)
				{
					curStand = standWeekly.get(i);
					if(prevStand.gettimeMin() < curStand.gettimeMin() && maxVal < (curStand.gettimeMin() - prevStand.gettimeMin()) )
					{
						maxVal = curStand.gettimeMin() - prevStand.gettimeMin();
						temp[0] = prevStand;
						temp[1] = curStand;
					}
					prevStand = curStand;
				}
			}
			System.out.println(Arrays.toString(temp));
			retArr[0] = temp[0].getstandNum();
			retArr[1] = temp[0].getweekNum();
			retArr[2] = temp[1].getweekNum();
			retArr[3] = maxVal;				
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return retArr;
	}
	public static void main(String[] args) 
	{
		
		// solution to first problem.
		double sumRet = 0;
		//each stand can be put in 53 weeks.
		List<Stand> forStand;
		// Map for each stand.
		Map<Integer,List<Stand>> ls = new HashMap<Integer,List<Stand>>();
		// reading files
		String fileName = "OffTheGridData.csv";
		BufferedReader br = null;
		String[] tmp = new String[5];
		
		try
		{
			br = new BufferedReader(new FileReader(fileName));
			String lines = "";
			while((lines = br.readLine()) != null)
			{
				forStand = new ArrayList<Stand>();
				tmp = lines.split("\\s*,\\s*");
				System.out.println(Arrays.toString(tmp));
				sumRet += Double.parseDouble(tmp[2]);
				if(ls.containsKey(tmp[0]))
				{
					forStand = ls.get(Integer.parseInt(tmp[0]));
					forStand.add(new Stand(Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1]),Double.parseDouble(tmp[2]),Integer.parseInt(tmp[3]),Integer.parseInt(tmp[4])));
					
				}
				else
				{
					forStand.add(new Stand(Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1]),Double.parseDouble(tmp[2]),Integer.parseInt(tmp[3]),Integer.parseInt(tmp[4])));
				}
				ls.put(Integer.parseInt(tmp[0]),forStand);
			}
			System.out.println("Question 1 : ");
			System.out.println("The value of amount is : " + sumRet);
			System.out.println("Question 2 : ");
			System.out.println(Arrays.toString(questTwo(ls)));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		// TODO Auto-generated method stub

	}

}
