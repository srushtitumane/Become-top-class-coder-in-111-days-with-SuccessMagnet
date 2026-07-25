
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        // code here
          List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<V;i++){
            result.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int dest=edges[i][1];
            
            result.get(src).add(dest);
            result.get(dest).add(src);
        }
        return result;
    }
}