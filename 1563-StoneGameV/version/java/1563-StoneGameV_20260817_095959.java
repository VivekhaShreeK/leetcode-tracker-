// Last updated: 17/08/2026, 09:59:59
1class Solution {
2    int[][] f;
3    public int stoneGameV(int[] stoneValue) {
4        int n = stoneValue.length;
5        f = new int[n][n];
6        return dfs(stoneValue, 0, n - 1);
7    }
8    public int dfs(int[] stoneValue, int left, int right) {
9        if (left == right) {
10            return 0;
11        }
12        if (f[left][right] != 0) {
13            return f[left][right];
14        }
15        int sum = 0;
16        for (int i = left; i <= right; ++i) {
17            sum += stoneValue[i];
18        }
19        int suml = 0;
20        for (int i = left; i < right; ++i) {
21            suml += stoneValue[i];
22            int sumr = sum - suml;
23            if (suml < sumr) {
24                f[left][right] = Math.max(
25                    f[left][right],
26                    dfs(stoneValue, left, i) + suml
27                );
28            } else if (suml > sumr) {
29                f[left][right] = Math.max(
30                    f[left][right],
31                    dfs(stoneValue, i + 1, right) + sumr
32                );
33            } else {
34                f[left][right] = Math.max(
35                    f[left][right],
36                    Math.max(
37                        dfs(stoneValue, left, i),
38                        dfs(stoneValue, i + 1, right)
39                    ) + suml
40                );
41            }
42        }
43        return f[left][right];
44    }
45}