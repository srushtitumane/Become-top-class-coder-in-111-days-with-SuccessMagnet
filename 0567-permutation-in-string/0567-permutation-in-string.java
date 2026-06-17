class Solution {

    public boolean checkInclusion(String s1, String s2) {

        int alpha[] = new int[26];

        for (char c : s1.toCharArray()) {
            alpha[c - 'a']++;
        }

        int low = 0, high = 0;

        while (high < s2.length()) {

            char jc = s2.charAt(high);
            alpha[jc - 'a']--;

            while ((high - low + 1) > s1.length()) {

                char ic = s2.charAt(low);
                alpha[ic - 'a']++;
                low++;
            }

            if (isZeros(alpha)) {
                return true;
            }

            high++;
        }

        return false;
    }

    boolean isZeros(int[] alpha) {

        for (int x : alpha) {
            if (x != 0) {
                return false;
            }
        }

        return true;
    }
}