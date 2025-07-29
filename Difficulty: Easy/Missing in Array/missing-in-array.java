class Solution {
    int missingNum(int arr[]) {
        // code here
        int k=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                k++;
            }
        }
        return k;
    }
}