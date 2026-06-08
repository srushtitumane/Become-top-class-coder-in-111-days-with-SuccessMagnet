class Solution {

    int helper(int[] citations, int mid)
    {
        int h = 0;
        for(int c : citations)
        {
            if(c >= mid)
                h++;
        }
        return h;
    }

    public int hIndex(int[] citations) {
        int low = 0;
        int high = citations.length;
        int res = -1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(helper(citations, mid) >= mid)
            {
                res = mid;
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return res;
    }
}