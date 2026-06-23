class Pair
{
    int pos;
    int fuel;
    Pair(int pos, int fuel)
    {
        this.pos = pos;
        this.fuel = fuel;
    }
}
class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.pos-b.pos);
        PriorityQueue<Integer> maxFuel = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<stations.length; i++)
        {
            pq.offer(new Pair(stations[i][0], stations[i][1]));
        }

        int totalMiles = startFuel, stops = 0;
        while(totalMiles < target)
        {
            while(!pq.isEmpty() && pq.peek().pos <= totalMiles)
            {
                maxFuel.offer(pq.poll().fuel);
            }
            if(maxFuel.isEmpty())   return -1;
            totalMiles += maxFuel.poll();
            stops++;
        }
        return stops;
    }
}