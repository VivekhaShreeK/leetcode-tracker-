// Last updated: 23/09/2026, 23:13:35
class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            if (!dp[i]) {
                for (int j = 1; i + j * j <= n; j++) {
                    dp[i + j * j] = true;
                }
                if (dp[n]) {
                    return true;
                }
            }
        }
        return false;
    }
}