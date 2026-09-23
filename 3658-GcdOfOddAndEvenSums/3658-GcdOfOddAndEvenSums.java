// Last updated: 23/09/2026, 23:03:24
class Solution {
    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
    public int gcdOfOddEvenSums(int n) {
        return gcd(n * n, n * (n + 1));
    }
}