class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0;
        int sum = 0;
        while (j < k) {
            sum += nums[j];
            j++;
        }
        int maxSum = sum;
        while (j < nums.length) {
            sum = sum + nums[j] - nums[i];
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }

        return (double) maxSum / k;
    }
}