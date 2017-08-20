package leetCode;

public class First_Bad_Version_278 
{
    public int firstBadVersion(int n) 
    {
        int start = 1;
        int end = n;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(isBadVersion(mid))
            {
                if(isBadVersion(mid-1))
                {
                    end = mid - 1;
                }
                else
                    return mid;
            }
            else
            {
                start = mid+1;
            }
        }
        return 0;
        
    }

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
