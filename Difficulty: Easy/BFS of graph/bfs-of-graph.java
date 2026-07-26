class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[] =new boolean[adj.size()];
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        
        visited[0]=true;
        queue.offer(0);
        while(!queue.isEmpty()){
            int src=queue.poll();
            res.add(src);
            for(int neighbour:adj.get(src)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.offer(neighbour);
                    
                }
            }
            
            
        }
        return res;
        
    }
}