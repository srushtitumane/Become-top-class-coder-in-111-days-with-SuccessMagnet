class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new HashMap<>();
        int low=0,high=0,maxLen=0;
        while(high<fruits.length){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            if(map.size()>2){
                map.put(fruits[low],map.get(fruits[low])-1);
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }
                low++;
            }
            maxLen=Math.max(maxLen,high-low+1);
            high++;

        }
        return maxLen;
        
    }
}