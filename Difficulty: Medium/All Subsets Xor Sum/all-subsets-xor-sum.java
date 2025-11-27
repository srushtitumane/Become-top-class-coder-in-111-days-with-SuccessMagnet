class Solution {
    int subsetXORSum(int arr[]) {
        int OR = 0;
        int n = arr.length;
        
        // Compute OR of all elements
        for(int x : arr) {
            OR |= x;
        }
        
        // Multiply OR by 2^(n-1)
        return OR * (1 << (n - 1));
    }
}
