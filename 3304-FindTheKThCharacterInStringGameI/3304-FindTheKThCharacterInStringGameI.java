// Last updated: 23/09/2026, 23:06:08
class Solution {
    public char kthCharacter(int k) {
        return (char)('a'+Integer.bitCount(k-1));
    }
}