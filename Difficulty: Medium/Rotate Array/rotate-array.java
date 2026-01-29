class Solution {
    public void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        int[] temp = new int[n];
        int k = 0;

        // put elements from d to end
        for (int i = d; i < n; i++) {
            temp[k++] = arr[i];
        }

        // put first d elements at end
        for (int i = 0; i < d; i++) {
            temp[k++] = arr[i];
        }

        // copy back
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
