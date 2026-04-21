class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int i=0;
        long sum=0,max_sum=0;
        for(int j=0;j<nums.length;j++){
            while(set.contains(nums[j])){
                sum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            set.add(nums[j]);
            sum+=nums[j];
            if(j-i+1==k){
                max_sum=Math.max(max_sum,sum);
                sum-=nums[i];
                set.remove(nums[i]);
                i++;

            }
        }
        return max_sum;
        


        
    }
}