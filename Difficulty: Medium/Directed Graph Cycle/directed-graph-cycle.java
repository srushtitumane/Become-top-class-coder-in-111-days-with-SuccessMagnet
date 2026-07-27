class Solution {
    boolean ans=false;
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean visited[] = new boolean[V];
        boolean pathVisited[]=new boolean[V];
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int dest=edges[i][1];
            
            adj.get(src).add(dest);
            //adj.get(dest).add(src);
            
        }
        for(int i=0;i<V;i++){
            if(!visited[i]){
                DFS(i,adj,visited,pathVisited);
            }
        }
        return ans;
    }
    
  void DFS(int src, List<List<Integer>> adj,
         boolean[] visited,
         boolean[] pathVisited){

    visited[src] = true;
    pathVisited[src] = true;

    for(int neighbour : adj.get(src)){

        if(!visited[neighbour]){

            DFS(neighbour, adj, visited, pathVisited);

            if(ans)
                return;
        }

        else if(pathVisited[neighbour]){
            ans = true;
            return;
        }
    }

    pathVisited[src] = false;
}
    
}