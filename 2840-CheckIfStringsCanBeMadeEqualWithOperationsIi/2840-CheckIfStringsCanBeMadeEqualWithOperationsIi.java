// Last updated: 23/09/2026, 23:08:04
class Solution {
    public boolean checkStrings(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        int[] c1 = new int[256];
        int[] c2 = new int[256];
        for(int i = 0; i < s1.length(); i++) {
            int a = (i & 1) << 7;
            c1[a + s1.charAt(i)]++;
            c2[a + s2.charAt(i)]++;
        }
        return Arrays.equals(c1, c2);
    }
}