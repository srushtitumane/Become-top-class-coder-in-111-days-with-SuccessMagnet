class Pair{
    int capital;
    int profits;
    Pair(int capital,int profits){
        this.capital=capital;
        this.profits=profits;
    }
}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Pair> minCapital=new PriorityQueue<>(
            (a,b)->a.capital-b.capital
        );
        PriorityQueue<Pair> maxProfit=new PriorityQueue<>(
            (a,b)->b.profits-a.profits
        );
        for(int i=0;i<capital.length;i++){
            minCapital.offer(new Pair(capital[i],profits[i]));
        }
        int projects=0;
        while(k>projects){
            while(!minCapital.isEmpty() && minCapital.peek().capital<=w){
                maxProfit.offer(minCapital.poll());
            }
                if(maxProfit.isEmpty()) break;
                w+=maxProfit.poll().profits;
                projects++;
            

        }
        return w;
        
    }
}