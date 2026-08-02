// Last updated: 02/08/2026, 11:45:36
1class Solution {
2    public boolean stoneGame(int[] piles) {
3        int N = piles.length;
4        int[][] dp = new int[N+2][N+2];
5        for (int size = 1; size <= N; ++size)
6            for (int i = 0; i + size <= N; ++i) {
7                int j = i + size - 1;
8                int parity = (j + i + N) % 2;  
9                if (parity == 1)
10                    dp[i+1][j+1] = Math.max(piles[i] + dp[i+2][j+1], piles[j] + dp[i+1][j]);
11                else
12                    dp[i+1][j+1] = Math.min(-piles[i] + dp[i+2][j+1], -piles[j] + dp[i+1][j]);
13            }
14        return dp[1][N] > 0;
15    }
16}