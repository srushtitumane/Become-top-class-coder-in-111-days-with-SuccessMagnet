class Solution {
    public int findLucky(int[] arr) {
        int freq[]=new int[501];
        for(int n:arr){
            freq[n]++;
        }
        for(int i=500;i>=1;i--){
            if(i==freq[i]){
                return i;
            }
        }
        return -1;
        
    }
}