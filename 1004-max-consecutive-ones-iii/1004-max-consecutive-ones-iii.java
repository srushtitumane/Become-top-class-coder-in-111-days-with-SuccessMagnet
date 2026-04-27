class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,maxLen = 0,countOnes=0;
        while(j<nums.length)
        {
            if(nums[j]==1)
                countOnes++;
            // Shrinking
            while((j-i+1)-countOnes > k)
            {
                if(nums[i]==1)
                    countOnes--;
                i++;
            }

            // Updation
            maxLen = Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}