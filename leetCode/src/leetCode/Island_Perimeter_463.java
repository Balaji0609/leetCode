package leetCode;

public class Island_Perimeter_463 
{
    public int islandPerimeter(int[][] grid) 
    {
        int row = grid.length;
        int col = grid[0].length;
        int island = 0;
        int neighbours = 0;
        for(int i = 0 ; i < row; i++)
        {
            for(int j = 0 ; j < col; j++)
            {
                if(grid[i][j] == 1)
                {
                    island++;
                    if(i < row-1 && grid[i+1][j] == 1) // Down Neighbour
                        neighbours++;
                    if(j < col-1 && grid[i][j+1] == 1)// right neighbour
                        neighbours++;
                }
            }
        }
        return island*4 - neighbours*2;
    }
}
