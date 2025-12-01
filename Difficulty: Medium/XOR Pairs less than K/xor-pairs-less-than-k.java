class Solution {

    static class T {
        T[] next = new T[2];
        int cnt = 0;
    }

    T root = new T();

    void add(int x) {
        T t = root;
        for (int i = 31; i >= 0; i--) {
            int b = (x >> i) & 1;
            if (t.next[b] == null) t.next[b] = new T();
            t = t.next[b];
            t.cnt++;
        }
    }

    int count(int x, int k) {
        T t = root;
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            if (t == null) break;

            int xb = (x >> i) & 1;
            int kb = (k >> i) & 1;

            if (kb == 1) {
                if (t.next[xb] != null)
                    res += t.next[xb].cnt;
                t = t.next[1 - xb];
            } else {
                t = t.next[xb];
            }
        }
        return res;
    }

    public int cntPairs(int[] arr, int k) {
        int ans = 0;
        for (int x : arr) {
            ans += count(x, k);
            add(x);
        }
        return ans;
    }
}
