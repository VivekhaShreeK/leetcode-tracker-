// Last updated: 7/9/2026, 9:49:04 AM
class Solution {
    public int secondHighest(String s) {
        int max = -1, sec = -1;
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                int n = c - '0';
                if(n > max) {
                    sec = max;
                    max = n;
                }
                else if(n < max && n > sec) {
                    sec = n;
                }
            }
        }
        return sec;    
    }
}