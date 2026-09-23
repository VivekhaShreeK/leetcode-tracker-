// Last updated: 23/09/2026, 23:15:34
class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int bits = 32 - Integer.numberOfLeadingZeros(n);
        int m = (1 << bits) - 1;
        return ~n & m;
    }
}