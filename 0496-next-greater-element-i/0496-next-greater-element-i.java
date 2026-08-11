class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    j++;  // start checking after the current element

                    while (j < nums2.length) {

                        if (nums2[j] > nums1[i]) {
                            result[i] = nums2[j];
                            break;
                        }

                        j++;
                    }

                    // No greater element found
                    if (j == nums2.length) {
                        result[i] = -1;
                    }

                    break;
                }
            }
        }

        return result;
    }
}