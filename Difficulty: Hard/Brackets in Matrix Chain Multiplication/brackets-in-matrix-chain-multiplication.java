class Solution {
    public String matrixChainOrder(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        int[][] split = new int[n][n];

        // L is the chain length
        for (int L = 2; L < n; L++) {
            for (int i = 1; i < n - L + 1; i++) {
                int j = i + L - 1;
                dp[i][j] = Integer.MAX_VALUE;
                
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                        split[i][j] = k;
                    }
                }
            }
        }

        return build(1, n - 1, split);
    }

    private String build(int i, int j, int[][] split) {
        if (i == j) {
            return String.valueOf((char) ('A' + i - 1));
        }
        return "(" + build(i, split[i][j], split) + build(split[i][j] + 1, j, split) + ")";
    }
}
