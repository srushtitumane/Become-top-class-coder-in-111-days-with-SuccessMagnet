class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int duplicate=0;
        int missing=0;
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                duplicate=nums[i];
            }
            s.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!s.contains(i)){
                missing=i;
            }
        }
        return new int[]{duplicate,missing};
        
    }
}