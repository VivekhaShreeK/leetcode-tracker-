// Last updated: 23/09/2026, 23:14:41
class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> toRemove = new HashSet<>();
        int openCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openCount++; 
            } else if (c == ')') {
                if (openCount > 0) {
                    openCount--;
                } else {
                    toRemove.add(i); 
                }
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(' && openCount > 0) {
                toRemove.add(i); 
                openCount--;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!toRemove.contains(i)) {
                result.append(s.charAt(i)); 
            }
        }
        return result.toString(); 
    }
}