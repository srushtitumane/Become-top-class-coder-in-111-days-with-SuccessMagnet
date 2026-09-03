class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];

        for(int num : nums1) {
            min = Math.min(min, num);
        }

        for(int num : nums1) {
            if(min % 2 == 0 && num % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}