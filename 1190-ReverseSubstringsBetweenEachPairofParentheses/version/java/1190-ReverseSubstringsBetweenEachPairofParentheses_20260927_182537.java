// Last updated: 27/09/2026, 18:25:37
1class Solution {
2    public String reverseParentheses(String s) {
3        Stack<Integer> openParenthesesIndices = new Stack<>();
4        StringBuilder result = new StringBuilder();
5        for (char currentChar : s.toCharArray()) {
6            if (currentChar == '(') {
7                openParenthesesIndices.push(result.length());
8            } else if (currentChar == ')') {
9                int start = openParenthesesIndices.pop();
10                reverse(result, start, result.length() - 1);
11            } else {
12                result.append(currentChar);
13            }
14        }
15
16        return result.toString();
17    }
18    private void reverse(StringBuilder sb, int start, int end) {
19        while (start < end) {
20            char temp = sb.charAt(start);
21            sb.setCharAt(start++, sb.charAt(end));
22            sb.setCharAt(end--, temp);
23        }
24    }
25}