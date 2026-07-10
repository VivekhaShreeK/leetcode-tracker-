// Last updated: 7/10/2026, 9:55:20 PM
1class Solution {
2    public int[] pathExistenceQueries(
3        int n,
4        int[] nums,
5        int maxDiff,
6        int[][] queries
7    ) {
8        int[] idx = new int[n];
9        int[] pos = new int[n];
10        for (int i = 0; i < n; i++) {
11            idx[i] = i;
12        }
13        Integer[] ord = new Integer[n];
14        for (int i = 0; i < n; i++) {
15            ord[i] = i;
16        }
17        Arrays.sort(ord, (a, b) -> Integer.compare(nums[a], nums[b]));
18        for (int i = 0; i < n; i++) {
19            idx[i] = ord[i];
20            pos[idx[i]] = i;
21        }
22        int m = 32 - Integer.numberOfLeadingZeros(n);
23        int[][] f = new int[n][m];
24        int left = 0;
25        for (int i = 0; i < n; i++) {
26            while (left < i && nums[idx[i]] - nums[idx[left]] > maxDiff) {
27                left++;
28            }
29            f[i][0] = left;
30        }
31        for (int j = 1; j < m; j++) {
32            for (int i = 0; i < n; i++) {
33                f[i][j] = f[f[i][j - 1]][j - 1];
34            }
35        }
36        int[] ans = new int[queries.length];
37        for (int k = 0; k < queries.length; k++) {
38            int x = pos[queries[k][0]];
39            int y = pos[queries[k][1]];
40            if (x > y) {
41                int t = x;
42                x = y;
43                y = t;
44            }
45            if (x == y) {
46                ans[k] = 0;
47                continue;
48            }
49            int step = 0;
50            for (int i = m - 1; i >= 0; i--) {
51                if (f[y][i] > x) {
52                    y = f[y][i];
53                    step += 1 << i;
54                }
55            }
56            ans[k] = f[y][0] <= x ? step + 1 : -1;
57        }
58        return ans;
59    }
60}