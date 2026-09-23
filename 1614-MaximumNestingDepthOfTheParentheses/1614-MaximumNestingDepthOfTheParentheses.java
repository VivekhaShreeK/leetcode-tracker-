// Last updated: 23/09/2026, 23:12:44
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