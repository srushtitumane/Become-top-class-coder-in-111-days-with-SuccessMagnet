class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum=0,minLength=Integer.MAX_VALUE;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>=target){
                minLength=Math.min(minLength,j-i+1);
                sum=sum-nums[i];
                i++;
            }
            j++; 
        }
        if(minLength==Integer.MAX_VALUE){
            return 0;
        }
        return minLength; 
    }
}