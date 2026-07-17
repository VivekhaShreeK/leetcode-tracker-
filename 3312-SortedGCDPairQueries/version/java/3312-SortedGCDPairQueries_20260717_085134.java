// Last updated: 7/17/2026, 8:51:34 AM
1class Solution {
2    public int[] gcdValues(int[] nums, long[] queries) {
3        int m = 0;
4        for (int num : nums) {
5            m = Math.max(m, num);
6        }
7        long[] cnt = new long[m + 1];
8        for (int num : nums) {
9            cnt[num]++;
10        }
11        for (int i = 1; i <= m; i++) {
12            for (int j = i * 2; j <= m; j += i) {
13                cnt[i] += cnt[j];
14            }
15        }
16        for (int i = 1; i <= m; i++) {
17            cnt[i] = (cnt[i] * (cnt[i] - 1)) / 2;
18        }
19        for (int i = m; i >= 1; i--) {
20            for (int j = i * 2; j <= m; j += i) {
21                cnt[i] -= cnt[j];
22            }
23        }
24        for (int i = 1; i <= m; i++) {
25            cnt[i] += cnt[i - 1];
26        }
27        int[] ans = new int[queries.length];
28        for (int k = 0; k < queries.length; k++) {
29            long q = queries[k] + 1;
30            int left = 1,
31                right = m;
32            while (left < right) {
33                int mid = (left + right) / 2;
34                if (cnt[mid] >= q) {
35                    right = mid;
36                } else {
37                    left = mid + 1;
38                }
39            }
40            ans[k] = left;
41        }
42        return ans;
43    }
44}