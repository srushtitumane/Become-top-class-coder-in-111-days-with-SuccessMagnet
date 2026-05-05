class Solution {
    public int maximumSum(int[] arr) {
        int noDel = arr[0],maxEnding = arr[0], oneDel = 0;
        int i=1;
        while(i<arr.length)
        {
            int prevNoDel = noDel;
            noDel = Math.max(arr[i],noDel+arr[i]);
            oneDel = Math.max(oneDel+arr[i],prevNoDel);
            maxEnding = Math.max(maxEnding,Math.max(noDel,oneDel));
            i++;
        }
        return maxEnding;
    }
}