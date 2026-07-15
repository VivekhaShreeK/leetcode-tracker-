// Last updated: 7/15/2026, 9:56:19 AM
1class Solution {
2    private int gcd(int x, int y) {
3        return y == 0 ? x : gcd(y, x % y);
4    }
5    public int gcdOfOddEvenSums(int n) {
6        return gcd(n * n, n * (n + 1));
7    }
8}