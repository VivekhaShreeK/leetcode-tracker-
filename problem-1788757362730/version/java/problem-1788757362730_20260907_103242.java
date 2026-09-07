// Last updated: 07/09/2026, 10:32:42
1class Solution {
2    int MOD = 1000000007;
3    public int distinctSubseqII(String s) {
4        int tot = 0;
5        int[] dp = new int[26];
6        for (int i = 0; i < s.length(); i++) {
7            int c = s.charAt(i) - 97;
8            int add = (tot - dp[c] + MOD) % MOD;
9            dp[c] = 1 + tot;
10            tot = (dp[c] + add) % MOD;
11        }
12        return tot;
13    }
14}