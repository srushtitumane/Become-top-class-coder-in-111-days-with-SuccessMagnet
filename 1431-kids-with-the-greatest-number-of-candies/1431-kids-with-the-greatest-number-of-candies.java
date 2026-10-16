class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int maxCandie=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxCandie){
                maxCandie=candies[i];
            }   
        }
        for(int i=0;i<candies.length;i++){
            int extra=candies[i]+extraCandies;
            if(extra>=maxCandie){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;

        
    }
}