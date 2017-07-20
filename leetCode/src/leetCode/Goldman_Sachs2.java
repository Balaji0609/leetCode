package leetCode;

import java.util.Arrays;

public class Goldman_Sachs2 {
	
	long NoOfWays(int n){
		long[] memoization = new long[n+1];
		Arrays.fill(memoization, -1);
		return NoOfWays2(n,memoization);
	}
	long NoOfWays2(int n, long[] memoizationarr){
		if(n < 0)
			return 0;
		else if(n == 0)
			return 1;
		else if(memoizationarr[n] > -1)
			return memoizationarr[n];
		else{
			memoizationarr[n] = NoOfWays2(n-1, memoizationarr) + NoOfWays2(n-2, memoizationarr) + NoOfWays2(n-3, memoizationarr);
			return memoizationarr[n];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
