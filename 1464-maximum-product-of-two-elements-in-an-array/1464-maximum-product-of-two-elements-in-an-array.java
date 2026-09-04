class Solution {
    public int maxProduct(int[] nums) {
        // int i=0,j=i+1;
        // int res=Integer.MIN_VALUE;
        // for(int j=i+1;j<nums.length;j++)){
        //     res=nums[i]*nums[j];
        //     Math.max()
        // }
        Arrays.sort(nums);
        int res=(nums[nums.length-2]-1)*(nums[nums.length-1]-1);
        return res;
        
    }
}