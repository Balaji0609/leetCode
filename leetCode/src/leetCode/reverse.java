package leetCode;

public class reverse {
	
	void printReverseSpiral(int arr[][])
	{
		
		int count = 0;
		
		int rowSize = arr.length;
		int columnSize = arr[0].length;
		
		if(rowSize == 1)
		{
			for(int i = (columnSize-1) ; i >= 0 ; i--)
			{
				System.out.print(arr[0][i] + " ");
			}
			return;
		}
		
		int size = rowSize*columnSize;
		
		int r = 0, c = 0;
		if(rowSize % 2 == 0)
		{
			r = (rowSize/2) - 1;
			c = columnSize/2;
		}else
		{
			r = rowSize/2;
			c = columnSize/2;
		}
		
		int left = -1;
		int down = 1;
		int right = 2;
		int up = -2;
		
		System.out.print(arr[r][c] + " ");
		count++;
		while(true)
		{
			for(int x = 0; x > left && count < size ; x--)
			{				
				c = c - 1;
				System.out.print(arr[r][c] + " ");
				count++;
			}
			for(int w = 0; w < down && count < size  ; w++)
			{
				r = r + 1;
				System.out.print(arr[r][c]+ " ");
				count++;
			}
			for(int y = 0; y < right && count < size  ; y++)
			{
				c = c + 1;
				System.out.print(arr[r][c]+ " ");
				count++;
			}
			for(int z = 0; z > up && count < size  ; z--)
			{
				r = r - 1;
				System.out.print(arr[r][c]+ " ");
				count++;
			}
			left = left - 2;
			down = down + 2;
			right = right + 2;
			up = up - 2;
		}
		
	}
	
	void printarray2D(int a[][]){
		for(int i = 0; i < a.length ; i++){
			for(int j = 0 ; j < a[0].length; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int a[][] = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		reverse rv = new reverse();
		rv.printarray2D(a);
		rv.printReverseSpiral(a);
		// TODO Auto-generated method stub

	}

}
