// Last updated: 23/09/2026, 23:15:32
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0; 
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (balance > 0) {
                    result.append(ch); 
                }
                balance++; 
            } else { 
                balance--;
                if (balance > 0) {
                    result.append(ch); 
                }
            }
        }
        return result.toString(); 
    }
}