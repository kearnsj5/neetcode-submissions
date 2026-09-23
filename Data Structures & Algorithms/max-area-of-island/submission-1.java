
class Solution {

    public int maxAreaOfIsland(int[][] grid) 
    {
        int maxArea = 0;
        int currentArea = 0;
        boolean[][] marked = new boolean[grid.length][grid[0].length];
        
        for(int row = 0; row< grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                if(grid[row][col] == 1 && !marked[row][col])
                    {
                        
                        currentArea = DFS(grid, marked, row, col, maxArea);
                        if (currentArea > maxArea) 
                        {
                            maxArea = currentArea;   
                        }
                    }    
            }
        }

        return maxArea;
    }


    private int DFS(int[][] grid, boolean[][] marked, int row, int col, int maxArea )
    {
        int currentArea = 0;

        if(row < 0 || row >= grid.length || 
            col < 0 || col >= grid[0].length ||
            grid[row][col] == 0 ||
            marked[row][col])
         {
            return 0;
         }

         if(grid[row][col] == 1 && !marked[row][col])
            {
                marked[row][col] = true;
                return  1 +  DFS(grid, marked, row-1, col, maxArea)+ DFS(grid, marked, row+1, col, maxArea)
                + DFS(grid, marked, row, col-1, maxArea) + DFS(grid, marked, row, col+1, maxArea);
            }

            return -11234;



    }
}