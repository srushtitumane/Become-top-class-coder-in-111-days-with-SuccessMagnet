class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq=new int[26];
        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }
        int i=0,j=0;
        while(j<s2.length()){
            freq[s2.charAt(j)-'a']--;
            while((j-i+1)>s1.length()){
                freq[s2.charAt(i)-'a']++;
                i++;
            }
            if(isZeros(freq)) {
            return true;
            }
            j++;
        }
        
        return false;    
        
    }
    public boolean isZeros(int[] freq){
        for(int x:freq){
            if(x!=0){
                return false;
            }
        }
        return true;
    }

}