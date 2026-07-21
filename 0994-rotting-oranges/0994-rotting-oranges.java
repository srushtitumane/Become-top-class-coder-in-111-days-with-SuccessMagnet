class Pair
{
    int row;
    int col;
    int minute;
    Pair(int row, int col, int minute)
    {
        this.row = row;
        this.col = col;
        this.minute = minute;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};
        int fresh = 0;
        Queue<Pair> queue = new LinkedList<>();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j] == 2)
                {
                    queue.offer(new Pair(i,j,0));
                }
                else if(grid[i][j] == 1)
                    fresh++;
            }
        }
        int ans = 0;
        while(!queue.isEmpty())
        {
            Pair p = queue.poll();
            int row = p.row;
            int col = p.col;
            int min = p.minute;

            ans = Math.max(ans, min);

            for(int i=0; i<4; i++)
            {
                int newrow = x[i]+row;
                int newcol = y[i]+col;
                if(newrow < 0 || newrow >= n || newcol < 0 || newcol >= m || grid[newrow][newcol] == 2 || grid[newrow][newcol] == 0)
                    continue;

                grid[newrow][newcol] = 2;
                queue.offer(new Pair(newrow, newcol, min+1));
                fresh--;
            }
        }
        if(fresh > 0)
            return -1;
        return ans;
    }
}