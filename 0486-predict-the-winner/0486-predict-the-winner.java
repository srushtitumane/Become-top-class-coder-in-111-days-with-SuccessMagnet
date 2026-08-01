class Solution {

    public boolean predictTheWinner(int[] nums) {
        return fun(nums, 0, nums.length - 1) >= 0;
    }

    int fun(int[] nums, int i, int j) {

        if (i == j)
            return nums[i];

        int left = nums[i] - fun(nums, i + 1, j);
        int right = nums[j] - fun(nums, i, j - 1);

        return Math.max(left, right);
    }
}