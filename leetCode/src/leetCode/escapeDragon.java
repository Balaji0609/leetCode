package leetCode;

import java.util.*;

public class escapeDragon 
{
		public static void findHopsHelper(List<Integer> array) 
		{
	        List<String> hops = new ArrayList<String>();
	        StringBuffer stb = new StringBuffer();
	        int lReach = 0, curReach = 0, selIndex = 0;
	        int i = 0;
	        ArrayList<Integer> array1 = new ArrayList<Integer>();
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	        while (scan.hasNextInt()) 
	        {
	            Integer inte = scan.nextInt();
	            if (inte >= 0)
	                array1.add(inte);
	            else
	                throw new RuntimeException("Invalid Data in the input");
	        }

	        for (; i < array1.size(); i++) 
	        {
	            if (i > curReach) 
	                break;
	            if (i > lReach)
	            {
	                lReach = curReach;
	                stb.append(Integer.toString(selIndex)).append(", ");
	                hops.add(String.valueOf(selIndex));
	            }

	            int sum = i + array1.get(i);

	            if (sum > curReach) 
	                selIndex = i;

	            curReach = Math.max(curReach, sum);
	        }
	        if ((i > lReach) && (hops.size() > 0) && (Integer.parseInt(hops.get(hops.size() - 1)) != selIndex)) 
	        {
	            stb.append(Integer.toString(selIndex)).append(", ");
	            hops.add(String.valueOf(selIndex));
	        }
	        if (lReach >= array1.size() - 1)
	        {
	            stb.setLength(stb.length()-2);
	            stb.append(", out");
	            System.out.println(stb.toString());
	        }
	        else
	            System.out.println("failure");
	    }
		public static void main(String[] args) 
		{
			Integer[] arr = {0, 0, 0, 0};
			List<Integer> ls = new ArrayList<Integer>(Arrays.asList(arr));
			escapeDragon.findHopsHelper(ls);
			
		}

}
