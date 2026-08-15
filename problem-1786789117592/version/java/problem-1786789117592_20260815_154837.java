// Last updated: 15/08/2026, 15:48:37
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int n = nums.length;
4        int totalXor = 0;
5        boolean allZero = true;
6        for (int x : nums) {
7            totalXor ^= x;
8            if (x > 0) {
9                allZero = false;
10            }
11        }
12        if (totalXor > 0) {
13            return n;
14        }
15        return allZero ? 0 : n - 1;
16    }
17}