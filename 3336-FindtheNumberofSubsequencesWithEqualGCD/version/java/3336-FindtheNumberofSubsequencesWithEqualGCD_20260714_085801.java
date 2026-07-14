// Last updated: 7/14/2026, 8:58:01 AM
1class Solution {
2    private static final int MOD = 1_000_000_007;
3    private int n;
4    private int[][][] dp;
5    private int solve(int idx, int g1, int g2, int[] nums) {
6        if (idx == n) {
7            return (g1 != 0 && g1 == g2) ? 1 : 0;
8        }
9        if (dp[idx][g1][g2] != -1)
10            return dp[idx][g1][g2];
11        long ans = 0;
12        ans = solve(idx + 1, g1, g2, nums);
13        int ng1 = (g1 == 0) ? nums[idx] : gcd(g1, nums[idx]);
14        ans = (ans + solve(idx + 1, ng1, g2, nums)) % MOD;
15        int ng2 = (g2 == 0) ? nums[idx] : gcd(g2, nums[idx]);
16        ans = (ans + solve(idx + 1, g1, ng2, nums)) % MOD;
17        return dp[idx][g1][g2] = (int) ans;
18    }
19    public int subsequencePairCount(int[] nums) {
20        n = nums.length;
21        dp = new int[n + 1][201][201];
22        for (int i = 0; i <= n; i++) {
23            for (int j = 0; j <= 200; j++) {
24                Arrays.fill(dp[i][j], -1);
25            }
26        }
27        return solve(0, 0, 0, nums);
28    }
29    private int gcd(int a, int b) {
30        while (b != 0) {
31            int t = a % b;
32            a = b;
33            b = t;
34        }
35        return a;
36    }
37}