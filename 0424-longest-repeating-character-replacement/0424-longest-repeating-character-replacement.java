class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0;
        int maxFreq=0;
        int maxLen=Integer.MIN_VALUE;
        Map<Character,Integer> map=new HashMap<>();
        while(j<s.length()){
            char jc=s.charAt(j);
            //add
            map.put(jc,map.getOrDefault(jc,0)+1);
            maxFreq=Math.max(maxFreq,map.get(jc));
            //shrink
            while((j-i+1)-maxFreq > k){
                char ic=s.charAt(i);
                map.put(ic,map.get(ic)-1);
                i++;
            }
            //updation
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;

        
    }
}