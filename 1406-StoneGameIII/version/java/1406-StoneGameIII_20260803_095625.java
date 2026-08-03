// Last updated: 03/08/2026, 09:56:25
1class Solution {
2    public String stoneGameIII(int[] stoneValue) {
3        int n = stoneValue.length;
4        int[] dp = new int[n + 1];
5        for (int i = n - 1; i >= 0; i--) {
6            int best = Integer.MIN_VALUE;
7            int runningSum = 0;
8            for (int k = 1; k <= 3; k++) {
9                if (i + k > n) break;
10                runningSum += stoneValue[i + k - 1];
11                best = Math.max(best, runningSum - dp[i + k]);
12            }
13            dp[i] = best;
14        }
15        if (dp[0] > 0) return "Alice";
16        else if (dp[0] < 0) return "Bob";
17        else return "Tie";
18    }
19}