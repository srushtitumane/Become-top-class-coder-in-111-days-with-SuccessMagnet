class Solution {
    public int findPeakElement(int[] nums) {

        int high = nums.length - 1, low = 0, res = -1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            }
            else {
                res = mid;
                high = mid;
            }
        }

        return res == -1 ? low : res;
    }
}