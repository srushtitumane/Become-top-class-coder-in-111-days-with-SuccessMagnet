import java.util.*;

class Solution {
    static final int INF = (int)1e9;

    public int tsp(int[][] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        // dp[pos][mask] = min cost to finish tour starting at pos with visited mask
        int[][] dp = new int[n][1 << n];
        for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        int ans = solve(0, 1, cost, dp, n);
        // If unreachable (shouldn't happen for full matrix), you could return INF or 0 depending on spec.
        return ans >= INF ? INF : ans;
    }

    private int solve(int pos, int mask, int[][] cost, int[][] dp, int n) {
        // If all visited, return cost to go back to 0 (may be 0)
        if (mask == (1 << n) - 1) {
            return cost[pos][0];
        }

        if (dp[pos][mask] != -1) return dp[pos][mask];

        int ans = INF;

        for (int city = 0; city < n; city++) {
            if ((mask & (1 << city)) == 0) {
                int next = solve(city, mask | (1 << city), cost, dp, n);
                if (next < INF) {
                    ans = Math.min(ans, cost[pos][city] + next);
                }
            }
        }

        return dp[pos][mask] = ans;
    }
}
