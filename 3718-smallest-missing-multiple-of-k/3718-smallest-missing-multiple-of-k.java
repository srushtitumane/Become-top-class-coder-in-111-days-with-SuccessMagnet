class Solution {
    public int missingMultiple(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }

        int i = 1;

        while(true) {

            int ans = i * k;

            if(!set.contains(ans)) {
                return ans;
            }

            i++;
        }
    }
}