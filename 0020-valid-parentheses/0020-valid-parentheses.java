class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ic = s.charAt(i);
            if(!s1.isEmpty() &&
              ((ic == ')' && s1.peek() == '(') ||
               (ic == ']' && s1.peek() == '[') ||
               (ic == '}' && s1.peek() == '{'))) {
                s1.pop();
            }
            else {
                s1.push(ic);
            }
        }
        return s1.isEmpty();
    }
}