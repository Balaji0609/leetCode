package leetCode;

public class Slice {

	public static int maxSlice(int[] arr)
	{
		int ret = 0;
		int maxVal = 0;
		int currmaxVal = 0;
		for(int i = 1; i < arr.length;i++)
		{
			if(currmaxVal > maxVal)
			{
				maxVal = currmaxVal;
				ret = i-1;
			}
			if(arr[i-1] < arr[i])
				currmaxVal += 1;
			else
				currmaxVal = 0;
			
		}
		return ret-maxVal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
