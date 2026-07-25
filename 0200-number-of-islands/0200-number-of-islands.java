class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j] == '1')
                {
                    DFS(grid, n, m, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    void DFS(char[][] grid, int n, int m, int row, int col)
    {
        if(row < 0 || row >= n || col < 0 || col >= m || grid[row][col] == '0')
            return;

        grid[row][col] = '0';

        DFS(grid, n, m, row+1, col);
        DFS(grid, n, m, row, col+1);
        DFS(grid, n, m, row-1, col);
        DFS(grid, n, m, row, col-1);
        
    }
}