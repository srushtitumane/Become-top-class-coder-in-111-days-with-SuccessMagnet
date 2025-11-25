class Solution {
    public int subarrayXor(int[] arr) {
        int n = arr.length;

        // If size is even → final XOR = 0
        if (n % 2 == 0) 
            return 0;

        // If size is odd → XOR all elements at even indices
        int ans = 0;
        for (int i = 0; i < n; i += 2) {
            ans ^= arr[i];
        }

        return ans;
    }
}
