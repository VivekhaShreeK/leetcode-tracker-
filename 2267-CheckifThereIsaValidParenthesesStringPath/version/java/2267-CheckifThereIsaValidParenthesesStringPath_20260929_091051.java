// Last updated: 29/09/2026, 09:10:51
1class Solution {
2    public boolean hasValidPath(char[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        int pathLen = n + m - 1;
6        if (pathLen % 2 == 1) {
7            return false;
8        }
9        if (grid[0][0] != '(' || grid[n - 1][m - 1] != ')') {
10            return false;
11        }
12        boolean[][][] dp = new boolean[n][m][pathLen + 1];
13        dp[0][0][1] = true;
14        for (int i = 0; i < n; ++i) {
15            for (int j = 0; j < m; ++j) {
16                int change = grid[i][j] == '(' ? 1 : -1;
17                if (i > 0) {
18                    for (int balance = 0; balance <= pathLen; ++balance) {
19                        if (!dp[i - 1][j][balance]) {
20                            continue;
21                        }
22                        int next = balance + change;
23                        if (next >= 0) {
24                            dp[i][j][next] = true;
25                        }
26                    }
27                }
28                if (j > 0) {
29                    for (int balance = 0; balance <= pathLen; ++balance) {
30                        if (!dp[i][j - 1][balance]) {
31                            continue;
32                        }
33                        int next = balance + change;
34                        if (next >= 0) {
35                            dp[i][j][next] = true;
36                        }
37                    }
38                }
39            }
40        }
41        return dp[n - 1][m - 1][0];
42    }
43}