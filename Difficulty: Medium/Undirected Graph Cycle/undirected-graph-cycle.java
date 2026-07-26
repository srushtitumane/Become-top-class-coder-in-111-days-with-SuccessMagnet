class Solution {
    
    boolean ans = false;
    
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++)
            adj.add(new ArrayList<>());
            
        for(int i=0; i<edges.length; i++)
        {
            int src = edges[i][0];
            int dest = edges[i][1];
            
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        
        int[] visited = new int[V];
        
        for(int i=0; i<V; i++)
        {
            if(visited[i] == 0)
                DFS(adj, visited, i, -1);
        }
        
        return ans;
        
    }
    
    void DFS(List<List<Integer>> adj, int[] visited, int src, int prevN)
    {
        
        visited[src] = 1;
        
        for(int i=0; i<adj.get(src).size(); i++)
        {
            int neighbour = adj.get(src).get(i);
            if(visited[neighbour]!=1)
                DFS(adj, visited, neighbour, src);
            else if(visited[neighbour]==1 && neighbour != prevN)
            {
                ans = true;
                return;
            }
        }
    }
}