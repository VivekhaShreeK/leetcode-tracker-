// Last updated: 27/07/2026, 10:01:19
class Solution {
    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
    public int gcdOfOddEvenSums(int n) {
        return gcd(n * n, n * (n + 1));
    }
}