// Last updated: 7/9/2026, 9:49:20 AM
class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0; 
        int currentDepth = 0; 
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                currentDepth++; 
                maxDepth = Math.max(maxDepth, currentDepth); 
            } else if (ch == ')') {
                currentDepth--; 
            }
        }
        return maxDepth; 
    }
}