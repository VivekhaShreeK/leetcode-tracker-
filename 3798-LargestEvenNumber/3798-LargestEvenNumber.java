// Last updated: 23/09/2026, 23:02:05
class Solution {
    public String largestEven(String s) {
        int i;
        for (i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == '2') break;
        }
        return s.substring(0, i+1);
    }
}