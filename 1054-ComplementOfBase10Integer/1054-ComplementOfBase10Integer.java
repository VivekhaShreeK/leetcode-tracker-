// Last updated: 7/9/2026, 9:50:41 AM
class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int bits = 32 - Integer.numberOfLeadingZeros(n);
        int m = (1 << bits) - 1;
        return ~n & m;
    }
}