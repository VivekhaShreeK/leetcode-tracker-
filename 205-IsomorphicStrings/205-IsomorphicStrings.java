// Last updated: 7/9/2026, 9:52:41 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }
        int[] sToT = new int[256]; 
        int[] tToS = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (sToT[charS] == 0 && tToS[charT] == 0) {
                sToT[charS] = charT;
                tToS[charT] = charS; 
            } else if (sToT[charS] != charT || tToS[charT] != charS) {
                return false;
            }
        }
        return true;
    }
}
