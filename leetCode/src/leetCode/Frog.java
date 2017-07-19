package leetCode;

import java.util.*;
public class Frog {
	public static int solution(int A[], int X, int D) 
    {
        if(D >= X) return 0;
        
        int finalAns=-1, localAns=A.length, localStart=0, finalPos=0, i=0;
        int[] times = new int[X];
        Arrays.fill(times, -1);
        
        for(; i<A.length; i++)
        {
        	if(times[A[i]] >= 0) continue;
            times[A[i]] = i;
        }
        for(int j=0;j<times.length;j++)
        {
        	System.out.print(" "+times[j]+" ");
        }
        
        for(i=0; i<times.length; i++)
        {
            if((localStart + D + 1) == i)
            {
                localStart = i-1;
                if(finalAns < localAns)
                    finalAns = localAns;
                localAns = A.length;
            }
            
            if(times[i] < 0) continue;
            
            if(finalPos == 0 && i > D)
            	return -1;
            
            if(i>finalPos && i-finalPos<=D)
            {
                finalPos = i;
                System.out.println(" finalpos "+finalPos+" ");
                //if(finalPos+D >= X) break;
            }
            
            if(localAns > times[i]) 
                localAns = times[i];
            System.out.print(" localans : "+localAns);
            
        }
        
        if(localAns<A.length && finalAns < localAns)
            finalAns = localAns;
        
        if(finalPos+D >= X) 
            return finalAns;
        
        return -1;
    }
	public static void main(String[] args )
	{
		int[] arr = {2,2,2,2,2,2,2,4};
		int X1 =6;
		int D1= 2;
		int sol = solution(arr,X1,D1);
		System.out.println("the ouput is"+" : "+ sol);		
	}
}
