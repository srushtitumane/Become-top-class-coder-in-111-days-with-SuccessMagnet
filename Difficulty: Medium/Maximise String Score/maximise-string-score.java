import java.util.*;

class Solution {
    public int maxScore(String s, char[][] jumps) {
        int n = s.length();
        if (n == 0) return 0;

        // collect distinct characters present in s
        boolean[] present = new boolean[256];
        for (int i = 0; i < n; i++) present[s.charAt(i)] = true;
        ArrayList<Integer> chars = new ArrayList<>();
        int[] charIdx = new int[256];
        Arrays.fill(charIdx, -1);
        for (int c = 0; c < 256; c++) {
            if (present[c]) {
                charIdx[c] = chars.size();
                chars.add(c);
            }
        }
        int m = chars.size();

        // allowed jumps on compressed indices; same-char jumps always allowed
        boolean[][] allowed = new boolean[m][m];
        for (int i = 0; i < m; i++) allowed[i][i] = true;
        for (char[] p : jumps) {
            int a = p[0], b = p[1];
            if (charIdx[a] != -1 && charIdx[b] != -1) {
                allowed[charIdx[a]][charIdx[b]] = true;
            }
        }

        // prefix sums of ASCII
        long[] pref = new long[n + 1];
        for (int i = 0; i < n; i++) pref[i + 1] = pref[i] + s.charAt(i);

        // frequency prefix for compressed characters: freq[t][i] = count of char t in s[0..i-1]
        int[][] freq = new int[m][n + 1];
        for (int i = 0; i < n; i++) {
            int ch = charIdx[s.charAt(i)];
            for (int t = 0; t < m; t++) freq[t][i + 1] = freq[t][i];
            freq[ch][i + 1]++;
        }

        final long NEG = Long.MIN_VALUE / 4;
        long[][] best = new long[m][m]; // best[source][target]
        for (int i = 0; i < m; i++) Arrays.fill(best[i], NEG);

        long[] dp = new long[n];
        Arrays.fill(dp, NEG);
        dp[0] = 0;

        // initialize best for source = s[0]
        int src0 = charIdx[s.charAt(0)];
        for (int t = 0; t < m; t++) {
            // freq[t][0] == 0 so dp[0]-pref[0]+ascii(t)*freq[t][0] == 0
            best[src0][t] = Math.max(best[src0][t], dp[0] - pref[0] + (long)chars.get(t) * freq[t][0]);
        }

        long ans = 0;
        if (dp[0] != NEG) ans = Math.max(ans, dp[0]);

        for (int j = 1; j < n; j++) {
            int cj = s.charAt(j);
            int cjIdx = charIdx[cj];

            // base term: prefix[j] - ascii(cj) * freq[cj][j]
            long base = pref[j] - (long)cj * freq[cjIdx][j];

            long mx = NEG;
            // consider all source characters that can jump to cj
            for (int src = 0; src < m; src++) {
                if (!allowed[src][cjIdx]) continue;
                long val = best[src][cjIdx];
                if (val != NEG && val > mx) mx = val;
            }

            if (mx != NEG) dp[j] = base + mx;
            else dp[j] = NEG;

            // if dp[j] reachable, update best for source = s[j] for all targets t
            if (dp[j] != NEG) {
                int src = cjIdx;
                for (int t = 0; t < m; t++) {
                    long candidate = dp[j] - pref[j] + (long)chars.get(t) * freq[t][j];
                    if (candidate > best[src][t]) best[src][t] = candidate;
                }
                ans = Math.max(ans, dp[j]);
            }
        }

        return (int) ans;
    }
}
