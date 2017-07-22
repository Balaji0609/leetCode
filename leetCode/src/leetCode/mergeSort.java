package leetCode;

import java.util.Arrays;

public class mergeSort {
	
	
	static void divide(int arr[],int start, int end)
	{
		if(start < end)
		{
			int mid = ((start + end) / 2);
			
			divide(arr,start,mid);
			divide(arr,mid+1,end);
			
			sort(arr,start,mid,end);
			
		}
	}
	static void sort(int arr[],int start, int mid , int end)
	{
		int L[];
		int R[];
		int n1 = mid - start + 1;
		int n2 = end - mid;
		L = new int[n1];
		R = new int[n2];
		
		for(int i = 0; i < n1;i++)
			L[i] = arr[start + i];
		for(int j = 0; j < n2;j++)
			R[j] = arr[mid + j+ 1];
		
		int x = 0;
		int y = 0;
		int z = start;
		while(x < n1 && y < n2){
			if(L[x]<=R[y])
				arr[z++] = L[x++];
			else
				arr[z++] = R[y++];
			}
		while(x < n1)
			arr[z++] = L[x++];
		while(y < n2)
			arr[z++] = R[y++];
	}


	public static void main(String[] args) {
		
		int arr[] = {1,5,4,2,3,1,5};
		mergeSort.divide(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		// TODO Auto-generated method stub

	}

}
