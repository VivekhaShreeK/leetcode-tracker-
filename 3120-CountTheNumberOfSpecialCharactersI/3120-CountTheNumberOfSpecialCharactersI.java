// Last updated: 23/09/2026, 23:06:45
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