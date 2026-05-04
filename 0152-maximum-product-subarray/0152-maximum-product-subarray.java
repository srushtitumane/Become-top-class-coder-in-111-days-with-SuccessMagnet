class Solution {
    public int maxProduct(int[] nums) {
        int maxending=nums[0],minending=nums[0],maxProduct=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]*minending;
            int v3=nums[i]*maxending;
            minending=Math.min(v1,Math.min(v2,v3));
            maxending=Math.max(v1,Math.max(v2,v3));
            maxProduct=Math.max(maxProduct,Math.max(minending,maxending));
        }
        return maxProduct;
        
    }
}