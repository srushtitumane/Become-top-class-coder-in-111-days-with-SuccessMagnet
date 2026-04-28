class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> hs=new HashSet<>();
        for(int j=0;j<nums.length;j++){
            if(hs.contains(nums[j])){
                return true;
            }
            hs.add(nums[j]);
            if(hs.size()>k){
                hs.remove(nums[j-k]);
            }
        }
        return false;
        
    }
}