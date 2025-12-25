
import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0;
        long sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            // Shrink window if sum is greater than target
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            // If sum matches target
            if (sum == target) {
                ans.add(start + 1); // 1-based index
                ans.add(end + 1);
                return ans;
            }
        }

        // If no subarray found
        ans.add(-1);
        return ans;
    }
}
