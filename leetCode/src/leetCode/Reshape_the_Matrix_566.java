package leetCode;

public class Reshape_the_Matrix_566 
{
    public int[][] matrixReshape(int[][] nums, int r, int c) 
    {
        int noRow = nums.length;
        int noCol = nums[0].length;
        
        if(r * c != noRow*noCol)
            return nums;
        
        int[][] retArr = new int[r][c];
        int count = 0;
        for(int i = 0 ; i < noRow; i++)
        {
            for(int j = 0 ; j < noCol; j++)
            {
                retArr[count/c][count%c] = nums[i][j];
                count++;
            }
        }
        return retArr;
    }
}
