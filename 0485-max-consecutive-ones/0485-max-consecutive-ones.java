class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int countOnes = 0;
        int maxOnes = 0;

        for (int n : nums) {

            if (n == 1) {
                countOnes++;
                maxOnes = Math.max(maxOnes, countOnes);
            } else {
                countOnes = 0;
            }
        }

        return maxOnes;
    }
}