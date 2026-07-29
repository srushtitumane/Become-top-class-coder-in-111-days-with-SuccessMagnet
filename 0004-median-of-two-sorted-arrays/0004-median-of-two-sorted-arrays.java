class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] num = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while(i < n && j < m) {

            if(nums1[i] <= nums2[j]) {
                num[k] = nums1[i];
                i++;
            }
            else {
                num[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Remaining elements of nums1
        while(i < n) {
            num[k] = nums1[i];
            i++;
            k++;
        }

        // Remaining elements of nums2
        while(j < m) {
            num[k] = nums2[j];
            j++;
            k++;
        }

        int total = num.length;
        int mid = total / 2;

        if(total % 2 != 0) {
            return num[mid];
        }
        else {
            return (num[mid - 1] + num[mid]) / 2.0;
        }
    }
}