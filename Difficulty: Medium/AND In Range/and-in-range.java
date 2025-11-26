class Solution {
    public int andInRange(int l, int r) {
        // Code here
        int shift = 0;

        // Shift l and r right until they become equal
        while (l < r) {
            l >>= 1;
            r >>= 1;
            shift++;
        }

        // Shift back left
        return l << shift;
    }
}
