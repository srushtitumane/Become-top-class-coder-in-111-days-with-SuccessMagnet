class Solution {
    public boolean isValid(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ic=s.charAt(i);
            if(sb.length()>0 && ((sb.charAt(sb.length()-1)=='(' && ic==')') || 
                (sb.charAt(sb.length()-1)=='[' && ic==']') || 
                (sb.charAt(sb.length()-1)=='{' && ic=='}'))){
                    sb.deleteCharAt(sb.length()-1);
                }
            else{
                sb.append(ic);
            }
        }
        if(sb.length()>0){
            return false;
        }
        else{
            return true;
        }
        
    }
}