class Solution {

    boolean helper(int[] bloomDay, int m, int k, int mid)
    {
        int flowers = 0, bouqets = 0;
        for(int bloomD : bloomDay)
        {
            if(bloomD <= mid)
            {
                flowers++;
                if(flowers == k)
                {
                    bouqets++;
                    flowers = 0;
                }
            }
            else
                flowers = 0;
        }
        return bouqets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length)
            return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int res = -1;
        for(int bloom : bloomDay)
        {
            low = Math.min(low, bloom);
            high = Math.max(high, bloom);
        }

        while(low <= high)
        {
            int mid = low + (high-low) / 2;
            if(helper(bloomDay, m, k, mid))
            {
                res = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return res;
    }
}