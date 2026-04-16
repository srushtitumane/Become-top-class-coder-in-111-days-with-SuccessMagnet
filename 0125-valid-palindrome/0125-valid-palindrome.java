class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        String rev=s.toLowerCase();
        while(i<j){
            char ic=rev.charAt(i);
            char jc=rev.charAt(j);
            if(!Character.isLetterOrDigit(ic)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(jc)){
                j--;
                continue;
            }
            if(ic!=jc){
                return false;
            }
            i++;
            j--;

        }return true;
        

        
    }
}