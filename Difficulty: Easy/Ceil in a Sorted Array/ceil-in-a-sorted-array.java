class Solution {
    public int findCeil(int[] arr, int x) {

        int low = 0, high = arr.length - 1;
        int result = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                result = Math.min(result, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}