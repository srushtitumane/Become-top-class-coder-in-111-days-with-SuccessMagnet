class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0,j=0,maxSum=0,sum=0;
        Set<Integer> set=new HashSet<>();
        while(j<nums.length){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum=sum-nums[i];
                i++;
            }
            set.add(nums[j]);
            sum=sum+nums[j];
            
            maxSum=Math.max(maxSum,sum);
            j++;
        }
        return maxSum;
        
    }
}