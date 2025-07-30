// User function Template for Java
class Solution {
    public static int nFactorial(int n) {
        int ans = 1;  // Initialize ans to 1

        for (int i = 1; i <= n; i++) {
            ans = ans * i;  // Multiply ans by i in each step
        }
        return ans;
    }
}