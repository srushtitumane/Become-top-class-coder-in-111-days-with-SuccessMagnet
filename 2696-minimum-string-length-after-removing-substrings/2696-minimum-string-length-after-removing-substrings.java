class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ic=s.charAt(i);
            if(sb.length()>0 && ((sb.charAt(sb.length()-1)=='A' && ic=='B') || (sb.charAt(sb.length()-1)=='C' && ic=='D'))){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(ic);
            }
        }
        return sb.length();
        
    }
}