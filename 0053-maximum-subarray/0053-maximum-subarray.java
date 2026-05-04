class Solution {
    public int maxSubArray(int[] nums) {
        int i;
        int max=nums[0],sum=nums[0];
        for(i=1;i<nums.length;i++){
            int v1=sum+nums[i];
            int v2=nums[i];
            sum=Math.max(v1,v2);
            max=Math.max(max,sum);
        }
        return max;
        
        
    }
}