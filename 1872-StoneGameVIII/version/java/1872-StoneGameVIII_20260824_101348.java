// Last updated: 24/08/2026, 10:13:48
1class Solution {
2    public int stoneGameVIII(int[] stones) {
3        int n = stones.length;
4        int[] pre = new int[n];
5        pre[0] = stones[0];
6        for (int i = 1; i < n; i++) {
7            pre[i] = pre[i - 1] + stones[i];
8        }
9        int[] f = new int[n];
10        f[n - 1] = pre[n - 1];
11        for (int i = n - 2; i >= 1; i--) {
12            f[i] = Math.max(f[i + 1], pre[i] - f[i + 1]);
13        }
14        return f[1];
15    }
16}