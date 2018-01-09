package leetCode;

public class Spiral_Matrix_II_59 
{
    public int[][] generateMatrix(int n) 
    {
        int[][] retArr = new int[n][n];
        
        if(n == 0)
            return retArr;
        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;
        
        int temp = 1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd)
        {
            for(int j = colBegin; j <= colEnd; j++)
            {
                retArr[rowBegin][j] = temp;
                temp++;
            }
            rowBegin++;
            
            for(int j = rowBegin; j <= rowEnd; j++)
            {
                retArr[j][colEnd] = temp;
                temp++;
            }
            colEnd--;
            if(rowBegin <= rowEnd)
            {
                for(int j = colEnd; j >= colBegin; j--)
                {
                    retArr[rowEnd][j] = temp;
                    temp++;
                }
                rowEnd--;
            }
            if(colBegin <= colEnd)
            {
                for(int j = rowEnd; j >= rowBegin; j--)
                {
                    retArr[j][colBegin] = temp;
                    temp++;
                }
                colBegin++;
            }
        }
        return retArr;
        
    }
}
