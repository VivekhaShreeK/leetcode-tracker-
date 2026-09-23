// Last updated: 23/09/2026, 23:16:27
class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0; // To track the depth of parentheses

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++; // Increase depth for '('
            } else {
                depth--; // Decrease depth for ')'
                // When we encounter a closing parenthesis, check if the previous character was '('
                if (s.charAt(i - 1) == '(') {
                    score += 1 << depth; // 2^depth
                }
            }
        }

        return score;
    }
}