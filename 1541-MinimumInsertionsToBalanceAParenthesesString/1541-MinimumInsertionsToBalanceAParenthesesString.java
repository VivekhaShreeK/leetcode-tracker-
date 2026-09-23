// Last updated: 23/09/2026, 23:13:22
class Solution {
    public int minInsertions(String s) {
        int insertions = 0, open = 0, i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                open++;  
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;  
                } else {
                    insertions++; 
                }
                if (open > 0) {
                    open--; 
                } else {
                    insertions++;  
                }
            }
            i++;
        }
        return insertions + (open * 2); 
    }
}
