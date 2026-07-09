// Last updated: 7/9/2026, 9:50:50 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int openCount = 0; 
        int closeCount = 0; 
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++; 
            } else {
                if (openCount > 0) {
                    openCount--; 
                } else {
                    closeCount++; 
                }
            }
        }
        return openCount + closeCount;
    }
}