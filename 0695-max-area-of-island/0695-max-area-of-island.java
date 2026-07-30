class Solution {
    int maxIsland = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j] == 1)
                {
                    maxIsland = Math.max(maxIsland, DFS(grid, i, j, n, m));
                }
            }
        }
        return maxIsland;
    }

    int DFS(int[][] grid, int row, int col, int n, int m)
    {
        if(row < 0 || row >= n || col < 0 || col >= m || grid[row][col] == 0)
            return 0;

        grid[row][col] = 0;

        return 1+DFS(grid, row+1, col, n , m)
        +DFS(grid, row-1, col, n, m)
        +DFS(grid, row, col+1, n, m)
        +DFS(grid, row, col-1, n, m);
    }
}