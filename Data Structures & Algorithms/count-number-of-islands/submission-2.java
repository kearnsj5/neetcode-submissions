
class Solution {

    int numIslands;
    public int numIslands(char[][] grid) 
    {
        numIslands = 0;

        boolean[][] marked = new boolean[grid.length][grid[0].length];// the key is the grid[0].length for the columns.

        for(int r = 0; r < grid.length; r++)
        {
            for(int c = 0; c < grid[0].length; c++)
            {
                if(grid[r][c] == '1' && !marked[r][c])
                    {
                        numIslands++;
                        DFS(grid, r, c, marked);
                    }
            }
        }

        return numIslands;

    }


    private void DFS(char[][] grid, int row, int col, boolean[][]marked)
    {
        if(row < 0 || row >= grid.length || 
            col < 0 || col >= grid[0].length ||
            grid[row][col] == '0' ||
            marked[row][col])
         {
             return;
         }
        if(grid[row][col] =='1' && !marked[row][col])
        {
            marked[row][col] = true;
            
            DFS(grid, row-1, col, marked); //up
            DFS(grid, row+1, col, marked);
            DFS(grid, row, col-1, marked);
            DFS(grid, row, col+1, marked);
        }
    }
}