class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[]=new boolean[adj.size()];
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                DFS(i,visited,adj,res);
            }
        }
        return res;
        
    }
    
    void DFS(int src,boolean visited[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res){
        visited[src]=true;
        res.add(src);
        for(int neighbour:adj.get(src)){
            if(!visited[neighbour]){
                DFS(neighbour,visited,adj,res);
            }
            
        }
    
    }
}