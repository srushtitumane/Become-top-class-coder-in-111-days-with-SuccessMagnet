class Solution {
    public int lengthOfLongestSubstring(String s) {

        int low = 0, high = 0, maxLen = 0;

        Set<Character> set = new HashSet<>();

        while (high < s.length()) {

            while (set.contains(s.charAt(high))) {
                set.remove(s.charAt(low));
                low++;
            }

            set.add(s.charAt(high));
            maxLen = Math.max(maxLen, high - low + 1);
            high++;
        }

        return maxLen;
    }
}