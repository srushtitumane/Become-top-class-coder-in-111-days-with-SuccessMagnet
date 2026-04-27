class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,countOnes=0,maxLen=0;
        while(j<nums.length){
            if(nums[j]==1)
                countOnes++;
            while((j-i+1)-countOnes>1){
                if(nums[i]==1)
                    countOnes--;
                i++;
                
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen-1;
    }
}