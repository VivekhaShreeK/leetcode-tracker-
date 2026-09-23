// Last updated: 23/09/2026, 23:12:04
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