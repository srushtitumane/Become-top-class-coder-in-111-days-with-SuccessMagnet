class Solution {
    public int maximumAmount(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][n];

        // When only one coin, you take it
        for (int i = 0; i < n; i++) {
            dp[i][i] = arr[i];
        }

        // Fill DP table for increasing lengths
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                // If you pick ith coin
                int pickLeft = arr[i] + Math.min(
                        (i + 2 <= j ? dp[i + 2][j] : 0),
                        (i + 1 <= j - 1 ? dp[i + 1][j - 1] : 0)
                );

                // If you pick jth coin
                int pickRight = arr[j] + Math.min(
                        (i + 1 <= j - 1 ? dp[i + 1][j - 1] : 0),
                        (i <= j - 2 ? dp[i][j - 2] : 0)
                );

                dp[i][j] = Math.max(pickLeft, pickRight);
            }
        }

        return dp[0][n - 1];
    }
}

