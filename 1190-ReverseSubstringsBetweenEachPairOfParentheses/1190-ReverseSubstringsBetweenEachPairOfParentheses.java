// Last updated: 23/09/2026, 23:14:43
class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                StringBuilder temp = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    temp.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                for (char ch : temp.toString().toCharArray()) {
                    stack.push(ch);
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}