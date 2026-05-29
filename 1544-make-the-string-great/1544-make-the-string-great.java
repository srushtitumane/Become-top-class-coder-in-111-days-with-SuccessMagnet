class Solution {
    public String makeGood(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ic = s.charAt(i);

            if (!stack.isEmpty() &&
                Character.toLowerCase(ic) == Character.toLowerCase(stack.peek())
                && ic != stack.peek()) {

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