class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(sr,sc));
        int flood=image[sr][sc];
        image[sr][sc]=color;
        int x[]={0,0,1,-1};
        int y[]={1,-1,0,0};
        while(!queue.isEmpty()){
            Pair p=queue.poll();
            int row=p.row;
            int col=p.col;
            for(int i=0;i<4;i++){
                int newRow=x[i]+row;
                int newCol=y[i]+col;
                if(newRow<0 || newRow>=n || newCol<0 || newCol>=m || image[newRow][newCol]==color){
                    continue;
                }
                if(image[newRow][newCol]==flood){
                queue.offer(new Pair(newRow,newCol));
                image[newRow][newCol]=color;

                }
            }
        }
        return image;   
    }
}