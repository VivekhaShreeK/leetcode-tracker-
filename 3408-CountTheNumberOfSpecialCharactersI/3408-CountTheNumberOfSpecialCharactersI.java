// Last updated: 7/9/2026, 9:47:08 AM
class Solution {
    public int numberOfSpecialChars(String word) {
        int l = 0, u = 0;
        for(char ch : word.toCharArray()) {
            if(Character.isLowerCase(ch)) {
                l |= (1 << (ch - 'a'));
            }
            else {
                u |= (1 << (ch - 'A'));
            }
        }
        int a = l & u;
        return Integer.bitCount(a);
    }
}