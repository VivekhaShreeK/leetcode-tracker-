// Last updated: 7/9/2026, 12:04:24 PM
1class Solution {
2    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3        int[] comp = new int[n];
4        comp[0] = 0;
5        for (int i = 1; i < n; i++) {
6            if (nums[i] - nums[i - 1] <= maxDiff) {
7                comp[i] = comp[i - 1];
8            } else {
9                comp[i] = comp[i - 1] + 1;
10            }
11        }
12        boolean[] ans = new boolean[queries.length];
13        for (int i = 0; i < queries.length; i++) {
14            int u = queries[i][0];
15            int v = queries[i][1];
16            ans[i] = (comp[u] == comp[v]);
17        }
18
19        return ans;
20    }
21}