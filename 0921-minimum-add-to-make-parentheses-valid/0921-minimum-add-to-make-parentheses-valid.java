class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ic=s.charAt(i);
            if(!stack.isEmpty() && (stack.peek()=='(' && ic==')')){
                stack.pop();
            }
            else{
                stack.push(ic);
            }
        }
        return stack.size();
        
    }
}