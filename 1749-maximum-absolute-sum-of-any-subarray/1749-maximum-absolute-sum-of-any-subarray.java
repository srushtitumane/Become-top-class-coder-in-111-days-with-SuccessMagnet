class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxending=nums[0],minending=nums[0],maxSum=Math.abs(nums[0]);
        int i=1;
        while(i<nums.length){
            minending=Math.min(nums[i],minending+nums[i]);
            maxending=Math.max(nums[i],maxending+nums[i]);
            maxSum=Math.max(maxSum,Math.max(Math.abs(minending),Math.abs(maxending)));
            i++;

        }
        return maxSum;
        
    }
}