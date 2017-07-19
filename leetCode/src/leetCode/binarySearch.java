package leetCode;

public class binarySearch {
	
	int binarySearchAlgo(int[] arr, int x){
		int length = arr.length;
		int start = 0;
		int end = length-1;
		while(start <= end){
			int mid = (start + end) /2 ;
			if(arr[mid] == x)
				return mid;
			else if(x > arr[mid]){
				start = mid+1;
			}
			else{
				end = mid-1;
			}
			
			
		}
		return -1;
		
	}
	
	int binaryRecursiveSearch(int start,int end,int arr[], int x)
	{
		if(start <= end)
		{
			int mid = (start + end)/2;
			
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				return binaryRecursiveSearch(start, (mid -1), arr, x);
			else 
				return binaryRecursiveSearch(mid+1, end, arr, x);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,6};
		binarySearch obj = new binarySearch();
		int val = obj.binarySearchAlgo(arr, 1);
		int val1 = obj.binaryRecursiveSearch(0, (arr.length-1), arr, 1);
		if(val == -1){
			System.out.println("Value not found");
		}
		else{
			System.out.println("Value found at "+ (val+1) );
		}
		if(val1 == -1){
			System.out.println("Value not found");
		}
		else{
			System.out.println("Value found at "+ (val+1) );
		}
		// TODO Auto-generated method stub

	}

}
