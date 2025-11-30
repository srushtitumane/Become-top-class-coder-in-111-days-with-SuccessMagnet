class Solution {
    public static int countSubs(String s) {
        int n = s.length();
        if (n == 0) return 0;

        final int MOD1 = 1_000_000_007;
        final int MOD2 = 1_000_000_009;
        final int BASE = 9113823; // small enough to keep multiplications in long range

        int[] pow1 = new int[n + 1];
        int[] pow2 = new int[n + 1];
        int[] pref1 = new int[n + 1];
        int[] pref2 = new int[n + 1];

        pow1[0] = 1;
        pow2[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow1[i] = (int)((pow1[i - 1] * 1L * BASE) % MOD1);
            pow2[i] = (int)((pow2[i - 1] * 1L * BASE) % MOD2);
        }

        // prefix hashes: pref[k] is hash of s[0..k-1]
        for (int i = 0; i < n; i++) {
            pref1[i + 1] = (int)((pref1[i] * 1L * BASE + s.charAt(i)) % MOD1);
            pref2[i + 1] = (int)((pref2[i] * 1L * BASE + s.charAt(i)) % MOD2);
        }

        java.util.HashSet<Long> set = new java.util.HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int len = j - i + 1;

                long hash1 = pref1[j + 1] - (pref1[i] * 1L * pow1[len]) % MOD1;
                if (hash1 < 0) hash1 += MOD1;

                long hash2 = pref2[j + 1] - (pref2[i] * 1L * pow2[len]) % MOD2;
                if (hash2 < 0) hash2 += MOD2;

                // pack two 32-bit values into a single long key
                long key = (hash1 << 32) | hash2;
                set.add(key);
            }
        }

        return set.size();
    }
}

