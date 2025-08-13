class Solution {
    public String average(int arr[]) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) { // fixed loop boundary
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        return String.format(Locale.US, "%.2f", avg);
    }
}