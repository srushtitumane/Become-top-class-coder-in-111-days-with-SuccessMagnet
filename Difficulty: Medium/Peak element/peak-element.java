class Solution {
    public int peakElement(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;   // move right
            } else {
                high = mid;     // move left or stay
            }
        }
        return low; // peak index
    }
}
