// Last updated: 7/9/2026, 9:51:16 AM
class Solution {
    public boolean checkValidString(String s) {
        int low = 0; 
        int high = 0; 
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                low--;
                high--;
            } else { 
                low--; 
                high++; 
            }
            if (high < 0) {
                return false;
            }
            low = Math.max(low, 0);
        }
        return low == 0;
    }
}