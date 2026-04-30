class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int freq[] = new int[26];
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }
        int i=0,j=0;
        while(j<s.length()){
            freq[s.charAt(j)-'a']--;
            while((j-i+1) > p.length()){
                freq[s.charAt(i)-'a']++;
                i++;
            }
            if(isZeros(freq)) list.add(i);
            j++;
        }
        return list;
        
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