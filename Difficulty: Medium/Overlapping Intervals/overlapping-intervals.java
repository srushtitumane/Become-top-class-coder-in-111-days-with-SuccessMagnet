import java.util.*;

class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {

        ArrayList<int[]> result = new ArrayList<>();

        // Step 1: Sort intervals by start time
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int start = arr[0][0];
        int end = arr[0][1];

        // Step 2: Merge intervals
        for (int i = 1; i < arr.length; i++) {

            // If overlapping
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } 
            // If not overlapping
            else {
                result.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        // Step 3: Add last interval
        result.add(new int[]{start, end});

        return result;
    }
}
