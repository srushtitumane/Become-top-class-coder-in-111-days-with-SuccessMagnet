class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int low=0,high=arr.length-1;
        int result=Integer.MIN_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                result=Math.max(mid,result);
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result==Integer.MIN_VALUE?-1:result;
    }
}
