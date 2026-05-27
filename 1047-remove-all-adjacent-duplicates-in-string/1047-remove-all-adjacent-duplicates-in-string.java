class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ic = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == ic) {
                stack.pop();
            } else {
                stack.push(ic);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}