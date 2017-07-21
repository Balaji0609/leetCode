package leetCode;

public class normalReverse {

	void printReverseSpiral(int a[][])
	{
		int rowSize = a.length;
		int columnSize = a[0].length;
		int rowStart = 0;
		int rowEnd = rowSize-1;
		int columnStart = 0;
		int columnEnd = columnSize-1;
		while(rowStart < rowEnd && columnStart < columnEnd)
		{
			for(int c = columnStart; c <= columnEnd ; c++){
				System.out.print(a[rowStart][c] + " ");
			}
			rowStart++;
			for(int r = rowStart; r <= rowEnd ; r++){
				System.out.print(a[r][columnEnd] + " ");
			}
			columnEnd--;
			for(int c = columnEnd; c >= columnStart ; c--){
				System.out.print(a[rowEnd][c] + " ");
			}
			rowEnd--;
			for(int r = rowEnd; r >= rowStart ; r--){
				System.out.print(a[r][columnStart] + " ");
			}
			columnStart++;
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
		normalReverse rv = new normalReverse();
		rv.printarray2D(a);
		System.out.println("");
		rv.printReverseSpiral(a);
		// TODO Auto-generated method stub

	}

}
