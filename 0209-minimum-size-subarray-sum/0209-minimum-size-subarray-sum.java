class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum=0,minLen=Integer.MAX_VALUE;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>=target){
                minLen=Math.min(minLen,j-i+1);
                sum=sum-nums[i];
                i++;
            }
            j++;
        }
        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
        
    }
}