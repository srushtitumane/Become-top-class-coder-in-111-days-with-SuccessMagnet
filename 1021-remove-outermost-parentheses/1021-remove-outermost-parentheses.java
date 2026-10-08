class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ic=s.charAt(i);
            if(ic=='('){
                if(!stack.isEmpty()){
                    sb.append(ic);
                }
                stack.push(ic);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    sb.append(ic);
                }
            }
        }
        return sb.toString();
        
    }
}