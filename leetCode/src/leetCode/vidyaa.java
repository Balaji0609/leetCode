package leetCode;

public class vidyaa {
static int value(int N)
{
		int count = 0;
		int prime = 5; 
		while(N/prime >= 1)
		{
			count += N/prime ;
			prime *= 5;
		}
		return count;
}
}
