// Last updated: 7/9/2026, 9:51:44 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                String patt = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < n / i; j++) {
                    sb.append(patt);
                }
                if(sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}